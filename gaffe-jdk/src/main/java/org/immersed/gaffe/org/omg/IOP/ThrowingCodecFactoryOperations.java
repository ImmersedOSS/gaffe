package org.immersed.gaffe.org.omg.IOP;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.omg.IOP.CodecFactoryOperations;

/**
 * <code>Codecs</code> are obtained from the <code>CodecFactory</code>. The
 * <code>CodecFactory</code> is obtained through a call to
 * <code>ORB.resolve_initial_references( "CodecFactory" )</code>.
 * 
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingCodecFactoryOperations<X extends Throwable> extends CodecFactoryOperations
{
    @Override
    @SneakyThrows
    default org.omg.IOP.Codec create_codec(org.omg.IOP.Encoding enc)
    {
        return tryCreate_codec(enc);
    }

    /**
     * Create a <code>Codec</code> of the given encoding.
     * <p>
     * 
     * @param enc The encoding for which to create a <code>Codec</code>.
     * @return A <code>Codec</code> obtained with the given encoding.
     * @exception UnknownEncoding thrown if this factory cannot create a
     *                            <code>Codec</code> of the given encoding.
     *
     * @throws X any exception that may be thrown.
     */
    org.omg.IOP.Codec tryCreate_codec(org.omg.IOP.Encoding enc) throws X;
}
