package org.immersed.gaffe.java.security.interfaces;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.interfaces.DSAKey;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingDSAKey<X extends Throwable> extends DSAKey {
  @Override
  @SneakyThrows
  default java.security.interfaces.DSAParams getParams() {
    return tryGetParams();
  }

  java.security.interfaces.DSAParams tryGetParams() throws X;
}
