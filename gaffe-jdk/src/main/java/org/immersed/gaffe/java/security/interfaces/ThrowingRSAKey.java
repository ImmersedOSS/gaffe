package org.immersed.gaffe.java.security.interfaces;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.interfaces.RSAKey;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingRSAKey<X extends Throwable> extends RSAKey {
  @Override
  @SneakyThrows
  default java.math.BigInteger getModulus() {
    return tryGetModulus();
  }

  java.math.BigInteger tryGetModulus() throws X;
}
