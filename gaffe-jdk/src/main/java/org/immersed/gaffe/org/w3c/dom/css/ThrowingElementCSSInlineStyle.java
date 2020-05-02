package org.immersed.gaffe.org.w3c.dom.css;

import java.lang.FunctionalInterface;
import java.lang.Override;
import java.lang.Throwable;
import lombok.SneakyThrows;
import org.w3c.dom.css.ElementCSSInlineStyle;

/**
 * Inline style information attached to elements is exposed through the
 * <code>style</code> attribute. This represents the contents of the STYLE
 * attribute for HTML elements (or elements in other schemas or DTDs which use
 * the STYLE attribute in the same way). The expectation is that an instance of
 * the ElementCSSInlineStyle interface can be obtained by using binding-specific
 * casting methods on an instance of the Element interface when the element
 * supports inline CSS style informations.
 * <p>
 * See also the
 * <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document
 * Object Model (DOM) Level 2 Style Specification</a>.
 * 
 * @since DOM Level 2
 * @param <X> the exception this interface may throw.
 */
@FunctionalInterface
public interface ThrowingElementCSSInlineStyle<X extends Throwable> extends ElementCSSInlineStyle
{
    @Override
    @SneakyThrows
    default org.w3c.dom.css.CSSStyleDeclaration getStyle()
    {
        return tryGetStyle();
    }

    /**
     * The style attribute.
     *
     * @throws X any exception that may be thrown.
     */
    org.w3c.dom.css.CSSStyleDeclaration tryGetStyle() throws X;
}
