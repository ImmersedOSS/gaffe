package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.IntToDoubleFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingIntToDoubleFunction<X extends Throwable> extends IntToDoubleFunction {
  @Override
  @SneakyThrows
  default double applyAsDouble(int a) {
    return tryApplyAsDouble(a);
  }

  double tryApplyAsDouble(int a) throws X;
}
