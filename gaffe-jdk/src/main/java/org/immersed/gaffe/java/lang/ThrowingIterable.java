package org.immersed.gaffe.java.lang;

import java.lang.FunctionalInterface;
import java.lang.Iterable;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingIterable<T, X extends Throwable> extends Iterable<T> {
  @Override
  @SneakyThrows
  default java.util.Iterator<T> iterator() {
    return tryIterator();
  }

  java.util.Iterator<T> tryIterator() throws X;
}
