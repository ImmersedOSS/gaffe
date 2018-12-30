package org.immersed.gaffe.java.time.temporal;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.time.temporal.TemporalQuery;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingTemporalQuery<R, X extends Throwable> extends TemporalQuery<R> {
  @Override
  @SneakyThrows
  default R queryFrom(java.time.temporal.TemporalAccessor a) {
    return tryQueryFrom(a);
  }

  R tryQueryFrom(java.time.temporal.TemporalAccessor a) throws X;
}
