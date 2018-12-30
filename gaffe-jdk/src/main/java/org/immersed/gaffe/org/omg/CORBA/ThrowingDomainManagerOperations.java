package org.immersed.gaffe.org.omg.CORBA;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.omg.CORBA.DomainManagerOperations;

@FunctionalInterface
public interface ThrowingDomainManagerOperations<X extends Throwable> extends DomainManagerOperations {
  @Override
  @SneakyThrows
  default org.omg.CORBA.Policy get_domain_policy(int a) {
    return tryGet_domain_policy(a);
  }

  org.omg.CORBA.Policy tryGet_domain_policy(int a) throws X;
}
