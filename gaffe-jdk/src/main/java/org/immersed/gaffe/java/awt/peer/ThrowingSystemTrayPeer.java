package org.immersed.gaffe.java.awt.peer;

import java.awt.peer.SystemTrayPeer;
import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingSystemTrayPeer<X extends Throwable> extends SystemTrayPeer {
  @Override
  @SneakyThrows
  default java.awt.Dimension getTrayIconSize() {
    return tryGetTrayIconSize();
  }

  java.awt.Dimension tryGetTrayIconSize() throws X;
}
