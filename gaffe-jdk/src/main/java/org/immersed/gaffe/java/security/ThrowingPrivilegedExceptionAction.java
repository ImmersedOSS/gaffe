package org.immersed.gaffe.java.security;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.PrivilegedExceptionAction;
import lombok.SneakyThrows;

/**
 * A computation to be performed with privileges enabled, that throws one or
 * more checked exceptions.  The computation is performed by invoking
 * {@code AccessController.doPrivileged} on the
 * {@code PrivilegedExceptionAction} object.  This interface is
 * used only for computations that throw checked exceptions;
 * computations that do not throw
 * checked exceptions should use {@code PrivilegedAction} instead.
 *
 * @see AccessController
 * @see AccessController#doPrivileged(PrivilegedExceptionAction)
 * @see AccessController#doPrivileged(PrivilegedExceptionAction,
 * AccessControlContext)
 * @see PrivilegedAction
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingPrivilegedExceptionAction<T, X extends Throwable> extends PrivilegedExceptionAction<T> {
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
   * computation.  Each class that implements
   * {@code PrivilegedExceptionAction} should document what
   * (if anything) this value represents.
   * @throws Exception an exceptional condition has occurred.  Each class
   * that implements {@code PrivilegedExceptionAction} should
   * document the exceptions that its run method can throw.
   * @see AccessController#doPrivileged(PrivilegedExceptionAction)
   * @see AccessController#doPrivileged(PrivilegedExceptionAction,AccessControlContext)
   *
   * @throws X any exception that may be thrown.
   */
  T tryRun() throws X;
}
