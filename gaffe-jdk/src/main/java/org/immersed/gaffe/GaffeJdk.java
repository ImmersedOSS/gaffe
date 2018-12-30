package org.immersed.gaffe;

import java.awt.ActiveEvent;
import java.awt.Composite;
import java.awt.KeyEventDispatcher;
import java.awt.KeyEventPostProcessor;
import java.awt.PrintGraphics;
import java.awt.Stroke;
import java.awt.Transparency;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.FlavorListener;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSourceMotionListener;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentListener;
import java.awt.event.HierarchyListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseWheelListener;
import java.awt.event.TextListener;
import java.awt.event.WindowStateListener;
import java.awt.image.ImageObserver;
import java.awt.image.TileObserver;
import java.awt.image.renderable.RenderedImageFactory;
import java.awt.peer.SystemTrayPeer;
import java.awt.print.Printable;
import java.awt.print.PrinterGraphics;
import java.beans.ExceptionListener;
import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import java.beans.beancontext.BeanContextChildComponentProxy;
import java.beans.beancontext.BeanContextContainerProxy;
import java.beans.beancontext.BeanContextProxy;
import java.beans.beancontext.BeanContextServiceRevokedListener;
import java.io.Closeable;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.ObjectInputValidation;
import java.lang.AutoCloseable;
import java.lang.Comparable;
import java.lang.Iterable;
import java.lang.Readable;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.Throwable;
import java.lang.instrument.ClassFileTransformer;
import java.lang.management.PlatformManagedObject;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationHandler;
import java.net.ContentHandlerFactory;
import java.net.CookiePolicy;
import java.net.DatagramSocketImplFactory;
import java.net.FileNameMap;
import java.net.ProtocolFamily;
import java.net.SocketImplFactory;
import java.net.URLStreamHandlerFactory;
import java.nio.file.DirectoryStream;
import java.nio.file.PathMatcher;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.AttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileStoreAttributeView;
import java.rmi.activation.ActivationInstantiator;
import java.rmi.activation.Activator;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIFailureHandler;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.Unreferenced;
import java.security.DomainCombiner;
import java.security.Guard;
import java.security.KeyStore;
import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertStoreParameters;
import java.security.interfaces.DSAKey;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.security.spec.ECField;
import java.sql.DriverAction;
import java.time.chrono.Era;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalQuery;
import java.util.Formattable;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;
import java.util.logging.Filter;
import java.util.prefs.PreferenceChangeListener;
import java.util.spi.ResourceBundleControlProvider;
import javafx.animation.Interpolatable;
import javafx.beans.InvalidationListener;
import javafx.beans.WeakListener;
import javafx.beans.value.ChangeListener;
import javafx.collections.ArrayChangeListener;
import javafx.collections.ListChangeListener;
import javafx.collections.MapChangeListener;
import javafx.collections.SetChangeListener;
import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.fxml.Initializable;
import javafx.scene.media.AudioSpectrumListener;
import javafx.util.Builder;
import javafx.util.BuilderFactory;
import javafx.util.Callback;
import org.immersed.gaffe.java.awt.ThrowingActiveEvent;
import org.immersed.gaffe.java.awt.ThrowingComposite;
import org.immersed.gaffe.java.awt.ThrowingKeyEventDispatcher;
import org.immersed.gaffe.java.awt.ThrowingKeyEventPostProcessor;
import org.immersed.gaffe.java.awt.ThrowingPrintGraphics;
import org.immersed.gaffe.java.awt.ThrowingStroke;
import org.immersed.gaffe.java.awt.ThrowingTransparency;
import org.immersed.gaffe.java.awt.datatransfer.ThrowingClipboardOwner;
import org.immersed.gaffe.java.awt.datatransfer.ThrowingFlavorListener;
import org.immersed.gaffe.java.awt.dnd.ThrowingDragGestureListener;
import org.immersed.gaffe.java.awt.dnd.ThrowingDragSourceMotionListener;
import org.immersed.gaffe.java.awt.event.ThrowingAWTEventListener;
import org.immersed.gaffe.java.awt.event.ThrowingActionListener;
import org.immersed.gaffe.java.awt.event.ThrowingAdjustmentListener;
import org.immersed.gaffe.java.awt.event.ThrowingHierarchyListener;
import org.immersed.gaffe.java.awt.event.ThrowingItemListener;
import org.immersed.gaffe.java.awt.event.ThrowingMouseWheelListener;
import org.immersed.gaffe.java.awt.event.ThrowingTextListener;
import org.immersed.gaffe.java.awt.event.ThrowingWindowStateListener;
import org.immersed.gaffe.java.awt.image.ThrowingImageObserver;
import org.immersed.gaffe.java.awt.image.ThrowingTileObserver;
import org.immersed.gaffe.java.awt.image.renderable.ThrowingRenderedImageFactory;
import org.immersed.gaffe.java.awt.peer.ThrowingSystemTrayPeer;
import org.immersed.gaffe.java.awt.print.ThrowingPrintable;
import org.immersed.gaffe.java.awt.print.ThrowingPrinterGraphics;
import org.immersed.gaffe.java.beans.ThrowingExceptionListener;
import org.immersed.gaffe.java.beans.ThrowingPropertyChangeListener;
import org.immersed.gaffe.java.beans.ThrowingVetoableChangeListener;
import org.immersed.gaffe.java.beans.beancontext.ThrowingBeanContextChildComponentProxy;
import org.immersed.gaffe.java.beans.beancontext.ThrowingBeanContextContainerProxy;
import org.immersed.gaffe.java.beans.beancontext.ThrowingBeanContextProxy;
import org.immersed.gaffe.java.beans.beancontext.ThrowingBeanContextServiceRevokedListener;
import org.immersed.gaffe.java.io.ThrowingCloseable;
import org.immersed.gaffe.java.io.ThrowingFileFilter;
import org.immersed.gaffe.java.io.ThrowingFilenameFilter;
import org.immersed.gaffe.java.io.ThrowingFlushable;
import org.immersed.gaffe.java.io.ThrowingObjectInputValidation;
import org.immersed.gaffe.java.lang.ThrowingAutoCloseable;
import org.immersed.gaffe.java.lang.ThrowingComparable;
import org.immersed.gaffe.java.lang.ThrowingIterable;
import org.immersed.gaffe.java.lang.ThrowingReadable;
import org.immersed.gaffe.java.lang.ThrowingRunnable;
import org.immersed.gaffe.java.lang.ThrowingUncaughtExceptionHandler;
import org.immersed.gaffe.java.lang.instrument.ThrowingClassFileTransformer;
import org.immersed.gaffe.java.lang.management.ThrowingPlatformManagedObject;
import org.immersed.gaffe.java.lang.reflect.ThrowingGenericArrayType;
import org.immersed.gaffe.java.lang.reflect.ThrowingInvocationHandler;
import org.immersed.gaffe.java.net.ThrowingContentHandlerFactory;
import org.immersed.gaffe.java.net.ThrowingCookiePolicy;
import org.immersed.gaffe.java.net.ThrowingDatagramSocketImplFactory;
import org.immersed.gaffe.java.net.ThrowingFileNameMap;
import org.immersed.gaffe.java.net.ThrowingProtocolFamily;
import org.immersed.gaffe.java.net.ThrowingSocketImplFactory;
import org.immersed.gaffe.java.net.ThrowingURLStreamHandlerFactory;
import org.immersed.gaffe.java.nio.file.ThrowingFilter;
import org.immersed.gaffe.java.nio.file.ThrowingModifier;
import org.immersed.gaffe.java.nio.file.ThrowingPathMatcher;
import org.immersed.gaffe.java.nio.file.attribute.ThrowingAttributeView;
import org.immersed.gaffe.java.nio.file.attribute.ThrowingFileAttributeView;
import org.immersed.gaffe.java.nio.file.attribute.ThrowingFileStoreAttributeView;
import org.immersed.gaffe.java.rmi.activation.ThrowingActivationInstantiator;
import org.immersed.gaffe.java.rmi.activation.ThrowingActivator;
import org.immersed.gaffe.java.rmi.server.ThrowingRMIClientSocketFactory;
import org.immersed.gaffe.java.rmi.server.ThrowingRMIFailureHandler;
import org.immersed.gaffe.java.rmi.server.ThrowingRMIServerSocketFactory;
import org.immersed.gaffe.java.rmi.server.ThrowingUnreferenced;
import org.immersed.gaffe.java.security.ThrowingDomainCombiner;
import org.immersed.gaffe.java.security.ThrowingGuard;
import org.immersed.gaffe.java.security.ThrowingLoadStoreParameter;
import org.immersed.gaffe.java.security.ThrowingPrivilegedAction;
import org.immersed.gaffe.java.security.ThrowingPrivilegedExceptionAction;
import org.immersed.gaffe.java.security.cert.ThrowingCertPathParameters;
import org.immersed.gaffe.java.security.cert.ThrowingCertPathValidatorResult;
import org.immersed.gaffe.java.security.cert.ThrowingCertStoreParameters;
import org.immersed.gaffe.java.security.interfaces.ThrowingDSAKey;
import org.immersed.gaffe.java.security.interfaces.ThrowingECKey;
import org.immersed.gaffe.java.security.interfaces.ThrowingRSAKey;
import org.immersed.gaffe.java.security.spec.ThrowingECField;
import org.immersed.gaffe.java.sql.ThrowingDriverAction;
import org.immersed.gaffe.java.time.chrono.ThrowingEra;
import org.immersed.gaffe.java.time.temporal.ThrowingTemporalAdjuster;
import org.immersed.gaffe.java.time.temporal.ThrowingTemporalQuery;
import org.immersed.gaffe.java.util.ThrowingFormattable;
import org.immersed.gaffe.java.util.ThrowingObserver;
import org.immersed.gaffe.java.util.concurrent.ThrowingCallable;
import org.immersed.gaffe.java.util.concurrent.ThrowingExecutor;
import org.immersed.gaffe.java.util.concurrent.ThrowingForkJoinWorkerThreadFactory;
import org.immersed.gaffe.java.util.concurrent.ThrowingRejectedExecutionHandler;
import org.immersed.gaffe.java.util.concurrent.ThrowingThreadFactory;
import org.immersed.gaffe.java.util.function.ThrowingBiConsumer;
import org.immersed.gaffe.java.util.function.ThrowingBiFunction;
import org.immersed.gaffe.java.util.function.ThrowingBiPredicate;
import org.immersed.gaffe.java.util.function.ThrowingBinaryOperator;
import org.immersed.gaffe.java.util.function.ThrowingBooleanSupplier;
import org.immersed.gaffe.java.util.function.ThrowingConsumer;
import org.immersed.gaffe.java.util.function.ThrowingDoubleBinaryOperator;
import org.immersed.gaffe.java.util.function.ThrowingDoubleConsumer;
import org.immersed.gaffe.java.util.function.ThrowingDoubleFunction;
import org.immersed.gaffe.java.util.function.ThrowingDoublePredicate;
import org.immersed.gaffe.java.util.function.ThrowingDoubleSupplier;
import org.immersed.gaffe.java.util.function.ThrowingDoubleToIntFunction;
import org.immersed.gaffe.java.util.function.ThrowingDoubleToLongFunction;
import org.immersed.gaffe.java.util.function.ThrowingDoubleUnaryOperator;
import org.immersed.gaffe.java.util.function.ThrowingFunction;
import org.immersed.gaffe.java.util.function.ThrowingIntBinaryOperator;
import org.immersed.gaffe.java.util.function.ThrowingIntConsumer;
import org.immersed.gaffe.java.util.function.ThrowingIntFunction;
import org.immersed.gaffe.java.util.function.ThrowingIntPredicate;
import org.immersed.gaffe.java.util.function.ThrowingIntSupplier;
import org.immersed.gaffe.java.util.function.ThrowingIntToDoubleFunction;
import org.immersed.gaffe.java.util.function.ThrowingIntToLongFunction;
import org.immersed.gaffe.java.util.function.ThrowingIntUnaryOperator;
import org.immersed.gaffe.java.util.function.ThrowingLongBinaryOperator;
import org.immersed.gaffe.java.util.function.ThrowingLongConsumer;
import org.immersed.gaffe.java.util.function.ThrowingLongFunction;
import org.immersed.gaffe.java.util.function.ThrowingLongPredicate;
import org.immersed.gaffe.java.util.function.ThrowingLongSupplier;
import org.immersed.gaffe.java.util.function.ThrowingLongToDoubleFunction;
import org.immersed.gaffe.java.util.function.ThrowingLongToIntFunction;
import org.immersed.gaffe.java.util.function.ThrowingLongUnaryOperator;
import org.immersed.gaffe.java.util.function.ThrowingObjDoubleConsumer;
import org.immersed.gaffe.java.util.function.ThrowingObjIntConsumer;
import org.immersed.gaffe.java.util.function.ThrowingObjLongConsumer;
import org.immersed.gaffe.java.util.function.ThrowingPredicate;
import org.immersed.gaffe.java.util.function.ThrowingSupplier;
import org.immersed.gaffe.java.util.function.ThrowingToDoubleBiFunction;
import org.immersed.gaffe.java.util.function.ThrowingToDoubleFunction;
import org.immersed.gaffe.java.util.function.ThrowingToIntBiFunction;
import org.immersed.gaffe.java.util.function.ThrowingToIntFunction;
import org.immersed.gaffe.java.util.function.ThrowingToLongBiFunction;
import org.immersed.gaffe.java.util.function.ThrowingToLongFunction;
import org.immersed.gaffe.java.util.function.ThrowingUnaryOperator;
import org.immersed.gaffe.java.util.prefs.ThrowingPreferenceChangeListener;
import org.immersed.gaffe.java.util.spi.ThrowingResourceBundleControlProvider;
import org.immersed.gaffe.javafx.animation.ThrowingInterpolatable;
import org.immersed.gaffe.javafx.beans.ThrowingInvalidationListener;
import org.immersed.gaffe.javafx.beans.ThrowingWeakListener;
import org.immersed.gaffe.javafx.beans.value.ThrowingChangeListener;
import org.immersed.gaffe.javafx.collections.ThrowingArrayChangeListener;
import org.immersed.gaffe.javafx.collections.ThrowingListChangeListener;
import org.immersed.gaffe.javafx.collections.ThrowingMapChangeListener;
import org.immersed.gaffe.javafx.collections.ThrowingSetChangeListener;
import org.immersed.gaffe.javafx.event.ThrowingEventDispatcher;
import org.immersed.gaffe.javafx.event.ThrowingEventHandler;
import org.immersed.gaffe.javafx.event.ThrowingEventTarget;
import org.immersed.gaffe.javafx.fxml.ThrowingInitializable;
import org.immersed.gaffe.javafx.scene.media.ThrowingAudioSpectrumListener;
import org.immersed.gaffe.javafx.util.ThrowingBuilder;
import org.immersed.gaffe.javafx.util.ThrowingBuilderFactory;
import org.immersed.gaffe.javafx.util.ThrowingCallback;
import org.immersed.gaffe.org.omg.CORBA.ThrowingDomainManagerOperations;
import org.immersed.gaffe.org.omg.CORBA.portable.ThrowingInvokeHandler;
import org.immersed.gaffe.org.omg.CORBA.portable.ThrowingValueBase;
import org.immersed.gaffe.org.omg.CORBA.portable.ThrowingValueFactory;
import org.immersed.gaffe.org.omg.IOP.ThrowingCodecFactoryOperations;
import org.immersed.gaffe.org.omg.PortableInterceptor.ThrowingPolicyFactoryOperations;
import org.immersed.gaffe.org.omg.PortableServer.ThrowingAdapterActivatorOperations;
import org.immersed.gaffe.org.w3c.dom.ThrowingDOMErrorHandler;
import org.immersed.gaffe.org.w3c.dom.ThrowingUserDataHandler;
import org.immersed.gaffe.org.w3c.dom.css.ThrowingElementCSSInlineStyle;
import org.immersed.gaffe.org.w3c.dom.events.ThrowingDocumentEvent;
import org.immersed.gaffe.org.w3c.dom.events.ThrowingEventListener;
import org.immersed.gaffe.org.w3c.dom.ls.ThrowingLSResourceResolver;
import org.immersed.gaffe.org.w3c.dom.ranges.ThrowingDocumentRange;
import org.immersed.gaffe.org.w3c.dom.stylesheets.ThrowingDocumentStyle;
import org.immersed.gaffe.org.w3c.dom.stylesheets.ThrowingLinkStyle;
import org.immersed.gaffe.org.w3c.dom.traversal.ThrowingNodeFilter;
import org.immersed.gaffe.org.w3c.dom.views.ThrowingAbstractView;
import org.immersed.gaffe.org.w3c.dom.views.ThrowingDocumentView;
import org.immersed.gaffe.org.w3c.dom.xpath.ThrowingXPathExpression;
import org.immersed.gaffe.org.w3c.dom.xpath.ThrowingXPathNSResolver;
import org.immersed.gaffe.org.xml.sax.ThrowingEntityResolver;
import org.omg.CORBA.DomainManagerOperations;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.ValueBase;
import org.omg.CORBA.portable.ValueFactory;
import org.omg.IOP.CodecFactoryOperations;
import org.omg.PortableInterceptor.PolicyFactoryOperations;
import org.omg.PortableServer.AdapterActivatorOperations;
import org.w3c.dom.DOMErrorHandler;
import org.w3c.dom.UserDataHandler;
import org.w3c.dom.css.ElementCSSInlineStyle;
import org.w3c.dom.events.DocumentEvent;
import org.w3c.dom.events.EventListener;
import org.w3c.dom.ls.LSResourceResolver;
import org.w3c.dom.ranges.DocumentRange;
import org.w3c.dom.stylesheets.DocumentStyle;
import org.w3c.dom.stylesheets.LinkStyle;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.views.AbstractView;
import org.w3c.dom.views.DocumentView;
import org.w3c.dom.xpath.XPathExpression;
import org.w3c.dom.xpath.XPathNSResolver;
import org.xml.sax.EntityResolver;

