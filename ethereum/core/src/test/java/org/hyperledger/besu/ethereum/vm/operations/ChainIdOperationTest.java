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
package org.hyperledger.besu.ethereum.vm.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import org.hyperledger.besu.ethereum.core.Gas;
import org.hyperledger.besu.ethereum.mainnet.ConstantinopleGasCalculator;
import org.hyperledger.besu.ethereum.vm.MessageFrame;
import org.hyperledger.besu.util.bytes.Bytes32;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class ChainIdOperationTest {

  private final Bytes32 chainId;
  private final int expectedGas;
  private final MessageFrame messageFrame = mock(MessageFrame.class);
  private final ChainIdOperation operation;

  @Parameters(name = "chainId: {0}, expectedGas: {1}")
  public static Object[][] params() {
    return new Object[][] {
      {"0x01", 2},
      {"0x03", 2},
      {"0x04", 2},
      {"0x05", 2},
    };
  }

  public ChainIdOperationTest(final String chainIdString, final int expectedGas) {
    chainId = Bytes32.fromHexString(chainIdString);
    this.expectedGas = expectedGas;
    operation = new ChainIdOperation(new ConstantinopleGasCalculator(), chainId);
  }

  @Test
  public void shouldReturnChainId() {
    final ArgumentCaptor<Bytes32> arg = ArgumentCaptor.forClass(Bytes32.class);
    operation.execute(messageFrame);
    Mockito.verify(messageFrame).pushStackItem(arg.capture());
    Mockito.verifyNoMoreInteractions(messageFrame);
    assertThat(arg.getValue()).isEqualByComparingTo(chainId);
  }

  @Test
  public void shouldCalculateGasPrice() {
    assertThat(operation.cost(messageFrame)).isEqualTo(Gas.of(expectedGas));
  }
}
