package org.immersed.gaffe.org.omg.CORBA.portable;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.omg.CORBA.portable.ValueFactory;

@FunctionalInterface
public interface ThrowingValueFactory<X extends Throwable> extends ValueFactory {
  @Override
  @SneakyThrows
  default java.io.Serializable read_value(org.omg.CORBA_2_3.portable.InputStream a) {
    return tryRead_value(a);
  }

  java.io.Serializable tryRead_value(org.omg.CORBA_2_3.portable.InputStream a) throws X;
}
