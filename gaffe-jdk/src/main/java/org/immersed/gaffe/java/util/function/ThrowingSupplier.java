package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.Supplier;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingSupplier<T, X extends Throwable> extends Supplier<T> {
  @Override
  @SneakyThrows
  default T get() {
    return tryGet();
  }

  T tryGet() throws X;
}
