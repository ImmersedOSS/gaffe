package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.ToDoubleFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingToDoubleFunction<T, X extends Throwable> extends ToDoubleFunction<T> {
  @Override
  @SneakyThrows
  default double applyAsDouble(T a) {
    return tryApplyAsDouble(a);
  }

  double tryApplyAsDouble(T a) throws X;
}
