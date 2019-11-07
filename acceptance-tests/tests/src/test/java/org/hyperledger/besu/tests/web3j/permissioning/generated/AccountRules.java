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
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicArray;
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
public class AccountRules extends Contract {
  private static final String BINARY =
      "60806040526002805460ff19169055620f424060035534801561002157600080fd5b506040516114813803806114818339818101604052602081101561004457600080fd5b5051600480546001600160a01b0319166001600160a01b03831617905561006a33610071565b50506100f6565b6001600160a01b0381166000908152600160205260408120546100ed57506000805460018082018084557f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56390920180546001600160a01b0319166001600160a01b038616908117909155835260208190526040909220556100f1565b5060005b919050565b61137c806101056000396000f3fe608060405234801561001057600080fd5b50600436106100cf5760003560e01c8063ac71abde1161008c578063d8cec92511610066578063d8cec92514610379578063dc2a60f614610381578063de8fa43114610389578063e89b0e1e14610391576100cf565b8063ac71abde1461028a578063b5a68b921461032d578063c4740a9514610353576100cf565b80630c6e35d5146100d45780632d883a73146100f05780637ebd1b30146101295780638a48ac03146101465780638aa104351461019e578063936421d5146101b8575b600080fd5b6100dc6103b7565b604080519115158252519081900360200190f35b61010d6004803603602081101561010657600080fd5b5035610603565b604080516001600160a01b039092168252519081900360200190f35b61010d6004803603602081101561013f57600080fd5b503561062e565b61014e610655565b60408051602080825283518183015283519192839290830191858101910280838360005b8381101561018a578181015183820152602001610172565b505050509050019250505060405180910390f35b6101a66106b8565b60408051918252519081900360200190f35b6100dc600480360360c08110156101ce57600080fd5b6001600160a01b0382358116926020810135909116916040820135916060810135916080820135919081019060c0810160a082013564010000000081111561021557600080fd5b82018360208201111561022757600080fd5b8035906020019184600183028401116401000000008311171561024957600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295506106be945050505050565b6100dc600480360360208110156102a057600080fd5b8101906020810181356401000000008111156102bb57600080fd5b8201836020820111156102cd57600080fd5b803590602001918460208302840111640100000000831117156102ef57600080fd5b9190808060200260200160405190810160405280939291908181526020018383602002808284376000920191909152509295506106e4945050505050565b6100dc6004803603602081101561034357600080fd5b50356001600160a01b03166108d9565b6100dc6004803603602081101561036957600080fd5b50356001600160a01b03166108ea565b6100dc610b6b565b6100dc610dbe565b6101a6610dc7565b6100dc600480360360208110156103a757600080fd5b50356001600160a01b0316610dd6565b6004805460408051631e7c27cb60e01b8152905160009384936001600160a01b031692630d2020dd928492631e7c27cb92808201926020929091829003018186803b15801561040557600080fd5b505afa158015610419573d6000803e3d6000fd5b505050506040513d602081101561042f57600080fd5b5051604080516001600160e01b031960e085901b1681526004810192909252516024808301926020929190829003018186803b15801561046e57600080fd5b505afa158015610482573d6000803e3d6000fd5b505050506040513d602081101561049857600080fd5b505190506001600160a01b0381166104e15760405162461bcd60e51b81526004018080602001828103825260348152602001806113146034913960400191505060405180910390fd5b604080516301fd3f7760e71b815233600482015290516001600160a01b0383169163fe9fbb80916024808301926020929190829003018186803b15801561052757600080fd5b505afa15801561053b573d6000803e3d6000fd5b505050506040513d602081101561055157600080fd5b505161059c576040805162461bcd60e51b815260206004820152601560248201527414d95b99195c881b9bdd08185d5d1a1bdc9a5e9959605a1b604482015290519081900360640190fd5b60025460ff1615156001146105f0576040805162461bcd60e51b81526020600482015260156024820152744e6f7420696e2072656164206f6e6c79206d6f646560581b604482015290519081900360640190fd5b6002805460ff19169055600191505b5090565b600080828154811061061157fe5b6000918252602090912001546001600160a01b031690505b919050565b6000818154811061063b57fe5b6000918252602090912001546001600160a01b0316905081565b606060008054806020026020016040519081016040528092919081815260200182805480156106ad57602002820191906000526020600020905b81546001600160a01b0316815260019091019060200180831161068f575b505050505090505b90565b60035490565b60006106c9876108d9565b156106d6575060016106da565b5060005b9695505050505050565b6004805460408051631e7c27cb60e01b8152905160009384936001600160a01b031692630d2020dd928492631e7c27cb92808201926020929091829003018186803b15801561073257600080fd5b505afa158015610746573d6000803e3d6000fd5b505050506040513d602081101561075c57600080fd5b5051604080516001600160e01b031960e085901b1681526004810192909252516024808301926020929190829003018186803b15801561079b57600080fd5b505afa1580156107af573d6000803e3d6000fd5b505050506040513d60208110156107c557600080fd5b505190506001600160a01b03811661080e5760405162461bcd60e51b81526004018080602001828103825260348152602001806113146034913960400191505060405180910390fd5b604080516301fd3f7760e71b815233600482015290516001600160a01b0383169163fe9fbb80916024808301926020929190829003018186803b15801561085457600080fd5b505afa158015610868573d6000803e3d6000fd5b505050506040513d602081101561087e57600080fd5b50516108c9576040805162461bcd60e51b815260206004820152601560248201527414d95b99195c881b9bdd08185d5d1a1bdc9a5e9959605a1b604482015290519081900360640190fd5b6108d283611057565b9392505050565b60006108e48261110a565b92915050565b6004805460408051631e7c27cb60e01b8152905160009384936001600160a01b031692630d2020dd928492631e7c27cb92808201926020929091829003018186803b15801561093857600080fd5b505afa15801561094c573d6000803e3d6000fd5b505050506040513d602081101561096257600080fd5b5051604080516001600160e01b031960e085901b1681526004810192909252516024808301926020929190829003018186803b1580156109a157600080fd5b505afa1580156109b5573d6000803e3d6000fd5b505050506040513d60208110156109cb57600080fd5b505190506001600160a01b038116610a145760405162461bcd60e51b81526004018080602001828103825260348152602001806113146034913960400191505060405180910390fd5b604080516301fd3f7760e71b815233600482015290516001600160a01b0383169163fe9fbb80916024808301926020929190829003018186803b158015610a5a57600080fd5b505afa158015610a6e573d6000803e3d6000fd5b505050506040513d6020811015610a8457600080fd5b5051610acf576040805162461bcd60e51b815260206004820152601560248201527414d95b99195c881b9bdd08185d5d1a1bdc9a5e9959605a1b604482015290519081900360640190fd5b60025460ff1615610b115760405162461bcd60e51b815260040180806020018281038252602b8152602001806112e9602b913960400191505060405180910390fd5b6000610b1c84611127565b6040805182151581526001600160a01b038716602082015281519293507ff9cfee605255fa33725274ecbb6100757021c2c1679bb4538c8fad791751a4d9929081900390910190a19392505050565b6004805460408051631e7c27cb60e01b8152905160009384936001600160a01b031692630d2020dd928492631e7c27cb92808201926020929091829003018186803b158015610bb957600080fd5b505afa158015610bcd573d6000803e3d6000fd5b505050506040513d6020811015610be357600080fd5b5051604080516001600160e01b031960e085901b1681526004810192909252516024808301926020929190829003018186803b158015610c2257600080fd5b505afa158015610c36573d6000803e3d6000fd5b505050506040513d6020811015610c4c57600080fd5b505190506001600160a01b038116610c955760405162461bcd60e51b81526004018080602001828103825260348152602001806113146034913960400191505060405180910390fd5b604080516301fd3f7760e71b815233600482015290516001600160a01b0383169163fe9fbb80916024808301926020929190829003018186803b158015610cdb57600080fd5b505afa158015610cef573d6000803e3d6000fd5b505050506040513d6020811015610d0557600080fd5b5051610d50576040805162461bcd60e51b815260206004820152601560248201527414d95b99195c881b9bdd08185d5d1a1bdc9a5e9959605a1b604482015290519081900360640190fd5b60025460ff1615610da8576040805162461bcd60e51b815260206004820152601960248201527f416c726561647920696e2072656164206f6e6c79206d6f646500000000000000604482015290519081900360640190fd5b6002805460ff1916600190811790915591505090565b60025460ff1690565b6000610dd161121b565b905090565b6004805460408051631e7c27cb60e01b8152905160009384936001600160a01b031692630d2020dd928492631e7c27cb92808201926020929091829003018186803b158015610e2457600080fd5b505afa158015610e38573d6000803e3d6000fd5b505050506040513d6020811015610e4e57600080fd5b5051604080516001600160e01b031960e085901b1681526004810192909252516024808301926020929190829003018186803b158015610e8d57600080fd5b505afa158015610ea1573d6000803e3d6000fd5b505050506040513d6020811015610eb757600080fd5b505190506001600160a01b038116610f005760405162461bcd60e51b81526004018080602001828103825260348152602001806113146034913960400191505060405180910390fd5b604080516301fd3f7760e71b815233600482015290516001600160a01b0383169163fe9fbb80916024808301926020929190829003018186803b158015610f4657600080fd5b505afa158015610f5a573d6000803e3d6000fd5b505050506040513d6020811015610f7057600080fd5b5051610fbb576040805162461bcd60e51b815260206004820152601560248201527414d95b99195c881b9bdd08185d5d1a1bdc9a5e9959605a1b604482015290519081900360640190fd5b60025460ff1615610ffd5760405162461bcd60e51b815260040180806020018281038252602b8152602001806112e9602b913960400191505060405180910390fd5b600061100884611221565b6040805182151581526001600160a01b038716602082015281519293507fe39119db1877d19873ffb44540ac1dbd9ca72da5413d351392ce967885031aa4929081900390910190a19392505050565b60006001815b835181101561110357600061108485838151811061107757fe5b6020026020010151611221565b90507fe39119db1877d19873ffb44540ac1dbd9ca72da5413d351392ce967885031aa4818684815181106110b457fe5b60200260200101516040518083151515158152602001826001600160a01b03166001600160a01b031681526020019250505060405180910390a18280156110f85750805b92505060010161105d565b5092915050565b6001600160a01b0316600090815260016020526040902054151590565b6001600160a01b038116600090815260016020526040812054801580159061115157506000548111155b156112125760005481146111d957600080548190600019810190811061117357fe5b600091825260208220015481546001600160a01b039091169250829190600019850190811061119e57fe5b600091825260208083209190910180546001600160a01b0319166001600160a01b039485161790559290911681526001909152604090208190555b6000805460001901906111ec90826112a5565b5050506001600160a01b0381166000908152600160208190526040822091909155610629565b50600092915050565b60005490565b6001600160a01b03811660009081526001602052604081205461129d57506000805460018082018084557f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56390920180546001600160a01b0319166001600160a01b03861690811790915583526020819052604090922055610629565b506000919050565b8154818355818111156112c9576000838152602090206112c99181019083016112ce565b505050565b6106b591905b808211156105ff57600081556001016112d456fe496e2072656164206f6e6c79206d6f64653a2072756c65732063616e6e6f74206265206d6f646966696564496e677265737320636f6e7472616374206d75737420686176652041646d696e20636f6e74726163742072656769737465726564a265627a7a723058200aeb674b7c122e5e0f5c9b768e3e8bda26267d2def7adf74b2f3e75008dc252a64736f6c63430005090032";

