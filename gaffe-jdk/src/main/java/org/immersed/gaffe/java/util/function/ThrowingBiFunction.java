package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.BiFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingBiFunction<T, U, R, X extends Throwable> extends BiFunction<T, U, R> {
  @Override
  @SneakyThrows
  default R apply(T a, U b) {
    return tryApply(a,b);
  }

  R tryApply(T a, U b) throws X;
}
