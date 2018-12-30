package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.UnaryOperator;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingUnaryOperator<T, X extends Throwable> extends UnaryOperator<T> {
  @Override
  @SneakyThrows
  default T apply(T a) {
    return tryApply(a);
  }

  T tryApply(T a) throws X;
}
