package org.immersed.gaffe.java.lang;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Thread;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * Interface for handlers invoked when a <tt>Thread</tt> abruptly
 * terminates due to an uncaught exception.
 * <p>When a thread is about to terminate due to an uncaught exception
 * the Java Virtual Machine will query the thread for its
 * <tt>UncaughtExceptionHandler</tt> using
 * {@link #getUncaughtExceptionHandler} and will invoke the handler's
 * <tt>uncaughtException</tt> method, passing the thread and the
 * exception as arguments.
 * If a thread has not had its <tt>UncaughtExceptionHandler</tt>
 * explicitly set, then its <tt>ThreadGroup</tt> object acts as its
 * <tt>UncaughtExceptionHandler</tt>. If the <tt>ThreadGroup</tt> object
 * has no
 * special requirements for dealing with the exception, it can forward
 * the invocation to the {@linkplain #getDefaultUncaughtExceptionHandler
 * default uncaught exception handler}.
 *
 * @see #setDefaultUncaughtExceptionHandler
 * @see #setUncaughtExceptionHandler
 * @see ThreadGroup#uncaughtException
 * @since 1.5
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingUncaughtExceptionHandler<X extends Throwable> extends Thread.UncaughtExceptionHandler {
  @Override
  @SneakyThrows
  default void uncaughtException(java.lang.Thread t, java.lang.Throwable e) {
    tryUncaughtException(t,e);
  }

  /**
   * Method invoked when the given thread terminates due to the
   * given uncaught exception.
   * <p>Any exception thrown by this method will be ignored by the
   * Java Virtual Machine.
   * @param t the thread
   * @param e the exception
   *
   * @throws X any exception that may be thrown.
   */
  void tryUncaughtException(java.lang.Thread t, java.lang.Throwable e) throws X;
}
