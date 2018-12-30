package org.immersed.gaffe.java.util;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.Formattable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingFormattable<X extends Throwable> extends Formattable {
  @Override
  @SneakyThrows
  default void formatTo(java.util.Formatter a, int b, int c, int d) {
    tryFormatTo(a,b,c,d);
  }

  void tryFormatTo(java.util.Formatter a, int b, int c, int d) throws X;
}
