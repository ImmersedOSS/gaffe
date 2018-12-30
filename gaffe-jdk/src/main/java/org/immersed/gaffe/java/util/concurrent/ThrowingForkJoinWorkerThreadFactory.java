package org.immersed.gaffe.java.util.concurrent;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.concurrent.ForkJoinPool;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingForkJoinWorkerThreadFactory<X extends Throwable> extends ForkJoinPool.ForkJoinWorkerThreadFactory {
  @Override
  @SneakyThrows
  default java.util.concurrent.ForkJoinWorkerThread newThread(java.util.concurrent.ForkJoinPool a) {
    return tryNewThread(a);
  }

  java.util.concurrent.ForkJoinWorkerThread tryNewThread(java.util.concurrent.ForkJoinPool a) throws
      X;
}
