package org.immersed.gaffe.java.util.concurrent;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.concurrent.Executor;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingExecutor<X extends Throwable> extends Executor {
  @Override
  @SneakyThrows
  default void execute(java.lang.Runnable a) {
    tryExecute(a);
  }

  void tryExecute(java.lang.Runnable a) throws X;
}
