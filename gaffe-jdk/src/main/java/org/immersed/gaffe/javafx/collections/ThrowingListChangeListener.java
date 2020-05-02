package org.immersed.gaffe.javafx.collections;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.collections.ListChangeListener;
import lombok.SneakyThrows;

/**
 * Interface that receives notifications of changes to an ObservableList.
 *
 * @param <E> the list element type
 * @see Change
 * @since JavaFX 2.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingListChangeListener<E, X extends Throwable> extends ListChangeListener<E>
{
    @Override
    @SneakyThrows
    default void onChanged(javafx.collections.ListChangeListener.Change<? extends E> c)
    {
        tryOnChanged(c);
    }

    /**
     * Called after a change has been made to an ObservableList.
     *
     * @param c an object representing the change that was done
     * @see Change
     *
     * @throws X any exception that may be thrown.
     */
    void tryOnChanged(javafx.collections.ListChangeListener.Change<? extends E> c) throws X;
}
