package org.immersed.gaffe.java.lang;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Thread;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingUncaughtExceptionHandler<X extends Throwable> extends Thread.UncaughtExceptionHandler {
  @Override
  @SneakyThrows
  default void uncaughtException(java.lang.Thread a, java.lang.Throwable b) {
    tryUncaughtException(a,b);
  }

  void tryUncaughtException(java.lang.Thread a, java.lang.Throwable b) throws X;
}
