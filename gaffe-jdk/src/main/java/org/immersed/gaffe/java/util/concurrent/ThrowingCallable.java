package org.immersed.gaffe.java.util.concurrent;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.concurrent.Callable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingCallable<V, X extends Throwable> extends Callable<V> {
  @Override
  @SneakyThrows
  default V call() {
    return tryCall();
  }

  V tryCall() throws X;
}
