package org.immersed.gaffe.java.net;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.net.ProtocolFamily;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingProtocolFamily<X extends Throwable> extends ProtocolFamily {
  @Override
  @SneakyThrows
  default java.lang.String name() {
    return tryName();
  }

  java.lang.String tryName() throws X;
}
