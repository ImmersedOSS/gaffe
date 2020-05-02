package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.DoubleSupplier;
import lombok.SneakyThrows;

/**
 * Represents a supplier of {@code double}-valued results. This is the
 * {@code double}-producing primitive specialization of {@link Supplier}.
 *
 * <p>
 * There is no requirement that a distinct result be returned each time the
 * supplier is invoked.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #getAsDouble()}.
 *
 * @see Supplier
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingDoubleSupplier<X extends Throwable> extends DoubleSupplier
{
    @Override
    @SneakyThrows
    default double getAsDouble()
    {
        return tryGetAsDouble();
    }

    /**
     * Gets a result.
     *
     * @return a result
     *
     * @throws X any exception that may be thrown.
     */
    double tryGetAsDouble() throws X;
}
