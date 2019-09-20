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
package org.hyperledger.besu.ethereum.api.jsonrpc.internal.methods;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.hyperledger.besu.ethereum.api.BlockWithMetadata;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.JsonRpcRequest;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.parameters.JsonRpcParameter;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.processor.BlockTrace;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.processor.BlockTracer;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.processor.TransactionTrace;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.queries.BlockchainQueries;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.response.JsonRpcError;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.response.JsonRpcErrorResponse;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.response.JsonRpcSuccessResponse;
import org.hyperledger.besu.ethereum.core.Block;
import org.hyperledger.besu.ethereum.core.BlockDataGenerator;
import org.hyperledger.besu.ethereum.core.Gas;
import org.hyperledger.besu.ethereum.debug.TraceFrame;
import org.hyperledger.besu.ethereum.mainnet.MainnetBlockHeaderFunctions;
import org.hyperledger.besu.ethereum.mainnet.TransactionProcessor;
import org.hyperledger.besu.ethereum.vm.ExceptionalHaltReason;
import org.hyperledger.besu.util.bytes.BytesValue;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Optional;

import org.junit.Test;
import org.mockito.Mockito;

public class DebugTraceBlockTest {

  private final JsonRpcParameter parameters = new JsonRpcParameter();
  private final BlockTracer blockTracer = mock(BlockTracer.class);
  private final BlockchainQueries blockchainQueries = mock(BlockchainQueries.class);
  private final DebugTraceBlock debugTraceBlock =
      new DebugTraceBlock(
          parameters, blockTracer, new MainnetBlockHeaderFunctions(), blockchainQueries);

  @Test
  public void nameShouldBeDebugTraceBlock() {
    assertThat(debugTraceBlock.getName()).isEqualTo("debug_traceBlock");
  }

  @Test
  public void shouldReturnCorrectResponse() {
    final Block parentBlock =
        new BlockDataGenerator()
            .block(
                BlockDataGenerator.BlockOptions.create()
                    .setBlockHeaderFunctions(new MainnetBlockHeaderFunctions()));
    final Block block =
        new BlockDataGenerator()
            .block(
                BlockDataGenerator.BlockOptions.create()
                    .setBlockHeaderFunctions(new MainnetBlockHeaderFunctions())
                    .setParentHash(parentBlock.getHash()));

    final Object[] params = new Object[] {block.toRlp().toString()};
    final JsonRpcRequest request = new JsonRpcRequest("2.0", "debug_traceBlock", params);

    final TraceFrame traceFrame =
        new TraceFrame(
            12,
            "NONE",
            Gas.of(45),
            Optional.of(Gas.of(56)),
            2,
            EnumSet.noneOf(ExceptionalHaltReason.class),
            Optional.empty(),
            Optional.empty(),
            Optional.empty());

    final TransactionProcessor.Result transaction1Result = mock(TransactionProcessor.Result.class);
    final TransactionProcessor.Result transaction2Result = mock(TransactionProcessor.Result.class);

    final TransactionTrace transaction1Trace = mock(TransactionTrace.class);
    final TransactionTrace transaction2Trace = mock(TransactionTrace.class);

    final BlockTrace blockTrace = new BlockTrace(asList(transaction1Trace, transaction2Trace));

    when(transaction1Trace.getTraceFrames()).thenReturn(singletonList(traceFrame));
    when(transaction2Trace.getTraceFrames()).thenReturn(singletonList(traceFrame));
    when(transaction1Trace.getResult()).thenReturn(transaction1Result);
    when(transaction2Trace.getResult()).thenReturn(transaction2Result);
    when(transaction1Result.getOutput()).thenReturn(BytesValue.fromHexString("1234"));
    when(transaction2Result.getOutput()).thenReturn(BytesValue.fromHexString("1234"));
    when(blockTracer.trace(Mockito.eq(block), any())).thenReturn(Optional.of(blockTrace));

    when(blockchainQueries.blockByHash(parentBlock.getHash()))
        .thenReturn(
            Optional.of(
                new BlockWithMetadata<>(
                    parentBlock.getHeader(),
                    Collections.emptyList(),
                    Collections.emptyList(),
                    parentBlock.getHeader().getDifficulty(),
                    parentBlock.calculateSize())));

    final JsonRpcSuccessResponse response =
        (JsonRpcSuccessResponse) debugTraceBlock.response(request);
    final Collection<?> result = (Collection<?>) response.getResult();
    assertThat(result).hasSize(2);
  }

  @Test
  public void shouldReturnErrorResponseWhenParentBlockMissing() {
    final Block block =
        new BlockDataGenerator()
            .block(
                BlockDataGenerator.BlockOptions.create()
                    .setBlockHeaderFunctions(new MainnetBlockHeaderFunctions()));

    final Object[] params = new Object[] {block.toRlp().toString()};
    final JsonRpcRequest request = new JsonRpcRequest("2.0", "debug_traceBlock", params);

    when(blockchainQueries.blockByHash(any())).thenReturn(Optional.empty());

    final JsonRpcErrorResponse response = (JsonRpcErrorResponse) debugTraceBlock.response(request);
    assertThat(response.getError()).isEqualByComparingTo(JsonRpcError.PARENT_BLOCK_NOT_FOUND);
  }
}
