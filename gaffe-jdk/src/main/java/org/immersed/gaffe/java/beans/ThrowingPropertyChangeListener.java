package org.immersed.gaffe.java.beans;

import java.beans.PropertyChangeListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * A "PropertyChange" event gets fired whenever a bean changes a "bound"
 * property.  You can register a PropertyChangeListener with a source
 * bean so as to be notified of any bound property updates.
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingPropertyChangeListener<X extends Throwable> extends PropertyChangeListener {
  @Override
  @SneakyThrows
  default void propertyChange(java.beans.PropertyChangeEvent evt) {
    tryPropertyChange(evt);
  }

  /**
   * This method gets called when a bound property is changed.
   * @param evt A PropertyChangeEvent object describing the event source
   * and the property that has changed.
   *
   * @throws X any exception that may be thrown.
   */
  void tryPropertyChange(java.beans.PropertyChangeEvent evt) throws X;
}
