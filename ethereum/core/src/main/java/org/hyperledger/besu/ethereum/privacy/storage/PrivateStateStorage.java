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
package org.hyperledger.besu.ethereum.privacy.storage;

import org.hyperledger.besu.ethereum.core.Log;

import java.util.List;
import java.util.Optional;

import org.apache.tuweni.bytes.Bytes;
import org.apache.tuweni.bytes.Bytes32;

public interface PrivateStateStorage {

  Optional<List<Log>> getTransactionLogs(Bytes32 transactionHash);

  Optional<Bytes> getTransactionOutput(Bytes32 transactionHash);

  Optional<Bytes> getStatus(Bytes32 transactionHash);

  Optional<Bytes> getRevertReason(Bytes32 transactionHash);

  Optional<PrivateBlockMetadata> getPrivateBlockMetadata(Bytes32 blockHash, Bytes32 privacyGroupId);

  Optional<BytesValue> getPrivacyGroupHead(Bytes32 blockHash, Bytes32 privacyGroupId);

  boolean isPrivateStateAvailable(Bytes32 transactionHash);

  boolean isWorldStateAvailable(Bytes32 rootHash);

  Updater updater();

  interface Updater {

    Updater putTransactionLogs(Bytes32 transactionHash, List<Log> logs);

    Updater putTransactionResult(Bytes32 transactionHash, Bytes events);

    Updater putTransactionStatus(Bytes32 transactionHash, Bytes status);

    Updater putTransactionRevertReason(Bytes32 txHash, Bytes bytesValue);

    Updater putPrivateBlockMetadata(
        Bytes32 blockHash, Bytes32 privacyGroupId, PrivateBlockMetadata metadata);

    PrivateStateKeyValueStorage.Updater putPrivacyGroupHead(
        Bytes32 blockHash, Bytes32 privacyGroupId, Bytes32 latestBlockHash);

    void commit();

    void rollback();
  }
}
