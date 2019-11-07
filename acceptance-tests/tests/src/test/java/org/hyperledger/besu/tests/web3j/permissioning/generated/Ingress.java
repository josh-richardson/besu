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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.Flowable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
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
public class Ingress extends Contract {
  private static final String BINARY =
      "60806040527f72756c65730000000000000000000000000000000000000000000000000000006000557f61646d696e697374726174696f6e00000000000000000000000000000000000060015534801561005857600080fd5b506107b3806100686000396000f3fe608060405234801561001057600080fd5b50600436106100885760003560e01c8063a43e04d81161005b578063a43e04d814610140578063de8fa43114610171578063e001f84114610179578063fe9fbb80146101a557610088565b80630d2020dd1461008d57806310d9042e146100c6578063116013061461011e5780631e7c27cb14610138575b600080fd5b6100aa600480360360208110156100a357600080fd5b50356101cb565b604080516001600160a01b039092168252519081900360200190f35b6100ce61023e565b60408051602080825283518183015283519192839290830191858101910280838360005b8381101561010a5781810151838201526020016100f2565b505050509050019250505060405180910390f35b610126610296565b60408051918252519081900360200190f35b61012661029c565b61015d6004803603602081101561015657600080fd5b50356102a2565b604080519115158252519081900360200190f35b61012661048e565b61015d6004803603604081101561018f57600080fd5b50803590602001356001600160a01b0316610494565b61015d600480360360208110156101bb57600080fd5b50356001600160a01b0316610634565b60008161021f576040805162461bcd60e51b815260206004820181905260248201527f436f6e7472616374206e616d65206d757374206e6f7420626520656d7074792e604482015290519081900360640190fd5b506000818152600260205260409020546001600160a01b03165b919050565b6060600380548060200260200160405190810160405280929190818152602001828054801561028c57602002820191906000526020600020905b815481526020019060010190808311610278575b5050505050905090565b60005481565b60015481565b6000816102f6576040805162461bcd60e51b815260206004820181905260248201527f436f6e7472616374206e616d65206d757374206e6f7420626520656d7074792e604482015290519081900360640190fd5b6003546103345760405162461bcd60e51b81526004018080602001828103825260478152602001806107166047913960600191505060405180910390fd5b61033d33610634565b6103785760405162461bcd60e51b815260040180806020018281038252602b8152602001806106eb602b913960400191505060405180910390fd5b600082815260046020526040902054801580159061039857506003548111155b156104855760035481146103fa57600380546000919060001981019081106103bc57fe5b9060005260206000200154905080600360018403815481106103da57fe5b600091825260208083209091019290925591825260049052604090208190555b600380548061040557fe5b6000828152602080822083016000199081018390559092019092558482526004815260408083208390556002825280832080546001600160a01b0319169055805192835290820185905280517fe3d908a1f6d2467f8e7c8198f30125843211345eedb763beb4cdfb7fe728a5af9281900390910190a16001915050610239565b50600092915050565b60035490565b6000826104e8576040805162461bcd60e51b815260206004820181905260248201527f436f6e7472616374206e616d65206d757374206e6f7420626520656d7074792e604482015290519081900360640190fd5b6001600160a01b03821661052d5760405162461bcd60e51b815260040180806020018281038252602281526020018061075d6022913960400191505060405180910390fd5b61053633610634565b6105715760405162461bcd60e51b815260040180806020018281038252602b8152602001806106eb602b913960400191505060405180910390fd5b6000838152600460205260409020546105c5576003805460018101918290557fc2575a0e9e593c00f959f8c92f12db2869c3395a3b0502d05e2516446f71f85b018490556000848152600460205260409020555b60008381526002602090815260409182902080546001600160a01b0319166001600160a01b038616908117909155825190815290810185905281517fe3d908a1f6d2467f8e7c8198f30125843211345eedb763beb4cdfb7fe728a5af929181900390910190a150600192915050565b6001546000908152600260205260408120546001600160a01b031661065b57506001610239565b6001546000908152600260209081526040918290205482516301fd3f7760e71b81526001600160a01b0386811660048301529351939091169263fe9fbb8092602480840193919291829003018186803b1580156106b757600080fd5b505afa1580156106cb573d6000803e3d6000fd5b505050506040513d60208110156106e157600080fd5b5051905061023956fe4e6f7420617574686f72697a656420746f2075706461746520636f6e74726163742072656769737472792e4d7573742068617665206174206c65617374206f6e65207265676973746572656420636f6e747261637420746f20657865637574652064656c657465206f7065726174696f6e2e436f6e74726163742061646472657373206d757374206e6f74206265207a65726f2ea265627a7a723058208052421060a5ae96b8a4c150ec6ee3e95c160ca83bc7b8ebefbd6743dd51e28b64736f6c63430005090032";

  public static final String FUNC_GETCONTRACTADDRESS = "getContractAddress";

  public static final String FUNC_GETALLCONTRACTKEYS = "getAllContractKeys";

  public static final String FUNC_RULES_CONTRACT = "RULES_CONTRACT";

  public static final String FUNC_ADMIN_CONTRACT = "ADMIN_CONTRACT";

  public static final String FUNC_REMOVECONTRACT = "removeContract";

