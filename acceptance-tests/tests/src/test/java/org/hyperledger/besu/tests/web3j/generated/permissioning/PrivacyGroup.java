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
package org.hyperledger.besu.tests.web3j.generated.permissioning;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
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
 * <p>Generated with web3j version 4.5.7.
 */
@SuppressWarnings("rawtypes")
public class PrivacyGroup extends Contract {
  private static final String BINARY =
      "60806040523480156200001157600080fd5b5060405162000d6138038062000d61833981810160405260808110156200003757600080fd5b8151602083018051604051929492938301929190846401000000008211156200005f57600080fd5b9083019060208201858111156200007557600080fd5b82518660208202830111640100000000821117156200009357600080fd5b82525081516020918201928201910280838360005b83811015620000c2578181015183820152602001620000a8565b5050505090500160405260200180516040519392919084640100000000821115620000ec57600080fd5b9083019060208201858111156200010257600080fd5b82516401000000008111828201881017156200011d57600080fd5b82525081516020918201929091019080838360005b838110156200014c57818101518382015260200162000132565b50505050905090810190601f1680156200017a5780820380516001836020036101000a031916815260200191505b50604052602001805160405193929190846401000000008211156200019e57600080fd5b908301906020820185811115620001b457600080fd5b8251640100000000811182820188101715620001cf57600080fd5b82525081516020918201929091019080838360005b83811015620001fe578181015183820152602001620001e4565b50505050905090810190601f1680156200022c5780820380516001836020036101000a031916815260200191505b5060405250505062000244846200029660201b60201c565b5060028490556200025f84846001600160e01b036200030016565b50815162000275906000906020850190620005cb565b5080516200028b906001906020840190620005cb565b505050505062000670565b600081815260046020526040812054620002f75750600380546001818101928390557fc2575a0e9e593c00f959f8c92f12db2869c3395a3b0502d05e2516446f71f85b909101839055600083815260046020526040902091909155620002fb565b5060005b919050565b60006001815b8351811015620005af578381815181106200031d57fe5b6020026020010151851415620003a55760008051602062000d4183398151915260008583815181106200034c57fe5b60200260200101516040518083151515158152602001828152602001806020018281038252602f81526020018062000d12602f9139604001935050505060405180910390a18180156200039d575060005b9150620005a6565b620003ca848281518110620003b657fe5b6020026020010151620005b760201b60201c565b15620004595760008051602062000d418339815191526000858381518110620003ef57fe5b602090810291909101810151604080519315158452918301526060828201819052601b908301527f4163636f756e7420697320616c72656164792061204d656d62657200000000006080830152519081900360a00190a18180156200039d575060009150620005a6565b6000620004808583815181106200046c57fe5b60200260200101516200029660201b60201c565b9050606081620004c6576040518060400160405280601b81526020017f4163636f756e7420697320616c72656164792061204d656d6265720000000000815250620004e1565b60405180606001604052806021815260200162000cf1602191395b905060008051602062000d41833981519152828785815181106200050157fe5b602002602001015183604051808415151515815260200183815260200180602001828103825283818151815260200191508051906020019080838360005b83811015620005595781810151838201526020016200053f565b50505050905090810190601f168015620005875780820380516001836020036101000a031916815260200191505b5094505050505060405180910390a1838015620005a15750815b935050505b60010162000306565b509392505050565b600090815260046020526040902054151590565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106200060e57805160ff19168380011785556200063e565b828001600101855582156200063e579182015b828111156200063e57825182559160200191906001019062000621565b506200064c92915062000650565b5090565b6200066d91905b808211156200064c576000815560010162000657565b90565b61067180620006806000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c80630b0235be14610046578063e4d696e0146100b3578063f744b089146100e1575b600080fd5b6100636004803603602081101561005c57600080fd5b503561019f565b60408051602080825283518183015283519192839290830191858101910280838360005b8381101561009f578181015183820152602001610087565b505050509050019250505060405180910390f35b6100df600480360360408110156100c957600080fd5b50803590602001356001600160a01b0316610224565b005b61018b600480360360408110156100f757600080fd5b8135919081019060408101602082013564010000000081111561011957600080fd5b82018360208201111561012b57600080fd5b8035906020019184602083028401116401000000008311171561014d57600080fd5b919080806020026020016040519081016040528093929190818152602001838360200280828437600092019190915250929550610270945050505050565b604080519115158252519081900360200190f35b6005546060906001600160a01b031633146101b957600080fd5b6101c2826102ad565b6101cb57600080fd5b600380548060200260200160405190810160405280929190818152602001828054801561021757602002820191906000526020600020905b815481526020019060010190808311610203575b505050505090505b919050565b600254821461023257600080fd5b6005546001600160a01b038281169116141561024d57600080fd5b600580546001600160a01b0319166001600160a01b039290921691909117905550565b6005546000906001600160a01b0316331461028a57600080fd5b610293836102ad565b61029c57600080fd5b6102a683836102c1565b9392505050565b600090815260046020526040902054151590565b60006001815b835181101561057d578381815181106102dc57fe5b6020026020010151851415610370577f3ad4a6804001c76d4aeb1ce3d1fa2b6f0507236afbb5143c82561641b34e7b5b600085838151811061031a57fe5b60200260200101516040518083151515158152602001828152602001806020018281038252602f81526020018061060e602f9139604001935050505060405180910390a1818015610369575060005b9150610575565b61038c84828151811061037f57fe5b60200260200101516102ad565b15610428577f3ad4a6804001c76d4aeb1ce3d1fa2b6f0507236afbb5143c82561641b34e7b5b60008583815181106103c057fe5b602090810291909101810151604080519315158452918301526060828201819052601b908301527f4163636f756e7420697320616c72656164792061204d656d62657200000000006080830152519081900360a00190a1818015610369575060009150610575565b600061044685838151811061043957fe5b6020026020010151610585565b905060608161048a576040518060400160405280601b81526020017f4163636f756e7420697320616c72656164792061204d656d62657200000000008152506104a4565b6040518060600160405280602181526020016105ed602191395b90507f3ad4a6804001c76d4aeb1ce3d1fa2b6f0507236afbb5143c82561641b34e7b5b828785815181106104d457fe5b602002602001015183604051808415151515815260200183815260200180602001828103825283818151815260200191508051906020019080838360005b8381101561052a578181015183820152602001610512565b50505050905090810190601f1680156105575780820380516001836020036101000a031916815260200191505b5094505050505060405180910390a18380156105705750815b935050505b6001016102c7565b509392505050565b6000818152600460205260408120546105e45750600380546001818101928390557fc2575a0e9e593c00f959f8c92f12db2869c3395a3b0502d05e2516446f71f85b90910183905560008381526004602052604090209190915561021f565b50600091905056fe4d656d626572206163636f756e74206164646564207375636365737366756c6c79416464696e67206f776e206163636f756e742061732061204d656d626572206973206e6f74207065726d6974746564a265627a7a72315820579a7ec744c9854be63ed31a6502a28b50c99eedc5d1dc5c2286091e991b673a64736f6c634300050c00324d656d626572206163636f756e74206164646564207375636365737366756c6c79416464696e67206f776e206163636f756e742061732061204d656d626572206973206e6f74207065726d69747465643ad4a6804001c76d4aeb1ce3d1fa2b6f0507236afbb5143c82561641b34e7b5b";

