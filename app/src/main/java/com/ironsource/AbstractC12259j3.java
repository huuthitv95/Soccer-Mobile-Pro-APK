package com.ironsource;

import android.text.TextUtils;
import com.ironsource.InterfaceC11639R0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C12333d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j3 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12259j3<Listener extends InterfaceC11639R0> implements NetworkInitializationListener, C12393nf.a, InterfaceC11408E0, AdapterAdListener, InterfaceC11506J8.b {

    /* JADX INFO: renamed from: a */
    protected C12378n0 f30609a;

    /* JADX INFO: renamed from: b */
    protected Listener f30610b;

    /* JADX INFO: renamed from: c */
    protected BaseAdAdapter<?, AdapterAdListener> f30611c;

    /* JADX INFO: renamed from: d */
    protected C11426F0 f30612d;

    /* JADX INFO: renamed from: e */
    protected h f30613e;

    /* JADX INFO: renamed from: g */
    protected C12135cd f30615g;

    /* JADX INFO: renamed from: h */
    protected C12159e1 f30616h;

    /* JADX INFO: renamed from: i */
    protected JSONObject f30617i;

    /* JADX INFO: renamed from: j */
    protected String f30618j;

    /* JADX INFO: renamed from: k */
    protected AdData f30619k;

    /* JADX INFO: renamed from: l */
    protected Long f30620l;

    /* JADX INFO: renamed from: m */
    protected C12189f5 f30621m;

    /* JADX INFO: renamed from: o */
    private final C12434q2 f30623o;

    /* JADX INFO: renamed from: p */
    private final InterfaceC12326md f30624p;

    /* JADX INFO: renamed from: f */
    private AtomicBoolean f30614f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n */
    private C12393nf f30622n = new C12393nf(TimeUnit.SECONDS.toMillis(m31807s()));

    /* JADX INFO: renamed from: q */
    protected final Object f30625q = new Object();

    /* JADX INFO: renamed from: com.ironsource.j3$a */
    class a extends AbstractRunnableC11754Xd {
        a() {
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            AbstractC12259j3.this.m31801L();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$b */
    class b extends AbstractRunnableC11754Xd {
        b() {
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() throws Throwable {
            AbstractC12259j3.this.m31800K();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$c */
    class c extends AbstractRunnableC11754Xd {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f30628b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f30629c;

        c(int i, String str) {
            this.f30628b = i;
            this.f30629c = str;
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            AbstractC12259j3.this.m31802a(this.f30628b, this.f30629c);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$d */
    class d extends AbstractRunnableC11754Xd {
        d() {
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            AbstractC12259j3.this.m31798I();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$e */
    class e extends AbstractRunnableC11754Xd {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AdapterErrorType f30632b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f30633c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f30634d;

        e(AdapterErrorType adapterErrorType, int i, String str) {
            this.f30632b = adapterErrorType;
            this.f30633c = i;
            this.f30634d = str;
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() throws Throwable {
            AbstractC12259j3.this.m31803a(this.f30632b, this.f30633c, this.f30634d);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$f */
    class f extends AbstractRunnableC11754Xd {
        f() {
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            AbstractC12259j3.this.m31799J();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$g */
    class g extends AbstractRunnableC11754Xd {
        g() {
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            AbstractC12259j3.this.m31797H();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j3$h */
    protected enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC12259j3(InterfaceC12326md interfaceC12326md, C12378n0 c12378n0, BaseAdAdapter<?, ?> baseAdAdapter, C12159e1 c12159e1, C12434q2 c12434q2, Listener listener) {
        this.f30609a = c12378n0;
        this.f30610b = listener;
        this.f30612d = new C11426F0(c12378n0.m32790a(), C11426F0.b.PROVIDER, this);
        this.f30616h = c12159e1;
        this.f30617i = c12159e1.m31337c();
        this.f30611c = baseAdAdapter;
        this.f30623o = c12434q2;
        this.f30624p = interfaceC12326md;
        m31816a(h.NONE);
    }

    /* JADX INFO: renamed from: D */
    private boolean m31795D() {
        return this.f30613e == h.INIT_IN_PROGRESS;
    }

    /* JADX INFO: renamed from: F */
    private void m31796F() throws Throwable {
        IronLog.INTERNAL.verbose(m31819d());
        m31816a(h.LOADING);
        m31817a(false);
        try {
            this.f30622n.m32843a((C12393nf.a) this);
            mo26248G();
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage() + " - state = " + this.f30613e;
            IronLog.INTERNAL.error(m31814a(str));
            C11426F0 c11426f0 = this.f30612d;
            if (c11426f0 != null) {
                c11426f0.f24292j.m27986g(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public void m31797H() {
        IronLog.INTERNAL.verbose(m31819d());
        C11426F0 c11426f0 = this.f30612d;
        if (c11426f0 != null) {
            c11426f0.f24291i.m26689a(m31825j());
        }
        this.f30610b.mo27315e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public void m31798I() {
        boolean zMo26249O;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m31819d());
        C12393nf c12393nf = this.f30622n;
        if (c12393nf != null) {
            c12393nf.m32844e();
        }
        synchronized (this.f30625q) {
            h hVar = this.f30613e;
            zMo26249O = false;
            if (hVar == h.LOADING) {
                long jM31432a = C12189f5.m31432a(this.f30621m);
                ironLog.verbose(m31814a("Load duration = " + jM31432a));
                if (this.f30612d != null) {
                    if (mo26255v()) {
                        this.f30612d.f24288f.m33946a(jM31432a);
                    } else {
                        this.f30612d.f24288f.m33951a(jM31432a, false);
                    }
                }
                m31816a(h.LOADED);
                zMo26249O = mo26249O();
            } else if (hVar != h.FAILED) {
                ironLog.error(m31814a(String.format("unexpected load success for %s, state - %s", m31826k(), this.f30613e)));
                String str = String.format("unexpected load success, state - %s", this.f30613e);
                if (this.f30612d != null) {
                    if (mo26255v()) {
                        this.f30612d.f24292j.m27998s(str);
                    } else {
                        this.f30612d.f24292j.m27995p(str);
                    }
                }
            }
        }
        if (zMo26249O) {
            this.f30610b.mo27314d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public void m31799J() {
        IronLog.INTERNAL.verbose(m31819d());
        m31816a(h.SHOWING);
        C11426F0 c11426f0 = this.f30612d;
        if (c11426f0 != null) {
            c11426f0.f24291i.m26701g(m31825j());
        }
        this.f30610b.mo27312a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public void m31800K() throws Throwable {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m31819d());
        if (m31795D()) {
            C12393nf c12393nf = this.f30622n;
            if (c12393nf != null) {
                c12393nf.m32844e();
            }
            m31816a(h.READY_TO_LOAD);
            m31796F();
            return;
        }
        if (this.f30613e == h.FAILED) {
            return;
        }
        ironLog.error(m31814a(String.format("unexpected init success for %s, state - %s", m31826k(), this.f30613e)));
        if (this.f30612d != null) {
            this.f30612d.f24292j.m27993n(String.format("unexpected init success, state - %s", this.f30613e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public void m31801L() {
        long jM31432a = C12189f5.m31432a(this.f30621m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m31814a("Load duration = " + jM31432a + ", state = " + this.f30613e + ", isBidder = " + m31835w()));
        synchronized (this.f30625q) {
            if (!m31838z()) {
                ironLog.error(m31814a(String.format("unexpected timeout for %s, state - %s, error - %s", m31826k(), this.f30613e, 1025)));
                if (this.f30612d != null) {
                    this.f30612d.f24292j.m28000u(String.format("unexpected timeout, state - %s, error - %s", this.f30613e, 1025));
                }
            } else {
                m31816a(h.FAILED);
                C11426F0 c11426f0 = this.f30612d;
                if (c11426f0 != null) {
                    c11426f0.f24288f.m33950a(jM31432a, 1025, false);
                    this.f30612d.f24288f.m33949a(jM31432a, 1025, "time out", false);
                }
                this.f30610b.mo27313a(ErrorBuilder.buildLoadFailedError("time out"), this);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private int m31806o() {
        return 1;
    }

    /* JADX INFO: renamed from: s */
    private int m31807s() {
        C12434q2 c12434q2 = this.f30623o;
        if (c12434q2 == null) {
            return this.f30609a.m32795f();
        }
        Integer numM33146f = c12434q2.m33146f();
        int iM32795f = (numM33146f == null || numM33146f.intValue() <= 0) ? this.f30609a.m32795f() : numM33146f.intValue();
        IronLog.INTERNAL.verbose(m31814a("Load timeout for " + this.f30623o.m33143c() + " - " + iM32795f + " seconds"));
        return iM32795f;
    }

    /* JADX INFO: renamed from: A */
    public AtomicBoolean m31808A() {
        return this.f30614f;
    }

    /* JADX INFO: renamed from: B */
    public boolean m31809B() {
        return m31837y();
    }

    /* JADX INFO: renamed from: C */
    public boolean m31810C() {
        return this.f30613e == h.SHOWING;
    }

    /* JADX INFO: renamed from: E */
    public void m31811E() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m31819d());
        C12434q2 c12434q2M31824i = m31824i();
        String strM33151k = c12434q2M31824i.m33151k();
        Map<String, Object> mapM31478a = C12194fa.m31478a(c12434q2M31824i.m33141a());
        mapM31478a.put("adUnit", this.f30609a.m32790a());
        m31818b(strM33151k);
        try {
            boolean z = false;
            if (mo26255v()) {
                this.f30612d.f24288f.m33944a();
            } else {
                this.f30612d.f24288f.m33953a(false);
            }
            this.f30620l = null;
            this.f30621m = new C12189f5();
            this.f30619k = mo26253a(strM33151k, mapM31478a);
            synchronized (this.f30625q) {
                if (this.f30613e != h.NONE) {
                    z = true;
                } else {
                    m31816a(h.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                String str = "loadAd - incorrect state while loading, state = " + this.f30613e;
                ironLog.error(m31814a(str));
                this.f30612d.f24292j.m27986g(str);
                onInitFailed(C11354B0.m25369c(this.f30609a.m32790a()), str);
                return;
            }
            this.f30622n.m32843a((C12393nf.a) this);
            AdapterBaseInterface networkAdapter = this.f30611c.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f30619k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + m31826k();
            ironLog.error(m31814a(str2));
            onInitFailed(C11354B0.m25369c(this.f30609a.m32790a()), str2);
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m31814a(str3));
            C11426F0 c11426f0 = this.f30612d;
            if (c11426f0 != null) {
                c11426f0.f24292j.m27986g(str3);
            }
            onInitFailed(C11354B0.m25369c(this.f30609a.m32790a()), str3);
        }
    }

    /* JADX INFO: renamed from: G */
    protected void mo26248G() {
        Object obj = this.f30611c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.f30619k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(m31814a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0053 A[Catch: all -> 0x0063, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0008, B:13:0x004f, B:15:0x0053, B:16:0x0058, B:18:0x005c, B:19:0x0061, B:10:0x000c, B:12:0x0048), top: B:24:0x0003, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[Catch: all -> 0x0063, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0008, B:13:0x004f, B:15:0x0053, B:16:0x0058, B:18:0x005c, B:19:0x0061, B:10:0x000c, B:12:0x0048), top: B:24:0x0003, inners: #1 }] */
    /* JADX INFO: renamed from: M */
    public void m31812M() {
        C11426F0 c11426f0;
        C12393nf c12393nf;
        synchronized (this) {
            if (this.f30611c != null) {
                try {
                    this.f30611c = null;
                } catch (Exception e2) {
                    C12317m4.m32153d().m32155a(e2);
                    String str = "Exception while calling adapter.releaseMemory() from " + this.f30616h.m31340f() + " - " + e2.getMessage() + " - state = " + this.f30613e;
                    IronLog.INTERNAL.error(m31814a(str));
                    if (this.f30612d != null) {
                        this.f30612d.f24292j.m27986g(str);
                    }
                }
                c11426f0 = this.f30612d;
                if (c11426f0 != null) {
                    c11426f0.m25753f();
                    this.f30612d = null;
                }
                c12393nf = this.f30622n;
                if (c12393nf != null) {
                    c12393nf.m31400d();
                    this.f30622n = null;
                }
            } else {
                c11426f0 = this.f30612d;
                if (c11426f0 != null) {
                    c11426f0.m25753f();
                    this.f30612d = null;
                }
                c12393nf = this.f30622n;
                if (c12393nf != null) {
                    c12393nf.m31400d();
                    this.f30622n = null;
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: N */
    public void m31813N() {
        IronLog.INTERNAL.verbose(m31819d());
        C11426F0 c11426f0 = this.f30612d;
        if (c11426f0 != null) {
            c11426f0.f24291i.m26687a();
        }
    }

    /* JADX INFO: renamed from: O */
    protected boolean mo26249O() {
        return true;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, Object> mo25594a(EnumC11372C0 enumC11372C0) {
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f30611c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.f30611c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
            IronLog.INTERNAL.error(m31814a("could not get adapter version for event data" + m31826k()));
        }
        map.put("spId", this.f30616h.m31343i());
        map.put(IronSourceConstants.EVENTS_PROVIDER, this.f30616h.m31335a());
        map.put("instanceType", Integer.valueOf(m31827l()));
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(m31806o()));
        if (!TextUtils.isEmpty(this.f30618j)) {
            map.put("dynamicDemandSource", this.f30618j);
        }
        map.put("sessionDepth", m31832r());
        if (this.f30609a.m32794e() != null && this.f30609a.m32794e().length() > 0) {
            map.put("genericParams", this.f30609a.m32794e());
        }
        if (!TextUtils.isEmpty(this.f30609a.m32792c())) {
            map.put("auctionId", this.f30609a.m32792c());
        }
        if (m31805b(enumC11372C0)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f30609a.m32793d()));
            if (!TextUtils.isEmpty(this.f30609a.m32791b())) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f30609a.m32791b());
            }
        }
        if (!TextUtils.isEmpty(this.f30609a.m32796g().getCustomNetwork())) {
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f30609a.m32796g().getCustomNetwork());
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public void m31818b(String str) {
        this.f30618j = C12333d.m32333b().m32342c(str);
    }

    @Override // com.ironsource.InterfaceC11506J8.b
    /* JADX INFO: renamed from: c */
    public String mo26207c() {
        return this.f30616h.m31340f();
    }

    /* JADX INFO: renamed from: d */
    protected String m31819d() {
        return m31814a((String) null);
    }

    /* JADX INFO: renamed from: e */
    public Long m31820e() {
        return this.f30620l;
    }

    /* JADX INFO: renamed from: f */
    public AdInfo m31821f() {
        return new AdInfo(this.f30623o.m33140a(m31825j()), this.f30623o.m33144d());
    }

    /* JADX INFO: renamed from: g */
    public IronSource.EnumC12328a m31822g() {
        return this.f30609a.m32790a();
    }

    /* JADX INFO: renamed from: h */
    public String m31823h() {
        return this.f30609a.m32792c();
    }

    /* JADX INFO: renamed from: i */
    public C12434q2 m31824i() {
        return this.f30623o;
    }

    /* JADX INFO: renamed from: j */
    protected String m31825j() {
        C12135cd c12135cd = this.f30615g;
        return c12135cd == null ? "" : c12135cd.m32814c();
    }

    /* JADX INFO: renamed from: k */
    public String m31826k() {
        return String.format("%s %s", mo26207c(), Integer.valueOf(hashCode()));
    }

    /* JADX INFO: renamed from: l */
    public int m31827l() {
        return this.f30616h.m31338d();
    }

    /* JADX INFO: renamed from: m */
    public String m31828m() {
        return this.f30616h.m31342h().isMultipleInstances() ? this.f30616h.m31342h().getProviderTypeForReflection() : this.f30616h.m31340f();
    }

    /* JADX INFO: renamed from: n */
    public String m31829n() {
        return this.f30616h.m31341g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.f30624p.mo31718c()) {
            this.f30624p.mo31711a(new g());
        } else {
            m31797H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdClicked(Map map) {
        onAdClicked();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str) throws Throwable {
        if (this.f30624p.mo31718c()) {
            this.f30624p.mo31711a(new e(adapterErrorType, i, str));
        } else {
            m31803a(adapterErrorType, i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str, Map map) {
        onAdLoadFailed(adapterErrorType, i, str);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.f30624p.mo31718c()) {
            this.f30624p.mo31711a(new d());
        } else {
            m31798I();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdLoadSuccess(Map map) {
        onAdLoadSuccess();
    }

    public void onAdOpened() {
        if (this.f30624p.mo31718c()) {
            this.f30624p.mo31711a(new f());
        } else {
            m31799J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdOpened(Map map) {
        onAdOpened();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdShowFailed(int i, String str, Map map) {
        onAdShowFailed(i, str);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i, String str) {
        if (this.f30624p.mo31718c()) {
            this.f30624p.mo31711a(new c(i, str));
        } else {
            m31802a(i, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public /* synthetic */ void onInitFailed(int i, String str, Map map) {
        onInitFailed(i, str);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() throws Throwable {
        if (this.f30624p.mo31718c()) {
            this.f30624p.mo31711a(new b());
        } else {
            m31800K();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public /* synthetic */ void onInitSuccess(Map map) {
        onInitSuccess();
    }

    /* JADX INFO: renamed from: p */
    public NetworkSettings m31830p() {
        return this.f30609a.m32796g();
    }

    /* JADX INFO: renamed from: q */
    protected Map<String, Object> m31831q() {
        HashMap map = new HashMap();
        map.putAll(C12194fa.m31478a(this.f30617i));
        return map;
    }

    /* JADX INFO: renamed from: r */
    public Integer m31832r() {
        C12378n0 c12378n0 = this.f30609a;
        if (c12378n0 != null) {
            return Integer.valueOf(c12378n0.m32797h());
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public h m31833t() {
        return this.f30613e;
    }

    /* JADX INFO: renamed from: u */
    protected InterfaceC12326md m31834u() {
        return this.f30624p;
    }

    /* JADX INFO: renamed from: v */
    protected boolean mo26255v() {
        return false;
    }

    /* JADX INFO: renamed from: w */
    public boolean m31835w() {
        return this.f30616h.m31344j();
    }

    /* JADX INFO: renamed from: x */
    public boolean m31836x() {
        return this.f30613e == h.FAILED;
    }

    /* JADX INFO: renamed from: y */
    public boolean m31837y() {
        return this.f30613e == h.LOADED;
    }

    /* JADX INFO: renamed from: z */
    public boolean m31838z() {
        h hVar = this.f30613e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }

    @Override // com.ironsource.InterfaceC11506J8.b
    /* JADX INFO: renamed from: b */
    public int mo26206b() {
        return this.f30616h.m31339e();
    }

    /* JADX INFO: renamed from: b */
    private boolean m31805b(EnumC11372C0 enumC11372C0) {
        return new ArrayList(Arrays.asList(EnumC11372C0.LOAD_AD, EnumC11372C0.LOAD_AD_SUCCESS, EnumC11372C0.LOAD_AD_FAILED, EnumC11372C0.LOAD_AD_FAILED_WITH_REASON, EnumC11372C0.LOAD_AD_NO_FILL, EnumC11372C0.RELOAD_AD, EnumC11372C0.RELOAD_AD_SUCCESS, EnumC11372C0.RELOAD_AD_FAILED_WITH_REASON, EnumC11372C0.RELOAD_AD_NO_FILL, EnumC11372C0.DESTROY_AD, EnumC11372C0.AD_PRESENT_SCREEN, EnumC11372C0.AD_DISMISS_SCREEN, EnumC11372C0.AD_LEFT_APPLICATION, EnumC11372C0.AD_OPENED, EnumC11372C0.AD_CLOSED, EnumC11372C0.SHOW_AD, EnumC11372C0.SHOW_AD_FAILED, EnumC11372C0.AD_CLICKED, EnumC11372C0.AD_REWARDED)).contains(enumC11372C0);
    }

    /* JADX INFO: renamed from: a */
    protected void m31816a(h hVar) {
        IronLog.INTERNAL.verbose(m31819d());
        this.f30613e = hVar;
    }

    /* JADX INFO: renamed from: a */
    public void m31817a(boolean z) {
        this.f30614f.set(z);
    }

    /* JADX INFO: renamed from: a */
    protected Map<String, Object> mo26254a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.f30609a.m32798i());
        return map;
    }

    /* JADX INFO: renamed from: a */
    protected AdData mo26253a(String str, Map<String, Object> map) {
        return new AdData(str, m31831q(), mo26254a(map));
    }

    /* JADX INFO: renamed from: a */
    protected String m31814a(String str) {
        String str2 = this.f30609a.m32790a().name() + " - " + m31826k() + " - state = " + this.f30613e;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    @Override // com.ironsource.C12393nf.a
    /* JADX INFO: renamed from: a */
    public void mo31815a() {
        if (!this.f30624p.mo31718c()) {
            m31801L();
        } else {
            this.f30624p.mo31711a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m31802a(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m31814a("error = " + i + ", " + str));
        if (m31795D()) {
            C12393nf c12393nf = this.f30622n;
            if (c12393nf != null) {
                c12393nf.m32844e();
            }
            m31816a(h.FAILED);
            m31804a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, C12189f5.m31432a(this.f30621m));
            this.f30610b.mo27313a(new IronSourceError(i, str), this);
            return;
        }
        if (this.f30613e == h.FAILED) {
            return;
        }
        ironLog.error(m31814a(String.format("unexpected init failed for %s, state - %s, error - %s, %s", m31826k(), this.f30613e, Integer.valueOf(i), str)));
        if (this.f30612d != null) {
            this.f30612d.f24292j.m27992m(String.format("unexpected init failed, state - %s, error - %s, %s", this.f30613e, Integer.valueOf(i), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m31803a(AdapterErrorType adapterErrorType, int i, String str) throws Throwable {
        long jM31432a = C12189f5.m31432a(this.f30621m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m31814a("Load duration = " + jM31432a + ", error = " + i + ", " + str));
        C12393nf c12393nf = this.f30622n;
        if (c12393nf != null) {
            c12393nf.m32844e();
        }
        synchronized (this.f30625q) {
            try {
                try {
                    h hVar = this.f30613e;
                    if (hVar == h.LOADING) {
                        m31804a(adapterErrorType, i, str, jM31432a);
                        m31816a(h.FAILED);
                        this.f30610b.mo27313a(new IronSourceError(i, str), this);
                        return;
                    }
                    if (hVar == h.FAILED) {
                        m31804a(adapterErrorType, i, str, jM31432a);
                        return;
                    }
                    if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                        this.f30620l = Long.valueOf(System.currentTimeMillis());
                        ironLog.error(m31814a(String.format("ad expired for %s, state = %s", this.f30616h.m31340f(), this.f30613e)));
                        C11426F0 c11426f0 = this.f30612d;
                        if (c11426f0 != null) {
                            c11426f0.f24292j.m27973a(String.format("ad expired, state = %s", this.f30613e));
                        }
                        return;
                    }
                    ironLog.error(m31814a(String.format("unexpected load failed for %s, state - %s, error - %s, %s", m31826k(), this.f30613e, Integer.valueOf(i), str)));
                    String str2 = String.format("unexpected load failed, state - %s, error - %s, %s", this.f30613e, Integer.valueOf(i), str);
                    if (this.f30612d != null) {
                        if (mo26255v()) {
                            this.f30612d.f24292j.m27997r(str2);
                        } else if (this.f30609a.m32790a() != IronSource.EnumC12328a.REWARDED_VIDEO || this.f30613e != h.SHOWING) {
                            this.f30612d.f24292j.m27994o(str2);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m31804a(AdapterErrorType adapterErrorType, int i, String str, long j) {
        if (this.f30612d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (mo26255v()) {
                    this.f30612d.f24288f.m33956b(j, i);
                    return;
                } else {
                    this.f30612d.f24288f.m33947a(j, i);
                    return;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (mo26255v()) {
                    this.f30612d.f24288f.m33948a(j, i, str);
                    return;
                } else {
                    this.f30612d.f24288f.m33949a(j, i, str, false);
                    return;
                }
            }
            this.f30612d.f24288f.m33950a(j, i, false);
        }
    }
}
