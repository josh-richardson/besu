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
public class ExposedAccountRulesList extends Contract {
  private static final String BINARY =
      "608060405234801561001057600080fd5b50610518806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c806310d426f2146100675780637ebd1b30146100a15780639c2bc427146100da578063c3b3a3c91461017d578063c80847ea146101a3578063d136d90c146101c9575b600080fd5b61008d6004803603602081101561007d57600080fd5b50356001600160a01b03166101e3565b604080519115158252519081900360200190f35b6100be600480360360208110156100b757600080fd5b50356101f6565b604080516001600160a01b039092168252519081900360200190f35b61008d600480360360208110156100f057600080fd5b81019060208101813564010000000081111561010b57600080fd5b82018360208201111561011d57600080fd5b8035906020019184602083028401116401000000008311171561013f57600080fd5b91908080602002602001604051908101604052809392919081815260200183836020028082843760009201919091525092955061021d945050505050565b61008d6004803603602081101561019357600080fd5b50356001600160a01b0316610228565b61008d600480360360208110156101b957600080fd5b50356001600160a01b0316610233565b6101d161023e565b60408051918252519081900360200190f35b60006101ee8261024e565b90505b919050565b6000818154811061020357fe5b6000918252602090912001546001600160a01b0316905081565b60006101ee82610342565b60006101ee826103f5565b60006101ee82610412565b6000610248610496565b90505b90565b6001600160a01b038116600090815260016020526040812054801580159061027857506000548111155b1561033957600054811461030057600080548190600019810190811061029a57fe5b600091825260208220015481546001600160a01b03909116925082919060001985019081106102c557fe5b600091825260208083209190910180546001600160a01b0319166001600160a01b039485161790559290911681526001909152604090208190555b600080546000190190610313908261049c565b5050506001600160a01b03811660009081526001602081905260408220919091556101f1565b50600092915050565b60006001815b83518110156103ee57600061036f85838151811061036257fe5b6020026020010151610412565b90507fe39119db1877d19873ffb44540ac1dbd9ca72da5413d351392ce967885031aa48186848151811061039f57fe5b60200260200101516040518083151515158152602001826001600160a01b03166001600160a01b031681526020019250505060405180910390a18280156103e35750805b925050600101610348565b5092915050565b6001600160a01b0316600090815260016020526040902054151590565b6001600160a01b03811660009081526001602052604081205461048e57506000805460018082018084557f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56390920180546001600160a01b0319166001600160a01b038616908117909155835260208190526040909220556101f1565b506000919050565b60005490565b8154818355818111156104c0576000838152602090206104c09181019083016104c5565b505050565b61024b91905b808211156104df57600081556001016104cb565b509056fea265627a7a72305820090c9c9b4ed5653d047989914175968050b6c5ea8bed44a05721df9d79292b0964736f6c63430005090032";

  public static final String FUNC__REMOVE = "_remove";

  public static final String FUNC_WHITELIST = "whitelist";

  public static final String FUNC__ADDALL = "_addAll";

  public static final String FUNC__EXISTS = "_exists";

  public static final String FUNC__ADD = "_add";

  public static final String FUNC__SIZE = "_size";

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
  protected ExposedAccountRulesList(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  protected ExposedAccountRulesList(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }

  @Deprecated
  protected ExposedAccountRulesList(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  protected ExposedAccountRulesList(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public RemoteFunctionCall<TransactionReceipt> _remove(String _account) {
    final Function function =
        new Function(
            FUNC__REMOVE,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _account)),
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

  public RemoteFunctionCall<TransactionReceipt> _addAll(List<String> accounts) {
    final Function function =
        new Function(
            FUNC__ADDALL,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                    org.web3j.abi.datatypes.Address.class,
                    org.web3j.abi.Utils.typeMap(accounts, org.web3j.abi.datatypes.Address.class))),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<Boolean> _exists(String _account) {
    final Function function =
        new Function(
            FUNC__EXISTS,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _account)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    return executeRemoteCallSingleValueReturn(function, Boolean.class);
  }

  public RemoteFunctionCall<TransactionReceipt> _add(String _account) {
    final Function function =
        new Function(
            FUNC__ADD,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _account)),
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
  public static ExposedAccountRulesList load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new ExposedAccountRulesList(contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  @Deprecated
  public static ExposedAccountRulesList load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new ExposedAccountRulesList(
        contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  public static ExposedAccountRulesList load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    return new ExposedAccountRulesList(contractAddress, web3j, credentials, contractGasProvider);
  }

  public static ExposedAccountRulesList load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    return new ExposedAccountRulesList(
        contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public static RemoteCall<ExposedAccountRulesList> deploy(
      Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        ExposedAccountRulesList.class, web3j, credentials, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<ExposedAccountRulesList> deploy(
      Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
    return deployRemoteCall(
        ExposedAccountRulesList.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
  }

  public static RemoteCall<ExposedAccountRulesList> deploy(
      Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        ExposedAccountRulesList.class, web3j, transactionManager, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<ExposedAccountRulesList> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return deployRemoteCall(
        ExposedAccountRulesList.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
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
