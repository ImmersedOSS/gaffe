package org.immersed.gaffe.java.rmi.activation;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.rmi.activation.ActivationInstantiator;
import lombok.SneakyThrows;

/**
 * An <code>ActivationInstantiator</code> is responsible for creating
 * instances of "activatable" objects. A concrete subclass of
 * <code>ActivationGroup</code> implements the <code>newInstance</code>
 * method to handle creating objects within the group.
 *
 * @author      Ann Wollrath
 * @see         ActivationGroup
 * @since       1.2
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingActivationInstantiator<X extends Throwable> extends ActivationInstantiator {
  @Override
  @SneakyThrows
  default java.rmi.MarshalledObject<? extends java.rmi.Remote> newInstance(
      java.rmi.activation.ActivationID id, java.rmi.activation.ActivationDesc desc) {
    return tryNewInstance(id,desc);
  }

  /**
   * The activator calls an instantiator's <code>newInstance</code>
   * method in order to recreate in that group an object with the
   * activation identifier, <code>id</code>, and descriptor,
   * <code>desc</code>. The instantiator is responsible for: <ul>
   *
   * <li> determining the class for the object using the descriptor's
   * <code>getClassName</code> method,
   *
   * <li> loading the class from the code location obtained from the
   * descriptor (using the <code>getLocation</code> method),
   *
   * <li> creating an instance of the class by invoking the special
   * "activation" constructor of the object's class that takes two
   * arguments: the object's <code>ActivationID</code>, and the
   * <code>MarshalledObject</code> containing object specific
   * initialization data, and
   *
   * <li> returning a MarshalledObject containing the stub for the
   * remote object it created </ul>
   *
   * @param id the object's activation identifier
   * @param desc the object's descriptor
   * @return a marshalled object containing the serialized
   * representation of remote object's stub
   * @exception ActivationException if object activation fails
   * @exception RemoteException if remote call fails
   * @since 1.2
   *
   * @throws X any exception that may be thrown.
   */
  java.rmi.MarshalledObject<? extends java.rmi.Remote> tryNewInstance(
      java.rmi.activation.ActivationID id, java.rmi.activation.ActivationDesc desc) throws X;
}
