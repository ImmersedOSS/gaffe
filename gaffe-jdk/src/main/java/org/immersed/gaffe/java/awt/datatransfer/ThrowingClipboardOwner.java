package org.immersed.gaffe.java.awt.datatransfer;

import java.awt.datatransfer.ClipboardOwner;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * Defines the interface for classes that will provide data to a clipboard. An
 * instance of this interface becomes the owner of the contents of a clipboard
 * (clipboard owner) if it is passed as an argument to
 * {@link java.awt.datatransfer.Clipboard#setContents} method of the clipboard
 * and this method returns successfully. The instance remains the clipboard
 * owner until another application or another object within this application
 * asserts ownership of this clipboard.
 *
 * @see java.awt.datatransfer.Clipboard
 *
 * @author Amy Fowler
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingClipboardOwner<X extends Throwable> extends ClipboardOwner
{
    @Override
    @SneakyThrows
    default void lostOwnership(java.awt.datatransfer.Clipboard clipboard, java.awt.datatransfer.Transferable contents)
    {
        tryLostOwnership(clipboard, contents);
    }

    /**
     * Notifies this object that it is no longer the clipboard owner. This method
     * will be called when another application or another object within this
     * application asserts ownership of the clipboard.
     *
     * @param clipboard the clipboard that is no longer owned
     * @param contents  the contents which this owner had placed on the clipboard
     *
     * @throws X any exception that may be thrown.
     */
    void tryLostOwnership(java.awt.datatransfer.Clipboard clipboard, java.awt.datatransfer.Transferable contents)
            throws X;
}
