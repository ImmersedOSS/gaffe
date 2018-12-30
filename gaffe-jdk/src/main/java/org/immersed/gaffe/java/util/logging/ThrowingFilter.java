package org.immersed.gaffe.java.util.logging;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.logging.Filter;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingFilter<X extends Throwable> extends Filter {
  @Override
  @SneakyThrows
  default boolean isLoggable(java.util.logging.LogRecord a) {
    return tryIsLoggable(a);
  }

  boolean tryIsLoggable(java.util.logging.LogRecord a) throws X;
}