public final class GaffeJdk {
  private GaffeJdk() {
  }

  public static <X extends Throwable> ActiveEvent throwing(
      ThrowingActiveEvent<X> throwingActiveEvent) {
    return throwingActiveEvent;
  }

  public static <X extends Throwable> Composite throwing(ThrowingComposite<X> throwingComposite) {
    return throwingComposite;
  }

  public static <X extends Throwable> KeyEventDispatcher throwing(
      ThrowingKeyEventDispatcher<X> throwingKeyEventDispatcher) {
    return throwingKeyEventDispatcher;
  }

  public static <X extends Throwable> KeyEventPostProcessor throwing(
      ThrowingKeyEventPostProcessor<X> throwingKeyEventPostProcessor) {
    return throwingKeyEventPostProcessor;
  }

  public static <X extends Throwable> PrintGraphics throwing(
      ThrowingPrintGraphics<X> throwingPrintGraphics) {
    return throwingPrintGraphics;
  }

  public static <X extends Throwable> Stroke throwing(ThrowingStroke<X> throwingStroke) {
    return throwingStroke;
  }

  public static <X extends Throwable> Transparency throwing(
      ThrowingTransparency<X> throwingTransparency) {
    return throwingTransparency;
  }

  public static <X extends Throwable> ClipboardOwner throwing(
      ThrowingClipboardOwner<X> throwingClipboardOwner) {
    return throwingClipboardOwner;
  }

