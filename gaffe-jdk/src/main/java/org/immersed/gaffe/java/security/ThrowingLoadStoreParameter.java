package org.immersed.gaffe.java.security;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.KeyStore;
import lombok.SneakyThrows;

/**
 * A marker interface for {@code KeyStore}
 * {@link #load(KeyStore.LoadStoreParameter) load}
 * and
 * {@link #store(KeyStore.LoadStoreParameter) store}
 * parameters.
 *
 * @since 1.5
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingLoadStoreParameter<X extends Throwable> extends KeyStore.LoadStoreParameter {
  @Override
  @SneakyThrows
  default java.security.KeyStore.ProtectionParameter getProtectionParameter() {
    return tryGetProtectionParameter();
  }

  /**
   * Gets the parameter used to protect keystore data.
   *
   * @return the parameter used to protect keystore data, or null
   *
   * @throws X any exception that may be thrown.
   */
  java.security.KeyStore.ProtectionParameter tryGetProtectionParameter() throws X;
}
