package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.BinaryOperator;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingBinaryOperator<T, X extends Throwable> extends BinaryOperator<T> {
  @Override
  @SneakyThrows
  default T apply(T a, T b) {
    return tryApply(a,b);
  }

  T tryApply(T a, T b) throws X;
}
