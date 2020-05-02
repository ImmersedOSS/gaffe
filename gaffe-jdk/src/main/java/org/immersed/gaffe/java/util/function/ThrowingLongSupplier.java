package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.LongSupplier;
import lombok.SneakyThrows;

/**
 * Represents a supplier of {@code long}-valued results. This is the
 * {@code long}-producing primitive specialization of {@link Supplier}.
 *
 * <p>
 * There is no requirement that a distinct result be returned each time the
 * supplier is invoked.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #getAsLong()}.
 *
 * @see Supplier
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingLongSupplier<X extends Throwable> extends LongSupplier
{
    @Override
    @SneakyThrows
    default long getAsLong()
    {
        return tryGetAsLong();
    }

    /**
     * Gets a result.
     *
     * @return a result
     *
     * @throws X any exception that may be thrown.
     */
    long tryGetAsLong() throws X;
}
