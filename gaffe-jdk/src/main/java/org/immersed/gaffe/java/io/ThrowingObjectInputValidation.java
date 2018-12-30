package org.immersed.gaffe.java.io;

import java.io.ObjectInputValidation;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingObjectInputValidation<X extends Throwable> extends ObjectInputValidation {
  @Override
  @SneakyThrows
  default void validateObject() {
    tryValidateObject();
  }

  void tryValidateObject() throws X;
}
