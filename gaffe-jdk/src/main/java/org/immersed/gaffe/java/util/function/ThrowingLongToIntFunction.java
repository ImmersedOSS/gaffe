package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongToIntFunction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingLongToIntFunction<X extends Throwable> extends LongToIntFunction {
  @Override
  @SneakyThrows
  default int applyAsInt(long a) {
    return tryApplyAsInt(a);
  }

  int tryApplyAsInt(long a) throws X;
}
