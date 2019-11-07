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
public class AccountRulesList extends Contract {
  private static final String BINARY =
      "6080604052348015600f57600080fd5b5060be8061001e6000396000f3fe6080604052348015600f57600080fd5b506004361060285760003560e01c80637ebd1b3014602d575b600080fd5b604760048036036020811015604157600080fd5b50356063565b604080516001600160a01b039092168252519081900360200190f35b60008181548110606f57fe5b6000918252602090912001546001600160a01b031690508156fea265627a7a7230582092e6ceebeaa3cdf3a562637017181abd716d6e4b97957a6c6779ea8cfe1f91d464736f6c63430005090032";

  public static final String FUNC_WHITELIST = "whitelist";

  public static final Event ACCOUNTADDED_EVENT =
      new Event(
          "AccountAdded",
          Arrays.<TypeReference<?>>asList(
              new TypeReference<Bool>() {}, new TypeReference<Address>() {}));;

  public static final Event ACCOUNTREMOVED_EVENT =
      new Event(
          "AccountRemoved",
          Arrays.<TypeReference<?>>asList(
              new TypeReference<Bool>() {}, new TypeReference<Address>() {}));;

  @Deprecated
  protected AccountRulesList(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  protected AccountRulesList(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }

  @Deprecated
  protected AccountRulesList(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  protected AccountRulesList(
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

  public List<AccountAddedEventResponse> getAccountAddedEvents(
      TransactionReceipt transactionReceipt) {
    List<Contract.EventValuesWithLog> valueList =
        extractEventParametersWithLog(ACCOUNTADDED_EVENT, transactionReceipt);
    ArrayList<AccountAddedEventResponse> responses =
        new ArrayList<AccountAddedEventResponse>(valueList.size());
    for (Contract.EventValuesWithLog eventValues : valueList) {
      AccountAddedEventResponse typedResponse = new AccountAddedEventResponse();
      typedResponse.log = eventValues.getLog();
      typedResponse.accountAdded = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
      typedResponse.accountAddress = (String) eventValues.getNonIndexedValues().get(1).getValue();
      responses.add(typedResponse);
    }
    return responses;
  }

  public Flowable<AccountAddedEventResponse> accountAddedEventFlowable(EthFilter filter) {
    return web3j
        .ethLogFlowable(filter)
        .map(
            new io.reactivex.functions.Function<Log, AccountAddedEventResponse>() {
              @Override
              public AccountAddedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues =
                    extractEventParametersWithLog(ACCOUNTADDED_EVENT, log);
                AccountAddedEventResponse typedResponse = new AccountAddedEventResponse();
                typedResponse.log = log;
                typedResponse.accountAdded =
                    (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.accountAddress =
                    (String) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
              }
            });
  }

  public Flowable<AccountAddedEventResponse> accountAddedEventFlowable(
      DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
    EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
    filter.addSingleTopic(EventEncoder.encode(ACCOUNTADDED_EVENT));
    return accountAddedEventFlowable(filter);
  }

  public List<AccountRemovedEventResponse> getAccountRemovedEvents(
      TransactionReceipt transactionReceipt) {
    List<Contract.EventValuesWithLog> valueList =
        extractEventParametersWithLog(ACCOUNTREMOVED_EVENT, transactionReceipt);
    ArrayList<AccountRemovedEventResponse> responses =
        new ArrayList<AccountRemovedEventResponse>(valueList.size());
    for (Contract.EventValuesWithLog eventValues : valueList) {
      AccountRemovedEventResponse typedResponse = new AccountRemovedEventResponse();
      typedResponse.log = eventValues.getLog();
      typedResponse.accountRemoved = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
      typedResponse.accountAddress = (String) eventValues.getNonIndexedValues().get(1).getValue();
      responses.add(typedResponse);
    }
    return responses;
  }

  public Flowable<AccountRemovedEventResponse> accountRemovedEventFlowable(EthFilter filter) {
    return web3j
        .ethLogFlowable(filter)
        .map(
            new io.reactivex.functions.Function<Log, AccountRemovedEventResponse>() {
              @Override
              public AccountRemovedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues =
                    extractEventParametersWithLog(ACCOUNTREMOVED_EVENT, log);
                AccountRemovedEventResponse typedResponse = new AccountRemovedEventResponse();
                typedResponse.log = log;
                typedResponse.accountRemoved =
                    (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.accountAddress =
                    (String) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
              }
            });
  }

  public Flowable<AccountRemovedEventResponse> accountRemovedEventFlowable(
      DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
    EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
    filter.addSingleTopic(EventEncoder.encode(ACCOUNTREMOVED_EVENT));
    return accountRemovedEventFlowable(filter);
  }

  @Deprecated
  public static AccountRulesList load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new AccountRulesList(contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  @Deprecated
  public static AccountRulesList load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new AccountRulesList(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  public static AccountRulesList load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    return new AccountRulesList(contractAddress, web3j, credentials, contractGasProvider);
  }

  public static AccountRulesList load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    return new AccountRulesList(contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public static RemoteCall<AccountRulesList> deploy(
      Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        AccountRulesList.class, web3j, credentials, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<AccountRulesList> deploy(
      Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
    return deployRemoteCall(
        AccountRulesList.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
  }

  public static RemoteCall<AccountRulesList> deploy(
      Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        AccountRulesList.class, web3j, transactionManager, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<AccountRulesList> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return deployRemoteCall(
        AccountRulesList.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
  }

  public static class AccountAddedEventResponse extends BaseEventResponse {
    public Boolean accountAdded;

    public String accountAddress;
  }

  public static class AccountRemovedEventResponse extends BaseEventResponse {
    public Boolean accountRemoved;

    public String accountAddress;
  }
}
