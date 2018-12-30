package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.IntBinaryOperator;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingIntBinaryOperator<X extends Throwable> extends IntBinaryOperator {
  @Override
  @SneakyThrows
  default int applyAsInt(int a, int b) {
    return tryApplyAsInt(a,b);
  }

  int tryApplyAsInt(int a, int b) throws X;
}
