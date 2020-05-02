package org.immersed.gaffe.java.awt.event;

import java.awt.event.TextListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * The listener interface for receiving text events.
 *
 * The class that is interested in processing a text event implements this
 * interface. The object created with that class is then registered with a
 * component using the component's <code>addTextListener</code> method. When the
 * component's text changes, the listener object's <code>textValueChanged</code>
 * method is invoked.
 *
 * @author Georges Saab
 *
 * @see TextEvent
 *
 * @since 1.1
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingTextListener<X extends Throwable> extends TextListener
{
    @Override
    @SneakyThrows
    default void textValueChanged(java.awt.event.TextEvent e)
    {
        tryTextValueChanged(e);
    }

    /**
     * Invoked when the value of the text has changed. The code written for this
     * method performs the operations that need to occur when text changes.
     *
     * @throws X any exception that may be thrown.
     */
    void tryTextValueChanged(java.awt.event.TextEvent e) throws X;
}
