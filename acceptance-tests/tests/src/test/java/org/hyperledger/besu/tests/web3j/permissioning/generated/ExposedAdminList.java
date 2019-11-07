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

import io.reactivex.Flowable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
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
public class ExposedAdminList extends Contract {
  private static final String BINARY =
      "608060405234801561001057600080fd5b506107b5806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c806310d426f2146100675780634d469582146100a15780637ebd1b3014610144578063c3b3a3c91461017d578063c80847ea146101a3578063d136d90c146101c9575b600080fd5b61008d6004803603602081101561007d57600080fd5b50356001600160a01b03166101e3565b604080519115158252519081900360200190f35b61008d600480360360208110156100b757600080fd5b8101906020810181356401000000008111156100d257600080fd5b8201836020820111156100e457600080fd5b8035906020019184602083028401116401000000008311171561010657600080fd5b9190808060200260200160405190810160405280939291908181526020018383602002808284376000920191909152509295506101f6945050505050565b6101616004803603602081101561015a57600080fd5b5035610201565b604080516001600160a01b039092168252519081900360200190f35b61008d6004803603602081101561019357600080fd5b50356001600160a01b0316610228565b61008d600480360360208110156101b957600080fd5b50356001600160a01b0316610233565b6101d161023e565b60408051918252519081900360200190f35b60006101ee8261024e565b90505b919050565b60006101ee82610342565b6000818154811061020e57fe5b6000918252602090912001546001600160a01b0316905081565b60006101ee82610666565b60006101ee82610683565b6000610248610707565b90505b90565b6001600160a01b038116600090815260016020526040812054801580159061027857506000548111155b1561033957600054811461030057600080548190600019810190811061029a57fe5b600091825260208220015481546001600160a01b03909116925082919060001985019081106102c557fe5b600091825260208083209190910180546001600160a01b0319166001600160a01b039485161790559290911681526001909152604090208190555b600080546000190190610313908261070d565b5050506001600160a01b03811660009081526001602081905260408220919091556101f1565b50600092915050565b60006001815b835181101561065f5783818151811061035d57fe5b60200260200101516001600160a01b0316336001600160a01b03161415610415577f7de09b89cd6310ad2dbbef9b99bee3df114399d19b156a3dc6afb8f5ff60781a60008583815181106103ad57fe5b60200260200101516040518083151515158152602001826001600160a01b03166001600160a01b03168152602001806020018281038252602c815260200180610755602c9139604001935050505060405180910390a181801561040e575060005b9150610657565b61043184828151811061042457fe5b6020026020010151610666565b156104db577f7de09b89cd6310ad2dbbef9b99bee3df114399d19b156a3dc6afb8f5ff60781a600085838151811061046557fe5b6020908102919091018101516040805193151584526001600160a01b03909116918301919091526060828201819052601b908301527f4163636f756e7420697320616c726561647920616e2041646d696e00000000006080830152519081900360a00190a181801561040e575060009150610657565b60006104f98583815181106104ec57fe5b6020026020010151610683565b905060608161053d576040518060400160405280601b81526020017f4163636f756e7420697320616c726561647920616e2041646d696e0000000000815250610574565b6040518060400160405280602081526020017f41646d696e206163636f756e74206164646564207375636365737366756c6c798152505b90507f7de09b89cd6310ad2dbbef9b99bee3df114399d19b156a3dc6afb8f5ff60781a828785815181106105a457fe5b6020026020010151836040518084151515158152602001836001600160a01b03166001600160a01b0316815260200180602001828103825283818151815260200191508051906020019080838360005b8381101561060c5781810151838201526020016105f4565b50505050905090810190601f1680156106395780820380516001836020036101000a031916815260200191505b5094505050505060405180910390a18380156106525750815b935050505b600101610348565b5092915050565b6001600160a01b0316600090815260016020526040902054151590565b6001600160a01b0381166000908152600160205260408120546106ff57506000805460018082018084557f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56390920180546001600160a01b0319166001600160a01b038616908117909155835260208190526040909220556101f1565b506000919050565b60005490565b81548183558181111561073157600083815260209020610731918101908301610736565b505050565b61024b91905b80821115610750576000815560010161073c565b509056fe416464696e67206f776e206163636f756e742061732041646d696e206973206e6f74207065726d6974746564a265627a7a72305820ef0915389a015387911a52e737d4523cdbca9cb23cce30d0ec854c7cf1a0d82764736f6c63430005090032";

  public static final String FUNC__REMOVE = "_remove";

  public static final String FUNC__ADDBATCH = "_addBatch";

  public static final String FUNC_WHITELIST = "whitelist";

  public static final String FUNC__EXISTS = "_exists";

  public static final String FUNC__ADD = "_add";

  public static final String FUNC__SIZE = "_size";

  public static final Event ADMINADDED_EVENT =
      new Event(
          "AdminAdded",
          Arrays.<TypeReference<?>>asList(
              new TypeReference<Bool>() {},
              new TypeReference<Address>() {},
              new TypeReference<Utf8String>() {}));;

  public static final Event ADMINREMOVED_EVENT =
      new Event(
          "AdminRemoved",
          Arrays.<TypeReference<?>>asList(
              new TypeReference<Bool>() {}, new TypeReference<Address>() {}));;

