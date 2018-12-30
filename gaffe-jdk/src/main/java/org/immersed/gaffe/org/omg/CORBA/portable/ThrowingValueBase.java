package org.immersed.gaffe.org.omg.CORBA.portable;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.omg.CORBA.portable.ValueBase;

@FunctionalInterface
public interface ThrowingValueBase<X extends Throwable> extends ValueBase {
  @Override
  @SneakyThrows
  default java.lang.String[] _truncatable_ids() {
    return try_truncatable_ids();
  }

  java.lang.String[] try_truncatable_ids() throws X;
}
