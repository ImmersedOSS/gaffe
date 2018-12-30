package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.IntPredicate;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingIntPredicate<X extends Throwable> extends IntPredicate {
  @Override
  @SneakyThrows
  default boolean test(int a) {
    return tryTest(a);
  }

  boolean tryTest(int a) throws X;
}
