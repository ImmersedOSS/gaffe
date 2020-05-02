package org.immersed.gaffe.java.nio.file;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.nio.file.WatchEvent;
import lombok.SneakyThrows;

/**
 * An event modifier that qualifies how a {@link Watchable} is registered with a
 * {@link WatchService}.
 *
 * <p>
 * This release does not define any <em>standard</em> modifiers.
 *
 * @since 1.7
 * @see Watchable#register
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingModifier<X extends Throwable> extends WatchEvent.Modifier
{
    @Override
    @SneakyThrows
    default java.lang.String name()
    {
        return tryName();
    }

    /**
     * Returns the name of the modifier.
     *
     * @return the name of the modifier
     *
     * @throws X any exception that may be thrown.
     */
    java.lang.String tryName() throws X;
}
