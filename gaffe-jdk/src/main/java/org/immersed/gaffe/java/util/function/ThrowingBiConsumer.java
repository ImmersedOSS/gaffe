package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.BiConsumer;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingBiConsumer<T, U, X extends Throwable> extends BiConsumer<T, U> {
  @Override
  @SneakyThrows
  default void accept(T a, U b) {
    tryAccept(a,b);
  }

  void tryAccept(T a, U b) throws X;
}
