package org.immersed.gaffe.java.time.chrono;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.time.chrono.Era;
import lombok.SneakyThrows;

/**
 * An era of the time-line.
 * <p>
 * Most calendar systems have a single epoch dividing the time-line into two
 * eras. However, some calendar systems, have multiple eras, such as one for the
 * reign of each leader. In all cases, the era is conceptually the largest
 * division of the time-line. Each chronology defines the Era's that are known
 * Eras and a {@link Chronology#eras Chronology.eras} to get the valid eras.
 * <p>
 * For example, the Thai Buddhist calendar system divides time into two eras,
 * before and after a single date. By contrast, the Japanese calendar system has
 * one era for the reign of each Emperor.
 * <p>
 * Instances of {@code Era} may be compared using the {@code ==} operator.
 *
 * @implSpec This interface must be implemented with care to ensure other
 *           classes operate correctly. All implementations must be singletons -
 *           final, immutable and thread-safe. It is recommended to use an enum
 *           whenever possible.
 *
 * @since 1.8
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingEra<X extends Throwable> extends Era
{
    @Override
    @SneakyThrows
    default int getValue()
    {
        return tryGetValue();
    }

    /**
     * Gets the numeric value associated with the era as defined by the chronology.
     * Each chronology defines the predefined Eras and methods to list the Eras of
     * the chronology.
     * <p>
     * All fields, including eras, have an associated numeric value. The meaning of
     * the numeric value for era is determined by the chronology according to these
     * principles:
     * <ul>
     * <li>The era in use at the epoch 1970-01-01 (ISO) has the value 1.
     * <li>Later eras have sequentially higher values.
     * <li>Earlier eras have sequentially lower values, which may be negative.
     * </ul>
     *
     * @return the numeric era value
     *
     * @throws X any exception that may be thrown.
     */
    int tryGetValue() throws X;
}
