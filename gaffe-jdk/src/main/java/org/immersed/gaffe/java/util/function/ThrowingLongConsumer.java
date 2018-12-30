package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongConsumer;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingLongConsumer<X extends Throwable> extends LongConsumer {
  @Override
  @SneakyThrows
  default void accept(long a) {
    tryAccept(a);
  }

  void tryAccept(long a) throws X;
}
