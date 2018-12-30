package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongToDoubleFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingLongToDoubleFunction<X extends Throwable> extends LongToDoubleFunction {
  @Override
  @SneakyThrows
  default double applyAsDouble(long a) {
    return tryApplyAsDouble(a);
  }

  double tryApplyAsDouble(long a) throws X;
}