  public static <X extends Throwable> FlavorListener throwing(
      ThrowingFlavorListener<X> throwingFlavorListener) {
    return throwingFlavorListener;
  }

  public static <X extends Throwable> DragGestureListener throwing(
      ThrowingDragGestureListener<X> throwingDragGestureListener) {
    return throwingDragGestureListener;
  }

  public static <X extends Throwable> DragSourceMotionListener throwing(
      ThrowingDragSourceMotionListener<X> throwingDragSourceMotionListener) {
    return throwingDragSourceMotionListener;
  }

  public static <X extends Throwable> AWTEventListener throwing(
      ThrowingAWTEventListener<X> throwingAWTEventListener) {
    return throwingAWTEventListener;
  }

  public static <X extends Throwable> ActionListener throwing(
      ThrowingActionListener<X> throwingActionListener) {
    return throwingActionListener;
  }

  public static <X extends Throwable> AdjustmentListener throwing(
      ThrowingAdjustmentListener<X> throwingAdjustmentListener) {
    return throwingAdjustmentListener;
  }

  public static <X extends Throwable> HierarchyListener throwing(
      ThrowingHierarchyListener<X> throwingHierarchyListener) {
    return throwingHierarchyListener;
  }

  public static <X extends Throwable> ItemListener throwing(
      ThrowingItemListener<X> throwingItemListener) {
    return throwingItemListener;
  }

