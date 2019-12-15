package org.immersed.gaffe.java.net;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.net.DatagramSocketImplFactory;
import lombok.SneakyThrows;

/**
 * This interface defines a factory for datagram socket implementations. It
 * is used by the classes {@code DatagramSocket} to create actual socket
 * implementations.
 *
 * @author  Yingxian Wang
 * @see     java.net.DatagramSocket
 * @since   1.3
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingDatagramSocketImplFactory<X extends Throwable> extends DatagramSocketImplFactory {
  @Override
  @SneakyThrows
  default java.net.DatagramSocketImpl createDatagramSocketImpl() {
    return tryCreateDatagramSocketImpl();
  }

  /**
   * Creates a new {@code DatagramSocketImpl} instance.
   *
   * @return  a new instance of {@code DatagramSocketImpl}.
   * @see     java.net.DatagramSocketImpl
   *
   * @throws X any exception that may be thrown.
   */
  java.net.DatagramSocketImpl tryCreateDatagramSocketImpl() throws X;
}
