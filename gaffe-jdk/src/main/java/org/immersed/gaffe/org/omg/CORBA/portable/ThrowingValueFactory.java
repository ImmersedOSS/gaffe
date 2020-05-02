package org.immersed.gaffe.org.omg.CORBA.portable;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.omg.CORBA.portable.ValueFactory;

/**
 * The ValueFactory interface is the native mapping for the IDL type
 * CORBA::ValueFactory. The read_value() method is called by the ORB runtime
 * while in the process of unmarshaling a value type. A user shall implement
 * this method as part of implementing a type specific value factory. In the
 * implementation, the user shall call is.read_value(java.io.Serializable) with
 * a uninitialized valuetype to use for unmarshaling. The value returned by the
 * stream is the same value passed in, with all the data unmarshaled.
 * 
 * @see org.omg.CORBA_2_3.ORB
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingValueFactory<X extends Throwable> extends ValueFactory
{
    @Override
    @SneakyThrows
    default java.io.Serializable read_value(org.omg.CORBA_2_3.portable.InputStream is)
    {
        return tryRead_value(is);
    }

    /**
     * Is called by the ORB runtime while in the process of unmarshaling a value
     * type. A user shall implement this method as part of implementing a type
     * specific value factory.
     * 
     * @param is an InputStream object--from which the value will be read.
     * @return a Serializable object--the value read off of "is" Input stream.
     *
     * @throws X any exception that may be thrown.
     */
    java.io.Serializable tryRead_value(org.omg.CORBA_2_3.portable.InputStream is) throws X;
}
