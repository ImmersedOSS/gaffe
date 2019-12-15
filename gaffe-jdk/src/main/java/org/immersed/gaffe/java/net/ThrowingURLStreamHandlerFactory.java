package org.immersed.gaffe.java.net;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.net.URLStreamHandlerFactory;
import lombok.SneakyThrows;

/**
 * This interface defines a factory for {@code URL} stream
 * protocol handlers.
 * <p>
 * It is used by the {@code URL} class to create a
 * {@code URLStreamHandler} for a specific protocol.
 *
 * @author  Arthur van Hoff
 * @see     java.net.URL
 * @see     java.net.URLStreamHandler
 * @since   JDK1.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingURLStreamHandlerFactory<X extends Throwable> extends URLStreamHandlerFactory {
  @Override
  @SneakyThrows
  default java.net.URLStreamHandler createURLStreamHandler(java.lang.String protocol) {
    return tryCreateURLStreamHandler(protocol);
  }

  /**
   * Creates a new {@code URLStreamHandler} instance with the specified
   * protocol.
   *
   * @param   protocol   the protocol ("{@code ftp}",
   * "{@code http}", "{@code nntp}", etc.).
   * @return  a {@code URLStreamHandler} for the specific protocol.
   * @see     java.net.URLStreamHandler
   *
   * @throws X any exception that may be thrown.
   */
  java.net.URLStreamHandler tryCreateURLStreamHandler(java.lang.String protocol) throws X;
}
