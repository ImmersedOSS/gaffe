package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.DoubleConsumer;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingDoubleConsumer<X extends Throwable> extends DoubleConsumer {
  @Override
  @SneakyThrows
  default void accept(double a) {
    tryAccept(a);
  }

  void tryAccept(double a) throws X;
}
