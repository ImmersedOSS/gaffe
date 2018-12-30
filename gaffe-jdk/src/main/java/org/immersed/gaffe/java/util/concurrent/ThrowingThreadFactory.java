package org.immersed.gaffe.java.util.concurrent;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.concurrent.ThreadFactory;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingThreadFactory<X extends Throwable> extends ThreadFactory {
  @Override
  @SneakyThrows
  default java.lang.Thread newThread(java.lang.Runnable a) {
    return tryNewThread(a);
  }

  java.lang.Thread tryNewThread(java.lang.Runnable a) throws X;
}
