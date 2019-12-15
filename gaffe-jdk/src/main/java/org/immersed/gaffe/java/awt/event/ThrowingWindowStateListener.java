package org.immersed.gaffe.java.awt.event;

import java.awt.event.WindowStateListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * The listener interface for receiving window state events.
 * <p>
 * The class that is interested in processing a window state event
 * either implements this interface (and all the methods it contains)
 * or extends the abstract <code>WindowAdapter</code> class
 * (overriding only the methods of interest).
 * <p>
 * The listener object created from that class is then registered with
 * a window using the <code>Window</code>'s
 * <code>addWindowStateListener</code> method.  When the window's
 * state changes by virtue of being iconified, maximized etc., the
 * <code>windowStateChanged</code> method in the listener object is
 * invoked, and the <code>WindowEvent</code> is passed to it.
 *
 * @see java.awt.event.WindowAdapter
 * @see java.awt.event.WindowEvent
 *
 * @since 1.4
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingWindowStateListener<X extends Throwable> extends WindowStateListener {
  @Override
  @SneakyThrows
  default void windowStateChanged(java.awt.event.WindowEvent e) {
    tryWindowStateChanged(e);
  }

  /**
   * Invoked when window state is changed.
   *
   * @throws X any exception that may be thrown.
   */
  void tryWindowStateChanged(java.awt.event.WindowEvent e) throws X;
}
