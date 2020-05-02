package org.immersed.gaffe.java.net;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.net.ProtocolFamily;
import lombok.SneakyThrows;

/**
 * Represents a family of communication protocols.
 *
 * @since 1.7
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingProtocolFamily<X extends Throwable> extends ProtocolFamily
{
    @Override
    @SneakyThrows
    default java.lang.String name()
    {
        return tryName();
    }

    /**
     * Returns the name of the protocol family.
     *
     * @return the name of the protocol family
     *
     * @throws X any exception that may be thrown.
     */
    java.lang.String tryName() throws X;
}
