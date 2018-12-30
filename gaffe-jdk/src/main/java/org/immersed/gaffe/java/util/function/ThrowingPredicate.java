package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.Predicate;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingPredicate<T, X extends Throwable> extends Predicate<T> {
  @Override
  @SneakyThrows
  default boolean test(T a) {
    return tryTest(a);
  }

  boolean tryTest(T a) throws X;
}
