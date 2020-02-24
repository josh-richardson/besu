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

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.utils.Base64String;

@SuppressWarnings("unchecked")
public class PrivacyProxyTest {
  private static final String DEPLOYED_CODE =
      "0x608060405234801561001057600080fd5b50600436106100935760003560e01c806361544c911161006657806361544c91146101c757806378b9033714610217578063a69df4b514610239578063f744b08914610243578063f83d08ba1461031d57610093565b80630b0235be146100985780630d8e6e2c1461011b5780633659cfe6146101395780635c60da1b1461017d575b600080fd5b6100c4600480360360208110156100ae57600080fd5b8101908080359060200190929190505050610327565b6040518080602001828103825283818151815260200191508051906020019060200280838360005b838110156101075780820151818401526020810190506100ec565b505050509050019250505060405180910390f35b61012361047d565b6040518082815260200191505060405180910390f35b61017b6004803603602081101561014f57600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919050505061052b565b005b610185610591565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b6101fd600480360360408110156101dd57600080fd5b8101908080359060200190929190803590602001909291905050506105b6565b604051808215151515815260200191505060405180910390f35b61021f61067c565b604051808215151515815260200191505060405180910390f35b61024161072a565b005b6103036004803603604081101561025957600080fd5b81019080803590602001909291908035906020019064010000000081111561028057600080fd5b82018360208201111561029257600080fd5b803590602001918460208302840111640100000000831117156102b457600080fd5b919080806020026020016040519081016040528093929190818152602001838360200280828437600081840152601f19601f8201169050808301925050505050505091929192905050506107b3565b604051808215151515815260200191505060405180910390f35b6103256108ba565b005b606060008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690508073ffffffffffffffffffffffffffffffffffffffff16630b0235be846040518263ffffffff1660e01b81526004018082815260200191505060006040518083038186803b1580156103a057600080fd5b505afa1580156103b4573d6000803e3d6000fd5b505050506040513d6000823e3d601f19601f8201168201806040525060208110156103de57600080fd5b81019080805160405193929190846401000000008211156103fe57600080fd5b8382019150602082018581111561041457600080fd5b825186602082028301116401000000008211171561043157600080fd5b8083526020830192505050908051906020019060200280838360005b8381101561046857808201518184015260208101905061044d565b50505050905001604052505050915050919050565b6000806000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690508073ffffffffffffffffffffffffffffffffffffffff16630d8e6e2c6040518163ffffffff1660e01b815260040160206040518083038186803b1580156104ea57600080fd5b505afa1580156104fe573d6000803e3d6000fd5b505050506040513d602081101561051457600080fd5b810190808051906020019092919050505091505090565b8073ffffffffffffffffffffffffffffffffffffffff166000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141561058557600080fd5b61058e81610943565b50565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b6000806000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690508073ffffffffffffffffffffffffffffffffffffffff166361544c9185856040518363ffffffff1660e01b81526004018083815260200182815260200192505050602060405180830381600087803b15801561063857600080fd5b505af115801561064c573d6000803e3d6000fd5b505050506040513d602081101561066257600080fd5b810190808051906020019092919050505091505092915050565b6000806000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690508073ffffffffffffffffffffffffffffffffffffffff166378b903376040518163ffffffff1660e01b815260040160206040518083038186803b1580156106e957600080fd5b505afa1580156106fd573d6000803e3d6000fd5b505050506040513d602081101561071357600080fd5b810190808051906020019092919050505091505090565b60008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690508073ffffffffffffffffffffffffffffffffffffffff1663a69df4b56040518163ffffffff1660e01b8152600401600060405180830381600087803b15801561079857600080fd5b505af11580156107ac573d6000803e3d6000fd5b5050505050565b6000806000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690508073ffffffffffffffffffffffffffffffffffffffff1663f744b08985856040518363ffffffff1660e01b81526004018083815260200180602001828103825283818151815260200191508051906020019060200280838360005b83811015610850578082015181840152602081019050610835565b505050509050019350505050602060405180830381600087803b15801561087657600080fd5b505af115801561088a573d6000803e3d6000fd5b505050506040513d60208110156108a057600080fd5b810190808051906020019092919050505091505092915050565b60008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690508073ffffffffffffffffffffffffffffffffffffffff1663f83d08ba6040518163ffffffff1660e01b8152600401600060405180830381600087803b15801561092857600080fd5b505af115801561093c573d6000803e3d6000fd5b5050505050565b806000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505056fea265627a7a72315820498cff5aa36efa4596466bc5546201e9c41df019fcc994f209e16b330d34284b64736f6c63430005100032";

  private final Base64String firstParticipant =
      Base64String.wrap("93Ky7lXwFkMc7+ckoFgUMku5bpr9tz4zhmWmk9RlNng=");
  private final Base64String secondParticipant =
      Base64String.wrap("9iaJ6OObl6TUWYjXAOyZsL0VaDPwF+tRFkMwwYSeqqw=");
  private final Base64String thirdParticipant =
      Base64String.wrap("Jo2bVqD+nNlNYL5EE7y3IdOnviftjiizpjRt+HTuFBs=");
  private PrivacyProxy privacyProxy;
  private PrivacyGroup privacyGroup;
  private Web3j web3j;
  private Credentials credentials;

  @Before
  public void setUp() throws Exception {
    credentials =
        Credentials.create("0x8f2a55949038a9610f50fb23b5883af3b4ecb3c3bb792cbcefbd1542c692be63");
    web3j = null;
    privacyGroup = PrivacyGroup.deploy(web3j, credentials, new DefaultGasProvider()).send();
    privacyProxy =
        PrivacyProxy.deploy(
                web3j, credentials, new DefaultGasProvider(), privacyGroup.getContractAddress())
            .send();
  }

  @Test
  public void rlp() throws Exception {
    assertThat(DEPLOYED_CODE)
        .isEqualTo(
            web3j
                .ethGetCode(privacyProxy.getContractAddress(), DefaultBlockParameterName.LATEST)
                .send()
                .getCode());
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
        PrivacyGroup.deploy(web3j, credentials, new DefaultGasProvider()).send();

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
