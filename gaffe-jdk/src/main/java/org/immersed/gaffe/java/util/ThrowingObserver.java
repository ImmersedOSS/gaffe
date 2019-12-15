package org.immersed.gaffe.java.util;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.Observer;
import lombok.SneakyThrows;

/**
 * A class can implement the <code>Observer</code> interface when it
 * wants to be informed of changes in observable objects.
 *
 * @author  Chris Warth
 * @see     java.util.Observable
 * @since   JDK1.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingObserver<X extends Throwable> extends Observer {
  @Override
  @SneakyThrows
  default void update(java.util.Observable o, java.lang.Object arg) {
    tryUpdate(o,arg);
  }

  /**
   * This method is called whenever the observed object is changed. An
   * application calls an <tt>Observable</tt> object's
   * <code>notifyObservers</code> method to have all the object's
   * observers notified of the change.
   *
   * @param   o     the observable object.
   * @param   arg   an argument passed to the <code>notifyObservers</code>
   * method.
   *
   * @throws X any exception that may be thrown.
   */
  void tryUpdate(java.util.Observable o, java.lang.Object arg) throws X;
}
