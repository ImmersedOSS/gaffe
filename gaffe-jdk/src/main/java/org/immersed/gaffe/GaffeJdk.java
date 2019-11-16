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

  public static <X extends Throwable> ActiveEvent throwingActiveEvent(
      ThrowingActiveEvent<X> throwingActiveEvent) {
    return throwingActiveEvent;
  }

  public static <X extends Throwable> Composite throwingComposite(
      ThrowingComposite<X> throwingComposite) {
    return throwingComposite;
  }

  public static <X extends Throwable> KeyEventDispatcher throwingKeyEventDispatcher(
      ThrowingKeyEventDispatcher<X> throwingKeyEventDispatcher) {
    return throwingKeyEventDispatcher;
  }

  public static <X extends Throwable> KeyEventPostProcessor throwingKeyEventPostProcessor(
      ThrowingKeyEventPostProcessor<X> throwingKeyEventPostProcessor) {
    return throwingKeyEventPostProcessor;
  }

  public static <X extends Throwable> PrintGraphics throwingPrintGraphics(
      ThrowingPrintGraphics<X> throwingPrintGraphics) {
    return throwingPrintGraphics;
  }

  public static <X extends Throwable> Stroke throwingStroke(ThrowingStroke<X> throwingStroke) {
    return throwingStroke;
  }

  public static <X extends Throwable> Transparency throwingTransparency(
      ThrowingTransparency<X> throwingTransparency) {
    return throwingTransparency;
  }

  public static <X extends Throwable> ClipboardOwner throwingClipboardOwner(
      ThrowingClipboardOwner<X> throwingClipboardOwner) {
    return throwingClipboardOwner;
  }

  public static <X extends Throwable> FlavorListener throwingFlavorListener(
      ThrowingFlavorListener<X> throwingFlavorListener) {
    return throwingFlavorListener;
  }

  public static <X extends Throwable> DragGestureListener throwingDragGestureListener(
      ThrowingDragGestureListener<X> throwingDragGestureListener) {
    return throwingDragGestureListener;
  }

  public static <X extends Throwable> DragSourceMotionListener throwingDragSourceMotionListener(
      ThrowingDragSourceMotionListener<X> throwingDragSourceMotionListener) {
    return throwingDragSourceMotionListener;
  }

  public static <X extends Throwable> AWTEventListener throwingAWTEventListener(
      ThrowingAWTEventListener<X> throwingAWTEventListener) {
    return throwingAWTEventListener;
  }

  public static <X extends Throwable> ActionListener throwingActionListener(
      ThrowingActionListener<X> throwingActionListener) {
    return throwingActionListener;
  }

  public static <X extends Throwable> AdjustmentListener throwingAdjustmentListener(
      ThrowingAdjustmentListener<X> throwingAdjustmentListener) {
    return throwingAdjustmentListener;
  }

  public static <X extends Throwable> HierarchyListener throwingHierarchyListener(
      ThrowingHierarchyListener<X> throwingHierarchyListener) {
    return throwingHierarchyListener;
  }

  public static <X extends Throwable> ItemListener throwingItemListener(
      ThrowingItemListener<X> throwingItemListener) {
    return throwingItemListener;
  }

  public static <X extends Throwable> MouseWheelListener throwingMouseWheelListener(
      ThrowingMouseWheelListener<X> throwingMouseWheelListener) {
    return throwingMouseWheelListener;
  }

  public static <X extends Throwable> TextListener throwingTextListener(
      ThrowingTextListener<X> throwingTextListener) {
    return throwingTextListener;
  }

  public static <X extends Throwable> WindowStateListener throwingWindowStateListener(
      ThrowingWindowStateListener<X> throwingWindowStateListener) {
    return throwingWindowStateListener;
  }

  public static <X extends Throwable> ImageObserver throwingImageObserver(
      ThrowingImageObserver<X> throwingImageObserver) {
    return throwingImageObserver;
  }

  public static <X extends Throwable> TileObserver throwingTileObserver(
      ThrowingTileObserver<X> throwingTileObserver) {
    return throwingTileObserver;
  }

  public static <X extends Throwable> RenderedImageFactory throwingRenderedImageFactory(
      ThrowingRenderedImageFactory<X> throwingRenderedImageFactory) {
    return throwingRenderedImageFactory;
  }

  public static <X extends Throwable> SystemTrayPeer throwingSystemTrayPeer(
      ThrowingSystemTrayPeer<X> throwingSystemTrayPeer) {
    return throwingSystemTrayPeer;
  }

  public static <X extends Throwable> Printable throwingPrintable(
      ThrowingPrintable<X> throwingPrintable) {
    return throwingPrintable;
  }

  public static <X extends Throwable> PrinterGraphics throwingPrinterGraphics(
      ThrowingPrinterGraphics<X> throwingPrinterGraphics) {
    return throwingPrinterGraphics;
  }

  public static <X extends Throwable> ExceptionListener throwingExceptionListener(
      ThrowingExceptionListener<X> throwingExceptionListener) {
    return throwingExceptionListener;
  }

  public static <X extends Throwable> PropertyChangeListener throwingPropertyChangeListener(
      ThrowingPropertyChangeListener<X> throwingPropertyChangeListener) {
    return throwingPropertyChangeListener;
  }

  public static <X extends Throwable> VetoableChangeListener throwingVetoableChangeListener(
      ThrowingVetoableChangeListener<X> throwingVetoableChangeListener) {
    return throwingVetoableChangeListener;
  }

  public static <X extends Throwable> BeanContextChildComponentProxy throwingBeanContextChildComponentProxy(
      ThrowingBeanContextChildComponentProxy<X> throwingBeanContextChildComponentProxy) {
    return throwingBeanContextChildComponentProxy;
  }

  public static <X extends Throwable> BeanContextContainerProxy throwingBeanContextContainerProxy(
      ThrowingBeanContextContainerProxy<X> throwingBeanContextContainerProxy) {
    return throwingBeanContextContainerProxy;
  }

  public static <X extends Throwable> BeanContextProxy throwingBeanContextProxy(
      ThrowingBeanContextProxy<X> throwingBeanContextProxy) {
    return throwingBeanContextProxy;
  }

  public static <X extends Throwable> BeanContextServiceRevokedListener throwingBeanContextServiceRevokedListener(
      ThrowingBeanContextServiceRevokedListener<X> throwingBeanContextServiceRevokedListener) {
    return throwingBeanContextServiceRevokedListener;
  }

  public static <X extends Throwable> Closeable throwingCloseable(
      ThrowingCloseable<X> throwingCloseable) {
    return throwingCloseable;
  }

  public static <X extends Throwable> FileFilter throwingFileFilter(
      ThrowingFileFilter<X> throwingFileFilter) {
    return throwingFileFilter;
  }

  public static <X extends Throwable> FilenameFilter throwingFilenameFilter(
      ThrowingFilenameFilter<X> throwingFilenameFilter) {
    return throwingFilenameFilter;
  }

  public static <X extends Throwable> Flushable throwingFlushable(
      ThrowingFlushable<X> throwingFlushable) {
    return throwingFlushable;
  }

  public static <X extends Throwable> ObjectInputValidation throwingObjectInputValidation(
      ThrowingObjectInputValidation<X> throwingObjectInputValidation) {
    return throwingObjectInputValidation;
  }

  public static <X extends Throwable> AutoCloseable throwingAutoCloseable(
      ThrowingAutoCloseable<X> throwingAutoCloseable) {
    return throwingAutoCloseable;
  }

  public static <T, X extends Throwable> Comparable<T> throwingComparable(
      ThrowingComparable<T, X> throwingComparable) {
    return throwingComparable;
  }

  public static <T, X extends Throwable> Iterable<T> throwingIterable(
      ThrowingIterable<T, X> throwingIterable) {
    return throwingIterable;
  }

  public static <X extends Throwable> Readable throwingReadable(
      ThrowingReadable<X> throwingReadable) {
    return throwingReadable;
  }

  public static <X extends Throwable> Runnable throwingRunnable(
      ThrowingRunnable<X> throwingRunnable) {
    return throwingRunnable;
  }

  public static <X extends Throwable> Thread.UncaughtExceptionHandler throwingThreadUncaughtExceptionHandler(
      ThrowingUncaughtExceptionHandler<X> throwingThreadUncaughtExceptionHandler) {
    return throwingThreadUncaughtExceptionHandler;
  }

  public static <X extends Throwable> ClassFileTransformer throwingClassFileTransformer(
      ThrowingClassFileTransformer<X> throwingClassFileTransformer) {
    return throwingClassFileTransformer;
  }

  public static <X extends Throwable> PlatformManagedObject throwingPlatformManagedObject(
      ThrowingPlatformManagedObject<X> throwingPlatformManagedObject) {
    return throwingPlatformManagedObject;
  }

  public static <X extends Throwable> GenericArrayType throwingGenericArrayType(
      ThrowingGenericArrayType<X> throwingGenericArrayType) {
    return throwingGenericArrayType;
  }

  public static <X extends Throwable> InvocationHandler throwingInvocationHandler(
      ThrowingInvocationHandler<X> throwingInvocationHandler) {
    return throwingInvocationHandler;
  }

  public static <X extends Throwable> ContentHandlerFactory throwingContentHandlerFactory(
      ThrowingContentHandlerFactory<X> throwingContentHandlerFactory) {
    return throwingContentHandlerFactory;
  }

  public static <X extends Throwable> CookiePolicy throwingCookiePolicy(
      ThrowingCookiePolicy<X> throwingCookiePolicy) {
    return throwingCookiePolicy;
  }

  public static <X extends Throwable> DatagramSocketImplFactory throwingDatagramSocketImplFactory(
      ThrowingDatagramSocketImplFactory<X> throwingDatagramSocketImplFactory) {
    return throwingDatagramSocketImplFactory;
  }

  public static <X extends Throwable> FileNameMap throwingFileNameMap(
      ThrowingFileNameMap<X> throwingFileNameMap) {
    return throwingFileNameMap;
  }

  public static <X extends Throwable> ProtocolFamily throwingProtocolFamily(
      ThrowingProtocolFamily<X> throwingProtocolFamily) {
    return throwingProtocolFamily;
  }

  public static <X extends Throwable> SocketImplFactory throwingSocketImplFactory(
      ThrowingSocketImplFactory<X> throwingSocketImplFactory) {
    return throwingSocketImplFactory;
  }

  public static <X extends Throwable> URLStreamHandlerFactory throwingURLStreamHandlerFactory(
      ThrowingURLStreamHandlerFactory<X> throwingURLStreamHandlerFactory) {
    return throwingURLStreamHandlerFactory;
  }

  public static <T, X extends Throwable> DirectoryStream.Filter<T> throwingDirectoryStreamFilter(
      ThrowingFilter<T, X> throwingDirectoryStreamFilter) {
    return throwingDirectoryStreamFilter;
  }

  public static <X extends Throwable> PathMatcher throwingPathMatcher(
      ThrowingPathMatcher<X> throwingPathMatcher) {
    return throwingPathMatcher;
  }

  public static <X extends Throwable> WatchEvent.Modifier throwingWatchEventModifier(
      ThrowingModifier<X> throwingWatchEventModifier) {
    return throwingWatchEventModifier;
  }

  public static <X extends Throwable> AttributeView throwingAttributeView(
      ThrowingAttributeView<X> throwingAttributeView) {
    return throwingAttributeView;
  }

  public static <X extends Throwable> FileAttributeView throwingFileAttributeView(
      ThrowingFileAttributeView<X> throwingFileAttributeView) {
    return throwingFileAttributeView;
  }

  public static <X extends Throwable> FileStoreAttributeView throwingFileStoreAttributeView(
      ThrowingFileStoreAttributeView<X> throwingFileStoreAttributeView) {
    return throwingFileStoreAttributeView;
  }

  public static <X extends Throwable> ActivationInstantiator throwingActivationInstantiator(
      ThrowingActivationInstantiator<X> throwingActivationInstantiator) {
    return throwingActivationInstantiator;
  }

  public static <X extends Throwable> Activator throwingActivator(
      ThrowingActivator<X> throwingActivator) {
    return throwingActivator;
  }

  public static <X extends Throwable> RMIClientSocketFactory throwingRMIClientSocketFactory(
      ThrowingRMIClientSocketFactory<X> throwingRMIClientSocketFactory) {
    return throwingRMIClientSocketFactory;
  }

  public static <X extends Throwable> RMIFailureHandler throwingRMIFailureHandler(
      ThrowingRMIFailureHandler<X> throwingRMIFailureHandler) {
    return throwingRMIFailureHandler;
  }

  public static <X extends Throwable> RMIServerSocketFactory throwingRMIServerSocketFactory(
      ThrowingRMIServerSocketFactory<X> throwingRMIServerSocketFactory) {
    return throwingRMIServerSocketFactory;
  }

  public static <X extends Throwable> Unreferenced throwingUnreferenced(
      ThrowingUnreferenced<X> throwingUnreferenced) {
    return throwingUnreferenced;
  }

  public static <X extends Throwable> DomainCombiner throwingDomainCombiner(
      ThrowingDomainCombiner<X> throwingDomainCombiner) {
    return throwingDomainCombiner;
  }

  public static <X extends Throwable> Guard throwingGuard(ThrowingGuard<X> throwingGuard) {
    return throwingGuard;
  }

  public static <X extends Throwable> KeyStore.LoadStoreParameter throwingKeyStoreLoadStoreParameter(
      ThrowingLoadStoreParameter<X> throwingKeyStoreLoadStoreParameter) {
    return throwingKeyStoreLoadStoreParameter;
  }

  public static <T, X extends Throwable> PrivilegedAction<T> throwingPrivilegedAction(
      ThrowingPrivilegedAction<T, X> throwingPrivilegedAction) {
    return throwingPrivilegedAction;
  }

  public static <T, X extends Throwable> PrivilegedExceptionAction<T> throwingPrivilegedExceptionAction(
      ThrowingPrivilegedExceptionAction<T, X> throwingPrivilegedExceptionAction) {
    return throwingPrivilegedExceptionAction;
  }

  public static <X extends Throwable> DSAKey throwingDSAKey(ThrowingDSAKey<X> throwingDSAKey) {
    return throwingDSAKey;
  }

  public static <X extends Throwable> ECKey throwingECKey(ThrowingECKey<X> throwingECKey) {
    return throwingECKey;
  }

  public static <X extends Throwable> RSAKey throwingRSAKey(ThrowingRSAKey<X> throwingRSAKey) {
    return throwingRSAKey;
  }

  public static <X extends Throwable> ECField throwingECField(ThrowingECField<X> throwingECField) {
    return throwingECField;
  }

  public static <X extends Throwable> DriverAction throwingDriverAction(
      ThrowingDriverAction<X> throwingDriverAction) {
    return throwingDriverAction;
  }

  public static <X extends Throwable> Era throwingEra(ThrowingEra<X> throwingEra) {
    return throwingEra;
  }

  public static <X extends Throwable> TemporalAdjuster throwingTemporalAdjuster(
      ThrowingTemporalAdjuster<X> throwingTemporalAdjuster) {
    return throwingTemporalAdjuster;
  }

  public static <R, X extends Throwable> TemporalQuery<R> throwingTemporalQuery(
      ThrowingTemporalQuery<R, X> throwingTemporalQuery) {
    return throwingTemporalQuery;
  }

  public static <X extends Throwable> Formattable throwingFormattable(
      ThrowingFormattable<X> throwingFormattable) {
    return throwingFormattable;
  }

  public static <X extends Throwable> Observer throwingObserver(
      ThrowingObserver<X> throwingObserver) {
    return throwingObserver;
  }

  public static <V, X extends Throwable> Callable<V> throwingCallable(
      ThrowingCallable<V, X> throwingCallable) {
    return throwingCallable;
  }

  public static <X extends Throwable> Executor throwingExecutor(
      ThrowingExecutor<X> throwingExecutor) {
    return throwingExecutor;
  }

  public static <X extends Throwable> ForkJoinPool.ForkJoinWorkerThreadFactory throwingForkJoinPoolForkJoinWorkerThreadFactory(
      ThrowingForkJoinWorkerThreadFactory<X> throwingForkJoinPoolForkJoinWorkerThreadFactory) {
    return throwingForkJoinPoolForkJoinWorkerThreadFactory;
  }

  public static <X extends Throwable> RejectedExecutionHandler throwingRejectedExecutionHandler(
      ThrowingRejectedExecutionHandler<X> throwingRejectedExecutionHandler) {
    return throwingRejectedExecutionHandler;
  }

  public static <X extends Throwable> ThreadFactory throwingThreadFactory(
      ThrowingThreadFactory<X> throwingThreadFactory) {
    return throwingThreadFactory;
  }

  public static <T, U, X extends Throwable> BiConsumer<T, U> throwingBiConsumer(
      ThrowingBiConsumer<T, U, X> throwingBiConsumer) {
    return throwingBiConsumer;
  }

  public static <T, U, R, X extends Throwable> BiFunction<T, U, R> throwingBiFunction(
      ThrowingBiFunction<T, U, R, X> throwingBiFunction) {
    return throwingBiFunction;
  }

  public static <T, U, X extends Throwable> BiPredicate<T, U> throwingBiPredicate(
      ThrowingBiPredicate<T, U, X> throwingBiPredicate) {
    return throwingBiPredicate;
  }

  public static <T, X extends Throwable> BinaryOperator<T> throwingBinaryOperator(
      ThrowingBinaryOperator<T, X> throwingBinaryOperator) {
    return throwingBinaryOperator;
  }

  public static <X extends Throwable> BooleanSupplier throwingBooleanSupplier(
      ThrowingBooleanSupplier<X> throwingBooleanSupplier) {
    return throwingBooleanSupplier;
  }

  public static <T, X extends Throwable> Consumer<T> throwingConsumer(
      ThrowingConsumer<T, X> throwingConsumer) {
    return throwingConsumer;
  }

  public static <X extends Throwable> DoubleBinaryOperator throwingDoubleBinaryOperator(
      ThrowingDoubleBinaryOperator<X> throwingDoubleBinaryOperator) {
    return throwingDoubleBinaryOperator;
  }

  public static <X extends Throwable> DoubleConsumer throwingDoubleConsumer(
      ThrowingDoubleConsumer<X> throwingDoubleConsumer) {
    return throwingDoubleConsumer;
  }

  public static <R, X extends Throwable> DoubleFunction<R> throwingDoubleFunction(
      ThrowingDoubleFunction<R, X> throwingDoubleFunction) {
    return throwingDoubleFunction;
  }

  public static <X extends Throwable> DoublePredicate throwingDoublePredicate(
      ThrowingDoublePredicate<X> throwingDoublePredicate) {
    return throwingDoublePredicate;
  }

  public static <X extends Throwable> DoubleSupplier throwingDoubleSupplier(
      ThrowingDoubleSupplier<X> throwingDoubleSupplier) {
    return throwingDoubleSupplier;
  }

  public static <X extends Throwable> DoubleToIntFunction throwingDoubleToIntFunction(
      ThrowingDoubleToIntFunction<X> throwingDoubleToIntFunction) {
    return throwingDoubleToIntFunction;
  }

  public static <X extends Throwable> DoubleToLongFunction throwingDoubleToLongFunction(
      ThrowingDoubleToLongFunction<X> throwingDoubleToLongFunction) {
    return throwingDoubleToLongFunction;
  }

  public static <X extends Throwable> DoubleUnaryOperator throwingDoubleUnaryOperator(
      ThrowingDoubleUnaryOperator<X> throwingDoubleUnaryOperator) {
    return throwingDoubleUnaryOperator;
  }

  public static <T, R, X extends Throwable> Function<T, R> throwingFunction(
      ThrowingFunction<T, R, X> throwingFunction) {
    return throwingFunction;
  }

  public static <X extends Throwable> IntBinaryOperator throwingIntBinaryOperator(
      ThrowingIntBinaryOperator<X> throwingIntBinaryOperator) {
    return throwingIntBinaryOperator;
  }

  public static <X extends Throwable> IntConsumer throwingIntConsumer(
      ThrowingIntConsumer<X> throwingIntConsumer) {
    return throwingIntConsumer;
  }

  public static <R, X extends Throwable> IntFunction<R> throwingIntFunction(
      ThrowingIntFunction<R, X> throwingIntFunction) {
    return throwingIntFunction;
  }

  public static <X extends Throwable> IntPredicate throwingIntPredicate(
      ThrowingIntPredicate<X> throwingIntPredicate) {
    return throwingIntPredicate;
  }

  public static <X extends Throwable> IntSupplier throwingIntSupplier(
      ThrowingIntSupplier<X> throwingIntSupplier) {
    return throwingIntSupplier;
  }

  public static <X extends Throwable> IntToDoubleFunction throwingIntToDoubleFunction(
      ThrowingIntToDoubleFunction<X> throwingIntToDoubleFunction) {
    return throwingIntToDoubleFunction;
  }

  public static <X extends Throwable> IntToLongFunction throwingIntToLongFunction(
      ThrowingIntToLongFunction<X> throwingIntToLongFunction) {
    return throwingIntToLongFunction;
  }

  public static <X extends Throwable> IntUnaryOperator throwingIntUnaryOperator(
      ThrowingIntUnaryOperator<X> throwingIntUnaryOperator) {
    return throwingIntUnaryOperator;
  }

  public static <X extends Throwable> LongBinaryOperator throwingLongBinaryOperator(
      ThrowingLongBinaryOperator<X> throwingLongBinaryOperator) {
    return throwingLongBinaryOperator;
  }

  public static <X extends Throwable> LongConsumer throwingLongConsumer(
      ThrowingLongConsumer<X> throwingLongConsumer) {
    return throwingLongConsumer;
  }

  public static <R, X extends Throwable> LongFunction<R> throwingLongFunction(
      ThrowingLongFunction<R, X> throwingLongFunction) {
    return throwingLongFunction;
  }

  public static <X extends Throwable> LongPredicate throwingLongPredicate(
      ThrowingLongPredicate<X> throwingLongPredicate) {
    return throwingLongPredicate;
  }

  public static <X extends Throwable> LongSupplier throwingLongSupplier(
      ThrowingLongSupplier<X> throwingLongSupplier) {
    return throwingLongSupplier;
  }

  public static <X extends Throwable> LongToDoubleFunction throwingLongToDoubleFunction(
      ThrowingLongToDoubleFunction<X> throwingLongToDoubleFunction) {
    return throwingLongToDoubleFunction;
  }

  public static <X extends Throwable> LongToIntFunction throwingLongToIntFunction(
      ThrowingLongToIntFunction<X> throwingLongToIntFunction) {
    return throwingLongToIntFunction;
  }

  public static <X extends Throwable> LongUnaryOperator throwingLongUnaryOperator(
      ThrowingLongUnaryOperator<X> throwingLongUnaryOperator) {
    return throwingLongUnaryOperator;
  }

  public static <T, X extends Throwable> ObjDoubleConsumer<T> throwingObjDoubleConsumer(
      ThrowingObjDoubleConsumer<T, X> throwingObjDoubleConsumer) {
    return throwingObjDoubleConsumer;
  }

  public static <T, X extends Throwable> ObjIntConsumer<T> throwingObjIntConsumer(
      ThrowingObjIntConsumer<T, X> throwingObjIntConsumer) {
    return throwingObjIntConsumer;
  }

  public static <T, X extends Throwable> ObjLongConsumer<T> throwingObjLongConsumer(
      ThrowingObjLongConsumer<T, X> throwingObjLongConsumer) {
    return throwingObjLongConsumer;
  }

  public static <T, X extends Throwable> Predicate<T> throwingPredicate(
      ThrowingPredicate<T, X> throwingPredicate) {
    return throwingPredicate;
  }

  public static <T, X extends Throwable> Supplier<T> throwingSupplier(
      ThrowingSupplier<T, X> throwingSupplier) {
    return throwingSupplier;
  }

  public static <T, U, X extends Throwable> ToDoubleBiFunction<T, U> throwingToDoubleBiFunction(
      ThrowingToDoubleBiFunction<T, U, X> throwingToDoubleBiFunction) {
    return throwingToDoubleBiFunction;
  }

  public static <T, X extends Throwable> ToDoubleFunction<T> throwingToDoubleFunction(
      ThrowingToDoubleFunction<T, X> throwingToDoubleFunction) {
    return throwingToDoubleFunction;
  }

  public static <T, U, X extends Throwable> ToIntBiFunction<T, U> throwingToIntBiFunction(
      ThrowingToIntBiFunction<T, U, X> throwingToIntBiFunction) {
    return throwingToIntBiFunction;
  }

  public static <T, X extends Throwable> ToIntFunction<T> throwingToIntFunction(
      ThrowingToIntFunction<T, X> throwingToIntFunction) {
    return throwingToIntFunction;
  }

  public static <T, U, X extends Throwable> ToLongBiFunction<T, U> throwingToLongBiFunction(
      ThrowingToLongBiFunction<T, U, X> throwingToLongBiFunction) {
    return throwingToLongBiFunction;
  }

  public static <T, X extends Throwable> ToLongFunction<T> throwingToLongFunction(
      ThrowingToLongFunction<T, X> throwingToLongFunction) {
    return throwingToLongFunction;
  }

  public static <T, X extends Throwable> UnaryOperator<T> throwingUnaryOperator(
      ThrowingUnaryOperator<T, X> throwingUnaryOperator) {
    return throwingUnaryOperator;
  }

  public static <X extends Throwable> Filter throwingFilter(
      org.immersed.gaffe.java.util.logging.ThrowingFilter<X> throwingFilter) {
    return throwingFilter;
  }

  public static <X extends Throwable> PreferenceChangeListener throwingPreferenceChangeListener(
      ThrowingPreferenceChangeListener<X> throwingPreferenceChangeListener) {
    return throwingPreferenceChangeListener;
  }

  public static <X extends Throwable> ResourceBundleControlProvider throwingResourceBundleControlProvider(
      ThrowingResourceBundleControlProvider<X> throwingResourceBundleControlProvider) {
    return throwingResourceBundleControlProvider;
  }

  public static <T, X extends Throwable> Interpolatable<T> throwingInterpolatable(
      ThrowingInterpolatable<T, X> throwingInterpolatable) {
    return throwingInterpolatable;
  }

  public static <X extends Throwable> InvalidationListener throwingInvalidationListener(
      ThrowingInvalidationListener<X> throwingInvalidationListener) {
    return throwingInvalidationListener;
  }

  public static <X extends Throwable> WeakListener throwingWeakListener(
      ThrowingWeakListener<X> throwingWeakListener) {
    return throwingWeakListener;
  }

  public static <T, X extends Throwable> ChangeListener<T> throwingChangeListener(
      ThrowingChangeListener<T, X> throwingChangeListener) {
    return throwingChangeListener;
  }

  public static <T extends javafx.collections.ObservableArray<T>, X extends Throwable> ArrayChangeListener<T> throwingArrayChangeListener(
      ThrowingArrayChangeListener<T, X> throwingArrayChangeListener) {
    return throwingArrayChangeListener;
  }

  public static <E, X extends Throwable> ListChangeListener<E> throwingListChangeListener(
      ThrowingListChangeListener<E, X> throwingListChangeListener) {
    return throwingListChangeListener;
  }

  public static <K, V, X extends Throwable> MapChangeListener<K, V> throwingMapChangeListener(
      ThrowingMapChangeListener<K, V, X> throwingMapChangeListener) {
    return throwingMapChangeListener;
  }

  public static <E, X extends Throwable> SetChangeListener<E> throwingSetChangeListener(
      ThrowingSetChangeListener<E, X> throwingSetChangeListener) {
    return throwingSetChangeListener;
  }

  public static <X extends Throwable> EventDispatcher throwingEventDispatcher(
      ThrowingEventDispatcher<X> throwingEventDispatcher) {
    return throwingEventDispatcher;
  }

  public static <T extends javafx.event.Event, X extends Throwable> EventHandler<T> throwingEventHandler(
      ThrowingEventHandler<T, X> throwingEventHandler) {
    return throwingEventHandler;
  }

  public static <X extends Throwable> EventTarget throwingEventTarget(
      ThrowingEventTarget<X> throwingEventTarget) {
    return throwingEventTarget;
  }

  public static <X extends Throwable> Initializable throwingInitializable(
      ThrowingInitializable<X> throwingInitializable) {
    return throwingInitializable;
  }

  public static <X extends Throwable> AudioSpectrumListener throwingAudioSpectrumListener(
      ThrowingAudioSpectrumListener<X> throwingAudioSpectrumListener) {
    return throwingAudioSpectrumListener;
  }

  public static <T, X extends Throwable> Builder<T> throwingBuilder(
      ThrowingBuilder<T, X> throwingBuilder) {
    return throwingBuilder;
  }

  public static <X extends Throwable> BuilderFactory throwingBuilderFactory(
      ThrowingBuilderFactory<X> throwingBuilderFactory) {
    return throwingBuilderFactory;
  }

  public static <P, R, X extends Throwable> Callback<P, R> throwingCallback(
      ThrowingCallback<P, R, X> throwingCallback) {
    return throwingCallback;
  }

  public static <X extends Throwable> DomainManagerOperations throwingDomainManagerOperations(
      ThrowingDomainManagerOperations<X> throwingDomainManagerOperations) {
    return throwingDomainManagerOperations;
  }

  public static <X extends Throwable> InvokeHandler throwingInvokeHandler(
      ThrowingInvokeHandler<X> throwingInvokeHandler) {
    return throwingInvokeHandler;
  }

  public static <X extends Throwable> ValueBase throwingValueBase(
      ThrowingValueBase<X> throwingValueBase) {
    return throwingValueBase;
  }

  public static <X extends Throwable> ValueFactory throwingValueFactory(
      ThrowingValueFactory<X> throwingValueFactory) {
    return throwingValueFactory;
  }

  public static <X extends Throwable> CodecFactoryOperations throwingCodecFactoryOperations(
      ThrowingCodecFactoryOperations<X> throwingCodecFactoryOperations) {
    return throwingCodecFactoryOperations;
  }

  public static <X extends Throwable> PolicyFactoryOperations throwingPolicyFactoryOperations(
      ThrowingPolicyFactoryOperations<X> throwingPolicyFactoryOperations) {
    return throwingPolicyFactoryOperations;
  }

  public static <X extends Throwable> AdapterActivatorOperations throwingAdapterActivatorOperations(
      ThrowingAdapterActivatorOperations<X> throwingAdapterActivatorOperations) {
    return throwingAdapterActivatorOperations;
  }

  public static <X extends Throwable> DOMErrorHandler throwingDOMErrorHandler(
      ThrowingDOMErrorHandler<X> throwingDOMErrorHandler) {
    return throwingDOMErrorHandler;
  }

  public static <X extends Throwable> UserDataHandler throwingUserDataHandler(
      ThrowingUserDataHandler<X> throwingUserDataHandler) {
    return throwingUserDataHandler;
  }

  public static <X extends Throwable> ElementCSSInlineStyle throwingElementCSSInlineStyle(
      ThrowingElementCSSInlineStyle<X> throwingElementCSSInlineStyle) {
    return throwingElementCSSInlineStyle;
  }

  public static <X extends Throwable> DocumentEvent throwingDocumentEvent(
      ThrowingDocumentEvent<X> throwingDocumentEvent) {
    return throwingDocumentEvent;
  }

  public static <X extends Throwable> EventListener throwingEventListener(
      ThrowingEventListener<X> throwingEventListener) {
    return throwingEventListener;
  }

  public static <X extends Throwable> LSResourceResolver throwingLSResourceResolver(
      ThrowingLSResourceResolver<X> throwingLSResourceResolver) {
    return throwingLSResourceResolver;
  }

  public static <X extends Throwable> DocumentRange throwingDocumentRange(
      ThrowingDocumentRange<X> throwingDocumentRange) {
    return throwingDocumentRange;
  }

  public static <X extends Throwable> DocumentStyle throwingDocumentStyle(
      ThrowingDocumentStyle<X> throwingDocumentStyle) {
    return throwingDocumentStyle;
  }

  public static <X extends Throwable> LinkStyle throwingLinkStyle(
      ThrowingLinkStyle<X> throwingLinkStyle) {
    return throwingLinkStyle;
  }

  public static <X extends Throwable> NodeFilter throwingNodeFilter(
      ThrowingNodeFilter<X> throwingNodeFilter) {
    return throwingNodeFilter;
  }

  public static <X extends Throwable> AbstractView throwingAbstractView(
      ThrowingAbstractView<X> throwingAbstractView) {
    return throwingAbstractView;
  }

  public static <X extends Throwable> DocumentView throwingDocumentView(
      ThrowingDocumentView<X> throwingDocumentView) {
    return throwingDocumentView;
  }

  public static <X extends Throwable> XPathExpression throwingXPathExpression(
      ThrowingXPathExpression<X> throwingXPathExpression) {
    return throwingXPathExpression;
  }

  public static <X extends Throwable> XPathNSResolver throwingXPathNSResolver(
      ThrowingXPathNSResolver<X> throwingXPathNSResolver) {
    return throwingXPathNSResolver;
  }

  public static <X extends Throwable> EntityResolver throwingEntityResolver(
      ThrowingEntityResolver<X> throwingEntityResolver) {
    return throwingEntityResolver;
  }
}
