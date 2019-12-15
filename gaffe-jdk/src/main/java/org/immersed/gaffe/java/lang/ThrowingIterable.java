package org.immersed.gaffe.java.lang;

import java.lang.FunctionalInterface;
import java.lang.Iterable;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * Implementing this interface allows an object to be the target of
 * the "for-each loop" statement. See
 * <strong>
 * <a href="{@docRoot}/../technotes/guides/language/foreach.html">For-each Loop</a>
 * </strong>
 *
 * @param <T> the type of elements returned by the iterator
 *
 * @since 1.5
 * @jls 14.14.2 The enhanced for statement
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingIterable<T, X extends Throwable> extends Iterable<T> {
  @Override
  @SneakyThrows
  default java.util.Iterator<T> iterator() {
    return tryIterator();
  }

  /**
   * Returns an iterator over elements of type {@code T}.
   *
   * @return an Iterator.
   *
   * @throws X any exception that may be thrown.
   */
  java.util.Iterator<T> tryIterator() throws X;
}
