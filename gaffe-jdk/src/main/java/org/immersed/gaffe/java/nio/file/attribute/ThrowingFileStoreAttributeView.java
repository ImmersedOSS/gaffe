package org.immersed.gaffe.java.nio.file.attribute;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.nio.file.attribute.FileStoreAttributeView;
import lombok.SneakyThrows;

/**
 * An attribute view that is a read-only or updatable view of the attributes of
 * a {@link java.nio.file.FileStore}.
 *
 * @since 1.7
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingFileStoreAttributeView<X extends Throwable> extends FileStoreAttributeView
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
