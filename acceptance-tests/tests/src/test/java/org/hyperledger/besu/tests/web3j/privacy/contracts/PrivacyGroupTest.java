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

import org.hyperledger.besu.privacy.contracts.PrivacyGroup;
import org.hyperledger.besu.tests.acceptance.dsl.privacy.PrivacyAcceptanceTestBase;
import org.hyperledger.besu.tests.acceptance.dsl.privacy.PrivacyNode;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("unchecked")
public class PrivacyGroupTest extends PrivacyAcceptanceTestBase {
  //  private static final String DEPLOYED_CODE =
  //
  // "0x608060405234801561001057600080fd5b506004361061007d5760003560e01c806378b903371161005b57806378b9033714610173578063a69df4b514610195578063f744b0891461019f578063f83d08ba146102795761007d565b80630b0235be146100825780630d8e6e2c1461010557806361544c9114610123575b600080fd5b6100ae6004803603602081101561009857600080fd5b8101908080359060200190929190505050610283565b6040518080602001828103825283818151815260200191508051906020019060200280838360005b838110156100f15780820151818401526020810190506100d6565b505050509050019250505060405180910390f35b61010d6102ef565b6040518082815260200191505060405180910390f35b6101596004803603604081101561013957600080fd5b8101908080359060200190929190803590602001909291905050506102f9565b604051808215151515815260200191505060405180910390f35b61017b61031e565b604051808215151515815260200191505060405180910390f35b61019d610334565b005b61025f600480360360408110156101b557600080fd5b8101908080359060200190929190803590602001906401000000008111156101dc57600080fd5b8201836020820111156101ee57600080fd5b8035906020019184602083028401116401000000008311171561021057600080fd5b919080806020026020016040519081016040528093929190818152602001838360200280828437600081840152601f19601f820116905080830192505050505050509192919290505050610369565b604051808215151515815260200191505060405180910390f35b6102816103f3565b005b606061028e82610427565b61029757600080fd5b60028054806020026020016040519081016040528092919081815260200182805480156102e357602002820191906000526020600020905b8154815260200190600101908083116102cf575b50505050509050919050565b6000600154905090565b600061030483610427565b61030d57600080fd5b61031682610447565b905092915050565b60008060009054906101000a900460ff16905090565b6000809054906101000a900460ff161561034d57600080fd5b60016000806101000a81548160ff021916908315150217905550565b60008060009054906101000a900460ff161561038457600080fd5b6000600280549050141561039d5761039b8361052a565b505b6103a683610427565b6103af57600080fd5b60006103bb848461059c565b905060016000806101000a81548160ff0219169083151502179055506001600081548092919060010191905055508091505092915050565b6000809054906101000a900460ff1661040b57600080fd5b60008060006101000a81548160ff021916908315150217905550565b600080600360008481526020019081526020016000205414159050919050565b6000806003600084815260200190815260200160002054905060008111801561047557506002805490508111155b1561051f5760028054905081146104e357600060026001600280549050038154811061049d57fe5b9060005260206000200154905080600260018403815481106104bb57fe5b9060005260206000200181905550816003600083815260200190815260200160002081905550505b60016002818180549050039150816104fb919061087e565b50600060036000858152602001908152602001600020819055506001915050610525565b60009150505b919050565b600080600360008481526020019081526020016000205414156105925760028290806001815401808255809150509060018203906000526020600020016000909192909190915055600360008481526020019081526020016000208190555060019050610597565b600090505b919050565b6000806001905060008090505b8351811015610873578381815181106105be57fe5b6020026020010151851415610652577fcc7365305ae5f16c463d1383713d699f43c5548bbda5537ee61373ceb9aaf21360008583815181106105fc57fe5b60200260200101516040518083151515158152602001828152602001806020018281038252602f8152602001806108f1602f9139604001935050505060405180910390a181801561064b575060005b9150610866565b61066e84828151811061066157fe5b6020026020010151610427565b15610715577fcc7365305ae5f16c463d1383713d699f43c5548bbda5537ee61373ceb9aaf21360008583815181106106a257fe5b60200260200101516040518083151515158152602001828152602001806020018281038252601b8152602001807f4163636f756e7420697320616c72656164792061204d656d6265720000000000815250602001935050505060405180910390a181801561070e575060005b9150610865565b600061073385838151811061072657fe5b602002602001015161052a565b9050606081610777576040518060400160405280601b81526020017f4163636f756e7420697320616c72656164792061204d656d6265720000000000815250610791565b6040518060600160405280602181526020016108d0602191395b90507fcc7365305ae5f16c463d1383713d699f43c5548bbda5537ee61373ceb9aaf213828785815181106107c157fe5b602002602001015183604051808415151515815260200183815260200180602001828103825283818151815260200191508051906020019080838360005b8381101561081a5780820151818401526020810190506107ff565b50505050905090810190601f1680156108475780820380516001836020036101000a031916815260200191505b5094505050505060405180910390a18380156108605750815b935050505b5b80806001019150506105a9565b508091505092915050565b8154818355818111156108a5578183600052602060002091820191016108a491906108aa565b5b505050565b6108cc91905b808211156108c85760008160009055506001016108b0565b5090565b9056fe4d656d626572206163636f756e74206164646564207375636365737366756c6c79416464696e67206f776e206163636f756e742061732061204d656d626572206973206e6f74207065726d6974746564a265627a7a7231582081adaba054a78ca50b49183102a909f50f15b49eb4947bfa3593139d8833895564736f6c63430005100032";
  //
  //  private final Base64String firstParticipant =
  //      Base64String.wrap("A1aVtMxLCUHmBVHXoZzzBgPbW/wj5axDpW9X8l91SGo=");
  //  private final Base64String secondParticipant =
  //      Base64String.wrap("Ko2bVqD+nNlNYL5EE7y3IdOnviftjiizpjRt+HTuFBs=");
  //  private final Base64String thirdParticipant =
  //      Base64String.wrap("Jo2bVqD+nNlNYL5EE7y3IdOnviftjiizpjRt+HTuFBs=");
  private PrivacyGroup privacyGroup;

