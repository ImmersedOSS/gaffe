package org.immersed.gaffe.java.awt.event;

import java.awt.event.ActionListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * The listener interface for receiving action events.
 * The class that is interested in processing an action event
 * implements this interface, and the object created with that
 * class is registered with a component, using the component's
 * <code>addActionListener</code> method. When the action event
 * occurs, that object's <code>actionPerformed</code> method is
 * invoked.
 *
 * @see ActionEvent
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/actionlistener.html">How to Write an Action Listener</a>
 *
 * @author Carl Quinn
 * @since 1.1
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingActionListener<X extends Throwable> extends ActionListener {
  @Override
  @SneakyThrows
  default void actionPerformed(java.awt.event.ActionEvent e) {
    tryActionPerformed(e);
  }

  /**
   * Invoked when an action occurs.
   *
   * @throws X any exception that may be thrown.
   */
  void tryActionPerformed(java.awt.event.ActionEvent e) throws X;
}
