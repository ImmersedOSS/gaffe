package org.immersed.gaffe.org.omg.CORBA.portable;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.omg.CORBA.portable.InvokeHandler;

/**
 * This interface provides a dispatching mechanism for an incoming call.
 * It is invoked by the ORB to dispatch a request to a servant.
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingInvokeHandler<X extends Throwable> extends InvokeHandler {
  @Override
  @SneakyThrows
  default org.omg.CORBA.portable.OutputStream _invoke(java.lang.String method,
      org.omg.CORBA.portable.InputStream input, org.omg.CORBA.portable.ResponseHandler handler) {
    return try_invoke(method,input,handler);
  }

  /**
   * Invoked by the ORB to dispatch a request to the servant.
   *
   * ORB passes the method name, an InputStream containing the
   * marshalled arguments, and a ResponseHandler which the servant
   * uses to construct a proper reply.
   *
   * Only CORBA SystemException may be thrown by this method.
   *
   * The method must return an OutputStream created by the
   * ResponseHandler which contains the marshalled reply.
   *
   * A servant must not retain a reference to the ResponseHandler
   * beyond the lifetime of a method invocation.
   *
   * Servant behaviour is defined as follows:
   * <p>1. Determine correct method, and unmarshal parameters from
   * InputStream.
   * <p>2. Invoke method implementation.
   * <p>3. If no user exception, create a normal reply using
   * ResponseHandler.
   * <p>4. If user exception occurred, create exception reply using
   * ResponseHandler.
   * <p>5. Marshal reply into OutputStream returned by
   * ResponseHandler.
   * <p>6. Return OutputStream to ORB.
   * <p>
   * @param method The method name.
   * @param input The <code>InputStream</code> containing the marshalled arguments.
   * @param handler The <code>ResponseHandler</code> which the servant uses
   * to construct a proper reply
   * @return The <code>OutputStream</code> created by the
   * ResponseHandler which contains the marshalled reply
   * @throws SystemException is thrown when invocation fails due to a CORBA system exception.
   *
   * @throws X any exception that may be thrown.
   */
  org.omg.CORBA.portable.OutputStream try_invoke(java.lang.String method,
      org.omg.CORBA.portable.InputStream input, org.omg.CORBA.portable.ResponseHandler handler)
      throws X;
}
