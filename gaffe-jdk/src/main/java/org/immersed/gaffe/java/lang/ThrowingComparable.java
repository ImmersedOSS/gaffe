package org.immersed.gaffe.java.lang;

import java.lang.Comparable;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingComparable<T, X extends Throwable> extends Comparable<T> {
  @Override
  @SneakyThrows
  default int compareTo(T a) {
    return tryCompareTo(a);
  }

  int tryCompareTo(T a) throws X;
}
