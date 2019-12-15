package org.immersed.gaffe.org.omg.PortableInterceptor;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.omg.PortableInterceptor.PolicyFactoryOperations;

/**
 * Enables policy types to be constructed using
 * <code>CORBA.ORB.create_policy</code>.
 * <p>
 * A portable ORB service implementation registers an instance of the
 * <code>PolicyFactory</code> interface during ORB initialization in order
 * to enable its policy types to be constructed using
 * <code>CORBA.ORB.create_policy</code>. The POA is required to preserve
 * any policy which is registered with <code>ORBInitInfo</code> in this
 * manner.
 *
 * @see ORBInitInfo#register_policy_factory
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingPolicyFactoryOperations<X extends Throwable> extends PolicyFactoryOperations {
  @Override
  @SneakyThrows
  default org.omg.CORBA.Policy create_policy(int type, org.omg.CORBA.Any value) {
    return tryCreate_policy(type,value);
  }

  /**
   * Returns an instance of the appropriate interface derived from
   * <code>CORBA.Policy</code> whose value corresponds to the
   * specified any.
   * <p>
   * The ORB calls <code>create_policy</code> on a registered
   * <code>PolicyFactory</code> instance when
   * <code>CORBA.ORB.create_policy</code> is called for the
   * <code>PolicyType</code> under which the <code>PolicyFactory</code> has
   * been registered. The <code>create_policy</code> operation then
   * returns an instance of the appropriate interface derived from
   * <code>CORBA.Policy</code> whose value corresponds to the specified
   * any. If it cannot, it shall throw an exception as described for
   * <code>CORBA.ORB.create_policy</code>.
   *
   * @param type An int specifying the type of policy being created.
   * @param value An any containing data with which to construct the
   * <code>CORBA.Policy</code>.
   * @return A <code>CORBA.Policy<code> object of the specified type and
   * value.
   *
   * @throws X any exception that may be thrown.
   */
  org.omg.CORBA.Policy tryCreate_policy(int type, org.omg.CORBA.Any value) throws X;
}
