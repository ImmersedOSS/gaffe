package org.immersed.gaffe.java.rmi.server;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.rmi.server.RMIClientSocketFactory;
import lombok.SneakyThrows;

/**
 * An <code>RMIClientSocketFactory</code> instance is used by the RMI runtime
 * in order to obtain client sockets for RMI calls.  A remote object can be
 * associated with an <code>RMIClientSocketFactory</code> when it is
 * created/exported via the constructors or <code>exportObject</code> methods
 * of <code>java.rmi.server.UnicastRemoteObject</code> and
 * <code>java.rmi.activation.Activatable</code> .
 *
 * <p>An <code>RMIClientSocketFactory</code> instance associated with a remote
 * object will be downloaded to clients when the remote object's reference is
 * transmitted in an RMI call.  This <code>RMIClientSocketFactory</code> will
 * be used to create connections to the remote object for remote method calls.
 *
 * <p>An <code>RMIClientSocketFactory</code> instance can also be associated
 * with a remote object registry so that clients can use custom socket
 * communication with a remote object registry.
 *
 * <p>An implementation of this interface should be serializable and
 * should implement {@link Object#equals} to return <code>true</code> when
 * passed an instance that represents the same (functionally equivalent)
 * client socket factory, and <code>false</code> otherwise (and it should also
 * implement {@link Object#hashCode} consistently with its
 * <code>Object.equals</code> implementation).
 *
 * @author  Ann Wollrath
 * @author  Peter Jones
 * @since   1.2
 * @see     java.rmi.server.UnicastRemoteObject
 * @see     java.rmi.activation.Activatable
 * @see     java.rmi.registry.LocateRegistry
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingRMIClientSocketFactory<X extends Throwable> extends RMIClientSocketFactory {
  @Override
  @SneakyThrows
  default java.net.Socket createSocket(java.lang.String host, int port) {
    return tryCreateSocket(host,port);
  }

  /**
   * Create a client socket connected to the specified host and port.
   * @param  host   the host name
   * @param  port   the port number
   * @return a socket connected to the specified host and port.
   * @exception IOException if an I/O error occurs during socket creation
   * @since 1.2
   *
   * @throws X any exception that may be thrown.
   */
  java.net.Socket tryCreateSocket(java.lang.String host, int port) throws X;
}
