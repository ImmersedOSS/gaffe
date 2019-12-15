package org.immersed.gaffe.java.rmi.server;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.rmi.server.Unreferenced;
import lombok.SneakyThrows;

/**
 * A remote object implementation should implement the
 * <code>Unreferenced</code> interface to receive notification when there are
 * no more clients that reference that remote object.
 *
 * @author  Ann Wollrath
 * @author  Roger Riggs
 * @since   JDK1.1
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingUnreferenced<X extends Throwable> extends Unreferenced {
  @Override
  @SneakyThrows
  default void unreferenced() {
    tryUnreferenced();
  }

  /**
   * Called by the RMI runtime sometime after the runtime determines that
   * the reference list, the list of clients referencing the remote object,
   * becomes empty.
   * @since JDK1.1
   *
   * @throws X any exception that may be thrown.
   */
  void tryUnreferenced() throws X;
}
