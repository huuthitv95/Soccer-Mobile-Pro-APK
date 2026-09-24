package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.AbstractC1482a3;
import com.applovin.impl.AbstractC1568h2;
import com.applovin.impl.AbstractC1589j3;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1776t3;
import com.applovin.impl.AbstractC1793v2;
import com.applovin.impl.AbstractC1821y3;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1511b5;
import com.applovin.impl.C1519c3;
import com.applovin.impl.C1531d5;
import com.applovin.impl.C1532d6;
import com.applovin.impl.C1539e3;
import com.applovin.impl.C1541e5;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1551f5;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1612l6;
import com.applovin.impl.C1619m3;
import com.applovin.impl.C1700q6;
import com.applovin.impl.C1785u3;
import com.applovin.impl.C1786u4;
import com.applovin.impl.C1794v3;
import com.applovin.impl.C1815x6;
import com.applovin.impl.C1831z4;
import com.applovin.impl.EnumC1575i;
import com.applovin.impl.mediation.ads.AbstractC1644a;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1744h;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1767o;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a */
    private final C1748l f2116a;

    /* JADX INFO: renamed from: b */
    private final C1768p f2117b;

    /* JADX INFO: renamed from: c */
    private final C1531d5 f2118c;

    /* JADX INFO: renamed from: d */
    private final AtomicReference f2119d = new AtomicReference();

    /* JADX INFO: renamed from: com.applovin.impl.mediation.MediationServiceImpl$a */
    static /* synthetic */ class C1628a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f2120a;

        static {
            int[] iArr = new int[MaxAdapter.InitializationStatus.values().length];
            f2120a = iArr;
            try {
                iArr[MaxAdapter.InitializationStatus.DOES_NOT_APPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2120a[MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2120a[MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2120a[MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2120a[MaxAdapter.InitializationStatus.NOT_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2120a[MaxAdapter.InitializationStatus.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.MediationServiceImpl$b */
    public class C1629b implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, AbstractC1644a.a {

        /* JADX INFO: renamed from: a */
        private final AbstractC1482a3 f2121a;

        /* JADX INFO: renamed from: b */
        private AbstractC1644a.a f2122b;

        public C1629b(AbstractC1482a3 abstractC1482a3, AbstractC1644a.a aVar) {
            this.f2121a = abstractC1482a3;
            this.f2122b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3284a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f2116a.m4773J().m5148b(maxAd);
            }
            AbstractC1793v2.m5450e(this.f2122b, maxAd);
        }

        /* JADX INFO: renamed from: a */
        public void m3285a(AbstractC1644a.a aVar) {
            this.f2122b = aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m3286a(MaxAd maxAd, Bundle bundle) {
            this.f2121a.mo1842a(bundle);
            MediationServiceImpl.this.f2116a.m4842m().m4665a(this.f2121a, C1744h.c.CLICK);
            MediationServiceImpl.this.m3254a(this.f2121a, this.f2122b);
            AbstractC1793v2.m5370a((MaxAdListener) this.f2122b, maxAd);
        }

        /* JADX INFO: renamed from: a */
        public void m3287a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.f2121a.mo1842a(bundle);
            this.f2121a.m1848d0();
            MediationServiceImpl.this.m3256a(this.f2121a, maxError, this.f2122b);
            if (maxAd.getFormat() == MaxAdFormat.REWARDED && (maxAd instanceof C1539e3)) {
                ((C1539e3) maxAd).m2474m0();
            }
        }

        /* JADX INFO: renamed from: a */
        public void m3288a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.f2121a.mo1842a(bundle);
            AbstractC1793v2.m5373a(this.f2122b, maxAd, maxReward);
            MediationServiceImpl.this.f2116a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1700q6((C1539e3) maxAd, MediationServiceImpl.this.f2116a), C1552f6.b.OTHER);
        }

        /* JADX INFO: renamed from: b */
        public void m3289b(MaxAd maxAd, Bundle bundle) {
            this.f2121a.mo1842a(bundle);
            AbstractC1793v2.m5414b(this.f2122b, maxAd);
        }

        /* JADX INFO: renamed from: c */
        public void m3290c(MaxAd maxAd, Bundle bundle) {
            this.f2121a.mo1842a(bundle);
            this.f2121a.m1849e0();
            C1768p unused = MediationServiceImpl.this.f2117b;
            if (C1768p.m5160a()) {
                MediationServiceImpl.this.f2117b.m5171a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f2121a, this.f2122b);
            if (!((Boolean) MediationServiceImpl.this.f2116a.m4801a(AbstractC1776t3.f3382z8)).booleanValue() || this.f2121a.m1860u().compareAndSet(false, true)) {
                MediationServiceImpl.this.f2116a.m4842m().m4665a(this.f2121a, C1744h.c.SHOW);
                MediationServiceImpl.this.f2116a.m4856u().m4712b(this.f2121a, "DID_DISPLAY");
                if (maxAd.getFormat().isFullscreenAd()) {
                    MediationServiceImpl.this.f2116a.m4773J().m5143a(this.f2121a);
                }
                AbstractC1793v2.m5434c(this.f2122b, maxAd);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m3291d(MaxAd maxAd, Bundle bundle) {
            this.f2121a.mo1842a(bundle);
            AbstractC1793v2.m5443d(this.f2122b, maxAd);
        }

        /* JADX INFO: renamed from: e */
        public void m3292e(final MaxAd maxAd, Bundle bundle) {
            this.f2121a.mo1842a(bundle);
            this.f2121a.m1850f0();
            MediationServiceImpl.this.f2116a.m4842m().m4665a(this.f2121a, C1744h.c.HIDE);
            MediationServiceImpl.this.m3253a(this.f2121a);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3284a(maxAd);
                }
            }, maxAd instanceof C1539e3 ? ((C1539e3) maxAd).m2475o0() : 0L);
        }

        /* JADX INFO: renamed from: f */
        public void m3293f(MaxAd maxAd, Bundle bundle) {
            this.f2121a.mo1842a(bundle);
            this.f2121a.m1853h0();
            MediationServiceImpl.this.f2116a.m4842m().m4665a(this.f2121a, C1744h.c.LOAD);
            MediationServiceImpl.this.m3279b(this.f2121a);
            AbstractC1793v2.m5455f(this.f2122b, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            m3286a(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            m3289b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            m3287a(maxAd, maxError, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            m3290c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            m3291d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            m3292e(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f2121a.m1853h0();
            MediationServiceImpl.this.m3280b(this.f2121a, maxError, this.f2122b);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            m3293f(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            m3288a(maxAd, maxReward, (Bundle) null);
        }
    }

    public MediationServiceImpl(C1748l c1748l) {
        this.f2116a = c1748l;
        this.f2117b = c1748l.m4782Q();
        this.f2118c = new C1531d5(c1748l);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3252a(long j, C1655h c1655h, String str, C1551f5 c1551f5, MaxAdFormat maxAdFormat, C1541e5.a aVar, boolean z, String str2, MaxError maxError) {
        C1541e5 c1541e5M2493a;
        String str3;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (z) {
            if (C1768p.m5160a()) {
                this.f2117b.m5171a("MediationService", "Signal collection successful from: " + c1655h.m3573g() + " for Ad Unit ID: " + str + " with signal: \"" + str2 + "\"");
                str3 = str2;
            } else {
                str3 = str2;
            }
            c1541e5M2493a = C1541e5.m2494a(c1551f5, c1655h, str3, j, jElapsedRealtime);
            this.f2118c.m2403a(c1541e5M2493a, c1551f5, str, maxAdFormat);
            HashMap map = new HashMap();
            CollectionUtils.putStringIfValid("network_name", c1551f5.m3200c(), map);
            CollectionUtils.putStringIfValid("adapter_class", c1551f5.m3196b(), map);
            CollectionUtils.putStringIfValid("adapter_version", c1655h.m3567b(), map);
            CollectionUtils.putStringIfValid("duration_ms", String.valueOf(jElapsedRealtime), map);
            CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, String.valueOf(maxAdFormat.getLabel()), map);
            CollectionUtils.putStringIfValid("ad_unit_id", str, map);
            this.f2116a.m4784R().m2682d(C1548f2.f1530f0, map);
        } else {
            if (C1768p.m5160a()) {
                this.f2117b.m5174b("MediationService", "Signal collection failed from: " + c1655h.m3573g() + " for Ad Unit ID: " + str + " with error message: \"" + maxError.getMessage() + "\"");
            }
            c1541e5M2493a = C1541e5.m2493a(c1551f5, c1655h, maxError, j, jElapsedRealtime);
            m3263a(c1541e5M2493a, c1551f5, c1655h);
        }
        aVar.mo2503a(c1541e5M2493a);
        c1655h.m3559a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3253a(AbstractC1482a3 abstractC1482a3) {
        MediationServiceImpl mediationServiceImpl;
        AbstractC1482a3 abstractC1482a4;
        this.f2116a.m4856u().m4712b(abstractC1482a3, "DID_HIDE");
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f2116a.m4865y0().m3898e());
        if (!((Boolean) this.f2116a.m4801a(C1831z4.f3762L3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        boolean z = abstractC1482a3.m1862w().get();
        if (((Boolean) this.f2116a.m4801a(C1831z4.f3833U2)).booleanValue()) {
            HashMap map2 = new HashMap();
            map2.put("ad_hidden_callback_manually_invoked", Boolean.valueOf(z));
            mediationServiceImpl = this;
            abstractC1482a4 = abstractC1482a3;
            mediationServiceImpl.m3272a("mclose", null, map, map2, null, abstractC1482a4, true);
        } else {
            mediationServiceImpl = this;
            abstractC1482a4 = abstractC1482a3;
            m3273a("mclose", map, abstractC1482a4);
        }
        long jM1835V = abstractC1482a4.m1835V();
        long jM1825K = abstractC1482a4.m1825K();
        Map map3 = CollectionUtils.map("duration_ms", String.valueOf(jM1835V));
        map3.put("details", "foreground_duration_ms=" + jM1825K + ",ad_hidden_callback_manually_invoked=" + z);
        mediationServiceImpl.f2116a.m4784R().m2098a(C1548f2.f1563s0, abstractC1482a4, map3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3254a(AbstractC1482a3 abstractC1482a3, AbstractC1644a.a aVar) {
        this.f2116a.m4856u().m4712b(abstractC1482a3, "DID_CLICKED");
        this.f2116a.m4856u().m4712b(abstractC1482a3, "DID_CLICK");
        if (abstractC1482a3.m1831R().endsWith("click")) {
            this.f2116a.m4856u().m4711b(abstractC1482a3);
            AbstractC1793v2.m5380a((MaxAdRevenueListener) aVar, (MaxAd) abstractC1482a3);
        }
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f2116a.m4865y0().m3898e());
        if (!((Boolean) this.f2116a.m4801a(C1831z4.f3762L3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        m3273a("mclick", map, abstractC1482a3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3255a(AbstractC1482a3 abstractC1482a3, AbstractC1644a.a aVar, String str) {
        String str2 = "Failed to load " + abstractC1482a3 + ": adapter init failed with error: " + str;
        if (C1768p.m5160a()) {
            this.f2117b.m5178k("MediationService", str2);
        }
        m3280b(abstractC1482a3, new MaxErrorImpl(MaxAdapterError.NOT_INITIALIZED.getErrorCode(), "Adapter initialization failed"), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3256a(AbstractC1482a3 abstractC1482a3, MaxError maxError, MaxAdListener maxAdListener) {
        this.f2116a.m4842m().m4665a(abstractC1482a3, C1744h.c.SHOW_ERROR);
        this.f2116a.m4856u().m4712b(abstractC1482a3, "DID_FAIL_DISPLAY");
        m3271a(maxError, abstractC1482a3, true);
        if (abstractC1482a3.m1860u().compareAndSet(false, true)) {
            AbstractC1793v2.m5371a(maxAdListener, abstractC1482a3, maxError);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3257a(C1539e3 c1539e3) {
        if (c1539e3.getFormat() == MaxAdFormat.REWARDED) {
            this.f2116a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1815x6(c1539e3, this.f2116a), C1552f6.b.OTHER);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3258a(C1539e3 c1539e3, AbstractC1644a.a aVar) {
        this.f2116a.m4773J().m5145a(false);
        m3261a(c1539e3, (MaxAdListener) aVar);
        if (C1768p.m5160a()) {
            this.f2117b.m5171a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(c1539e3, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3259a(C1539e3 c1539e3, C1655h c1655h, Activity activity, AbstractC1644a.a aVar) {
        m3257a(c1539e3);
        c1655h.m3568b(c1539e3, activity);
        m3258a(c1539e3, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3260a(C1539e3 c1539e3, C1655h c1655h, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, AbstractC1644a.a aVar) {
        m3257a(c1539e3);
        c1655h.m3561a(c1539e3, viewGroup, lifecycle, activity);
        m3258a(c1539e3, aVar);
    }

    /* JADX INFO: renamed from: a */
    private void m3261a(final C1539e3 c1539e3, final MaxAdListener maxAdListener) {
        final Long l = (Long) this.f2116a.m4801a(AbstractC1776t3.f3341W7);
        if (l.longValue() <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3262a(c1539e3, l, maxAdListener);
            }
        }, l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3262a(C1539e3 c1539e3, Long l, MaxAdListener maxAdListener) {
        if (c1539e3.m1860u().get()) {
            return;
        }
        String str = "Ad (" + c1539e3.m3215k() + ") has not been displayed after " + l + "ms. Failing ad display...";
        C1768p.m5167h("MediationService", str);
        m3256a(c1539e3, new MaxErrorImpl(-1, str), maxAdListener);
        this.f2116a.m4773J().m5148b(c1539e3);
    }

    /* JADX INFO: renamed from: a */
    private void m3263a(C1541e5 c1541e5, C1551f5 c1551f5, C1655h c1655h) {
        long jM2497b = c1541e5.m2497b();
        HashMap map = new HashMap(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(jM2497b));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", c1655h.m3567b(), map);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", c1655h.m3575i(), map);
        m3274a("serr", map, c1541e5.m2498c(), c1551f5);
        Map mapM2790a = AbstractC1568h2.m2790a(c1541e5.m2498c());
        CollectionUtils.putStringIfValid("network_name", c1551f5.m3200c(), mapM2790a);
        CollectionUtils.putStringIfValid("adapter_class", c1551f5.m3196b(), mapM2790a);
        CollectionUtils.putStringIfValid("adapter_version", c1655h.m3567b(), mapM2790a);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(jM2497b), mapM2790a);
        this.f2116a.m4784R().m2682d(C1548f2.f1533g0, mapM2790a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3267a(C1655h c1655h, C1786u4 c1786u4, String str) {
        if (C1768p.m5160a()) {
            this.f2117b.m5174b("MediationService", "Skip collecting signal for failed-initialized adapter: " + c1655h.m3573g());
        }
        c1786u4.m5298a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_NOT_INITIALIZED, "Could not initialize adapter: " + str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3268a(C1655h c1655h, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, AbstractC1482a3 abstractC1482a3, Activity activity, AbstractC1644a.a aVar) {
        c1655h.m3566a(str, maxAdapterParametersImpl, abstractC1482a3, activity, new C1629b(abstractC1482a3, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3269a(C1786u4 c1786u4, C1655h c1655h, MaxAdapterParametersImpl maxAdapterParametersImpl, C1551f5 c1551f5, Activity activity) {
        if (c1786u4.m5307d()) {
            return;
        }
        if (C1768p.m5160a()) {
            this.f2117b.m5171a("MediationService", "Collecting signal for now-initialized adapter: " + c1655h.m3573g());
        }
        c1655h.m3563a(maxAdapterParametersImpl, c1551f5, activity, c1786u4);
    }

    /* JADX INFO: renamed from: a */
    private void m3270a(MaxError maxError, AbstractC1482a3 abstractC1482a3) {
        HashMap map = new HashMap(3);
        long jM1823I = abstractC1482a3.m1823I();
        map.put("{LOAD_TIME_MS}", String.valueOf(jM1823I));
        if (abstractC1482a3.getFormat().isFullscreenAd()) {
            C1767o.a aVarM5147b = this.f2116a.m4773J().m5147b(abstractC1482a3.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarM5147b.m5155a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarM5147b.m5157b()));
            map.put("{FAILOVER_LOAD}", String.valueOf(((C1539e3) abstractC1482a3).m2486z0()));
        }
        m3274a("mlerr", map, maxError, abstractC1482a3);
        Map mapM2785a = AbstractC1568h2.m2785a(abstractC1482a3);
        mapM2785a.putAll(AbstractC1568h2.m2790a(maxError));
        mapM2785a.put("duration_ms", String.valueOf(jM1823I));
        mapM2785a.put("details", "sdk_initialized=" + this.f2116a.m4763D0());
        this.f2116a.m4784R().m2682d(C1548f2.f1551m0, mapM2785a);
    }

    /* JADX INFO: renamed from: a */
    private void m3271a(MaxError maxError, AbstractC1482a3 abstractC1482a3, boolean z) {
        HashMap map = new HashMap(1);
        if (abstractC1482a3 instanceof C1539e3) {
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((C1539e3) abstractC1482a3).m2484x0()));
        }
        m3275a("mierr", map, maxError, abstractC1482a3, z);
        if (!z || abstractC1482a3 == null) {
            return;
        }
        this.f2116a.m4784R().m2097a(C1548f2.f1561r0, abstractC1482a3, maxError, CollectionUtils.map("duration_ms", String.valueOf(abstractC1482a3.m1821G())));
    }

    /* JADX INFO: renamed from: a */
    private void m3272a(String str, List list, Map map, Map map2, MaxError maxError, C1619m3 c1619m3, boolean z) {
        this.f2116a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1532d6(str, list, map, map2, maxError, c1619m3, this.f2116a, z), C1552f6.b.OTHER);
    }

    /* JADX INFO: renamed from: a */
    private void m3273a(String str, Map map, C1619m3 c1619m3) {
        m3274a(str, map, (MaxError) null, c1619m3);
    }

    /* JADX INFO: renamed from: a */
    private void m3274a(String str, Map map, MaxError maxError, C1619m3 c1619m3) {
        m3275a(str, map, maxError, c1619m3, true);
    }

    /* JADX INFO: renamed from: a */
    private void m3275a(String str, Map map, MaxError maxError, C1619m3 c1619m3, boolean z) {
        Map map2 = CollectionUtils.map(map);
        map2.put("{PLACEMENT}", z ? StringUtils.emptyIfNull(c1619m3.getPlacement()) : "");
        map2.put("{CUSTOM_DATA}", z ? StringUtils.emptyIfNull(c1619m3.m3208e()) : "");
        if (c1619m3 instanceof AbstractC1482a3) {
            map2.put("{CREATIVE_ID}", z ? StringUtils.emptyIfNull(((AbstractC1482a3) c1619m3).getCreativeId()) : "");
        }
        m3272a(str, null, map2, null, maxError, c1619m3, z);
    }

    /* JADX INFO: renamed from: a */
    private boolean m3276a(long j) {
        return System.currentTimeMillis() - j <= ((Long) this.f2116a.m4801a(C1831z4.f3721G2)).longValue();
    }

    /* JADX INFO: renamed from: b */
    private C1655h m3277b(C1539e3 c1539e3) {
        C1655h c1655hM1816B = c1539e3.m1816B();
        if (c1655hM1816B != null) {
            return c1655hM1816B;
        }
        this.f2116a.m4773J().m5145a(false);
        if (C1768p.m5160a()) {
            this.f2117b.m5178k("MediationService", "Failed to show " + c1539e3 + ": adapter not found");
        }
        C1768p.m5167h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + c1539e3.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3279b(AbstractC1482a3 abstractC1482a3) {
        this.f2116a.m4856u().m4712b(abstractC1482a3, "DID_LOAD");
        if (abstractC1482a3.m1831R().endsWith("load")) {
            this.f2116a.m4856u().m4711b(abstractC1482a3);
        }
        HashMap map = new HashMap(3);
        long jM1823I = abstractC1482a3.m1823I();
        map.put("{LOAD_TIME_MS}", String.valueOf(jM1823I));
        if (abstractC1482a3.getFormat().isFullscreenAd()) {
            C1767o.a aVarM5147b = this.f2116a.m4773J().m5147b(abstractC1482a3.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarM5147b.m5155a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarM5147b.m5157b()));
            map.put("{FAILOVER_LOAD}", String.valueOf(((C1539e3) abstractC1482a3).m2486z0()));
        }
        m3273a("load", map, abstractC1482a3);
        Map mapM2785a = AbstractC1568h2.m2785a(abstractC1482a3);
        mapM2785a.put("duration_ms", String.valueOf(jM1823I));
        mapM2785a.put("details", "sdk_initialized=" + this.f2116a.m4763D0());
        this.f2116a.m4784R().m2682d(C1548f2.f1548l0, mapM2785a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3280b(AbstractC1482a3 abstractC1482a3, MaxError maxError, MaxAdListener maxAdListener) {
        m3270a(maxError, abstractC1482a3);
        destroyAd(abstractC1482a3);
        AbstractC1793v2.m5376a(maxAdListener, abstractC1482a3.getAdUnitId(), maxError);
    }

    public void collectSignal(final C1551f5 c1551f5, Context context, final C1541e5.a aVar) {
        if (c1551f5 == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        C1519c3 c1519c3M2585u = c1551f5.m2585u();
        final String strM2193b = c1519c3M2585u.m2193b();
        final MaxAdFormat maxAdFormatM2191a = c1519c3M2585u.m2191a();
        C1541e5 c1541e5M2404b = this.f2118c.m2404b(c1551f5, strM2193b, maxAdFormatM2191a);
        if (c1541e5M2404b != null) {
            aVar.mo2503a(C1541e5.m2492a(c1541e5M2404b));
            return;
        }
        final C1655h c1655hM3517a = this.f2116a.m4790V().m3517a(c1551f5, c1551f5.m2583A());
        if (c1655hM3517a == null) {
            aVar.mo2503a(C1541e5.m2495a(c1551f5, new MaxErrorImpl("Could not load adapter")));
            return;
        }
        final C1786u4 c1786u4 = new C1786u4("SignalCollection:" + c1551f5.m3200c());
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Executor executor = C1786u4.f3415j;
        c1786u4.m5300a(executor, new C1786u4.b() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda3
            @Override // com.applovin.impl.C1786u4.b
            /* JADX INFO: renamed from: a */
            public final void mo2509a(boolean z, Object obj, Object obj2) {
                this.f$0.m3252a(jElapsedRealtime, c1655hM3517a, strM2193b, c1551f5, maxAdFormatM2191a, aVar, z, (String) obj, (MaxError) obj2);
            }
        });
        C1612l6.m3141a(c1551f5.m3217m(), c1786u4, new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + c1551f5.m3200c() + ") timed out collecting signal"), "MediationService", this.f2116a);
        final Activity activityM4861w0 = context instanceof Activity ? (Activity) context : this.f2116a.m4861w0();
        final MaxAdapterParametersImpl maxAdapterParametersImplM3248a = MaxAdapterParametersImpl.m3248a(c1551f5, strM2193b, maxAdFormatM2191a);
        if (c1551f5.m2587w()) {
            C1786u4 c1786u4M3505a = this.f2116a.m4789U().m3505a(c1551f5, activityM4861w0);
            c1786u4M3505a.m5301a(executor, new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3269a(c1786u4, c1655hM3517a, maxAdapterParametersImplM3248a, c1551f5, activityM4861w0);
                }
            });
            c1786u4M3505a.m5299a(executor, new C1786u4.a() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda5
                @Override // com.applovin.impl.C1786u4.a
                /* JADX INFO: renamed from: a */
                public final void mo3283a(Object obj) {
                    this.f$0.m3267a(c1655hM3517a, c1786u4, (String) obj);
                }
            });
            return;
        }
        if (c1551f5.m2588x()) {
            C1786u4 c1786u4M3505a2 = this.f2116a.m4789U().m3505a(c1551f5, activityM4861w0);
            if (c1786u4M3505a2.m5308e() && !c1551f5.m2590z()) {
                if (C1768p.m5160a()) {
                    this.f2117b.m5174b("MediationService", "Skip collecting signal for failed-initialized adapter: " + c1655hM3517a.m3573g());
                }
                c1786u4.m5298a(new MaxErrorImpl("Could not initialize adapter: " + ((String) c1786u4M3505a2.m5304b())));
                return;
            }
        }
        if (C1768p.m5160a()) {
            this.f2117b.m5171a("MediationService", "Collecting signal for adapter: " + c1655hM3517a.m3573g());
        }
        c1655hM3517a.m3563a(maxAdapterParametersImplM3248a, c1551f5, activityM4861w0, c1786u4);
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof AbstractC1482a3) {
            if (C1768p.m5160a()) {
                this.f2117b.m5175d("MediationService", "Destroying " + maxAd);
            }
            AbstractC1482a3 abstractC1482a3 = (AbstractC1482a3) maxAd;
            C1655h c1655hM1816B = abstractC1482a3.m1816B();
            if (c1655hM1816B != null) {
                c1655hM1816B.m3559a();
                abstractC1482a3.m1859t();
            }
            this.f2116a.m4838k().m2948c(abstractC1482a3.m1833T());
            this.f2116a.m4842m().m4665a(abstractC1482a3, C1744h.c.DESTROY);
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.f2119d.getAndSet(null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, EnumC1575i enumC1575i, Map<String, Object> map, Map<String, Object> map2, Context context, AbstractC1644a.a aVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No Ad Unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (TextUtils.isEmpty(this.f2116a.m4794X())) {
            C1768p.m5167h("AppLovinSdk", "Mediation provider is null. Please set the mediation provider in the AppLovinSdkInitializationConfiguration.Builder when initializing the AppLovinSDK.");
        }
        if (!this.f2116a.m4763D0()) {
            C1768p.m5169j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        List<String> adUnitIds = this.f2116a.m4776L() != null ? this.f2116a.m4776L().getAdUnitIds() : null;
        boolean zStartsWith = str.startsWith("test_mode");
        if (adUnitIds != null && adUnitIds.size() > 0 && !adUnitIds.contains(str) && !zStartsWith) {
            if (AbstractC1701q7.m4092c(this.f2116a)) {
                String str3 = "Ad Unit ID " + str + " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://support.axon.ai/en/max/android/overview/advanced-settings#selective-init";
                if (((Boolean) this.f2116a.m4801a(C1831z4.f3701D6)).booleanValue()) {
                    throw new RuntimeException(str3);
                }
                if (C1768p.m5160a()) {
                    this.f2117b.m5174b("MediationService", str3);
                }
            }
            this.f2116a.m4764E().m2679a(C1548f2.f1515Z0, "uninitialized_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), "uninitialized_ad_unit_id" + str);
        }
        this.f2116a.m4822c();
        if (str.length() != 16 && !zStartsWith && !this.f2116a.m4839k0().startsWith("05TMD")) {
            C1768p.m5167h("MediationService", "Ad unit ID provided for " + maxAdFormat.getLabel() + " is invalid (" + str + "). Expected length: 16 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (this.f2116a.m4813a(maxAdFormat)) {
            C1768p.m5167h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
            AbstractC1793v2.m5376a(aVar, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
            return;
        }
        this.f2116a.m4793W0();
        AbstractC1793v2.m5379a((MaxAdRequestListener) aVar, str, true);
        if (this.f2116a.m4787T() != null) {
            this.f2116a.m4787T().m3486a(str, str2, maxAdFormat, enumC1575i, map, map2, context, aVar);
        } else {
            this.f2116a.m4785S().m3436a(str, str2, maxAdFormat, enumC1575i, map, map2, context, aVar);
        }
    }

    public void loadThirdPartyMediatedAd(final String str, final AbstractC1482a3 abstractC1482a3, final Activity activity, final AbstractC1644a.a aVar) {
        C1786u4 c1786u4M3505a;
        if (abstractC1482a3 == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (C1768p.m5160a()) {
            this.f2117b.m5171a("MediationService", "Loading " + abstractC1482a3 + "...");
        }
        this.f2116a.m4784R().m2098a(C1548f2.f1545k0, abstractC1482a3, CollectionUtils.hashMap("details", "sdk_initialized=" + this.f2116a.m4763D0()));
        this.f2116a.m4842m().m4665a(abstractC1482a3, C1744h.c.LOADING);
        this.f2116a.m4856u().m4712b(abstractC1482a3, "WILL_LOAD");
        final C1655h c1655hM3516a = this.f2116a.m4790V().m3516a(abstractC1482a3);
        if (c1655hM3516a == null) {
            String str2 = "Failed to load " + abstractC1482a3 + ": adapter not loaded";
            C1768p.m5167h("MediationService", str2);
            m3280b(abstractC1482a3, new MaxErrorImpl(-5001, str2), aVar);
            return;
        }
        final MaxAdapterParametersImpl maxAdapterParametersImplM3247a = MaxAdapterParametersImpl.m3247a(abstractC1482a3);
        if (abstractC1482a3.m1846b0()) {
            c1786u4M3505a = this.f2116a.m4789U().m3505a(abstractC1482a3, activity);
        } else {
            if (abstractC1482a3.m1847c0()) {
                this.f2116a.m4789U().m3505a(abstractC1482a3, activity);
            }
            c1786u4M3505a = null;
        }
        final AbstractC1482a3 abstractC1482a3Mo1840a = abstractC1482a3.mo1840a(c1655hM3516a);
        c1655hM3516a.m3565a(str, abstractC1482a3Mo1840a);
        abstractC1482a3Mo1840a.m1855i0();
        if (c1786u4M3505a == null) {
            c1655hM3516a.m3566a(str, maxAdapterParametersImplM3247a, abstractC1482a3Mo1840a, activity, new C1629b(abstractC1482a3Mo1840a, aVar));
            return;
        }
        Executor executor = C1786u4.f3415j;
        c1786u4M3505a.m5299a(executor, new C1786u4.a() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda6
            @Override // com.applovin.impl.C1786u4.a
            /* JADX INFO: renamed from: a */
            public final void mo3283a(Object obj) {
                this.f$0.m3255a(abstractC1482a3, aVar, (String) obj);
            }
        });
        c1786u4M3505a.m5301a(executor, new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3268a(c1655hM3516a, str, maxAdapterParametersImplM3247a, abstractC1482a3Mo1840a, activity, aVar);
            }
        });
    }

    public void maybeFireAppKilledWhilePlayingMediatedAdPostback() {
        String str = (String) this.f2116a.m4815b(C1511b5.f1160R);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str, new JSONObject());
        if (m3276a(JsonUtils.getLong(jSONObjectJsonObjectFromJsonString, "timestamp_ms", 0L))) {
            Long l = (Long) this.f2116a.m4815b(C1511b5.f1161S);
            String string = l != null ? l.toString() : "";
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "ad_info");
            Map mapTryToStringMap = jSONObject != null ? JsonUtils.tryToStringMap(jSONObject) : new HashMap(1);
            CollectionUtils.putStringIfValid("duration_ms", string, mapTryToStringMap);
            this.f2116a.m4764E().m2682d(C1548f2.f1495P0, mapTryToStringMap);
            List list = JsonUtils.getList(jSONObjectJsonObjectFromJsonString, "app_killed_urls", Collections.EMPTY_LIST);
            if (CollectionUtils.isEmpty(list)) {
                if (C1768p.m5160a()) {
                    this.f2117b.m5178k("MediationService", "Unable to track app killed during mediated ad from previous run. Missing app killed tracking URLs.");
                }
            } else {
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "user_info");
                Map<String, String> mapTryToStringMap2 = jSONObject2 != null ? JsonUtils.tryToStringMap(jSONObject2) : AbstractC1821y3.m5707c(this.f2116a);
                mapTryToStringMap2.put("{IMP_DURATION_MS}", string);
                m3272a("mappk", list, mapTryToStringMap2, null, null, null, true);
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object objM5142a = this.f2116a.m4773J().m5142a();
            if (objM5142a instanceof AbstractC1482a3) {
                m3271a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (AbstractC1482a3) objM5142a, true);
            }
        }
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, AbstractC1482a3 abstractC1482a3) {
        m3271a(maxError, abstractC1482a3, false);
    }

    public void processAdapterInitializationPostback(C1619m3 c1619m3, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap map = new HashMap(2);
        map.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        map.put("{INIT_TIME_MS}", String.valueOf(j));
        m3274a("minit", map, new MaxErrorImpl(str), c1619m3);
        Map mapM2786a = AbstractC1568h2.m2786a(c1619m3);
        CollectionUtils.putStringIfValid("adapter_init_status", String.valueOf(initializationStatus.getCode()), mapM2786a);
        CollectionUtils.putStringIfValid("error_message", str, mapM2786a);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j), mapM2786a);
        switch (C1628a.f2120a[initializationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f2116a.m4784R().m2682d(C1548f2.f1524d0, mapM2786a);
                break;
            case 4:
                this.f2116a.m4784R().m2682d(C1548f2.f1527e0, mapM2786a);
                break;
            case 5:
            case 6:
                this.f2116a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f2116a.m4782Q().m5178k("MediationService", "Adapter init postback called while the adapter is not fully initialized.");
                }
                this.f2116a.m4764E().m2678a(C1548f2.f1523d, "adapterNotInitializedForPostback", mapM2786a);
                break;
        }
    }

    public void processCallbackAdImpressionPostback(AbstractC1482a3 abstractC1482a3, AbstractC1644a.a aVar) {
        if (abstractC1482a3.m1831R().endsWith("cimp")) {
            this.f2116a.m4856u().m4711b(abstractC1482a3);
            AbstractC1793v2.m5380a((MaxAdRevenueListener) aVar, (MaxAd) abstractC1482a3);
        }
        HashMap map = new HashMap(2);
        if (abstractC1482a3 instanceof C1539e3) {
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((C1539e3) abstractC1482a3).m2484x0()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f2116a.m4865y0().m3898e());
        if (!((Boolean) this.f2116a.m4801a(C1831z4.f3762L3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        m3273a("mcimp", map, abstractC1482a3);
        this.f2116a.m4784R().m2095a(C1548f2.f1557p0, abstractC1482a3);
    }

    public void processRawAdImpression(AbstractC1482a3 abstractC1482a3, AbstractC1644a.a aVar) {
        this.f2116a.m4856u().m4712b(abstractC1482a3, "WILL_DISPLAY");
        if (abstractC1482a3.m1831R().endsWith("mimp")) {
            this.f2116a.m4856u().m4711b(abstractC1482a3);
            AbstractC1793v2.m5380a((MaxAdRevenueListener) aVar, (MaxAd) abstractC1482a3);
        }
        if (((Boolean) this.f2116a.m4801a(C1831z4.f3795P4)).booleanValue()) {
            this.f2116a.m4814a0().m5526a(C1785u3.f3407g, C1794v3.m5459a(abstractC1482a3), Long.valueOf(System.currentTimeMillis() - this.f2116a.m4777M()));
        }
        HashMap map = new HashMap(3);
        if (abstractC1482a3 instanceof C1539e3) {
            C1539e3 c1539e3 = (C1539e3) abstractC1482a3;
            map.put("{TIME_TO_SHOW_MS}", String.valueOf(c1539e3.m2479s0()));
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(c1539e3.m2484x0()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f2116a.m4865y0().m3898e());
        if (!((Boolean) this.f2116a.m4801a(C1831z4.f3762L3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        m3273a("mimp", map, abstractC1482a3);
        this.f2116a.m4784R().m2095a(C1548f2.f1555o0, abstractC1482a3);
    }

    public void processViewabilityAdImpressionPostback(AbstractC1589j3 abstractC1589j3, long j, AbstractC1644a.a aVar) {
        if (abstractC1589j3.m1831R().endsWith("vimp")) {
            this.f2116a.m4856u().m4711b(abstractC1589j3);
            AbstractC1793v2.m5380a((MaxAdRevenueListener) aVar, (MaxAd) abstractC1589j3);
        }
        HashMap map = new HashMap(3);
        map.put("{VIEWABILITY_FLAGS}", String.valueOf(j));
        map.put("{USED_VIEWABILITY_TIMER}", String.valueOf(abstractC1589j3.m2986t0()));
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f2116a.m4865y0().m3898e());
        if (!((Boolean) this.f2116a.m4801a(C1831z4.f3762L3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        m3273a("mvimp", map, abstractC1589j3);
        this.f2116a.m4784R().m2095a(C1548f2.f1559q0, abstractC1589j3);
    }

    public void processWaterfallInfoPostback(MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, MaxError maxError, long j, long j2) {
        C1519c3 requestParameters = maxAdWaterfallInfoImpl.getRequestParameters();
        String strM2193b = requestParameters.m2193b();
        MaxAdFormat maxAdFormatM2191a = requestParameters.m2191a();
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, maxAdFormatM2191a.getLabel(), map);
        CollectionUtils.putStringIfValid("ad_unit_id", strM2193b, map);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j2), map);
        CollectionUtils.putStringIfValid("ad_event_id", maxAdWaterfallInfoImpl.getEventId(), map);
        if (maxError != null) {
            map.putAll(AbstractC1568h2.m2790a(maxError));
        }
        this.f2116a.m4784R().m2682d(C1548f2.f1553n0, map);
        if (CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        HashMap map2 = new HashMap(8);
        CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), map2);
        CollectionUtils.putStringIfValid("ad_unit_id", strM2193b, map2);
        CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, maxAdFormatM2191a.getLabel(), map2);
        CollectionUtils.putStringIfValid("name", maxAdWaterfallInfoImpl.getName(), map2);
        CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j2), map2);
        CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j), map2);
        CollectionUtils.putLongIfValid("wf_latency_ms", Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), map2);
        map2.put("arn_info", requestParameters.m2197f().m2769e());
        List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
        ArrayList arrayList = new ArrayList(networkResponses.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
            MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
            HashMap map3 = new HashMap(5);
            CollectionUtils.putStringIfValid("bcode", ((MaxNetworkResponseInfoImpl) maxNetworkResponseInfo).getBCode(), map3);
            map3.put("name", mediatedNetwork.getName());
            CollectionUtils.putLongIfValid("latency_ms", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()), map3);
            map3.put("load_state", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
            MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxNetworkResponseInfo.getError();
            if (maxErrorImpl != null) {
                HashMap map4 = new HashMap(4);
                map4.put("error_code", Integer.valueOf(maxErrorImpl.getCode()));
                map4.put("error_message", maxErrorImpl.getMessage());
                map4.put("third_party_sdk_error_code", Integer.valueOf(maxErrorImpl.getMediatedNetworkErrorCode()));
                map4.put("third_party_sdk_error_message", maxErrorImpl.getMediatedNetworkErrorMessage());
                map3.put("error_info", map4);
            }
            arrayList.add(map3);
        }
        map2.put("ads_info", arrayList);
        m3272a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), Collections.EMPTY_MAP, map2, null, null, false);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f2119d.set(jSONObject);
    }

    public void showFullscreenAd(final C1539e3 c1539e3, final Activity activity, Map<String, Object> map, Map<String, Object> map2, final AbstractC1644a.a aVar) {
        if (c1539e3 == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null && MaxAdFormat.APP_OPEN != c1539e3.getFormat()) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f2116a.m4773J().m5145a(true);
        final C1655h c1655hM3277b = m3277b(c1539e3);
        long jM2481u0 = c1539e3.m2481u0();
        if (((Boolean) this.f2116a.m4801a(AbstractC1776t3.f3352h8)).booleanValue() && this.f2116a.m4787T() == null && this.f2116a.m4785S().m3437a((MaxAd) c1539e3)) {
            this.f2116a.m4785S().m3436a(c1539e3.getAdUnitId(), (String) null, c1539e3.getFormat(), EnumC1575i.SEQUENTIAL_OR_PRECACHE, map, map2, activity, (AbstractC1644a.a) null);
        }
        if (C1768p.m5160a()) {
            this.f2117b.m5175d("MediationService", "Showing ad " + c1539e3.getAdUnitId() + " with delay of " + jM2481u0 + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3259a(c1539e3, c1655hM3277b, activity, aVar);
            }
        }, jM2481u0);
    }

    public void showFullscreenAd(final C1539e3 c1539e3, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity, Map<String, Object> map, Map<String, Object> map2, final AbstractC1644a.a aVar) {
        if (c1539e3 == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f2116a.m4773J().m5145a(true);
        final C1655h c1655hM3277b = m3277b(c1539e3);
        long jM2481u0 = c1539e3.m2481u0();
        if (((Boolean) this.f2116a.m4801a(AbstractC1776t3.f3352h8)).booleanValue() && this.f2116a.m4787T() == null && this.f2116a.m4785S().m3437a((MaxAd) c1539e3)) {
            this.f2116a.m4785S().m3436a(c1539e3.getAdUnitId(), (String) null, c1539e3.getFormat(), EnumC1575i.SEQUENTIAL_OR_PRECACHE, map, map2, activity, (AbstractC1644a.a) null);
        }
        if (C1768p.m5160a()) {
            this.f2117b.m5175d("MediationService", "Showing ad " + c1539e3.getAdUnitId() + " with delay of " + jM2481u0 + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3260a(c1539e3, c1655hM3277b, viewGroup, lifecycle, activity, aVar);
            }
        }, jM2481u0);
    }
}
