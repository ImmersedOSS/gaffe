package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongUnaryOperator;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingLongUnaryOperator<X extends Throwable> extends LongUnaryOperator {
  @Override
  @SneakyThrows
  default long applyAsLong(long a) {
    return tryApplyAsLong(a);
  }

  long tryApplyAsLong(long a) throws X;
}
