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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes16;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint16;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
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
public class ExposedNodeRulesList extends Contract {
  private static final String BINARY =
      "608060405234801561001057600080fd5b50610688806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c8063046bc8b2146100675780637ebd1b30146100b85780638117824414610108578063877d0fe714610145578063d136d90c14610194578063e9f3aa821461019c575b600080fd5b6100a46004803603608081101561007d57600080fd5b5080359060208101359060408101356001600160801b031916906060013561ffff166101d9565b604080519115158252519081900360200190f35b6100d5600480360360208110156100ce57600080fd5b50356101f2565b6040805194855260208501939093526001600160801b03199091168383015261ffff166060830152519081900360800190f35b6100a46004803603608081101561011e57600080fd5b5080359060208101359060408101356001600160801b031916906060013561ffff16610233565b6101826004803603608081101561015b57600080fd5b5080359060208101359060408101356001600160801b031916906060013561ffff16610241565b60408051918252519081900360200190f35b61018261024f565b6100a4600480360360808110156101b257600080fd5b5080359060208101359060408101356001600160801b031916906060013561ffff1661025f565b60006101e78585858561026d565b90505b949350505050565b600081815481106101ff57fe5b6000918252602090912060039091020180546001820154600290920154909250608081901b90600160801b900461ffff1684565b60006101e785858585610394565b60006101e785858585610534565b6000610259610585565b90505b90565b60006101e78585858561058b565b60008061027c86868686610534565b60008181526001602052604090205490915061038857604080516080808201835288825260208083018981526001600160801b031989811685870190815261ffff8a8116606088019081526000805460018082018084558380529a517f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56360039093029283015596517f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56482015593517f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56590940180549251929095169390971c9290921761ffff60801b1916600160801b9290911691909102179055948252849052919091205590506101ea565b50600095945050505050565b6000806103a386868686610534565b60008181526001602052604090205490915080158015906103c657506000548111155b156105275760005481146104f7576103dc6105ba565b6000805460001981019081106103ee57fe5b600091825260208083206040805160808082018352600395909502909201805483526001810154938301939093526002909201549283901b6001600160801b03191691810191909152600160801b90910461ffff1660608201528154909250829190600019850190811061045e57fe5b600091825260208083208451600390930201918255838101516001808401919091556040808601516002909401805460609788015161ffff16600160801b0261ffff60801b1960809790971c6001600160801b0319909216919091179590951694909417909355855191860151928601519486015187959194936104e493929091610534565b8152602081019190915260400160002055505b60008054600019019061050a90826105e1565b5050600090815260016020819052604082209190915590506101ea565b5060009695505050505050565b60408051602080820196909652808201949094526001600160801b031992909216606084015260f01b6001600160f01b03191660708301528051808303605201815260729092019052805191012090565b60005490565b60006001600061059d87878787610534565b815260200190815260200160002054600014159050949350505050565b60408051608081018252600080825260208201819052918101829052606081019190915290565b81548183558181111561060d5760030281600302836000526020600020918201910161060d9190610612565b505050565b61025c91905b8082111561064f576000808255600182015560028101805471ffffffffffffffffffffffffffffffffffff19169055600301610618565b509056fea265627a7a72305820c2550b99d2bbd5cccbd773de9db90512ebd108c8171f17d72555cf64d0f86dcd64736f6c63430005090032";

  public static final String FUNC__ADD = "_add";

  public static final String FUNC_WHITELIST = "whitelist";

  public static final String FUNC__REMOVE = "_remove";

  public static final String FUNC__CALCULATEKEY = "_calculateKey";

  public static final String FUNC__SIZE = "_size";

  public static final String FUNC__EXISTS = "_exists";

  @Deprecated
  protected ExposedNodeRulesList(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  protected ExposedNodeRulesList(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }

  @Deprecated
  protected ExposedNodeRulesList(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  protected ExposedNodeRulesList(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public RemoteFunctionCall<TransactionReceipt> _add(
      byte[] _enodeHigh, byte[] _enodeLow, byte[] _ip, BigInteger _port) {
    final Function function =
        new Function(
            FUNC__ADD,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.generated.Bytes32(_enodeHigh),
                new org.web3j.abi.datatypes.generated.Bytes32(_enodeLow),
                new org.web3j.abi.datatypes.generated.Bytes16(_ip),
                new org.web3j.abi.datatypes.generated.Uint16(_port)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
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

  public RemoteFunctionCall<TransactionReceipt> _remove(
      byte[] _enodeHigh, byte[] _enodeLow, byte[] _ip, BigInteger _port) {
    final Function function =
        new Function(
            FUNC__REMOVE,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.generated.Bytes32(_enodeHigh),
                new org.web3j.abi.datatypes.generated.Bytes32(_enodeLow),
                new org.web3j.abi.datatypes.generated.Bytes16(_ip),
                new org.web3j.abi.datatypes.generated.Uint16(_port)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<BigInteger> _calculateKey(
      byte[] _enodeHigh, byte[] _enodeLow, byte[] _ip, BigInteger _port) {
    final Function function =
        new Function(
            FUNC__CALCULATEKEY,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.generated.Bytes32(_enodeHigh),
                new org.web3j.abi.datatypes.generated.Bytes32(_enodeLow),
                new org.web3j.abi.datatypes.generated.Bytes16(_ip),
                new org.web3j.abi.datatypes.generated.Uint16(_port)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    return executeRemoteCallSingleValueReturn(function, BigInteger.class);
  }

  public RemoteFunctionCall<BigInteger> _size() {
    final Function function =
        new Function(
            FUNC__SIZE,
            Arrays.<Type>asList(),
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
    return executeRemoteCallSingleValueReturn(function, BigInteger.class);
  }

  public RemoteFunctionCall<Boolean> _exists(
      byte[] _enodeHigh, byte[] _enodeLow, byte[] _ip, BigInteger _port) {
    final Function function =
        new Function(
            FUNC__EXISTS,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.generated.Bytes32(_enodeHigh),
                new org.web3j.abi.datatypes.generated.Bytes32(_enodeLow),
                new org.web3j.abi.datatypes.generated.Bytes16(_ip),
                new org.web3j.abi.datatypes.generated.Uint16(_port)),
            Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
    return executeRemoteCallSingleValueReturn(function, Boolean.class);
  }

  @Deprecated
  public static ExposedNodeRulesList load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new ExposedNodeRulesList(contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  @Deprecated
  public static ExposedNodeRulesList load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new ExposedNodeRulesList(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  public static ExposedNodeRulesList load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    return new ExposedNodeRulesList(contractAddress, web3j, credentials, contractGasProvider);
  }

  public static ExposedNodeRulesList load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    return new ExposedNodeRulesList(
        contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public static RemoteCall<ExposedNodeRulesList> deploy(
      Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        ExposedNodeRulesList.class, web3j, credentials, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<ExposedNodeRulesList> deploy(
      Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
    return deployRemoteCall(
        ExposedNodeRulesList.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
  }

  public static RemoteCall<ExposedNodeRulesList> deploy(
      Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
    return deployRemoteCall(
        ExposedNodeRulesList.class, web3j, transactionManager, contractGasProvider, BINARY, "");
  }

  @Deprecated
  public static RemoteCall<ExposedNodeRulesList> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return deployRemoteCall(
        ExposedNodeRulesList.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
  }
}
