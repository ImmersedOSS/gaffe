package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongBinaryOperator;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingLongBinaryOperator<X extends Throwable> extends LongBinaryOperator {
  @Override
  @SneakyThrows
  default long applyAsLong(long a, long b) {
    return tryApplyAsLong(a,b);
  }

  long tryApplyAsLong(long a, long b) throws X;
}
