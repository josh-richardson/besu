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
public class AccountIngress extends Contract {
  private static final String BINARY =
      "60806040527f72756c65730000000000000000000000000000000000000000000000000000006000557f61646d696e697374726174696f6e000000000000000000000000000000000000600155620f424060055534801561005f57600080fd5b50610a018061006f6000396000f3fe608060405234801561001057600080fd5b506004361061009e5760003560e01c8063936421d511610066578063936421d51461015e578063a43e04d814610244578063de8fa43114610261578063e001f84114610269578063fe9fbb80146102955761009e565b80630d2020dd146100a357806310d9042e146100dc57806311601306146101345780631e7c27cb1461014e5780638aa1043514610156575b600080fd5b6100c0600480360360208110156100b957600080fd5b50356102bb565b604080516001600160a01b039092168252519081900360200190f35b6100e461032e565b60408051602080825283518183015283519192839290830191858101910280838360005b83811015610120578181015183820152602001610108565b505050509050019250505060405180910390f35b61013c610386565b60408051918252519081900360200190f35b61013c61038c565b61013c610392565b610230600480360360c081101561017457600080fd5b6001600160a01b0382358116926020810135909116916040820135916060810135916080820135919081019060c0810160a08201356401000000008111156101bb57600080fd5b8201836020820111156101cd57600080fd5b803590602001918460018302840111640100000000831117156101ef57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929550610398945050505050565b604080519115158252519081900360200190f35b6102306004803603602081101561025a57600080fd5b50356104f0565b61013c6106dc565b6102306004803603604081101561027f57600080fd5b50803590602001356001600160a01b03166106e2565b610230600480360360208110156102ab57600080fd5b50356001600160a01b0316610882565b60008161030f576040805162461bcd60e51b815260206004820181905260248201527f436f6e7472616374206e616d65206d757374206e6f7420626520656d7074792e604482015290519081900360640190fd5b506000818152600260205260409020546001600160a01b03165b919050565b6060600380548060200260200160405190810160405280929190818152602001828054801561037c57602002820191906000526020600020905b815481526020019060010190808311610368575b5050505050905090565b60005481565b60015481565b60055490565b6000806001600160a01b03166103af6000546102bb565b6001600160a01b031614156103c6575060016104e6565b60008054815260026020908152604080832054905163936421d560e01b81526001600160a01b038b8116600483019081528b82166024840152604483018b9052606483018a90526084830189905260c060a48401908152885160c48501528851929094169563936421d5958e958e958e958e958e958e9591949360e4019291860191908190849084905b83811015610468578181015183820152602001610450565b50505050905090810190601f1680156104955780820380516001836020036101000a031916815260200191505b5097505050505050505060206040518083038186803b1580156104b757600080fd5b505afa1580156104cb573d6000803e3d6000fd5b505050506040513d60208110156104e157600080fd5b505190505b9695505050505050565b600081610544576040805162461bcd60e51b815260206004820181905260248201527f436f6e7472616374206e616d65206d757374206e6f7420626520656d7074792e604482015290519081900360640190fd5b6003546105825760405162461bcd60e51b81526004018080602001828103825260478152602001806109646047913960600191505060405180910390fd5b61058b33610882565b6105c65760405162461bcd60e51b815260040180806020018281038252602b815260200180610939602b913960400191505060405180910390fd5b60008281526004602052604090205480158015906105e657506003548111155b156106d3576003548114610648576003805460009190600019810190811061060a57fe5b90600052602060002001549050806003600184038154811061062857fe5b600091825260208083209091019290925591825260049052604090208190555b600380548061065357fe5b6000828152602080822083016000199081018390559092019092558482526004815260408083208390556002825280832080546001600160a01b0319169055805192835290820185905280517fe3d908a1f6d2467f8e7c8198f30125843211345eedb763beb4cdfb7fe728a5af9281900390910190a16001915050610329565b50600092915050565b60035490565b600082610736576040805162461bcd60e51b815260206004820181905260248201527f436f6e7472616374206e616d65206d757374206e6f7420626520656d7074792e604482015290519081900360640190fd5b6001600160a01b03821661077b5760405162461bcd60e51b81526004018080602001828103825260228152602001806109ab6022913960400191505060405180910390fd5b61078433610882565b6107bf5760405162461bcd60e51b815260040180806020018281038252602b815260200180610939602b913960400191505060405180910390fd5b600083815260046020526040902054610813576003805460018101918290557fc2575a0e9e593c00f959f8c92f12db2869c3395a3b0502d05e2516446f71f85b018490556000848152600460205260409020555b60008381526002602090815260409182902080546001600160a01b0319166001600160a01b038616908117909155825190815290810185905281517fe3d908a1f6d2467f8e7c8198f30125843211345eedb763beb4cdfb7fe728a5af929181900390910190a150600192915050565b6001546000908152600260205260408120546001600160a01b03166108a957506001610329565b6001546000908152600260209081526040918290205482516301fd3f7760e71b81526001600160a01b0386811660048301529351939091169263fe9fbb8092602480840193919291829003018186803b15801561090557600080fd5b505afa158015610919573d6000803e3d6000fd5b505050506040513d602081101561092f57600080fd5b5051905061032956fe4e6f7420617574686f72697a656420746f2075706461746520636f6e74726163742072656769737472792e4d7573742068617665206174206c65617374206f6e65207265676973746572656420636f6e747261637420746f20657865637574652064656c657465206f7065726174696f6e2e436f6e74726163742061646472657373206d757374206e6f74206265207a65726f2ea265627a7a7230582003e33471f64a7f821cc697807fae03669d785757a6fcf18d6bea0bc899fad59d64736f6c63430005090032";

