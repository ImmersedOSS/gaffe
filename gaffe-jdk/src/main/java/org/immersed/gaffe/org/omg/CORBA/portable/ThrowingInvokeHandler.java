package org.immersed.gaffe.org.omg.CORBA.portable;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.omg.CORBA.portable.InvokeHandler;

@FunctionalInterface
public interface ThrowingInvokeHandler<X extends Throwable> extends InvokeHandler {
  @Override
  @SneakyThrows
  default org.omg.CORBA.portable.OutputStream _invoke(java.lang.String a,
      org.omg.CORBA.portable.InputStream b, org.omg.CORBA.portable.ResponseHandler c) {
    return try_invoke(a,b,c);
  }

  org.omg.CORBA.portable.OutputStream try_invoke(java.lang.String a,
      org.omg.CORBA.portable.InputStream b, org.omg.CORBA.portable.ResponseHandler c) throws X;
}
