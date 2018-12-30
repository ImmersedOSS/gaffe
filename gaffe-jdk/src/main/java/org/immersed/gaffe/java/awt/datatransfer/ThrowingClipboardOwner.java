package org.immersed.gaffe.java.awt.datatransfer;

import java.awt.datatransfer.ClipboardOwner;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingClipboardOwner<X extends Throwable> extends ClipboardOwner {
  @Override
  @SneakyThrows
  default void lostOwnership(java.awt.datatransfer.Clipboard a,
      java.awt.datatransfer.Transferable b) {
    tryLostOwnership(a,b);
  }

  void tryLostOwnership(java.awt.datatransfer.Clipboard a, java.awt.datatransfer.Transferable b)
      throws X;
}
