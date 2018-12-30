package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.BooleanSupplier;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingBooleanSupplier<X extends Throwable> extends BooleanSupplier {
  @Override
  @SneakyThrows
  default boolean getAsBoolean() {
    return tryGetAsBoolean();
  }

  boolean tryGetAsBoolean() throws X;
}
