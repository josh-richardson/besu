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
public class NodeIngress extends Contract {
  private static final String BINARY =
      "60806040527f72756c65730000000000000000000000000000000000000000000000000000006000557f61646d696e697374726174696f6e000000000000000000000000000000000000600155620f424060055534801561005f57600080fd5b50610a298061006f6000396000f3fe608060405234801561001057600080fd5b50600436106100a95760003560e01c80634dc3fefc116100715780634dc3fefc146101bf5780638aa10435146101e0578063a43e04d8146101e8578063de8fa43114610219578063e001f84114610221578063fe9fbb801461024d576100a9565b80630d2020dd146100ae57806310d9042e146100e7578063116013061461013f5780631e7c27cb146101595780633620b1df14610161575b600080fd5b6100cb600480360360208110156100c457600080fd5b5035610273565b604080516001600160a01b039092168252519081900360200190f35b6100ef6102e6565b60408051602080825283518183015283519192839290830191858101910280838360005b8381101561012b578181015183820152602001610113565b505050509050019250505060405180910390f35b61014761033e565b60408051918252519081900360200190f35b610147610344565b610147600480360361010081101561017857600080fd5b508035906020810135906001600160801b0319604082013581169161ffff606082013581169260808301359260a08101359260c08201359092169160e0909101351661034a565b6101de600480360360208110156101d557600080fd5b50351515610451565b005b6101476104df565b610205600480360360208110156101fe57600080fd5b50356104e5565b604080519115158252519081900360200190f35b6101476106d1565b6102056004803603604081101561023757600080fd5b50803590602001356001600160a01b03166106d7565b6102056004803603602081101561026357600080fd5b50356001600160a01b0316610877565b6000816102c7576040805162461bcd60e51b815260206004820181905260248201527f436f6e7472616374206e616d65206d757374206e6f7420626520656d7074792e604482015290519081900360640190fd5b506000818152600260205260409020546001600160a01b03165b919050565b6060600380548060200260200160405190810160405280929190818152602001828054801561033457602002820191906000526020600020905b815481526020019060010190808311610320575b5050505050905090565b60005481565b60015481565b6000806001600160a01b0316610361600054610273565b6001600160a01b0316141561037e57506001600160ff1b03610445565b60008054815260026020908152604091829020548251633620b1df60e01b8152600481018d9052602481018c90526001600160801b0319808c16604483015261ffff808c166064840152608483018b905260a483018a905290881660c4830152861660e482015292516001600160a01b0390911692633620b1df92610104808301939192829003018186803b15801561041657600080fd5b505afa15801561042a573d6000803e3d6000fd5b505050506040513d602081101561044057600080fd5b505190505b98975050505050505050565b600080548152600260205260409020546001600160a01b031633146104a75760405162461bcd60e51b815260040180806020018281038252603381526020018061092e6033913960400191505060405180910390fd5b60408051821515815290517f66120f934b66d52127e448f8e94c2460ea62821335e0dd18e89ed38a4a09b4139181900360200190a150565b60055490565b600081610539576040805162461bcd60e51b815260206004820181905260248201527f436f6e7472616374206e616d65206d757374206e6f7420626520656d7074792e604482015290519081900360640190fd5b6003546105775760405162461bcd60e51b815260040180806020018281038252604781526020018061098c6047913960600191505060405180910390fd5b61058033610877565b6105bb5760405162461bcd60e51b815260040180806020018281038252602b815260200180610961602b913960400191505060405180910390fd5b60008281526004602052604090205480158015906105db57506003548111155b156106c857600354811461063d57600380546000919060001981019081106105ff57fe5b90600052602060002001549050806003600184038154811061061d57fe5b600091825260208083209091019290925591825260049052604090208190555b600380548061064857fe5b6000828152602080822083016000199081018390559092019092558482526004815260408083208390556002825280832080546001600160a01b0319169055805192835290820185905280517fe3d908a1f6d2467f8e7c8198f30125843211345eedb763beb4cdfb7fe728a5af9281900390910190a160019150506102e1565b50600092915050565b60035490565b60008261072b576040805162461bcd60e51b815260206004820181905260248201527f436f6e7472616374206e616d65206d757374206e6f7420626520656d7074792e604482015290519081900360640190fd5b6001600160a01b0382166107705760405162461bcd60e51b81526004018080602001828103825260228152602001806109d36022913960400191505060405180910390fd5b61077933610877565b6107b45760405162461bcd60e51b815260040180806020018281038252602b815260200180610961602b913960400191505060405180910390fd5b600083815260046020526040902054610808576003805460018101918290557fc2575a0e9e593c00f959f8c92f12db2869c3395a3b0502d05e2516446f71f85b018490556000848152600460205260409020555b60008381526002602090815260409182902080546001600160a01b0319166001600160a01b038616908117909155825190815290810185905281517fe3d908a1f6d2467f8e7c8198f30125843211345eedb763beb4cdfb7fe728a5af929181900390910190a150600192915050565b6001546000908152600260205260408120546001600160a01b031661089e575060016102e1565b6001546000908152600260209081526040918290205482516301fd3f7760e71b81526001600160a01b0386811660048301529351939091169263fe9fbb8092602480840193919291829003018186803b1580156108fa57600080fd5b505afa15801561090e573d6000803e3d6000fd5b505050506040513d602081101561092457600080fd5b505190506102e156fe4f6e6c792052756c657320636f6e74726163742063616e20747269676765722052756c6573206368616e6765206576656e74734e6f7420617574686f72697a656420746f2075706461746520636f6e74726163742072656769737472792e4d7573742068617665206174206c65617374206f6e65207265676973746572656420636f6e747261637420746f20657865637574652064656c657465206f7065726174696f6e2e436f6e74726163742061646472657373206d757374206e6f74206265207a65726f2ea265627a7a72305820faf83d65efda3a40e04b4dc0062ca39486856736102a3e590d7e604afcb2261764736f6c63430005090032";

