package org.immersed.gaffe.java.security.interfaces;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.security.interfaces.ECKey;
import lombok.SneakyThrows;

/**
 * The interface to an elliptic curve (EC) key.
 *
 * @author Valerie Peng
 *
 * @since 1.5
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingECKey<X extends Throwable> extends ECKey
{
    @Override
    @SneakyThrows
    default java.security.spec.ECParameterSpec getParams()
    {
        return tryGetParams();
    }

    /**
     * Returns the domain parameters associated with this key. The domain parameters
     * are either explicitly specified or implicitly created during key generation.
     * 
     * @return the associated domain parameters.
     *
     * @throws X any exception that may be thrown.
     */
    java.security.spec.ECParameterSpec tryGetParams() throws X;
}
