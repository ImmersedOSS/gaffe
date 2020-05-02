package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.Consumer;
import lombok.SneakyThrows;

/**
 * Represents an operation that accepts a single input argument and returns no
 * result. Unlike most other functional interfaces, {@code Consumer} is expected
 * to operate via side-effects.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #accept(Object)}.
 *
 * @param <T> the type of the input to the operation
 *
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingConsumer<T, X extends Throwable> extends Consumer<T>
{
    @Override
    @SneakyThrows
    default void accept(T t)
    {
        tryAccept(t);
    }

    /**
     * Performs this operation on the given argument.
     *
     * @param t the input argument
     *
     * @throws X any exception that may be thrown.
     */
    void tryAccept(T t) throws X;
}
