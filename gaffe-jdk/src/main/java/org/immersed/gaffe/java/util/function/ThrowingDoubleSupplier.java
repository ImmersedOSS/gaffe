package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.DoubleSupplier;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingDoubleSupplier<X extends Throwable> extends DoubleSupplier {
  @Override
  @SneakyThrows
  default double getAsDouble() {
    return tryGetAsDouble();
  }

  double tryGetAsDouble() throws X;
}
