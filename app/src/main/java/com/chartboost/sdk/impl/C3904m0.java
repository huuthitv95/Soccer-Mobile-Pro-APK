package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3904m0 implements InterfaceC3971p0, InterfaceC3891la, InterfaceC4178y9, InterfaceC3868ka, InterfaceC3927n0, InterfaceC3911m7 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3628a0 f15288a;

    /* JADX INFO: renamed from: b */
    public final C3769g3 f15289b;

    /* JADX INFO: renamed from: c */
    public final C4001q8 f15290c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3855jk f15291d;

    /* JADX INFO: renamed from: e */
    public final C4134w9 f15292e;

    /* JADX INFO: renamed from: f */
    public final C3993q0 f15293f;

    /* JADX INFO: renamed from: g */
    public final C4204zd f15294g;

    /* JADX INFO: renamed from: h */
    public final C4003qa f15295h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC4096uf f15296i;

    /* JADX INFO: renamed from: j */
    public final C3848jd f15297j;

    /* JADX INFO: renamed from: k */
    public final C3898lh f15298k;

    /* JADX INFO: renamed from: l */
    public final Mediation f15299l;

    /* JADX INFO: renamed from: m */
    public final CoroutineScope f15300m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC3911m7 f15301n;

    /* JADX INFO: renamed from: o */
    public final EndpointRepository f15302o;

    /* JADX INFO: renamed from: p */
    public InterfaceC3949o0 f15303p;

    /* JADX INFO: renamed from: q */
    public C4149x2 f15304q;

    /* JADX INFO: renamed from: r */
    public final Map f15305r;

    /* JADX INFO: renamed from: s */
    public final c f15306s;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.m0$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15307b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewGroup f15308c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewGroup viewGroup, Continuation continuation) {
            super(2, continuation);
            this.f15308c = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f15308c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f15307b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f15307b = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.f15308c.removeAllViews();
            this.f15308c.invalidate();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.m0$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15309b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C4149x2 f15310c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C3904m0 f15311d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C3950o1 f15312e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4149x2 c4149x2, C3904m0 c3904m0, C3950o1 c3950o1, Continuation continuation) {
            super(2, continuation);
            this.f15310c = c4149x2;
            this.f15311d = c3904m0;
            this.f15312e = c3950o1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f15310c, this.f15311d, this.f15312e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Unit unit;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15309b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C4149x2 c4149x2 = this.f15310c;
            if (c4149x2 != null) {
                c4149x2.m19842J();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f15311d.m18577d(this.f15312e, CBError.Impression.PENDING_IMPRESSION_ERROR);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.m0$c */
    public static final class c implements InterfaceC3856jl {
        public c() {
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3856jl
        /* JADX INFO: renamed from: a */
        public void mo18300a() {
            C4149x2 c4149x2 = C3904m0.this.f15304q;
            if (c4149x2 != null) {
                c4149x2.m19862b(CBError.Impression.WEB_VIEW_PAGE_LOAD_TIMEOUT);
            }
        }
    }

    public C3904m0(AbstractC3628a0 adType, C3769g3 reachability, C4001q8 fileCache, InterfaceC3855jk videoRepository, C4134w9 impressionBuilder, C3993q0 adUnitRendererShowRequest, C4204zd openMeasurementController, C4003qa viewProtocolBuilder, InterfaceC4096uf rendererActivityBridge, C3848jd nativeBridgeCommand, C3898lh templateLoader, Mediation mediation, CoroutineScope uiScope, InterfaceC3911m7 eventTracker, EndpointRepository endpointRepository) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(impressionBuilder, "impressionBuilder");
        Intrinsics.checkNotNullParameter(adUnitRendererShowRequest, "adUnitRendererShowRequest");
        Intrinsics.checkNotNullParameter(openMeasurementController, "openMeasurementController");
        Intrinsics.checkNotNullParameter(viewProtocolBuilder, "viewProtocolBuilder");
        Intrinsics.checkNotNullParameter(rendererActivityBridge, "rendererActivityBridge");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(templateLoader, "templateLoader");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        this.f15288a = adType;
        this.f15289b = reachability;
        this.f15290c = fileCache;
        this.f15291d = videoRepository;
        this.f15292e = impressionBuilder;
        this.f15293f = adUnitRendererShowRequest;
        this.f15294g = openMeasurementController;
        this.f15295h = viewProtocolBuilder;
        this.f15296i = rendererActivityBridge;
        this.f15297j = nativeBridgeCommand;
        this.f15298k = templateLoader;
        this.f15299l = mediation;
        this.f15300m = uiScope;
        this.f15301n = eventTracker;
        this.f15302o = endpointRepository;
        this.f15305r = new LinkedHashMap();
        this.f15306s = new c();
    }

    public /* synthetic */ C3904m0(AbstractC3628a0 abstractC3628a0, C3769g3 c3769g3, C4001q8 c4001q8, InterfaceC3855jk interfaceC3855jk, C4134w9 c4134w9, C3993q0 c3993q0, C4204zd c4204zd, C4003qa c4003qa, InterfaceC4096uf interfaceC4096uf, C3848jd c3848jd, C3898lh c3898lh, Mediation mediation, CoroutineScope coroutineScope, InterfaceC3911m7 interfaceC3911m7, EndpointRepository endpointRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3628a0, c3769g3, c4001q8, interfaceC3855jk, c4134w9, c3993q0, c4204zd, c4003qa, interfaceC4096uf, c3848jd, c3898lh, mediation, (i & 4096) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()) : coroutineScope, interfaceC3911m7, endpointRepository);
    }

    /* JADX INFO: renamed from: a */
    public static final void m18573a(C3904m0 this$0, C3950o1 appRequest, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appRequest, "$appRequest");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.m18608f(appRequest);
    }

    /* JADX INFO: renamed from: a */
    public static final void m18574a(C3904m0 this$0, C4149x2 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.m18592a(it);
    }

    /* JADX INFO: renamed from: c */
    private final String m18575c(C3950o1 c3950o1) {
        C3651b0 c3651b0M18857a;
        if (c3950o1 == null || (c3651b0M18857a = c3950o1.m18857a()) == null) {
            return null;
        }
        return c3651b0M18857a.m16871m();
    }

    /* JADX INFO: renamed from: c */
    private final void m18576c(C3950o1 c3950o1, CBError.Impression impression) {
        Unit unit;
        InterfaceC3949o0 interfaceC3949o0 = this.f15303p;
        if (interfaceC3949o0 != null) {
            interfaceC3949o0.mo17229a(m18575c(c3950o1), impression);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("Missing AdUnitRendererAdCallback while sending onShowFailure with error: " + impression, (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m18577d(C3950o1 c3950o1, CBError.Impression impression) {
        m18576c(c3950o1, impression);
        if (impression == CBError.Impression.NO_AD_FOUND) {
            return;
        }
        String strM16771b = this.f15288a.m16771b();
        C3651b0 c3651b0M18857a = c3950o1.m18857a();
        String strM16859a = c3651b0M18857a != null ? c3651b0M18857a.m16859a() : null;
        C4048sb.m19411b("reportError: adTypeTraits: " + strM16771b + " reason: cache  format: web error: " + impression + " adId: " + strM16859a + " appRequest.location: " + c3950o1.m18865d(), (Throwable) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: e */
    private final void m18578e(C3950o1 c3950o1) {
        c3950o1.m18863b(false);
        c3950o1.m18858a((C3651b0) null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: A */
    public void mo18363A() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19881z();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: B */
    public String mo18364B() {
        String strM19878w;
        C4149x2 c4149x2 = this.f15304q;
        return (c4149x2 == null || (strM19878w = c4149x2.m19878w()) == null) ? "" : strM19878w;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: C */
    public String mo18365C() {
        String strM19877v;
        C4149x2 c4149x2 = this.f15304q;
        return (c4149x2 == null || (strM19877v = c4149x2.m19877v()) == null) ? "" : strM19877v;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4178y9
    /* JADX INFO: renamed from: D */
    public void mo18579D() {
        C4149x2 c4149x2 = this.f15304q;
        if ((c4149x2 != null ? c4149x2.m19872q() : null) != EnumC3937na.DISPLAYED || Intrinsics.areEqual(this.f15288a, AbstractC3628a0.a.f13428g)) {
            return;
        }
        this.f15296i.finishActivity();
    }

    /* JADX INFO: renamed from: E */
    public final void m18580E() {
        try {
            C4149x2 c4149x2 = this.f15304q;
            if (c4149x2 != null) {
                this.f15294g.mo16832f();
                ViewGroup viewGroupMo19050i = c4149x2.mo19050i();
                if (viewGroupMo19050i != null) {
                    BuildersKt__Builders_commonKt.launch$default(this.f15300m, null, null, new a(viewGroupMo19050i, null), 3, null);
                }
                c4149x2.m19848P();
                this.f15304q = null;
                this.f15303p = null;
            }
        } catch (Exception e) {
            C4048sb.m19410b("detachBannerImpression error", e);
        }
    }

    /* JADX INFO: renamed from: F */
    public final Mediation m18581F() {
        return this.f15299l;
    }

    /* JADX INFO: renamed from: G */
    public final int m18582G() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            return c4149x2.m19879x();
        }
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public boolean m18583H() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            return c4149x2.mo19046e();
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3971p0
    /* JADX INFO: renamed from: a */
    public void mo18584a() {
        this.f15296i.mo19591a();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: a */
    public void mo18366a(float f) {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19859b(f);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: a */
    public void mo18367a(float f, float f2) {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19850a(f, f2);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3971p0
    /* JADX INFO: renamed from: a */
    public void mo18585a(int i, boolean z) {
        this.f15296i.mo19592a(i, z);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    @Override // com.chartboost.sdk.impl.InterfaceC3971p0
    /* JADX INFO: renamed from: a */
    public void mo18586a(Context context) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        final C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 == null) {
            unit = null;
        } else if (!this.f15294g.m20139h()) {
            c4149x2.mo19043c(true);
            C4048sb.m19408a("Cannot create visibility tracker due to the OM SDK being disabled!", (Throwable) null, 2, (Object) null);
            return;
        } else {
            if (c4149x2.m19835C()) {
                C4048sb.m19411b("Cannot create VisibilityTracker due to missing view!", (Throwable) null, 2, (Object) null);
                return;
            }
            AbstractC3969ok abstractC3969okM19880y = c4149x2.m19880y();
            if (abstractC3969okM19880y != null) {
                C4204zd c4204zd = this.f15294g;
                View rootView = abstractC3969okM19880y.getRootView();
                Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
                c4204zd.m20135a(context, abstractC3969okM19880y, rootView, new C3672bl.b() { // from class: com.chartboost.sdk.impl.m0$$ExternalSyntheticLambda1
                    @Override // com.chartboost.sdk.impl.C3672bl.b
                    /* JADX INFO: renamed from: a */
                    public final void mo16989a() {
                        C3904m0.m18574a(this.f$0, c4149x2);
                    }
                });
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
        }
        if (unit == null) {
            C4048sb.m19411b("Missing impression onImpressionViewCreated", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18587a(InterfaceC3807hi interfaceC3807hi, String str) {
        String strM19873r;
        String strM16771b = this.f15288a.m16771b();
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 == null || (strM19873r = c4149x2.m19873r()) == null) {
            strM19873r = "No location";
        }
        track((AbstractC3738ei) new C4091ua(interfaceC3807hi, str, strM16771b, strM19873r, this.f15299l, null, 32, null));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: a */
    public void mo18368a(C3884l3 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.mo19851a(url);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3891la
    /* JADX INFO: renamed from: a */
    public void mo18496a(EnumC3937na state) {
        Intrinsics.checkNotNullParameter(state, "state");
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19861b(state);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3971p0
    /* JADX INFO: renamed from: a */
    public void mo18588a(C3950o1 appRequest) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        m18578e(appRequest);
        this.f15294g.m20138g();
    }

    /* JADX INFO: renamed from: a */
    public final void m18589a(C3950o1 appRequest, InterfaceC3949o0 callback) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f15303p = callback;
        if (!this.f15289b.m17757e()) {
            m18576c(appRequest, CBError.Impression.INTERNET_UNAVAILABLE_AT_SHOW);
            return;
        }
        C3651b0 c3651b0M18857a = appRequest.m18857a();
        if (c3651b0M18857a == null) {
            m18577d(appRequest, CBError.Impression.NO_AD_FOUND);
        } else if (!this.f15290c.m19135a(c3651b0M18857a).booleanValue()) {
            m18577d(appRequest, CBError.Impression.ASSET_MISSING);
        } else {
            m18612h(appRequest);
            m18610g(appRequest);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18590a(C3950o1 c3950o1, C4149x2 c4149x2, CBError.Impression impression) {
        if (impression == null) {
            BuildersKt__Builders_commonKt.launch$default(this.f15300m, null, null, new b(c4149x2, this, c3950o1, null), 3, null);
        } else {
            m18577d(c3950o1, impression);
            m18578e(c3950o1);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3971p0
    /* JADX INFO: renamed from: a */
    public void mo18591a(C3950o1 appRequest, CBError.Impression error) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(error, "error");
        m18601b(appRequest, error);
        track((AbstractC3738ei) new C3954o5(InterfaceC3807hi.i.UNEXPECTED_DISMISS_ERROR, "", this.f15288a.m16771b(), appRequest.m18865d(), this.f15299l, null, 32, null));
        this.f15296i.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: a */
    public void mo18369a(EnumC4012qj vastVideoEvent) {
        Intrinsics.checkNotNullParameter(vastVideoEvent, "vastVideoEvent");
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19852a(vastVideoEvent);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: a */
    public void mo18370a(EnumC4029re playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19853a(playerState);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18592a(C4149x2 c4149x2) {
        C4048sb.m19411b("Visibility check success!", (Throwable) null, 2, (Object) null);
        c4149x2.mo19043c(true);
        if (!c4149x2.mo19049h() || c4149x2.mo19047f()) {
            return;
        }
        m18611g(c4149x2.m19870o());
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3927n0
    /* JADX INFO: renamed from: a */
    public void mo18593a(CBError.Impression error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.mo19037a(error);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // com.chartboost.sdk.impl.InterfaceC3927n0
    /* JADX INFO: renamed from: a */
    public void mo18594a(CBImpressionActivity activity) {
        Unit unit;
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.mo19036a(c4149x2.m19872q(), activity);
            AbstractC3969ok abstractC3969okM19880y = c4149x2.m19880y();
            if (abstractC3969okM19880y != null) {
                this.f15296i.mo19595a(abstractC3969okM19880y);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19411b("Cannot display missing impression onActivityIsReadyToDisplay", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3971p0
    /* JADX INFO: renamed from: a */
    public void mo18595a(String str) {
        InterfaceC3949o0 interfaceC3949o0 = this.f15303p;
        if (interfaceC3949o0 != null) {
            interfaceC3949o0.mo17225a(str);
        }
        this.f15294g.m20138g();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3971p0
    /* JADX INFO: renamed from: a */
    public void mo18596a(String str, int i) {
        InterfaceC3949o0 interfaceC3949o0 = this.f15303p;
        if (interfaceC3949o0 != null) {
            interfaceC3949o0.mo17226a(str, i);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4178y9
    /* JADX INFO: renamed from: a */
    public void mo18597a(String str, CBError.Click error) {
        Unit unit;
        Intrinsics.checkNotNullParameter(error, "error");
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.mo19855a(str, error);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("Missing impression on impression click failure callback ", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3971p0
    /* JADX INFO: renamed from: a */
    public void mo18598a(String impressionId, String str, CBError.Click error) {
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(error, "error");
        m18587a(InterfaceC3807hi.b.FAILURE, error.name());
        InterfaceC3949o0 interfaceC3949o0 = this.f15303p;
        if (interfaceC3949o0 != null) {
            interfaceC3949o0.mo17231a(impressionId, str, error);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: a */
    public void mo18371a(List verificationScriptResourceList, Integer num) {
        Intrinsics.checkNotNullParameter(verificationScriptResourceList, "verificationScriptResourceList");
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19856a(verificationScriptResourceList, num);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4178y9
    /* JADX INFO: renamed from: a */
    public void mo18599a(boolean z) {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 == null) {
            return;
        }
        c4149x2.mo19867e(z);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: a */
    public void mo18372a(boolean z, String forceOrientation) {
        Intrinsics.checkNotNullParameter(forceOrientation, "forceOrientation");
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19857a(z, forceOrientation);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: b */
    public void mo18373b() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19846N();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: b */
    public void mo18374b(float f) {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19849a(f);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: b */
    public void mo18375b(C3884l3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19866d(cbUrl);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3971p0
    /* JADX INFO: renamed from: b */
    public void mo18600b(C3950o1 appRequest) {
        Unit unit;
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        m18604c(true);
        String strM18575c = m18575c(appRequest);
        if (strM18575c != null) {
            this.f15305r.put(strM18575c, appRequest);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19411b("Unable to store app request because impression ID is missing. Impression tracking will not work.", (Throwable) null, 2, (Object) null);
        }
        m18609f(appRequest.m18865d());
        if (m18583H()) {
            m18611g(strM18575c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18601b(C3950o1 c3950o1, CBError.Impression impression) {
        m18577d(c3950o1, impression);
        if (impression != CBError.Impression.IMPRESSION_ALREADY_VISIBLE) {
            m18578e(c3950o1);
        }
        this.f15294g.m20138g();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3971p0
    /* JADX INFO: renamed from: b */
    public void mo18602b(String impressionId) {
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        m18587a(InterfaceC3807hi.b.SUCCESS, "");
        InterfaceC3949o0 interfaceC3949o0 = this.f15303p;
        if (interfaceC3949o0 != null) {
            interfaceC3949o0.mo17232b(impressionId);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4178y9
    /* JADX INFO: renamed from: b */
    public void mo18603b(boolean z) {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.mo17798f(z);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3891la
    /* JADX INFO: renamed from: c */
    public void mo18497c() {
        C4048sb.m19408a("DISMISS_MISSING event was successfully removed upon dismiss callback", (Throwable) null, 2, (Object) null);
        clearFromStorage((AbstractC3738ei) new C3796h7(InterfaceC3807hi.i.DISMISS_MISSING, "", "", "", null, 16, null));
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.mo17797c();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: c */
    public void mo18376c(C3884l3 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.mo19860b(url);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: c */
    public void mo18377c(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        C4048sb.m19411b("WebView warning occurred closing the webview " + msg, (Throwable) null, 2, (Object) null);
    }

    /* JADX INFO: renamed from: c */
    public void m18604c(boolean z) {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.mo19042b(z);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f15301n.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15301n.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15301n.mo43985clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: d */
    public CBError.Impression mo18378d(String str) {
        return InterfaceC3868ka.a.m18394a(this, str);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4178y9
    /* JADX INFO: renamed from: d */
    public void mo18605d() {
        Unit unit;
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19837E();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("Missing impression on impression click success callback ", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: d */
    public void mo18379d(C3884l3 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.mo19864c(url);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18606d(C3950o1 c3950o1) {
        C3993q0 c3993q0 = this.f15293f;
        URL endPointUrl = this.f15302o.getEndPointUrl(this.f15288a.m16773d());
        C3651b0 c3651b0M18857a = c3950o1.m18857a();
        c3993q0.m19087a(endPointUrl, new C4141wg(c3651b0M18857a != null ? c3651b0M18857a.m16859a() : null, c3950o1.m18865d(), m18582G(), this.f15288a.m16771b(), this.f15299l));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3927n0
    /* JADX INFO: renamed from: e */
    public void mo18607e() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19847O();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: e */
    public void mo18380e(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19854a(event);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: f */
    public void mo18381f() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19836D();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m18608f(C3950o1 c3950o1) {
        if (this.f15304q != null && c3950o1.m18862b() == null) {
            C4048sb.m19411b("Fullscreen impression is currently loading.", (Throwable) null, 2, (Object) null);
            return;
        }
        if (!this.f15289b.m17757e()) {
            m18576c(c3950o1, CBError.Impression.INTERNET_UNAVAILABLE_AT_SHOW);
            return;
        }
        InterfaceC3949o0 interfaceC3949o0 = this.f15303p;
        if (interfaceC3949o0 != null) {
            interfaceC3949o0.mo17237d(m18575c(c3950o1));
        }
        C4134w9 c4134w9 = this.f15292e;
        C3674c0 c3674c0M18862b = c3950o1.m18862b();
        C3845ja c3845jaM19772a = c4134w9.m19772a(c3950o1, this, c3674c0M18862b != null ? c3674c0M18862b.m16997b() : null, this, this, this.f15295h, this, this.f15306s, this.f15297j, this.f15298k);
        this.f15304q = c3845jaM19772a.m18202b();
        m18590a(c3950o1, c3845jaM19772a.m18202b(), c3845jaM19772a.m18201a());
    }

    /* JADX INFO: renamed from: f */
    public final void m18609f(String str) {
        if (Intrinsics.areEqual(this.f15288a, AbstractC3628a0.a.f13428g)) {
            return;
        }
        persist((AbstractC3738ei) new C4091ua(InterfaceC3807hi.i.DISMISS_MISSING, "dismiss_missing due to ad not finished", this.f15288a.m16771b(), str, this.f15299l, null, 32, null));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3891la
    /* JADX INFO: renamed from: g */
    public void mo18498g() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19868m();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m18610g(final C3950o1 c3950o1) {
        String strM16856C;
        String strM16855B;
        C3651b0 c3651b0M18857a = c3950o1.m18857a();
        if (c3651b0M18857a == null || !c3651b0M18857a.m16857D()) {
            m18608f(c3950o1);
            return;
        }
        InterfaceC3855jk interfaceC3855jk = this.f15291d;
        C3651b0 c3651b0M18857a2 = c3950o1.m18857a();
        String str = "";
        if (c3651b0M18857a2 == null || (strM16856C = c3651b0M18857a2.m16856C()) == null) {
            strM16856C = "";
        }
        C3651b0 c3651b0M18857a3 = c3950o1.m18857a();
        if (c3651b0M18857a3 != null && (strM16855B = c3651b0M18857a3.m16855B()) != null) {
            str = strM16855B;
        }
        interfaceC3855jk.mo18296a(strM16856C, str, true, new InterfaceC4015r0() { // from class: com.chartboost.sdk.impl.m0$$ExternalSyntheticLambda0
            @Override // com.chartboost.sdk.impl.InterfaceC4015r0
            /* JADX INFO: renamed from: a */
            public final void mo18619a(String str2) {
                C3904m0.m18573a(this.f$0, c3950o1, str2);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m18611g(String str) {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.mo19039a(true);
        }
        InterfaceC3949o0 interfaceC3949o0 = this.f15303p;
        if (interfaceC3949o0 != null) {
            interfaceC3949o0.mo17236c(str);
        }
        this.f15294g.m20140i();
        C3950o1 c3950o1 = (C3950o1) TypeIntrinsics.asMutableMap(this.f15305r).remove(str);
        if (c3950o1 != null) {
            InterfaceC3949o0 interfaceC3949o1 = this.f15303p;
            if (interfaceC3949o1 != null) {
                interfaceC3949o1.mo17238e(str);
            }
            m18606d(c3950o1);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: h */
    public String mo18382h() {
        String strM19876u;
        C4149x2 c4149x2 = this.f15304q;
        return (c4149x2 == null || (strM19876u = c4149x2.m19876u()) == null) ? "" : strM19876u;
    }

    /* JADX INFO: renamed from: h */
    public final void m18612h(C3950o1 c3950o1) {
        if (c3950o1.m18866e()) {
            return;
        }
        c3950o1.m18863b(true);
        track((AbstractC3738ei) new C4091ua(InterfaceC3807hi.i.START, "", this.f15288a.m16771b(), c3950o1.m18865d(), null, null, 48, null));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: i */
    public void mo18383i() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19833A();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: j */
    public String mo18384j() {
        String strM19871p;
        C4149x2 c4149x2 = this.f15304q;
        return (c4149x2 == null || (strM19871p = c4149x2.m19871p()) == null) ? "" : strM19871p;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: k */
    public void mo18385k() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19840H();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: l */
    public void mo18386l() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19845M();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3971p0
    /* JADX INFO: renamed from: m */
    public void mo18613m() {
        this.f15296i.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3891la
    /* JADX INFO: renamed from: n */
    public void mo18499n() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19848P();
        }
        this.f15304q = null;
        this.f15303p = null;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3971p0
    /* JADX INFO: renamed from: o */
    public void mo18614o() {
        Unit unit;
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19861b(EnumC3937na.LOADED);
            if (c4149x2.m19844L()) {
                c4149x2.mo19034a(c4149x2.mo19050i());
            } else {
                this.f15296i.mo19594a(this);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19411b("Cannot display missing impression onImpressionReadyToBeDisplayed", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3927n0
    /* JADX INFO: renamed from: p */
    public void mo18615p() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.onStart();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15301n.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15301n.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: q */
    public void mo18387q() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19838F();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3927n0
    /* JADX INFO: renamed from: r */
    public void mo18616r() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.onResume();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f15301n.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f15301n.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: s */
    public String mo18388s() {
        String strM19874s;
        C4149x2 c4149x2 = this.f15304q;
        return (c4149x2 == null || (strM19874s = c4149x2.m19874s()) == null) ? "" : strM19874s;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f15301n.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f15301n.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: t */
    public void mo18389t() {
        this.f15296i.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15301n.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15301n.mo43989track(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: u */
    public void mo18390u() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19839G();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: v */
    public void mo18391v() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19841I();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: w */
    public String mo18392w() {
        String strM19875t;
        C4149x2 c4149x2 = this.f15304q;
        return (c4149x2 == null || (strM19875t = c4149x2.m19875t()) == null) ? "" : strM19875t;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3927n0
    /* JADX INFO: renamed from: x */
    public void mo18617x() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.mo19052k();
        }
        this.f15297j.m18228a((InterfaceC4199z8) null);
        this.f15297j.m18226a();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3927n0
    /* JADX INFO: renamed from: y */
    public void mo18618y() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.mo19041b();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3868ka
    /* JADX INFO: renamed from: z */
    public void mo18393z() {
        C4149x2 c4149x2 = this.f15304q;
        if (c4149x2 != null) {
            c4149x2.m19869n();
        }
    }
}
