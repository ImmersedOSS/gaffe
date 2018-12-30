package org.immersed.gaffe.java.net;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.net.URLStreamHandlerFactory;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingURLStreamHandlerFactory<X extends Throwable> extends URLStreamHandlerFactory {
  @Override
  @SneakyThrows
  default java.net.URLStreamHandler createURLStreamHandler(java.lang.String a) {
    return tryCreateURLStreamHandler(a);
  }

  java.net.URLStreamHandler tryCreateURLStreamHandler(java.lang.String a) throws X;
}