  public static final String FUNC_GETCONTRACTADDRESS = "getContractAddress";

  public static final String FUNC_GETALLCONTRACTKEYS = "getAllContractKeys";

  public static final String FUNC_RULES_CONTRACT = "RULES_CONTRACT";

  public static final String FUNC_ADMIN_CONTRACT = "ADMIN_CONTRACT";

  public static final String FUNC_CONNECTIONALLOWED = "connectionAllowed";

  public static final String FUNC_EMITRULESCHANGEEVENT = "emitRulesChangeEvent";

  public static final String FUNC_GETCONTRACTVERSION = "getContractVersion";

  public static final String FUNC_REMOVECONTRACT = "removeContract";

  public static final String FUNC_GETSIZE = "getSize";

  public static final String FUNC_SETCONTRACTADDRESS = "setContractAddress";

  public static final String FUNC_ISAUTHORIZED = "isAuthorized";

  public static final Event NODEPERMISSIONSUPDATED_EVENT =
      new Event(
          "NodePermissionsUpdated", Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));;

  public static final Event REGISTRYUPDATED_EVENT =
      new Event(
          "RegistryUpdated",
          Arrays.<TypeReference<?>>asList(
              new TypeReference<Address>() {}, new TypeReference<Bytes32>() {}));;

  @Deprecated
  protected NodeIngress(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  protected NodeIngress(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }

  @Deprecated
  protected NodeIngress(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  protected NodeIngress(
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

  public RemoteFunctionCall<TransactionReceipt> emitRulesChangeEvent(Boolean addsRestrictions) {
    final Function function =
        new Function(
            FUNC_EMITRULESCHANGEEVENT,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Bool(addsRestrictions)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<BigInteger> getContractVersion() {
    final Function function =
        new Function(
            FUNC_GETCONTRACTVERSION,
            Arrays.<Type>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    return executeRemoteCallSingleValueReturn(function, BigInteger.class);
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

  public List<NodePermissionsUpdatedEventResponse> getNodePermissionsUpdatedEvents(
      TransactionReceipt transactionReceipt) {
    List<Contract.EventValuesWithLog> valueList =
        extractEventParametersWithLog(NODEPERMISSIONSUPDATED_EVENT, transactionReceipt);
    ArrayList<NodePermissionsUpdatedEventResponse> responses =
        new ArrayList<NodePermissionsUpdatedEventResponse>(valueList.size());
    for (Contract.EventValuesWithLog eventValues : valueList) {
      NodePermissionsUpdatedEventResponse typedResponse = new NodePermissionsUpdatedEventResponse();
      typedResponse.log = eventValues.getLog();
      typedResponse.addsRestrictions =
          (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
      responses.add(typedResponse);
    }
    return responses;
  }

  public Flowable<NodePermissionsUpdatedEventResponse> nodePermissionsUpdatedEventFlowable(
      EthFilter filter) {
    return web3j
        .ethLogFlowable(filter)
        .map(
            new io.reactivex.functions.Function<Log, NodePermissionsUpdatedEventResponse>() {
              @Override
              public NodePermissionsUpdatedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues =
                    extractEventParametersWithLog(NODEPERMISSIONSUPDATED_EVENT, log);
                NodePermissionsUpdatedEventResponse typedResponse =
                    new NodePermissionsUpdatedEventResponse();
                typedResponse.log = log;
                typedResponse.addsRestrictions =
                    (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
              }
            });
  }

  public Flowable<NodePermissionsUpdatedEventResponse> nodePermissionsUpdatedEventFlowable(
      DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
    EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
    filter.addSingleTopic(EventEncoder.encode(NODEPERMISSIONSUPDATED_EVENT));
    return nodePermissionsUpdatedEventFlowable(filter);
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
  public static NodeIngress load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new NodeIngress(contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  @Deprecated
  public static NodeIngress load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new NodeIngress(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  public static NodeIngress load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    return new NodeIngress(contractAddress, web3j, credentials, contractGasProvider);
  }

  public static NodeIngress load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    return new NodeIngress(contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public static RemoteCall<NodeIngress> deploy(
      Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(NodeIngress.class, web3j, credentials, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<NodeIngress> deploy(
      Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
    return deployRemoteCall(NodeIngress.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
  }

  public static RemoteCall<NodeIngress> deploy(
      Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        NodeIngress.class, web3j, transactionManager, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<NodeIngress> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return deployRemoteCall(
        NodeIngress.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
  }

  public static class NodePermissionsUpdatedEventResponse extends BaseEventResponse {
    public Boolean addsRestrictions;
  }

  public static class RegistryUpdatedEventResponse extends BaseEventResponse {
    public String contractAddress;

    public byte[] contractName;
  }
}
