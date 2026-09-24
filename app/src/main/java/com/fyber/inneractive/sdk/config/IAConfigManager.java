package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.cache.C7909k;
import com.fyber.inneractive.sdk.config.cellular.C7951a;
import com.fyber.inneractive.sdk.config.global.C7967a;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7985m;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.ignite.C8248h;
import com.fyber.inneractive.sdk.measurement.C8271e;
import com.fyber.inneractive.sdk.network.C8373f;
import com.fyber.inneractive.sdk.network.C8392l0;
import com.fyber.inneractive.sdk.network.C8427v0;
import com.fyber.inneractive.sdk.serverapi.extradata.C9117b;
import com.fyber.inneractive.sdk.serverapi.extradata.C9119d;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9188s1;
import com.fyber.inneractive.sdk.util.C9207y0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.RunnableC9165l;
import com.fyber.inneractive.sdk.web.C9219b1;
import com.fyber.inneractive.sdk.web.RunnableC9216a1;
import com.ironsource.mediationsdk.metadata.C12364a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public class IAConfigManager {

    /* JADX INFO: renamed from: N */
    public static long f17655N;

    /* JADX INFO: renamed from: A */
    public C8427v0 f17657A;

    /* JADX INFO: renamed from: B */
    public C8427v0 f17658B;

    /* JADX INFO: renamed from: C */
    public C7965g f17659C;

    /* JADX INFO: renamed from: D */
    public final C8248h f17660D;

    /* JADX INFO: renamed from: E */
    public final C7909k f17661E;

    /* JADX INFO: renamed from: F */
    public final C8373f f17662F;

    /* JADX INFO: renamed from: G */
    public final HashMap f17663G;

    /* JADX INFO: renamed from: H */
    public final C9119d f17664H;

    /* JADX INFO: renamed from: I */
    public C8271e f17665I;

    /* JADX INFO: renamed from: J */
    public WebView f17666J;

    /* JADX INFO: renamed from: K */
    public final C8006r f17667K;

    /* JADX INFO: renamed from: L */
    public C7951a f17668L;

    /* JADX INFO: renamed from: a */
    public HashMap f17669a = new HashMap();

    /* JADX INFO: renamed from: b */
    public HashMap f17670b = new HashMap();

    /* JADX INFO: renamed from: c */
    public String f17671c;

    /* JADX INFO: renamed from: d */
    public String f17672d;

    /* JADX INFO: renamed from: e */
    public String f17673e;

    /* JADX INFO: renamed from: f */
    public Context f17674f;

    /* JADX INFO: renamed from: g */
    public final CopyOnWriteArrayList f17675g;

    /* JADX INFO: renamed from: h */
    public boolean f17676h;

    /* JADX INFO: renamed from: i */
    public final C8014k0 f17677i;

    /* JADX INFO: renamed from: j */
    public InneractiveUserConfig f17678j;

    /* JADX INFO: renamed from: k */
    public boolean f17679k;

    /* JADX INFO: renamed from: l */
    public String f17680l;

    /* JADX INFO: renamed from: m */
    public InneractiveMediationName f17681m;

    /* JADX INFO: renamed from: n */
    public String f17682n;

    /* JADX INFO: renamed from: o */
    public String f17683o;

    /* JADX INFO: renamed from: p */
    public ArrayList f17684p;

    /* JADX INFO: renamed from: q */
    public boolean f17685q;

    /* JADX INFO: renamed from: r */
    public final C8392l0 f17686r;

    /* JADX INFO: renamed from: s */
    public String f17687s;

    /* JADX INFO: renamed from: t */
    public C8040s f17688t;

    /* JADX INFO: renamed from: u */
    public C8009i f17689u;

    /* JADX INFO: renamed from: v */
    public C8042t f17690v;

    /* JADX INFO: renamed from: w */
    public final C8051x0 f17691w;

    /* JADX INFO: renamed from: x */
    public C9188s1 f17692x;

    /* JADX INFO: renamed from: y */
    public C7967a f17693y;

    /* JADX INFO: renamed from: z */
    public final C9207y0 f17694z;

    /* JADX INFO: renamed from: M */
    public static final IAConfigManager f17654M = new IAConfigManager();

    /* JADX INFO: renamed from: O */
    public static final RunnableC7966g0 f17656O = new RunnableC7966g0();

    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc);
    }

    public IAConfigManager() {
        new HashSet();
        this.f17676h = false;
        this.f17677i = new C8014k0();
        this.f17679k = false;
        this.f17685q = false;
        this.f17686r = new C8392l0();
        this.f17687s = "";
        this.f17691w = new C8051x0();
        this.f17694z = new C9207y0();
        this.f17660D = new C8248h();
        this.f17661E = new C7909k();
        this.f17662F = new C8373f();
        this.f17663G = new HashMap();
        this.f17667K = C8006r.m20431a();
        this.f17675g = new CopyOnWriteArrayList();
        this.f17664H = new C9119d();
    }

    /* JADX INFO: renamed from: a */
    public static void m20375a() {
        IAConfigManager iAConfigManager = f17654M;
        C8427v0 c8427v0 = iAConfigManager.f17657A;
        if (c8427v0 != null) {
            iAConfigManager.f17686r.m20768a(c8427v0);
        }
        C8040s c8040s = iAConfigManager.f17688t;
        if (c8040s.f17864d) {
            return;
        }
        iAConfigManager.f17686r.m20768a(new C8427v0(new C8023p(c8040s), c8040s.f17861a, c8040s.f17865e));
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        f17654M.f17675g.add(onConfigurationReadyAndValidListener);
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m20376b() {
        C9119d c9119d = f17654M.f17664H;
        c9119d.getClass();
        JSONArray jSONArray = (JSONArray) c9119d.m21928a(new JSONArray(), new C9117b());
        if (jSONArray == null) {
            IAlog.m21945a("%sExtra data JSON is empty", "UserExtraDataManager");
            return null;
        }
        IAlog.m21945a("%sReturning extra data JSON objects", "UserExtraDataManager");
        return jSONArray;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m20377c() {
        C7965g c7965g = f17654M.f17659C;
        return c7965g != null && c7965g.m20407f();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m20378d() {
        IAConfigManager iAConfigManager = f17654M;
        boolean z = iAConfigManager.f17673e != null;
        int i = AbstractC8013k.f17788a;
        boolean zBooleanValue = Boolean.valueOf(System.getProperty("ia.testEnvironmentConfiguration.forceConfigRefresh", Boolean.toString(false))).booleanValue();
        if ((z && System.currentTimeMillis() - f17655N > 3600000) || zBooleanValue) {
            if (zBooleanValue) {
                C8040s c8040s = iAConfigManager.f17688t;
                c8040s.f17864d = false;
                AbstractC9183r.f21477a.execute(new RunnableC9165l(c8040s.f17865e));
            }
            m20375a();
            C9219b1 c9219b1 = C9219b1.f21525c;
            c9219b1.getClass();
            AbstractC9183r.f21477a.execute(new RunnableC9216a1(c9219b1));
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public static void m20379e() {
        SharedPreferences sharedPreferences = AbstractC9174o.f21470a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("IAConfigFQE", true).apply();
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m20380f() {
        IAConfigManager iAConfigManager = f17654M;
        Boolean boolMo20420c = ((C7985m) iAConfigManager.f17667K.m20432a(C7985m.class)).mo20420c(C12364a.f31324j);
        boolean zBooleanValue = boolMo20420c != null ? boolMo20420c.booleanValue() : false;
        IAlog.m21945a("OMSDK AB %s", String.valueOf(zBooleanValue));
        if (zBooleanValue) {
            C8271e c8271e = iAConfigManager.f17665I;
            return c8271e == null || !c8271e.f18433a;
        }
        IAlog.m21945a("OM SDK disabled", new Object[0]);
        IAlog.m21948d("OM SDK disabled", new Object[0]);
        return false;
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        f17654M.f17675g.remove(onConfigurationReadyAndValidListener);
    }

    /* JADX INFO: renamed from: a */
    public final void m20381a(Exception exc) {
        for (OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener : this.f17675g) {
            if (onConfigurationReadyAndValidListener != null) {
                boolean z = f17654M.f17673e != null;
                IAlog.m21949e("notifying listener configuration state has been resolved", new Object[0]);
                onConfigurationReadyAndValidListener.onConfigurationReadyAndValid(this, z, !z ? exc : null);
            }
        }
    }
}
