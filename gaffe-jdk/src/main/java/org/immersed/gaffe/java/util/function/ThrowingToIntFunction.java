package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.ToIntFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingToIntFunction<T, X extends Throwable> extends ToIntFunction<T> {
  @Override
  @SneakyThrows
  default int applyAsInt(T a) {
    return tryApplyAsInt(a);
  }

  int tryApplyAsInt(T a) throws X;
}
