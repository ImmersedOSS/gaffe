package org.immersed.gaffe.java.security.spec;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.spec.ECField;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingECField<X extends Throwable> extends ECField {
  @Override
  @SneakyThrows
  default int getFieldSize() {
    return tryGetFieldSize();
  }

  int tryGetFieldSize() throws X;
}
