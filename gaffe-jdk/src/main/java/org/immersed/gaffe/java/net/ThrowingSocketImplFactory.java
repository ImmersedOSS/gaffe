package org.immersed.gaffe.java.net;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.net.SocketImplFactory;
import lombok.SneakyThrows;

/**
 * This interface defines a factory for socket implementations. It
 * is used by the classes {@code Socket} and
 * {@code ServerSocket} to create actual socket
 * implementations.
 *
 * @author  Arthur van Hoff
 * @see     java.net.Socket
 * @see     java.net.ServerSocket
 * @since   JDK1.0
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingSocketImplFactory<X extends Throwable> extends SocketImplFactory {
  @Override
  @SneakyThrows
  default java.net.SocketImpl createSocketImpl() {
    return tryCreateSocketImpl();
  }

  /**
   * Creates a new {@code SocketImpl} instance.
   *
   * @return  a new instance of {@code SocketImpl}.
   * @see     java.net.SocketImpl
   *
   * @throws X any exception that may be thrown.
   */
  java.net.SocketImpl tryCreateSocketImpl() throws X;
}
