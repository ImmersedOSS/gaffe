package org.immersed.gaffe.java.security;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.PrivilegedAction;
import lombok.SneakyThrows;

/**
 * A computation to be performed with privileges enabled.  The computation is
 * performed by invoking {@code AccessController.doPrivileged} on the
 * {@code PrivilegedAction} object.  This interface is used only for
 * computations that do not throw checked exceptions; computations that
 * throw checked exceptions must use {@code PrivilegedExceptionAction}
 * instead.
 *
 * @see AccessController
 * @see AccessController#doPrivileged(PrivilegedAction)
 * @see PrivilegedExceptionAction
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingPrivilegedAction<T, X extends Throwable> extends PrivilegedAction<T> {
  @Override
  @SneakyThrows
  default T run() {
    return tryRun();
  }

  /**
   * Performs the computation.  This method will be called by
   * {@code AccessController.doPrivileged} after enabling privileges.
   *
   * @return a class-dependent value that may represent the results of the
   * computation. Each class that implements
   * {@code PrivilegedAction}
   * should document what (if anything) this value represents.
   * @see AccessController#doPrivileged(PrivilegedAction)
   * @see AccessController#doPrivileged(PrivilegedAction,
   * AccessControlContext)
   *
   * @throws X any exception that may be thrown.
   */
  T tryRun() throws X;
}
