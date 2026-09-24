package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.applovin.impl.AbstractC1618m2;
import com.applovin.impl.AbstractC1660n3;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1714s0;
import com.applovin.impl.AbstractC1776t3;
import com.applovin.impl.AbstractC1793v2;
import com.applovin.impl.AbstractC1821y3;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1483a4;
import com.applovin.impl.C1484a5;
import com.applovin.impl.C1509b3;
import com.applovin.impl.C1511b5;
import com.applovin.impl.C1515c;
import com.applovin.impl.C1521c5;
import com.applovin.impl.C1540e4;
import com.applovin.impl.C1542e6;
import com.applovin.impl.C1545f;
import com.applovin.impl.C1547f1;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1557g1;
import com.applovin.impl.C1583i7;
import com.applovin.impl.C1585j;
import com.applovin.impl.C1594j8;
import com.applovin.impl.C1597k1;
import com.applovin.impl.C1610l4;
import com.applovin.impl.C1619m3;
import com.applovin.impl.C1665n8;
import com.applovin.impl.C1674o7;
import com.applovin.impl.C1684p7;
import com.applovin.impl.C1696q2;
import com.applovin.impl.C1704r0;
import com.applovin.impl.C1707r3;
import com.applovin.impl.C1715s1;
import com.applovin.impl.C1788u6;
import com.applovin.impl.C1791v0;
import com.applovin.impl.C1792v1;
import com.applovin.impl.C1796v5;
import com.applovin.impl.C1803w3;
import com.applovin.impl.C1812x3;
import com.applovin.impl.C1822y4;
import com.applovin.impl.C1831z4;
import com.applovin.impl.SharedPreferencesOnSharedPreferenceChangeListenerC1523c7;
import com.applovin.impl.mediation.C1648d;
import com.applovin.impl.mediation.C1652e;
import com.applovin.impl.mediation.C1653f;
import com.applovin.impl.mediation.C1654g;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.C1763b;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.l */
/* JADX INFO: loaded from: classes3.dex */
public class C1748l {

    /* JADX INFO: renamed from: E0 */
    public static C1748l f3003E0;

    /* JADX INFO: renamed from: F0 */
    protected static Context f3004F0;

    /* JADX INFO: renamed from: G0 */
    private static boolean f3005G0;

    /* JADX INFO: renamed from: I0 */
    private static final boolean f3007I0;

    /* JADX INFO: renamed from: J0 */
    private static volatile C1515c f3008J0;

    /* JADX INFO: renamed from: A0 */
    private AppLovinSdk.SdkInitializationListener f3011A0;

    /* JADX INFO: renamed from: B0 */
    private AppLovinSdk.SdkInitializationListener f3013B0;

    /* JADX INFO: renamed from: a */
    private String f3040a;

    /* JADX INFO: renamed from: b */
    private String f3042b;

    /* JADX INFO: renamed from: c */
    private WeakReference f3044c;

    /* JADX INFO: renamed from: d */
    private final long f3046d;

    /* JADX INFO: renamed from: e */
    private long f3048e;

    /* JADX INFO: renamed from: f */
    private long f3050f;

    /* JADX INFO: renamed from: g */
    private Long f3052g;

    /* JADX INFO: renamed from: h */
    private long f3054h;

    /* JADX INFO: renamed from: j */
    private final AppLovinSdkSettings f3058j;

    /* JADX INFO: renamed from: j0 */
    private C1652e f3059j0;

    /* JADX INFO: renamed from: k */
    private MaxSegmentCollection f3060k;

    /* JADX INFO: renamed from: l */
    private String f3062l;

    /* JADX INFO: renamed from: m0 */
    private List f3065m0;

    /* JADX INFO: renamed from: q */
    private volatile AppLovinSdk f3072q;

    /* JADX INFO: renamed from: r0 */
    private boolean f3075r0;

    /* JADX INFO: renamed from: w0 */
    private String f3085w0;

    /* JADX INFO: renamed from: x0 */
    private AppLovinSdkInitializationConfiguration f3087x0;

    /* JADX INFO: renamed from: K0 */
    private static final Object f3009K0 = new Object();

    /* JADX INFO: renamed from: H0 */
    private static final long f3006H0 = System.currentTimeMillis();

    /* JADX INFO: renamed from: i */
    private final AtomicBoolean f3056i = new AtomicBoolean();

    /* JADX INFO: renamed from: m */
    private final AtomicReference f3064m = new AtomicReference();

    /* JADX INFO: renamed from: n */
    private final AtomicReference f3066n = new AtomicReference();

    /* JADX INFO: renamed from: o */
    private final AtomicReference f3068o = new AtomicReference();

    /* JADX INFO: renamed from: p */
    private final AtomicReference f3070p = new AtomicReference();

    /* JADX INFO: renamed from: r */
    private final C1768p f3074r = new C1768p(this);

    /* JADX INFO: renamed from: s */
    private final C1545f f3076s = new C1545f(this);

    /* JADX INFO: renamed from: t */
    private final C1509b3 f3078t = new C1509b3(this);

    /* JADX INFO: renamed from: u */
    private final C1715s1 f3080u = new C1715s1(this);

    /* JADX INFO: renamed from: v */
    private final C1674o7 f3082v = new C1674o7(this);

    /* JADX INFO: renamed from: w */
    private final AtomicReference f3084w = new AtomicReference();

    /* JADX INFO: renamed from: x */
    private final AtomicReference f3086x = new AtomicReference();

    /* JADX INFO: renamed from: y */
    private final AtomicReference f3088y = new AtomicReference();

    /* JADX INFO: renamed from: z */
    private final AtomicReference f3090z = new AtomicReference();

    /* JADX INFO: renamed from: A */
    private final AtomicReference f3010A = new AtomicReference();

    /* JADX INFO: renamed from: B */
    private final AtomicReference f3012B = new AtomicReference();

    /* JADX INFO: renamed from: C */
    private final AtomicReference f3014C = new AtomicReference();

    /* JADX INFO: renamed from: D */
    private final AtomicReference f3016D = new AtomicReference();

    /* JADX INFO: renamed from: E */
    private final AtomicReference f3018E = new AtomicReference();

    /* JADX INFO: renamed from: F */
    private final AtomicReference f3019F = new AtomicReference();

    /* JADX INFO: renamed from: G */
    private final AtomicReference f3020G = new AtomicReference();

    /* JADX INFO: renamed from: H */
    private final AtomicReference f3021H = new AtomicReference();

    /* JADX INFO: renamed from: I */
    private final AtomicReference f3022I = new AtomicReference();

    /* JADX INFO: renamed from: J */
    private final AtomicReference f3023J = new AtomicReference();

    /* JADX INFO: renamed from: K */
    private final AtomicReference f3024K = new AtomicReference();

    /* JADX INFO: renamed from: L */
    private final AtomicReference f3025L = new AtomicReference();

    /* JADX INFO: renamed from: M */
    private final AtomicReference f3026M = new AtomicReference();

    /* JADX INFO: renamed from: N */
    private final AtomicReference f3027N = new AtomicReference();

    /* JADX INFO: renamed from: O */
    private final AtomicReference f3028O = new AtomicReference();

    /* JADX INFO: renamed from: P */
    private final AtomicReference f3029P = new AtomicReference();

    /* JADX INFO: renamed from: Q */
    private final AtomicReference f3030Q = new AtomicReference();

    /* JADX INFO: renamed from: R */
    private final AtomicReference f3031R = new AtomicReference();

    /* JADX INFO: renamed from: S */
    private final AtomicReference f3032S = new AtomicReference();

    /* JADX INFO: renamed from: T */
    private final AtomicReference f3033T = new AtomicReference();

    /* JADX INFO: renamed from: U */
    private final AtomicReference f3034U = new AtomicReference();

    /* JADX INFO: renamed from: V */
    private final AtomicReference f3035V = new AtomicReference();

    /* JADX INFO: renamed from: W */
    private final AtomicReference f3036W = new AtomicReference();

    /* JADX INFO: renamed from: X */
    private final AtomicReference f3037X = new AtomicReference();

    /* JADX INFO: renamed from: Y */
    private final AtomicReference f3038Y = new AtomicReference();

