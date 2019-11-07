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

package org.hyperledger.besu.tests.web3j.permissioning.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes16;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint16;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.tuples.generated.Tuple4;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * Auto generated code.
 *
 * <p><strong>Do not modify!</strong>
 *
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the <a
 * href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.5.
 */
@SuppressWarnings("rawtypes")
public class NodeRulesList extends Contract {
  private static final String BINARY =
      "608060405234801561001057600080fd5b5060f88061001f6000396000f3fe6080604052348015600f57600080fd5b506004361060285760003560e01c80637ebd1b3014602d575b600080fd5b604760048036036020811015604157600080fd5b50356083565b6040805194855260208501939093526fffffffffffffffffffffffffffffffff199091168383015261ffff166060830152519081900360800190f35b60008181548110608f57fe5b6000918252602090912060039091020180546001820154600290920154909250608081901b90600160801b900461ffff168456fea265627a7a7230582004a8473cd69fe7071a013d32306c6d56c2643bab9215f188c70e96349e799fa664736f6c63430005090032";

  public static final String FUNC_WHITELIST = "whitelist";

  @Deprecated
  protected NodeRulesList(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  protected NodeRulesList(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }

  @Deprecated
  protected NodeRulesList(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  protected NodeRulesList(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public RemoteFunctionCall<Tuple4<byte[], byte[], byte[], BigInteger>> whitelist(
      BigInteger param0) {
    final Function function =
        new Function(
            FUNC_WHITELIST,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)),
            Arrays.<TypeReference<?>>asList(
                new TypeReference<Bytes32>() {},
                new TypeReference<Bytes32>() {},
                new TypeReference<Bytes16>() {},
                new TypeReference<Uint16>() {}));
    return new RemoteFunctionCall<Tuple4<byte[], byte[], byte[], BigInteger>>(
        function,
        new Callable<Tuple4<byte[], byte[], byte[], BigInteger>>() {
          @Override
          public Tuple4<byte[], byte[], byte[], BigInteger> call() throws Exception {
            List<Type> results = executeCallMultipleValueReturn(function);
            return new Tuple4<byte[], byte[], byte[], BigInteger>(
                (byte[]) results.get(0).getValue(),
                (byte[]) results.get(1).getValue(),
                (byte[]) results.get(2).getValue(),
                (BigInteger) results.get(3).getValue());
          }
        });
  }

  @Deprecated
  public static NodeRulesList load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new NodeRulesList(contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  @Deprecated
  public static NodeRulesList load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new NodeRulesList(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  public static NodeRulesList load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    return new NodeRulesList(contractAddress, web3j, credentials, contractGasProvider);
  }

  public static NodeRulesList load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    return new NodeRulesList(contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public static RemoteCall<NodeRulesList> deploy(
      Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        NodeRulesList.class, web3j, credentials, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<NodeRulesList> deploy(
      Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
    return deployRemoteCall(
        NodeRulesList.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
  }

  public static RemoteCall<NodeRulesList> deploy(
      Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        NodeRulesList.class, web3j, transactionManager, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<NodeRulesList> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return deployRemoteCall(
        NodeRulesList.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
  }
}
