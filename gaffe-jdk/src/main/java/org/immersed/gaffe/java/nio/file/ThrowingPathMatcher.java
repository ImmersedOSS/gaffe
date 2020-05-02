package org.immersed.gaffe.java.nio.file;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.nio.file.PathMatcher;
import lombok.SneakyThrows;

/**
 * An interface that is implemented by objects that perform match operations on
 * paths.
 *
 * @since 1.7
 *
 * @see FileSystem#getPathMatcher
 * @see Files#newDirectoryStream(Path,String)
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingPathMatcher<X extends Throwable> extends PathMatcher
{
    @Override
    @SneakyThrows
    default boolean matches(java.nio.file.Path path)
    {
        return tryMatches(path);
    }

    /**
     * Tells if given path matches this matcher's pattern.
     *
     * @param path the path to match
     *
     * @return {@code true} if, and only if, the path matches this matcher's pattern
     *
     * @throws X any exception that may be thrown.
     */
    boolean tryMatches(java.nio.file.Path path) throws X;
}
