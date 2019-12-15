package org.immersed.gaffe.java.awt.event;

import java.awt.event.MouseWheelListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * The listener interface for receiving mouse wheel events on a component.
 * (For clicks and other mouse events, use the <code>MouseListener</code>.
 * For mouse movement and drags, use the <code>MouseMotionListener</code>.)
 * <P>
 * The class that is interested in processing a mouse wheel event
 * implements this interface (and all the methods it contains).
 * <P>
 * The listener object created from that class is then registered with a
 * component using the component's <code>addMouseWheelListener</code>
 * method. A mouse wheel event is generated when the mouse wheel is rotated.
 * When a mouse wheel event occurs, that object's <code>mouseWheelMoved</code>
 * method is invoked.
 * <p>
 * For information on how mouse wheel events are dispatched, see
 * the class description for {@link MouseWheelEvent}.
 *
 * @author Brent Christian
 * @see MouseWheelEvent
 * @since 1.4
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingMouseWheelListener<X extends Throwable> extends MouseWheelListener {
  @Override
  @SneakyThrows
  default void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
    tryMouseWheelMoved(e);
  }

  /**
   * Invoked when the mouse wheel is rotated.
   * @see MouseWheelEvent
   *
   * @throws X any exception that may be thrown.
   */
  void tryMouseWheelMoved(java.awt.event.MouseWheelEvent e) throws X;
}
