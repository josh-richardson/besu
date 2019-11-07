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
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes16;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint16;
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
import org.web3j.tuples.generated.Tuple4;
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
public class NodeRules extends Contract {
  private static final String BINARY =
      "60806040526002805460ff19169055620f424060035534801561002157600080fd5b506040516113533803806113538339818101604052602081101561004457600080fd5b5051600480546001600160a01b0319166001600160a01b039092169190911790556112df806100746000396000f3fe608060405234801561001057600080fd5b50600436106100b45760003560e01c80638aa10435116100715780638aa104351461022c578063aab2f5eb14610234578063cc3a1c4114610271578063d8cec92514610292578063dc2a60f61461029a578063de8fa431146102a2576100b4565b80630c6e35d5146100b9578063296453cd146100d55780632d883a73146101125780633600f60d146101625780633620b1df1461019f5780637ebd1b301461020f575b600080fd5b6100c16102aa565b604080519115158252519081900360200190f35b6100c1600480360360808110156100eb57600080fd5b5080359060208101359060408101356001600160801b031916906060013561ffff166104f6565b61012f6004803603602081101561012857600080fd5b503561050f565b6040805194855260208501939093526001600160801b03199091168383015261ffff166060830152519081900360800190f35b6100c16004803603608081101561017857600080fd5b5080359060208101359060408101356001600160801b031916906060013561ffff166105ad565b6101fd60048036036101008110156101b657600080fd5b508035906020810135906001600160801b0319604082013581169161ffff606082013581169260808301359260a08101359260c08201359092169160e0909101351661085a565b60408051918252519081900360200190f35b61012f6004803603602081101561022557600080fd5b503561089f565b6101fd6108e0565b6100c16004803603608081101561024a57600080fd5b5080359060208101359060408101356001600160801b031916906060013561ffff166108e7565b6102906004803603602081101561028757600080fd5b50351515610b94565b005b6100c1610bfe565b6100c1610e51565b6101fd610e5a565b6004805460408051631e7c27cb60e01b8152905160009384936001600160a01b031692630d2020dd928492631e7c27cb92808201926020929091829003018186803b1580156102f857600080fd5b505afa15801561030c573d6000803e3d6000fd5b505050506040513d602081101561032257600080fd5b5051604080516001600160e01b031960e085901b1681526004810192909252516024808301926020929190829003018186803b15801561036157600080fd5b505afa158015610375573d6000803e3d6000fd5b505050506040513d602081101561038b57600080fd5b505190506001600160a01b0381166103d45760405162461bcd60e51b81526004018080602001828103825260348152602001806112776034913960400191505060405180910390fd5b604080516301fd3f7760e71b815233600482015290516001600160a01b0383169163fe9fbb80916024808301926020929190829003018186803b15801561041a57600080fd5b505afa15801561042e573d6000803e3d6000fd5b505050506040513d602081101561044457600080fd5b505161048f576040805162461bcd60e51b815260206004820152601560248201527414d95b99195c881b9bdd08185d5d1a1bdc9a5e9959605a1b604482015290519081900360640190fd5b60025460ff1615156001146104e3576040805162461bcd60e51b81526020600482015260156024820152744e6f7420696e2072656164206f6e6c79206d6f646560581b604482015290519081900360640190fd5b6002805460ff19169055600191505b5090565b600061050485858585610e69565b90505b949350505050565b600080808061051c610e98565b8510156105a65761052b6111b6565b6000868154811061053857fe5b60009182526020918290206040805160808082018352600394909402909201805480845260018201549584018690526002909101549384901b6001600160801b031916918301829052600160801b90930461ffff166060909201829052919750919550935091506105a69050565b9193509193565b6004805460408051631e7c27cb60e01b8152905160009384936001600160a01b031692630d2020dd928492631e7c27cb92808201926020929091829003018186803b1580156105fb57600080fd5b505afa15801561060f573d6000803e3d6000fd5b505050506040513d602081101561062557600080fd5b5051604080516001600160e01b031960e085901b1681526004810192909252516024808301926020929190829003018186803b15801561066457600080fd5b505afa158015610678573d6000803e3d6000fd5b505050506040513d602081101561068e57600080fd5b505190506001600160a01b0381166106d75760405162461bcd60e51b81526004018080602001828103825260348152602001806112776034913960400191505060405180910390fd5b604080516301fd3f7760e71b815233600482015290516001600160a01b0383169163fe9fbb80916024808301926020929190829003018186803b15801561071d57600080fd5b505afa158015610731573d6000803e3d6000fd5b505050506040513d602081101561074757600080fd5b5051610792576040805162461bcd60e51b815260206004820152601560248201527414d95b99195c881b9bdd08185d5d1a1bdc9a5e9959605a1b604482015290519081900360640190fd5b60025460ff16156107d45760405162461bcd60e51b815260040180806020018281038252602b81526020018061124c602b913960400191505060405180910390fd5b60006107e287878787610e9e565b905080156107f4576107f46000610b94565b604080518215158152602081018990528082018890526001600160801b03198716606082015261ffff8616608082015290517f983a527ad2402ad85d7f70bcae14ec1567e0b0d2e06a6f72ffbcabfe3e8863ea9181900360a00190a19695505050505050565b6000610868898989896104f6565b801561087b575061087b858585856104f6565b156108895750600019610893565b506001600160ff1b035b98975050505050505050565b600081815481106108ac57fe5b6000918252602090912060039091020180546001820154600290920154909250608081901b90600160801b900461ffff1684565b6003545b90565b6004805460408051631e7c27cb60e01b8152905160009384936001600160a01b031692630d2020dd928492631e7c27cb92808201926020929091829003018186803b15801561093557600080fd5b505afa158015610949573d6000803e3d6000fd5b505050506040513d602081101561095f57600080fd5b5051604080516001600160e01b031960e085901b1681526004810192909252516024808301926020929190829003018186803b15801561099e57600080fd5b505afa1580156109b2573d6000803e3d6000fd5b505050506040513d60208110156109c857600080fd5b505190506001600160a01b038116610a115760405162461bcd60e51b81526004018080602001828103825260348152602001806112776034913960400191505060405180910390fd5b604080516301fd3f7760e71b815233600482015290516001600160a01b0383169163fe9fbb80916024808301926020929190829003018186803b158015610a5757600080fd5b505afa158015610a6b573d6000803e3d6000fd5b505050506040513d6020811015610a8157600080fd5b5051610acc576040805162461bcd60e51b815260206004820152601560248201527414d95b99195c881b9bdd08185d5d1a1bdc9a5e9959605a1b604482015290519081900360640190fd5b60025460ff1615610b0e5760405162461bcd60e51b815260040180806020018281038252602b81526020018061124c602b913960400191505060405180910390fd5b6000610b1c87878787610fc5565b90508015610b2e57610b2e6001610b94565b604080518215158152602081018990528082018890526001600160801b03198716606082015261ffff8616608082015290517ff05dee0659735cf956ff02ae9f4bd9f1c41bb30ea20d7a1a3869a42c7254ca459181900360a00190a19695505050505050565b6004805460408051631370ffbf60e21b815284151593810193909352516001600160a01b0390911691634dc3fefc91602480830192600092919082900301818387803b158015610be357600080fd5b505af1158015610bf7573d6000803e3d6000fd5b5050505050565b6004805460408051631e7c27cb60e01b8152905160009384936001600160a01b031692630d2020dd928492631e7c27cb92808201926020929091829003018186803b158015610c4c57600080fd5b505afa158015610c60573d6000803e3d6000fd5b505050506040513d6020811015610c7657600080fd5b5051604080516001600160e01b031960e085901b1681526004810192909252516024808301926020929190829003018186803b158015610cb557600080fd5b505afa158015610cc9573d6000803e3d6000fd5b505050506040513d6020811015610cdf57600080fd5b505190506001600160a01b038116610d285760405162461bcd60e51b81526004018080602001828103825260348152602001806112776034913960400191505060405180910390fd5b604080516301fd3f7760e71b815233600482015290516001600160a01b0383169163fe9fbb80916024808301926020929190829003018186803b158015610d6e57600080fd5b505afa158015610d82573d6000803e3d6000fd5b505050506040513d6020811015610d9857600080fd5b5051610de3576040805162461bcd60e51b815260206004820152601560248201527414d95b99195c881b9bdd08185d5d1a1bdc9a5e9959605a1b604482015290519081900360640190fd5b60025460ff1615610e3b576040805162461bcd60e51b815260206004820152601960248201527f416c726561647920696e2072656164206f6e6c79206d6f646500000000000000604482015290519081900360640190fd5b6002805460ff1916600190811790915591505090565b60025460ff1690565b6000610e64610e98565b905090565b600060016000610e7b87878787611165565b815260200190815260200160002054600014159050949350505050565b60005490565b600080610ead86868686611165565b600081815260016020526040902054909150610fb957604080516080808201835288825260208083018981526001600160801b031989811685870190815261ffff8a8116606088019081526000805460018082018084558380529a517f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56360039093029283015596517f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56482015593517f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56590940180549251929095169390971c9290921761ffff60801b1916600160801b929091169190910217905594825284905291909120559050610507565b50600095945050505050565b600080610fd486868686611165565b6000818152600160205260409020549091508015801590610ff757506000548111155b156111585760005481146111285761100d6111b6565b60008054600019810190811061101f57fe5b600091825260208083206040805160808082018352600395909502909201805483526001810154938301939093526002909201549283901b6001600160801b03191691810191909152600160801b90910461ffff1660608201528154909250829190600019850190811061108f57fe5b600091825260208083208451600390930201918255838101516001808401919091556040808601516002909401805460609788015161ffff16600160801b0261ffff60801b1960809790971c6001600160801b03199092169190911795909516949094179093558551918601519286015194860151879591949361111593929091611165565b8152602081019190915260400160002055505b60008054600019019061113b90826111dd565b505060009081526001602081905260408220919091559050610507565b5060009695505050505050565b60408051602080820196909652808201949094526001600160801b031992909216606084015260f01b6001600160f01b03191660708301528051808303605201815260729092019052805191012090565b60408051608081018252600080825260208201819052918101829052606081019190915290565b81548183558181111561120957600302816003028360005260206000209182019101611209919061120e565b505050565b6108e491905b808211156104f2576000808255600182015560028101805471ffffffffffffffffffffffffffffffffffff1916905560030161121456fe496e2072656164206f6e6c79206d6f64653a2072756c65732063616e6e6f74206265206d6f646966696564496e677265737320636f6e7472616374206d75737420686176652041646d696e20636f6e74726163742072656769737465726564a265627a7a72305820a03bf261a90879667b8e21e9015a78a9de47b6b3d50df5f7a58affa42d215d2364736f6c63430005090032";

