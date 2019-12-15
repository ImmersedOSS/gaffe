package org.immersed.gaffe.java.util.concurrent;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.concurrent.ThreadFactory;
import lombok.SneakyThrows;

/**
 * An object that creates new threads on demand.  Using thread factories
 * removes hardwiring of calls to {@link Thread#Thread(Runnable) new Thread},
 * enabling applications to use special thread subclasses, priorities, etc.
 *
 * <p>
 * The simplest implementation of this interface is just:
 * <pre> {@code
 * class SimpleThreadFactory implements ThreadFactory {
 * public Thread newThread(Runnable r) {
 * return new Thread(r);
 * }
 * }}</pre>
 *
 * The {@link Executors#defaultThreadFactory} method provides a more
 * useful simple implementation, that sets the created thread context
 * to known values before returning it.
 * @since 1.5
 * @author Doug Lea
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingThreadFactory<X extends Throwable> extends ThreadFactory {
  @Override
  @SneakyThrows
  default java.lang.Thread newThread(java.lang.Runnable r) {
    return tryNewThread(r);
  }

  /**
   * Constructs a new {@code Thread}.  Implementations may also initialize
   * priority, name, daemon status, {@code ThreadGroup}, etc.
   *
   * @param r a runnable to be executed by new thread instance
   * @return constructed thread, or {@code null} if the request to
   * create a thread is rejected
   *
   * @throws X any exception that may be thrown.
   */
  java.lang.Thread tryNewThread(java.lang.Runnable r) throws X;
}
