package org.immersed.gaffe.java.net;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.net.FileNameMap;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingFileNameMap<X extends Throwable> extends FileNameMap {
  @Override
  @SneakyThrows
  default java.lang.String getContentTypeFor(java.lang.String a) {
    return tryGetContentTypeFor(a);
  }

  java.lang.String tryGetContentTypeFor(java.lang.String a) throws X;
}