  @Deprecated
  protected ExposedAdminList(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  protected ExposedAdminList(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }

  @Deprecated
  protected ExposedAdminList(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  protected ExposedAdminList(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public RemoteFunctionCall<TransactionReceipt> _remove(String _address) {
    final Function function =
        new Function(
            FUNC__REMOVE,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _address)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<TransactionReceipt> _addBatch(List<String> _addresses) {
    final Function function =
        new Function(
            FUNC__ADDBATCH,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                    org.web3j.abi.datatypes.Address.class,
                    org.web3j.abi.Utils.typeMap(
                        _addresses, org.web3j.abi.datatypes.Address.class))),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<String> whitelist(BigInteger param0) {
    final Function function =
        new Function(
            FUNC_WHITELIST,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    return executeRemoteCallSingleValueReturn(function, String.class);
  }

  public RemoteFunctionCall<Boolean> _exists(String _address) {
    final Function function =
        new Function(
            FUNC__EXISTS,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _address)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    return executeRemoteCallSingleValueReturn(function, Boolean.class);
  }

  public RemoteFunctionCall<TransactionReceipt> _add(String _address) {
    final Function function =
        new Function(
            FUNC__ADD,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _address)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<BigInteger> _size() {
    final Function function =
        new Function(
            FUNC__SIZE,
            Arrays.<Type>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    return executeRemoteCallSingleValueReturn(function, BigInteger.class);
  }

  public List<AdminAddedEventResponse> getAdminAddedEvents(TransactionReceipt transactionReceipt) {
    List<Contract.EventValuesWithLog> valueList =
        extractEventParametersWithLog(ADMINADDED_EVENT, transactionReceipt);
    ArrayList<AdminAddedEventResponse> responses =
        new ArrayList<AdminAddedEventResponse>(valueList.size());
    for (Contract.EventValuesWithLog eventValues : valueList) {
      AdminAddedEventResponse typedResponse = new AdminAddedEventResponse();
      typedResponse.log = eventValues.getLog();
      typedResponse.adminAdded = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
      typedResponse.account = (String) eventValues.getNonIndexedValues().get(1).getValue();
      typedResponse.message = (String) eventValues.getNonIndexedValues().get(2).getValue();
      responses.add(typedResponse);
    }
    return responses;
  }

  public Flowable<AdminAddedEventResponse> adminAddedEventFlowable(EthFilter filter) {
    return web3j
        .ethLogFlowable(filter)
        .map(
            new io.reactivex.functions.Function<Log, AdminAddedEventResponse>() {
              @Override
              public AdminAddedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues =
                    extractEventParametersWithLog(ADMINADDED_EVENT, log);
                AdminAddedEventResponse typedResponse = new AdminAddedEventResponse();
                typedResponse.log = log;
                typedResponse.adminAdded =
                    (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.account =
                    (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.message =
                    (String) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
              }
            });
  }

  public Flowable<AdminAddedEventResponse> adminAddedEventFlowable(
      DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
    EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
    filter.addSingleTopic(EventEncoder.encode(ADMINADDED_EVENT));
    return adminAddedEventFlowable(filter);
  }

  public List<AdminRemovedEventResponse> getAdminRemovedEvents(
      TransactionReceipt transactionReceipt) {
    List<Contract.EventValuesWithLog> valueList =
        extractEventParametersWithLog(ADMINREMOVED_EVENT, transactionReceipt);
    ArrayList<AdminRemovedEventResponse> responses =
        new ArrayList<AdminRemovedEventResponse>(valueList.size());
    for (Contract.EventValuesWithLog eventValues : valueList) {
      AdminRemovedEventResponse typedResponse = new AdminRemovedEventResponse();
      typedResponse.log = eventValues.getLog();
      typedResponse.adminRemoved = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
      typedResponse.account = (String) eventValues.getNonIndexedValues().get(1).getValue();
      responses.add(typedResponse);
    }
    return responses;
  }

  public Flowable<AdminRemovedEventResponse> adminRemovedEventFlowable(EthFilter filter) {
    return web3j
        .ethLogFlowable(filter)
        .map(
            new io.reactivex.functions.Function<Log, AdminRemovedEventResponse>() {
              @Override
              public AdminRemovedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues =
                    extractEventParametersWithLog(ADMINREMOVED_EVENT, log);
                AdminRemovedEventResponse typedResponse = new AdminRemovedEventResponse();
                typedResponse.log = log;
                typedResponse.adminRemoved =
                    (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.account =
                    (String) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
              }
            });
  }

  public Flowable<AdminRemovedEventResponse> adminRemovedEventFlowable(
      DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
    EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
    filter.addSingleTopic(EventEncoder.encode(ADMINREMOVED_EVENT));
    return adminRemovedEventFlowable(filter);
  }

  @Deprecated
  public static ExposedAdminList load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new ExposedAdminList(contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  @Deprecated
  public static ExposedAdminList load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new ExposedAdminList(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  public static ExposedAdminList load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    return new ExposedAdminList(contractAddress, web3j, credentials, contractGasProvider);
  }

  public static ExposedAdminList load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    return new ExposedAdminList(contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public static RemoteCall<ExposedAdminList> deploy(
      Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        ExposedAdminList.class, web3j, credentials, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<ExposedAdminList> deploy(
      Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
    return deployRemoteCall(
        ExposedAdminList.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
  }

  public static RemoteCall<ExposedAdminList> deploy(
      Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        ExposedAdminList.class, web3j, transactionManager, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<ExposedAdminList> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return deployRemoteCall(
        ExposedAdminList.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
  }

  public static class AdminAddedEventResponse extends BaseEventResponse {
    public Boolean adminAdded;

    public String account;

    public String message;
  }

  public static class AdminRemovedEventResponse extends BaseEventResponse {
    public Boolean adminRemoved;

    public String account;
  }
}