    /* JADX INFO: renamed from: Z */
    private final AtomicReference f3039Z = new AtomicReference();

    /* JADX INFO: renamed from: a0 */
    private final AtomicReference f3041a0 = new AtomicReference();

    /* JADX INFO: renamed from: b0 */
    private final AtomicReference f3043b0 = new AtomicReference();

    /* JADX INFO: renamed from: c0 */
    private final AtomicReference f3045c0 = new AtomicReference();

    /* JADX INFO: renamed from: d0 */
    private final AtomicReference f3047d0 = new AtomicReference();

    /* JADX INFO: renamed from: e0 */
    private final AtomicReference f3049e0 = new AtomicReference();

    /* JADX INFO: renamed from: f0 */
    private final AtomicReference f3051f0 = new AtomicReference();

    /* JADX INFO: renamed from: g0 */
    private final AtomicReference f3053g0 = new AtomicReference();

    /* JADX INFO: renamed from: h0 */
    private final AtomicReference f3055h0 = new AtomicReference();

    /* JADX INFO: renamed from: i0 */
    private final AtomicReference f3057i0 = new AtomicReference();

    /* JADX INFO: renamed from: k0 */
    private final AtomicReference f3061k0 = new AtomicReference();

    /* JADX INFO: renamed from: l0 */
    private final AtomicReference f3063l0 = new AtomicReference();

    /* JADX INFO: renamed from: n0 */
    private final Object f3067n0 = new Object();

    /* JADX INFO: renamed from: o0 */
    private final AtomicBoolean f3069o0 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: p0 */
    private final AtomicBoolean f3071p0 = new AtomicBoolean();

    /* JADX INFO: renamed from: q0 */
    private final AtomicBoolean f3073q0 = new AtomicBoolean();

    /* JADX INFO: renamed from: s0 */
    private boolean f3077s0 = false;

    /* JADX INFO: renamed from: t0 */
    private boolean f3079t0 = false;

    /* JADX INFO: renamed from: u0 */
    private boolean f3081u0 = false;

    /* JADX INFO: renamed from: v0 */
    private int f3083v0 = 0;

    /* JADX INFO: renamed from: y0 */
    private final Object f3089y0 = new Object();

    /* JADX INFO: renamed from: z0 */
    private SdkConfigurationImpl f3091z0 = new SdkConfigurationImpl(this);

