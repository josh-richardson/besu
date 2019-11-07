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
public class Admin extends Contract {
  private static final String BINARY =
      "608060405234801561001057600080fd5b50610023336001600160e01b0361002916565b506100ae565b6001600160a01b0381166000908152600160205260408120546100a557506000805460018082018084557f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56390920180546001600160a01b0319166001600160a01b038616908117909155835260208190526040909220556100a9565b5060005b919050565b610b99806100bd6000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c80631785f53c1461006757806331ae450b146100a157806370480275146100f95780637ebd1b301461011f5780639c54df6414610158578063fe9fbb80146101fb575b600080fd5b61008d6004803603602081101561007d57600080fd5b50356001600160a01b0316610221565b604080519115158252519081900360200190f35b6100a9610318565b60408051602080825283518183015283519192839290830191858101910280838360005b838110156100e55781810151838201526020016100cd565b505050509050019250505060405180910390f35b61008d6004803603602081101561010f57600080fd5b50356001600160a01b031661037b565b61013c6004803603602081101561013557600080fd5b5035610586565b604080516001600160a01b039092168252519081900360200190f35b61008d6004803603602081101561016e57600080fd5b81019060208101813564010000000081111561018957600080fd5b82018360208201111561019b57600080fd5b803590602001918460208302840111640100000000831117156101bd57600080fd5b9190808060200260200160405190810160405280939291908181526020018383602002808284376000920191909152509295506105ad945050505050565b61008d6004803603602081101561021157600080fd5b50356001600160a01b0316610610565b600061022c33610610565b610275576040805162461bcd60e51b815260206004820152601560248201527414d95b99195c881b9bdd08185d5d1a1bdc9a5e9959605a1b604482015290519081900360640190fd5b81336001600160a01b03821614156102be5760405162461bcd60e51b8152600401808060200182810382526033815260200180610ae66033913960400191505060405180910390fd5b60006102c98461061b565b6040805182151581526001600160a01b038716602082015281519293507ffbc33d7f56a96d61d4abddfc7042046c18a827519bf20efea2aae15bf15ba9c4929081900390910190a19392505050565b6060600080548060200260200160405190810160405280929190818152602001828054801561037057602002820191906000526020600020905b81546001600160a01b03168152600190910190602001808311610352575b505050505090505b90565b600061038633610610565b6103cf576040805162461bcd60e51b815260206004820152601560248201527414d95b99195c881b9bdd08185d5d1a1bdc9a5e9959605a1b604482015290519081900360640190fd5b336001600160a01b038316141561044857600080516020610b198339815191526000836040518083151515158152602001826001600160a01b03166001600160a01b03168152602001806020018281038252602c815260200180610b39602c9139604001935050505060405180910390a1506000610581565b60006104538361070f565b9050606081610497576040518060400160405280601b81526020017f4163636f756e7420697320616c726561647920616e2041646d696e00000000008152506104ce565b6040518060400160405280602081526020017f41646d696e206163636f756e74206164646564207375636365737366756c6c798152505b9050600080516020610b198339815191528285836040518084151515158152602001836001600160a01b03166001600160a01b0316815260200180602001828103825283818151815260200191508051906020019080838360005b83811015610541578181015183820152602001610529565b50505050905090810190601f16801561056e5780820380516001836020036101000a031916815260200191505b5094505050505060405180910390a15090505b919050565b6000818154811061059357fe5b6000918252602090912001546001600160a01b0316905081565b60006105b833610610565b610601576040805162461bcd60e51b815260206004820152601560248201527414d95b99195c881b9bdd08185d5d1a1bdc9a5e9959605a1b604482015290519081900360640190fd5b61060a82610793565b92915050565b600061060a82610a81565b6001600160a01b038116600090815260016020526040812054801580159061064557506000548111155b156107065760005481146106cd57600080548190600019810190811061066757fe5b600091825260208220015481546001600160a01b039091169250829190600019850190811061069257fe5b600091825260208083209190910180546001600160a01b0319166001600160a01b039485161790559290911681526001909152604090208190555b6000805460001901906106e09082610a9e565b5050506001600160a01b0381166000908152600160208190526040822091909155610581565b50600092915050565b6001600160a01b03811660009081526001602052604081205461078b57506000805460018082018084557f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56390920180546001600160a01b0319166001600160a01b03861690811790915583526020819052604090922055610581565b506000919050565b60006001815b8351811015610a7a578381815181106107ae57fe5b60200260200101516001600160a01b0316336001600160a01b0316141561085457600080516020610b1983398151915260008583815181106107ec57fe5b60200260200101516040518083151515158152602001826001600160a01b03166001600160a01b03168152602001806020018281038252602c815260200180610b39602c9139604001935050505060405180910390a181801561084d575060005b9150610a72565b61087084828151811061086357fe5b6020026020010151610a81565b1561090857600080516020610b19833981519152600085838151811061089257fe5b6020908102919091018101516040805193151584526001600160a01b03909116918301919091526060828201819052601b908301527f4163636f756e7420697320616c726561647920616e2041646d696e00000000006080830152519081900360a00190a181801561084d575060009150610a72565b600061092685838151811061091957fe5b602002602001015161070f565b905060608161096a576040518060400160405280601b81526020017f4163636f756e7420697320616c726561647920616e2041646d696e00000000008152506109a1565b6040518060400160405280602081526020017f41646d696e206163636f756e74206164646564207375636365737366756c6c798152505b9050600080516020610b19833981519152828785815181106109bf57fe5b6020026020010151836040518084151515158152602001836001600160a01b03166001600160a01b0316815260200180602001828103825283818151815260200191508051906020019080838360005b83811015610a27578181015183820152602001610a0f565b50505050905090810190601f168015610a545780820380516001836020036101000a031916815260200191505b5094505050505060405180910390a1838015610a6d5750815b935050505b600101610799565b5092915050565b6001600160a01b0316600090815260016020526040902054151590565b815481835581811115610ac257600083815260209020610ac2918101908301610ac7565b505050565b61037891905b80821115610ae15760008155600101610acd565b509056fe43616e6e6e6f7420696e766f6b65206d6574686f642077697468206f776e206163636f756e7420617320706172616d657465727de09b89cd6310ad2dbbef9b99bee3df114399d19b156a3dc6afb8f5ff60781a416464696e67206f776e206163636f756e742061732041646d696e206973206e6f74207065726d6974746564a265627a7a72305820495aa3732ec5e2daebbefd36ddef157c206d8bf911b7dbfc630673569cfa286a64736f6c63430005090032";

