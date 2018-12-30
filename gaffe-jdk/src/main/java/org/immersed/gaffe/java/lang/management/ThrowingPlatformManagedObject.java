package org.immersed.gaffe.java.lang.management;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import java.lang.management.PlatformManagedObject;
import lombok.SneakyThrows;

@FunctionalInterface
public interface ThrowingPlatformManagedObject<X extends Throwable> extends PlatformManagedObject {
  @Override
  @SneakyThrows
  default javax.management.ObjectName getObjectName() {
    return tryGetObjectName();
  }

  javax.management.ObjectName tryGetObjectName() throws X;
}