    /* JADX INFO: renamed from: C0 */
    private final AbstractRunnableC1601k5 f3015C0 = new C1788u6(this, true, "scheduleAdLoadIntegrationError", new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda4
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.m4719M0();
        }
    });

    /* JADX INFO: renamed from: D0 */
    private final AbstractRunnableC1601k5 f3017D0 = new C1788u6(this, true, "sdkInit", new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda5
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.m4720N0();
        }
    });

    /* JADX INFO: renamed from: com.applovin.impl.sdk.l$a */
    class a implements C1796v5.b {
        a() {
        }

        @Override // com.applovin.impl.C1796v5.b
        /* JADX INFO: renamed from: a */
        public void mo4868a(JSONObject jSONObject) {
            boolean zIsValid = JsonUtils.isValid(jSONObject);
            C1748l.this.m4748c(jSONObject);
            if (((Boolean) C1748l.this.m4801a(AbstractC1776t3.f3351g8)).booleanValue()) {
                C1748l c1748l = C1748l.this;
                c1748l.f3059j0 = new C1652e(c1748l);
            }
            C1748l.this.m4844n().m4686a();
            AbstractC1714s0.m4313a(jSONObject, zIsValid, C1748l.this);
            Boolean bool = JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE);
            C1748l.this.m4792W().m4194a(bool.booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            C1748l.this.m4764E().m4335b();
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "default_browser_package_name", StringUtils.emptyIfNull(C1749m.m4875J()));
            JsonUtils.putBoolean(jSONObject2, "init_success", zIsValid);
            JsonUtils.putInt(jSONObject2, "default_preferences_key_count", PreferenceManager.getDefaultSharedPreferences(C1748l.f3004F0).getAll().size());
            C1748l.this.m4863x0().m2682d(C1548f2.f1529f, CollectionUtils.map("details", jSONObject2.toString()));
            C1748l c1748l2 = C1748l.this;
            c1748l2.f3065m0 = c1748l2.m4733a(jSONObject);
            if (zIsValid) {
                C1748l.this.f3091z0.setEnabledAmazonAdUnitIds(CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", "")));
            }
            C1748l.this.m4857u0().m2926a(jSONObject);
            C1748l.this.m4743b(jSONObject);
            AbstractC1793v2.m5430b(((Boolean) C1748l.this.m4801a(C1831z4.f4089y6)).booleanValue());
            AbstractC1793v2.m5399a(((Boolean) C1748l.this.m4801a(C1831z4.f4097z6)).booleanValue());
            C1748l.this.m4722R0();
            if (!((Boolean) C1748l.this.m4801a(C1831z4.f3934g3)).booleanValue() || zIsValid || !AbstractC1714s0.m4316a(C1748l.m4756p())) {
                C1748l.this.m4721P0();
                return;
            }
            C1748l.this.m4782Q();
            if (C1768p.m5160a()) {
                C1748l.this.m4782Q().m5175d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            C1748l.this.m4723U0();
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.l$b */
    class b implements C1791v0.c {
        b() {
        }

        @Override // com.applovin.impl.C1791v0.c
        /* JADX INFO: renamed from: a */
        public void mo4869a(C1791v0.b bVar) {
            C1748l.this.m4782Q();
            if (C1768p.m5160a()) {
                C1748l.this.m4782Q().m5171a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + bVar);
            }
            C1748l.this.f3073q0.set(bVar.m5358b());
            if (!bVar.m5357a()) {
                C1748l.this.m4747c("Initializing SDK in MAX environment...");
                return;
            }
            C1748l.this.m4782Q();
            if (C1768p.m5160a()) {
                C1748l.this.m4782Q().m5171a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
            }
            C1748l.this.m4788T0();
            C1748l.this.m4786S0();
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.l$c */
    class c implements C1796v5.b {
        c() {
        }

        @Override // com.applovin.impl.C1796v5.b
        /* JADX INFO: renamed from: a */
        public void mo4868a(JSONObject jSONObject) {
            C1748l.this.m4748c(jSONObject);
            C1748l.this.f3056i.set(false);
            C1748l.this.m4721P0();
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.l$d */
    class d implements C1483a4.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1483a4 f3095a;

        d(C1483a4 c1483a4) {
            this.f3095a = c1483a4;
        }

        @Override // com.applovin.impl.C1483a4.a
        /* JADX INFO: renamed from: a */
        public void mo1869a() {
            C1748l.this.m4782Q();
            if (C1768p.m5160a()) {
                C1748l.this.m4782Q().m5175d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (C1748l.this.f3067n0) {
                if (!C1748l.this.f3075r0) {
                    C1748l.this.m4788T0();
                }
            }
            this.f3095a.m1868b(this);
        }

        @Override // com.applovin.impl.C1483a4.a
        /* JADX INFO: renamed from: b */
        public void mo1870b() {
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1701q7.m4091c();
                }
            });
            f3007I0 = true;
        } catch (Throwable unused) {
            f3007I0 = false;
        }
    }

    public C1748l(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.f3075r0 = false;
        f3003E0 = this;
        this.f3058j = appLovinSdkSettings;
        this.f3046d = System.currentTimeMillis();
        this.f3075r0 = true;
        if (!m4716H0()) {
            throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://support.axon.ai/en/max/android/overview/integration");
        }
        f3004F0 = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f3044c = new WeakReference((Activity) context);
        }
    }

    /* JADX INFO: renamed from: C0 */
    private void m4715C0() {
        Context context = f3004F0;
        C1768p c1768pM4782Q = m4782Q();
        C1521c5 c1521c5M4851r0 = m4851r0();
        C1791v0 c1791v0M4864y = m4864y();
        m4725a(context);
        m4846o0();
        m4838k();
        m4827e0();
        m4789U().m3510a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.m4413a(this);
        String str = this.f3040a;
        if (str == null || str.length() != 86) {
            C1768p.m5167h("AppLovinSdk", "SDK key provided is invalid (" + this.f3040a + "). Expected length: 86 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (StringUtils.isValidString(this.f3042b) && this.f3042b.length() != 36) {
            String str2 = "Axon event key length " + this.f3042b + " is invalid - expected 36";
            if (AbstractC1701q7.m4092c(this)) {
                throw new IllegalArgumentException(str2);
            }
            C1768p.m5167h("AppLovinSdk", str2);
        }
        if (c1791v0M4864y.m5352l()) {
            String str3 = "Terms Flow has been replaced. " + c1791v0M4864y.m5347g();
            if (AbstractC1701q7.m4092c(this)) {
                throw new IllegalStateException(str3);
            }
            C1768p.m5167h("AppLovinSdk", str3);
        }
        if (AbstractC1701q7.m4114j()) {
            C1768p.m5167h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!AbstractC1701q7.m4082b(this)) {
            C1768p.m5167h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (AbstractC1701q7.m4120m(context)) {
            this.f3058j.setVerboseLogging(true);
        }
        m4849q0().m1876a(C1831z4.f3966k, Boolean.valueOf(this.f3058j.isVerboseLoggingEnabled()));
        AbstractC1821y3.m5710e(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        C1511b5 c1511b5 = C1511b5.f1163c;
        if (TextUtils.isEmpty((String) c1521c5M4851r0.m2210a(c1511b5, (Object) null, defaultSharedPreferences))) {
            this.f3079t0 = true;
            c1521c5M4851r0.m2216b(c1511b5, Boolean.toString(true), defaultSharedPreferences);
        } else {
            c1521c5M4851r0.m2216b(c1511b5, Boolean.toString(false), defaultSharedPreferences);
        }
        C1511b5 c1511b6 = C1511b5.f1164d;
        if (((Boolean) c1521c5M4851r0.m2209a(c1511b6, Boolean.FALSE)).booleanValue()) {
            if (C1768p.m5160a()) {
                c1768pM4782Q.m5171a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f3081u0 = true;
        } else {
            if (C1768p.m5160a()) {
                c1768pM4782Q.m5171a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            c1521c5M4851r0.m2215b(c1511b6, Boolean.TRUE);
            c1521c5M4851r0.m2215b(C1511b5.f1180t, Boolean.valueOf(c1791v0M4864y.m5350j()));
        }
        C1511b5 c1511b7 = C1511b5.f1165e;
        this.f3050f = ((Long) c1521c5M4851r0.m2209a(c1511b7, 0L)).longValue() + 1;
        m4851r0().m2215b(c1511b7, Long.valueOf(this.f3050f));
        C1511b5 c1511b8 = C1511b5.f1166f;
        this.f3052g = (Long) c1521c5M4851r0.m2209a(c1511b8, null);
        m4851r0().m2215b(c1511b8, Long.valueOf(f3006H0));
        C1511b5 c1511b9 = C1511b5.f1167g;
        String str4 = (String) c1521c5M4851r0.m2209a(c1511b9, null);
        if (StringUtils.isValidString(str4)) {
            if (AppLovinSdk.VERSION_CODE > AbstractC1701q7.m4108g(str4)) {
                c1521c5M4851r0.m2215b(c1511b9, AppLovinSdk.VERSION);
            }
        } else {
            c1521c5M4851r0.m2215b(c1511b9, AppLovinSdk.VERSION);
        }
        m4863x0().m2682d(C1548f2.f1526e, CollectionUtils.map("details", "isInitProviderContextSet=" + f3005G0));
    }

    /* JADX INFO: renamed from: H0 */
    public static boolean m4716H0() {
        return f3007I0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public /* synthetic */ void m4717K0() {
        if (m4853s0().m2614f()) {
            return;
        }
        m4782Q();
        if (C1768p.m5160a()) {
            m4782Q().m5171a("AppLovinSdk", "Timing out adapters init...");
        }
        m4853s0().m2615g();
        m4819b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m4718L0() {
        C1552f6 c1552f6M4853s0 = m4853s0();
        int i = this.f3083v0 + 1;
        this.f3083v0 = i;
        c1552f6M4853s0.m2604a((AbstractRunnableC1601k5) new C1796v5(i, this, new c()), C1552f6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public /* synthetic */ void m4719M0() {
        if (m4772I0()) {
            AbstractC1618m2.m3178b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m4720N0() {
        synchronized (this.f3067n0) {
            boolean zM4316a = AbstractC1714s0.m4316a(m4756p());
            if (!m4772I0()) {
                m4782Q();
                if (C1768p.m5160a()) {
                    m4782Q().m5171a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + m4794X());
                }
            }
            if (!((Boolean) m4801a(C1831z4.f3943h3)).booleanValue() || zM4316a) {
                m4788T0();
            }
            if (((Boolean) m4801a(C1831z4.f3934g3)).booleanValue() && !zM4316a) {
                m4782Q();
                if (C1768p.m5160a()) {
                    m4782Q().m5175d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                }
                m4723U0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public void m4721P0() {
        Long l = (Long) m4801a(C1831z4.f4014p3);
        if (l.longValue() >= 0 && this.f3056i.compareAndSet(false, true)) {
            C1594j8.m3027a(l.longValue(), false, this, new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m4718L0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public void m4722R0() {
        if (!m4772I0()) {
            m4747c("Initializing SDK in non-MAX environment...");
            return;
        }
        if (!this.f3071p0.compareAndSet(false, true)) {
            m4747c("Consent flow is already shown. Initializing SDK in MAX environment...");
        } else if (!m4864y().m5350j()) {
            m4747c("Consent flow is not enabled. Initializing SDK in MAX environment...");
        } else {
            m4864y().m5342a(m4861w0(), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public void m4723U0() {
        C1483a4 c1483a4M4827e0 = m4827e0();
        c1483a4M4827e0.m1867a(new d(c1483a4M4827e0));
    }

    /* JADX INFO: renamed from: Y */
    private Map m4724Y() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) m4801a(C1831z4.f3989m4)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1515c m4725a(Context context) {
        if (f3008J0 == null) {
            synchronized (f3009K0) {
                if (f3008J0 == null) {
                    f3008J0 = new C1515c(context);
                }
            }
        }
        return f3008J0;
    }

    /* JADX INFO: renamed from: a */
    public static String m4728a(int i) {
        return m4729a(i, (List) null);
    }

    /* JADX INFO: renamed from: a */
    public static String m4729a(int i, List list) {
        String string = m4756p().getResources().getString(i);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    /* JADX INFO: renamed from: a */
    public static String m4730a(String str) {
        return m4731a(str, (List) null);
    }

    /* JADX INFO: renamed from: a */
    public static String m4731a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context contextM4756p = m4756p();
        return m4729a(contextM4756p.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, contextM4756p.getPackageName()), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public List m4733a(JSONObject jSONObject) {
        List listAsList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(listAsList.size());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            MaxAdFormat fromString = MaxAdFormat.formatFromString((String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m4736a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f3091z0);
    }

    /* JADX INFO: renamed from: b */
    public static void m4739b(Context context) {
        if (context == null) {
            return;
        }
        f3004F0 = context.getApplicationContext();
        f3005G0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m4740b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        m4782Q();
        if (C1768p.m5160a()) {
            m4782Q().m5171a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.f3091z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m4737a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        m4715C0();
        this.f3058j.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            C1768p.m5166g("AppLovinSdk", "Setting plugin version: " + pluginVersion);
            m4849q0().m1876a(C1831z4.f3794P3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) m4801a(C1831z4.f4034s)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        C1552f6 c1552f6M4853s0 = m4853s0();
        AbstractRunnableC1601k5 abstractRunnableC1601k5 = this.f3015C0;
        C1552f6.b bVar = C1552f6.b.CORE;
        c1552f6M4853s0.m2604a(abstractRunnableC1601k5, bVar);
        m4853s0().m2604a(this.f3017D0, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m4742b(String str) {
        if (AbstractC1701q7.m4092c(this)) {
            throw new IllegalStateException(str);
        }
        HashMap map = new HashMap();
        map.put("details", "admob");
        map.put("error_message", str);
        m4764E().m2678a(C1548f2.f1515Z0, "adapterVersionMismatch", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m4743b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.EMPTY_LIST).iterator();
        while (it.hasNext()) {
            C1768p.m5167h("AppLovinSdk", (String) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m4747c(String str) {
        m4782Q();
        if (C1768p.m5160a()) {
            m4782Q().m5171a("AppLovinSdk", str);
        }
        m4853s0().m2603a(new C1542e6(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m4748c(JSONObject jSONObject) {
        if (JsonUtils.isValid(jSONObject)) {
            this.f3054h = System.currentTimeMillis();
            AbstractC1714s0.m4323c(jSONObject, this);
            AbstractC1714s0.m4321b(jSONObject, this);
            AbstractC1714s0.m4312a(jSONObject, this);
            AbstractC1660n3.m3623f(jSONObject, this);
            AbstractC1660n3.m3621d(jSONObject, this);
            AbstractC1660n3.m3622e(jSONObject, this);
            AbstractC1660n3.m3624g(jSONObject, this);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m4750d() {
        C1552f6 c1552f6M4853s0 = m4853s0();
        int i = this.f3083v0 + 1;
        this.f3083v0 = i;
        c1552f6M4853s0.m2604a((AbstractRunnableC1601k5) new C1796v5(i, this, new a()), C1552f6.b.CORE);
    }

    /* JADX INFO: renamed from: o */
    public static long m4755o() {
        return f3006H0;
    }

    /* JADX INFO: renamed from: p */
    public static Context m4756p() {
        return f3004F0;
    }

    /* JADX INFO: renamed from: A */
    public C1557g1 m4757A() {
        Object c1557g1 = this.f3034U.get();
        if (c1557g1 == null) {
            synchronized (this.f3034U) {
                c1557g1 = this.f3034U.get();
                if (c1557g1 == null) {
                    c1557g1 = new C1557g1(this);
                    this.f3034U.set(c1557g1);
                }
            }
        }
        if (c1557g1 == this.f3034U) {
            c1557g1 = null;
        }
        return (C1557g1) c1557g1;
    }

    /* JADX INFO: renamed from: A0 */
    public AppLovinSdk m4758A0() {
        return this.f3072q;
    }

    /* JADX INFO: renamed from: B */
    public C1749m m4759B() {
        Object c1749m = this.f3010A.get();
        if (c1749m == null) {
            synchronized (this.f3010A) {
                c1749m = this.f3010A.get();
                if (c1749m == null) {
                    c1749m = new C1749m(this);
                    this.f3010A.set(c1749m);
                }
            }
        }
        if (c1749m == this.f3010A) {
            c1749m = null;
        }
        return (C1749m) c1749m;
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m4760B0() {
        return this.f3081u0;
    }

    /* JADX INFO: renamed from: C */
    public C1597k1 m4761C() {
        Object c1597k1 = this.f3016D.get();
        if (c1597k1 == null) {
            synchronized (this.f3016D) {
                c1597k1 = this.f3016D.get();
                if (c1597k1 == null) {
                    c1597k1 = new C1597k1(this);
                    this.f3016D.set(c1597k1);
                }
            }
        }
        if (c1597k1 == this.f3016D) {
            c1597k1 = null;
        }
        return (C1597k1) c1597k1;
    }

    /* JADX INFO: renamed from: D */
    public String m4762D() {
        return this.f3085w0;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m4763D0() {
        boolean z;
        synchronized (this.f3067n0) {
            z = this.f3077s0;
        }
        return z;
    }

    /* JADX INFO: renamed from: E */
    public C1715s1 m4764E() {
        return this.f3080u;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m4765E0() {
        return this.f3079t0;
    }

    /* JADX INFO: renamed from: F */
    public String m4766F() {
        return m4865y0().m3897d();
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m4767F0() {
        boolean z;
        synchronized (this.f3089y0) {
            z = this.f3087x0 != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: G */
    public EventServiceImpl m4768G() {
        Object eventServiceImpl = this.f3068o.get();
        if (eventServiceImpl == null) {
            synchronized (this.f3068o) {
                eventServiceImpl = this.f3068o.get();
                if (eventServiceImpl == null) {
                    eventServiceImpl = new EventServiceImpl(this);
                    this.f3068o.set(eventServiceImpl);
                }
            }
        }
        if (eventServiceImpl == this.f3068o) {
            eventServiceImpl = null;
        }
        return (EventServiceImpl) eventServiceImpl;
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m4769G0() {
        boolean z;
        synchronized (this.f3067n0) {
            z = this.f3075r0;
        }
        return z;
    }

    /* JADX INFO: renamed from: H */
    public C1792v1 m4770H() {
        Object c1792v1 = this.f3061k0.get();
        if (c1792v1 == null) {
            synchronized (this.f3061k0) {
                c1792v1 = this.f3061k0.get();
                if (c1792v1 == null) {
                    c1792v1 = new C1792v1(this);
                    this.f3061k0.set(c1792v1);
                }
            }
        }
        if (c1792v1 == this.f3061k0) {
            c1792v1 = null;
        }
        return (C1792v1) c1792v1;
    }

    /* JADX INFO: renamed from: I */
    public C1750n m4771I() {
        Object c1750n = this.f3020G.get();
        if (c1750n == null) {
            synchronized (this.f3020G) {
                c1750n = this.f3020G.get();
                if (c1750n == null) {
                    c1750n = new C1750n(this);
                    this.f3020G.set(c1750n);
                }
            }
        }
        if (c1750n == this.f3020G) {
            c1750n = null;
        }
        return (C1750n) c1750n;
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m4772I0() {
        return StringUtils.containsIgnoreCase(m4794X(), "max");
    }

    /* JADX INFO: renamed from: J */
    public C1767o m4773J() {
        Object c1767o = this.f3022I.get();
        if (c1767o == null) {
            synchronized (this.f3022I) {
                c1767o = this.f3022I.get();
                if (c1767o == null) {
                    c1767o = new C1767o(this);
                    this.f3022I.set(c1767o);
                }
            }
        }
        if (c1767o == this.f3022I) {
            c1767o = null;
        }
        return (C1767o) c1767o;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m4774J0() {
        return AbstractC1701q7.m4066a("com.unity3d.player.UnityPlayerActivity");
    }

    /* JADX INFO: renamed from: K */
    public Activity m4775K() {
        WeakReference weakReference;
        if (!((Boolean) m4801a(C1831z4.f3683B4)).booleanValue() || (weakReference = this.f3044c) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    /* JADX INFO: renamed from: L */
    public AppLovinSdkInitializationConfiguration m4776L() {
        return this.f3087x0;
    }

    /* JADX INFO: renamed from: M */
    public long m4777M() {
        return this.f3046d;
    }

    /* JADX INFO: renamed from: N */
    public Long m4778N() {
        return this.f3052g;
    }

    /* JADX INFO: renamed from: O */
    public long m4779O() {
        return this.f3050f;
    }

    /* JADX INFO: renamed from: O0 */
    protected void m4780O0() {
        m4819b(false);
    }

    /* JADX INFO: renamed from: P */
    public C1696q2 m4781P() {
        Object c1696q2 = this.f3038Y.get();
        if (c1696q2 == null) {
            synchronized (this.f3038Y) {
                c1696q2 = this.f3038Y.get();
                if (c1696q2 == null) {
                    c1696q2 = new C1696q2(this);
                    this.f3038Y.set(c1696q2);
                }
            }
        }
        if (c1696q2 == this.f3038Y) {
            c1696q2 = null;
        }
        return (C1696q2) c1696q2;
    }

    /* JADX INFO: renamed from: Q */
    public C1768p m4782Q() {
        return this.f3074r;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m4783Q0() {
        if (StringUtils.isValidString(this.f3062l)) {
            return;
        }
        this.f3062l = "max";
    }

    /* JADX INFO: renamed from: R */
    public C1509b3 m4784R() {
        return this.f3078t;
    }

    /* JADX INFO: renamed from: S */
    public C1648d m4785S() {
        Object c1648d = this.f3057i0.get();
        if (c1648d == null) {
            synchronized (this.f3057i0) {
                c1648d = this.f3057i0.get();
                if (c1648d == null) {
                    c1648d = new C1648d(this);
                    this.f3057i0.set(c1648d);
                }
            }
        }
        if (c1648d == this.f3057i0) {
            c1648d = null;
        }
        return (C1648d) c1648d;
    }

    /* JADX INFO: renamed from: S0 */
    public void m4786S0() {
        m4856u().m4701a();
    }

    /* JADX INFO: renamed from: T */
    public C1652e m4787T() {
        return this.f3059j0;
    }

    /* JADX INFO: renamed from: T0 */
    public void m4788T0() {
        synchronized (this.f3067n0) {
            this.f3075r0 = true;
            m4853s0().m2616h();
            m4750d();
        }
    }

    /* JADX INFO: renamed from: U */
    public C1653f m4789U() {
        Object c1653f = this.f3047d0.get();
        if (c1653f == null) {
            synchronized (this.f3047d0) {
                c1653f = this.f3047d0.get();
                if (c1653f == null) {
                    c1653f = new C1653f(this);
                    this.f3047d0.set(c1653f);
                }
            }
        }
        if (c1653f == this.f3047d0) {
            c1653f = null;
        }
        return (C1653f) c1653f;
    }

    /* JADX INFO: renamed from: V */
    public C1654g m4790V() {
        Object c1654g = this.f3045c0.get();
        if (c1654g == null) {
            synchronized (this.f3045c0) {
                c1654g = this.f3045c0.get();
                if (c1654g == null) {
                    c1654g = new C1654g(this);
                    this.f3045c0.set(c1654g);
                }
            }
        }
        if (c1654g == this.f3045c0) {
            c1654g = null;
        }
        return (C1654g) c1654g;
    }

    /* JADX INFO: renamed from: V0 */
    public void m4791V0() {
        C1768p.m5167h("AppLovinSdk", "Resetting SDK state...");
        m4849q0().m1875a();
        m4849q0().m1881e();
        if (this.f3069o0.compareAndSet(true, false)) {
            m4788T0();
        } else {
            this.f3069o0.set(true);
        }
    }

    /* JADX INFO: renamed from: W */
    public C1707r3 m4792W() {
        Object c1707r3 = this.f3053g0.get();
        if (c1707r3 == null) {
            synchronized (this.f3053g0) {
                c1707r3 = this.f3053g0.get();
                if (c1707r3 == null) {
                    c1707r3 = new C1707r3(this);
                    this.f3053g0.set(c1707r3);
                }
            }
        }
        if (c1707r3 == this.f3053g0) {
            c1707r3 = null;
        }
        return (C1707r3) c1707r3;
    }

    /* JADX INFO: renamed from: W0 */
    public void m4793W0() {
        if (StringUtils.isValidString(this.f3085w0)) {
            return;
        }
        this.f3085w0 = "max";
        m4782Q();
        if (C1768p.m5160a()) {
            m4782Q().m5171a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    /* JADX INFO: renamed from: X */
    public String m4794X() {
        return this.f3062l;
    }

    /* JADX INFO: renamed from: X0 */
    public void m4795X0() {
        m4866z().m2564n();
    }

    /* JADX INFO: renamed from: Y0 */
    public void m4796Y0() {
        m4810a((Map) null);
    }

    /* JADX INFO: renamed from: Z */
    public MediationServiceImpl m4797Z() {
        Object mediationServiceImpl = this.f3049e0.get();
        if (mediationServiceImpl == null) {
            synchronized (this.f3049e0) {
                mediationServiceImpl = this.f3049e0.get();
                if (mediationServiceImpl == null) {
                    mediationServiceImpl = new MediationServiceImpl(this);
                    this.f3049e0.set(mediationServiceImpl);
                }
            }
        }
        if (mediationServiceImpl == this.f3049e0) {
            mediationServiceImpl = null;
        }
        return (MediationServiceImpl) mediationServiceImpl;
    }

    /* JADX INFO: renamed from: Z0 */
    public void m4798Z0() {
        if ("admob".equalsIgnoreCase(this.f3062l) && ((Boolean) m4801a(C1831z4.f3802Q3)).booleanValue()) {
            String str = (String) m4801a(C1831z4.f3794P3);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            String str2 = AppLovinSdk.VERSION;
            sb.append(str2);
            sb.append(".");
            if (str.startsWith(sb.toString())) {
                return;
            }
            final String str3 = "Mismatched AdMob adapter (" + str + ") and AppLovin SDK (" + str2 + ") versions detected, which may cause compatibility issues.";
            C1768p.m5167h("AppLovinSdk", str3);
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m4742b(str3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m4799a(C1511b5 c1511b5) {
        return m4800a(c1511b5, (Object) null);
    }

    /* JADX INFO: renamed from: a */
    public Object m4800a(C1511b5 c1511b5, Object obj) {
        return m4851r0().m2209a(c1511b5, obj);
    }

    /* JADX INFO: renamed from: a */
    public Object m4801a(C1831z4 c1831z4) {
        return m4849q0().m1874a(c1831z4);
    }

    /* JADX INFO: renamed from: a */
    public Object m4802a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return C1521c5.m2203a(str, obj, cls, sharedPreferences);
    }

    /* JADX INFO: renamed from: a */
    public void m4803a() {
        String str = (String) m4851r0().m2209a(C1511b5.f1167g, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < AbstractC1701q7.m4108g(str)) {
                C1768p.m5167h("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4804a(SharedPreferences sharedPreferences) {
        m4851r0().m2211a(sharedPreferences);
    }

    /* JADX INFO: renamed from: a */
    public void m4805a(Uri uri) {
        m4761C().m3047a(uri);
    }

    /* JADX INFO: renamed from: a */
    public void m4806a(C1619m3 c1619m3) {
        if (m4853s0().m2614f()) {
            return;
        }
        List listM5698a = AbstractC1821y3.m5698a(this);
        if (listM5698a.size() <= 0 || !m4789U().m3507a().containsAll(listM5698a)) {
            return;
        }
        m4782Q();
        if (C1768p.m5160a()) {
            m4782Q().m5171a("AppLovinSdk", "All required adapters initialized");
        }
        m4853s0().m2615g();
        m4780O0();
    }

    /* JADX INFO: renamed from: a */
    public void m4807a(AppLovinSdk appLovinSdk) {
        this.f3072q = appLovinSdk;
    }

    /* JADX INFO: renamed from: a */
    public void m4808a(final AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        synchronized (this.f3089y0) {
            if (this.f3087x0 != null) {
                C1768p.m5167h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.f3087x0 + ". Ignoring the provided initialization configuration.");
                if (!m4763D0() || sdkInitializationListener == null) {
                    return;
                }
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m4736a(sdkInitializationListener);
                    }
                });
                return;
            }
            this.f3048e = System.currentTimeMillis();
            this.f3087x0 = appLovinSdkInitializationConfiguration;
            this.f3011A0 = sdkInitializationListener;
            if (C1768p.m5160a()) {
                C1768p c1768p = this.f3074r;
                StringBuilder sb = new StringBuilder("Initializing with configuration: ");
                sb.append(this.f3087x0);
                sb.append(", listener: ");
                sb.append(this.f3011A0 != null ? "configured" : "none");
                c1768p.m5171a("AppLovinSdk", sb.toString());
            }
            this.f3040a = appLovinSdkInitializationConfiguration.getSdkKey();
            this.f3042b = appLovinSdkInitializationConfiguration.getAxonEventKey();
            this.f3062l = appLovinSdkInitializationConfiguration.getMediationProvider();
            this.f3060k = appLovinSdkInitializationConfiguration.getSegmentCollection();
            AbstractC1701q7.m4051a(new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m4737a(appLovinSdkInitializationConfiguration);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4809a(String str, Object obj, SharedPreferences.Editor editor) {
        m4851r0().m2212a(str, obj, editor);
    }

    /* JADX INFO: renamed from: a */
    public void m4810a(Map map) {
        m4792W().m4193a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m4811a(boolean z) {
        synchronized (this.f3067n0) {
            this.f3075r0 = false;
            this.f3077s0 = z;
        }
        if (z) {
            List listM5698a = AbstractC1821y3.m5698a(this);
            if (listM5698a.isEmpty()) {
                m4853s0().m2615g();
                m4780O0();
                return;
            }
            Long l = (Long) m4801a(AbstractC1776t3.f3363q7);
            C1788u6 c1788u6 = new C1788u6(this, true, "timeoutInitAdapters", new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m4717K0();
                }
            });
            m4782Q();
            if (C1768p.m5160a()) {
                m4782Q().m5171a("AppLovinSdk", "Waiting for required adapters to init: " + listM5698a + " - timing out in " + l + "ms...");
            }
            m4853s0().m2606a(c1788u6, C1552f6.b.TIMEOUT, l.longValue(), true);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m4812a(C1831z4 c1831z4, MaxAdFormat maxAdFormat) {
        return m4817b(c1831z4).contains(maxAdFormat);
    }

    /* JADX INFO: renamed from: a */
    public boolean m4813a(MaxAdFormat maxAdFormat) {
        List list = this.f3065m0;
        return (list == null || list.size() <= 0 || this.f3065m0.contains(maxAdFormat)) ? false : true;
    }

    /* JADX INFO: renamed from: a0 */
    public C1803w3 m4814a0() {
        Object c1803w3 = this.f3090z.get();
        if (c1803w3 == null) {
            synchronized (this.f3090z) {
                c1803w3 = this.f3090z.get();
                if (c1803w3 == null) {
                    c1803w3 = new C1803w3(this);
                    this.f3090z.set(c1803w3);
                }
            }
        }
        if (c1803w3 == this.f3090z) {
            c1803w3 = null;
        }
        return (C1803w3) c1803w3;
    }

    /* JADX INFO: renamed from: b */
    public Object m4815b(C1511b5 c1511b5) {
        return m4851r0().m2208a(c1511b5);
    }

    /* JADX INFO: renamed from: b */
    public String m4816b() {
        if (StringUtils.isValidString(this.f3085w0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Map mapM4724Y = m4724Y();
        List listM4821c = m4821c(C1831z4.f4007o4);
        Boolean bool = (Boolean) m4801a(C1831z4.f4015p4);
        if (mapM4724Y.isEmpty() && !bool.booleanValue()) {
            return null;
        }
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Integer numValueOf = (Integer) m4801a(C1831z4.f3998n4);
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (numValueOf.intValue() <= 0) {
                    break;
                }
                String className = stackTraceElement.getClassName();
                Iterator it = listM4821c.iterator();
                do {
                    if (!it.hasNext()) {
                        for (Map.Entry entry : mapM4724Y.entrySet()) {
                            if (className.startsWith((String) entry.getKey())) {
                                this.f3085w0 = (String) entry.getValue();
                                m4782Q();
                                if (C1768p.m5160a()) {
                                    m4782Q().m5171a("AppLovinSdk", "Detected mediation provider: " + this.f3085w0);
                                }
                                return null;
                            }
                        }
                        if (bool.booleanValue()) {
                            arrayList.add(className);
                        }
                        numValueOf = Integer.valueOf(numValueOf.intValue() - 1);
                        break;
                    }
                } while (!className.startsWith((String) it.next()));
            }
        } catch (Throwable th) {
            m4764E().m4329a("AppLovinSdk", "detectMediationProvider", th);
        }
        this.f3085w0 = "unknown";
        m4782Q();
        if (C1768p.m5160a()) {
            m4782Q().m5178k("AppLovinSdk", "Unable to detect mediation provider");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String strJoin = StringUtils.join(",", arrayList);
        if (!((Boolean) m4801a(C1831z4.f4023q4)).booleanValue()) {
            return strJoin;
        }
        m4764E().m2678a(C1548f2.f1523d, "detectMediationProvider", CollectionUtils.hashMap("details", strJoin));
        return null;
    }

    /* JADX INFO: renamed from: b */
    public List m4817b(C1831z4 c1831z4) {
        return m4849q0().m1878b(c1831z4);
    }

    /* JADX INFO: renamed from: b */
    public void m4818b(C1511b5 c1511b5, Object obj) {
        m4851r0().m2215b(c1511b5, obj);
    }

    /* JADX INFO: renamed from: b */
    protected void m4819b(boolean z) {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (m4864y().m5349i() || (sdkInitializationListener = this.f3011A0) == null) {
            return;
        }
        if (m4763D0()) {
            this.f3011A0 = null;
            this.f3013B0 = null;
            m4789U().m3510a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.f3013B0 == sdkInitializationListener) {
                return;
            }
            m4789U().m3510a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) m4801a(C1831z4.f4010p)).booleanValue()) {
                this.f3011A0 = null;
            } else {
                this.f3013B0 = sdkInitializationListener;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putBoolean(jSONObject, "enabled", m4763D0());
        JsonUtils.putBoolean(jSONObject, "timeout", z);
        JsonUtils.putBoolean(jSONObject, "consent_flow_shown", this.f3073q0.get());
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f3048e;
        HashMap map = new HashMap();
        map.put("duration_ms", String.valueOf(jCurrentTimeMillis));
        map.put("details", jSONObject.toString());
        this.f3082v.m2682d(C1548f2.f1541j, map);
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.l$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4740b(sdkInitializationListener);
            }
        }, Math.max(0L, ((Long) m4801a(C1831z4.f4018q)).longValue()));
    }

    /* JADX INFO: renamed from: b0 */
    public C1812x3 m4820b0() {
        Object c1812x3 = this.f3051f0.get();
        if (c1812x3 == null) {
            synchronized (this.f3051f0) {
                c1812x3 = this.f3051f0.get();
                if (c1812x3 == null) {
                    c1812x3 = new C1812x3();
                    this.f3051f0.set(c1812x3);
                }
            }
        }
        if (c1812x3 == this.f3051f0) {
            c1812x3 = null;
        }
        return (C1812x3) c1812x3;
    }

    /* JADX INFO: renamed from: c */
    public List m4821c(C1831z4 c1831z4) {
        return m4849q0().m1879c(c1831z4);
    }

    /* JADX INFO: renamed from: c */
    public void m4822c() {
        synchronized (this.f3067n0) {
            if (!this.f3075r0 && !this.f3077s0) {
                m4788T0();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m4823c(C1511b5 c1511b5) {
        m4851r0().m2214b(c1511b5);
    }

    /* JADX INFO: renamed from: c0 */
    public C1769q m4824c0() {
        Object c1769q = this.f3055h0.get();
        if (c1769q == null) {
            synchronized (this.f3055h0) {
                c1769q = this.f3055h0.get();
                if (c1769q == null) {
                    c1769q = new C1769q(this);
                    this.f3055h0.set(c1769q);
                }
            }
        }
        if (c1769q == this.f3055h0) {
            c1769q = null;
        }
        return (C1769q) c1769q;
    }

    /* JADX INFO: renamed from: d0 */
    public AppLovinNativeAdService m4825d0() {
        Object appLovinNativeAdService = this.f3066n.get();
        if (appLovinNativeAdService == null) {
            synchronized (this.f3066n) {
                appLovinNativeAdService = this.f3066n.get();
                if (appLovinNativeAdService == null) {
                    appLovinNativeAdService = new AppLovinNativeAdService(this);
                    this.f3066n.set(appLovinNativeAdService);
                }
            }
        }
        if (appLovinNativeAdService == this.f3066n) {
            appLovinNativeAdService = null;
        }
        return (AppLovinNativeAdService) appLovinNativeAdService;
    }

    /* JADX INFO: renamed from: e */
    public C1515c m4826e() {
        return m4725a(f3004F0);
    }

    /* JADX INFO: renamed from: e0 */
    public C1483a4 m4827e0() {
        Object c1483a4 = this.f3026M.get();
        if (c1483a4 == null) {
            synchronized (this.f3026M) {
                c1483a4 = this.f3026M.get();
                if (c1483a4 == null) {
                    c1483a4 = new C1483a4(m4756p());
                    this.f3026M.set(c1483a4);
                }
            }
        }
        if (c1483a4 == this.f3026M) {
            c1483a4 = null;
        }
        return (C1483a4) c1483a4;
    }

    /* JADX INFO: renamed from: f */
    public C1734a m4828f() {
        Object c1734a = this.f3019F.get();
        if (c1734a == null) {
            synchronized (this.f3019F) {
                c1734a = this.f3019F.get();
                if (c1734a == null) {
                    c1734a = new C1734a(this);
                    this.f3019F.set(c1734a);
                }
            }
        }
        if (c1734a == this.f3019F) {
            c1734a = null;
        }
        return (C1734a) c1734a;
    }

    /* JADX INFO: renamed from: f0 */
    public C1540e4 m4829f0() {
        Object c1540e4 = this.f3037X.get();
        if (c1540e4 == null) {
            synchronized (this.f3037X) {
                c1540e4 = this.f3037X.get();
                if (c1540e4 == null) {
                    c1540e4 = new C1540e4(this);
                    this.f3037X.set(c1540e4);
                }
            }
        }
        if (c1540e4 == this.f3037X) {
            c1540e4 = null;
        }
        return (C1540e4) c1540e4;
    }

    /* JADX INFO: renamed from: g */
    public C1545f m4830g() {
        return this.f3076s;
    }

    /* JADX INFO: renamed from: g0 */
    public C1610l4 m4831g0() {
        Object c1610l4 = this.f3033T.get();
        if (c1610l4 == null) {
            synchronized (this.f3033T) {
                c1610l4 = this.f3033T.get();
                if (c1610l4 == null) {
                    c1610l4 = new C1610l4(this);
                    this.f3033T.set(c1610l4);
                }
            }
        }
        if (c1610l4 == this.f3033T) {
            c1610l4 = null;
        }
        return (C1610l4) c1610l4;
    }

    /* JADX INFO: renamed from: h */
    public C1739c m4832h() {
        Object c1739c = this.f3024K.get();
        if (c1739c == null) {
            synchronized (this.f3024K) {
                c1739c = this.f3024K.get();
                if (c1739c == null) {
                    c1739c = new C1739c(this);
                    this.f3024K.set(c1739c);
                }
            }
        }
        if (c1739c == this.f3024K) {
            c1739c = null;
        }
        return (C1739c) c1739c;
    }

    /* JADX INFO: renamed from: h0 */
    public C1763b m4833h0() {
        Object c1763b = this.f3041a0.get();
        if (c1763b == null) {
            synchronized (this.f3041a0) {
                c1763b = this.f3041a0.get();
                if (c1763b == null) {
                    c1763b = new C1763b(this);
                    this.f3041a0.set(c1763b);
                }
            }
        }
        if (c1763b == this.f3041a0) {
            c1763b = null;
        }
        return (C1763b) c1763b;
    }

    /* JADX INFO: renamed from: i */
    public C1741e m4834i() {
        Object c1741e = this.f3035V.get();
        if (c1741e == null) {
            synchronized (this.f3035V) {
                c1741e = this.f3035V.get();
                if (c1741e == null) {
                    c1741e = new C1741e(this);
                    this.f3035V.set(c1741e);
                }
            }
        }
        if (c1741e == this.f3035V) {
            c1741e = null;
        }
        return (C1741e) c1741e;
    }

    /* JADX INFO: renamed from: i0 */
    public PostbackServiceImpl m4835i0() {
        Object postbackServiceImpl = this.f3039Z.get();
        if (postbackServiceImpl == null) {
            synchronized (this.f3039Z) {
                postbackServiceImpl = this.f3039Z.get();
                if (postbackServiceImpl == null) {
                    postbackServiceImpl = new PostbackServiceImpl(this);
                    this.f3039Z.set(postbackServiceImpl);
                }
            }
        }
        if (postbackServiceImpl == this.f3039Z) {
            postbackServiceImpl = null;
        }
        return (PostbackServiceImpl) postbackServiceImpl;
    }

    /* JADX INFO: renamed from: j */
    public C1742f m4836j() {
        Object c1742f = this.f3018E.get();
        if (c1742f == null) {
            synchronized (this.f3018E) {
                c1742f = this.f3018E.get();
                if (c1742f == null) {
                    c1742f = new C1742f(this);
                    this.f3018E.set(c1742f);
                }
            }
        }
        if (c1742f == this.f3018E) {
            c1742f = null;
        }
        return (C1742f) c1742f;
    }

    /* JADX INFO: renamed from: j0 */
    public String m4837j0() {
        return m4865y0().m3891a();
    }

    /* JADX INFO: renamed from: k */
    public C1585j m4838k() {
        Object c1585j = this.f3043b0.get();
        if (c1585j == null) {
            synchronized (this.f3043b0) {
                c1585j = this.f3043b0.get();
                if (c1585j == null) {
                    c1585j = new C1585j(this);
                    this.f3043b0.set(c1585j);
                }
            }
        }
        if (c1585j == this.f3043b0) {
            c1585j = null;
        }
        return (C1585j) c1585j;
    }

    /* JADX INFO: renamed from: k0 */
    public String m4839k0() {
        return this.f3040a;
    }

    /* JADX INFO: renamed from: l */
    public AppLovinAdServiceImpl m4840l() {
        Object appLovinAdServiceImpl = this.f3064m.get();
        if (appLovinAdServiceImpl == null) {
            synchronized (this.f3064m) {
                appLovinAdServiceImpl = this.f3064m.get();
                if (appLovinAdServiceImpl == null) {
                    appLovinAdServiceImpl = new AppLovinAdServiceImpl(this);
                    this.f3064m.set(appLovinAdServiceImpl);
                }
            }
        }
        if (appLovinAdServiceImpl == this.f3064m) {
            appLovinAdServiceImpl = null;
        }
        return (AppLovinAdServiceImpl) appLovinAdServiceImpl;
    }

    /* JADX INFO: renamed from: l0 */
    public MaxSegmentCollectionImpl m4841l0() {
        return (MaxSegmentCollectionImpl) this.f3060k;
    }

    /* JADX INFO: renamed from: m */
    public C1744h m4842m() {
        Object c1744h = this.f3023J.get();
        if (c1744h == null) {
            synchronized (this.f3023J) {
                c1744h = this.f3023J.get();
                if (c1744h == null) {
                    c1744h = new C1744h();
                    this.f3023J.set(c1744h);
                }
            }
        }
        if (c1744h == this.f3023J) {
            c1744h = null;
        }
        return (C1744h) c1744h;
    }

    /* JADX INFO: renamed from: m0 */
    public Map m4843m0() {
        MaxSegmentCollectionImpl maxSegmentCollectionImplM4841l0 = m4841l0();
        if (maxSegmentCollectionImplM4841l0 == null) {
            return null;
        }
        return maxSegmentCollectionImplM4841l0.getJsonData();
    }

    /* JADX INFO: renamed from: n */
    public C1745i m4844n() {
        Object c1745i = this.f3036W.get();
        if (c1745i == null) {
            synchronized (this.f3036W) {
                c1745i = this.f3036W.get();
                if (c1745i == null) {
                    c1745i = new C1745i(this);
                    this.f3036W.set(c1745i);
                }
            }
        }
        if (c1745i == this.f3036W) {
            c1745i = null;
        }
        return (C1745i) c1745i;
    }

    /* JADX INFO: renamed from: n0 */
    public C1822y4 m4845n0() {
        Object c1822y4 = this.f3028O.get();
        if (c1822y4 == null) {
            synchronized (this.f3028O) {
                c1822y4 = this.f3028O.get();
                if (c1822y4 == null) {
                    c1822y4 = new C1822y4(this);
                    this.f3028O.set(c1822y4);
                }
            }
        }
        if (c1822y4 == this.f3028O) {
            c1822y4 = null;
        }
        return (C1822y4) c1822y4;
    }

    /* JADX INFO: renamed from: o0 */
    public SessionTracker m4846o0() {
        Object sessionTracker = this.f3021H.get();
        if (sessionTracker == null) {
            synchronized (this.f3021H) {
                sessionTracker = this.f3021H.get();
                if (sessionTracker == null) {
                    sessionTracker = new SessionTracker(this);
                    this.f3021H.set(sessionTracker);
                }
            }
        }
        if (sessionTracker == this.f3021H) {
            sessionTracker = null;
        }
        return (SessionTracker) sessionTracker;
    }

    /* JADX INFO: renamed from: p0 */
    public AppLovinSdkSettings m4847p0() {
        return this.f3058j;
    }

    /* JADX INFO: renamed from: q */
    public C1746j m4848q() {
        Object c1746j = this.f3029P.get();
        if (c1746j == null) {
            synchronized (this.f3029P) {
                c1746j = this.f3029P.get();
                if (c1746j == null) {
                    c1746j = new C1746j(this);
                    this.f3029P.set(c1746j);
                }
            }
        }
        if (c1746j == this.f3029P) {
            c1746j = null;
        }
        return (C1746j) c1746j;
    }

    /* JADX INFO: renamed from: q0 */
    public C1484a5 m4849q0() {
        Object c1484a5 = this.f3086x.get();
        if (c1484a5 == null) {
            synchronized (this.f3086x) {
                c1484a5 = this.f3086x.get();
                if (c1484a5 == null) {
                    c1484a5 = new C1484a5(this);
                    this.f3086x.set(c1484a5);
                }
            }
        }
        if (c1484a5 == this.f3086x) {
            c1484a5 = null;
        }
        return (C1484a5) c1484a5;
    }

    /* JADX INFO: renamed from: r */
    public String m4850r() {
        return this.f3042b;
    }

    /* JADX INFO: renamed from: r0 */
    public C1521c5 m4851r0() {
        Object c1521c5 = this.f3012B.get();
        if (c1521c5 == null) {
            synchronized (this.f3012B) {
                c1521c5 = this.f3012B.get();
                if (c1521c5 == null) {
                    c1521c5 = new C1521c5(this);
                    this.f3012B.set(c1521c5);
                }
            }
        }
        if (c1521c5 == this.f3012B) {
            c1521c5 = null;
        }
        return (C1521c5) c1521c5;
    }

    /* JADX INFO: renamed from: s */
    public String m4852s() {
        return m4865y0().m3893b();
    }

    /* JADX INFO: renamed from: s0 */
    public C1552f6 m4853s0() {
        Object c1552f6 = this.f3084w.get();
        if (c1552f6 == null) {
            synchronized (this.f3084w) {
                c1552f6 = this.f3084w.get();
                if (c1552f6 == null) {
                    c1552f6 = new C1552f6(this);
                    this.f3084w.set(c1552f6);
                }
            }
        }
        if (c1552f6 == this.f3084w) {
            c1552f6 = null;
        }
        return (C1552f6) c1552f6;
    }

    /* JADX INFO: renamed from: t */
    public CmpServiceImpl m4854t() {
        Object cmpServiceImpl = this.f3070p.get();
        if (cmpServiceImpl == null) {
            synchronized (this.f3070p) {
                cmpServiceImpl = this.f3070p.get();
                if (cmpServiceImpl == null) {
                    cmpServiceImpl = new CmpServiceImpl(this);
                    this.f3070p.set(cmpServiceImpl);
                }
            }
        }
        if (cmpServiceImpl == this.f3070p) {
            cmpServiceImpl = null;
        }
        return (CmpServiceImpl) cmpServiceImpl;
    }

    /* JADX INFO: renamed from: t0 */
    public SharedPreferencesOnSharedPreferenceChangeListenerC1523c7 m4855t0() {
        Object sharedPreferencesOnSharedPreferenceChangeListenerC1523c7 = this.f3031R.get();
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1523c7 == null) {
            synchronized (this.f3031R) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1523c7 = this.f3031R.get();
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1523c7 == null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1523c7 = new SharedPreferencesOnSharedPreferenceChangeListenerC1523c7(this);
                    this.f3031R.set(sharedPreferencesOnSharedPreferenceChangeListenerC1523c7);
                }
            }
        }
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1523c7 == this.f3031R) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1523c7 = null;
        }
        return (SharedPreferencesOnSharedPreferenceChangeListenerC1523c7) sharedPreferencesOnSharedPreferenceChangeListenerC1523c7;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f3040a + "', enabled=" + this.f3077s0 + ", isFirstSession=" + this.f3079t0 + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: renamed from: u */
    public C1747k m4856u() {
        Object c1747k = this.f3027N.get();
        if (c1747k == null) {
            synchronized (this.f3027N) {
                c1747k = this.f3027N.get();
                if (c1747k == null) {
                    c1747k = new C1747k(this);
                    this.f3027N.set(c1747k);
                }
            }
        }
        if (c1747k == this.f3027N) {
            c1747k = null;
        }
        return (C1747k) c1747k;
    }

    /* JADX INFO: renamed from: u0 */
    public C1583i7 m4857u0() {
        Object c1583i7 = this.f3063l0.get();
        if (c1583i7 == null) {
            synchronized (this.f3063l0) {
                c1583i7 = this.f3063l0.get();
                if (c1583i7 == null) {
                    c1583i7 = new C1583i7(this);
                    this.f3063l0.set(c1583i7);
                }
            }
        }
        if (c1583i7 == this.f3063l0) {
            c1583i7 = null;
        }
        return (C1583i7) c1583i7;
    }

    /* JADX INFO: renamed from: v */
    public String m4858v() {
        return m4865y0().m3895c();
    }

    /* JADX INFO: renamed from: v0 */
    public long m4859v0() {
        if (this.f3054h == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.f3054h;
    }

    /* JADX INFO: renamed from: w */
    public SdkConfigurationImpl m4860w() {
        return this.f3091z0;
    }

    /* JADX INFO: renamed from: w0 */
    public Activity m4861w0() {
        Activity activityM2145b = m4725a(m4756p()).m2145b();
        return activityM2145b != null ? activityM2145b : m4775K();
    }

    /* JADX INFO: renamed from: x */
    public C1704r0 m4862x() {
        Object c1704r0 = this.f3088y.get();
        if (c1704r0 == null) {
            synchronized (this.f3088y) {
                c1704r0 = this.f3088y.get();
                if (c1704r0 == null) {
                    c1704r0 = new C1704r0(this);
                    this.f3088y.set(c1704r0);
                }
            }
        }
        if (c1704r0 == this.f3088y) {
            c1704r0 = null;
        }
        return (C1704r0) c1704r0;
    }

    /* JADX INFO: renamed from: x0 */
    public C1674o7 m4863x0() {
        return this.f3082v;
    }

    /* JADX INFO: renamed from: y */
    public C1791v0 m4864y() {
        Object c1791v0 = this.f3030Q.get();
        if (c1791v0 == null) {
            synchronized (this.f3030Q) {
                c1791v0 = this.f3030Q.get();
                if (c1791v0 == null) {
                    c1791v0 = new C1791v0(this);
                    this.f3030Q.set(c1791v0);
                }
            }
        }
        if (c1791v0 == this.f3030Q) {
            c1791v0 = null;
        }
        return (C1791v0) c1791v0;
    }

    /* JADX INFO: renamed from: y0 */
    public C1684p7 m4865y0() {
        Object c1684p7 = this.f3014C.get();
        if (c1684p7 == null) {
            synchronized (this.f3014C) {
                c1684p7 = this.f3014C.get();
                if (c1684p7 == null) {
                    c1684p7 = new C1684p7(this);
                    this.f3014C.set(c1684p7);
                }
            }
        }
        if (c1684p7 == this.f3014C) {
            c1684p7 = null;
        }
        return (C1684p7) c1684p7;
    }

    /* JADX INFO: renamed from: z */
    public C1547f1 m4866z() {
        Object c1547f1 = this.f3032S.get();
        if (c1547f1 == null) {
            synchronized (this.f3032S) {
                c1547f1 = this.f3032S.get();
                if (c1547f1 == null) {
                    c1547f1 = new C1547f1(this);
                    this.f3032S.set(c1547f1);
                }
            }
        }
        if (c1547f1 == this.f3032S) {
            c1547f1 = null;
        }
        return (C1547f1) c1547f1;
    }

    /* JADX INFO: renamed from: z0 */
    public C1665n8 m4867z0() {
        Object c1665n8 = this.f3025L.get();
        if (c1665n8 == null) {
            synchronized (this.f3025L) {
                c1665n8 = this.f3025L.get();
                if (c1665n8 == null) {
                    c1665n8 = new C1665n8(this);
                    this.f3025L.set(c1665n8);
                }
            }
        }
        if (c1665n8 == this.f3025L) {
            c1665n8 = null;
        }
        return (C1665n8) c1665n8;
    }
}
