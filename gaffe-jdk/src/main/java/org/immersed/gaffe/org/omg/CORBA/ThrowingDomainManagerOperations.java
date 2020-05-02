package org.immersed.gaffe.org.omg.CORBA;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.omg.CORBA.DomainManagerOperations;

/**
 * Provides the <tt>DomainManager</tt> with the means to access policies.
 * <P>
 * The <tt>DomainManager</tt> has associated with it the policy objects for a
 * particular domain. The domain manager also records the membership of the
 * domain and provides the means to add and remove members. The domain manager
 * is itself a member of a domain, possibly the domain it manages. The domain
 * manager provides mechanisms for establishing and navigating relationships to
 * superior and subordinate domains and creating and accessing policies.
 * 
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingDomainManagerOperations<X extends Throwable> extends DomainManagerOperations
{
    @Override
    @SneakyThrows
    default org.omg.CORBA.Policy get_domain_policy(int policy_type)
    {
        return tryGet_domain_policy(policy_type);
    }

    /**
     * this domain. The types of policies available are domain specific. See the
     * CORBA specification for a list of standard ORB policies.
     *
     * @param policy_type Type of policy to request
     *
     * @throws X any exception that may be thrown.
     */
    org.omg.CORBA.Policy tryGet_domain_policy(int policy_type) throws X;
}
