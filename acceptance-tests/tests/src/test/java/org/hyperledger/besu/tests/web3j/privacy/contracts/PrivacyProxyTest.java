/*
 * Copyright ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.besu.tests.web3j.privacy.contracts;

import static org.assertj.core.api.Assertions.assertThat;

import org.hyperledger.besu.privacy.contracts.generated.PrivacyGroup;
import org.hyperledger.besu.privacy.contracts.generated.PrivacyProxy;
import org.hyperledger.besu.tests.acceptance.dsl.AcceptanceTestBase;
import org.hyperledger.besu.tests.acceptance.dsl.node.BesuNode;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.web3j.utils.Base64String;

@SuppressWarnings("unchecked")
public class PrivacyProxyTest extends AcceptanceTestBase {

  private final Base64String firstParticipant =
      Base64String.wrap("93Ky7lXwFkMc7+ckoFgUMku5bpr9tz4zhmWmk9RlNng=");
  private final Base64String secondParticipant =
      Base64String.wrap("9iaJ6OObl6TUWYjXAOyZsL0VaDPwF+tRFkMwwYSeqqw=");
  private final Base64String thirdParticipant =
      Base64String.wrap("Jo2bVqD+nNlNYL5EE7y3IdOnviftjiizpjRt+HTuFBs=");
  private PrivacyProxy privacyProxy;

  private BesuNode minerNode;

  @Before
  public void setUp() throws Exception {
    minerNode = besu.createMinerNode("node");
    cluster.start(minerNode);
    PrivacyGroup privacyGroup =
        minerNode.execute(contractTransactions.createSmartContract(PrivacyGroup.class));
    privacyProxy =
        minerNode.execute(
            contractTransactions.createSmartContract(
                PrivacyProxy.class, privacyGroup.getContractAddress()));
  }

  @Test
  public void rlp() throws Exception {
    assertThat(privacyProxy.isValid()).isEqualTo(true);
    contractVerifier
        .validTransactionReceipt(privacyProxy.getContractAddress())
        .verify(privacyProxy);
    // 0x0b0235be
    assertThat("0x0b0235bef772b2ee55f016431cefe724a05814324bb96e9afdb73e338665a693d4653678")
        .isEqualTo(privacyProxy.getParticipants(firstParticipant.raw()).encodeFunctionCall());
    // 0xf744b089
    assertThat(
            "0xf744b089f772b2ee55f016431cefe724a05814324bb96e9afdb73e338665a693d465367800000000000000000000000000000000000000000000000000000000000000400000000000000000000000000000000000000000000000000000000000000000")
        .isEqualTo(
            privacyProxy
                .addParticipants(firstParticipant.raw(), Collections.emptyList())
                .encodeFunctionCall());
  }

  @Ignore("return 0x which causes web3j to throw exception instead of return empty list")
  @Test
  public void deploysWithNoParticipant() throws Exception {
    final List<byte[]> send = privacyProxy.getParticipants(firstParticipant.raw()).send();
    assertThat(send.size()).isEqualTo(0);
  }

  @Test
  public void canAddParticipants() throws Exception {
    privacyProxy
        .addParticipants(firstParticipant.raw(), Collections.singletonList(secondParticipant.raw()))
        .send();
    final List<byte[]> send = privacyProxy.getParticipants(firstParticipant.raw()).send();
    assertThat(send.size()).isEqualTo(2);
    assertThat(firstParticipant.raw()).isEqualTo(send.get(0));
    assertThat(secondParticipant.raw()).isEqualTo(send.get(1));
  }

  @Test
  public void canUpgrade() throws Exception {
    privacyProxy
        .addParticipants(firstParticipant.raw(), Collections.singletonList(secondParticipant.raw()))
        .send();
    final List<byte[]> send = privacyProxy.getParticipants(firstParticipant.raw()).send();
    assertThat(send.size()).isEqualTo(2);
    assertThat(firstParticipant.raw()).isEqualTo(send.get(0));
    assertThat(secondParticipant.raw()).isEqualTo(send.get(1));

    final PrivacyGroup upgradedContract =
        minerNode.execute(contractTransactions.createSmartContract(PrivacyGroup.class));

    privacyProxy.upgradeTo(upgradedContract.getContractAddress()).send();
    privacyProxy
        .addParticipants(firstParticipant.raw(), Collections.singletonList(secondParticipant.raw()))
        .send();
    final List<byte[]> send2 = privacyProxy.getParticipants(firstParticipant.raw()).send();
    assertThat(send2.size()).isEqualTo(2);
    assertThat(firstParticipant.raw()).isEqualTo(send2.get(0));
    assertThat(secondParticipant.raw()).isEqualTo(send2.get(1));
  }

  @Test
  public void canAddTwiceToContractWhenCallLock() throws Exception {
    privacyProxy
        .addParticipants(firstParticipant.raw(), Collections.singletonList(thirdParticipant.raw()))
        .send();
    privacyProxy.lock().send();
    privacyProxy
        .addParticipants(firstParticipant.raw(), Collections.singletonList(secondParticipant.raw()))
        .send();
    final List<byte[]> send = privacyProxy.getParticipants(firstParticipant.raw()).send();
    assertThat(send.size()).isEqualTo(3);
    assertThat(firstParticipant.raw()).isEqualTo(send.get(0));
    assertThat(thirdParticipant.raw()).isEqualTo(send.get(1));
    assertThat(secondParticipant.raw()).isEqualTo(send.get(2));
  }
}
