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
package org.hyperledger.besu.ethereum.api.jsonrpc.internal.privacy.methods.priv;

import static org.apache.logging.log4j.LogManager.getLogger;

import org.hyperledger.besu.ethereum.api.jsonrpc.RpcMethod;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.JsonRpcRequestContext;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.methods.JsonRpcMethod;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.parameters.BlockParameter;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.response.JsonRpcResponse;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.response.JsonRpcSuccessResponse;
import org.hyperledger.besu.ethereum.api.query.BlockchainQueries;
import org.hyperledger.besu.ethereum.core.Address;
import org.hyperledger.besu.ethereum.core.Hash;
import org.hyperledger.besu.ethereum.core.PrivacyParameters;
import org.hyperledger.besu.ethereum.privacy.PrivateStateRootResolver;

import java.util.Optional;

import org.apache.logging.log4j.Logger;
import org.apache.tuweni.bytes.Bytes;
import org.apache.tuweni.bytes.Bytes32;

public class PrivGetCode implements JsonRpcMethod {

  private static final Logger LOG = getLogger();

  private final BlockchainQueries blockchain;
  private final PrivateStateRootResolver privateStateRootResolver;
  private final PrivacyParameters privacyParameters;

  public PrivGetCode(
      final BlockchainQueries blockchain,
      final PrivacyParameters privacyParameters,
      final PrivateStateRootResolver privateStateRootResolver) {
    this.privacyParameters = privacyParameters;
    this.blockchain = blockchain;
    this.privateStateRootResolver = privateStateRootResolver;
  }

  @Override
  public String getName() {
    return RpcMethod.PRIV_GET_CODE.getMethodName();
  }

  @Override
  public JsonRpcResponse response(final JsonRpcRequestContext requestContext) {
    LOG.trace("Executing {}", RpcMethod.PRIV_GET_CODE.getMethodName());

    final Address address =
        Address.fromHexString(requestContext.getRequiredParameter(0, String.class));

    final BlockParameter blockParameter =
        requestContext.getRequiredParameter(1, BlockParameter.class);

    final String privacyGroupString = requestContext.getRequiredParameter(2, String.class);

    final Bytes32 privacyGroupId = Bytes32.wrap(Bytes.fromBase64String(privacyGroupString));

    final Hash latestStateRoot =
        privateStateRootResolver.resolveLastStateRoot(
            privacyGroupId,
            blockParameter.isNumeric() && blockParameter.getNumber().isPresent()
                ? blockchain
                    .getBlockchain()
                    .getBlockByNumber(blockParameter.getNumber().getAsLong())
                    .orElseThrow()
                    .getHash()
                : blockchain.getBlockchain().getChainHeadBlock().getHash());

    return privacyParameters
        .getPrivateWorldStateArchive()
        .get(latestStateRoot)
        .flatMap(
            pws ->
                Optional.ofNullable(pws.get(address)).map(account -> account.getCode().toString()))
        .map(c -> new JsonRpcSuccessResponse(requestContext.getRequest().getId(), c))
        .orElse(new JsonRpcSuccessResponse(requestContext.getRequest().getId(), null));
  }
}
