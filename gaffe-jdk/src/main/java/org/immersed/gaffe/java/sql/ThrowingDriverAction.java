package org.immersed.gaffe.java.sql;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.sql.DriverAction;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingDriverAction<X extends Throwable> extends DriverAction {
  @Override
  @SneakyThrows
  default void deregister() {
    tryDeregister();
  }

  void tryDeregister() throws X;
}
