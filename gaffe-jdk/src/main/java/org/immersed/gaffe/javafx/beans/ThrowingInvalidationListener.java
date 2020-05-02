package org.immersed.gaffe.javafx.beans;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.beans.InvalidationListener;
import lombok.SneakyThrows;

/**
 * An {@code InvalidationListener} is notified whenever an {@link Observable}
 * becomes invalid. It can be registered and unregistered with
 * {@link Observable#addListener(InvalidationListener)} respectively
 * {@link Observable#removeListener(InvalidationListener)}
 * <p>
 * For an in-depth explanation of invalidation events and how they differ from
 * change events, see the documentation of {@code ObservableValue}.
 * <p>
 * The same instance of {@code InvalidationListener} can be registered to listen
 * to multiple {@code Observables}.
 *
 * @see Observable
 * @see ObservableValue
 *
 *
 * @since JavaFX 2.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingInvalidationListener<X extends Throwable> extends InvalidationListener
{
    @Override
    @SneakyThrows
    default void invalidated(javafx.beans.Observable observable)
    {
        tryInvalidated(observable);
    }

    /**
     * This method needs to be provided by an implementation of
     * {@code InvalidationListener}. It is called if an {@link Observable} becomes
     * invalid.
     * <p>
     * In general is is considered bad practice to modify the observed value in this
     * method.
     *
     * @param observable The {@code Observable} that became invalid
     *
     * @throws X any exception that may be thrown.
     */
    void tryInvalidated(javafx.beans.Observable observable) throws X;
}
