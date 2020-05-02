package org.immersed.gaffe.java.awt.event;

import java.awt.event.HierarchyListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * The listener interface for receiving hierarchy changed events. The class that
 * is interested in processing a hierarchy changed event should implement this
 * interface. The listener object created from that class is then registered
 * with a Component using the Component's <code>addHierarchyListener</code>
 * method. When the hierarchy to which the Component belongs changes, the
 * <code>hierarchyChanged</code> method in the listener object is invoked, and
 * the <code>HierarchyEvent</code> is passed to it.
 * <p>
 * Hierarchy events are provided for notification purposes ONLY; The AWT will
 * automatically handle changes to the hierarchy internally so that GUI layout,
 * displayability, and visibility work properly regardless of whether a program
 * registers a <code>HierarchyListener</code> or not.
 *
 * @author David Mendenhall
 * @see HierarchyEvent
 * @since 1.3
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingHierarchyListener<X extends Throwable> extends HierarchyListener
{
    @Override
    @SneakyThrows
    default void hierarchyChanged(java.awt.event.HierarchyEvent e)
    {
        tryHierarchyChanged(e);
    }

    /**
     * Called when the hierarchy has been changed. To discern the actual type of
     * change, call <code>HierarchyEvent.getChangeFlags()</code>.
     *
     * @see HierarchyEvent#getChangeFlags()
     *
     * @throws X any exception that may be thrown.
     */
    void tryHierarchyChanged(java.awt.event.HierarchyEvent e) throws X;
}
