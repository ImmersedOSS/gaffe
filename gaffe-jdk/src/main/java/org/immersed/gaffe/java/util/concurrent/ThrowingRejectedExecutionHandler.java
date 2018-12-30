package org.immersed.gaffe.java.util.concurrent;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.concurrent.RejectedExecutionHandler;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingRejectedExecutionHandler<X extends Throwable> extends RejectedExecutionHandler {
  @Override
  @SneakyThrows
  default void rejectedExecution(java.lang.Runnable a, java.util.concurrent.ThreadPoolExecutor b) {
    tryRejectedExecution(a,b);
  }

  void tryRejectedExecution(java.lang.Runnable a, java.util.concurrent.ThreadPoolExecutor b) throws
      X;
}
