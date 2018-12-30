package org.immersed.gaffe.java.io;

import java.io.Flushable;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingFlushable<X extends Throwable> extends Flushable {
  @Override
  @SneakyThrows
  default void flush() {
    tryFlush();
  }

  void tryFlush() throws X;
}
