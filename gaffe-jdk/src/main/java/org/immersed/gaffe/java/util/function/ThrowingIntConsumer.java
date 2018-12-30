package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.IntConsumer;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingIntConsumer<X extends Throwable> extends IntConsumer {
  @Override
  @SneakyThrows
  default void accept(int a) {
    tryAccept(a);
  }

  void tryAccept(int a) throws X;
}
