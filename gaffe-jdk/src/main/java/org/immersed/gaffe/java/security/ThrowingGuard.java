package org.immersed.gaffe.java.security;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.Guard;
import lombok.SneakyThrows;

/**
 * <p> This interface represents a guard, which is an object that is used
 * to protect access to another object.
 *
 * <p>This interface contains a single method, {@code checkGuard},
 * with a single {@code object} argument. {@code checkGuard} is
 * invoked (by the GuardedObject {@code getObject} method)
 * to determine whether or not to allow access to the object.
 *
 * @see GuardedObject
 *
 * @author Roland Schemers
 * @author Li Gong
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingGuard<X extends Throwable> extends Guard {
  @Override
  @SneakyThrows
  default void checkGuard(java.lang.Object object) {
    tryCheckGuard(object);
  }

  /**
   * Determines whether or not to allow access to the guarded object
   * {@code object}. Returns silently if access is allowed.
   * Otherwise, throws a SecurityException.
   *
   * @param object the object being protected by the guard.
   *
   * @exception SecurityException if access is denied.
   *
   *
   * @throws X any exception that may be thrown.
   */
  void tryCheckGuard(java.lang.Object object) throws X;
}
