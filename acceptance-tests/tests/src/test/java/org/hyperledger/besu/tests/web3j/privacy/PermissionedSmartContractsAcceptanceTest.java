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
package org.hyperledger.besu.tests.web3j.privacy;

import org.hyperledger.besu.crypto.SECP256K1;
import org.hyperledger.besu.ethereum.core.Util;
import org.hyperledger.besu.tests.acceptance.dsl.privacy.PrivacyAcceptanceTestBase;
import org.hyperledger.besu.tests.acceptance.dsl.privacy.PrivacyNode;
import org.hyperledger.besu.tests.web3j.permissioning.generated.AccountIngress;
import org.hyperledger.besu.tests.web3j.permissioning.generated.AccountRules;
import org.hyperledger.besu.tests.web3j.permissioning.generated.Admin;
import org.hyperledger.besu.util.bytes.Bytes32;
import org.hyperledger.besu.util.bytes.BytesValue;

import java.math.BigInteger;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PermissionedSmartContractsAcceptanceTest extends PrivacyAcceptanceTestBase {
  private PrivacyNode alice;
  private PrivacyNode bob;
  private static final long POW_CHAIN_ID = 2018;

  private AccountIngress accountIngress = null;
  private AccountRules accountRules = null;
  private Admin admin = null;


  private String ADMIN = "0x61646d696e697374726174696f6e000000000000000000000000000000000000";
  private String RULES = "0x72756c6573000000000000000000000000000000000000000000000000000000";

  @Before
  public void setUp() throws Exception {
    alice =
        privacyBesu.createPrivateTransactionEnabledMinerNode(
            "node1", privacyAccountResolver.resolve(0));
    bob =
        privacyBesu.createPrivateTransactionEnabledNode("node2", privacyAccountResolver.resolve(1));
    privacyCluster.start(alice, bob);

    accountIngress =
        alice.execute(
            privateContractTransactions.createSmartContract(
                AccountIngress.class,
                alice.getTransactionSigningKey(),
                POW_CHAIN_ID,
                alice.getEnclaveKey(),
                bob.getEnclaveKey()));

    admin =
        alice.execute(
            privateContractTransactions.createSmartContract(
                Admin.class,
                alice.getTransactionSigningKey(),
                POW_CHAIN_ID,
                alice.getEnclaveKey(),
                bob.getEnclaveKey()));

    accountIngress.setContractAddress(BytesValue.fromHexString(ADMIN).extractArray(), admin.getContractAddress()).send();

    accountRules =
        alice.execute(
            privateContractTransactions.createSmartContract(
                AccountRules.class,
                alice.getTransactionSigningKey(),
                POW_CHAIN_ID,
                alice.getEnclaveKey(),
                Collections.singletonList(bob.getEnclaveKey()),
                accountIngress.getContractAddress()));

    String result = accountIngress.getContractAddress(BytesValue.fromHexString(ADMIN).extractArray()).send();

    assertThat(result).isEqualTo(admin.getContractAddress());
  }

  @Test
  public void testAccountIngressProxy() throws Exception {}
}
