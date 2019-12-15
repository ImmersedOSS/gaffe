package org.immersed.gaffe.java.awt.datatransfer;

import java.awt.datatransfer.FlavorListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * Defines an object which listens for {@link FlavorEvent}s.
 *
 * @author Alexander Gerasimov
 * @since 1.5
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingFlavorListener<X extends Throwable> extends FlavorListener {
  @Override
  @SneakyThrows
  default void flavorsChanged(java.awt.datatransfer.FlavorEvent e) {
    tryFlavorsChanged(e);
  }

  /**
   * Invoked when the target {@link Clipboard} of the listener
   * has changed its available {@link DataFlavor}s.
   * <p>
   * Some notifications may be redundant &#151; they are not
   * caused by a change of the set of DataFlavors available
   * on the clipboard.
   * For example, if the clipboard subsystem supposes that
   * the system clipboard's contents has been changed but it
   * can't ascertain whether its DataFlavors have been changed
   * because of some exceptional condition when accessing the
   * clipboard, the notification is sent to ensure from omitting
   * a significant notification. Ordinarily, those redundant
   * notifications should be occasional.
   *
   * @param e  a <code>FlavorEvent</code> object
   *
   * @throws X any exception that may be thrown.
   */
  void tryFlavorsChanged(java.awt.datatransfer.FlavorEvent e) throws X;
}
