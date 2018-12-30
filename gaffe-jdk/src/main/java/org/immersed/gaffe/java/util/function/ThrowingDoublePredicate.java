package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.DoublePredicate;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingDoublePredicate<X extends Throwable> extends DoublePredicate {
  @Override
  @SneakyThrows
  default boolean test(double a) {
    return tryTest(a);
  }

  boolean tryTest(double a) throws X;
}