  public static <X extends Throwable> MouseWheelListener throwing(
      ThrowingMouseWheelListener<X> throwingMouseWheelListener) {
    return throwingMouseWheelListener;
  }

  public static <X extends Throwable> TextListener throwing(
      ThrowingTextListener<X> throwingTextListener) {
    return throwingTextListener;
  }

  public static <X extends Throwable> WindowStateListener throwing(
      ThrowingWindowStateListener<X> throwingWindowStateListener) {
    return throwingWindowStateListener;
  }

  public static <X extends Throwable> ImageObserver throwing(
      ThrowingImageObserver<X> throwingImageObserver) {
    return throwingImageObserver;
  }

  public static <X extends Throwable> TileObserver throwing(
      ThrowingTileObserver<X> throwingTileObserver) {
    return throwingTileObserver;
  }

  public static <X extends Throwable> RenderedImageFactory throwing(
      ThrowingRenderedImageFactory<X> throwingRenderedImageFactory) {
    return throwingRenderedImageFactory;
  }

  public static <X extends Throwable> SystemTrayPeer throwing(
      ThrowingSystemTrayPeer<X> throwingSystemTrayPeer) {
    return throwingSystemTrayPeer;
  }

  public static <X extends Throwable> Printable throwing(ThrowingPrintable<X> throwingPrintable) {
    return throwingPrintable;
  }

  public static <X extends Throwable> PrinterGraphics throwing(
      ThrowingPrinterGraphics<X> throwingPrinterGraphics) {
    return throwingPrinterGraphics;
  }

  public static <X extends Throwable> ExceptionListener throwing(
      ThrowingExceptionListener<X> throwingExceptionListener) {
    return throwingExceptionListener;
  }

  public static <X extends Throwable> PropertyChangeListener throwing(
      ThrowingPropertyChangeListener<X> throwingPropertyChangeListener) {
    return throwingPropertyChangeListener;
  }

  public static <X extends Throwable> VetoableChangeListener throwing(
      ThrowingVetoableChangeListener<X> throwingVetoableChangeListener) {
    return throwingVetoableChangeListener;
  }

  public static <X extends Throwable> BeanContextChildComponentProxy throwing(
      ThrowingBeanContextChildComponentProxy<X> throwingBeanContextChildComponentProxy) {
    return throwingBeanContextChildComponentProxy;
  }

  public static <X extends Throwable> BeanContextContainerProxy throwing(
      ThrowingBeanContextContainerProxy<X> throwingBeanContextContainerProxy) {
    return throwingBeanContextContainerProxy;
  }

  public static <X extends Throwable> BeanContextProxy throwing(
      ThrowingBeanContextProxy<X> throwingBeanContextProxy) {
    return throwingBeanContextProxy;
  }

  public static <X extends Throwable> BeanContextServiceRevokedListener throwing(
      ThrowingBeanContextServiceRevokedListener<X> throwingBeanContextServiceRevokedListener) {
    return throwingBeanContextServiceRevokedListener;
  }

  public static <X extends Throwable> Closeable throwing(ThrowingCloseable<X> throwingCloseable) {
    return throwingCloseable;
  }

  public static <X extends Throwable> FileFilter throwing(
      ThrowingFileFilter<X> throwingFileFilter) {
    return throwingFileFilter;
  }

  public static <X extends Throwable> FilenameFilter throwing(
      ThrowingFilenameFilter<X> throwingFilenameFilter) {
    return throwingFilenameFilter;
  }

  public static <X extends Throwable> Flushable throwing(ThrowingFlushable<X> throwingFlushable) {
    return throwingFlushable;
  }

  public static <X extends Throwable> ObjectInputValidation throwing(
      ThrowingObjectInputValidation<X> throwingObjectInputValidation) {
    return throwingObjectInputValidation;
  }

