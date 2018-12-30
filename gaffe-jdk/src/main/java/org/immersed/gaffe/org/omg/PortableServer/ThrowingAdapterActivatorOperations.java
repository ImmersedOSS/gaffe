package org.immersed.gaffe.org.omg.PortableServer;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.omg.PortableServer.AdapterActivatorOperations;

@FunctionalInterface
public interface ThrowingAdapterActivatorOperations<X extends Throwable> extends AdapterActivatorOperations {
  @Override
  @SneakyThrows
  default boolean unknown_adapter(org.omg.PortableServer.POA a, java.lang.String b) {
    return tryUnknown_adapter(a,b);
  }

  boolean tryUnknown_adapter(org.omg.PortableServer.POA a, java.lang.String b) throws X;
}
