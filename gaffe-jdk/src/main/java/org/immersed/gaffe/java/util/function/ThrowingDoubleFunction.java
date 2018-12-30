package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.DoubleFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingDoubleFunction<R, X extends Throwable> extends DoubleFunction<R> {
  @Override
  @SneakyThrows
  default R apply(double a) {
    return tryApply(a);
  }

  R tryApply(double a) throws X;
}
