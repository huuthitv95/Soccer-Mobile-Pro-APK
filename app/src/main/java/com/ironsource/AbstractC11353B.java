package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.B */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11353B implements AdapterAdListener, NetworkInitializationListener {

    /* JADX INFO: renamed from: a */
    private final C11707V0 f23857a;

    /* JADX INFO: renamed from: b */
    private final C11371C f23858b;

    /* JADX INFO: renamed from: c */
    private final C11479I f23859c;

    /* JADX INFO: renamed from: d */
    private WeakReference<InterfaceC11425F> f23860d;

    /* JADX INFO: renamed from: e */
    private InterfaceC11443G f23861e;

    /* JADX INFO: renamed from: f */
    private final BaseAdAdapter<?, ?> f23862f;

    /* JADX INFO: renamed from: g */
    private C12189f5 f23863g;

    /* JADX INFO: renamed from: h */
    private AbstractRunnableC11754Xd f23864h;

    /* JADX INFO: renamed from: i */
    private final Map<String, Object> f23865i;

    /* JADX INFO: renamed from: j */
    private boolean f23866j;

    /* JADX INFO: renamed from: k */
    private boolean f23867k;

    /* JADX INFO: renamed from: l */
    private boolean f23868l;

    /* JADX INFO: renamed from: m */
    private boolean f23869m;

    /* JADX INFO: renamed from: n */
    private final AdData f23870n;

    /* JADX INFO: renamed from: o */
    private final C12434q2 f23871o;

    /* JADX INFO: renamed from: p */
    private final C12434q2 f23872p;

    /* JADX INFO: renamed from: q */
    private final boolean f23873q;

    /* JADX INFO: renamed from: r */
    private final String f23874r;

    /* JADX INFO: renamed from: s */
    private final int f23875s;

    /* JADX INFO: renamed from: t */
    private final String f23876t;

    /* JADX INFO: renamed from: u */
    private final IronSource.EnumC12328a f23877u;

    /* JADX INFO: renamed from: v */
    private final int f23878v;

    /* JADX INFO: renamed from: w */
    private final C11497J f23879w;

    /* JADX INFO: renamed from: com.ironsource.B$a */
    public static final class a extends AbstractRunnableC11754Xd {
        a() {
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            long jM31432a = C12189f5.m31432a(AbstractC11353B.this.f23863g);
            IronLog ironLog = IronLog.INTERNAL;
            AbstractC11353B abstractC11353B = AbstractC11353B.this;
            ironLog.verbose(abstractC11353B.m25335a("Load duration = " + jM31432a + ", isBidder = " + abstractC11353B.m25360u()));
            AbstractC11353B.this.f23869m = true;
            AbstractC11353B.this.m25346f().m33047e().m34217e().m33950a(jM31432a, 1025, false);
            AbstractC11353B.this.m25346f().m33047e().m34217e().m33949a(jM31432a, 1025, "time out", false);
            AbstractC11353B abstractC11353B2 = AbstractC11353B.this;
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            Intrinsics.checkNotNullExpressionValue(ironSourceErrorBuildLoadFailedError, "buildLoadFailedError(errorMessage)");
            abstractC11353B2.m25327a(ironSourceErrorBuildLoadFailedError);
        }
    }

    public AbstractC11353B(C11707V0 adTools, C11371C instanceData, C11479I adInstancePayload, InterfaceC11425F listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f23857a = adTools;
        this.f23858b = instanceData;
        this.f23859c = adInstancePayload;
        this.f23860d = new WeakReference<>(listener);
        this.f23865i = new LinkedHashMap();
        this.f23870n = instanceData.m25525g();
        this.f23871o = instanceData.m25532n();
        this.f23872p = instanceData.m25534p();
        this.f23873q = instanceData.m25528j().m31344j();
        this.f23874r = instanceData.m25536r();
        this.f23875s = instanceData.m25537s();
        this.f23876t = instanceData.m25541w();
        this.f23877u = instanceData.m25526h();
        this.f23878v = instanceData.m25540v();
        this.f23879w = instanceData.m25538t();
        BaseAdAdapter<?, ?> baseAdAdapterM25317a = m25317a(instanceData);
        this.f23862f = baseAdAdapterM25317a;
        adTools.m33047e().m34212a(new C11389D(adTools, instanceData, baseAdAdapterM25317a));
        adTools.m33047e().m34212a(new C11725W1(instanceData.m25529k()));
    }

    /* JADX INFO: renamed from: B */
    private final void m25308B() {
        IronLog.INTERNAL.verbose(m25318a(this, (String) null, 1, (Object) null));
        try {
            m25313G();
            mo25334A();
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage();
            IronLog.INTERNAL.error(m25335a(str));
            this.f23857a.m33047e().m34220h().m27986g(str);
            m25325a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: renamed from: C */
    private final void m25309C() {
        IronLog.INTERNAL.verbose(m25318a(this, (String) null, 1, (Object) null));
        this.f23857a.m33047e().m34211a().m26689a(m25351k());
        InterfaceC11425F interfaceC11425F = this.f23860d.get();
        if (interfaceC11425F != null) {
            interfaceC11425F.mo25741a(this);
        }
    }

    /* JADX INFO: renamed from: D */
    private final void m25310D() {
        IronLog ironLog = IronLog.INTERNAL;
        InterfaceC11443G interfaceC11443G = null;
        ironLog.verbose(m25318a(this, (String) null, 1, (Object) null));
        m25314H();
        if (this.f23869m) {
            mo25343c();
            this.f23857a.m33047e().m34220h().m27985f("instance load success after it was already failed");
            return;
        }
        if (this.f23867k) {
            this.f23857a.m33047e().m34220h().m27985f("instance load success after it was already loaded");
            return;
        }
        this.f23867k = true;
        long jM31432a = C12189f5.m31432a(this.f23863g);
        ironLog.verbose(m25335a("Load duration = " + jM31432a));
        this.f23857a.m33047e().m34217e().m33951a(jM31432a, false);
        m25339a(C12450r0.a.LoadedSuccessfully);
        InterfaceC11443G interfaceC11443G2 = this.f23861e;
        if (interfaceC11443G2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadListener");
        } else {
            interfaceC11443G = interfaceC11443G2;
        }
        interfaceC11443G.mo25808b(this);
    }

    /* JADX INFO: renamed from: E */
    private final void m25311E() {
        IronLog.INTERNAL.verbose(m25318a(this, (String) null, 1, (Object) null));
        if (this.f23868l) {
            this.f23857a.m33047e().m34220h().m27985f("instance opened after it was already opened");
            return;
        }
        this.f23868l = true;
        this.f23857a.m33047e().m34211a().m26701g(m25351k());
        m25339a(C12450r0.a.ShowedSuccessfully);
        InterfaceC11425F interfaceC11425F = this.f23860d.get();
        if (interfaceC11425F != null) {
            interfaceC11425F.mo25743b(this);
        }
    }

    /* JADX INFO: renamed from: F */
    private final void m25312F() {
        IronLog.INTERNAL.verbose(m25318a(this, (String) null, 1, (Object) null));
        m25314H();
        if (this.f23869m) {
            return;
        }
        m25308B();
    }

    /* JADX INFO: renamed from: G */
    private final void m25313G() {
        m25314H();
        a aVarM25315a = m25315a();
        this.f23864h = aVarM25315a;
        if (aVarM25315a != null) {
            this.f23857a.m33231a((AbstractRunnableC11754Xd) aVarM25315a, TimeUnit.SECONDS.toMillis(m25333o()));
        }
    }

    /* JADX INFO: renamed from: H */
    private final void m25314H() {
        AbstractRunnableC11754Xd abstractRunnableC11754Xd = this.f23864h;
        if (abstractRunnableC11754Xd != null) {
            this.f23857a.m33241b(abstractRunnableC11754Xd);
            this.f23864h = null;
        }
    }

    /* JADX INFO: renamed from: o */
    private final int m25333o() {
        Integer numM33146f = this.f23858b.m25532n().m33146f();
        return (numM33146f == null || numM33146f.intValue() <= 0) ? this.f23858b.m25527i().m34079h() : numM33146f.intValue();
    }

    /* JADX INFO: renamed from: A */
    protected abstract void mo25334A();

    /* JADX INFO: renamed from: a */
    public abstract void mo25338a(InterfaceC11515K interfaceC11515K);

    /* JADX INFO: renamed from: b */
    public void mo25342b() {
        IronLog.INTERNAL.verbose(m25318a(this, (String) null, 1, (Object) null));
        m25314H();
        this.f23857a.m33047e().m34217e().m33945a(this.f23878v);
    }

    /* JADX INFO: renamed from: c */
    public void mo25343c() {
    }

    /* JADX INFO: renamed from: d */
    public final IronSource.EnumC12328a m25344d() {
        return this.f23877u;
    }

    /* JADX INFO: renamed from: e */
    public LevelPlayAdInfo mo25345e() {
        String string = this.f23858b.m25527i().mo26467b().m31569b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strM31570c = this.f23858b.m25527i().mo26467b().m31570c();
        String string2 = this.f23858b.m25526h().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "instanceData.adFormat.toString()");
        return new LevelPlayAdInfo(string, strM31570c, string2, this.f23858b.m25532n(), null, this.f23858b.m25527i().m34082l(), MapsKt.toMap(this.f23865i));
    }

    /* JADX INFO: renamed from: f */
    public final C11707V0 m25346f() {
        return this.f23857a;
    }

    /* JADX INFO: renamed from: g */
    public final BaseAdAdapter<?, ?> m25347g() {
        return this.f23862f;
    }

    /* JADX INFO: renamed from: h */
    public final C12434q2 m25348h() {
        return this.f23871o;
    }

    /* JADX INFO: renamed from: i */
    protected final AdData m25349i() {
        return this.f23870n;
    }

    /* JADX INFO: renamed from: j */
    protected final C12135cd m25350j() {
        return this.f23858b.m25527i().mo26467b().m31573f();
    }

    /* JADX INFO: renamed from: k */
    protected final String m25351k() {
        return this.f23858b.m25527i().m34082l();
    }

    /* JADX INFO: renamed from: l */
    protected final Map<String, Object> m25352l() {
        return this.f23865i;
    }

    /* JADX INFO: renamed from: m */
    public final C12434q2 m25353m() {
        return this.f23872p;
    }

    /* JADX INFO: renamed from: n */
    protected final C11371C m25354n() {
        return this.f23858b;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        m25340a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11353B.m25329b(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdClicked(Map map) {
        onAdClicked();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(final AdapterErrorType adapterErrorType, final int i, final String errorMessage) {
        Intrinsics.checkNotNullParameter(adapterErrorType, "adapterErrorType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        m25340a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11353B.m25320a(this.f$0, adapterErrorType, i, errorMessage);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str, Map map) {
        onAdLoadFailed(adapterErrorType, i, str);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        onAdLoadSuccess(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(final int i, final String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        m25340a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11353B.m25319a(this.f$0, i, errorMessage);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdShowFailed(int i, String str, Map map) {
        onAdShowFailed(i, str);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(final int i, final String str) {
        m25340a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11353B.m25330b(this.f$0, i, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public /* synthetic */ void onInitFailed(int i, String str, Map map) {
        onInitFailed(i, str);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        m25340a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11353B.m25332c(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public /* synthetic */ void onInitSuccess(Map map) {
        onInitSuccess();
    }

    /* JADX INFO: renamed from: p */
    public final String m25355p() {
        return this.f23874r;
    }

    /* JADX INFO: renamed from: q */
    public final String m25356q() {
        return this.f23876t;
    }

    /* JADX INFO: renamed from: r */
    public final int m25357r() {
        return this.f23875s;
    }

    /* JADX INFO: renamed from: s */
    public final C11497J m25358s() {
        return this.f23879w;
    }

    /* JADX INFO: renamed from: t */
    public final int m25359t() {
        return this.f23878v;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m25360u() {
        return this.f23873q;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m25361v() {
        return this.f23869m;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m25362w() {
        return this.f23867k;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m25363x() {
        return this.f23866j;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m25364y() {
        return this.f23868l;
    }

    /* JADX INFO: renamed from: z */
    public boolean m25365z() {
        return this.f23867k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m25332c(AbstractC11353B this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m25312F();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess(final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        m25340a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11353B.m25322a(this.f$0, extraData);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        m25340a(new Runnable() { // from class: com.ironsource.B$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11353B.m25331b(this.f$0, extraData);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private final void m25328b(int i, String str) {
        IronLog.INTERNAL.verbose(m25335a("error = " + i + ", " + str));
        m25314H();
        this.f23869m = true;
        m25326a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C12189f5.m31432a(this.f23863g));
        m25327a(new IronSourceError(i, str));
    }

    /* JADX INFO: renamed from: a */
    protected final void m25339a(C12450r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f23858b.m25519a(performance);
    }

    /* JADX INFO: renamed from: a */
    protected final void m25340a(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f23857a.m33233a(callback);
    }

    /* JADX INFO: renamed from: a */
    public final void m25341a(boolean z) {
        this.f23857a.m33047e().m34211a().m26694a(z);
    }

    /* JADX INFO: renamed from: a */
    private final BaseAdAdapter<?, ?> m25317a(C11371C c11371c) {
        if (c11371c.m25527i().m34076e().m33291q()) {
            return this.f23859c.m26041b();
        }
        return this.f23857a.m27632a(c11371c);
    }

    /* JADX INFO: renamed from: a */
    public final void m25337a(InterfaceC11443G listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m25318a(this, (String) null, 1, (Object) null));
        this.f23861e = listener;
        this.f23866j = true;
        try {
            this.f23857a.m33047e().m34217e().m33953a(false);
            this.f23863g = new C12189f5();
            m25313G();
            BaseAdAdapter<?, ?> baseAdAdapter = this.f23862f;
            Intrinsics.checkNotNull(baseAdAdapter);
            AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f23858b.m25525g(), ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str = "loadAd - network adapter not available " + this.f23876t;
            ironLog.error(m25335a(str));
            m25328b(C11354B0.m25369c(this.f23858b.m25526h()), str);
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            String str2 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m25335a(str2));
            this.f23857a.m33047e().m34220h().m27986g(str2);
            m25328b(C11354B0.m25369c(this.f23858b.m25526h()), str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m25331b(AbstractC11353B this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.f23865i.putAll(extraData);
        this$0.m25311E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m25329b(AbstractC11353B this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m25309C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m25330b(AbstractC11353B this$0, int i, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m25328b(i, str);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m25318a(AbstractC11353B abstractC11353B, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return abstractC11353B.m25335a(str);
    }

    /* JADX INFO: renamed from: a */
    protected final String m25335a(String str) {
        return this.f23857a.m33037a(str, this.f23876t);
    }

    /* JADX INFO: renamed from: a */
    private final a m25315a() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m25327a(IronSourceError ironSourceError) {
        m25339a(C12450r0.a.FailedToLoad);
        InterfaceC11443G interfaceC11443G = this.f23861e;
        if (interfaceC11443G == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadListener");
            interfaceC11443G = null;
        }
        interfaceC11443G.mo25807a(ironSourceError, this);
    }

    /* JADX INFO: renamed from: a */
    private final void m25325a(AdapterErrorType adapterErrorType, int i, String str) {
        long jM31432a = C12189f5.m31432a(this.f23863g);
        IronLog.INTERNAL.verbose(m25335a("Load duration = " + jM31432a + ", error = " + i + ", " + str));
        m25314H();
        if (this.f23869m) {
            mo25343c();
            m25326a(adapterErrorType, i, str, jM31432a);
        } else {
            if (this.f23867k) {
                m25324a(adapterErrorType);
                return;
            }
            this.f23869m = true;
            mo25343c();
            m25326a(adapterErrorType, i, str, jM31432a);
            m25327a(new IronSourceError(i, str));
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m25336a(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        IronLog.INTERNAL.verbose(m25335a("Show error = " + i + ", " + errorMessage));
        this.f23869m = true;
        this.f23857a.m33047e().m34211a().m26690a(m25351k(), i, errorMessage, null);
        m25339a(C12450r0.a.FailedToShow);
        InterfaceC11425F interfaceC11425F = this.f23860d.get();
        if (interfaceC11425F != null) {
            interfaceC11425F.mo25742a(this, new IronSourceError(i, errorMessage));
        }
        mo25343c();
    }

    /* JADX INFO: renamed from: a */
    private final void m25324a(AdapterErrorType adapterErrorType) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
            this.f23857a.m33047e().m34220h().m27973a("");
        } else {
            this.f23857a.m33047e().m34220h().m27985f("instance load failed after it was already loaded");
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m25326a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.f23857a.m33047e().m34217e().m33947a(j, i);
        } else if (str != null && str.length() != 0) {
            this.f23857a.m33047e().m34217e().m33949a(j, i, str, false);
        } else {
            this.f23857a.m33047e().m34217e().m33950a(j, i, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m25322a(AbstractC11353B this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.f23865i.putAll(extraData);
        this$0.m25310D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m25320a(AbstractC11353B this$0, AdapterErrorType adapterErrorType, int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapterErrorType, "$adapterErrorType");
        Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.m25325a(adapterErrorType, i, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m25319a(AbstractC11353B this$0, int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.m25336a(i, errorMessage);
    }
}
