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

import org.hyperledger.besu.ethereum.core.Gas;
import org.hyperledger.besu.ethereum.vm.AbstractOperation;
import org.hyperledger.besu.ethereum.vm.GasCalculator;
import org.hyperledger.besu.ethereum.vm.MessageFrame;
import org.hyperledger.besu.util.bytes.Bytes32;
import org.hyperledger.besu.util.bytes.BytesValue;
import org.hyperledger.besu.util.bytes.MutableBytes32;
import org.hyperledger.besu.util.uint.UInt256;

public class CallDataLoadOperation extends AbstractOperation {

  public CallDataLoadOperation(final GasCalculator gasCalculator) {
    super(0x35, "CALLDATALOAD", 1, 1, false, 1, gasCalculator);
  }

  @Override
  public Gas cost(final MessageFrame frame) {
    return gasCalculator().getVeryLowTierGasCost();
  }

  @Override
  public void execute(final MessageFrame frame) {
    final UInt256 startWord = frame.popStackItem().asUInt256();

    // If the start index doesn't fit a int, it comes after anything in data, and so the returned
    // word should be zero.
    if (!startWord.fitsInt()) {
      frame.pushStackItem(Bytes32.ZERO);
      return;
    }

    final int offset = startWord.toInt();
    final BytesValue data = frame.getInputData();
    final MutableBytes32 res = MutableBytes32.create();
    if (offset < data.size()) {
      final BytesValue toCopy = data.slice(offset, Math.min(Bytes32.SIZE, data.size() - offset));
      toCopy.copyTo(res, 0);
    }
    frame.pushStackItem(res);
  }
}