  private PrivacyNode minerNode;

  @Before
  public void setUp() throws Exception {
    minerNode =
        privacyBesu.createPrivateTransactionEnabledMinerNode(
            "miner-node", privacyAccountResolver.resolve(0));
    privacyCluster.start(minerNode);
    privacyGroup = minerNode.execute(contractTransactions.createSmartContract(PrivacyGroup.class));
  }

  @Test
  public void shouldConnectToOtherPeer() {
    System.out.println(privacyGroup);
    System.out.println("meme");
  }

  @Test
  public void rlp() throws Exception {
    System.out.println("fuck");
    /*    assertThat(DEPLOYED_CODE)
        .isEqualTo(
            web3j
                .ethGetCode(privacyGroup.getContractAddress(), DefaultBlockParameterName.LATEST)
                .send()
                .getCode());
    // 0x0b0235be
    assertThat("0x0b0235be035695b4cc4b0941e60551d7a19cf30603db5bfc23e5ac43a56f57f25f75486a")
        .isEqualTo(privacyGroup.getParticipants(firstParticipant.raw()).encodeFunctionCall());
    // 0xf744b089
    assertThat(
            "0xf744b089035695b4cc4b0941e60551d7a19cf30603db5bfc23e5ac43a56f57f25f75486a000000000000000000000000000000000000000000000000000000000000004000000000000000000000000000000000000000000000000000000000000000012a8d9b56a0fe9cd94d60be4413bcb721d3a7be27ed8e28b3a6346df874ee141b")
        .isEqualTo(
            privacyGroup
                .addParticipants(
                    firstParticipant.raw(), Collections.singletonList(secondParticipant.raw()))
                .encodeFunctionCall());
    assertThat("0xf83d08ba").isEqualTo(privacyGroup.lock().encodeFunctionCall());
    assertThat("0xa69df4b5").isEqualTo(privacyGroup.unlock().encodeFunctionCall());
    assertThat("0x78b90337").isEqualTo(privacyGroup.canExecute().encodeFunctionCall());
    assertThat("0x0d8e6e2c").isEqualTo(privacyGroup.getVersion().encodeFunctionCall());*/
  }
  /*
  @Test
  @Ignore("return \"0x\" which causes web3j to throw exception instead of return empty list")
  public void deploysWithZeroParticipant() throws Exception {
    final List<byte[]> send =
        (List<byte[]>) privacyGroup.getParticipants(firstParticipant.raw()).send();
    assertThat(send.size()).isEqualTo(0);
  }

  @Test
  public void canInitiallyAddParticipants() throws Exception {
    privacyGroup
        .addParticipants(firstParticipant.raw(), Collections.singletonList(secondParticipant.raw()))
        .send();
    final List<byte[]> send = privacyGroup.getParticipants(firstParticipant.raw()).send();
    assertThat(send.size()).isEqualTo(2);
    assertThat(firstParticipant.raw()).isEqualTo(send.get(0));
    assertThat(secondParticipant.raw()).isEqualTo(send.get(1));
  }

  @Test(expected = TransactionException.class)
  public void cannotAddToContractWhenNotLocked() throws Exception {
    privacyGroup
        .addParticipants(firstParticipant.raw(), Collections.singletonList(thirdParticipant.raw()))
        .send();

    privacyGroup
        .addParticipants(firstParticipant.raw(), Collections.singletonList(secondParticipant.raw()))
        .send();
  }

  @Test
  public void canAddTwiceToContractWhenCallLock() throws Exception {
    privacyGroup
        .addParticipants(firstParticipant.raw(), Collections.singletonList(thirdParticipant.raw()))
        .send();
    privacyGroup.lock().send();
    privacyGroup
        .addParticipants(firstParticipant.raw(), Collections.singletonList(secondParticipant.raw()))
        .send();
    final BigInteger version = privacyGroup.getVersion().send();
    assertThat(version).isEqualTo(BigInteger.TWO);

    final List<byte[]> send = privacyGroup.getParticipants(firstParticipant.raw()).send();
    assertThat(send.size()).isEqualTo(3);
    assertThat(firstParticipant.raw()).isEqualTo(send.get(0));
    assertThat(thirdParticipant.raw()).isEqualTo(send.get(1));
    assertThat(secondParticipant.raw()).isEqualTo(send.get(2));
  }

  @Test
  public void versionStartsAtZero() throws Exception {
    final BigInteger version = privacyGroup.getVersion().send();
    assertThat(version).isEqualTo(BigInteger.ZERO);
  }

  @Test(expected = TransactionException.class)
  public void cannotLockTwice() throws Exception {
    privacyGroup
        .addParticipants(firstParticipant.raw(), Collections.singletonList(thirdParticipant.raw()))
        .send();
    privacyGroup.lock().send();
    privacyGroup.lock().send();
  }*/
}