  public static final String FUNC_GETSIZE = "getSize";

  public static final String FUNC_SETCONTRACTADDRESS = "setContractAddress";

  public static final String FUNC_ISAUTHORIZED = "isAuthorized";

  public static final Event REGISTRYUPDATED_EVENT =
      new Event(
          "RegistryUpdated",
          Arrays.<TypeReference<?>>asList(
              new TypeReference<Address>() {}, new TypeReference<Bytes32>() {}));;

  @Deprecated
  protected Ingress(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  protected Ingress(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }

  @Deprecated
  protected Ingress(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  protected Ingress(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public RemoteFunctionCall<String> getContractAddress(byte[] name) {
    final Function function =
        new Function(
            FUNC_GETCONTRACTADDRESS,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(name)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    return executeRemoteCallSingleValueReturn(function, String.class);
  }

  public RemoteFunctionCall<List> getAllContractKeys() {
    final Function function =
        new Function(
            FUNC_GETALLCONTRACTKEYS,
            Arrays.<Type>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Bytes32>>() {}));
    return new RemoteFunctionCall<List>(
        function,
        new Callable<List>() {
          @Override
          @SuppressWarnings("unchecked")
          public List call() throws Exception {
            List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
            return convertToNative(result);
          }
        });
  }

  public RemoteFunctionCall<byte[]> RULES_CONTRACT() {
    final Function function =
        new Function(
            FUNC_RULES_CONTRACT,
            Arrays.<Type>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
    return executeRemoteCallSingleValueReturn(function, byte[].class);
  }

  public RemoteFunctionCall<byte[]> ADMIN_CONTRACT() {
    final Function function =
        new Function(
            FUNC_ADMIN_CONTRACT,
            Arrays.<Type>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
    return executeRemoteCallSingleValueReturn(function, byte[].class);
  }

  public RemoteFunctionCall<TransactionReceipt> removeContract(byte[] _name) {
    final Function function =
        new Function(
            FUNC_REMOVECONTRACT,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_name)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<BigInteger> getSize() {
    final Function function =
        new Function(
            FUNC_GETSIZE,
            Arrays.<Type>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    return executeRemoteCallSingleValueReturn(function, BigInteger.class);
  }

  public RemoteFunctionCall<TransactionReceipt> setContractAddress(byte[] name, String addr) {
    final Function function =
        new Function(
            FUNC_SETCONTRACTADDRESS,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.generated.Bytes32(name),
                new org.web3j.abi.datatypes.Address(160, addr)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<Boolean> isAuthorized(String account) {
    final Function function =
        new Function(
            FUNC_ISAUTHORIZED,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, account)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    return executeRemoteCallSingleValueReturn(function, Boolean.class);
  }

  public List<RegistryUpdatedEventResponse> getRegistryUpdatedEvents(
      TransactionReceipt transactionReceipt) {
    List<Contract.EventValuesWithLog> valueList =
        extractEventParametersWithLog(REGISTRYUPDATED_EVENT, transactionReceipt);
    ArrayList<RegistryUpdatedEventResponse> responses =
        new ArrayList<RegistryUpdatedEventResponse>(valueList.size());
    for (Contract.EventValuesWithLog eventValues : valueList) {
      RegistryUpdatedEventResponse typedResponse = new RegistryUpdatedEventResponse();
      typedResponse.log = eventValues.getLog();
      typedResponse.contractAddress = (String) eventValues.getNonIndexedValues().get(0).getValue();
      typedResponse.contractName = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
      responses.add(typedResponse);
    }
    return responses;
  }

  public Flowable<RegistryUpdatedEventResponse> registryUpdatedEventFlowable(EthFilter filter) {
    return web3j
        .ethLogFlowable(filter)
        .map(
            new io.reactivex.functions.Function<Log, RegistryUpdatedEventResponse>() {
              @Override
              public RegistryUpdatedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues =
                    extractEventParametersWithLog(REGISTRYUPDATED_EVENT, log);
                RegistryUpdatedEventResponse typedResponse = new RegistryUpdatedEventResponse();
                typedResponse.log = log;
                typedResponse.contractAddress =
                    (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.contractName =
                    (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
              }
            });
  }

  public Flowable<RegistryUpdatedEventResponse> registryUpdatedEventFlowable(
      DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
    EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
    filter.addSingleTopic(EventEncoder.encode(REGISTRYUPDATED_EVENT));
    return registryUpdatedEventFlowable(filter);
  }

  @Deprecated
  public static Ingress load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new Ingress(contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  @Deprecated
  public static Ingress load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new Ingress(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  public static Ingress load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    return new Ingress(contractAddress, web3j, credentials, contractGasProvider);
  }

  public static Ingress load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    return new Ingress(contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public static RemoteCall<Ingress> deploy(
      Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(Ingress.class, web3j, credentials, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<Ingress> deploy(
      Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
    return deployRemoteCall(Ingress.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
  }

  public static RemoteCall<Ingress> deploy(
      Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        Ingress.class, web3j, transactionManager, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<Ingress> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return deployRemoteCall(
        Ingress.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
  }

  public static class RegistryUpdatedEventResponse extends BaseEventResponse {
    public String contractAddress;

    public byte[] contractName;
  }
}