  public static final String FUNC_REMOVEADMIN = "removeAdmin";

  public static final String FUNC_GETADMINS = "getAdmins";

  public static final String FUNC_ADDADMIN = "addAdmin";

  public static final String FUNC_WHITELIST = "whitelist";

  public static final String FUNC_ADDADMINS = "addAdmins";

  public static final String FUNC_ISAUTHORIZED = "isAuthorized";

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
  protected Admin(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  protected Admin(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }

  @Deprecated
  protected Admin(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  protected Admin(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public RemoteFunctionCall<TransactionReceipt> removeAdmin(String _address) {
    final Function function =
        new Function(
            FUNC_REMOVEADMIN,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _address)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<List> getAdmins() {
    final Function function =
        new Function(
            FUNC_GETADMINS,
            Arrays.<Type>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
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

  public RemoteFunctionCall<TransactionReceipt> addAdmin(String _address) {
    final Function function =
        new Function(
            FUNC_ADDADMIN,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _address)),
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

  public RemoteFunctionCall<TransactionReceipt> addAdmins(List<String> accounts) {
    final Function function =
        new Function(
            FUNC_ADDADMINS,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                    org.web3j.abi.datatypes.Address.class,
                    org.web3j.abi.Utils.typeMap(accounts, org.web3j.abi.datatypes.Address.class))),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<Boolean> isAuthorized(String _address) {
    final Function function =
        new Function(
            FUNC_ISAUTHORIZED,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _address)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    return executeRemoteCallSingleValueReturn(function, Boolean.class);
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
  public static Admin load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new Admin(contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  @Deprecated
  public static Admin load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new Admin(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  public static Admin load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    return new Admin(contractAddress, web3j, credentials, contractGasProvider);
  }

  public static Admin load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    return new Admin(contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public static RemoteCall<Admin> deploy(
      Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(Admin.class, web3j, credentials, contractGasProvider, BINARY, "");
  }

  public static RemoteCall<Admin> deploy(
      Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        Admin.class, web3j, transactionManager, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<Admin> deploy(
      Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
    return deployRemoteCall(Admin.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<Admin> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return deployRemoteCall(Admin.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
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
