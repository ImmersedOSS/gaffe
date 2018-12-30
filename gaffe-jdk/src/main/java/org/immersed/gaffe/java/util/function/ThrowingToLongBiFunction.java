package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.ToLongBiFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingToLongBiFunction<T, U, X extends Throwable> extends ToLongBiFunction<T, U> {
  @Override
  @SneakyThrows
  default long applyAsLong(T a, U b) {
    return tryApplyAsLong(a,b);
  }

  long tryApplyAsLong(T a, U b) throws X;
}
