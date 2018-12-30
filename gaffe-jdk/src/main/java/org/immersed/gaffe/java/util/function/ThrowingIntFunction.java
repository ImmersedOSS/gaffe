package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.IntFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingIntFunction<R, X extends Throwable> extends IntFunction<R> {
  @Override
  @SneakyThrows
  default R apply(int a) {
    return tryApply(a);
  }

  R tryApply(int a) throws X;
}
