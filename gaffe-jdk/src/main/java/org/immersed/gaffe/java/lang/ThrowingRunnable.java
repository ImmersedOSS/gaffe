package org.immersed.gaffe.java.lang;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Runnable;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingRunnable<X extends Throwable> extends Runnable {
  @Override
  @SneakyThrows
  default void run() {
    tryRun();
  }

  void tryRun() throws X;
}
