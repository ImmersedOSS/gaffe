package org.immersed.gaffe.java.beans.beancontext;

import java.beans.beancontext.BeanContextServiceRevokedListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * The listener interface for receiving
 * <code>BeanContextServiceRevokedEvent</code> objects. A class that is
 * interested in processing a <code>BeanContextServiceRevokedEvent</code>
 * implements this interface.
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingBeanContextServiceRevokedListener<X extends Throwable> extends BeanContextServiceRevokedListener {
  @Override
  @SneakyThrows
  default void serviceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent bcsre) {
    tryServiceRevoked(bcsre);
  }

  /**
   * The service named has been revoked. getService requests for
   * this service will no longer be satisfied.
   * @param bcsre the <code>BeanContextServiceRevokedEvent</code> received
   * by this listener.
   *
   * @throws X any exception that may be thrown.
   */
  void tryServiceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent bcsre) throws X;
}
