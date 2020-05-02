package org.immersed.gaffe.java.awt.event;

import java.awt.event.AdjustmentListener;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * The listener interface for receiving adjustment events.
 *
 * @author Amy Fowler
 * @since 1.1
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingAdjustmentListener<X extends Throwable> extends AdjustmentListener
{
    @Override
    @SneakyThrows
    default void adjustmentValueChanged(java.awt.event.AdjustmentEvent e)
    {
        tryAdjustmentValueChanged(e);
    }

    /**
     * Invoked when the value of the adjustable has changed.
     *
     * @throws X any exception that may be thrown.
     */
    void tryAdjustmentValueChanged(java.awt.event.AdjustmentEvent e) throws X;
}
