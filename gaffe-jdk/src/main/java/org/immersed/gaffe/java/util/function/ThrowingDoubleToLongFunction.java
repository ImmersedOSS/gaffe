package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.DoubleToLongFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingDoubleToLongFunction<X extends Throwable> extends DoubleToLongFunction {
  @Override
  @SneakyThrows
  default long applyAsLong(double a) {
    return tryApplyAsLong(a);
  }

  long tryApplyAsLong(double a) throws X;
}
