package org.immersed.gaffe.java.net;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.net.FileNameMap;
import lombok.SneakyThrows;

/**
 * A simple interface which provides a mechanism to map
 * between a file name and a MIME type string.
 *
 * @author  Steven B. Byrne
 * @since   JDK1.1
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingFileNameMap<X extends Throwable> extends FileNameMap {
  @Override
  @SneakyThrows
  default java.lang.String getContentTypeFor(java.lang.String fileName) {
    return tryGetContentTypeFor(fileName);
  }

  /**
   * Gets the MIME type for the specified file name.
   * @param fileName the specified file name
   * @return a {@code String} indicating the MIME
   * type for the specified file name.
   *
   * @throws X any exception that may be thrown.
   */
  java.lang.String tryGetContentTypeFor(java.lang.String fileName) throws X;
}