  public static final String FUNC_GETCONTRACTADDRESS = "getContractAddress";

  public static final String FUNC_GETALLCONTRACTKEYS = "getAllContractKeys";

  public static final String FUNC_RULES_CONTRACT = "RULES_CONTRACT";

  public static final String FUNC_ADMIN_CONTRACT = "ADMIN_CONTRACT";

  public static final String FUNC_GETCONTRACTVERSION = "getContractVersion";

  public static final String FUNC_TRANSACTIONALLOWED = "transactionAllowed";

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
  protected AccountIngress(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  protected AccountIngress(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }

  @Deprecated
  protected AccountIngress(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  protected AccountIngress(
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

  public RemoteFunctionCall<BigInteger> getContractVersion() {
    final Function function =
        new Function(
            FUNC_GETCONTRACTVERSION,
            Arrays.<Type>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    return executeRemoteCallSingleValueReturn(function, BigInteger.class);
  }

  public RemoteFunctionCall<Boolean> transactionAllowed(
      String sender,
      String target,
      BigInteger value,
      BigInteger gasPrice,
      BigInteger gasLimit,
      byte[] payload) {
    final Function function =
        new Function(
            FUNC_TRANSACTIONALLOWED,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.Address(160, sender),
                new org.web3j.abi.datatypes.Address(160, target),
                new org.web3j.abi.datatypes.generated.Uint256(value),
                new org.web3j.abi.datatypes.generated.Uint256(gasPrice),
                new org.web3j.abi.datatypes.generated.Uint256(gasLimit),
                new org.web3j.abi.datatypes.DynamicBytes(payload)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    return executeRemoteCallSingleValueReturn(function, Boolean.class);
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
  public static AccountIngress load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new AccountIngress(contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  @Deprecated
  public static AccountIngress load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new AccountIngress(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  public static AccountIngress load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    return new AccountIngress(contractAddress, web3j, credentials, contractGasProvider);
  }

  public static AccountIngress load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    return new AccountIngress(contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public static RemoteCall<AccountIngress> deploy(
      Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        AccountIngress.class, web3j, credentials, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<AccountIngress> deploy(
      Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
    return deployRemoteCall(
        AccountIngress.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
  }

  public static RemoteCall<AccountIngress> deploy(
      Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        AccountIngress.class, web3j, transactionManager, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<AccountIngress> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return deployRemoteCall(
        AccountIngress.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
  }

  public static class RegistryUpdatedEventResponse extends BaseEventResponse {
    public String contractAddress;

    public byte[] contractName;
  }
}
