package org.immersed.gaffe.java.io;

import java.io.FileFilter;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * A filter for abstract pathnames.
 *
 * <p>
 * Instances of this interface may be passed to the <code>{@link
 * File#listFiles(java.io.FileFilter) listFiles(FileFilter)}</code> method of
 * the <code>{@link java.io.File}</code> class.
 *
 * @since 1.2
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingFileFilter<X extends Throwable> extends FileFilter
{
    @Override
    @SneakyThrows
    default boolean accept(java.io.File pathname)
    {
        return tryAccept(pathname);
    }

    /**
     * Tests whether or not the specified abstract pathname should be included in a
     * pathname list.
     *
     * @param pathname The abstract pathname to be tested
     * @return <code>true</code> if and only if <code>pathname</code> should be
     *         included
     *
     * @throws X any exception that may be thrown.
     */
    boolean tryAccept(java.io.File pathname) throws X;
}
