package org.immersed.gaffe.java.beans;

import java.beans.VetoableChangeListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * A VetoableChange event gets fired whenever a bean changes a "constrained"
 * property.  You can register a VetoableChangeListener with a source bean
 * so as to be notified of any constrained property updates.
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingVetoableChangeListener<X extends Throwable> extends VetoableChangeListener {
  @Override
  @SneakyThrows
  default void vetoableChange(java.beans.PropertyChangeEvent evt) {
    tryVetoableChange(evt);
  }

  /**
   * This method gets called when a constrained property is changed.
   *
   * @param     evt a <code>PropertyChangeEvent</code> object describing the
   * event source and the property that has changed.
   * @exception PropertyVetoException if the recipient wishes the property
   * change to be rolled back.
   *
   * @throws X any exception that may be thrown.
   */
  void tryVetoableChange(java.beans.PropertyChangeEvent evt) throws X;
}
