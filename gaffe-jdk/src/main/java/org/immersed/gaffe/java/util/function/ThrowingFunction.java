package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.Function;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingFunction<T, R, X extends Throwable> extends Function<T, R> {
  @Override
  @SneakyThrows
  default R apply(T a) {
    return tryApply(a);
  }

  R tryApply(T a) throws X;
}
