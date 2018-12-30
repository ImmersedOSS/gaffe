package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.DoubleUnaryOperator;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingDoubleUnaryOperator<X extends Throwable> extends DoubleUnaryOperator {
  @Override
  @SneakyThrows
  default double applyAsDouble(double a) {
    return tryApplyAsDouble(a);
  }

  double tryApplyAsDouble(double a) throws X;
}