  public static final String FUNC_ADDPARTICIPANTS = "addParticipants";

  public static final String FUNC_GETPARTICIPANTS = "getParticipants";

  public static final String FUNC_SETPROXY = "setProxy";

  public static final Event MEMBERADDED_EVENT =
      new Event(
          "MemberAdded",
          Arrays.<TypeReference<?>>asList(
              new TypeReference<Bool>() {},
              new TypeReference<Bytes32>() {},
              new TypeReference<Utf8String>() {}));;

  @Deprecated
  protected PrivacyGroup(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  protected PrivacyGroup(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
  }

  @Deprecated
  protected PrivacyGroup(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  protected PrivacyGroup(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public List<MemberAddedEventResponse> getMemberAddedEvents(
      TransactionReceipt transactionReceipt) {
    List<Contract.EventValuesWithLog> valueList =
        extractEventParametersWithLog(MEMBERADDED_EVENT, transactionReceipt);
    ArrayList<MemberAddedEventResponse> responses =
        new ArrayList<MemberAddedEventResponse>(valueList.size());
    for (Contract.EventValuesWithLog eventValues : valueList) {
      MemberAddedEventResponse typedResponse = new MemberAddedEventResponse();
      typedResponse.log = eventValues.getLog();
      typedResponse.adminAdded = (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
      typedResponse.account = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
      typedResponse.message = (String) eventValues.getNonIndexedValues().get(2).getValue();
      responses.add(typedResponse);
    }
    return responses;
  }

  public Flowable<MemberAddedEventResponse> memberAddedEventFlowable(EthFilter filter) {
    return web3j
        .ethLogFlowable(filter)
        .map(
            new Function<Log, MemberAddedEventResponse>() {
              @Override
              public MemberAddedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues =
                    extractEventParametersWithLog(MEMBERADDED_EVENT, log);
                MemberAddedEventResponse typedResponse = new MemberAddedEventResponse();
                typedResponse.log = log;
                typedResponse.adminAdded =
                    (Boolean) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.account =
                    (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.message =
                    (String) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
              }
            });
  }

  public Flowable<MemberAddedEventResponse> memberAddedEventFlowable(
      DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
    EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
    filter.addSingleTopic(EventEncoder.encode(MEMBERADDED_EVENT));
    return memberAddedEventFlowable(filter);
  }

  public RemoteFunctionCall<TransactionReceipt> addParticipants(
      byte[] enclaveKey, List<byte[]> accounts) {
    final org.web3j.abi.datatypes.Function function =
        new org.web3j.abi.datatypes.Function(
            FUNC_ADDPARTICIPANTS,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.generated.Bytes32(enclaveKey),
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                    org.web3j.abi.datatypes.generated.Bytes32.class,
                    org.web3j.abi.Utils.typeMap(
                        accounts, org.web3j.abi.datatypes.generated.Bytes32.class))),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  public RemoteFunctionCall<List> getParticipants(byte[] enclaveKey) {
    final org.web3j.abi.datatypes.Function function =
        new org.web3j.abi.datatypes.Function(
            FUNC_GETPARTICIPANTS,
            Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(enclaveKey)),
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

  public RemoteFunctionCall<TransactionReceipt> setProxy(byte[] enclaveKey, String proxy) {
    final org.web3j.abi.datatypes.Function function =
        new org.web3j.abi.datatypes.Function(
            FUNC_SETPROXY,
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.generated.Bytes32(enclaveKey),
                new org.web3j.abi.datatypes.Address(160, proxy)),
            Collections.<TypeReference<?>>emptyList());
    return executeRemoteCallTransaction(function);
  }

  @Deprecated
  public static PrivacyGroup load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new PrivacyGroup(contractAddress, web3j, credentials, gasPrice, gasLimit);
  }

  @Deprecated
  public static PrivacyGroup load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit) {
    return new PrivacyGroup(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
  }

  public static PrivacyGroup load(
      String contractAddress,
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider) {
    return new PrivacyGroup(contractAddress, web3j, credentials, contractGasProvider);
  }

  public static PrivacyGroup load(
      String contractAddress,
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider) {
    return new PrivacyGroup(contractAddress, web3j, transactionManager, contractGasProvider);
  }

  public static RemoteCall<PrivacyGroup> deploy(
      Web3j web3j,
      Credentials credentials,
      ContractGasProvider contractGasProvider,
      byte[] enclaveKey,
      List<byte[]> members,
      String _name,
      String _description) {
    String encodedConstructor =
        FunctionEncoder.encodeConstructor(
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.generated.Bytes32(enclaveKey),
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                    org.web3j.abi.datatypes.generated.Bytes32.class,
                    org.web3j.abi.Utils.typeMap(
                        members, org.web3j.abi.datatypes.generated.Bytes32.class)),
                new org.web3j.abi.datatypes.Utf8String(_name),
                new org.web3j.abi.datatypes.Utf8String(_description)));
    return deployRemoteCall(
        PrivacyGroup.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
  }

  public static RemoteCall<PrivacyGroup> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      ContractGasProvider contractGasProvider,
      byte[] enclaveKey,
      List<byte[]> members,
      String _name,
      String _description) {
    String encodedConstructor =
        FunctionEncoder.encodeConstructor(
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.generated.Bytes32(enclaveKey),
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                    org.web3j.abi.datatypes.generated.Bytes32.class,
                    org.web3j.abi.Utils.typeMap(
                        members, org.web3j.abi.datatypes.generated.Bytes32.class)),
                new org.web3j.abi.datatypes.Utf8String(_name),
                new org.web3j.abi.datatypes.Utf8String(_description)));
    return deployRemoteCall(
        PrivacyGroup.class,
        web3j,
        transactionManager,
        contractGasProvider,
        BINARY,
        encodedConstructor);
  }

  @Deprecated
  public static RemoteCall<PrivacyGroup> deploy(
      Web3j web3j,
      Credentials credentials,
      BigInteger gasPrice,
      BigInteger gasLimit,
      byte[] enclaveKey,
      List<byte[]> members,
      String _name,
      String _description) {
    String encodedConstructor =
        FunctionEncoder.encodeConstructor(
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.generated.Bytes32(enclaveKey),
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                    org.web3j.abi.datatypes.generated.Bytes32.class,
                    org.web3j.abi.Utils.typeMap(
                        members, org.web3j.abi.datatypes.generated.Bytes32.class)),
                new org.web3j.abi.datatypes.Utf8String(_name),
                new org.web3j.abi.datatypes.Utf8String(_description)));
    return deployRemoteCall(
        PrivacyGroup.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
  }

  @Deprecated
  public static RemoteCall<PrivacyGroup> deploy(
      Web3j web3j,
      TransactionManager transactionManager,
      BigInteger gasPrice,
      BigInteger gasLimit,
      byte[] enclaveKey,
      List<byte[]> members,
      String _name,
      String _description) {
    String encodedConstructor =
        FunctionEncoder.encodeConstructor(
            Arrays.<Type>asList(
                new org.web3j.abi.datatypes.generated.Bytes32(enclaveKey),
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                    org.web3j.abi.datatypes.generated.Bytes32.class,
                    org.web3j.abi.Utils.typeMap(
                        members, org.web3j.abi.datatypes.generated.Bytes32.class)),
                new org.web3j.abi.datatypes.Utf8String(_name),
                new org.web3j.abi.datatypes.Utf8String(_description)));
    return deployRemoteCall(
        PrivacyGroup.class,
        web3j,
        transactionManager,
        gasPrice,
        gasLimit,
        BINARY,
        encodedConstructor);
  }

  public static class MemberAddedEventResponse extends BaseEventResponse {
    public Boolean adminAdded;

    public byte[] account;

    public String message;
  }
}