  public static <X extends Throwable> AutoCloseable throwing(
      ThrowingAutoCloseable<X> throwingAutoCloseable) {
    return throwingAutoCloseable;
  }

  public static <T, X extends Throwable> Comparable<T> throwing(
      ThrowingComparable<T, X> throwingComparable) {
    return throwingComparable;
  }

  public static <T, X extends Throwable> Iterable<T> throwing(
      ThrowingIterable<T, X> throwingIterable) {
    return throwingIterable;
  }

  public static <X extends Throwable> Readable throwing(ThrowingReadable<X> throwingReadable) {
    return throwingReadable;
  }

  public static <X extends Throwable> Runnable throwing(ThrowingRunnable<X> throwingRunnable) {
    return throwingRunnable;
  }

  public static <X extends Throwable> Thread.UncaughtExceptionHandler throwing(
      ThrowingUncaughtExceptionHandler<X> throwingUncaughtExceptionHandler) {
    return throwingUncaughtExceptionHandler;
  }

  public static <X extends Throwable> ClassFileTransformer throwing(
      ThrowingClassFileTransformer<X> throwingClassFileTransformer) {
    return throwingClassFileTransformer;
  }

  public static <X extends Throwable> PlatformManagedObject throwing(
      ThrowingPlatformManagedObject<X> throwingPlatformManagedObject) {
    return throwingPlatformManagedObject;
  }

  public static <X extends Throwable> GenericArrayType throwing(
      ThrowingGenericArrayType<X> throwingGenericArrayType) {
    return throwingGenericArrayType;
  }

  public static <X extends Throwable> InvocationHandler throwing(
      ThrowingInvocationHandler<X> throwingInvocationHandler) {
    return throwingInvocationHandler;
  }

  public static <X extends Throwable> ContentHandlerFactory throwing(
      ThrowingContentHandlerFactory<X> throwingContentHandlerFactory) {
    return throwingContentHandlerFactory;
  }

  public static <X extends Throwable> CookiePolicy throwing(
      ThrowingCookiePolicy<X> throwingCookiePolicy) {
    return throwingCookiePolicy;
  }

  public static <X extends Throwable> DatagramSocketImplFactory throwing(
      ThrowingDatagramSocketImplFactory<X> throwingDatagramSocketImplFactory) {
    return throwingDatagramSocketImplFactory;
  }

  public static <X extends Throwable> FileNameMap throwing(
      ThrowingFileNameMap<X> throwingFileNameMap) {
    return throwingFileNameMap;
  }

  public static <X extends Throwable> ProtocolFamily throwing(
      ThrowingProtocolFamily<X> throwingProtocolFamily) {
    return throwingProtocolFamily;
  }

  public static <X extends Throwable> SocketImplFactory throwing(
      ThrowingSocketImplFactory<X> throwingSocketImplFactory) {
    return throwingSocketImplFactory;
  }

  public static <X extends Throwable> URLStreamHandlerFactory throwing(
      ThrowingURLStreamHandlerFactory<X> throwingURLStreamHandlerFactory) {
    return throwingURLStreamHandlerFactory;
  }

  public static <T, X extends Throwable> DirectoryStream.Filter<T> throwing(
      ThrowingFilter<T, X> throwingFilter) {
    return throwingFilter;
  }

  public static <X extends Throwable> PathMatcher throwing(
      ThrowingPathMatcher<X> throwingPathMatcher) {
    return throwingPathMatcher;
  }

  public static <X extends Throwable> WatchEvent.Modifier throwing(
      ThrowingModifier<X> throwingModifier) {
    return throwingModifier;
  }

  public static <X extends Throwable> AttributeView throwing(
      ThrowingAttributeView<X> throwingAttributeView) {
    return throwingAttributeView;
  }

  public static <X extends Throwable> FileAttributeView throwing(
      ThrowingFileAttributeView<X> throwingFileAttributeView) {
    return throwingFileAttributeView;
  }

  public static <X extends Throwable> FileStoreAttributeView throwing(
      ThrowingFileStoreAttributeView<X> throwingFileStoreAttributeView) {
    return throwingFileStoreAttributeView;
  }

  public static <X extends Throwable> ActivationInstantiator throwing(
      ThrowingActivationInstantiator<X> throwingActivationInstantiator) {
    return throwingActivationInstantiator;
  }

  public static <X extends Throwable> Activator throwing(ThrowingActivator<X> throwingActivator) {
    return throwingActivator;
  }

  public static <X extends Throwable> RMIClientSocketFactory throwing(
      ThrowingRMIClientSocketFactory<X> throwingRMIClientSocketFactory) {
    return throwingRMIClientSocketFactory;
  }

  public static <X extends Throwable> RMIFailureHandler throwing(
      ThrowingRMIFailureHandler<X> throwingRMIFailureHandler) {
    return throwingRMIFailureHandler;
  }

  public static <X extends Throwable> RMIServerSocketFactory throwing(
      ThrowingRMIServerSocketFactory<X> throwingRMIServerSocketFactory) {
    return throwingRMIServerSocketFactory;
  }

  public static <X extends Throwable> Unreferenced throwing(
      ThrowingUnreferenced<X> throwingUnreferenced) {
    return throwingUnreferenced;
  }

  public static <X extends Throwable> DomainCombiner throwing(
      ThrowingDomainCombiner<X> throwingDomainCombiner) {
    return throwingDomainCombiner;
  }

  public static <X extends Throwable> Guard throwing(ThrowingGuard<X> throwingGuard) {
    return throwingGuard;
  }

  public static <X extends Throwable> KeyStore.LoadStoreParameter throwing(
      ThrowingLoadStoreParameter<X> throwingLoadStoreParameter) {
    return throwingLoadStoreParameter;
  }

  public static <T, X extends Throwable> PrivilegedAction<T> throwing(
      ThrowingPrivilegedAction<T, X> throwingPrivilegedAction) {
    return throwingPrivilegedAction;
  }

  public static <T, X extends Throwable> PrivilegedExceptionAction<T> throwing(
      ThrowingPrivilegedExceptionAction<T, X> throwingPrivilegedExceptionAction) {
    return throwingPrivilegedExceptionAction;
  }

