package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongSupplier;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingLongSupplier<X extends Throwable> extends LongSupplier {
  @Override
  @SneakyThrows
  default long getAsLong() {
    return tryGetAsLong();
  }

  long tryGetAsLong() throws X;
}
