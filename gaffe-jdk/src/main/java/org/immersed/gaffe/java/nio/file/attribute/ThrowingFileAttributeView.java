package org.immersed.gaffe.java.nio.file.attribute;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.nio.file.attribute.FileAttributeView;
import lombok.SneakyThrows;

/**
 * An attribute view that is a read-only or updatable view of non-opaque values
 * associated with a file in a filesystem. This interface is extended or
 * implemented by specific file attribute views that define methods to read
 * and/or update the attributes of a file.
 *
 * @since 1.7
 *
 * @see java.nio.file.Files#getFileAttributeView(Path,Class,java.nio.file.LinkOption[])
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingFileAttributeView<X extends Throwable> extends FileAttributeView
{
    @Override
    @SneakyThrows
    default java.lang.String name()
    {
        return tryName();
    }

    /**
     * Returns the name of the attribute view.
     *
     * @return the name of the attribute view
     *
     * @throws X any exception that may be thrown.
     */
    java.lang.String tryName() throws X;
}
