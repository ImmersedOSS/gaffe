package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.IntToLongFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingIntToLongFunction<X extends Throwable> extends IntToLongFunction {
  @Override
  @SneakyThrows
  default long applyAsLong(int a) {
    return tryApplyAsLong(a);
  }

  long tryApplyAsLong(int a) throws X;
}