  public static <X extends Throwable> CertPathParameters throwing(
      ThrowingCertPathParameters<X> throwingCertPathParameters) {
    return throwingCertPathParameters;
  }

  public static <X extends Throwable> CertPathValidatorResult throwing(
      ThrowingCertPathValidatorResult<X> throwingCertPathValidatorResult) {
    return throwingCertPathValidatorResult;
  }

  public static <X extends Throwable> CertStoreParameters throwing(
      ThrowingCertStoreParameters<X> throwingCertStoreParameters) {
    return throwingCertStoreParameters;
  }

  public static <X extends Throwable> DSAKey throwing(ThrowingDSAKey<X> throwingDSAKey) {
    return throwingDSAKey;
  }

  public static <X extends Throwable> ECKey throwing(ThrowingECKey<X> throwingECKey) {
    return throwingECKey;
  }

  public static <X extends Throwable> RSAKey throwing(ThrowingRSAKey<X> throwingRSAKey) {
    return throwingRSAKey;
  }

  public static <X extends Throwable> ECField throwing(ThrowingECField<X> throwingECField) {
    return throwingECField;
  }

  public static <X extends Throwable> DriverAction throwing(
      ThrowingDriverAction<X> throwingDriverAction) {
    return throwingDriverAction;
  }

  public static <X extends Throwable> Era throwing(ThrowingEra<X> throwingEra) {
    return throwingEra;
  }

  public static <X extends Throwable> TemporalAdjuster throwing(
      ThrowingTemporalAdjuster<X> throwingTemporalAdjuster) {
    return throwingTemporalAdjuster;
  }

  public static <R, X extends Throwable> TemporalQuery<R> throwing(
      ThrowingTemporalQuery<R, X> throwingTemporalQuery) {
    return throwingTemporalQuery;
  }

  public static <X extends Throwable> Formattable throwing(
      ThrowingFormattable<X> throwingFormattable) {
    return throwingFormattable;
  }

  public static <X extends Throwable> Observer throwing(ThrowingObserver<X> throwingObserver) {
    return throwingObserver;
  }

  public static <V, X extends Throwable> Callable<V> throwing(
      ThrowingCallable<V, X> throwingCallable) {
    return throwingCallable;
  }

  public static <X extends Throwable> Executor throwing(ThrowingExecutor<X> throwingExecutor) {
    return throwingExecutor;
  }

  public static <X extends Throwable> ForkJoinPool.ForkJoinWorkerThreadFactory throwing(
      ThrowingForkJoinWorkerThreadFactory<X> throwingForkJoinWorkerThreadFactory) {
    return throwingForkJoinWorkerThreadFactory;
  }

  public static <X extends Throwable> RejectedExecutionHandler throwing(
      ThrowingRejectedExecutionHandler<X> throwingRejectedExecutionHandler) {
    return throwingRejectedExecutionHandler;
  }

  public static <X extends Throwable> ThreadFactory throwing(
      ThrowingThreadFactory<X> throwingThreadFactory) {
    return throwingThreadFactory;
  }

  public static <T, U, X extends Throwable> BiConsumer<T, U> throwing(
      ThrowingBiConsumer<T, U, X> throwingBiConsumer) {
    return throwingBiConsumer;
  }

  public static <T, U, R, X extends Throwable> BiFunction<T, U, R> throwing(
      ThrowingBiFunction<T, U, R, X> throwingBiFunction) {
    return throwingBiFunction;
  }

  public static <T, U, X extends Throwable> BiPredicate<T, U> throwing(
      ThrowingBiPredicate<T, U, X> throwingBiPredicate) {
    return throwingBiPredicate;
  }

  public static <T, X extends Throwable> BinaryOperator<T> throwing(
      ThrowingBinaryOperator<T, X> throwingBinaryOperator) {
    return throwingBinaryOperator;
  }

  public static <X extends Throwable> BooleanSupplier throwing(
      ThrowingBooleanSupplier<X> throwingBooleanSupplier) {
    return throwingBooleanSupplier;
  }

  public static <T, X extends Throwable> Consumer<T> throwing(
      ThrowingConsumer<T, X> throwingConsumer) {
    return throwingConsumer;
  }

  public static <X extends Throwable> DoubleBinaryOperator throwing(
      ThrowingDoubleBinaryOperator<X> throwingDoubleBinaryOperator) {
    return throwingDoubleBinaryOperator;
  }

  public static <X extends Throwable> DoubleConsumer throwing(
      ThrowingDoubleConsumer<X> throwingDoubleConsumer) {
    return throwingDoubleConsumer;
  }

  public static <R, X extends Throwable> DoubleFunction<R> throwing(
      ThrowingDoubleFunction<R, X> throwingDoubleFunction) {
    return throwingDoubleFunction;
  }

  public static <X extends Throwable> DoublePredicate throwing(
      ThrowingDoublePredicate<X> throwingDoublePredicate) {
    return throwingDoublePredicate;
  }

  public static <X extends Throwable> DoubleSupplier throwing(
      ThrowingDoubleSupplier<X> throwingDoubleSupplier) {
    return throwingDoubleSupplier;
  }

  public static <X extends Throwable> DoubleToIntFunction throwing(
      ThrowingDoubleToIntFunction<X> throwingDoubleToIntFunction) {
    return throwingDoubleToIntFunction;
  }

  public static <X extends Throwable> DoubleToLongFunction throwing(
      ThrowingDoubleToLongFunction<X> throwingDoubleToLongFunction) {
    return throwingDoubleToLongFunction;
  }

  public static <X extends Throwable> DoubleUnaryOperator throwing(
      ThrowingDoubleUnaryOperator<X> throwingDoubleUnaryOperator) {
    return throwingDoubleUnaryOperator;
  }

  public static <T, R, X extends Throwable> Function<T, R> throwing(
      ThrowingFunction<T, R, X> throwingFunction) {
    return throwingFunction;
  }

  public static <X extends Throwable> IntBinaryOperator throwing(
      ThrowingIntBinaryOperator<X> throwingIntBinaryOperator) {
    return throwingIntBinaryOperator;
  }

  public static <X extends Throwable> IntConsumer throwing(
      ThrowingIntConsumer<X> throwingIntConsumer) {
    return throwingIntConsumer;
  }

