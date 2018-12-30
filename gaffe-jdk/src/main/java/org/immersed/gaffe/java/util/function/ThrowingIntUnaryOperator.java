package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.IntUnaryOperator;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingIntUnaryOperator<X extends Throwable> extends IntUnaryOperator {
  @Override
  @SneakyThrows
  default int applyAsInt(int a) {
    return tryApplyAsInt(a);
  }

  int tryApplyAsInt(int a) throws X;
}
