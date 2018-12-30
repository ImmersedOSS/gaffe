package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.ToIntBiFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingToIntBiFunction<T, U, X extends Throwable> extends ToIntBiFunction<T, U> {
  @Override
  @SneakyThrows
  default int applyAsInt(T a, U b) {
    return tryApplyAsInt(a,b);
  }

  int tryApplyAsInt(T a, U b) throws X;
}
