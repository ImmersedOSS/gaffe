package org.immersed.gaffe.java.security.interfaces;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.interfaces.RSAKey;
import lombok.SneakyThrows;

/**
 * The interface to an RSA public or private key.
 *
 * @author Jan Luehe
 *
 * @see RSAPublicKey
 * @see RSAPrivateKey
 *
 * @since 1.3
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingRSAKey<X extends Throwable> extends RSAKey
{
    @Override
    @SneakyThrows
    default java.math.BigInteger getModulus()
    {
        return tryGetModulus();
    }

    /**
     * Returns the modulus.
     *
     * @return the modulus
     *
     * @throws X any exception that may be thrown.
     */
    java.math.BigInteger tryGetModulus() throws X;
}
