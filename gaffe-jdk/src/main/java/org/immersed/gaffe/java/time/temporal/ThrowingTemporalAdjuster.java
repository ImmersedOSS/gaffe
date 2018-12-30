package org.immersed.gaffe.java.time.temporal;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.time.temporal.TemporalAdjuster;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingTemporalAdjuster<X extends Throwable> extends TemporalAdjuster {
  @Override
  @SneakyThrows
  default java.time.temporal.Temporal adjustInto(java.time.temporal.Temporal a) {
    return tryAdjustInto(a);
  }

  java.time.temporal.Temporal tryAdjustInto(java.time.temporal.Temporal a) throws X;
}
