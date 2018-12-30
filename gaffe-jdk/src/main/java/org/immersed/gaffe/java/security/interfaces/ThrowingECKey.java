package org.immersed.gaffe.java.security.interfaces;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.interfaces.ECKey;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingECKey<X extends Throwable> extends ECKey {
  @Override
  @SneakyThrows
  default java.security.spec.ECParameterSpec getParams() {
    return tryGetParams();
  }

  java.security.spec.ECParameterSpec tryGetParams() throws X;
}