  public static final String FUNC_EXITREADONLY = "exitReadOnly";

  public static final String FUNC_ENODEINWHITELIST = "enodeInWhitelist";

  public static final String FUNC_GETBYINDEX = "getByIndex";

  public static final String FUNC_ADDENODE = "addEnode";

  public static final String FUNC_CONNECTIONALLOWED = "connectionAllowed";

  public static final String FUNC_WHITELIST = "whitelist";

  public static final String FUNC_GETCONTRACTVERSION = "getContractVersion";

  public static final String FUNC_REMOVEENODE = "removeEnode";

  public static final String FUNC_TRIGGERRULESCHANGEEVENT = "triggerRulesChangeEvent";

  public static final String FUNC_ENTERREADONLY = "enterReadOnly";

  public static final String FUNC_ISREADONLY = "isReadOnly";

  public static final String FUNC_GETSIZE = "getSize";

  public static final Event NODEADDED_EVENT =
      new Event(
          "NodeAdded",
          Arrays.<TypeReference<?>>asList(
              new TypeReference<Bool>() {},
              new TypeReference<Bytes32>() {},
              new TypeReference<Bytes32>() {},
              new TypeReference<Bytes16>() {},
              new TypeReference<Uint16>() {}));;

  public static final Event NODEREMOVED_EVENT =
      new Event(
          "NodeRemoved",
          Arrays.<TypeReference<?>>asList(
              new TypeReference<Bool>() {},
              new TypeReference<Bytes32>() {},
              new TypeReference<Bytes32>() {},
              new TypeReference<Bytes16>() {},
              new TypeReference<Uint16>() {}));;

