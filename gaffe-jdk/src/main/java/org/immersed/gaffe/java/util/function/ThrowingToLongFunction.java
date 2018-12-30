package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.ToLongFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingToLongFunction<T, X extends Throwable> extends ToLongFunction<T> {
  @Override
  @SneakyThrows
  default long applyAsLong(T a) {
    return tryApplyAsLong(a);
  }

  long tryApplyAsLong(T a) throws X;
}
