package org.immersed.gaffe.java.awt.image;

import java.awt.image.TileObserver;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

/**
 * An interface for objects that wish to be informed when tiles
 * of a WritableRenderedImage become modifiable by some writer via
 * a call to getWritableTile, and when they become unmodifiable via
 * the last call to releaseWritableTile.
 *
 * @see WritableRenderedImage
 *
 * @author Thomas DeWeese
 * @author Daniel Rice
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingTileObserver<X extends Throwable> extends TileObserver {
  @Override
  @SneakyThrows
  default void tileUpdate(java.awt.image.WritableRenderedImage source, int tileX, int tileY,
      boolean willBeWritable) {
    tryTileUpdate(source,tileX,tileY,willBeWritable);
  }

  /**
   * A tile is about to be updated (it is either about to be grabbed
   * for writing, or it is being released from writing).
   *
   * @param source the image that owns the tile.
   * @param tileX the X index of the tile that is being updated.
   * @param tileY the Y index of the tile that is being updated.
   * @param willBeWritable  If true, the tile will be grabbed for writing;
   * otherwise it is being released.
   *
   * @throws X any exception that may be thrown.
   */
  void tryTileUpdate(java.awt.image.WritableRenderedImage source, int tileX, int tileY,
      boolean willBeWritable) throws X;
}
