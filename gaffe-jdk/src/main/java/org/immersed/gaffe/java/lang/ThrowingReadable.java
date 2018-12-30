package org.immersed.gaffe.java.lang;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Readable;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingReadable<X extends Throwable> extends Readable {
  @Override
  @SneakyThrows
  default int read(java.nio.CharBuffer a) {
    return tryRead(a);
  }

  int tryRead(java.nio.CharBuffer a) throws X;
}
