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
public class AdminList extends Contract {
  private static final String BINARY =
      "6080604052348015600f57600080fd5b5060be8061001e6000396000f3fe6080604052348015600f57600080fd5b506004361060285760003560e01c80637ebd1b3014602d575b600080fd5b604760048036036020811015604157600080fd5b50356063565b604080516001600160a01b039092168252519081900360200190f35b60008181548110606f57fe5b6000918252602090912001546001600160a01b031690508156fea265627a7a723058202d339780a802abf9ca5bdecc2998d446884f01c9e767254c064761eb3b72589564736f6c63430005090032";

  public static final String FUNC_WHITELIST = "whitelist";

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
  protected AdminList(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  protected AdminList(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }

  @Deprecated
  protected AdminList(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  protected AdminList(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public RemoteFunctionCall<String> whitelist(BigInteger param0) {
    final Function function =
        new Function(
            FUNC_WHITELIST,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    return executeRemoteCallSingleValueReturn(function, String.class);
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
  public static AdminList load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new AdminList(contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  @Deprecated
  public static AdminList load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new AdminList(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  public static AdminList load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    return new AdminList(contractAddress, web3j, credentials, contractGasProvider);
  }

  public static AdminList load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    return new AdminList(contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public static RemoteCall<AdminList> deploy(
      Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(AdminList.class, web3j, credentials, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<AdminList> deploy(
      Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
    return deployRemoteCall(AdminList.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
  }

  public static RemoteCall<AdminList> deploy(
      Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        AdminList.class, web3j, transactionManager, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<AdminList> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return deployRemoteCall(
        AdminList.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
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
