package org.immersed.gaffe.javafx.beans;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import javafx.beans.WeakListener;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingWeakListener<X extends Throwable> extends WeakListener {
  @Override
  @SneakyThrows
  default boolean wasGarbageCollected() {
    return tryWasGarbageCollected();
  }

  boolean tryWasGarbageCollected() throws X;
}