  public static final String FUNC_EXITREADONLY = "exitReadOnly";

  public static final String FUNC_GETBYINDEX = "getByIndex";

  public static final String FUNC_WHITELIST = "whitelist";

  public static final String FUNC_GETACCOUNTS = "getAccounts";

  public static final String FUNC_GETCONTRACTVERSION = "getContractVersion";

  public static final String FUNC_TRANSACTIONALLOWED = "transactionAllowed";

  public static final String FUNC_ADDACCOUNTS = "addAccounts";

  public static final String FUNC_ACCOUNTINWHITELIST = "accountInWhitelist";

  public static final String FUNC_REMOVEACCOUNT = "removeAccount";

  public static final String FUNC_ENTERREADONLY = "enterReadOnly";

  public static final String FUNC_ISREADONLY = "isReadOnly";

  public static final String FUNC_GETSIZE = "getSize";

  public static final String FUNC_ADDACCOUNT = "addAccount";

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
  protected AccountRules(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  protected AccountRules(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }

  @Deprecated
  protected AccountRules(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  protected AccountRules(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public RemoteFunctionCall<TransactionReceipt> exitReadOnly() {
    final Function function =
        new Function(
            FUNC_EXITREADONLY, Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<String> getByIndex(BigInteger index) {
    final Function function =
        new Function(
            FUNC_GETBYINDEX,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(index)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    return executeRemoteCallSingleValueReturn(function, String.class);
  }

  public RemoteFunctionCall<String> whitelist(BigInteger param0) {
    final Function function =
        new Function(
            FUNC_WHITELIST,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    return executeRemoteCallSingleValueReturn(function, String.class);
  }

  public RemoteFunctionCall<List> getAccounts() {
    final Function function =
        new Function(
            FUNC_GETACCOUNTS,
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
      String param1,
      BigInteger param2,
      BigInteger param3,
      BigInteger param4,
      byte[] param5) {
    final Function function =
        new Function(
            FUNC_TRANSACTIONALLOWED,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.Address(160, sender),
                new org.web3j.abi.datatypes.Address(160, param1),
                new org.web3j.abi.datatypes.generated.Uint256(param2),
                new org.web3j.abi.datatypes.generated.Uint256(param3),
                new org.web3j.abi.datatypes.generated.Uint256(param4),
                new org.web3j.abi.datatypes.DynamicBytes(param5)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    return executeRemoteCallSingleValueReturn(function, Boolean.class);
  }

  public RemoteFunctionCall<TransactionReceipt> addAccounts(List<String> accounts) {
    final Function function =
        new Function(
            FUNC_ADDACCOUNTS,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                    org.web3j.abi.datatypes.Address.class,
                    org.web3j.abi.Utils.typeMap(accounts, org.web3j.abi.datatypes.Address.class))),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<Boolean> accountInWhitelist(String _account) {
    final Function function =
        new Function(
            FUNC_ACCOUNTINWHITELIST,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _account)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    return executeRemoteCallSingleValueReturn(function, Boolean.class);
  }

  public RemoteFunctionCall<TransactionReceipt> removeAccount(String account) {
    final Function function =
        new Function(
            FUNC_REMOVEACCOUNT,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, account)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<TransactionReceipt> enterReadOnly() {
    final Function function =
        new Function(
            FUNC_ENTERREADONLY, Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<Boolean> isReadOnly() {
    final Function function =
        new Function(
            FUNC_ISREADONLY,
            Arrays.<Type>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    return executeRemoteCallSingleValueReturn(function, Boolean.class);
  }

  public RemoteFunctionCall<BigInteger> getSize() {
    final Function function =
        new Function(
            FUNC_GETSIZE,
            Arrays.<Type>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    return executeRemoteCallSingleValueReturn(function, BigInteger.class);
  }

  public RemoteFunctionCall<TransactionReceipt> addAccount(String account) {
    final Function function =
        new Function(
            FUNC_ADDACCOUNT,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, account)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
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
  public static AccountRules load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new AccountRules(contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  @Deprecated
  public static AccountRules load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new AccountRules(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  public static AccountRules load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    return new AccountRules(contractAddress, web3j, credentials, contractGasProvider);
  }

  public static AccountRules load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    return new AccountRules(contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public static RemoteCall<AccountRules> deploy(
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider,
      String _ingressContract) {
    String encodedConstructor =
        FunctionEncoder.encodeConstructor(
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _ingressContract)));
    return deployRemoteCall(
        AccountRules.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
  }

  public static RemoteCall<AccountRules> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider,
      String _ingressContract) {

    String encodedConstructor =
        FunctionEncoder.encodeConstructor(
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _ingressContract)));
    return deployRemoteCall(
        AccountRules.class,
        web3j,
        transactionManager,
        contractGasProvider,
        BINARY,
        encodedConstructor);
  }

  @Deprecated
  public static RemoteCall<AccountRules> deploy(
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit,
      String _ingressContract) {
    String encodedConstructor =
        FunctionEncoder.encodeConstructor(
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _ingressContract)));
    return deployRemoteCall(
        AccountRules.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
  }

  @Deprecated
  public static RemoteCall<AccountRules> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit,
      String _ingressContract) {
    String encodedConstructor =
        FunctionEncoder.encodeConstructor(
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _ingressContract)));
    return deployRemoteCall(
        AccountRules.class,
        web3j,
        transactionManager,
        gasPrice,
        gasLimit,
        BINARY,
        encodedConstructor);
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
