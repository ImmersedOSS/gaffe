package org.immersed.gaffe.javafx.collections;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.collections.ArrayChangeListener;
import lombok.SneakyThrows;

/**
 * Interface that receives notifications of changes to an ObservableArray.
 * 
 * @since JavaFX 8.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingArrayChangeListener<T extends javafx.collections.ObservableArray<T>, X extends Throwable>
        extends ArrayChangeListener<T>
{
    @Override
    @SneakyThrows
    default void onChanged(T observableArray, boolean sizeChanged, int from, int to)
    {
        tryOnChanged(observableArray, sizeChanged, from, to);
    }

    /**
     * Called after a change has been made to an ObservableArray.
     *
     * @param sizeChanged indicates size of array changed
     * @param from        A beginning (inclusive) of an interval related to the
     *                    change
     * @param to          An end (exclusive) of an interval related to the change.
     *
     * @throws X any exception that may be thrown.
     */
    void tryOnChanged(T observableArray, boolean sizeChanged, int from, int to) throws X;
}
