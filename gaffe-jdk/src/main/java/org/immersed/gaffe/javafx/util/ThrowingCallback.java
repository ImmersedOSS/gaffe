package org.immersed.gaffe.javafx.util;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.util.Callback;
import lombok.SneakyThrows;

/**
 * The Callback interface is designed to allow for a common, reusable interface
 * to exist for defining APIs that requires a call back in certain situations.
 * <p>
 * Callback is defined with two generic parameters: the first parameter
 * specifies the type of the object passed in to the <code>call</code> method,
 * with the second parameter specifying the return type of the method.
 *
 * @param <P> The type of the argument provided to the <code>call</code> method.
 * @param <R> The type of the return type of the <code>call</code> method.
 * @since JavaFX 2.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingCallback<P, R, X extends Throwable> extends Callback<P, R>
{
    @Override
    @SneakyThrows
    default R call(P param)
    {
        return tryCall(param);
    }

    /**
     * The <code>call</code> method is called when required, and is given a single
     * argument of type P, with a requirement that an object of type R is returned.
     *
     * @param param The single argument upon which the returned value should be
     *              determined.
     * @return An object of type R that may be determined based on the provided
     *         parameter value.
     *
     * @throws X any exception that may be thrown.
     */
    R tryCall(P param) throws X;
}
