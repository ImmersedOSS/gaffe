package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingLongFunction<R, X extends Throwable> extends LongFunction<R> {
  @Override
  @SneakyThrows
  default R apply(long a) {
    return tryApply(a);
  }

  R tryApply(long a) throws X;
}
