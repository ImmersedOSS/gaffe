package org.immersed.gaffe.java.beans.beancontext;

import java.beans.beancontext.BeanContextContainerProxy;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * <p>
 * This interface is implemented by BeanContexts' that have an AWT Container
 * associated with them.
 * </p>
 *
 * @author Laurence P. G. Cable
 * @since 1.2
 *
 * @see java.beans.beancontext.BeanContext
 * @see java.beans.beancontext.BeanContextSupport
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingBeanContextContainerProxy<X extends Throwable> extends BeanContextContainerProxy {
  @Override
  @SneakyThrows
  default java.awt.Container getContainer() {
    return tryGetContainer();
  }

  /**
   * Gets the <code>java.awt.Container</code> associated
   * with this <code>BeanContext</code>.
   * @return the <code>java.awt.Container</code> associated
   * with this <code>BeanContext</code>.
   *
   * @throws X any exception that may be thrown.
   */
  java.awt.Container tryGetContainer() throws X;
}
