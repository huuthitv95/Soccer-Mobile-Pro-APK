package com.ironsource;

import android.content.Context;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.oe */
/* JADX INFO: loaded from: classes6.dex */
public final class C12410oe {

    /* JADX INFO: renamed from: l */
    public static final b f31639l = new b(null);

    /* JADX INFO: renamed from: m */
    private static final Lazy<C12410oe> f31640m = LazyKt.lazy(a.f31652a);

    /* JADX INFO: renamed from: a */
    private final InterfaceC12535te f31641a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC11422Ee f31642b;

    /* JADX INFO: renamed from: c */
    private final C12553ue f31643c;

    /* JADX INFO: renamed from: d */
    private C11566Me f31644d;

    /* JADX INFO: renamed from: e */
    private final Lazy f31645e;

    /* JADX INFO: renamed from: f */
    private final String f31646f;

    /* JADX INFO: renamed from: g */
    private final List<InterfaceC12216ge> f31647g;

    /* JADX INFO: renamed from: h */
    private C12100ae f31648h;

    /* JADX INFO: renamed from: i */
    private C12136ce f31649i;

    /* JADX INFO: renamed from: j */
    private boolean f31650j;

    /* JADX INFO: renamed from: k */
    private long f31651k;

    /* JADX INFO: renamed from: com.ironsource.oe$a */
    static final class a extends Lambda implements Function0<C12410oe> {

