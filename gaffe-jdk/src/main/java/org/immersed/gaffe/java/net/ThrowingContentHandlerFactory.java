package org.immersed.gaffe.java.net;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.net.ContentHandlerFactory;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingContentHandlerFactory<X extends Throwable> extends ContentHandlerFactory {
  @Override
  @SneakyThrows
  default java.net.ContentHandler createContentHandler(java.lang.String a) {
    return tryCreateContentHandler(a);
  }

  java.net.ContentHandler tryCreateContentHandler(java.lang.String a) throws X;
}
