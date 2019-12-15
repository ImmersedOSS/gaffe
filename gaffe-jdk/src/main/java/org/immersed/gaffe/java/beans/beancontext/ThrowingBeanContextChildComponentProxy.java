package org.immersed.gaffe.java.beans.beancontext;

import java.beans.beancontext.BeanContextChildComponentProxy;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * <p>
 * This interface is implemented by
 * <code>BeanContextChildren</code> that have an AWT <code>Component</code>
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
public interface ThrowingBeanContextChildComponentProxy<X extends Throwable> extends BeanContextChildComponentProxy {
  @Override
  @SneakyThrows
  default java.awt.Component getComponent() {
    return tryGetComponent();
  }

  /**
   * Gets the <code>java.awt.Component</code> associated with
   * this <code>BeanContextChild</code>.
   * @return the AWT <code>Component</code> associated with
   * this <code>BeanContextChild</code>
   *
   * @throws X any exception that may be thrown.
   */
  java.awt.Component tryGetComponent() throws X;
}
