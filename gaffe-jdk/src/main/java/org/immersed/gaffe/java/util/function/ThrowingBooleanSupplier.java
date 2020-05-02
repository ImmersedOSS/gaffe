package org.immersed.gaffe.java.util.function;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.util.function.BooleanSupplier;
import lombok.SneakyThrows;

/**
 * Represents a supplier of {@code boolean}-valued results. This is the
 * {@code boolean}-producing primitive specialization of {@link Supplier}.
 *
 * <p>
 * There is no requirement that a new or distinct result be returned each time
 * the supplier is invoked.
 *
 * <p>
 * This is a <a href="package-summary.html">functional interface</a> whose
 * functional method is {@link #getAsBoolean()}.
 *
 * @see Supplier
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingBooleanSupplier<X extends Throwable> extends BooleanSupplier
{
    @Override
    @SneakyThrows
    default boolean getAsBoolean()
    {
        return tryGetAsBoolean();
    }

    /**
     * Gets a result.
     *
     * @return a result
     *
     * @throws X any exception that may be thrown.
     */
    boolean tryGetAsBoolean() throws X;
}
