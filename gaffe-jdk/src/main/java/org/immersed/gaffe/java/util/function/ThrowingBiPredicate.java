package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.BiPredicate;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingBiPredicate<T, U, X extends Throwable> extends BiPredicate<T, U> {
  @Override
  @SneakyThrows
  default boolean test(T a, U b) {
    return tryTest(a,b);
  }

  boolean tryTest(T a, U b) throws X;
}
