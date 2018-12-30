package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongPredicate;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingLongPredicate<X extends Throwable> extends LongPredicate {
  @Override
  @SneakyThrows
  default boolean test(long a) {
    return tryTest(a);
  }

  boolean tryTest(long a) throws X;
}
