package org.immersed.gaffe.java.net;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.net.CookiePolicy;
import lombok.SneakyThrows;

/**
 * CookiePolicy implementations decide which cookies should be accepted and
 * which should be rejected. Three pre-defined policy implementations are
 * provided, namely ACCEPT_ALL, ACCEPT_NONE and ACCEPT_ORIGINAL_SERVER.
 *
 * <p>
 * See RFC 2965 sec. 3.3 and 7 for more detail.
 *
 * @author Edward Wang
 * @since 1.6
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingCookiePolicy<X extends Throwable> extends CookiePolicy
{
    @Override
    @SneakyThrows
    default boolean shouldAccept(java.net.URI uri, java.net.HttpCookie cookie)
    {
        return tryShouldAccept(uri, cookie);
    }

    /**
     * Will be called to see whether or not this cookie should be accepted.
     *
     * @param uri    the URI to consult accept policy with
     * @param cookie the HttpCookie object in question
     * @return {@code true} if this cookie should be accepted; otherwise,
     *         {@code false}
     *
     * @throws X any exception that may be thrown.
     */
    boolean tryShouldAccept(java.net.URI uri, java.net.HttpCookie cookie) throws X;
}
