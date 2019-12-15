package org.immersed.gaffe.java.net;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.net.ContentHandlerFactory;
import lombok.SneakyThrows;

/**
 * This interface defines a factory for content handlers. An
 * implementation of this interface should map a MIME type into an
 * instance of {@code ContentHandler}.
 * <p>
 * This interface is used by the {@code URLStreamHandler} class
 * to create a {@code ContentHandler} for a MIME type.
 *
 * @author  James Gosling
 * @see     java.net.ContentHandler
 * @see     java.net.URLStreamHandler
 * @since   JDK1.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingContentHandlerFactory<X extends Throwable> extends ContentHandlerFactory {
  @Override
  @SneakyThrows
  default java.net.ContentHandler createContentHandler(java.lang.String mimetype) {
    return tryCreateContentHandler(mimetype);
  }

  /**
   * Creates a new {@code ContentHandler} to read an object from
   * a {@code URLStreamHandler}.
   *
   * @param   mimetype   the MIME type for which a content handler is desired.
   *
   * @return  a new {@code ContentHandler} to read an object from a
   * {@code URLStreamHandler}.
   * @see     java.net.ContentHandler
   * @see     java.net.URLStreamHandler
   *
   * @throws X any exception that may be thrown.
   */
  java.net.ContentHandler tryCreateContentHandler(java.lang.String mimetype) throws X;
}
