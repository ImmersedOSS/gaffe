package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.Consumer;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingConsumer<T, X extends Throwable> extends Consumer<T> {
  @Override
  @SneakyThrows
  default void accept(T a) {
    tryAccept(a);
  }

  void tryAccept(T a) throws X;
}
