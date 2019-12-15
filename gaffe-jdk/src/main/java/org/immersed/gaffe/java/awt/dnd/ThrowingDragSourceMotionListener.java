package org.immersed.gaffe.java.awt.dnd;

import java.awt.dnd.DragSourceMotionListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * A listener interface for receiving mouse motion events during a drag
 * operation.
 * <p>
 * The class that is interested in processing mouse motion events during
 * a drag operation either implements this interface or extends the abstract
 * <code>DragSourceAdapter</code> class (overriding only the methods of
 * interest).
 * <p>
 * Create a listener object using that class and then register it with
 * a <code>DragSource</code>. Whenever the mouse moves during a drag
 * operation initiated with this <code>DragSource</code>, that object's
 * <code>dragMouseMoved</code> method is invoked, and the
 * <code>DragSourceDragEvent</code> is passed to it.
 *
 * @see DragSourceDragEvent
 * @see DragSource
 * @see DragSourceListener
 * @see DragSourceAdapter
 *
 * @since 1.4
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingDragSourceMotionListener<X extends Throwable> extends DragSourceMotionListener {
  @Override
  @SneakyThrows
  default void dragMouseMoved(java.awt.dnd.DragSourceDragEvent dsde) {
    tryDragMouseMoved(dsde);
  }

  /**
   * Called whenever the mouse is moved during a drag operation.
   *
   * @param dsde the <code>DragSourceDragEvent</code>
   *
   * @throws X any exception that may be thrown.
   */
  void tryDragMouseMoved(java.awt.dnd.DragSourceDragEvent dsde) throws X;
}
