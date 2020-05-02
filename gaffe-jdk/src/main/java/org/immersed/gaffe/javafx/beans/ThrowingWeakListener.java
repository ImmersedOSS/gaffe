package org.immersed.gaffe.javafx.beans;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.beans.WeakListener;
import lombok.SneakyThrows;

/**
 * {@code WeakListener} is the super interface of all weak listener
 * implementations JavaFX runtime. Usually it should not be used directly, but
 * instead one of the sub-interfaces will be used.
 *
 * @see WeakInvalidationListener
 * @see javafx.beans.value.WeakChangeListener
 *
 *
 * @since JavaFX 2.1
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingWeakListener<X extends Throwable> extends WeakListener
{
    @Override
    @SneakyThrows
    default boolean wasGarbageCollected()
    {
        return tryWasGarbageCollected();
    }

    /**
     * Returns {@code true} if the linked listener was garbage-collected. In this
     * case, the listener can be removed from the observable.
     *
     * @return {@code true} if the linked listener was garbage-collected.
     *
     * @throws X any exception that may be thrown.
     */
    boolean tryWasGarbageCollected() throws X;
}
