package org.immersed.gaffe.java.nio.file;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.nio.file.DirectoryStream;
import lombok.SneakyThrows;

/**
 * An interface that is implemented by objects that decide if a directory entry
 * should be accepted or filtered. A {@code Filter} is passed as the parameter
 * to the {@link Files#newDirectoryStream(Path,DirectoryStream.Filter)} method
 * when opening a directory to iterate over the entries in the directory.
 *
 * @param <T> the type of the directory entry
 *
 * @since 1.7
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingFilter<T, X extends Throwable> extends DirectoryStream.Filter<T>
{
    @Override
    @SneakyThrows
    default boolean accept(T entry)
    {
        return tryAccept(entry);
    }

    /**
     * Decides if the given directory entry should be accepted or filtered.
     *
     * @param entry the directory entry to be tested
     *
     * @return {@code true} if the directory entry should be accepted
     *
     * @throws IOException If an I/O error occurs
     *
     * @throws X           any exception that may be thrown.
     */
    boolean tryAccept(T entry) throws X;
}
