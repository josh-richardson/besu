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

import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
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
public class NodeRulesProxy extends Contract {
  private static final String BINARY = "";

  public static final String FUNC_CONNECTIONALLOWED = "connectionAllowed";

  @Deprecated
  protected NodeRulesProxy(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  protected NodeRulesProxy(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }

  @Deprecated
  protected NodeRulesProxy(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  protected NodeRulesProxy(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public RemoteFunctionCall<byte[]> connectionAllowed(
      byte[] sourceEnodeHigh,
      byte[] sourceEnodeLow,
      byte[] sourceEnodeIp,
      BigInteger sourceEnodePort,
      byte[] destinationEnodeHigh,
      byte[] destinationEnodeLow,
      byte[] destinationEnodeIp,
      BigInteger destinationEnodePort) {
    final Function function =
        new Function(
            FUNC_CONNECTIONALLOWED,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.generated.Bytes32(sourceEnodeHigh),
                new org.web3j.abi.datatypes.generated.Bytes32(sourceEnodeLow),
                new org.web3j.abi.datatypes.generated.Bytes16(sourceEnodeIp),
                new org.web3j.abi.datatypes.generated.Uint16(sourceEnodePort),
                new org.web3j.abi.datatypes.generated.Bytes32(destinationEnodeHigh),
                new org.web3j.abi.datatypes.generated.Bytes32(destinationEnodeLow),
                new org.web3j.abi.datatypes.generated.Bytes16(destinationEnodeIp),
                new org.web3j.abi.datatypes.generated.Uint16(destinationEnodePort)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
    return executeRemoteCallSingleValueReturn(function, byte[].class);
  }

  @Deprecated
  public static NodeRulesProxy load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new NodeRulesProxy(contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  @Deprecated
  public static NodeRulesProxy load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new NodeRulesProxy(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  public static NodeRulesProxy load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    return new NodeRulesProxy(contractAddress, web3j, credentials, contractGasProvider);
  }

  public static NodeRulesProxy load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    return new NodeRulesProxy(contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public static RemoteCall<NodeRulesProxy> deploy(
      Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        NodeRulesProxy.class, web3j, credentials, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<NodeRulesProxy> deploy(
      Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
    return deployRemoteCall(
        NodeRulesProxy.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
  }

  public static RemoteCall<NodeRulesProxy> deploy(
      Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        NodeRulesProxy.class, web3j, transactionManager, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<NodeRulesProxy> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return deployRemoteCall(
        NodeRulesProxy.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
  }
}
