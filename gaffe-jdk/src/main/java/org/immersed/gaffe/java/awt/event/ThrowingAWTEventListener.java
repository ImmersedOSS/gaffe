package org.immersed.gaffe.java.awt.event;

import java.awt.event.AWTEventListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * The listener interface for receiving notification of events
 * dispatched to objects that are instances of Component or
 * MenuComponent or their subclasses.  Unlike the other EventListeners
 * in this package, AWTEventListeners passively observe events
 * being dispatched in the AWT, system-wide.  Most applications
 * should never use this class; applications which might use
 * AWTEventListeners include event recorders for automated testing,
 * and facilities such as the Java Accessibility package.
 * <p>
 * The class that is interested in monitoring AWT events
 * implements this interface, and the object created with that
 * class is registered with the Toolkit, using the Toolkit's
 * <code>addAWTEventListener</code> method.  When an event is
 * dispatched anywhere in the AWT, that object's
 * <code>eventDispatched</code> method is invoked.
 *
 * @see java.awt.AWTEvent
 * @see java.awt.Toolkit#addAWTEventListener
 * @see java.awt.Toolkit#removeAWTEventListener
 *
 * @author Fred Ecks
 * @since 1.2
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingAWTEventListener<X extends Throwable> extends AWTEventListener {
  @Override
  @SneakyThrows
  default void eventDispatched(java.awt.AWTEvent event) {
    tryEventDispatched(event);
  }

  /**
   * Invoked when an event is dispatched in the AWT.
   *
   * @throws X any exception that may be thrown.
   */
  void tryEventDispatched(java.awt.AWTEvent event) throws X;
}
