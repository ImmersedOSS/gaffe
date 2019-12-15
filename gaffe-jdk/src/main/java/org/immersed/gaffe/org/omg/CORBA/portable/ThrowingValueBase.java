package org.immersed.gaffe.org.omg.CORBA.portable;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.omg.CORBA.portable.ValueBase;

/**
 * The generated Java classes corresponding to valuetype IDL types
 * implement this interface. In other words, the Java mapping of
 * valuetype objects implement the ValueBase interface. The generated
 * Java class for valuetype's shall provide an implementation of the
 * ValueBase interface for the corresponding value type.
 * For value types that are streamable (i.e. non-custom),
 * the generated Java class shall also provide an implementation
 * for the org.omg.CORBA.portable.Streamable interface.
 * (CORBA::ValueBase is mapped to java.io.Serializable.)
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingValueBase<X extends Throwable> extends ValueBase {
  @Override
  @SneakyThrows
  default java.lang.String[] _truncatable_ids() {
    return try_truncatable_ids();
  }

  /**
   * Provides truncatable repository ids.
   * @return a String array--list of truncatable repository ids.
   *
   * @throws X any exception that may be thrown.
   */
  java.lang.String[] try_truncatable_ids() throws X;
}
