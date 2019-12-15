package org.immersed.gaffe.java.awt.event;

import java.awt.event.ItemListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * The listener interface for receiving item events.
 * The class that is interested in processing an item event
 * implements this interface. The object created with that
 * class is then registered with a component using the
 * component's <code>addItemListener</code> method. When an
 * item-selection event occurs, the listener object's
 * <code>itemStateChanged</code> method is invoked.
 *
 * @author Amy Fowler
 *
 * @see java.awt.ItemSelectable
 * @see ItemEvent
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/itemlistener.html">Tutorial: Writing an Item Listener</a>
 *
 * @since 1.1
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingItemListener<X extends Throwable> extends ItemListener {
  @Override
  @SneakyThrows
  default void itemStateChanged(java.awt.event.ItemEvent e) {
    tryItemStateChanged(e);
  }

  /**
   * Invoked when an item has been selected or deselected by the user.
   * The code written for this method performs the operations
   * that need to occur when an item is selected (or deselected).
   *
   * @throws X any exception that may be thrown.
   */
  void tryItemStateChanged(java.awt.event.ItemEvent e) throws X;
}
