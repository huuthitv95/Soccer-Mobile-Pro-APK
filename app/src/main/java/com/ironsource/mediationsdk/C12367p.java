package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.AbstractC12295l3;
import com.ironsource.C11363B9;
import com.ironsource.C11399D9;
import com.ironsource.C11453G9;
import com.ironsource.C11455Gb;
import com.ironsource.C11473Hb;
import com.ironsource.C11494Ie;
import com.ironsource.C11499J1;
import com.ironsource.C11530Ke;
import com.ironsource.C11545Lb;
import com.ironsource.C11553M1;
import com.ironsource.C11555M3;
import com.ironsource.C11557M5;
import com.ironsource.C11573N3;
import com.ironsource.C11577N7;
import com.ironsource.C11629Q6;
import com.ironsource.C11648R9;
import com.ironsource.C11652Rd;
import com.ironsource.C11686Td;
import com.ironsource.C11692U2;
import com.ironsource.C11694U4;
import com.ironsource.C11701Ub;
import com.ironsource.C11710V3;
import com.ironsource.C11722Vf;
import com.ironsource.C11733W9;
import com.ironsource.C11735Wb;
import com.ironsource.C11739Wf;
import com.ironsource.C11767Y9;
import com.ironsource.C11787Zc;
import com.ironsource.C11805ad;
import com.ironsource.C12135cd;
import com.ironsource.C12147d7;
import com.ironsource.C12149d9;
import com.ironsource.C12161e3;
import com.ironsource.C12193f9;
import com.ironsource.C12215gd;
import com.ironsource.C12256j0;
import com.ironsource.C12261j5;
import com.ironsource.C12266ja;
import com.ironsource.C12292l0;
import com.ironsource.C12317m4;
import com.ironsource.C12447qf;
import com.ironsource.C12464re;
import com.ironsource.C12550ub;
import com.ironsource.C12580w5;
import com.ironsource.C12596x3;
import com.ironsource.C12608xf;
import com.ironsource.C12626yf;
import com.ironsource.C12642zd;
import com.ironsource.EnumC12446qe;
import com.ironsource.EnumC12598x5;
import com.ironsource.InterfaceC11456Gc;
import com.ironsource.InterfaceC11470H8;
import com.ironsource.InterfaceC11523K7;
import com.ironsource.InterfaceC11574N4;
import com.ironsource.InterfaceC11592O4;
import com.ironsource.InterfaceC11632Q9;
import com.ironsource.InterfaceC11714V7;
import com.ironsource.InterfaceC12263j7;
import com.ironsource.InterfaceC12582w7;
import com.ironsource.InterfaceC12623yc;
import com.ironsource.RunnableC11504J6;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.adquality.C12330a;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.demandOnly.C12337c;
import com.ironsource.mediationsdk.demandOnly.C12340f;
import com.ironsource.mediationsdk.demandOnly.C12345k;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.demandOnly.InterfaceC12342h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.metadata.C12364a;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.p */
/* JADX INFO: loaded from: classes6.dex */
public class C12367p implements InterfaceC11632Q9, InterfaceC11456Gc, InterfaceC11574N4, InterfaceC11574N4.b, InterfaceC11574N4.c, InterfaceC11574N4.a {

    /* JADX INFO: renamed from: a0 */
    private static boolean f31353a0 = false;

    /* JADX INFO: renamed from: A */
    private int f31354A;

    /* JADX INFO: renamed from: B */
    private boolean f31355B;

    /* JADX INFO: renamed from: C */
    private boolean f31356C;

    /* JADX INFO: renamed from: D */
    private boolean f31357D;

    /* JADX INFO: renamed from: E */
    private boolean f31358E;

    /* JADX INFO: renamed from: F */
    private boolean f31359F;

    /* JADX INFO: renamed from: G */
    private boolean f31360G;

    /* JADX INFO: renamed from: H */
    private Boolean f31361H;

    /* JADX INFO: renamed from: I */
    private Boolean f31362I;

    /* JADX INFO: renamed from: J */
    private InterfaceC12623yc f31363J;

    /* JADX INFO: renamed from: K */
    private boolean f31364K;

    /* JADX INFO: renamed from: L */
    private boolean f31365L;

    /* JADX INFO: renamed from: M */
    private boolean f31366M;

    /* JADX INFO: renamed from: N */
    private final ConcurrentHashMap<String, InterfaceC12342h.d> f31367N;

    /* JADX INFO: renamed from: O */
    private final ConcurrentHashMap<String, InterfaceC12342h.b> f31368O;

    /* JADX INFO: renamed from: P */
    private final ConcurrentHashMap<String, InterfaceC12342h.d> f31369P;

    /* JADX INFO: renamed from: Q */
    private C12340f f31370Q;

    /* JADX INFO: renamed from: R */
    private C12345k f31371R;

    /* JADX INFO: renamed from: S */
    private C12337c f31372S;

    /* JADX INFO: renamed from: T */
    private C11557M5 f31373T;

    /* JADX INFO: renamed from: U */
    private C11648R9 f31374U;

    /* JADX INFO: renamed from: V */
    private C11629Q6 f31375V;

    /* JADX INFO: renamed from: W */
    private boolean f31376W;

    /* JADX INFO: renamed from: X */
    private AdQualityBridge f31377X;

    /* JADX INFO: renamed from: Y */
    InterfaceC11714V7<ISDemandOnlyInterstitialListener> f31378Y;

    /* JADX INFO: renamed from: Z */
    InterfaceC11714V7<ISDemandOnlyRewardedVideoListener> f31379Z;

    /* JADX INFO: renamed from: a */
    private final String f31380a;

    /* JADX INFO: renamed from: b */
    private final String f31381b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12582w7 f31382c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12582w7.a f31383d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC11523K7 f31384e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC12263j7 f31385f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC11470H8.a f31386g;

    /* JADX INFO: renamed from: h */
    private IronSourceLoggerManager f31387h;

    /* JADX INFO: renamed from: i */
    private C12550ub f31388i;

    /* JADX INFO: renamed from: j */
    private AtomicBoolean f31389j;

    /* JADX INFO: renamed from: k */
    private final Object f31390k;

    /* JADX INFO: renamed from: l */
    private C11494Ie f31391l;

    /* JADX INFO: renamed from: m */
    private String f31392m;

    /* JADX INFO: renamed from: n */
    private String f31393n;

    /* JADX INFO: renamed from: o */
    private String f31394o;

    /* JADX INFO: renamed from: p */
    private Map<String, String> f31395p;

    /* JADX INFO: renamed from: q */
    private String f31396q;

    /* JADX INFO: renamed from: r */
    private AtomicBoolean f31397r;

    /* JADX INFO: renamed from: s */
    private boolean f31398s;

    /* JADX INFO: renamed from: t */
    private List<IronSource.EnumC12328a> f31399t;

    /* JADX INFO: renamed from: u */
    private String f31400u;

    /* JADX INFO: renamed from: v */
    private Set<IronSource.EnumC12328a> f31401v;

    /* JADX INFO: renamed from: w */
    private Set<IronSource.EnumC12328a> f31402w;

    /* JADX INFO: renamed from: x */
    private boolean f31403x;

    /* JADX INFO: renamed from: y */
    private C11767Y9 f31404y;

    /* JADX INFO: renamed from: z */
    private final String f31405z;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.p$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f31406a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f31407b;

