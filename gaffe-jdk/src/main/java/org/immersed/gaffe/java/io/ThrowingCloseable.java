package org.immersed.gaffe.java.io;

import java.io.Closeable;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * A {@code Closeable} is a source or destination of data that can be closed.
 * The close method is invoked to release resources that the object is
 * holding (such as open files).
 *
 * @since 1.5
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingCloseable<X extends Throwable> extends Closeable {
  @Override
  @SneakyThrows
  default void close() {
    tryClose();
  }

  /**
   * Closes this stream and releases any system resources associated
   * with it. If the stream is already closed then invoking this
   * method has no effect.
   *
   * <p> As noted in {@link AutoCloseable#close()}, cases where the
   * close may fail require careful attention. It is strongly advised
   * to relinquish the underlying resources and to internally
   * <em>mark</em> the {@code Closeable} as closed, prior to throwing
   * the {@code IOException}.
   *
   * @throws IOException if an I/O error occurs
   *
   * @throws X any exception that may be thrown.
   */
  void tryClose() throws X;
}