  @Deprecated
  protected NodeRules(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  protected NodeRules(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }

  @Deprecated
  protected NodeRules(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  protected NodeRules(
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

  public RemoteFunctionCall<Boolean> enodeInWhitelist(
      byte[] enodeHigh, byte[] enodeLow, byte[] ip, BigInteger port) {
    final Function function =
        new Function(
            FUNC_ENODEINWHITELIST,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.generated.Bytes32(enodeHigh),
                new org.web3j.abi.datatypes.generated.Bytes32(enodeLow),
                new org.web3j.abi.datatypes.generated.Bytes16(ip),
                new org.web3j.abi.datatypes.generated.Uint16(port)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    return executeRemoteCallSingleValueReturn(function, Boolean.class);
  }

  public RemoteFunctionCall<Tuple4<byte[], byte[], byte[], BigInteger>> getByIndex(
      BigInteger index) {
    final Function function =
        new Function(
            FUNC_GETBYINDEX,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(index)),
            Arrays.<TypeReference<?>>asList(
                new TypeReference<Bytes32>() {},
                new TypeReference<Bytes32>() {},
                new TypeReference<Bytes16>() {},
                new TypeReference<Uint16>() {}));
    return new RemoteFunctionCall<Tuple4<byte[], byte[], byte[], BigInteger>>(
        function,
        new Callable<Tuple4<byte[], byte[], byte[], BigInteger>>() {
          @Override
          public Tuple4<byte[], byte[], byte[], BigInteger> call() throws Exception {
            List<Type> results = executeCallMultipleValueReturn(function);
            return new Tuple4<byte[], byte[], byte[], BigInteger>(
                (byte[]) results.get(0).getValue(),
                (byte[]) results.get(1).getValue(),
                (byte[]) results.get(2).getValue(),
                (BigInteger) results.get(3).getValue());
          }
        });
  }

  public RemoteFunctionCall<TransactionReceipt> addEnode(
      byte[] enodeHigh, byte[] enodeLow, byte[] ip, BigInteger port) {
    final Function function =
        new Function(
            FUNC_ADDENODE,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.generated.Bytes32(enodeHigh),
                new org.web3j.abi.datatypes.generated.Bytes32(enodeLow),
                new org.web3j.abi.datatypes.generated.Bytes16(ip),
                new org.web3j.abi.datatypes.generated.Uint16(port)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
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

  public RemoteFunctionCall<Tuple4<byte[], byte[], byte[], BigInteger>> whitelist(
      BigInteger param0) {
    final Function function =
        new Function(
            FUNC_WHITELIST,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)),
            Arrays.<TypeReference<?>>asList(
                new TypeReference<Bytes32>() {},
                new TypeReference<Bytes32>() {},
                new TypeReference<Bytes16>() {},
                new TypeReference<Uint16>() {}));
    return new RemoteFunctionCall<Tuple4<byte[], byte[], byte[], BigInteger>>(
        function,
        new Callable<Tuple4<byte[], byte[], byte[], BigInteger>>() {
          @Override
          public Tuple4<byte[], byte[], byte[], BigInteger> call() throws Exception {
            List<Type> results = executeCallMultipleValueReturn(function);
            return new Tuple4<byte[], byte[], byte[], BigInteger>(
                (byte[]) results.get(0).getValue(),
                (byte[]) results.get(1).getValue(),
                (byte[]) results.get(2).getValue(),
                (BigInteger) results.get(3).getValue());
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

  public RemoteFunctionCall<TransactionReceipt> removeEnode(
      byte[] enodeHigh, byte[] enodeLow, byte[] ip, BigInteger port) {
    final Function function =
        new Function(
            FUNC_REMOVEENODE,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.generated.Bytes32(enodeHigh),
                new org.web3j.abi.datatypes.generated.Bytes32(enodeLow),
                new org.web3j.abi.datatypes.generated.Bytes16(ip),
                new org.web3j.abi.datatypes.generated.Uint16(port)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<TransactionReceipt> triggerRulesChangeEvent(Boolean addsRestrictions) {
    final Function function =
        new Function(
            FUNC_TRIGGERRULESCHANGEEVENT,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Bool(addsRestrictions)),
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

  public List<NodeAddedEventResponse> getNodeAddedEvents(TransactionReceipt transactionReceipt) {
    List<Contract.EventValuesWithLog> valueList =
        extractEventParametersWithLog(NODEADDED_EVENT, transactionReceipt);
    ArrayList<NodeAddedEventResponse> responses =
        new ArrayList<NodeAddedEventResponse>(valueList.size());
    for (Contract.EventValuesWithLog eventValues : valueList) {
      NodeAddedEventResponse typedResponse = new NodeAddedEventResponse();
      typedResponse.log = eventValues.getLog();
      typedResponse.nodeAdded = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
      typedResponse.enodeHigh = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
      typedResponse.enodeLow = (byte[]) eventValues.getNonIndexedValues().get(2).getValue();
      typedResponse.enodeIp = (byte[]) eventValues.getNonIndexedValues().get(3).getValue();
      typedResponse.enodePort = (BigInteger) eventValues.getNonIndexedValues().get(4).getValue();
      responses.add(typedResponse);
    }
    return responses;
  }

  public Flowable<NodeAddedEventResponse> nodeAddedEventFlowable(EthFilter filter) {
    return web3j
        .ethLogFlowable(filter)
        .map(
            new io.reactivex.functions.Function<Log, NodeAddedEventResponse>() {
              @Override
              public NodeAddedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues =
                    extractEventParametersWithLog(NODEADDED_EVENT, log);
                NodeAddedEventResponse typedResponse = new NodeAddedEventResponse();
                typedResponse.log = log;
                typedResponse.nodeAdded =
                    (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.enodeHigh =
                    (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.enodeLow =
                    (byte[]) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.enodeIp =
                    (byte[]) eventValues.getNonIndexedValues().get(3).getValue();
                typedResponse.enodePort =
                    (BigInteger) eventValues.getNonIndexedValues().get(4).getValue();
                return typedResponse;
              }
            });
  }

  public Flowable<NodeAddedEventResponse> nodeAddedEventFlowable(
      DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
    EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
    filter.addSingleTopic(EventEncoder.encode(NODEADDED_EVENT));
    return nodeAddedEventFlowable(filter);
  }

  public List<NodeRemovedEventResponse> getNodeRemovedEvents(
      TransactionReceipt transactionReceipt) {
    List<Contract.EventValuesWithLog> valueList =
        extractEventParametersWithLog(NODEREMOVED_EVENT, transactionReceipt);
    ArrayList<NodeRemovedEventResponse> responses =
        new ArrayList<NodeRemovedEventResponse>(valueList.size());
    for (Contract.EventValuesWithLog eventValues : valueList) {
      NodeRemovedEventResponse typedResponse = new NodeRemovedEventResponse();
      typedResponse.log = eventValues.getLog();
      typedResponse.nodeRemoved = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
      typedResponse.enodeHigh = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
      typedResponse.enodeLow = (byte[]) eventValues.getNonIndexedValues().get(2).getValue();
      typedResponse.enodeIp = (byte[]) eventValues.getNonIndexedValues().get(3).getValue();
      typedResponse.enodePort = (BigInteger) eventValues.getNonIndexedValues().get(4).getValue();
      responses.add(typedResponse);
    }
    return responses;
  }

  public Flowable<NodeRemovedEventResponse> nodeRemovedEventFlowable(EthFilter filter) {
    return web3j
        .ethLogFlowable(filter)
        .map(
            new io.reactivex.functions.Function<Log, NodeRemovedEventResponse>() {
              @Override
              public NodeRemovedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues =
                    extractEventParametersWithLog(NODEREMOVED_EVENT, log);
                NodeRemovedEventResponse typedResponse = new NodeRemovedEventResponse();
                typedResponse.log = log;
                typedResponse.nodeRemoved =
                    (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.enodeHigh =
                    (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.enodeLow =
                    (byte[]) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.enodeIp =
                    (byte[]) eventValues.getNonIndexedValues().get(3).getValue();
                typedResponse.enodePort =
                    (BigInteger) eventValues.getNonIndexedValues().get(4).getValue();
                return typedResponse;
              }
            });
  }

  public Flowable<NodeRemovedEventResponse> nodeRemovedEventFlowable(
      DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
    EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
    filter.addSingleTopic(EventEncoder.encode(NODEREMOVED_EVENT));
    return nodeRemovedEventFlowable(filter);
  }

  @Deprecated
  public static NodeRules load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new NodeRules(contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  @Deprecated
  public static NodeRules load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new NodeRules(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  public static NodeRules load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    return new NodeRules(contractAddress, web3j, credentials, contractGasProvider);
  }

  public static NodeRules load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    return new NodeRules(contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public static RemoteCall<NodeRules> deploy(
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider,
      String _nodeIngressAddress) {
    String encodedConstructor =
        FunctionEncoder.encodeConstructor(
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _nodeIngressAddress)));
    return deployRemoteCall(
        NodeRules.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
  }

  public static RemoteCall<NodeRules> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider,
      String _nodeIngressAddress) {
    String encodedConstructor =
        FunctionEncoder.encodeConstructor(
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _nodeIngressAddress)));
    return deployRemoteCall(
        NodeRules.class,
        web3j,
        transactionManager,
        contractGasProvider,
        BINARY,
        encodedConstructor);
  }

  @Deprecated
  public static RemoteCall<NodeRules> deploy(
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit,
      String _nodeIngressAddress) {
    String encodedConstructor =
        FunctionEncoder.encodeConstructor(
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _nodeIngressAddress)));
    return deployRemoteCall(
        NodeRules.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
  }

  @Deprecated
  public static RemoteCall<NodeRules> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit,
      String _nodeIngressAddress) {
    String encodedConstructor =
        FunctionEncoder.encodeConstructor(
            Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _nodeIngressAddress)));
    return deployRemoteCall(
        NodeRules.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
  }

  public static class NodeAddedEventResponse extends BaseEventResponse {
    public Boolean nodeAdded;

    public byte[] enodeHigh;

    public byte[] enodeLow;

    public byte[] enodeIp;

    public BigInteger enodePort;
  }

  public static class NodeRemovedEventResponse extends BaseEventResponse {
    public Boolean nodeRemoved;

    public byte[] enodeHigh;

    public byte[] enodeLow;

    public byte[] enodeIp;

    public BigInteger enodePort;
  }
}
