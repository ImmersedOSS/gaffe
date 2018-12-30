package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.DoubleToIntFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingDoubleToIntFunction<X extends Throwable> extends DoubleToIntFunction {
  @Override
  @SneakyThrows
  default int applyAsInt(double a) {
    return tryApplyAsInt(a);
  }

  int tryApplyAsInt(double a) throws X;
}
