package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ads.InterfaceC3614Ad;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.internal.Model.CBError;
import com.ironsource.C11744X3;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.j2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3837j2 implements InterfaceC3752f9 {

    /* JADX INFO: renamed from: n */
    public static final a f14813n = new a(null);

    /* JADX INFO: renamed from: a */
    public final InterfaceC3614Ad f14814a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3696d f14815b;

    /* JADX INFO: renamed from: c */
    public final AdCallback f14816c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3703d6 f14817d;

    /* JADX INFO: renamed from: e */
    public final C3834j f14818e;

    /* JADX INFO: renamed from: f */
    public final C3768g2 f14819f;

    /* JADX INFO: renamed from: g */
    public boolean f14820g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f14821h;

    /* JADX INFO: renamed from: i */
    public final Lazy f14822i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f14823j;

    /* JADX INFO: renamed from: k */
    public final CoroutineScope f14824k;

    /* JADX INFO: renamed from: l */
    public Job f14825l;

    /* JADX INFO: renamed from: m */
    public URL f14826m;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.j2$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.j2$b */
    public class b implements InterfaceC3880l {
        public b() {
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: a */
        public void mo18166a() {
            AdCallback adCallbackM18159k = AbstractC3837j2.this.m18159k();
            C4026rb c4026rbM18828f = AbstractC3837j2.this.m18156g().m18828f();
            adCallbackM18159k.onAdClicked(new ClickEvent(c4026rbM18828f != null ? c4026rbM18828f.m19330b() : null, AbstractC3837j2.this.m18155e()), null);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: a */
        public void mo18167a(EnumC3820i8 expirationReason) {
            Intrinsics.checkNotNullParameter(expirationReason, "expirationReason");
            new C3719e(AbstractC3837j2.this.m18158j().mo17024d().mo18319c()).m17398a(new ExpirationEvent(AbstractC3837j2.this.m18155e(), expirationReason), AbstractC3837j2.this.m18159k());
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: a */
        public void mo18168a(EnumC3895le request) {
            Intrinsics.checkNotNullParameter(request, "request");
            C4048sb.m19408a("DefaultAdContainerListener: onRequestOrientation called with " + request + ". Ignoring as this ad type may not support or expect orientation changes.", (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: a */
        public void mo18169a(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.setFlags(268435456);
            ContextCompat.startActivity(AbstractC3837j2.this.m18158j().mo17024d().getContext(), intent, null);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: b */
        public void mo18170b() {
            C4048sb.m19408a("DefaultAdContainerListener: onAdClosed called. This is unexpected for the current ad type.", (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: c */
        public void mo18171c() {
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: d */
        public void mo18172d() {
            C4048sb.m19408a("DefaultAdContainerListener: onAdRewarded called. This is unexpected for the current ad type.", (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: e */
        public void mo18173e() {
            C4048sb.m19408a("DefaultAdContainerListener: onAdImpression called. This is unexpected for the current ad type.", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.j2$c */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3948o invoke() {
            return new C3948o(AbstractC3837j2.this.f14818e, AbstractC3837j2.this.m18155e().getMediation(), AbstractC3837j2.this.mo17608f(), AbstractC3837j2.this.m18158j().mo17023c(), AbstractC3837j2.this.m18158j().mo17022b(), AbstractC3837j2.this.m18158j().mo17019a().mo19003q(), AbstractC3837j2.this.m18158j().mo17019a().mo18989c(), null, 128, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.j2$d */
    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final d f14829b = new d();

        public d() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18175a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18175a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.j2$e */
    public static final class e extends b {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ DismissibleAdCallback f14831c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Function0 f14832d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(DismissibleAdCallback dismissibleAdCallback, Function0 function0) {
            super();
            this.f14831c = dismissibleAdCallback;
            this.f14832d = function0;
        }

        @Override // com.chartboost.sdk.impl.AbstractC3837j2.b, com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: b */
        public void mo18170b() {
            AbstractC3837j2.this.m18154d(false);
            DismissibleAdCallback dismissibleAdCallback = this.f14831c;
            C4026rb c4026rbM18828f = AbstractC3837j2.this.m18156g().m18828f();
            dismissibleAdCallback.onAdDismiss(new DismissEvent(c4026rbM18828f != null ? c4026rbM18828f.m19330b() : null, AbstractC3837j2.this.m18155e()));
        }

        @Override // com.chartboost.sdk.impl.AbstractC3837j2.b, com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: d */
        public void mo18172d() {
            this.f14832d.invoke();
        }

        @Override // com.chartboost.sdk.impl.AbstractC3837j2.b, com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: e */
        public void mo18173e() {
            Unit unit;
            C4026rb c4026rbM18828f = AbstractC3837j2.this.m18156g().m18828f();
            ShowEvent showEvent = new ShowEvent(c4026rbM18828f != null ? c4026rbM18828f.m19330b() : null, AbstractC3837j2.this.m18155e());
            AbstractC3837j2.this.m18165s();
            this.f14831c.onImpressionRecorded(new ImpressionEvent(showEvent.getAdID(), AbstractC3837j2.this.m18155e()));
            C4026rb c4026rbM18828f2 = AbstractC3837j2.this.m18156g().m18828f();
            if (c4026rbM18828f2 != null) {
                AbstractC3837j2.this.m18156g().m18825c(c4026rbM18828f2);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19417e("Cannot track impression: currentAd is null for location " + AbstractC3837j2.this.m18155e().getLocation(), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.j2$f */
    public static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f14833b;

        /* JADX INFO: renamed from: c */
        public Object f14834c;

        /* JADX INFO: renamed from: d */
        public long f14835d;

        /* JADX INFO: renamed from: e */
        public long f14836e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f14837f;

        /* JADX INFO: renamed from: h */
        public int f14839h;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f14837f = obj;
            this.f14839h |= Integer.MIN_VALUE;
            Object objM18139a = AbstractC3837j2.m18139a(AbstractC3837j2.this, (Context) null, (String) null, (C4058t) null, this);
            return objM18139a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM18139a : Result.m44945boximpl(objM18139a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.j2$g */
    public static final class g extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14840b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Context f14842d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f14843e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C4058t f14844f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context, String str, C4058t c4058t, Continuation continuation) {
            super(2, continuation);
            this.f14842d = context;
            this.f14843e = str;
            this.f14844f = c4058t;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AbstractC3837j2.this.new g(this.f14842d, this.f14843e, this.f14844f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMo17665a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f14840b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C3948o c3948oM18156g = AbstractC3837j2.this.m18156g();
                Context context = this.f14842d;
                String str = this.f14843e;
                C4058t c4058t = this.f14844f;
                this.f14840b = 1;
                objMo17665a = c3948oM18156g.mo17665a(context, str, c4058t, this);
                if (objMo17665a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo17665a = ((Result) obj).getValue();
            }
            return Result.m44945boximpl(objMo17665a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.j2$h */
    public static final class h extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f14846c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z) {
            super(0);
            this.f14846c = z;
        }

        /* JADX INFO: renamed from: a */
        public final void m18177a() {
            AbstractC3837j2.this.m18151b(this.f14846c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18177a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.j2$i */
    public static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: b */
        public Object f14847b;

        /* JADX INFO: renamed from: c */
        public Object f14848c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f14849d;

        /* JADX INFO: renamed from: f */
        public int f14851f;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f14849d = obj;
            this.f14851f |= Integer.MIN_VALUE;
            Object objM18140a = AbstractC3837j2.m18140a(AbstractC3837j2.this, null, this);
            return objM18140a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM18140a : Result.m44945boximpl(objM18140a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.j2$j */
    public static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14852b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ShowEvent f14854d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Context f14855e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ShowEvent showEvent, Context context, Continuation continuation) {
            super(2, continuation);
            this.f14854d = showEvent;
            this.f14855e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AbstractC3837j2.this.new j(this.f14854d, this.f14855e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMo17666a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f14852b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC3837j2.this.mo17609i().onAdRequestedToShow(this.f14854d);
                C3948o c3948oM18156g = AbstractC3837j2.this.m18156g();
                Context context = this.f14855e;
                this.f14852b = 1;
                objMo17666a = c3948oM18156g.mo17666a(context, this);
                if (objMo17666a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo17666a = ((Result) obj).getValue();
            }
            return Result.m44945boximpl(objMo17666a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.j2$k */
    public static final class k extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14856b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC4153x6 f14857c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ URL f14858d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AbstractC3837j2 f14859e;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.j2$k$a */
        public static final class a extends SuspendLambda implements Function3 {

            /* JADX INFO: renamed from: b */
            public int f14860b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f14861c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ URL f14862d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(URL url, Continuation continuation) {
                super(3, continuation);
                this.f14862d = url;
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(FlowCollector flowCollector, Throwable th, Continuation continuation) {
                a aVar = new a(this.f14862d, continuation);
                aVar.f14861c = th;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f14860b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.f14861c;
                ChartboostError.Other.Unknown unknown = new ChartboostError.Other.Unknown("Cache observer flow error for URL: " + this.f14862d, th instanceof Exception ? (Exception) th : new Exception(th));
                C4048sb.m19410b(C11744X3.j.f26438d + unknown.getCode() + "] " + unknown.getConstant() + " - Cache observer error", unknown);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.j2$k$b */
        public static final class b implements FlowCollector {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractC3837j2 f14863a;

            public b(AbstractC3837j2 abstractC3837j2) {
                this.f14863a = abstractC3837j2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3996q3 abstractC3996q3, Continuation continuation) {
                if (abstractC3996q3 instanceof AbstractC3996q3.a) {
                    AbstractC3996q3.a aVar = (AbstractC3996q3.a) abstractC3996q3;
                    C4048sb.m19413c("Observed eviction for " + this.f14863a.m18155e().getLocation() + ", reason: " + aVar.m19090a() + ", url: " + aVar.m19091b(), null, 2, null);
                    this.f14863a.mo17608f().mo18167a(aVar.m19090a());
                    this.f14863a.m18164r();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC4153x6 interfaceC4153x6, URL url, AbstractC3837j2 abstractC3837j2, Continuation continuation) {
            super(2, continuation);
            this.f14857c = interfaceC4153x6;
            this.f14858d = url;
            this.f14859e = abstractC3837j2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new k(this.f14857c, this.f14858d, this.f14859e, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.net.URL] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.StringBuilder] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = C11744X3.j.f26438d;
            String sb = "Failed to collect cache events for ";
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f14856b;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowM46468catch = FlowKt.m46468catch(this.f14857c.mo19900a(this.f14858d), new a(this.f14858d, null));
                    b bVar = new b(this.f14859e);
                    this.f14856b = 1;
                    if (flowM46468catch.collect(bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                String location = this.f14859e.m18155e().getLocation();
                str = this.f14858d;
                sb = new StringBuilder("Cache observer collect loop finished for ");
                sb.append(location);
                sb.append(", URL: ");
                sb.append(str);
                C4048sb.m19408a(sb.toString(), (Throwable) null, 2, (Object) null);
            } catch (CancellationException unused) {
                C4048sb.m19408a("Cache observer cancelled for " + this.f14859e.m18155e().getLocation() + ", URL: " + this.f14858d, (Throwable) null, 2, (Object) null);
            } catch (Exception e) {
                ChartboostError.Other.Unknown unknown = new ChartboostError.Other.Unknown(sb + this.f14859e.m18155e().getLocation(), e);
                C4048sb.m19410b(str + unknown.getCode() + "] " + unknown.getConstant() + " - Cache event collection failed, URL: " + this.f14858d, unknown);
            } finally {
                C4048sb.m19408a("Cache observer collect loop finished for " + this.f14859e.m18155e().getLocation() + ", URL: " + this.f14858d, (Throwable) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    public AbstractC3837j2(InterfaceC3614Ad ad, AbstractC3696d api, AdCallback originalCallback, InterfaceC3703d6 dependencyContainer, C3834j adConfigInternal) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(originalCallback, "originalCallback");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        Intrinsics.checkNotNullParameter(adConfigInternal, "adConfigInternal");
        this.f14814a = ad;
        this.f14815b = api;
        this.f14816c = originalCallback;
        this.f14817d = dependencyContainer;
        this.f14818e = adConfigInternal;
        this.f14819f = new C3768g2();
        this.f14822i = LazyKt.lazy(new c());
        this.f14824k = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC3880l m18138a(AbstractC3837j2 abstractC3837j2, DismissibleAdCallback dismissibleAdCallback, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFullscreenAdContainerListener");
        }
        if ((i2 & 2) != 0) {
            function0 = d.f14829b;
        }
        return abstractC3837j2.m18141a(dismissibleAdCallback, function0);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x014d A[Catch: Exception -> 0x01d8, TryCatch #2 {Exception -> 0x01d8, blocks: (B:64:0x0149, B:66:0x014d, B:68:0x0157, B:70:0x0165, B:73:0x016d, B:69:0x015b), top: B:101:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0157 A[Catch: Exception -> 0x01d8, TryCatch #2 {Exception -> 0x01d8, blocks: (B:64:0x0149, B:66:0x014d, B:68:0x0157, B:70:0x0165, B:73:0x016d, B:69:0x015b), top: B:101:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015b A[Catch: Exception -> 0x01d8, TryCatch #2 {Exception -> 0x01d8, blocks: (B:64:0x0149, B:66:0x014d, B:68:0x0157, B:70:0x0165, B:73:0x016d, B:69:0x015b), top: B:101:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x016a  */
    /* JADX WARN: Code duplicated, block: B:73:0x016d A[Catch: Exception -> 0x01d8, TRY_LEAVE, TryCatch #2 {Exception -> 0x01d8, blocks: (B:64:0x0149, B:66:0x014d, B:68:0x0157, B:70:0x0165, B:73:0x016d, B:69:0x015b), top: B:101:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0200  */
    /* JADX WARN: Code duplicated, block: B:88:0x0204  */
    /* JADX WARN: Code duplicated, block: B:89:0x021c  */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x016d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x01e7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x0204, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x021c, please report this as an issue */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m18139a(AbstractC3837j2 abstractC3837j2, Context context, String str, C4058t c4058t, Continuation continuation) throws Throwable {
        f fVar;
        String str2;
        Ref.ObjectRef objectRef;
        long j2;
        ChartboostError.Load internal;
        ChartboostError.Load load;
        Result result;
        Unit unit;
        ?? value;
        AbstractC3837j2 abstractC3837j3 = abstractC3837j2;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.f14839h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.f14839h = i2 - Integer.MIN_VALUE;
            } else {
                fVar = abstractC3837j3.new f(continuation);
            }
        } else {
            fVar = abstractC3837j3.new f(continuation);
        }
        f fVar2 = fVar;
        Object objWithTimeoutOrNull = fVar2.f14837f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fVar2.f14839h;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            if (!Chartboost.isSdkStarted()) {
                ChartboostError.Load.NotInitialized notInitialized = ChartboostError.Load.NotInitialized.INSTANCE;
                abstractC3837j3.m18148a(notInitialized);
                Result.Companion companion = Result.INSTANCE;
                return Result.m44946constructorimpl(ResultKt.createFailure(notInitialized));
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    ChartboostError.Load.NoContext noContext = ChartboostError.Load.NoContext.INSTANCE;
                    abstractC3837j3.m18148a(noContext);
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m44946constructorimpl(ResultKt.createFailure(noContext));
                }
            }
            boolean z = (str == null || str.length() == 0 || !C3948o.f15526n.m18831a(abstractC3837j3.f14819f, str)) ? false : true;
            abstractC3837j3.f14821h = z;
            if (abstractC3837j3.mo17667a()) {
                ChartboostError.Load.AlreadyLoaded alreadyLoaded = ChartboostError.Load.AlreadyLoaded.INSTANCE;
                abstractC3837j3.m18148a(alreadyLoaded);
                Result.Companion companion3 = Result.INSTANCE;
                return Result.m44946constructorimpl(ResultKt.createFailure(alreadyLoaded));
            }
            if (StringsKt.isBlank(abstractC3837j3.f14814a.getLocation())) {
                ChartboostError.Load.InvalidPlacement invalidPlacement = ChartboostError.Load.InvalidPlacement.INSTANCE;
                abstractC3837j3.m18148a(invalidPlacement);
                abstractC3837j3.m18162p();
                Result.Companion companion4 = Result.INSTANCE;
                return Result.m44946constructorimpl(ResultKt.createFailure(invalidPlacement));
            }
            if (str == null || str.length() == 0) {
                abstractC3837j3.m18160m();
                Result.Companion companion5 = Result.INSTANCE;
                return Result.m44946constructorimpl(ResultKt.createFailure(new ChartboostError.Load.InvalidAdm("Bid response is null or empty for placement: " + abstractC3837j3.f14814a.getLocation(), null)));
            }
            if (!z) {
                abstractC3837j3.f14821h = false;
                abstractC3837j3.mo17605a(str);
                Result.Companion companion6 = Result.INSTANCE;
                return Result.m44946constructorimpl(Unit.INSTANCE);
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Result.Companion companion7 = Result.INSTANCE;
            objectRef2.element = Result.m44946constructorimpl(ResultKt.createFailure(new ChartboostError.Load.Unknown("Load initialization failed", null)));
            C4026rb c4026rbM18828f = abstractC3837j3.m18156g().m18828f();
            C4168y c4168yM19329a = c4026rbM18828f != null ? c4026rbM18828f.m19329a() : null;
            long jM20006h = ((long) (c4168yM19329a != null ? c4168yM19329a.m20006h() : 30)) * 1000;
            str2 = C11744X3.j.f26438d;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                j2 = jM20006h;
                g gVar = abstractC3837j3.new g(context, str, c4058t, null);
                fVar2.f14833b = abstractC3837j3;
                fVar2.f14834c = objectRef2;
                fVar2.f14835d = j2;
                fVar2.f14836e = jCurrentTimeMillis;
                fVar2.f14839h = 1;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j2, gVar, fVar2);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                result = (Result) objWithTimeoutOrNull;
                if (result != null) {
                    value = result.getValue();
                    if (Result.m44953isSuccessimpl(value)) {
                        abstractC3837j3.mo17611o();
                    } else {
                        abstractC3837j3.m18148a(Result.m44949exceptionOrNullimpl(value));
                        abstractC3837j3.m18162p();
                    }
                    objectRef.element = value;
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    ChartboostError.Load.TimedOut timedOut = new ChartboostError.Load.TimedOut("Load operation exceeded timeout of " + j2 + "ms", new TimeoutException("Ad load timed out after " + j2 + " ms"));
                    C4048sb.m19410b(str2 + timedOut.getCode() + "] " + timedOut.getConstant() + " - Ad load timed out: " + abstractC3837j3.f14814a.getLocation(), timedOut);
                    abstractC3837j3.m18148a(timedOut);
                    abstractC3837j3.m18162p();
                    Result.Companion companion8 = Result.INSTANCE;
                    objectRef.element = Result.m44946constructorimpl(ResultKt.createFailure(timedOut));
                }
            } catch (Exception e2) {
                e = e2;
                objectRef = objectRef2;
                if (e instanceof ChartboostError.Load) {
                    load = (ChartboostError.Load) e;
                } else {
                    if (e instanceof IllegalArgumentException) {
                        internal = new ChartboostError.Load.InvalidRequest("Invalid request parameters: " + e.getMessage(), e);
                    } else if (e instanceof IllegalStateException) {
                        internal = new ChartboostError.Load.Internal("Invalid state during load: " + e.getMessage(), e);
                    } else {
                        internal = new ChartboostError.Load.Internal("Unexpected error during load: " + e.getMessage(), e);
                    }
                    load = internal;
                }
                C4048sb.m19410b(str2 + load.getCode() + "] " + load.getConstant() + " - Ad load failed: " + abstractC3837j3.f14814a.getLocation(), load);
                abstractC3837j3.m18148a(load);
                abstractC3837j3.m18162p();
                Result.Companion companion9 = Result.INSTANCE;
                objectRef.element = Result.m44946constructorimpl(ResultKt.createFailure(load));
                System.currentTimeMillis();
                return objectRef.element;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = fVar2.f14835d;
            objectRef = (Ref.ObjectRef) fVar2.f14834c;
            AbstractC3837j2 abstractC3837j4 = (AbstractC3837j2) fVar2.f14833b;
            try {
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                j2 = j3;
                abstractC3837j3 = abstractC3837j4;
                str2 = C11744X3.j.f26438d;
                try {
                    result = (Result) objWithTimeoutOrNull;
                    if (result != null) {
                        value = result.getValue();
                        if (Result.m44953isSuccessimpl(value)) {
                            abstractC3837j3.mo17611o();
                        } else {
                            abstractC3837j3.m18148a(Result.m44949exceptionOrNullimpl(value));
                            abstractC3837j3.m18162p();
                        }
                        objectRef.element = value;
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        ChartboostError.Load.TimedOut timedOut2 = new ChartboostError.Load.TimedOut("Load operation exceeded timeout of " + j2 + "ms", new TimeoutException("Ad load timed out after " + j2 + " ms"));
                        C4048sb.m19410b(str2 + timedOut2.getCode() + "] " + timedOut2.getConstant() + " - Ad load timed out: " + abstractC3837j3.f14814a.getLocation(), timedOut2);
                        abstractC3837j3.m18148a(timedOut2);
                        abstractC3837j3.m18162p();
                        Result.Companion companion10 = Result.INSTANCE;
                        objectRef.element = Result.m44946constructorimpl(ResultKt.createFailure(timedOut2));
                    }
                } catch (Exception e3) {
                    e = e3;
                    if (e instanceof ChartboostError.Load) {
                        load = (ChartboostError.Load) e;
                    } else {
                        if (e instanceof IllegalArgumentException) {
                            internal = new ChartboostError.Load.InvalidRequest("Invalid request parameters: " + e.getMessage(), e);
                        } else if (e instanceof IllegalStateException) {
                            internal = new ChartboostError.Load.Internal("Invalid state during load: " + e.getMessage(), e);
                        } else {
                            internal = new ChartboostError.Load.Internal("Unexpected error during load: " + e.getMessage(), e);
                        }
                        load = internal;
                    }
                    C4048sb.m19410b(str2 + load.getCode() + "] " + load.getConstant() + " - Ad load failed: " + abstractC3837j3.f14814a.getLocation(), load);
                    abstractC3837j3.m18148a(load);
                    abstractC3837j3.m18162p();
                    Result.Companion companion11 = Result.INSTANCE;
                    objectRef.element = Result.m44946constructorimpl(ResultKt.createFailure(load));
                }
            } catch (Exception e4) {
                e = e4;
                abstractC3837j3 = abstractC3837j4;
                str2 = C11744X3.j.f26438d;
                if (e instanceof ChartboostError.Load) {
                    load = (ChartboostError.Load) e;
                } else {
                    if (e instanceof IllegalArgumentException) {
                        internal = new ChartboostError.Load.InvalidRequest("Invalid request parameters: " + e.getMessage(), e);
                    } else if (e instanceof IllegalStateException) {
                        internal = new ChartboostError.Load.Internal("Invalid state during load: " + e.getMessage(), e);
                    } else {
                        internal = new ChartboostError.Load.Internal("Unexpected error during load: " + e.getMessage(), e);
                    }
                    load = internal;
                }
                C4048sb.m19410b(str2 + load.getCode() + "] " + load.getConstant() + " - Ad load failed: " + abstractC3837j3.f14814a.getLocation(), load);
                abstractC3837j3.m18148a(load);
                abstractC3837j3.m18162p();
                Result.Companion companion12 = Result.INSTANCE;
                objectRef.element = Result.m44946constructorimpl(ResultKt.createFailure(load));
                System.currentTimeMillis();
                return objectRef.element;
            }
        }
        System.currentTimeMillis();
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d7 A[Catch: Exception -> 0x0133, TryCatch #1 {Exception -> 0x0133, blocks: (B:47:0x00d3, B:49:0x00d7, B:51:0x00e1, B:53:0x00e8, B:55:0x00ec, B:44:0x00be), top: B:71:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1 A[Catch: Exception -> 0x0133, TryCatch #1 {Exception -> 0x0133, blocks: (B:47:0x00d3, B:49:0x00d7, B:51:0x00e1, B:53:0x00e8, B:55:0x00ec, B:44:0x00be), top: B:71:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e8 A[Catch: Exception -> 0x0133, TryCatch #1 {Exception -> 0x0133, blocks: (B:47:0x00d3, B:49:0x00d7, B:51:0x00e1, B:53:0x00e8, B:55:0x00ec, B:44:0x00be), top: B:71:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec A[Catch: Exception -> 0x0133, TRY_LEAVE, TryCatch #1 {Exception -> 0x0133, blocks: (B:47:0x00d3, B:49:0x00d7, B:51:0x00e1, B:53:0x00e8, B:55:0x00ec, B:44:0x00be), top: B:71:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:62:0x013d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x00ec, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x013d, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m18140a(AbstractC3837j2 abstractC3837j2, Context context, Continuation continuation) throws Throwable {
        i iVar;
        ShowEvent showEvent;
        Exception e2;
        ChartboostError.Show unknown;
        Result result;
        Object value;
        Throwable thM44949exceptionOrNullimpl;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.f14851f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.f14851f = i2 - Integer.MIN_VALUE;
            } else {
                iVar = abstractC3837j2.new i(continuation);
            }
        } else {
            iVar = abstractC3837j2.new i(continuation);
        }
        Object objWithTimeoutOrNull = iVar.f14849d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = iVar.f14851f;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                return ((Result) objWithTimeoutOrNull).getValue();
            }
            ShowEvent showEvent2 = (ShowEvent) iVar.f14848c;
            AbstractC3837j2 abstractC3837j3 = (AbstractC3837j2) iVar.f14847b;
            try {
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                showEvent = showEvent2;
                abstractC3837j2 = abstractC3837j3;
                result = (Result) objWithTimeoutOrNull;
                if (result != null) {
                    value = result.getValue();
                    thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(value);
                    if (thM44949exceptionOrNullimpl == null) {
                        abstractC3837j2.mo17604a((View) value, showEvent);
                        return value;
                    }
                    abstractC3837j2.m18149a(thM44949exceptionOrNullimpl, showEvent);
                    return value;
                }
                ChartboostError.Show.TimedOut timedOut = new ChartboostError.Show.TimedOut("Show operation exceeded timeout of 5000ms", new TimeoutException("Ad show timed out after 5000 ms"));
                C4048sb.m19410b(C11744X3.j.f26438d + timedOut.getCode() + "] " + timedOut.getConstant() + " - Ad show timed out: " + abstractC3837j2.f14814a.getLocation(), timedOut);
                abstractC3837j2.m18149a(timedOut, showEvent);
                Result.Companion companion = Result.INSTANCE;
                return Result.m44946constructorimpl(ResultKt.createFailure(timedOut));
            } catch (Exception e3) {
                e2 = e3;
                showEvent = showEvent2;
                abstractC3837j2 = abstractC3837j3;
                if (e2 instanceof ChartboostError.Show) {
                    unknown = (ChartboostError.Show) e2;
                } else {
                    unknown = new ChartboostError.Show.Unknown("Exception during ad show: " + e2.getMessage(), e2);
                }
                C4048sb.m19410b(C11744X3.j.f26438d + unknown.getCode() + "] " + unknown.getConstant() + " - Ad show failed: " + abstractC3837j2.f14814a.getLocation(), unknown);
                abstractC3837j2.m18149a(unknown, showEvent);
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m44946constructorimpl(ResultKt.createFailure(unknown));
            }
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        if (!Chartboost.isSdkStarted()) {
            abstractC3837j2.m18150a(false);
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(ChartboostError.Show.NotInitialized.INSTANCE));
        }
        abstractC3837j2.mo17603a(context);
        if (abstractC3837j2.f14821h) {
            if (!abstractC3837j2.mo17667a()) {
                Result.Companion companion4 = Result.INSTANCE;
                return Result.m44946constructorimpl(ResultKt.createFailure(ChartboostError.Show.NoAd.INSTANCE));
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    Result.Companion companion5 = Result.INSTANCE;
                    return Result.m44946constructorimpl(ResultKt.createFailure(ChartboostError.Show.NoContext.INSTANCE));
                }
            }
            C4026rb c4026rbM18828f = abstractC3837j2.m18156g().m18828f();
            showEvent = new ShowEvent(c4026rbM18828f != null ? c4026rbM18828f.m19330b() : null, abstractC3837j2.f14814a);
            try {
                j jVar = abstractC3837j2.new j(showEvent, context, null);
                iVar.f14847b = abstractC3837j2;
                iVar.f14848c = showEvent;
                iVar.f14851f = 1;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(5000L, jVar, iVar);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                }
                result = (Result) objWithTimeoutOrNull;
                if (result != null) {
                    value = result.getValue();
                    thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(value);
                    if (thM44949exceptionOrNullimpl == null) {
                        abstractC3837j2.mo17604a((View) value, showEvent);
                        return value;
                    }
                    abstractC3837j2.m18149a(thM44949exceptionOrNullimpl, showEvent);
                    return value;
                }
                ChartboostError.Show.TimedOut timedOut2 = new ChartboostError.Show.TimedOut("Show operation exceeded timeout of 5000ms", new TimeoutException("Ad show timed out after 5000 ms"));
                C4048sb.m19410b(C11744X3.j.f26438d + timedOut2.getCode() + "] " + timedOut2.getConstant() + " - Ad show timed out: " + abstractC3837j2.f14814a.getLocation(), timedOut2);
                abstractC3837j2.m18149a(timedOut2, showEvent);
                Result.Companion companion6 = Result.INSTANCE;
                return Result.m44946constructorimpl(ResultKt.createFailure(timedOut2));
            } catch (Exception e4) {
                e2 = e4;
                if (e2 instanceof ChartboostError.Show) {
                    unknown = (ChartboostError.Show) e2;
                } else {
                    unknown = new ChartboostError.Show.Unknown("Exception during ad show: " + e2.getMessage(), e2);
                }
                C4048sb.m19410b(C11744X3.j.f26438d + unknown.getCode() + "] " + unknown.getConstant() + " - Ad show failed: " + abstractC3837j2.f14814a.getLocation(), unknown);
                abstractC3837j2.m18149a(unknown, showEvent);
                Result.Companion companion7 = Result.INSTANCE;
                return Result.m44946constructorimpl(ResultKt.createFailure(unknown));
            }
        }
        iVar.f14851f = 2;
        Object objMo17606b = abstractC3837j2.mo17606b(context, iVar);
        if (objMo17606b != coroutine_suspended) {
            return objMo17606b;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3880l m18141a(DismissibleAdCallback callback, Function0 onReward) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(onReward, "onReward");
        return new e(callback, onReward);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3752f9
    /* JADX INFO: renamed from: a */
    public Object mo17665a(Context context, String str, C4058t c4058t, Continuation continuation) {
        return m18139a(this, context, str, c4058t, continuation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3752f9
    /* JADX INFO: renamed from: a */
    public Object mo17666a(Context context, Continuation continuation) {
        return m18140a(this, context, continuation);
    }

    /* JADX INFO: renamed from: a */
    public void mo17603a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public void mo17604a(View view, ShowEvent showEvent) {
        Intrinsics.checkNotNullParameter(showEvent, "showEvent");
        this.f14816c.onAdShown(showEvent, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m18142a(CacheEvent event, CacheError cacheError) {
        Intrinsics.checkNotNullParameter(event, "event");
        m18152c(cacheError == null);
        this.f14816c.onAdLoaded(event, cacheError);
    }

    /* JADX INFO: renamed from: a */
    public final void m18143a(ClickEvent event, ClickError clickError) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f14816c.onAdClicked(event, clickError);
    }

    /* JADX INFO: renamed from: a */
    public final void m18144a(ExpirationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f14816c.onAdExpired(event);
    }

    /* JADX INFO: renamed from: a */
    public final void m18145a(ImpressionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f14816c.onImpressionRecorded(event);
    }

    /* JADX INFO: renamed from: a */
    public final void m18146a(ShowEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f14820g = true;
        this.f14816c.onAdRequestedToShow(event);
    }

    /* JADX INFO: renamed from: a */
    public final void m18147a(ShowEvent event, ShowError showError) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f14820g = showError == null;
        this.f14816c.onAdShown(event, showError);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo17605a(String str);

    /* JADX INFO: renamed from: a */
    public void m18148a(Throwable th) {
        AdCallback adCallbackMo17609i = mo17609i();
        C4026rb c4026rbM18828f = m18156g().m18828f();
        adCallbackMo17609i.onAdLoaded(new CacheEvent(c4026rbM18828f != null ? c4026rbM18828f.m19330b() : null, this.f14814a), AbstractC3992q.m19082a(th));
    }

    /* JADX INFO: renamed from: a */
    public void m18149a(Throwable throwable, ShowEvent showEvent) {
        Unit unit;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(showEvent, "showEvent");
        this.f14820g = false;
        ShowError showErrorM19085b = AbstractC3992q.m19085b(throwable);
        C4026rb c4026rbM18828f = m18156g().m18828f();
        if (c4026rbM18828f != null) {
            m18156g().m18820a(c4026rbM18828f, throwable);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19417e("Cannot track show failure: currentAd is null for location " + this.f14814a.getLocation(), null, 2, null);
        }
        this.f14816c.onAdShown(showEvent, showErrorM19085b);
    }

    /* JADX INFO: renamed from: a */
    public final void m18150a(boolean z) {
        try {
            C3678c4.f13658b.mo17024d().mo18319c().mo18805a(new h(z));
        } catch (Exception e2) {
            ChartboostError.Other.Unknown unknown = new ChartboostError.Other.Unknown("Failed to post session not started callback for " + this.f14818e.m18083a(), e2);
            C4048sb.m19410b(C11744X3.j.f26438d + unknown.getCode() + "] " + unknown.getConstant() + " - Cannot post session not started callback", unknown);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3752f9
    /* JADX INFO: renamed from: a */
    public boolean mo17667a() {
        if (!this.f14821h && Chartboost.isSdkStarted()) {
            return m18161n();
        }
        return this.f14823j;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo17606b(Context context, Continuation continuation);

    @Override // com.chartboost.sdk.impl.InterfaceC3752f9
    /* JADX INFO: renamed from: b */
    public void mo17607b() {
        m18164r();
        CoroutineScopeKt.cancel$default(this.f14824k, "Coordinator destroyed", null, 2, null);
        m18156g().mo17607b();
    }

    /* JADX INFO: renamed from: b */
    public void m18151b(boolean z) {
        if (z) {
            this.f14816c.onAdLoaded(new CacheEvent(null, this.f14814a), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        } else {
            this.f14816c.onAdShown(new ShowEvent(null, this.f14814a), new ShowError(ShowError.Code.SESSION_NOT_STARTED, null, 2, null));
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3752f9
    /* JADX INFO: renamed from: c */
    public void mo17668c() {
        if (!Chartboost.isSdkStarted()) {
            C4048sb.m19411b("Chartboost is not initialized. Ignoring clearLoadedAd().", (Throwable) null, 2, (Object) null);
            return;
        }
        m18152c(false);
        m18162p();
        Job job = this.f14825l;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f14825l = null;
        this.f14826m = null;
        m18153d();
        m18156g().mo17668c();
    }

    /* JADX INFO: renamed from: c */
    public void m18152c(boolean z) {
        this.f14823j = z;
    }

    /* JADX INFO: renamed from: d */
    public void m18153d() {
        this.f14815b.m17220a();
    }

    /* JADX INFO: renamed from: d */
    public final void m18154d(boolean z) {
        this.f14820g = z;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC3614Ad m18155e() {
        return this.f14814a;
    }

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC3880l mo17608f();

    /* JADX INFO: renamed from: g */
    public final C3948o m18156g() {
        return (C3948o) this.f14822i.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC3696d m18157h() {
        return this.f14815b;
    }

    /* JADX INFO: renamed from: i */
    public abstract AdCallback mo17609i();

    /* JADX INFO: renamed from: j */
    public final InterfaceC3703d6 m18158j() {
        return this.f14817d;
    }

    /* JADX INFO: renamed from: k */
    public final AdCallback m18159k() {
        return this.f14816c;
    }

    /* JADX INFO: renamed from: l */
    public URL mo17610l() {
        C3825id c3825idM17336z;
        List listM17987w;
        C3825id c3825idM19331c;
        List listM17987w2;
        C4026rb c4026rbM18828f = m18156g().m18828f();
        AbstractC3860k2 abstractC3860k2 = (c4026rbM18828f == null || (c3825idM19331c = c4026rbM18828f.m19331c()) == null || (listM17987w2 = c3825idM19331c.m17987w()) == null) ? null : (AbstractC3860k2) CollectionsKt.firstOrNull(listM17987w2);
        C3832ik c3832ik = abstractC3860k2 instanceof C3832ik ? (C3832ik) abstractC3860k2 : null;
        if (c3832ik == null) {
            C3716dj c3716dj = abstractC3860k2 instanceof C3716dj ? (C3716dj) abstractC3860k2 : null;
            AbstractC3860k2 abstractC3860k3 = (c3716dj == null || (c3825idM17336z = c3716dj.m17336z()) == null || (listM17987w = c3825idM17336z.m17987w()) == null) ? null : (AbstractC3860k2) CollectionsKt.firstOrNull(listM17987w);
            c3832ik = abstractC3860k3 instanceof C3832ik ? (C3832ik) abstractC3860k3 : null;
        }
        if (c3832ik == null) {
            C4048sb.m19417e("Could not find VideoRenderable for ad with location " + this.f14814a.getLocation() + " to observe expiration.", null, 2, null);
        }
        if (c3832ik != null) {
            return c3832ik.m18052C();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m18160m() {
        this.f14815b.mo17230a("", (CBError.Type) CBError.Impression.INVALID_RESPONSE);
    }

    /* JADX INFO: renamed from: n */
    public boolean m18161n() {
        return this.f14815b.m17234b();
    }

    /* JADX INFO: renamed from: o */
    public void mo17611o() {
        m18163q();
        AdCallback adCallbackMo17609i = mo17609i();
        C4026rb c4026rbM18828f = m18156g().m18828f();
        adCallbackMo17609i.onAdLoaded(new CacheEvent(c4026rbM18828f != null ? c4026rbM18828f.m19330b() : null, this.f14814a), null);
    }

    /* JADX INFO: renamed from: p */
    public final void m18162p() {
        this.f14821h = false;
    }

    /* JADX INFO: renamed from: q */
    public void m18163q() {
        m18164r();
        URL urlMo17610l = mo17610l();
        if (urlMo17610l == null) {
            C4048sb.m19415d("No video URL to observe for ad at location " + this.f14814a.getLocation() + ".", null, 2, null);
            return;
        }
        this.f14826m = urlMo17610l;
        InterfaceC4153x6 interfaceC4153x6Mo18995i = this.f14817d.mo17019a().mo18995i();
        C4048sb.m19408a("Starting cache observer for " + this.f14814a.getLocation() + ", URL: " + urlMo17610l, (Throwable) null, 2, (Object) null);
        this.f14825l = BuildersKt__Builders_commonKt.launch$default(this.f14824k, null, null, new k(interfaceC4153x6Mo18995i, urlMo17610l, this, null), 3, null);
    }

    /* JADX INFO: renamed from: r */
    public void m18164r() {
        Job job = this.f14825l;
        if (job != null) {
            if (!job.isActive()) {
                job = null;
            }
            if (job != null) {
                C4048sb.m19408a("Stopping cache observer for " + this.f14814a.getLocation() + ", URL: " + this.f14826m, (Throwable) null, 2, (Object) null);
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }
        this.f14825l = null;
        this.f14826m = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m18165s() {
        AbstractC3628a0 abstractC3628a0M19220a = AbstractC4014r.m19220a(this.f14814a);
        C4031rg c4031rgMo18997k = this.f14817d.mo17019a().mo18997k();
        c4031rgMo18997k.m19349a(abstractC3628a0M19220a);
        C4048sb.m19413c("Current session impression count: " + c4031rgMo18997k.m19352b(abstractC3628a0M19220a) + " in session: " + c4031rgMo18997k.m19351b() + " (New Rendering Pipeline)", null, 2, null);
    }
}
