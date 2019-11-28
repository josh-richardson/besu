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
package org.hyperledger.besu.tests.acceptance.dsl.transaction;

import org.hyperledger.besu.tests.acceptance.dsl.account.Accounts;

import java.lang.reflect.Method;
import java.math.BigInteger;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.tx.Contract;

public class LoadSmartContract<T extends Contract> implements Transaction<T> {

  private static final BigInteger DEFAULT_GAS_PRICE = BigInteger.valueOf(1000);
  private static final BigInteger DEFAULT_GAS_LIMIT = BigInteger.valueOf(3000000);
  private static final Object METHOD_IS_STATIC = null;
  private static final Credentials BENEFACTOR_ONE =
      Credentials.create(Accounts.GENESIS_ACCOUNT_ONE_PRIVATE_KEY);

  private final Class<T> clazz;
  private final String address;

  public LoadSmartContract(final Class<T> clazz, final String address) {
    this.clazz = clazz;
    this.address = address;
  }

  @SuppressWarnings("unchecked")
  @Override
  public T execute(final NodeRequests node) {
    try {
      final Method method =
          clazz.getMethod(
              "load",
              String.class,
              Web3j.class,
              Credentials.class,
              BigInteger.class,
              BigInteger.class);

      return (T)
          method.invoke(
              METHOD_IS_STATIC,
              address,
              node.eth(),
              BENEFACTOR_ONE,
              DEFAULT_GAS_PRICE,
              DEFAULT_GAS_LIMIT);
    } catch (final Exception e) {
      throw new RuntimeException(e);
    }
  }
}