        static {
            int[] iArr = new int[C12368q.d.values().length];
            f31407b = iArr;
            try {
                iArr[C12368q.d.NOT_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31407b[C12368q.d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31407b[C12368q.d.INIT_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31407b[C12368q.d.INITIATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.EnumC12328a.values().length];
            f31406a = iArr2;
            try {
                iArr2[IronSource.EnumC12328a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31406a[IronSource.EnumC12328a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31406a[IronSource.EnumC12328a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31406a[IronSource.EnumC12328a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.p$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo32676a(String str);
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.p$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        static volatile C12367p f31408a = new C12367p();

        private c() {
        }
    }

    private C12367p() {
        this(C11455Gb.m25891U().mo25842a(), C11455Gb.m25885O().mo25773c(), C11455Gb.m25891U().mo25855w(), C11455Gb.m25891U().mo25847k(), C11455Gb.m25885O().mo25769C());
    }

    /* JADX INFO: renamed from: A */
    private boolean m32583A() {
        C11494Ie c11494Ie = this.f31391l;
        return (c11494Ie == null || c11494Ie.m26133c() == null || this.f31391l.m26133c().m26605e() == null) ? false : true;
    }

    /* JADX INFO: renamed from: B */
    private boolean m32584B() {
        return m32583A() && m32585C();
    }

    /* JADX INFO: renamed from: C */
    private boolean m32585C() {
        C11494Ie c11494Ie = this.f31391l;
        return (c11494Ie == null || c11494Ie.m26140k() == null || this.f31391l.m26140k().m33963c() == null || this.f31391l.m26140k().m33963c().isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: D */
    private boolean m32586D() {
        C11494Ie c11494Ie = this.f31391l;
        return (c11494Ie == null || c11494Ie.m26133c() == null || this.f31391l.m26133c().m26606f() == null) ? false : true;
    }

    /* JADX INFO: renamed from: E */
    private boolean m32587E() {
        return m32586D() && m32588F();
    }

    /* JADX INFO: renamed from: F */
    private boolean m32588F() {
        C11494Ie c11494Ie = this.f31391l;
        return (c11494Ie == null || c11494Ie.m26140k() == null || this.f31391l.m26140k().m33965d() == null || this.f31391l.m26140k().m33965d().size() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: J */
    private void m32589J() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapM31877c = C12266ja.m31872b().m31877c();
        if (concurrentHashMapM31877c.containsKey(C12364a.f31317c)) {
            String str = concurrentHashMapM31877c.get(C12364a.f31317c).get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C11694U4.f25873a.m27584b(!MetaDataUtils.getMetaDataBooleanValue(str));
        }
    }

    /* JADX INFO: renamed from: K */
    private void m32590K() {
        if (this.f31357D) {
            m32591L();
        }
    }

    /* JADX INFO: renamed from: L */
    private void m32591L() {
        this.f31387h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f31391l.m26140k().m33959a().size(); i++) {
            String str = this.f31391l.m26140k().m33959a().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f31391l.m26141l().m34240b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject jSONObjectM32739a = IronSourceUtils.m32739a(false, false, 1);
            m32612a(jSONObjectM32739a, new Object[][]{new Object[]{"errorCode", 1010}});
            m32609a(EnumC12598x5.TROUBLESHOOTING_BN_INIT_FAILED, jSONObjectM32739a);
            m32607a(IronSource.EnumC12328a.BANNER, false);
            return;
        }
        synchronized (this.f31368O) {
            C11692U2 c11692u2M26603c = this.f31391l.m26133c().m26603c();
            InterfaceC11592O4.a aVar = new InterfaceC11592O4.a("Mediation");
            if (c11692u2M26603c.m27567k()) {
                aVar.m26725a("isOneFlow", 1);
            }
            this.f31372S = new C12337c(arrayList, c11692u2M26603c, m32668i(), m32669j(), new InterfaceC11592O4.b(C11399D9.m25613i(), aVar));
        }
        for (InterfaceC12342h.b bVar : this.f31368O.values()) {
            this.f31372S.mo32358a(bVar.m32400g(), bVar.mo32397e());
        }
        this.f31368O.clear();
    }

    /* JADX INFO: renamed from: M */
    private void m32592M() {
        this.f31387h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f31391l.m26140k().m33961b().size(); i++) {
            String str = this.f31391l.m26140k().m33961b().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f31391l.m26141l().m34240b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject jSONObjectM32739a = IronSourceUtils.m32739a(false, false, 1);
            m32612a(jSONObjectM32739a, new Object[][]{new Object[]{"errorCode", 1010}});
            m32609a(EnumC12598x5.TROUBLESHOOTING_IS_INIT_FAILED, jSONObjectM32739a);
            m32607a(IronSource.EnumC12328a.INTERSTITIAL, false);
            return;
        }
        synchronized (this.f31367N) {
            this.f31370Q = m32597a((List<NetworkSettings>) arrayList);
        }
        Iterator<InterfaceC12342h.d> it = this.f31367N.values().iterator();
        while (it.hasNext()) {
            this.f31370Q.mo32377a(it.next());
        }
        this.f31367N.clear();
    }

    /* JADX INFO: renamed from: N */
    private void m32593N() {
        this.f31387h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f31391l.m26140k().m33965d().size(); i++) {
            String str = this.f31391l.m26140k().m33965d().get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f31391l.m26141l().m34240b(str));
            }
        }
        if (arrayList.isEmpty()) {
            m32607a(IronSource.EnumC12328a.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.f31369P) {
            this.f31371R = m32617b(arrayList);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            m32607a(IronSource.EnumC12328a.REWARDED_VIDEO, false);
            return;
        }
        Iterator<InterfaceC12342h.d> it = this.f31369P.values().iterator();
        while (it.hasNext()) {
            this.f31371R.mo32410a(it.next());
        }
        this.f31369P.clear();
    }

    /* JADX INFO: renamed from: O */
    private void m32594O() {
        if (this.f31356C) {
            m32592M();
        }
    }

    /* JADX INFO: renamed from: P */
    private void m32595P() {
        if (this.f31355B) {
            m32593N();
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m32622b(List<IronSource.EnumC12328a> list, boolean z, C11573N3 c11573n3) {
        IronLog.INTERNAL.verbose();
        try {
            this.f31399t = list;
            m32623c(true);
            this.f31387h.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.m32782i("init success");
            if (z) {
                JSONObject jSONObjectM32751b = IronSourceUtils.m32751b(false);
                try {
                    jSONObjectM32751b.put("revived", true);
                } catch (JSONException e) {
                    C12317m4.m32153d().m32155a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
                C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(EnumC12598x5.FIRST_INSTANCE_RESULT, jSONObjectM32751b));
            }
            int iM26450b = c11573n3.m26602b().m25548f().m26450b();
            if (iM26450b >= 0) {
                C11710V3 c11710v3 = new C11710V3();
                c11710v3.m27646a(iM26450b);
                c11710v3.m27647a(iM26450b, this.f31391l.m26141l().m34243d());
            }
            C11399D9.m25613i().m32044h();
            C11686Td.m27533i().m32044h();
            C11455Gb.m25891U().mo25850q().m32044h();
            C12332c.m32303b().m32324b(m32668i(), m32669j());
            for (IronSource.EnumC12328a enumC12328a : IronSource.EnumC12328a.values()) {
                if (this.f31401v.contains(enumC12328a)) {
                    if (list.contains(enumC12328a)) {
                        m32619b(enumC12328a);
                    } else {
                        m32607a(enumC12328a, false);
                    }
                }
            }
            InterfaceC12623yc interfaceC12623ycM32631l = m32631l();
            if (interfaceC12623ycM32631l != null) {
                interfaceC12623ycM32631l.mo33112a(this.f31391l);
            }
            return true;
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
            IronLog.INTERNAL.error(e2.toString());
            InterfaceC12623yc interfaceC12623ycM32631l2 = m32631l();
            if (interfaceC12623ycM32631l2 != null) {
                interfaceC12623ycM32631l2.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "onInitSuccess() had failed"));
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m32623c(boolean z) {
        this.f31398s = z;
    }

    /* JADX INFO: renamed from: d */
    private void m32625d(Context context) {
        AtomicBoolean atomicBoolean = this.f31389j;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        C12447qf.m33202a().m33203a(new RunnableC11504J6(context));
        C11455Gb.m25891U().mo25850q().m32030a(context, this.f31404y);
        C11399D9.m25613i().m32030a(context, this.f31404y);
        C11686Td.m27533i().m32030a(context, this.f31404y);
        C11787Zc.f26696P.m32030a(context, this.f31404y);
    }

    /* JADX INFO: renamed from: h */
    public static C12367p m32628h() {
        return c.f31408a;
    }

    /* JADX INFO: renamed from: l */
    private synchronized InterfaceC12623yc m32631l() {
        return this.f31363J;
    }

    /* JADX INFO: renamed from: p */
    private void m32632p() {
        this.f31387h = IronSourceLoggerManager.getLogger(0);
        this.f31388i = new C12550ub();
    }

    /* JADX INFO: renamed from: q */
    private boolean m32633q() {
        try {
            Class<?> cls = Class.forName("com.ironsource.adqualitysdk.sdk.IronSourceAdQuality");
            IronLog.INTERNAL.verbose("AdQuality SDK exist: " + cls.getName());
            return true;
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    /* JADX INFO: renamed from: r */
    private boolean m32634r() {
        C11494Ie c11494Ie = this.f31391l;
        return (c11494Ie == null || c11494Ie.m26133c() == null || this.f31391l.m26133c().m26602b() == null || this.f31391l.m26133c().m26602b().m25544b() == null) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    private boolean m32635s() {
        C11494Ie c11494Ie = this.f31391l;
        return (c11494Ie == null || c11494Ie.m26133c() == null || this.f31391l.m26133c().m26603c() == null) ? false : true;
    }

    /* JADX INFO: renamed from: t */
    private boolean m32636t() {
        return m32635s() && m32637u();
    }

    /* JADX INFO: renamed from: u */
    private boolean m32637u() {
        C11494Ie c11494Ie = this.f31391l;
        return (c11494Ie == null || c11494Ie.m26140k() == null || this.f31391l.m26140k().m33959a() == null || this.f31391l.m26140k().m33959a().size() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: w */
    private synchronized boolean m32638w() {
        return this.f31398s;
    }

    /* JADX INFO: renamed from: x */
    private boolean m32639x() {
        C11494Ie c11494Ie = this.f31391l;
        return (c11494Ie == null || c11494Ie.m26133c() == null || this.f31391l.m26133c().m26604d() == null) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    private boolean m32640y() {
        return m32639x() && m32641z();
    }

    /* JADX INFO: renamed from: z */
    private boolean m32641z() {
        C11494Ie c11494Ie = this.f31391l;
        return (c11494Ie == null || c11494Ie.m26140k() == null || this.f31391l.m26140k().m33961b() == null || this.f31391l.m26140k().m33961b().size() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: G */
    public boolean m32642G() {
        return m32638w();
    }

    /* JADX INFO: renamed from: H */
    public void m32643H() {
        this.f31376W = false;
    }

    /* JADX INFO: renamed from: I */
    public void m32644I() {
        if (f31353a0) {
            return;
        }
        f31353a0 = true;
        JSONObject jSONObjectM32751b = IronSourceUtils.m32751b(false);
        try {
            jSONObjectM32751b.put("status", "false");
            jSONObjectM32751b.put("errorCode", 1);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(EnumC12598x5.FIRST_INSTANCE_RESULT, jSONObjectM32751b));
    }

    /* JADX INFO: renamed from: a */
    public void m32649a(long j, C11494Ie.a aVar) {
        JSONObject jSONObjectM32751b = IronSourceUtils.m32751b(m32675v());
        try {
            jSONObjectM32751b.put("duration", j);
            jSONObjectM32751b.put("sessionDepth", this.f31354A);
            jSONObjectM32751b.put(IronSourceConstants.EVENTS_EXT1, aVar.m26145b());
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(EnumC12598x5.INIT_COMPLETE, jSONObjectM32751b));
    }

    @Override // com.ironsource.InterfaceC11574N4.a
    /* JADX INFO: renamed from: e */
    public void mo26642e(String str) {
        this.f31387h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            C12337c c12337c = this.f31372S;
            if (c12337c != null) {
                c12337c.mo32360a(str);
            }
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            this.f31387h.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    @Override // com.ironsource.InterfaceC11632Q9
    /* JADX INFO: renamed from: f */
    public void mo27299f(String str) {
        try {
            String str2 = this.f31380a + ":setMediationType(mediationType:" + str + ")";
            IronSourceLoggerManager ironSourceLoggerManager = this.f31387h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            if (!m32616a(str, 1, 64) || !m32629k(str)) {
                this.f31387h.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            } else {
                this.f31396q = str;
                this.f31374U.m27359f(str);
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            this.f31387h.logException(IronSourceLogger.IronSourceTag.API, this.f31380a + ":setMediationType(mediationType:" + str + ")", e);
        }
    }

    @Override // com.ironsource.InterfaceC11456Gc
    /* JADX INFO: renamed from: g */
    public void mo25926g(String str) {
        try {
            this.f31387h.log(IronSourceLogger.IronSourceTag.API, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.m32782i("Mediation init failed");
            if (this.f31388i != null) {
                Iterator<IronSource.EnumC12328a> it = this.f31401v.iterator();
                while (it.hasNext()) {
                    m32607a(it.next(), true);
                }
            }
            InterfaceC12623yc interfaceC12623ycM32631l = m32631l();
            if (interfaceC12623ycM32631l != null) {
                interfaceC12623ycM32631l.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed"));
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: i */
    public String m32668i() {
        return this.f31392m;
    }

    /* JADX INFO: renamed from: j */
    public void m32670j(String str) {
        IronLog.API.verbose("userId = " + str);
        this.f31393n = str;
        C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(EnumC12598x5.SET_USER_ID, IronSourceUtils.m32738a(false)));
        AdQualityBridge adQualityBridge = this.f31377X;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }

    /* JADX INFO: renamed from: k */
    public String m32671k() {
        return this.f31396q;
    }

    /* JADX INFO: renamed from: m */
    public Map<String, String> m32672m() {
        return this.f31395p;
    }

    /* JADX INFO: renamed from: n */
    public C11767Y9 m32673n() {
        return this.f31404y;
    }

    /* JADX INFO: renamed from: o */
    public String m32674o() {
        return this.f31400u;
    }

    /* JADX INFO: renamed from: v */
    boolean m32675v() {
        return this.f31355B || this.f31356C || this.f31357D;
    }

    /* JADX INFO: renamed from: k */
    private boolean m32629k(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    /* JADX INFO: renamed from: l */
    private C11555M3 m32630l(String str) {
        C11555M3 c11555m3 = new C11555M3();
        if (str == null) {
            c11555m3.m26478a(new IronSourceError(506, "Init Fail - appKey is missing"));
            return c11555m3;
        }
        if (!m32616a(str, 5, 10)) {
            c11555m3.m26478a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "length should be between 5-10 characters"));
            return c11555m3;
        }
        if (!m32629k(str)) {
            c11555m3.m26478a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "should contain only english characters and numbers"));
        }
        return c11555m3;
    }

    /* JADX INFO: renamed from: c */
    public C11701Ub m32662c() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listM32600a = m32600a(this.f31391l.m26140k().m33963c());
        if (listM32600a.size() > 0) {
            return new C11701Ub(listM32600a, this.f31391l.m26133c().m26605e(), IronSourceUtils.m32774f(), C12266ja.m31872b(), this.f31404y);
        }
        JSONObject jSONObjectM32739a = IronSourceUtils.m32739a(false, true, 1);
        m32612a(jSONObjectM32739a, new Object[][]{new Object[]{"errorCode", 1010}});
        m32609a(EnumC12598x5.TROUBLESHOOTING_NT_INIT_FAILED, jSONObjectM32739a);
        return null;
    }

    @Override // com.ironsource.InterfaceC11574N4.c
    /* JADX INFO: renamed from: h */
    public synchronized boolean mo26652h(String str) {
        C12345k c12345k;
        c12345k = this.f31371R;
        return c12345k != null && c12345k.mo32411a(str);
    }

    /* JADX INFO: renamed from: i */
    public C11735Wb m32667i(String str) {
        C11545Lb c11545LbM26605e = this.f31391l.m26133c().m26605e();
        if (c11545LbM26605e == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return c11545LbM26605e.m26418e();
        }
        C11735Wb c11735WbM26403a = c11545LbM26605e.m26403a(str);
        return c11735WbM26403a != null ? c11735WbM26403a : c11545LbM26605e.m26418e();
    }

    C12367p(InterfaceC12582w7 interfaceC12582w7, InterfaceC12582w7.a aVar, InterfaceC11523K7 interfaceC11523K7, InterfaceC12263j7 interfaceC12263j7, InterfaceC11470H8.a aVar2) {
        this.f31380a = getClass().getName();
        this.f31381b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b9.3.0";
        this.f31390k = new Object();
        this.f31391l = null;
        this.f31392m = null;
        this.f31393n = "";
        this.f31394o = null;
        this.f31395p = null;
        this.f31396q = null;
        this.f31398s = false;
        this.f31403x = true;
        this.f31405z = "sessionDepth";
        this.f31362I = null;
        this.f31376W = false;
        this.f31382c = interfaceC12582w7;
        this.f31383d = aVar;
        this.f31384e = interfaceC11523K7;
        this.f31385f = interfaceC12263j7;
        this.f31386g = aVar2;
        m32632p();
        this.f31389j = new AtomicBoolean();
        this.f31401v = new HashSet();
        this.f31402w = new HashSet();
        this.f31356C = false;
        this.f31355B = false;
        this.f31357D = false;
        this.f31397r = new AtomicBoolean(true);
        this.f31354A = 0;
        this.f31358E = false;
        this.f31359F = false;
        this.f31360G = false;
        this.f31400u = IronSourceUtils.m32764d();
        this.f31361H = Boolean.FALSE;
        this.f31366M = false;
        this.f31363J = null;
        this.f31364K = true;
        this.f31367N = new ConcurrentHashMap<>();
        this.f31369P = new ConcurrentHashMap<>();
        this.f31368O = new ConcurrentHashMap<>();
        this.f31370Q = null;
        this.f31371R = null;
        this.f31372S = null;
        this.f31373T = new C11557M5();
        C11648R9 c11648r9 = new C11648R9();
        this.f31374U = c11648r9;
        this.f31375V = new C11629Q6(c11648r9);
        this.f31377X = null;
        this.f31378Y = new InterfaceC11714V7.a();
        this.f31379Z = new InterfaceC11714V7.b();
    }

    @Override // com.ironsource.InterfaceC11574N4.b
    /* JADX INFO: renamed from: d */
    public synchronized boolean mo26647d(String str) {
        C12340f c12340f;
        c12340f = this.f31370Q;
        return c12340f != null && c12340f.mo32379b(str);
    }

    /* JADX INFO: renamed from: d */
    Boolean m32664d() {
        return this.f31362I;
    }

    /* JADX INFO: renamed from: e */
    public C11494Ie m32665e() {
        return this.f31391l;
    }

    /* JADX INFO: renamed from: j */
    public String m32669j() {
        return this.f31393n;
    }

    /* JADX INFO: renamed from: d */
    private boolean m32626d(C11494Ie c11494Ie) {
        C12330a c12330aM26601a = c11494Ie.m26133c().m26601a();
        return this.f31377X == null && c12330aM26601a != null && c12330aM26601a.m32253b() && AdQualityBridge.adQualityAvailable();
    }

    /* JADX INFO: renamed from: a */
    public synchronized IronSourceError m32647a(Context context, String str, boolean z, InterfaceC12623yc interfaceC12623yc, IronSource.EnumC12328a... enumC12328aArr) throws Throwable {
        Throwable th;
        try {
            try {
                IronLog.INTERNAL.verbose("GitHash: 00f07f7");
                try {
                    if (!C11733W9.m27833a((Object) context, "Init Failed - provided context is null")) {
                        mo25926g("Provided context is null");
                        return new IronSourceError(2000, "Provided context is null");
                    }
                    this.f31386g.mo25988a(context);
                    boolean z2 = context instanceof Activity;
                    if (z2) {
                        m32601a((Activity) context);
                    }
                    AtomicBoolean atomicBoolean = this.f31397r;
                    if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
                        C12464re.f31842a.m33250a(interfaceC12623yc == null);
                        if ((enumC12328aArr == null || enumC12328aArr.length == 0) && interfaceC12623yc == null) {
                            for (IronSource.EnumC12328a enumC12328a : IronSource.EnumC12328a.values()) {
                                this.f31401v.add(enumC12328a);
                            }
                            this.f31358E = true;
                            this.f31359F = true;
                            this.f31360G = true;
                        } else {
                            for (IronSource.EnumC12328a enumC12328a2 : enumC12328aArr) {
                                this.f31401v.add(enumC12328a2);
                                this.f31402w.add(enumC12328a2);
                                if (enumC12328a2.equals(IronSource.EnumC12328a.INTERSTITIAL)) {
                                    this.f31359F = true;
                                }
                                if (enumC12328a2.equals(IronSource.EnumC12328a.BANNER)) {
                                    this.f31360G = true;
                                }
                                if (enumC12328a2.equals(IronSource.EnumC12328a.REWARDED_VIDEO)) {
                                    this.f31358E = true;
                                }
                            }
                        }
                        IronLog.API.info("init(appKey:" + str + ")");
                        C11555M3 c11555m3M32630l = m32630l(str);
                        if (c11555m3M32630l.m26479b()) {
                            this.f31392m = str;
                        }
                        C11494Ie c11494IeM32645a = m32645a(context, this.f31392m);
                        if (c11494IeM32645a != null) {
                            IronLog.INTERNAL.verbose("init cache exists");
                            m32604a(c11494IeM32645a.m26133c().m26602b().m25548f());
                        } else {
                            IronLog.INTERNAL.verbose("init cache does not exist");
                        }
                        ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
                        this.f31383d.mo27887a(context.getApplicationContext(), TimeUnit.HOURS.toMillis(C11694U4.f25873a.m27588d()));
                        this.f31374U.m27360g(LevelPlay.getSdkVersion());
                        this.f31374U.m27344a(C11577N7.m26661a());
                        this.f31374U.m27354b(IronSourceUtils.m32777f(context));
                        this.f31374U.m27342a(C12292l0.m31957a());
                        m32589J();
                        m32625d(context);
                        if (this.f31392m == null) {
                            C12368q.m32678c().m32687f();
                            if (this.f31401v.contains(IronSource.EnumC12328a.REWARDED_VIDEO)) {
                                C12642zd.m34322a().m34353a(false, (AdInfo) null);
                            }
                            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, c11555m3M32630l.m26477a().toString(), 1);
                            return new IronSourceError(2010, "App key is null");
                        }
                        this.f31374U.m27343a(context);
                        this.f31374U.m27356c(this.f31392m);
                        this.f31374U.m27361h(this.f31400u);
                        if (this.f31403x) {
                            JSONObject jSONObjectM32751b = IronSourceUtils.m32751b(z);
                            if (enumC12328aArr != null) {
                                for (IronSource.EnumC12328a enumC12328a3 : enumC12328aArr) {
                                    try {
                                        jSONObjectM32751b.put(enumC12328a3.toString(), true);
                                    } catch (Exception e) {
                                        C12317m4.m32153d().m32155a(e);
                                    }
                                }
                            }
                            int i = this.f31354A + 1;
                            this.f31354A = i;
                            try {
                                m32613a(z2, z, i, jSONObjectM32751b, interfaceC12623yc != null);
                                this.f31403x = false;
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                throw th;
                            }
                        }
                        return null;
                    }
                    if (enumC12328aArr != null) {
                        m32614a(z2, z, interfaceC12623yc != null, enumC12328aArr);
                    } else {
                        this.f31387h.log(IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
                    }
                    EnumC12446qe enumC12446qeM33251b = C12464re.f31842a.m33251b();
                    if (m32638w()) {
                        m32602a(this.f31391l);
                        return new IronSourceError(IronSourceError.ERROR_INIT_ALREADY_FINISHED, "Already finished init");
                    }
                    if (enumC12446qeM33251b == EnumC12446qe.INIT_FAILED) {
                        return new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed");
                    }
                    if (enumC12446qeM33251b != EnumC12446qe.NOT_INIT) {
                        if (interfaceC12623yc != null) {
                            m32610a(interfaceC12623yc);
                        }
                        return new IronSourceError(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, "Old Api init in progress");
                    }
                    return new IronSourceError(IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, "Already called new init");
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: renamed from: f */
    private InterfaceC11592O4 m32627f() {
        return new InterfaceC11592O4.b(C11455Gb.m25891U().mo25850q(), new InterfaceC11592O4.a("IronSource"));
    }

    /* JADX INFO: renamed from: g */
    public String m32666g() {
        return this.f31394o;
    }

    @Override // com.ironsource.InterfaceC11574N4.b
    /* JADX INFO: renamed from: c */
    public void mo26646c(String str) {
        this.f31387h.log(IronSourceLogger.IronSourceTag.API, "showDemandOnlyInterstitial() instanceId=" + str, 1);
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerMo27669a = this.f31378Y.mo27669a(str);
        try {
            if (!this.f31356C) {
                IronLog.API.error("Interstitial was initialized in mediation mode. Use showInterstitial instead");
                iSDemandOnlyInterstitialListenerMo27669a.onInterstitialAdShowFailed(str, new IronSourceError(508, "Interstitial was initialized in mediation mode. Use showInterstitial instead"));
                return;
            }
            C12340f c12340f = this.f31370Q;
            if (c12340f == null) {
                IronLog.API.error("Interstitial was not initiated");
                iSDemandOnlyInterstitialListenerMo27669a.onInterstitialAdShowFailed(str, new IronSourceError(508, "Interstitial was not initiated"));
            } else {
                c12340f.mo32378a(str);
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.API.error(e.getMessage());
            if (iSDemandOnlyInterstitialListenerMo27669a != null) {
                iSDemandOnlyInterstitialListenerMo27669a.onInterstitialAdShowFailed(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m32663c(Context context) {
        C12608xf c12608xf = C12608xf.f33185a;
        c12608xf.m34184b();
        if (!m32638w()) {
            c12608xf.m34182a(IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
            return;
        }
        if (!m32624c(this.f31391l)) {
            c12608xf.m34182a(IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            IronLog.API.error(IronSourceConstants.errorMessage_TEST_SUITE_DISABLED);
        } else if (!IronSourceUtils.m32780g(context)) {
            c12608xf.m34182a(IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            IronLog.API.error("TestSuite cannot be launched, No network connectivity");
        } else {
            new C12626yf().m34248a(context, m32668i(), this.f31391l.m26139j(), LevelPlay.getSdkVersion(), this.f31391l.m26133c().m26607g().m26307b(), m32664d(), this.f31364K);
            this.f31376W = true;
            c12608xf.m34185c();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m32619b(IronSource.EnumC12328a enumC12328a) {
        int i = a.f31406a[enumC12328a.ordinal()];
        if (i == 1) {
            m32595P();
        } else if (i == 2) {
            m32594O();
        } else {
            if (i != 3) {
                return;
            }
            m32590K();
        }
    }

    /* JADX INFO: renamed from: b */
    private C12345k m32617b(List<NetworkSettings> list) {
        C11652Rd c11652RdM26606f = this.f31391l.m26133c().m26606f();
        InterfaceC11592O4.a aVar = new InterfaceC11592O4.a("Mediation");
        if (c11652RdM26606f.m27383d()) {
            aVar.m26725a("isOneFlow", 1);
        }
        return new C12345k(list, c11652RdM26606f, C12332c.m32303b(), this.f31379Z, m32668i(), m32669j(), new InterfaceC11592O4.b(C11686Td.m27533i(), aVar));
    }

    /* JADX INFO: renamed from: c */
    private boolean m32624c(C11494Ie c11494Ie) {
        return c11494Ie != null && c11494Ie.m26142p();
    }

    @Override // com.ironsource.InterfaceC11632Q9
    /* JADX INFO: renamed from: b */
    public boolean mo27298b(String str) {
        try {
            C11555M3 c11555m3 = new C11555M3();
            m32611a(str, c11555m3);
            if (c11555m3.m26479b()) {
                this.f31394o = str;
                C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(EnumC12598x5.SET_USER_ID, IronSourceUtils.m32738a(true)));
                return true;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, c11555m3.m26477a().toString(), 2);
            return false;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            this.f31387h.logException(IronSourceLogger.IronSourceTag.API, this.f31380a + ":setDynamicUserId(dynamicUserId:" + str + ")", e);
            return false;
        }
    }

    @Override // com.ironsource.InterfaceC11574N4.c
    /* JADX INFO: renamed from: b */
    public synchronized void mo26651b(Activity activity, String str) {
        m32651a(new InterfaceC12342h.c().m32408b(str).m32403a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).m32404a(IronSource.EnumC12328a.REWARDED_VIDEO).m32409b(), this.f31379Z.mo27669a(str));
    }

    @Override // com.ironsource.InterfaceC11574N4.b
    /* JADX INFO: renamed from: b */
    public synchronized void mo26645b(Activity activity, String str, String str2) {
        m32608a(new InterfaceC12342h.c().m32408b(str).m32403a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).m32404a(IronSource.EnumC12328a.INTERSTITIAL).m32407a(true).m32406a(str2).m32409b(), this.f31378Y.mo27669a(str));
    }

    /* JADX INFO: renamed from: b */
    public C12366o m32657b(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f31387h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.f31387h.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new C12366o(activity, iSBannerSize);
    }

    /* JADX INFO: renamed from: b */
    private boolean m32621b(InterfaceC12342h.b bVar) {
        synchronized (this.f31368O) {
            if (this.f31372S != null) {
                return false;
            }
            this.f31368O.put(bVar.mo32397e(), bVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m32604a(C11553M1 c11553m1) {
        C11694U4 c11694u4 = C11694U4.f25873a;
        c11694u4.m27586c(c11553m1.m26455g());
        c11694u4.m27582a(c11553m1.m26454f());
        c11694u4.m27581a(c11553m1.m26458j());
        this.f31385f.mo26713a(c11553m1);
    }

    /* JADX INFO: renamed from: b */
    public String m32658b() {
        C12368q c12368qM32678c = C12368q.m32678c();
        int i = a.f31407b[c12368qM32678c.m32681a().ordinal()];
        if (i == 1) {
            return "init() must be called first";
        }
        if (i == 2) {
            return "init() had failed";
        }
        if (i != 3) {
            return (i == 4 && !m32584B()) ? "No Native Ad configurations found" : "";
        }
        return c12368qM32678c.m32686d() ? "init() had failed" : "init() not finished yet";
    }

    /* JADX INFO: renamed from: a */
    public synchronized List<IronSource.EnumC12328a> m32648a(Context context, String str, boolean z, IronSource.EnumC12328a... enumC12328aArr) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if ((enumC12328aArr == null || enumC12328aArr.length == 0) && z) {
            if (this.f31358E) {
                m32606a(IronSource.EnumC12328a.REWARDED_VIDEO);
            } else {
                this.f31355B = true;
                arrayList.add(IronSource.EnumC12328a.REWARDED_VIDEO);
            }
            if (this.f31359F) {
                m32606a(IronSource.EnumC12328a.INTERSTITIAL);
            } else {
                this.f31356C = true;
                arrayList.add(IronSource.EnumC12328a.INTERSTITIAL);
            }
            if (this.f31360G) {
                m32606a(IronSource.EnumC12328a.BANNER);
            } else {
                this.f31357D = true;
                arrayList.add(IronSource.EnumC12328a.BANNER);
            }
        } else {
            for (IronSource.EnumC12328a enumC12328a : enumC12328aArr) {
                if (enumC12328a.equals(IronSource.EnumC12328a.INTERSTITIAL)) {
                    if (this.f31359F) {
                        m32606a(enumC12328a);
                    } else {
                        this.f31356C = true;
                        if (!arrayList.contains(enumC12328a)) {
                            arrayList.add(enumC12328a);
                        }
                    }
                }
                if (enumC12328a.equals(IronSource.EnumC12328a.REWARDED_VIDEO)) {
                    if (this.f31358E) {
                        m32606a(enumC12328a);
                    } else {
                        this.f31355B = true;
                        if (!arrayList.contains(enumC12328a)) {
                            arrayList.add(enumC12328a);
                        }
                    }
                }
                if (enumC12328a.equals(IronSource.EnumC12328a.BANNER)) {
                    if (this.f31360G) {
                        m32606a(enumC12328a);
                    } else {
                        this.f31357D = true;
                        if (!arrayList.contains(enumC12328a)) {
                            arrayList.add(enumC12328a);
                        }
                    }
                }
            }
        }
        if (context != null) {
            if (context instanceof Activity) {
                m32601a((Activity) context);
            }
            ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    C11494Ie m32656b(Context context, String str, b bVar) {
        synchronized (this.f31390k) {
            C11494Ie c11494Ie = this.f31391l;
            if (c11494Ie != null) {
                return new C11494Ie(c11494Ie);
            }
            C11494Ie c11494IeM32596a = m32596a(context, str, bVar);
            if (c11494IeM32596a == null || !c11494IeM32596a.m26143q()) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                c11494IeM32596a = m32645a(context, m32668i());
                if (c11494IeM32596a != null) {
                    IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(m32668i(), str);
                    this.f31387h.log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError.toString() + ": " + c11494IeM32596a.toString(), 1);
                    C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(EnumC12598x5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.m32751b(false)));
                }
            }
            if (c11494IeM32596a != null) {
                this.f31391l = c11494IeM32596a;
                IronSourceUtils.m32772e(context, c11494IeM32596a.toString());
                m32659b(this.f31391l, context);
                C11399D9.m25613i().m32041c(true);
                C11686Td.m27533i().m32041c(true);
                C11787Zc.f26696P.m32041c(true);
                C11455Gb.m25891U().mo25850q().m32041c(true);
            }
            return c11494IeM32596a;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m32606a(IronSource.EnumC12328a enumC12328a) {
        String str = enumC12328a + " ad unit has already been initialized";
        this.f31387h.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.m32782i(str);
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m32614a(boolean z, boolean z2, boolean z3, IronSource.EnumC12328a... enumC12328aArr) throws Throwable {
        Throwable th;
        try {
            try {
                int i = 0;
                for (IronSource.EnumC12328a enumC12328a : enumC12328aArr) {
                    try {
                        if (enumC12328a.equals(IronSource.EnumC12328a.INTERSTITIAL)) {
                            this.f31359F = true;
                        } else if (enumC12328a.equals(IronSource.EnumC12328a.BANNER)) {
                            this.f31360G = true;
                        } else if (enumC12328a.equals(IronSource.EnumC12328a.REWARDED_VIDEO)) {
                            this.f31358E = true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (C12368q.m32678c().m32681a() == C12368q.d.INIT_FAILED) {
                    try {
                        if (this.f31388i != null) {
                            int length = enumC12328aArr.length;
                            while (i < length) {
                                IronSource.EnumC12328a enumC12328a2 = enumC12328aArr[i];
                                if (!this.f31401v.contains(enumC12328a2)) {
                                    m32607a(enumC12328a2, true);
                                }
                                i++;
                            }
                        }
                    } catch (Exception e) {
                        C12317m4.m32153d().m32155a(e);
                        IronLog.INTERNAL.error(e.toString());
                    }
                } else if (!m32638w()) {
                    JSONObject jSONObjectM32751b = IronSourceUtils.m32751b(z2);
                    int length2 = enumC12328aArr.length;
                    while (i < length2) {
                        IronSource.EnumC12328a enumC12328a3 = enumC12328aArr[i];
                        if (!this.f31401v.contains(enumC12328a3)) {
                            this.f31401v.add(enumC12328a3);
                            this.f31402w.add(enumC12328a3);
                            try {
                                jSONObjectM32751b.put(enumC12328a3.toString(), true);
                            } catch (Exception e2) {
                                C12317m4.m32153d().m32155a(e2);
                                IronLog.INTERNAL.error(e2.toString());
                            }
                        } else {
                            this.f31387h.log(IronSourceLogger.IronSourceTag.API, enumC12328a3 + " ad unit has started initializing.", 3);
                        }
                        i++;
                    }
                    int i2 = this.f31354A + 1;
                    this.f31354A = i2;
                    m32613a(z, z2, i2, jSONObjectM32751b, z3);
                } else {
                    if (this.f31399t == null) {
                        return;
                    }
                    try {
                        new C11473Hb().m26007a(this.f31391l.m26133c().m26602b().m25547e().m26336b(), m32675v());
                    } catch (Exception e3) {
                        C12317m4.m32153d().m32155a(e3);
                        IronLog.INTERNAL.error(e3.toString());
                    }
                    JSONObject jSONObjectM32751b2 = IronSourceUtils.m32751b(z2);
                    for (IronSource.EnumC12328a enumC12328a4 : enumC12328aArr) {
                        if (!this.f31401v.contains(enumC12328a4)) {
                            this.f31401v.add(enumC12328a4);
                            this.f31402w.add(enumC12328a4);
                            try {
                                jSONObjectM32751b2.put(enumC12328a4.toString(), true);
                            } catch (Exception e4) {
                                C12317m4.m32153d().m32155a(e4);
                                IronLog.INTERNAL.error(e4.toString());
                            }
                            List<IronSource.EnumC12328a> list = this.f31399t;
                            if (list != null && list.contains(enumC12328a4)) {
                                m32619b(enumC12328a4);
                            } else {
                                m32607a(enumC12328a4, false);
                            }
                        } else {
                            m32606a(enumC12328a4);
                        }
                    }
                    int i3 = this.f31354A + 1;
                    this.f31354A = i3;
                    try {
                        m32613a(z, z2, i3, jSONObjectM32751b2, z3);
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            th = th;
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m32659b(C11494Ie c11494Ie, Context context) {
        m32618b(c11494Ie);
        m32603a(c11494Ie, context);
    }

    /* JADX INFO: renamed from: b */
    private void m32618b(C11494Ie c11494Ie) {
        this.f31387h.setLoggerDebugLevel("console", c11494Ie.m26133c().m26602b().m25550h().m27280a());
    }

    @Override // com.ironsource.InterfaceC11632Q9
    /* JADX INFO: renamed from: b */
    public String mo27297b(Context context) {
        String strMo27878J = this.f31382c.mo27878J(context);
        C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(EnumC12598x5.GET_ADVERTISING_ID, IronSourceUtils.m32751b(false)));
        return !TextUtils.isEmpty(strMo27878J) ? strMo27878J : "";
    }

    /* JADX INFO: renamed from: b */
    private void m32620b(EnumC12598x5 enumC12598x5, JSONObject jSONObject) {
        C11686Td.m27533i().mo25281a(new C12580w5(enumC12598x5, jSONObject));
    }

    /* JADX INFO: renamed from: b */
    public void m32661b(boolean z) {
        this.f31362I = Boolean.valueOf(z);
        C12332c.m32303b().m32325b(z);
        this.f31374U.m27349a(z);
        C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(z ? EnumC12598x5.CONSENT_TRUE_CODE : EnumC12598x5.CONSENT_FALSE_CODE, IronSourceUtils.m32751b(false)));
    }

    /* JADX INFO: renamed from: b */
    public void m32660b(String str, JSONObject jSONObject) {
        C12332c.m32303b().m32323b(new C12371t(str, jSONObject));
    }

    @Override // com.ironsource.InterfaceC11681T8
    /* JADX INFO: renamed from: b */
    public void mo27522b(ImpressionDataListener impressionDataListener) {
        if (C11733W9.m27833a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            C12266ja.m31872b().m31874a(impressionDataListener);
            IronLog.API.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m32613a(boolean z, boolean z2, int i, JSONObject jSONObject, boolean z3) {
        try {
            StringBuilder sb = new StringBuilder();
            if (z2) {
                sb.append(String.format(",Activity=%s", Boolean.valueOf(ContextProvider.getInstance().getCurrentActiveActivity() != null)));
            } else if (!z) {
                sb.append(",init_context_flow");
            }
            sb.append(String.format(",cachedUserAgent=%s", Boolean.valueOf(this.f31382c.mo27916n())));
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
            jSONObject.put("sessionDepth", i);
            if (z3) {
                if (z2) {
                    jSONObject.put("isMultipleAdObjects", 1);
                } else {
                    jSONObject.put("isMultipleAdUnits", 1);
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(EnumC12598x5.FIRST_INSTANCE, jSONObject));
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m32610a(InterfaceC12623yc interfaceC12623yc) {
        this.f31363J = interfaceC12623yc;
    }

    /* JADX INFO: renamed from: a */
    public boolean m32655a(boolean z, C11494Ie c11494Ie) {
        m32602a(c11494Ie);
        if (m32638w()) {
            return true;
        }
        synchronized (this.f31390k) {
            this.f31391l = c11494Ie;
        }
        return m32622b(c11494Ie.m26137h(), z, c11494Ie.m26133c());
    }

    @Override // com.ironsource.InterfaceC11456Gc
    /* JADX INFO: renamed from: a */
    public void mo25925a(List<IronSource.EnumC12328a> list, boolean z, C11573N3 c11573n3) {
        m32602a(this.f31391l);
        m32622b(list, z, c11573n3);
    }

    /* JADX INFO: renamed from: a */
    private void m32602a(C11494Ie c11494Ie) {
        if (m32633q() && m32626d(c11494Ie)) {
            AdQualityBridge adQualityBridge = new AdQualityBridge(ContextProvider.getInstance().getApplicationContext(), m32668i(), m32669j(), new C12256j0(), c11494Ie.m26133c().m26602b().m25550h().m27280a());
            this.f31377X = adQualityBridge;
            C11767Y9 c11767y9 = this.f31404y;
            if (c11767y9 != null) {
                adQualityBridge.setSegment(c11767y9);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private C12340f m32597a(List<NetworkSettings> list) {
        C11363B9 c11363b9M26604d = this.f31391l.m26133c().m26604d();
        InterfaceC11592O4.a aVar = new InterfaceC11592O4.a("Mediation");
        if (c11363b9M26604d.m25473j()) {
            aVar.m26725a("isOneFlow", 1);
        }
        return new C12340f(list, c11363b9M26604d, C12332c.m32303b(), this.f31378Y, m32668i(), m32669j(), new InterfaceC11592O4.b(C11399D9.m25613i(), aVar));
    }

    /* JADX INFO: renamed from: a */
    private List<NetworkSettings> m32600a(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(this.f31391l.m26141l().m34240b(str));
            }
        }
        return arrayList2;
    }

    @Override // com.ironsource.InterfaceC11456Gc
    /* JADX INFO: renamed from: a */
    public void mo25924a() {
        if (this.f31361H.booleanValue()) {
            this.f31361H = Boolean.FALSE;
            C12359l.m32560a().m32563b(IronSource.EnumC12328a.BANNER, new IronSourceError(603, "init() had failed"));
        }
        if (this.f31366M) {
            this.f31366M = false;
            C12359l.m32560a().m32563b(IronSource.EnumC12328a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.f31365L) {
            this.f31365L = false;
            C12359l.m32560a().m32563b(IronSource.EnumC12328a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.f31367N) {
            Iterator<InterfaceC12342h.d> it = this.f31367N.values().iterator();
            while (it.hasNext()) {
                String strMo32397e = it.next().mo32397e();
                this.f31378Y.mo27669a(strMo32397e).onInterstitialAdLoadFailed(strMo32397e, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            }
            this.f31367N.clear();
        }
        synchronized (this.f31369P) {
            Iterator<InterfaceC12342h.d> it2 = this.f31369P.values().iterator();
            while (it2.hasNext()) {
                String strMo32397e2 = it2.next().mo32397e();
                this.f31379Z.mo27669a(strMo32397e2).onRewardedVideoAdLoadFailed(strMo32397e2, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f31369P.clear();
        }
        synchronized (this.f31368O) {
            for (InterfaceC12342h.b bVar : this.f31368O.values()) {
                ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutM32400g = bVar.m32400g();
                if (iSDemandOnlyBannerLayoutM32400g != null) {
                    iSDemandOnlyBannerLayoutM32400g.getListener().m34031a(bVar.mo32397e(), ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                }
            }
            this.f31368O.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m32607a(IronSource.EnumC12328a enumC12328a, boolean z) {
        int i = a.f31406a[enumC12328a.ordinal()];
        if (i == 1) {
            if (this.f31355B) {
                Iterator<InterfaceC12342h.d> it = this.f31369P.values().iterator();
                while (it.hasNext()) {
                    String strMo32397e = it.next().mo32397e();
                    this.f31379Z.mo27669a(strMo32397e).onRewardedVideoAdLoadFailed(strMo32397e, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.f31369P.clear();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && this.f31357D) {
                for (InterfaceC12342h.b bVar : this.f31368O.values()) {
                    ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutM32400g = bVar.m32400g();
                    if (iSDemandOnlyBannerLayoutM32400g != null) {
                        iSDemandOnlyBannerLayoutM32400g.getListener().m34031a(bVar.mo32397e(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
                    }
                }
                this.f31368O.clear();
                return;
            }
            return;
        }
        if (this.f31356C) {
            Iterator<InterfaceC12342h.d> it2 = this.f31367N.values().iterator();
            while (it2.hasNext()) {
                String strMo32397e2 = it2.next().mo32397e();
                this.f31378Y.mo27669a(strMo32397e2).onInterstitialAdLoadFailed(strMo32397e2, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
            }
            this.f31367N.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m32650a(C11767Y9 c11767y9) {
        this.f31404y = c11767y9;
        AdQualityBridge adQualityBridge = this.f31377X;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(c11767y9);
        }
        C11399D9.m25613i().m32032a(this.f31404y);
        C11686Td.m27533i().m32032a(this.f31404y);
        C11787Zc.f26696P.m32032a(this.f31404y);
        C11455Gb.m25891U().mo25850q().m32032a(this.f31404y);
    }

    @Override // com.ironsource.InterfaceC11632Q9
    /* JADX INFO: renamed from: a */
    public void mo27296a(boolean z) {
        C12332c.m32303b().m32321a(z);
    }

    @Override // com.ironsource.InterfaceC11574N4.c
    /* JADX INFO: renamed from: a */
    public synchronized void mo26648a(Activity activity, String str, String str2) {
        m32651a(new InterfaceC12342h.c().m32408b(str).m32406a(str2).m32403a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).m32407a(true).m32404a(IronSource.EnumC12328a.REWARDED_VIDEO).m32409b(), this.f31379Z.mo27669a(str));
    }

    /* JADX INFO: renamed from: a */
    void m32651a(InterfaceC12342h.d dVar, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        String strMo32397e = dVar.mo32397e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strMo32397e);
        try {
            if (!this.f31358E) {
                ironLog.error("initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo32397e, new IronSourceError(510, "initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()"));
                return;
            }
            if (!this.f31355B) {
                ironLog.error("Rewarded video was initialized in mediation mode");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo32397e, new IronSourceError(510, "Rewarded video was initialized in mediation mode"));
                return;
            }
            C12368q.d dVarM32681a = C12368q.m32678c().m32681a();
            if (dVarM32681a == C12368q.d.INIT_FAILED) {
                ironLog.error("init() had failed");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo32397e, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            IronSourceError ironSourceErrorMo32398a = dVar.mo32398a();
            if (ironSourceErrorMo32398a != null) {
                if (ironSourceErrorMo32398a.getErrorCode() == 1060) {
                    m32620b(EnumC12598x5.TROUBLESHOOTING_DO_CALLED_RV_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.m32739a(true, !TextUtils.isEmpty(dVar.mo32395b()), 1));
                }
                ironLog.error(ironSourceErrorMo32398a.toString());
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo32397e, ironSourceErrorMo32398a);
                return;
            }
            m32601a(dVar.mo31773d());
            if (dVarM32681a == C12368q.d.INIT_IN_PROGRESS) {
                if (C12368q.m32678c().m32686d()) {
                    ironLog.error("init() had failed");
                    iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo32397e, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                synchronized (this.f31369P) {
                    this.f31369P.put(strMo32397e, dVar);
                }
                if (TextUtils.isEmpty(dVar.mo32395b())) {
                    return;
                }
                m32620b(EnumC12598x5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.m32739a(true, !TextUtils.isEmpty(dVar.mo32395b()), 1));
                return;
            }
            if (!m32587E()) {
                ironLog.error("No rewarded video configurations found");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo32397e, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            synchronized (this.f31369P) {
                C12345k c12345k = this.f31371R;
                if (c12345k == null) {
                    this.f31369P.put(strMo32397e, dVar);
                    if (!TextUtils.isEmpty(dVar.mo32395b())) {
                        m32620b(EnumC12598x5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.m32739a(true, !TextUtils.isEmpty(dVar.mo32395b()), 1));
                    }
                    return;
                }
                c12345k.mo32410a(dVar);
                return;
            }
            C12317m4.m32153d().m32155a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo32397e, new IronSourceError(510, th.getMessage()));
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strMo32397e, new IronSourceError(510, th.getMessage()));
        }
    }

    @Override // com.ironsource.InterfaceC11574N4.c
    /* JADX INFO: renamed from: a */
    public synchronized void mo26650a(String str) {
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + str);
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerMo27669a = this.f31379Z.mo27669a(str);
        try {
            if (!this.f31355B) {
                ironLog.error("Rewarded video was initialized in mediation mode. Use showRewardedVideo instead");
                iSDemandOnlyRewardedVideoListenerMo27669a.onRewardedVideoAdShowFailed(str, new IronSourceError(508, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
                return;
            }
            C12345k c12345k = this.f31371R;
            if (c12345k == null) {
                ironLog.error("Rewarded video was not initiated");
                iSDemandOnlyRewardedVideoListenerMo27669a.onRewardedVideoAdShowFailed(str, new IronSourceError(508, "Rewarded video was not initiated"));
            } else {
                c12345k.mo32412b(str);
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.API.error(e.getMessage());
            if (iSDemandOnlyRewardedVideoListenerMo27669a != null) {
                iSDemandOnlyRewardedVideoListenerMo27669a.onRewardedVideoAdShowFailed(str, new IronSourceError(510, e.getMessage()));
            }
        }
    }

    @Override // com.ironsource.InterfaceC11574N4.c
    /* JADX INFO: renamed from: a */
    public void mo26649a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        this.f31379Z.mo27670a(iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.InterfaceC11574N4.b
    /* JADX INFO: renamed from: a */
    public synchronized void mo26643a(Activity activity, String str) {
        m32608a(new InterfaceC12342h.c().m32408b(str).m32403a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).m32404a(IronSource.EnumC12328a.INTERSTITIAL).m32409b(), this.f31378Y.mo27669a(str));
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m32608a(InterfaceC12342h.d dVar, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        String strMo32397e = dVar.mo32397e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strMo32397e);
        try {
            if (!this.f31359F) {
                ironLog.error("initISDemandOnly() must be called before loadISDemandOnlyInterstitial()");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strMo32397e, new IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
                return;
            }
            if (!this.f31356C) {
                ironLog.error("Interstitial was initialized in mediation mode. Use loadInterstitial instead");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strMo32397e, new IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
                return;
            }
            C12368q.d dVarM32681a = C12368q.m32678c().m32681a();
            if (dVarM32681a == C12368q.d.INIT_FAILED) {
                ironLog.error("init() had failed");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strMo32397e, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            IronSourceError ironSourceErrorMo32398a = dVar.mo32398a();
            if (ironSourceErrorMo32398a != null) {
                if (ironSourceErrorMo32398a.getErrorCode() == 1060) {
                    m32620b(EnumC12598x5.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.m32739a(true, !TextUtils.isEmpty(dVar.mo32395b()), 1));
                }
                ironLog.error(ironSourceErrorMo32398a.toString());
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strMo32397e, ironSourceErrorMo32398a);
                return;
            }
            m32601a(dVar.mo31773d());
            if (dVarM32681a == C12368q.d.INIT_IN_PROGRESS) {
                if (C12368q.m32678c().m32686d()) {
                    ironLog.error("init() had failed");
                    iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strMo32397e, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                } else {
                    synchronized (this.f31367N) {
                        this.f31367N.put(dVar.mo32397e(), dVar);
                    }
                    if (!TextUtils.isEmpty(dVar.mo32397e())) {
                        m32609a(EnumC12598x5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.m32739a(true, !TextUtils.isEmpty(dVar.mo32395b()), 1));
                    }
                }
                return;
            }
            if (!m32640y()) {
                ironLog.error("No interstitial configurations found");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strMo32397e, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                return;
            }
            synchronized (this.f31367N) {
                C12340f c12340f = this.f31370Q;
                if (c12340f == null) {
                    this.f31367N.put(dVar.mo32397e(), dVar);
                    if (!TextUtils.isEmpty(dVar.mo32395b())) {
                        m32609a(EnumC12598x5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.m32739a(true, !TextUtils.isEmpty(dVar.mo32395b()), 1));
                    }
                    return;
                }
                c12340f.mo32377a(dVar);
            }
            throw th;
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strMo32397e, new IronSourceError(510, th.getMessage()));
        }
    }

    @Override // com.ironsource.InterfaceC11574N4.b
    /* JADX INFO: renamed from: a */
    public void mo26644a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        this.f31378Y.mo27670a(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.InterfaceC11574N4.a
    /* JADX INFO: renamed from: a */
    public ISDemandOnlyBannerLayout mo26640a(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f31387h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            this.f31387h.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    @Override // com.ironsource.InterfaceC11574N4.a
    /* JADX INFO: renamed from: a */
    public synchronized void mo26641a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        InterfaceC12342h.b bVarM32401a = new InterfaceC12342h.c().m32408b(str).m32402a(activity).m32405a(iSDemandOnlyBannerLayout).m32404a(IronSource.EnumC12328a.BANNER).m32401a();
        IronSourceError ironSourceErrorMo32398a = bVarM32401a.mo32398a();
        if (ironSourceErrorMo32398a != null) {
            this.f31387h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorMo32398a.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().m34031a(str, ironSourceErrorMo32398a);
            }
            return;
        }
        IronSourceError ironSourceErrorM32598a = m32598a(C12368q.m32678c().m32681a());
        if (ironSourceErrorM32598a != null) {
            this.f31387h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorM32598a.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().m34031a(str, ironSourceErrorM32598a);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (m32615a(bVarM32401a)) {
            return;
        }
        if (!m32636t()) {
            this.f31387h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().m34031a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (m32621b(bVarM32401a)) {
                return;
            }
            this.f31372S.mo32358a(iSDemandOnlyBannerLayout, str);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m32615a(InterfaceC12342h.b bVar) {
        if (C12368q.m32678c().m32681a() != C12368q.d.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.f31368O) {
            this.f31368O.put(bVar.mo32397e(), bVar);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private IronSourceError m32598a(C12368q.d dVar) {
        if (!this.f31360G) {
            return new IronSourceError(510, "ironSource SDK was not initialized");
        }
        if (!this.f31357D) {
            return new IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (dVar == C12368q.d.INIT_FAILED) {
            return new IronSourceError(510, "ironSource initialization failed");
        }
        if (dVar == C12368q.d.INIT_IN_PROGRESS && C12368q.m32678c().m32686d()) {
            return new IronSourceError(510, "ironSource initialization in progress");
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public C11494Ie m32645a(Context context, String str) {
        if (!C12193f9.m31469a(context)) {
            return null;
        }
        C12596x3 c12596x3M31471c = C12193f9.m31471c(context);
        String strM34134d = c12596x3M31471c.m34134d();
        String strM34136f = c12596x3M31471c.m34136f();
        String strM34135e = c12596x3M31471c.m34135e();
        if (!strM34134d.equals(str)) {
            return null;
        }
        C11494Ie c11494Ie = new C11494Ie(context, strM34134d, strM34136f, strM34135e);
        c11494Ie.m26132a(C11494Ie.a.CACHE);
        return c11494Ie;
    }

    /* JADX INFO: renamed from: a */
    private C11494Ie m32596a(Context context, String str, b bVar) {
        Exception exc;
        C11494Ie c11494Ie = null;
        if (!IronSourceUtils.m32780g(context)) {
            return null;
        }
        try {
            String strMo27297b = mo27297b(context);
            if (TextUtils.isEmpty(strMo27297b)) {
                strMo27297b = this.f31382c.mo27886a(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = strMo27297b;
            C11767Y9 c11767y9 = this.f31404y;
            String strM31299a = C12147d7.m31299a(C11530Ke.m26297a(context, m32668i(), str, str2, m32671k(), this.f31364K, c11767y9 != null ? c11767y9.m28032f() : null, m32675v()), C12149d9.m31304a().toString(), bVar);
            if (strM31299a == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.m32779g()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(strM31299a);
                String strOptString = jSONObject.optString(C11494Ie.f24627n, null);
                if (TextUtils.isEmpty(strOptString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                strM31299a = m32599a(strOptString, Boolean.valueOf(jSONObject.optBoolean("compression", false)));
                if (TextUtils.isEmpty(strM31299a)) {
                    ironLog.warning("encoded response invalid - return null");
                    m32644I();
                    return null;
                }
            }
            C11494Ie c11494Ie2 = new C11494Ie(context, m32668i(), str, strM31299a);
            try {
                c11494Ie2.m26132a(C11494Ie.a.SERVER);
                if (c11494Ie2.m26143q()) {
                    return c11494Ie2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e) {
                exc = e;
                c11494Ie = c11494Ie2;
                C12317m4.m32153d().m32155a(exc);
                IronLog.INTERNAL.warning("exception = " + exc);
                return c11494Ie;
            }
        } catch (Exception e2) {
            exc = e2;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m32599a(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return C11453G9.m25868d(C12261j5.m31853b().m31855c(), str);
        }
        return C11453G9.m25865b(C12261j5.m31853b().m31855c(), str);
    }

    /* JADX INFO: renamed from: a */
    private void m32603a(C11494Ie c11494Ie, Context context) {
        boolean zM26167l = m32634r() ? c11494Ie.m26133c().m26602b().m25544b().m26167l() : false;
        boolean zM26167l2 = m32586D() ? c11494Ie.m26133c().m26606f().m27392m().m26167l() : false;
        boolean zM26167l3 = m32639x() ? c11494Ie.m26133c().m26604d().m25472i().m26167l() : false;
        boolean zM26167l4 = m32635s() ? c11494Ie.m26133c().m26603c().m27563g().m26167l() : false;
        boolean zM26167l5 = m32583A() ? c11494Ie.m26133c().m26605e().m26420g().m26167l() : false;
        C11805ad c11805adM25551i = c11494Ie.m26133c().m26602b().m25551i();
        boolean zM28194i = c11805adM25551i.m28194i();
        if (zM26167l) {
            m32605a((AbstractC12295l3) C11455Gb.m25891U().mo25850q(), c11494Ie.m26133c().m26602b().m25544b(), context, c11494Ie, true);
        }
        if (zM26167l2) {
            m32605a((AbstractC12295l3) C11686Td.m27533i(), c11494Ie.m26133c().m26606f().m27392m(), context, c11494Ie, true);
        } else {
            C11686Td.m27533i().mo25283a(false);
        }
        if (zM26167l3) {
            m32605a((AbstractC12295l3) C11399D9.m25613i(), c11494Ie.m26133c().m26604d().m25472i(), context, c11494Ie, true);
        } else if (zM26167l4) {
            m32605a((AbstractC12295l3) C11399D9.m25613i(), c11494Ie.m26133c().m26603c().m27563g(), context, c11494Ie, true);
        } else if (zM26167l5) {
            m32605a((AbstractC12295l3) C11399D9.m25613i(), c11494Ie.m26133c().m26605e().m26420g(), context, c11494Ie, true);
        } else {
            C11399D9.m25613i().mo25283a(false);
        }
        C11787Zc c11787Zc = C11787Zc.f26696P;
        c11787Zc.mo25283a(zM28194i);
        if (zM28194i) {
            c11787Zc.mo25286b(c11805adM25551i.m28195j(), context);
            c11787Zc.mo25288b(c11805adM25551i.m28197l(), context);
            c11787Zc.mo25290c(c11805adM25551i.m28196k(), context);
            c11787Zc.mo25287b(c11805adM25551i.m28192g());
            c11787Zc.mo25289c(c11805adM25551i.m28193h());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m32605a(AbstractC12295l3 abstractC12295l3, C11499J1 c11499j1, Context context, C11494Ie c11494Ie, boolean z) {
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
        abstractC12295l3.m32031a(c11494Ie.m26133c().m26602b().m25552j());
        abstractC12295l3.mo25287b(c11499j1.m26166k());
        abstractC12295l3.mo25289c(c11499j1.m26157b());
    }

    /* JADX INFO: renamed from: a */
    private void m32611a(String str, C11555M3 c11555m3) {
        if (m32616a(str, 1, 128)) {
            return;
        }
        c11555m3.m26478a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, "dynamicUserId is invalid, should be between 1-128 chars in length."));
    }

    /* JADX INFO: renamed from: a */
    private boolean m32616a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    /* JADX INFO: renamed from: a */
    boolean m32654a(C12161e3 c12161e3) {
        return this.f31384e.mo26262c(ContextProvider.getInstance().getApplicationContext(), c12161e3, IronSource.EnumC12328a.BANNER);
    }

    /* JADX INFO: renamed from: a */
    C12215gd.b m32646a(C12135cd c12135cd) {
        return this.f31384e.mo26261a(ContextProvider.getInstance().getApplicationContext(), c12135cd, IronSource.EnumC12328a.REWARDED_VIDEO);
    }

    /* JADX INFO: renamed from: a */
    private void m32609a(EnumC12598x5 enumC12598x5, JSONObject jSONObject) {
        C11399D9.m25613i().mo25281a(new C12580w5(enumC12598x5, jSONObject));
    }

    /* JADX INFO: renamed from: a */
    private void m32612a(JSONObject jSONObject, Object[][] objArr) {
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    jSONObject.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e), 3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m32652a(String str, List<String> list) {
        String strCheckMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String strCheckMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (strCheckMetaDataKeyValidity.length() > 0) {
            IronLog.API.verbose(strCheckMetaDataKeyValidity);
            return;
        }
        if (strCheckMetaDataValueValidity.length() > 0) {
            IronLog.API.verbose(strCheckMetaDataValueValidity);
            return;
        }
        MetaData metaData = MetaDataUtils.formatMetaData(str, list);
        String metaDataKey = metaData.getMetaDataKey();
        List<String> metaDataValue = metaData.getMetaDataValue();
        if (MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
            if (m32638w() && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                IronLog.API.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            } else {
                C12266ja.m31872b().m31875a(metaDataKey, metaDataValue);
            }
        } else {
            C12332c.m32303b().m32327c(metaDataKey, metaDataValue);
        }
        try {
            ConcurrentHashMap<String, List<String>> concurrentHashMapM32328d = C12332c.m32303b().m32328d();
            concurrentHashMapM32328d.putAll(C12266ja.m31872b().m31877c());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, List<String>> entry : concurrentHashMapM32328d.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            this.f31375V.m27291a(jSONObject);
            this.f31374U.m27348a(jSONObject);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("got the following error " + e.getMessage());
        }
        C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(m32638w() ? EnumC12598x5.SET_META_DATA_AFTER_INIT : EnumC12598x5.SET_META_DATA, IronSourceUtils.m32736a(str, list, metaDataValue)));
    }

    @Override // com.ironsource.InterfaceC11574N4
    /* JADX INFO: renamed from: a */
    public String mo26639a(Context context) {
        String strM25866c;
        C11739Wf c11739WfM25553k;
        InterfaceC11592O4 interfaceC11592O4M32627f = m32627f();
        EnumC12446qe enumC12446qe = null;
        try {
            EnumC12446qe enumC12446qeM33248a = C12464re.f31842a.m33248a();
            try {
                interfaceC11592O4M32627f.mo26722a(EnumC12598x5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_IN_INIT_STATUS, enumC12446qeM33248a);
                if (context == null) {
                    IronLog.API.error("bidding data cannot be retrieved, context required");
                    interfaceC11592O4M32627f.mo26722a(EnumC12598x5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_WITHOUT_CONTEXT, (EnumC12446qe) null);
                    return null;
                }
                if (enumC12446qeM33248a == EnumC12446qe.NOT_INIT) {
                    IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
                    interfaceC11592O4M32627f.mo26722a(EnumC12598x5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_NO_INIT_RETURNED_NULL, (EnumC12446qe) null);
                    return null;
                }
                C12368q.m32678c().m32688g();
                C11494Ie c11494Ie = this.f31391l;
                boolean zM27847e = (c11494Ie == null || (c11739WfM25553k = c11494Ie.m26133c().m26602b().m25553k()) == null) ? true : c11739WfM25553k.m27847e();
                this.f31374U.m27351b(context);
                JSONObject jSONObjectM27763a = new C11722Vf().m27763a(context);
                C12333d.m32333b().m32340a(jSONObjectM27763a, true);
                if (zM27847e) {
                    strM25866c = C11453G9.m25861a(jSONObjectM27763a.toString());
                } else {
                    strM25866c = C11453G9.m25866c(jSONObjectM27763a.toString());
                }
                if (enumC12446qeM33248a == EnumC12446qe.INITIATED) {
                    IronLog.INTERNAL.verbose("external token parameters: " + jSONObjectM27763a);
                }
                if (TextUtils.isEmpty(strM25866c)) {
                    interfaceC11592O4M32627f.mo26722a(EnumC12598x5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, enumC12446qeM33248a);
                }
                interfaceC11592O4M32627f.mo26722a(EnumC12598x5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, enumC12446qeM33248a);
                return strM25866c;
            } catch (Exception unused) {
                enumC12446qe = enumC12446qeM33248a;
                interfaceC11592O4M32627f.mo26722a(EnumC12598x5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, enumC12446qe);
                enumC12446qeM33248a = enumC12446qe;
                strM25866c = null;
            }
        } catch (Exception unused2) {
        }
    }

    @Override // com.ironsource.InterfaceC11681T8
    /* JADX INFO: renamed from: a */
    public void mo27521a(ImpressionDataListener impressionDataListener) {
        if (C11733W9.m27833a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            C12266ja.m31872b().m31876b(impressionDataListener);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m32653a(String str, JSONObject jSONObject) {
        if (C11733W9.m27833a((Object) jSONObject, "setAdRevenueData - impressionData is null") && C11733W9.m27833a((Object) str, "setAdRevenueData - dataSource is null")) {
            this.f31373T.m26482a(str, jSONObject);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m32601a(Activity activity) {
        ContextProvider.getInstance().updateActivity(activity);
        IronLog.INTERNAL.verbose("activity is updated to: " + activity.hashCode());
    }
}