  public static <R, X extends Throwable> IntFunction<R> throwing(
      ThrowingIntFunction<R, X> throwingIntFunction) {
    return throwingIntFunction;
  }

  public static <X extends Throwable> IntPredicate throwing(
      ThrowingIntPredicate<X> throwingIntPredicate) {
    return throwingIntPredicate;
  }

  public static <X extends Throwable> IntSupplier throwing(
      ThrowingIntSupplier<X> throwingIntSupplier) {
    return throwingIntSupplier;
  }

  public static <X extends Throwable> IntToDoubleFunction throwing(
      ThrowingIntToDoubleFunction<X> throwingIntToDoubleFunction) {
    return throwingIntToDoubleFunction;
  }

  public static <X extends Throwable> IntToLongFunction throwing(
      ThrowingIntToLongFunction<X> throwingIntToLongFunction) {
    return throwingIntToLongFunction;
  }

  public static <X extends Throwable> IntUnaryOperator throwing(
      ThrowingIntUnaryOperator<X> throwingIntUnaryOperator) {
    return throwingIntUnaryOperator;
  }

  public static <X extends Throwable> LongBinaryOperator throwing(
      ThrowingLongBinaryOperator<X> throwingLongBinaryOperator) {
    return throwingLongBinaryOperator;
  }

  public static <X extends Throwable> LongConsumer throwing(
      ThrowingLongConsumer<X> throwingLongConsumer) {
    return throwingLongConsumer;
  }

  public static <R, X extends Throwable> LongFunction<R> throwing(
      ThrowingLongFunction<R, X> throwingLongFunction) {
    return throwingLongFunction;
  }

  public static <X extends Throwable> LongPredicate throwing(
      ThrowingLongPredicate<X> throwingLongPredicate) {
    return throwingLongPredicate;
  }

  public static <X extends Throwable> LongSupplier throwing(
      ThrowingLongSupplier<X> throwingLongSupplier) {
    return throwingLongSupplier;
  }

  public static <X extends Throwable> LongToDoubleFunction throwing(
      ThrowingLongToDoubleFunction<X> throwingLongToDoubleFunction) {
    return throwingLongToDoubleFunction;
  }

  public static <X extends Throwable> LongToIntFunction throwing(
      ThrowingLongToIntFunction<X> throwingLongToIntFunction) {
    return throwingLongToIntFunction;
  }

  public static <X extends Throwable> LongUnaryOperator throwing(
      ThrowingLongUnaryOperator<X> throwingLongUnaryOperator) {
    return throwingLongUnaryOperator;
  }

  public static <T, X extends Throwable> ObjDoubleConsumer<T> throwing(
      ThrowingObjDoubleConsumer<T, X> throwingObjDoubleConsumer) {
    return throwingObjDoubleConsumer;
  }

  public static <T, X extends Throwable> ObjIntConsumer<T> throwing(
      ThrowingObjIntConsumer<T, X> throwingObjIntConsumer) {
    return throwingObjIntConsumer;
  }

  public static <T, X extends Throwable> ObjLongConsumer<T> throwing(
      ThrowingObjLongConsumer<T, X> throwingObjLongConsumer) {
    return throwingObjLongConsumer;
  }

  public static <T, X extends Throwable> Predicate<T> throwing(
      ThrowingPredicate<T, X> throwingPredicate) {
    return throwingPredicate;
  }

  public static <T, X extends Throwable> Supplier<T> throwing(
      ThrowingSupplier<T, X> throwingSupplier) {
    return throwingSupplier;
  }

  public static <T, U, X extends Throwable> ToDoubleBiFunction<T, U> throwing(
      ThrowingToDoubleBiFunction<T, U, X> throwingToDoubleBiFunction) {
    return throwingToDoubleBiFunction;
  }

  public static <T, X extends Throwable> ToDoubleFunction<T> throwing(
      ThrowingToDoubleFunction<T, X> throwingToDoubleFunction) {
    return throwingToDoubleFunction;
  }

  public static <T, U, X extends Throwable> ToIntBiFunction<T, U> throwing(
      ThrowingToIntBiFunction<T, U, X> throwingToIntBiFunction) {
    return throwingToIntBiFunction;
  }

  public static <T, X extends Throwable> ToIntFunction<T> throwing(
      ThrowingToIntFunction<T, X> throwingToIntFunction) {
    return throwingToIntFunction;
  }

  public static <T, U, X extends Throwable> ToLongBiFunction<T, U> throwing(
      ThrowingToLongBiFunction<T, U, X> throwingToLongBiFunction) {
    return throwingToLongBiFunction;
  }

  public static <T, X extends Throwable> ToLongFunction<T> throwing(
      ThrowingToLongFunction<T, X> throwingToLongFunction) {
    return throwingToLongFunction;
  }

  public static <T, X extends Throwable> UnaryOperator<T> throwing(
      ThrowingUnaryOperator<T, X> throwingUnaryOperator) {
    return throwingUnaryOperator;
  }

  public static <X extends Throwable> Filter throwing(
      org.immersed.gaffe.java.util.logging.ThrowingFilter<X> throwingFilter) {
    return throwingFilter;
  }

  public static <X extends Throwable> PreferenceChangeListener throwing(
      ThrowingPreferenceChangeListener<X> throwingPreferenceChangeListener) {
    return throwingPreferenceChangeListener;
  }

  public static <X extends Throwable> ResourceBundleControlProvider throwing(
      ThrowingResourceBundleControlProvider<X> throwingResourceBundleControlProvider) {
    return throwingResourceBundleControlProvider;
  }

  public static <T, X extends Throwable> Interpolatable<T> throwing(
      ThrowingInterpolatable<T, X> throwingInterpolatable) {
    return throwingInterpolatable;
  }

  public static <X extends Throwable> InvalidationListener throwing(
      ThrowingInvalidationListener<X> throwingInvalidationListener) {
    return throwingInvalidationListener;
  }

  public static <X extends Throwable> WeakListener throwing(
      ThrowingWeakListener<X> throwingWeakListener) {
    return throwingWeakListener;
  }

