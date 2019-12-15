package org.immersed.gaffe.java.beans;

import java.beans.ExceptionListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * An ExceptionListener is notified of internal exceptions.
 *
 * @since 1.4
 *
 * @author Philip Milne
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingExceptionListener<X extends Throwable> extends ExceptionListener {
  @Override
  @SneakyThrows
  default void exceptionThrown(java.lang.Exception e) {
    tryExceptionThrown(e);
  }

  /**
   * This method is called when a recoverable exception has
   * been caught.
   *
   * @param e The exception that was caught.
   *
   *
   * @throws X any exception that may be thrown.
   */
  void tryExceptionThrown(java.lang.Exception e) throws X;
}
