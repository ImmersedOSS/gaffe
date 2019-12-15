package org.immersed.gaffe.org.omg.PortableServer;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.omg.PortableServer.AdapterActivatorOperations;

/**
 * An adapter activator supplies a POA with the ability
 * to create child POAs on demand, as a side-effect of
 * receiving a request that names the child POA
 * (or one of its children), or when find_POA is called
 * with an activate parameter value of TRUE.
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingAdapterActivatorOperations<X extends Throwable> extends AdapterActivatorOperations {
  @Override
  @SneakyThrows
  default boolean unknown_adapter(org.omg.PortableServer.POA parent, java.lang.String name) {
    return tryUnknown_adapter(parent,name);
  }

  /**
   * This operation is invoked when the ORB receives
   * a request for an object reference that identifies
   * a target POA that does not exist. The ORB invokes
   * this operation once for each POA that must be
   * created in order for the target POA to exist.
   * @param parent indicates the parent POA for the POA
   * that needs to be created.
   * @param name identifies the name of the POA relative to
   * the parent.
   * @return returns TRUE if the POA was created or FALSE
   * otherwise.
   *
   * @throws X any exception that may be thrown.
   */
  boolean tryUnknown_adapter(org.omg.PortableServer.POA parent, java.lang.String name) throws X;
}
