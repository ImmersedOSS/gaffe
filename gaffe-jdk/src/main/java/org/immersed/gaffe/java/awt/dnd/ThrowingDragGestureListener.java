package org.immersed.gaffe.java.awt.dnd;

import java.awt.dnd.DragGestureListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * The listener interface for receiving drag gesture events. This interface is
 * intended for a drag gesture recognition implementation. See a specification
 * for {@code DragGestureRecognizer} for details on how to register the listener
 * interface. Upon recognition of a drag gesture the {@code
 * DragGestureRecognizer} calls this interface's {@link #dragGestureRecognized
 * dragGestureRecognized()} method and passes a {@code DragGestureEvent}.
 *
 *
 * @see java.awt.dnd.DragGestureRecognizer
 * @see java.awt.dnd.DragGestureEvent
 * @see java.awt.dnd.DragSource
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingDragGestureListener<X extends Throwable> extends DragGestureListener
{
    @Override
    @SneakyThrows
    default void dragGestureRecognized(java.awt.dnd.DragGestureEvent dge)
    {
        tryDragGestureRecognized(dge);
    }

    /**
     * This method is invoked by the {@code DragGestureRecognizer} when the
     * {@code DragGestureRecognizer} detects a platform-dependent drag initiating
     * gesture. To initiate the drag and drop operation, if appropriate,
     * {@link DragGestureEvent#startDrag startDrag()} method on the
     * {@code DragGestureEvent} has to be invoked.
     * <P>
     * 
     * @see java.awt.dnd.DragGestureRecognizer
     * @see java.awt.dnd.DragGestureEvent
     * @param dge the <code>DragGestureEvent</code> describing the gesture that has
     *            just occurred
     *
     * @throws X any exception that may be thrown.
     */
    void tryDragGestureRecognized(java.awt.dnd.DragGestureEvent dge) throws X;
}
