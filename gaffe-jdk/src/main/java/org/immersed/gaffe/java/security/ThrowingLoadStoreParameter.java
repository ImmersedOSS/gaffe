package org.immersed.gaffe.java.security;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.KeyStore;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingLoadStoreParameter<X extends Throwable> extends KeyStore.LoadStoreParameter {
  @Override
  @SneakyThrows
  default java.security.KeyStore.ProtectionParameter getProtectionParameter() {
    return tryGetProtectionParameter();
  }

  java.security.KeyStore.ProtectionParameter tryGetProtectionParameter() throws X;
}
