package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.DoubleBinaryOperator;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingDoubleBinaryOperator<X extends Throwable> extends DoubleBinaryOperator {
  @Override
  @SneakyThrows
  default double applyAsDouble(double a, double b) {
    return tryApplyAsDouble(a,b);
  }

  double tryApplyAsDouble(double a, double b) throws X;
}