  public static <T, X extends Throwable> ChangeListener<T> throwing(
      ThrowingChangeListener<T, X> throwingChangeListener) {
    return throwingChangeListener;
  }

  public static <T extends javafx.collections.ObservableArray<T>, X extends Throwable> ArrayChangeListener<T> throwing(
      ThrowingArrayChangeListener<T, X> throwingArrayChangeListener) {
    return throwingArrayChangeListener;
  }

  public static <E, X extends Throwable> ListChangeListener<E> throwing(
      ThrowingListChangeListener<E, X> throwingListChangeListener) {
    return throwingListChangeListener;
  }

  public static <K, V, X extends Throwable> MapChangeListener<K, V> throwing(
      ThrowingMapChangeListener<K, V, X> throwingMapChangeListener) {
    return throwingMapChangeListener;
  }

  public static <E, X extends Throwable> SetChangeListener<E> throwing(
      ThrowingSetChangeListener<E, X> throwingSetChangeListener) {
    return throwingSetChangeListener;
  }

  public static <X extends Throwable> EventDispatcher throwing(
      ThrowingEventDispatcher<X> throwingEventDispatcher) {
    return throwingEventDispatcher;
  }

  public static <T extends javafx.event.Event, X extends Throwable> EventHandler<T> throwing(
      ThrowingEventHandler<T, X> throwingEventHandler) {
    return throwingEventHandler;
  }

  public static <X extends Throwable> EventTarget throwing(
      ThrowingEventTarget<X> throwingEventTarget) {
    return throwingEventTarget;
  }

  public static <X extends Throwable> Initializable throwing(
      ThrowingInitializable<X> throwingInitializable) {
    return throwingInitializable;
  }

  public static <X extends Throwable> AudioSpectrumListener throwing(
      ThrowingAudioSpectrumListener<X> throwingAudioSpectrumListener) {
    return throwingAudioSpectrumListener;
  }

  public static <T, X extends Throwable> Builder<T> throwing(
      ThrowingBuilder<T, X> throwingBuilder) {
    return throwingBuilder;
  }

  public static <X extends Throwable> BuilderFactory throwing(
      ThrowingBuilderFactory<X> throwingBuilderFactory) {
    return throwingBuilderFactory;
  }

  public static <P, R, X extends Throwable> Callback<P, R> throwing(
      ThrowingCallback<P, R, X> throwingCallback) {
    return throwingCallback;
  }

  public static <X extends Throwable> DomainManagerOperations throwing(
      ThrowingDomainManagerOperations<X> throwingDomainManagerOperations) {
    return throwingDomainManagerOperations;
  }

  public static <X extends Throwable> InvokeHandler throwing(
      ThrowingInvokeHandler<X> throwingInvokeHandler) {
    return throwingInvokeHandler;
  }

  public static <X extends Throwable> ValueBase throwing(ThrowingValueBase<X> throwingValueBase) {
    return throwingValueBase;
  }

  public static <X extends Throwable> ValueFactory throwing(
      ThrowingValueFactory<X> throwingValueFactory) {
    return throwingValueFactory;
  }

  public static <X extends Throwable> CodecFactoryOperations throwing(
      ThrowingCodecFactoryOperations<X> throwingCodecFactoryOperations) {
    return throwingCodecFactoryOperations;
  }

  public static <X extends Throwable> PolicyFactoryOperations throwing(
      ThrowingPolicyFactoryOperations<X> throwingPolicyFactoryOperations) {
    return throwingPolicyFactoryOperations;
  }

  public static <X extends Throwable> AdapterActivatorOperations throwing(
      ThrowingAdapterActivatorOperations<X> throwingAdapterActivatorOperations) {
    return throwingAdapterActivatorOperations;
  }

  public static <X extends Throwable> DOMErrorHandler throwing(
      ThrowingDOMErrorHandler<X> throwingDOMErrorHandler) {
    return throwingDOMErrorHandler;
  }

  public static <X extends Throwable> UserDataHandler throwing(
      ThrowingUserDataHandler<X> throwingUserDataHandler) {
    return throwingUserDataHandler;
  }

  public static <X extends Throwable> ElementCSSInlineStyle throwing(
      ThrowingElementCSSInlineStyle<X> throwingElementCSSInlineStyle) {
    return throwingElementCSSInlineStyle;
  }

  public static <X extends Throwable> DocumentEvent throwing(
      ThrowingDocumentEvent<X> throwingDocumentEvent) {
    return throwingDocumentEvent;
  }

  public static <X extends Throwable> EventListener throwing(
      ThrowingEventListener<X> throwingEventListener) {
    return throwingEventListener;
  }

  public static <X extends Throwable> LSResourceResolver throwing(
      ThrowingLSResourceResolver<X> throwingLSResourceResolver) {
    return throwingLSResourceResolver;
  }

  public static <X extends Throwable> DocumentRange throwing(
      ThrowingDocumentRange<X> throwingDocumentRange) {
    return throwingDocumentRange;
  }

  public static <X extends Throwable> DocumentStyle throwing(
      ThrowingDocumentStyle<X> throwingDocumentStyle) {
    return throwingDocumentStyle;
  }

  public static <X extends Throwable> LinkStyle throwing(ThrowingLinkStyle<X> throwingLinkStyle) {
    return throwingLinkStyle;
  }

  public static <X extends Throwable> NodeFilter throwing(
      ThrowingNodeFilter<X> throwingNodeFilter) {
    return throwingNodeFilter;
  }

  public static <X extends Throwable> AbstractView throwing(
      ThrowingAbstractView<X> throwingAbstractView) {
    return throwingAbstractView;
  }

  public static <X extends Throwable> DocumentView throwing(
      ThrowingDocumentView<X> throwingDocumentView) {
    return throwingDocumentView;
  }

  public static <X extends Throwable> XPathExpression throwing(
      ThrowingXPathExpression<X> throwingXPathExpression) {
    return throwingXPathExpression;
  }

  public static <X extends Throwable> XPathNSResolver throwing(
      ThrowingXPathNSResolver<X> throwingXPathNSResolver) {
    return throwingXPathNSResolver;
  }

  public static <X extends Throwable> EntityResolver throwing(
      ThrowingEntityResolver<X> throwingEntityResolver) {
    return throwingEntityResolver;
  }
}