        /* JADX INFO: renamed from: a */
        public static final a f31652a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C12410oe invoke() {
            return new C12410oe(null, null, null, 7, null);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.oe$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C12410oe m33000a() {
            return (C12410oe) C12410oe.f31640m.getValue();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.oe$c */
    static final class c extends Lambda implements Function0<InterfaceC12263j7> {

        /* JADX INFO: renamed from: a */
        public static final c f31653a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC12263j7 invoke() {
            return C11455Gb.f24351s.m25905d().mo25847k();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.oe$d */
    public static final class d implements InterfaceC12216ge {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f31655b;

        d(Context context) {
            this.f31655b = context;
        }

        @Override // com.ironsource.InterfaceC12216ge
        /* JADX INFO: renamed from: a */
        public void mo26373a(final C12100ae sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            InterfaceC12535te interfaceC12535te = C12410oe.this.f31641a;
            final C12410oe c12410oe = C12410oe.this;
            final Context context = this.f31655b;
            interfaceC12535te.mo33666c(new Runnable() { // from class: com.ironsource.oe$d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C12410oe.d.m33002a(c12410oe, context, sdkConfig);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static final void m33002a(C12410oe this$0, Context applicationContext, C12100ae sdkConfig) throws JSONException {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            this$0.m32974a(applicationContext, sdkConfig);
        }

        @Override // com.ironsource.InterfaceC12216ge
        /* JADX INFO: renamed from: a */
        public void mo26374a(final C12136ce error, final C12113b9 c12113b9) {
            Intrinsics.checkNotNullParameter(error, "error");
            InterfaceC12535te interfaceC12535te = C12410oe.this.f31641a;
            final C12410oe c12410oe = C12410oe.this;
            interfaceC12535te.mo33666c(new Runnable() { // from class: com.ironsource.oe$d$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C12410oe.d.m33003a(c12410oe, error, c12113b9);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static final void m33003a(C12410oe this$0, C12136ce error, C12113b9 c12113b9) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(error, "$error");
            this$0.m32976a(error, c12113b9);
        }
    }

    public C12410oe() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m32992b(C12410oe this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m32986a(true);
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC12263j7 m32993c() {
        return (InterfaceC12263j7) this.f31645e.getValue();
    }

    /* JADX INFO: renamed from: d */
    private final void m32994d() {
        if (C11455Gb.f24351s.m25905d().mo25846h().mo32194u()) {
            C11686Td.m27533i().mo25281a(new C12580w5(EnumC12598x5.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m32998e() {
        this.f31641a.mo33667d(new Runnable() { // from class: com.ironsource.oe$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C12410oe.m32992b(this.f$0);
            }
        });
    }

    public C12410oe(InterfaceC12535te tools, InterfaceC11422Ee serverInit, C12553ue sdkServicesInitializer) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(serverInit, "serverInit");
        Intrinsics.checkNotNullParameter(sdkServicesInitializer, "sdkServicesInitializer");
        this.f31641a = tools;
        this.f31642b = serverInit;
        this.f31643c = sdkServicesInitializer;
        this.f31645e = LazyKt.lazy(c.f31653a);
        this.f31646f = "oe";
        this.f31647g = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    private final void m32989b(C12100ae c12100ae) {
        this.f31648h = c12100ae;
        m32986a(false);
    }

    /* JADX INFO: renamed from: b */
    private final EnumC12446qe m32987b() {
        if (this.f31648h != null) {
            return EnumC12446qe.INITIATED;
        }
        if (this.f31649i != null) {
            return EnumC12446qe.INIT_FAILED;
        }
        if (this.f31650j) {
            return EnumC12446qe.INIT_IN_PROGRESS;
        }
        return EnumC12446qe.NOT_INIT;
    }

    /* JADX INFO: renamed from: a */
    private final void m32973a(Context context, C11648R9 c11648r9, C11494Ie c11494Ie) {
        c11648r9.m27362i(c11494Ie.m26136g().m27830h());
        c11648r9.m27356c(c11494Ie.m26136g().m27826d());
        C11373C1 c11373c1M26602b = c11494Ie.m26133c().m26602b();
        Intrinsics.checkNotNull(c11373c1M26602b);
        c11648r9.m27347a(c11373c1M26602b.m25543a());
        c11648r9.m27357d(c11373c1M26602b.m25545c().m25241b());
        c11648r9.m27353b(c11373c1M26602b.m25553k().m27844b());
        c11648r9.m27346a(Boolean.valueOf(IronSourceUtils.m32761c(context)));
        C11373C1 c11373c1M26602b2 = c11494Ie.m26133c().m26602b();
        Intrinsics.checkNotNull(c11373c1M26602b2);
        c11648r9.m27350b(c11373c1M26602b2.m25548f().m26450b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m32990b(InterfaceC12216ge listener, C12100ae sdkConfig) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
        listener.mo26373a(sdkConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m32991b(InterfaceC12216ge listener, C12136ce error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(error, "$error");
        InterfaceC12216ge.CC.m31563a(listener, error, null, 2, null);
    }

    /* JADX INFO: renamed from: b */
    private final void m32988b(Context context, C12100ae c12100ae) {
        boolean zM26167l;
        String strM26159d;
        boolean z;
        String strM26159d2;
        boolean z2;
        String strM26159d3;
        Context context2;
        C11499J1 c11499j1M25544b;
        C11545Lb c11545LbM26605e;
        C11499J1 c11499j1M26420g;
        C11692U2 c11692u2M26603c;
        C11499J1 c11499j1M27563g;
        C11363B9 c11363b9M26604d;
        C11499J1 c11499j1M25472i;
        C11652Rd c11652RdM26606f;
        C11499J1 c11499j1M27392m;
        C11499J1 c11499j1M25544b2;
        C11494Ie c11494IeM31106d = c12100ae.m31106d();
        C11373C1 c11373c1M26602b = c11494IeM31106d.m26133c().m26602b();
        if (c11373c1M26602b == null || (c11499j1M25544b2 = c11373c1M26602b.m25544b()) == null) {
            zM26167l = false;
            strM26159d = null;
        } else {
            zM26167l = c11499j1M25544b2.m26167l();
            strM26159d = c11499j1M25544b2.m26159d();
        }
        C11573N3 c11573n3M26133c = c11494IeM31106d.m26133c();
        if (c11573n3M26133c == null || (c11652RdM26606f = c11573n3M26133c.m26606f()) == null || (c11499j1M27392m = c11652RdM26606f.m27392m()) == null) {
            z = false;
            strM26159d2 = null;
        } else {
            boolean zM26167l2 = c11499j1M27392m.m26167l();
            strM26159d2 = c11499j1M27392m.m26159d();
            z = zM26167l2;
        }
        C11573N3 c11573n3M26133c2 = c11494IeM31106d.m26133c();
        if (c11573n3M26133c2 == null || (c11363b9M26604d = c11573n3M26133c2.m26604d()) == null || (c11499j1M25472i = c11363b9M26604d.m25472i()) == null) {
            z2 = false;
            strM26159d3 = null;
        } else {
            boolean zM26167l3 = c11499j1M25472i.m26167l();
            strM26159d3 = c11499j1M25472i.m26159d();
            z2 = zM26167l3;
        }
        C11573N3 c11573n3M26133c3 = c11494IeM31106d.m26133c();
        boolean zM26167l4 = (c11573n3M26133c3 == null || (c11692u2M26603c = c11573n3M26133c3.m26603c()) == null || (c11499j1M27563g = c11692u2M26603c.m27563g()) == null) ? false : c11499j1M27563g.m26167l();
        C11573N3 c11573n3M26133c4 = c11494IeM31106d.m26133c();
        boolean zM26167l5 = (c11573n3M26133c4 == null || (c11545LbM26605e = c11573n3M26133c4.m26605e()) == null || (c11499j1M26420g = c11545LbM26605e.m26420g()) == null) ? false : c11499j1M26420g.m26167l();
        C11455Gb.b bVar = C11455Gb.f24351s;
        bVar.m25905d().mo25850q().mo25286b(strM26159d, context);
        if (zM26167l) {
            C11373C1 c11373c1M26602b2 = c11494IeM31106d.m26133c().m26602b();
            if (c11373c1M26602b2 != null && (c11499j1M25544b = c11373c1M26602b2.m25544b()) != null) {
                m32985a(this, bVar.m25905d().mo25850q(), c11499j1M25544b, context, c11494IeM31106d, false, 16, null);
            }
        } else {
            bVar.m25905d().mo25850q().mo25283a(false);
        }
        C11686Td.m27533i().mo25286b(strM26159d2, context);
        if (z) {
            C11573N3 c11573n3M26133c5 = c11494IeM31106d.m26133c();
            C11652Rd c11652RdM26606f2 = c11573n3M26133c5 != null ? c11573n3M26133c5.m26606f() : null;
            Intrinsics.checkNotNull(c11652RdM26606f2);
            C11499J1 rewardedVideoConfig = c11652RdM26606f2.m27392m();
            C11686Td c11686TdM27533i = C11686Td.m27533i();
            Intrinsics.checkNotNullExpressionValue(c11686TdM27533i, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(rewardedVideoConfig, "rewardedVideoConfig");
            m32985a(this, c11686TdM27533i, rewardedVideoConfig, context, c11494IeM31106d, false, 16, null);
        } else {
            C11686Td.m27533i().mo25283a(false);
        }
        C11399D9.m25613i().mo25286b(strM26159d3, context);
        if (z2) {
            C11573N3 c11573n3M26133c6 = c11494IeM31106d.m26133c();
            C11363B9 c11363b9M26604d2 = c11573n3M26133c6 != null ? c11573n3M26133c6.m26604d() : null;
            Intrinsics.checkNotNull(c11363b9M26604d2);
            C11499J1 interstitialConfig = c11363b9M26604d2.m25472i();
            C11399D9 c11399d9M25613i = C11399D9.m25613i();
            Intrinsics.checkNotNullExpressionValue(c11399d9M25613i, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(interstitialConfig, "interstitialConfig");
            m32985a(this, c11399d9M25613i, interstitialConfig, context, c11494IeM31106d, false, 16, null);
            context2 = context;
        } else if (zM26167l4) {
            C11573N3 c11573n3M26133c7 = c11494IeM31106d.m26133c();
            C11692U2 c11692u2M26603c2 = c11573n3M26133c7 != null ? c11573n3M26133c7.m26603c() : null;
            Intrinsics.checkNotNull(c11692u2M26603c2);
            C11499J1 bannerConfig = c11692u2M26603c2.m27563g();
            C11399D9 c11399d9M25613i2 = C11399D9.m25613i();
            Intrinsics.checkNotNullExpressionValue(c11399d9M25613i2, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(bannerConfig, "bannerConfig");
            context2 = context;
            m32985a(this, c11399d9M25613i2, bannerConfig, context2, c11494IeM31106d, false, 16, null);
        } else if (zM26167l5) {
            C11573N3 c11573n3M26133c8 = c11494IeM31106d.m26133c();
            C11545Lb c11545LbM26605e2 = c11573n3M26133c8 != null ? c11573n3M26133c8.m26605e() : null;
            Intrinsics.checkNotNull(c11545LbM26605e2);
            C11499J1 c11499j1M26420g2 = c11545LbM26605e2.m26420g();
            C11399D9 c11399d9M25613i3 = C11399D9.m25613i();
            Intrinsics.checkNotNullExpressionValue(c11399d9M25613i3, "getInstance()");
            context2 = context;
            m32985a(this, c11399d9M25613i3, c11499j1M26420g2, context2, c11494IeM31106d, false, 16, null);
        } else {
            context2 = context;
            C11399D9.m25613i().mo25283a(false);
        }
        C11573N3 c11573n3M26133c9 = c11494IeM31106d.m26133c();
        C11373C1 c11373c1M26602b3 = c11573n3M26133c9 != null ? c11573n3M26133c9.m26602b() : null;
        Intrinsics.checkNotNull(c11373c1M26602b3);
        C11805ad c11805adM25551i = c11373c1M26602b3.m25551i();
        boolean zM28184a = c11805adM25551i.m28184a();
        String strM28185b = c11805adM25551i.m28185b();
        boolean zM28188c = c11805adM25551i.m28188c();
        int iM28189d = c11805adM25551i.m28189d();
        int[] iArrM28190e = c11805adM25551i.m28190e();
        int[] iArrM28191f = c11805adM25551i.m28191f();
        C11787Zc c11787Zc = C11787Zc.f26696P;
        c11787Zc.mo25283a(zM28184a);
        c11787Zc.mo25286b(strM28185b, context2);
        if (zM28184a) {
            c11787Zc.mo25288b(iArrM28190e, context2);
            c11787Zc.mo25290c(iArrM28191f, context2);
            c11787Zc.mo25287b(zM28188c);
            c11787Zc.mo25289c(iM28189d);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m32995a(final Context context, final C12252ie initRequest, final InterfaceC12216ge listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final Context applicationContext = context.getApplicationContext();
        this.f31641a.mo33667d(new Runnable() { // from class: com.ironsource.oe$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C12410oe.m32984a(this.f$0, listener, context, initRequest, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m32984a(C12410oe this$0, InterfaceC12216ge listener, Context context, C12252ie initRequest, Context context2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        C12100ae c12100ae = this$0.f31648h;
        if (c12100ae != null) {
            this$0.m32977a(listener, c12100ae);
            return;
        }
        this$0.f31647g.add(listener);
        if (this$0.f31650j) {
            return;
        }
        this$0.f31649i = null;
        this$0.m32986a(true);
        this$0.f31651k = new Date().getTime();
        this$0.f31642b.mo25632a(context, initRequest, this$0.f31641a, this$0.new d(context2));
    }

    public /* synthetic */ C12410oe(InterfaceC12535te interfaceC12535te, InterfaceC11422Ee interfaceC11422Ee, C12553ue c12553ue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C12517se() : interfaceC12535te, (i & 2) != 0 ? new C11404De(null, 1, null) : interfaceC11422Ee, (i & 4) != 0 ? new C12553ue(null, null, null, null, null, 31, null) : c12553ue);
    }

    /* JADX INFO: renamed from: a */
    public final void m32997a(final C12270je serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.f31641a.mo33667d(new Runnable() { // from class: com.ironsource.oe$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12410oe.m32979a(serverResponse, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m32979a(C12270je serverResponse, C12410oe this$0) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C12100ae c12100ae = new C12100ae(serverResponse, null, null, 6, null);
        this$0.m32989b(c12100ae);
        this$0.m32975a(c12100ae);
    }

    /* JADX INFO: renamed from: a */
    public final void m32996a(final C12136ce error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f31641a.mo33667d(new Runnable() { // from class: com.ironsource.oe$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C12410oe.m32982a(this.f$0, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m32982a(C12410oe this$0, C12136ce error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.m32976a(error, (C12113b9) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m32976a(C12136ce c12136ce, C12113b9 c12113b9) {
        this.f31649i = c12136ce;
        m32986a(false);
        Iterator<InterfaceC12216ge> it = this.f31647g.iterator();
        while (it.hasNext()) {
            m32978a(it.next(), c12136ce);
        }
        this.f31647g.clear();
        if (c12113b9 != null) {
            c12113b9.m31186b();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + c12136ce, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m32974a(Context context, C12100ae c12100ae) throws JSONException {
        C11440Fe c11440FeM31111i;
        m32989b(c12100ae);
        C11553M1 c11553m1M31103a = c12100ae.m31103a();
        C11694U4 c11694u4 = C11694U4.f25873a;
        c11694u4.m27586c(c11553m1M31103a.m26455g());
        C11455Gb.b bVar = C11455Gb.f24351s;
        bVar.m25903a().mo25779o().mo32174a(c11553m1M31103a.m26451c());
        if (bVar.m25905d().mo25846h().mo32178e() && (c11440FeM31111i = c12100ae.m31111i()) != null) {
            this.f31643c.m33914a(context, c11440FeM31111i);
        }
        C12113b9 c12113b9M31108f = c12100ae.m31108f();
        if (c12113b9M31108f != null) {
            c12113b9M31108f.m31186b();
        }
        c11694u4.m27582a(c11553m1M31103a.m26454f());
        c11694u4.m27581a(c11553m1M31103a.m26458j());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(c11553m1M31103a.m26456h());
        m32993c().mo26713a(c11553m1M31103a);
        m32973a(context, this.f31641a.mo33672g(), c12100ae.m31106d());
        this.f31641a.mo33652a(new Date().getTime() - this.f31651k, c12100ae.m31109g());
        C11566Me c11566Me = new C11566Me();
        this.f31644d = c11566Me;
        c11566Me.m26558a(m32993c());
        IronSourceUtils.m32772e(context, c12100ae.m31106d().toString());
        bVar.m25905d().mo25850q().m32041c(true);
        C11399D9.m25613i().m32041c(true);
        C11686Td.m27533i().m32041c(true);
        C11787Zc c11787Zc = C11787Zc.f26696P;
        c11787Zc.m32041c(true);
        m32988b(context, c12100ae);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(c12100ae.m31107e().m25579b());
        C11427F1 c11427f1M31104b = c12100ae.m31104b();
        if (c11427f1M31104b.m25761f()) {
            this.f31641a.mo33653a(c11427f1M31104b);
        }
        m32975a(c12100ae);
        c11787Zc.m28079i();
        m32994d();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("parameters for init url: " + C11530Ke.m26296a());
        ironLog.verbose("parameters for init POST data: " + C11530Ke.m26301b());
    }

    /* JADX INFO: renamed from: a */
    private final void m32975a(C12100ae c12100ae) {
        Iterator<InterfaceC12216ge> it = this.f31647g.iterator();
        while (it.hasNext()) {
            m32977a(it.next(), c12100ae);
        }
        this.f31647g.clear();
    }

    /* JADX INFO: renamed from: a */
    private final void m32986a(boolean z) {
        this.f31650j = z;
        this.f31641a.mo33657a(m32987b());
    }

    /* JADX INFO: renamed from: a */
    private final void m32977a(final InterfaceC12216ge interfaceC12216ge, final C12100ae c12100ae) {
        this.f31641a.mo33658a(new Runnable() { // from class: com.ironsource.oe$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C12410oe.m32990b(interfaceC12216ge, c12100ae);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private final void m32978a(final InterfaceC12216ge interfaceC12216ge, final C12136ce c12136ce) {
        this.f31641a.mo33658a(new Runnable() { // from class: com.ironsource.oe$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C12410oe.m32991b(interfaceC12216ge, c12136ce);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m32985a(C12410oe c12410oe, AbstractC12295l3 abstractC12295l3, C11499J1 c11499j1, Context context, C11494Ie c11494Ie, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        c12410oe.m32980a(abstractC12295l3, c11499j1, context, c11494Ie, z);
    }

    /* JADX INFO: renamed from: a */
    private final void m32980a(AbstractC12295l3 abstractC12295l3, C11499J1 c11499j1, Context context, C11494Ie c11494Ie, boolean z) {
        abstractC12295l3.mo25283a(z);
        abstractC12295l3.mo25282a(c11499j1.m26158c(), context);
        abstractC12295l3.mo25286b(c11499j1.m26159d(), context);
        abstractC12295l3.mo25280a(c11499j1.m26161f());
        abstractC12295l3.mo25291d(c11499j1.m26160e());
        abstractC12295l3.mo25285b(c11499j1.m26156a());
        abstractC12295l3.mo25288b(c11499j1.m26164i(), context);
        abstractC12295l3.mo25290c(c11499j1.m26163h(), context);
        abstractC12295l3.mo25284a(c11499j1.m26165j(), context);
        abstractC12295l3.mo25292d(c11499j1.m26162g(), context);
        C11373C1 c11373c1M26602b = c11494Ie.m26133c().m26602b();
        Intrinsics.checkNotNull(c11373c1M26602b);
        abstractC12295l3.m32031a(c11373c1M26602b.m25552j());
        abstractC12295l3.mo25287b(c11499j1.m26166k());
        abstractC12295l3.mo25289c(c11499j1.m26157b());
    }
}
