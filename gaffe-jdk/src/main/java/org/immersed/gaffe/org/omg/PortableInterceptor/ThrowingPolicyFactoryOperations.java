package org.immersed.gaffe.org.omg.PortableInterceptor;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.omg.PortableInterceptor.PolicyFactoryOperations;

@FunctionalInterface
public interface ThrowingPolicyFactoryOperations<X extends Throwable> extends PolicyFactoryOperations {
  @Override
  @SneakyThrows
  default org.omg.CORBA.Policy create_policy(int a, org.omg.CORBA.Any b) {
    return tryCreate_policy(a,b);
  }

  org.omg.CORBA.Policy tryCreate_policy(int a, org.omg.CORBA.Any b) throws X;
}
