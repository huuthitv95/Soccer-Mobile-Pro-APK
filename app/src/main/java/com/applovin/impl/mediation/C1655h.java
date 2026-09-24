package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.AbstractC1482a3;
import com.applovin.impl.AbstractC1776t3;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1539e3;
import com.applovin.impl.C1551f5;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1619m3;
import com.applovin.impl.C1786u4;
import com.applovin.impl.C1788u6;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.internal.security.CertificateUtil;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.vungle.ads.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.applovin.impl.mediation.h */
/* JADX INFO: loaded from: classes9.dex */
public class C1655h {

    /* JADX INFO: renamed from: b */
    private final C1748l f2345b;

    /* JADX INFO: renamed from: c */
    private final C1768p f2346c;

    /* JADX INFO: renamed from: d */
    private final String f2347d;

    /* JADX INFO: renamed from: e */
    private final C1619m3 f2348e;

    /* JADX INFO: renamed from: f */
    private final String f2349f;

    /* JADX INFO: renamed from: g */
    private MaxAdapter f2350g;

    /* JADX INFO: renamed from: h */
    private String f2351h;

    /* JADX INFO: renamed from: i */
    private AbstractC1482a3 f2352i;

    /* JADX INFO: renamed from: j */
    private View f2353j;

    /* JADX INFO: renamed from: k */
    private MaxNativeAd f2354k;

    /* JADX INFO: renamed from: l */
    private MaxNativeAdView f2355l;

    /* JADX INFO: renamed from: m */
    private ViewGroup f2356m;

    /* JADX INFO: renamed from: o */
    private MaxAdapterResponseParameters f2358o;

    /* JADX INFO: renamed from: s */
    private final boolean f2362s;

    /* JADX INFO: renamed from: a */
    private final Handler f2344a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n */
    private final b f2357n = new b(this, null);

    /* JADX INFO: renamed from: p */
    private final AtomicBoolean f2359p = new AtomicBoolean(true);

    /* JADX INFO: renamed from: q */
    private final AtomicBoolean f2360q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r */
    private final AtomicBoolean f2361r = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.applovin.impl.mediation.h$a */
    /* JADX INFO: loaded from: classes3.dex */
    class a implements MaxSignalCollectionListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1551f5 f2363a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C1786u4 f2364b;

        a(C1551f5 c1551f5, C1786u4 c1786u4) {
            this.f2363a = c1551f5;
            this.f2364b = c1786u4;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            if (this.f2363a.m2589y() && TextUtils.isEmpty(str)) {
                this.f2364b.m5298a(new MaxErrorImpl("Signal is not a valid string"));
            } else {
                this.f2364b.m5303b(str);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            this.f2364b.m5298a(new MaxErrorImpl(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.mediation.h$b */
    /* JADX INFO: loaded from: classes3.dex */
    class b implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {

        /* JADX INFO: renamed from: a */
        private MediationServiceImpl.C1629b f2366a;

        private b() {
        }

        /* synthetic */ b(C1655h c1655h, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3579a() {
            this.f2366a.onAdCollapsed(C1655h.this.f2352i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3580a(Bundle bundle) {
            this.f2366a.m3286a(C1655h.this.f2352i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3581a(C1539e3 c1539e3, MaxReward maxReward, Bundle bundle) {
            this.f2366a.m3288a(c1539e3, maxReward, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m3582a(MediationServiceImpl.C1629b c1629b) {
            if (c1629b == null) {
                throw new IllegalArgumentException("No listener specified");
            }
            this.f2366a = c1629b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3586a(MaxError maxError) {
            if (C1655h.this.f2360q.compareAndSet(false, true)) {
                this.f2366a.onAdLoadFailed(C1655h.this.f2351h, maxError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3587a(MaxError maxError, Bundle bundle) {
            this.f2366a.m3287a(C1655h.this.f2352i, maxError, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3588a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th) {
                C1768p.m5164c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + (maxAdListener != null ? maxAdListener.getClass().getName() : null), th);
                C1655h.this.f2345b.m4764E().m4332a("MediationAdapterWrapper", str, th, CollectionUtils.hashMap("adapter_class", C1655h.this.f2348e.m3196b()));
            }
        }

        /* JADX INFO: renamed from: a */
        private void m3589a(String str, final Bundle bundle) {
            if (!C1655h.this.f2352i.m1863x().get()) {
                if (((Boolean) C1655h.this.f2345b.m4801a(AbstractC1776t3.f3382z8)).booleanValue()) {
                    m3590a(str, this.f2366a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda9
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m3600g(bundle);
                        }
                    });
                    return;
                } else {
                    if (C1655h.this.f2352i.m1860u().compareAndSet(false, true)) {
                        m3590a(str, this.f2366a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda10
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.m3601h(bundle);
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5174b("MediationAdapterWrapper", C1655h.this.f2349f + ": blocking ad displayed callback for " + C1655h.this.f2352i + " since onAdHidden() has been called");
            }
            C1655h.this.f2345b.m4856u().m4703a(C1655h.this.f2352i, str);
        }

        /* JADX INFO: renamed from: a */
        private void m3590a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            C1655h.this.f2344a.post(new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3588a(runnable, maxAdListener, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m3591a(String str, final MaxError maxError) {
            if (!C1655h.this.f2352i.m1863x().get()) {
                m3590a(str, this.f2366a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3586a(maxError);
                    }
                });
                return;
            }
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5174b("MediationAdapterWrapper", C1655h.this.f2349f + ": blocking ad load failed callback for " + C1655h.this.f2352i + " since onAdHidden() has been called");
            }
            C1655h.this.f2345b.m4856u().m4703a(C1655h.this.f2352i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m3592a(String str, final MaxError maxError, final Bundle bundle) {
            if (!C1655h.this.f2352i.m1863x().get()) {
                m3590a(str, this.f2366a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3587a(maxError, bundle);
                    }
                });
                return;
            }
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5174b("MediationAdapterWrapper", C1655h.this.f2349f + ": blocking ad display failed callback for " + C1655h.this.f2352i + " since onAdHidden() has been called");
            }
            C1655h.this.f2345b.m4856u().m4703a(C1655h.this.f2352i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public /* synthetic */ void m3593b(Bundle bundle) {
            this.f2366a.m3291d(C1655h.this.f2352i, bundle);
        }

        /* JADX INFO: renamed from: b */
        private void m3594b(String str, final Bundle bundle) {
            if (C1655h.this.f2352i.m1863x().compareAndSet(false, true)) {
                m3590a(str, this.f2366a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3602i(bundle);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public /* synthetic */ void m3595c(Bundle bundle) {
            this.f2366a.m3286a(C1655h.this.f2352i, bundle);
        }

        /* JADX INFO: renamed from: c */
        private void m3596c(String str, final Bundle bundle) {
            if (!C1655h.this.f2352i.m1863x().get()) {
                C1655h.this.f2361r.set(true);
                m3590a(str, this.f2366a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3603j(bundle);
                    }
                });
                return;
            }
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5174b("MediationAdapterWrapper", C1655h.this.f2349f + ": blocking ad loaded callback for " + C1655h.this.f2352i + " since onAdHidden() has been called");
            }
            C1655h.this.f2345b.m4856u().m4703a(C1655h.this.f2352i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public /* synthetic */ void m3597d(Bundle bundle) {
            this.f2366a.m3286a(C1655h.this.f2352i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public /* synthetic */ void m3598e(Bundle bundle) {
            this.f2366a.m3286a(C1655h.this.f2352i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public /* synthetic */ void m3599f(Bundle bundle) {
            this.f2366a.m3286a(C1655h.this.f2352i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public /* synthetic */ void m3600g(Bundle bundle) {
            this.f2366a.m3290c(C1655h.this.f2352i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public /* synthetic */ void m3601h(Bundle bundle) {
            this.f2366a.m3290c(C1655h.this.f2352i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public /* synthetic */ void m3602i(Bundle bundle) {
            this.f2366a.m3292e(C1655h.this.f2352i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public /* synthetic */ void m3603j(Bundle bundle) {
            if (C1655h.this.f2360q.compareAndSet(false, true)) {
                this.f2366a.m3293f(C1655h.this.f2352i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(final Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": adview ad clicked with extra info: " + bundle);
            }
            m3590a("onAdViewAdClicked", this.f2366a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3580a(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": adview ad collapsed");
            }
            m3590a("onAdViewAdCollapsed", this.f2366a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3579a();
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5178k("MediationAdapterWrapper", C1655h.this.f2349f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            m3592a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": adview ad displayed with extra info: " + bundle);
            }
            m3589a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(final Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": adview ad expanded");
            }
            m3590a("onAdViewAdExpanded", this.f2366a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3593b(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": adview ad hidden with extra info: " + bundle);
            }
            m3594b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5178k("MediationAdapterWrapper", C1655h.this.f2349f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            m3591a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": adview ad loaded with extra info: " + bundle);
            }
            C1655h.this.f2353j = view;
            m3596c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(final Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": app open ad clicked with extra info: " + bundle);
            }
            m3590a("onAppOpenAdClicked", this.f2366a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3595c(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5178k("MediationAdapterWrapper", C1655h.this.f2349f + ": app open ad display failed with error: " + maxAdapterError);
            }
            m3592a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": app open ad displayed with extra info: " + bundle);
            }
            m3589a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": app open ad hidden with extra info: " + bundle);
            }
            m3594b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5178k("MediationAdapterWrapper", C1655h.this.f2349f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            m3591a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": app open ad loaded with extra info: " + bundle);
            }
            m3596c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(final Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": interstitial ad clicked with extra info: " + bundle);
            }
            m3590a("onInterstitialAdClicked", this.f2366a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3597d(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5178k("MediationAdapterWrapper", C1655h.this.f2349f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            m3592a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": interstitial ad displayed with extra info: " + bundle);
            }
            m3589a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": interstitial ad hidden with extra info " + bundle);
            }
            m3594b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5178k("MediationAdapterWrapper", C1655h.this.f2349f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            m3591a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": interstitial ad loaded with extra info: " + bundle);
            }
            m3596c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(final Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": native ad clicked");
            }
            m3590a("onNativeAdClicked", this.f2366a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3598e(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": native ad displayed with extra info: " + bundle);
            }
            m3589a("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5178k("MediationAdapterWrapper", C1655h.this.f2349f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            m3591a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": native ad loaded with extra info: " + bundle);
            }
            C1655h.this.f2354k = maxNativeAd;
            m3596c("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(final Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": rewarded ad clicked with extra info: " + bundle);
            }
            m3590a("onRewardedAdClicked", this.f2366a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3599f(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5178k("MediationAdapterWrapper", C1655h.this.f2349f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            m3592a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": rewarded ad displayed with extra info: " + bundle);
            }
            m3589a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": rewarded ad hidden with extra info: " + bundle);
            }
            m3594b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5178k("MediationAdapterWrapper", C1655h.this.f2349f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            m3591a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            C1768p unused = C1655h.this.f2346c;
            if (C1768p.m5160a()) {
                C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": rewarded ad loaded with extra info: " + bundle);
            }
            m3596c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(final MaxReward maxReward, final Bundle bundle) {
            if (C1655h.this.f2352i instanceof C1539e3) {
                final C1539e3 c1539e3 = (C1539e3) C1655h.this.f2352i;
                if (c1539e3.m2483w0().compareAndSet(false, true)) {
                    C1768p unused = C1655h.this.f2346c;
                    if (C1768p.m5160a()) {
                        C1655h.this.f2346c.m5175d("MediationAdapterWrapper", C1655h.this.f2349f + ": user was rewarded: " + maxReward);
                    }
                    m3590a("onUserRewarded", this.f2366a, new Runnable() { // from class: com.applovin.impl.mediation.h$b$$ExternalSyntheticLambda7
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m3581a(c1539e3, maxReward, bundle);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.mediation.h$c */
    /* JADX INFO: loaded from: classes3.dex */
    static class c implements MaxAdapter.OnCompletionListener {

        /* JADX INFO: renamed from: a */
        private final C1748l f2368a;

        /* JADX INFO: renamed from: b */
        private final C1619m3 f2369b;

        /* JADX INFO: renamed from: c */
        private final long f2370c;

        /* JADX INFO: renamed from: d */
        private final MaxAdapter.OnCompletionListener f2371d;

        public c(C1748l c1748l, C1619m3 c1619m3, long j, MaxAdapter.OnCompletionListener onCompletionListener) {
            this.f2368a = c1748l;
            this.f2369b = c1619m3;
            this.f2370c = j;
            this.f2371d = onCompletionListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3604a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.f2368a.m4789U().m3509a(this.f2369b, SystemClock.elapsedRealtime() - this.f2370c, initializationStatus, str);
            MaxAdapter.OnCompletionListener onCompletionListener = this.f2371d;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(initializationStatus, str);
            }
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.h$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3604a(initializationStatus, str);
                }
            }, this.f2369b.m3213h());
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.h$d */
    /* JADX INFO: loaded from: classes3.dex */
    private class d extends AbstractRunnableC1601k5 {

        /* JADX INFO: renamed from: g */
        private final WeakReference f2372g;

        private d() {
            super("TaskTimeoutMediatedAd", C1655h.this.f2345b);
            this.f2372g = new WeakReference(C1655h.this.f2357n);
        }

        /* synthetic */ d(C1655h c1655h, a aVar) {
            this();
        }

        /* JADX INFO: renamed from: b */
        private void m3605b(AbstractC1482a3 abstractC1482a3) {
            if (abstractC1482a3 != null) {
                this.f1969a.m4820b0().m5575a(abstractC1482a3);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1655h.this.f2360q.get()) {
                return;
            }
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, C1655h.this.f2349f + " is timing out " + C1655h.this.f2352i + "...");
            }
            m3605b(C1655h.this.f2352i);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            b bVar = (b) this.f2372g.get();
            if (bVar != null) {
                bVar.m3591a(this.f1970b, maxErrorImpl);
            }
        }
    }

    C1655h(C1619m3 c1619m3, MaxAdapter maxAdapter, boolean z, C1748l c1748l) {
        if (c1619m3 == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f2347d = c1619m3.m3200c();
        this.f2350g = maxAdapter;
        this.f2345b = c1748l;
        this.f2346c = c1748l.m4782Q();
        this.f2348e = c1619m3;
        this.f2349f = maxAdapter.getClass().getSimpleName();
        this.f2362s = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3526a(Activity activity) {
        ((MaxInterstitialAdapter) this.f2350g).showInterstitialAd(this.f2358o, activity, this.f2357n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3527a(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.f2350g).showInterstitialAd(this.f2358o, viewGroup, lifecycle, activity, this.f2357n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3528a(AbstractC1482a3 abstractC1482a3, Runnable runnable) {
        m3530a(this.f2348e, abstractC1482a3);
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start loading ad for " + this.f2347d + " due to: " + th;
            C1768p.m5167h("MediationAdapterWrapper", str);
            this.f2357n.m3591a(Constants.LOAD_AD, new MaxErrorImpl(-1, str));
            this.f2345b.m4764E().m4332a("MediationAdapterWrapper", Constants.LOAD_AD, th, CollectionUtils.hashMap("adapter_class", this.f2348e.m3196b()));
            m3537a(Constants.LOAD_AD);
            this.f2345b.m4790V().m3519a(this.f2348e.m3196b(), Constants.LOAD_AD, this.f2352i);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3529a(AbstractRunnableC1601k5 abstractRunnableC1601k5, C1619m3 c1619m3, AbstractC1482a3 abstractC1482a3) {
        long jM3217m = c1619m3.m3217m();
        if (jM3217m <= 0) {
            if (C1768p.m5160a()) {
                C1768p c1768p = this.f2346c;
                StringBuilder sb = new StringBuilder("Non-positive timeout set for ");
                if (abstractC1482a3 != null) {
                    c1619m3 = abstractC1482a3;
                }
                sb.append(c1619m3);
                sb.append(", not scheduling a timeout");
                c1768p.m5171a("MediationAdapterWrapper", sb.toString());
                return;
            }
            return;
        }
        if (C1768p.m5160a()) {
            C1768p c1768p2 = this.f2346c;
            StringBuilder sb2 = new StringBuilder("Setting timeout ");
            sb2.append(jM3217m);
            sb2.append("ms for ");
            if (abstractC1482a3 != null) {
                c1619m3 = abstractC1482a3;
            }
            sb2.append(c1619m3);
            c1768p2.m5171a("MediationAdapterWrapper", sb2.toString());
        }
        this.f2345b.m4853s0().m2605a(abstractRunnableC1601k5, C1552f6.b.TIMEOUT, jM3217m);
    }

    /* JADX INFO: renamed from: a */
    private void m3530a(C1619m3 c1619m3, AbstractC1482a3 abstractC1482a3) {
        m3529a(new d(this, null), c1619m3, abstractC1482a3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3531a(MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (C1768p.m5160a()) {
            this.f2346c.m5171a("MediationAdapterWrapper", "Initializing " + this.f2349f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.f2348e.m3222r());
        }
        this.f2350g.initialize(maxAdapterInitializationParameters, activity, new c(this.f2345b, this.f2348e, jElapsedRealtime, onCompletionListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3532a(MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, C1551f5 c1551f5, C1786u4 c1786u4) {
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(c1551f5, c1786u4));
        } catch (Throwable th) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.f2347d + " due to: " + th);
            C1768p.m5167h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            c1786u4.m5298a(maxErrorImpl);
            this.f2345b.m4764E().m4332a("MediationAdapterWrapper", "collect_signal", th, CollectionUtils.hashMap("adapter_class", this.f2348e.m3196b()));
            m3537a("collect_signal");
            this.f2345b.m4790V().m3519a(this.f2348e.m3196b(), "collect_signal", this.f2352i);
        }
        if (!c1786u4.m5307d() && c1551f5.m3217m() == 0) {
            if (C1768p.m5160a()) {
                this.f2346c.m5171a("MediationAdapterWrapper", "Failing signal collection " + c1551f5 + " since it has 0 timeout");
            }
            c1786u4.m5298a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + this.f2349f + ") has 0 timeout"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3533a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.f2350g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.f2357n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3534a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.f2350g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.f2357n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3535a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start displaying ad for " + this.f2347d + " due to: " + th;
            C1768p.m5167h("MediationAdapterWrapper", str);
            this.f2357n.m3592a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.f2345b.m4764E().m4332a("MediationAdapterWrapper", "show_ad", th, CollectionUtils.hashMap("adapter_class", this.f2348e.m3196b()));
            m3537a("show_ad");
            this.f2345b.m4790V().m3519a(this.f2348e.m3196b(), "show_ad", this.f2352i);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3536a(final Runnable runnable, AbstractC1482a3 abstractC1482a3) {
        abstractC1482a3.m1851g0();
        m3538a("show_ad", abstractC1482a3.getFormat(), new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3535a(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private void m3537a(String str) {
        if (C1768p.m5160a()) {
            this.f2346c.m5175d("MediationAdapterWrapper", "Marking " + this.f2349f + " as disabled due to: " + str);
        }
        this.f2359p.set(false);
    }

    /* JADX INFO: renamed from: a */
    private void m3538a(final String str, MaxAdFormat maxAdFormat, final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3539a(str, runnable);
            }
        };
        if (m3541a(str, maxAdFormat)) {
            this.f2344a.post(runnable2);
            return;
        }
        C1788u6 c1788u6 = new C1788u6(this.f2345b, str + CertificateUtil.DELIMITER + this.f2348e.m3200c(), runnable2);
        if (((Boolean) this.f2345b.m4801a(C1831z4.f3870Z)).booleanValue()) {
            this.f2345b.m4853s0().m2607a(c1788u6, this.f2348e);
        } else {
            this.f2345b.m4853s0().m2603a(c1788u6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3539a(String str, Runnable runnable) {
        try {
            if (C1768p.m5160a()) {
                this.f2346c.m5171a("MediationAdapterWrapper", this.f2349f + ": running " + str + "...");
            }
            runnable.run();
            if (C1768p.m5160a()) {
                this.f2346c.m5171a("MediationAdapterWrapper", this.f2349f + ": finished " + str + "");
            }
        } catch (Throwable th) {
            C1768p.m5164c("MediationAdapterWrapper", "Failed operation " + str + " for " + this.f2347d, th);
            StringBuilder sb = new StringBuilder("fail_");
            sb.append(str);
            m3537a(sb.toString());
            if (!str.equals("destroy")) {
                this.f2345b.m4790V().m3519a(this.f2348e.m3196b(), str, this.f2352i);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("is_wrapper", "true");
            CollectionUtils.putStringIfValid("adapter_class", this.f2348e.m3196b(), mapHashMap);
            this.f2345b.m4764E().m4332a("MediationAdapterWrapper", str, th, mapHashMap);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m3540a(AbstractC1482a3 abstractC1482a3, Activity activity) {
        if (abstractC1482a3 == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (abstractC1482a3.m1816B() == null) {
            C1768p.m5167h("MediationAdapterWrapper", "Adapter has been garbage collected");
            this.f2357n.m3592a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
            return false;
        }
        if (abstractC1482a3.m1816B() != this) {
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        if (activity == null && MaxAdFormat.APP_OPEN != abstractC1482a3.getFormat()) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (this.f2359p.get()) {
            if (m3576j()) {
                return true;
            }
            throw new IllegalStateException("Mediation adapter '" + this.f2349f + "' does not have an ad loaded. Please load an ad first");
        }
        String str = "Mediation adapter '" + this.f2349f + "' is disabled. Showing ads with this adapter is disabled.";
        C1768p.m5167h("MediationAdapterWrapper", str);
        this.f2357n.m3592a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m3541a(String str, MaxAdFormat maxAdFormat) {
        Boolean boolM1856j0;
        Boolean boolM1858l0;
        Boolean boolM1857k0;
        MaxAdapter maxAdapter = this.f2350g;
        if (maxAdapter == null) {
            return this.f2348e.m3222r();
        }
        if (MobileAdsBridgeBase.initializeMethodName.equals(str)) {
            Boolean boolShouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (boolShouldInitializeOnUiThread != null) {
                return boolShouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            Boolean boolShouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (boolShouldCollectSignalsOnUiThread != null) {
                return boolShouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if (Constants.LOAD_AD.equals(str) && maxAdFormat != null) {
            AbstractC1482a3 abstractC1482a3 = this.f2352i;
            if (abstractC1482a3 != null && (boolM1857k0 = abstractC1482a3.m1857k0()) != null) {
                return boolM1857k0.booleanValue();
            }
            Boolean boolShouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (boolShouldLoadAdsOnUiThread != null) {
                return boolShouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null) {
            AbstractC1482a3 abstractC1482a4 = this.f2352i;
            if (abstractC1482a4 != null && (boolM1858l0 = abstractC1482a4.m1858l0()) != null) {
                return boolM1858l0.booleanValue();
            }
            Boolean boolShouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat);
            if (boolShouldShowAdsOnUiThread != null) {
                return boolShouldShowAdsOnUiThread.booleanValue();
            }
        } else if ("destroy".equals(str)) {
            AbstractC1482a3 abstractC1482a5 = this.f2352i;
            if (abstractC1482a5 != null && (boolM1856j0 = abstractC1482a5.m1856j0()) != null) {
                return boolM1856j0.booleanValue();
            }
            Boolean boolShouldDestroyOnUiThread = maxAdapter.shouldDestroyOnUiThread();
            if (boolShouldDestroyOnUiThread != null) {
                return boolShouldDestroyOnUiThread.booleanValue();
            }
            return true;
        }
        return this.f2348e.m3222r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m3543b(Activity activity) {
        ((MaxAppOpenAdapter) this.f2350g).showAppOpenAd(this.f2358o, activity, this.f2357n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m3544b(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.f2350g).showRewardedAd(this.f2358o, viewGroup, lifecycle, activity, this.f2357n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m3545b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.f2350g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.f2357n);
    }

    /* JADX INFO: renamed from: b */
    private void m3546b(String str, Runnable runnable) {
        m3538a(str, (MaxAdFormat) null, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m3548c(Activity activity) {
        ((MaxRewardedAdapter) this.f2350g).showRewardedAd(this.f2358o, activity, this.f2357n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m3549c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.f2350g).loadRewardedAd(maxAdapterResponseParameters, activity, this.f2357n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m3551d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.f2350g).loadNativeAd(maxAdapterResponseParameters, activity, this.f2357n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m3558l() {
        m3537a("destroy");
        MaxAdapter maxAdapter = this.f2350g;
        if (maxAdapter != null) {
            this.f2350g = null;
            maxAdapter.onDestroy();
        } else if (C1768p.m5160a()) {
            this.f2346c.m5178k("MediationAdapterWrapper", "Mediation adapter '" + this.f2349f + "' is already destroyed");
        }
        this.f2353j = null;
        this.f2354k = null;
        this.f2355l = null;
        this.f2356m = null;
    }

    /* JADX INFO: renamed from: a */
    void m3559a() {
        if (this.f2362s) {
            return;
        }
        m3546b("destroy", new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3558l();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m3560a(ViewGroup viewGroup) {
        this.f2356m = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public void m3561a(AbstractC1482a3 abstractC1482a3, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity) {
        Runnable runnable;
        if (m3540a(abstractC1482a3, activity)) {
            if (abstractC1482a3.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda15
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3527a(viewGroup, lifecycle, activity);
                    }
                };
            } else {
                if (abstractC1482a3.getFormat() != MaxAdFormat.REWARDED) {
                    throw new IllegalStateException("Failed to show " + abstractC1482a3 + ": " + abstractC1482a3.getFormat() + " is not a supported ad format");
                }
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3544b(viewGroup, lifecycle, activity);
                    }
                };
            }
            m3536a(runnable, abstractC1482a3);
        }
    }

    /* JADX INFO: renamed from: a */
    void m3562a(final MaxAdapterInitializationParameters maxAdapterInitializationParameters, final Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        m3546b(MobileAdsBridgeBase.initializeMethodName, new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3531a(onCompletionListener, maxAdapterInitializationParameters, activity);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    void m3563a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final C1551f5 c1551f5, final Activity activity, final C1786u4 c1786u4) {
        if (c1786u4 == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        if (!this.f2359p.get()) {
            C1768p.m5167h("MediationAdapterWrapper", "Mediation adapter '" + this.f2349f + "' is disabled. Signal collection ads with this adapter is disabled.");
            c1786u4.m5298a(new MaxErrorImpl("The adapter (" + this.f2349f + ") is disabled"));
            return;
        }
        MaxAdapter maxAdapter = this.f2350g;
        if (maxAdapter instanceof MaxSignalProvider) {
            final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
            m3546b("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3532a(maxSignalProvider, maxAdapterSignalCollectionParameters, activity, c1551f5, c1786u4);
                }
            });
        } else {
            c1786u4.m5298a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, "The adapter (" + this.f2349f + ") does not support signal collection"));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3564a(MaxNativeAdView maxNativeAdView) {
        this.f2355l = maxNativeAdView;
    }

    /* JADX INFO: renamed from: a */
    void m3565a(String str, AbstractC1482a3 abstractC1482a3) {
        this.f2351h = str;
        this.f2352i = abstractC1482a3;
    }

    /* JADX INFO: renamed from: a */
    public void m3566a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final AbstractC1482a3 abstractC1482a3, final Activity activity, MediationServiceImpl.C1629b c1629b) {
        final Runnable runnable;
        if (abstractC1482a3 == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (!this.f2359p.get()) {
            String str2 = "Mediation adapter '" + this.f2349f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
            C1768p.m5167h("MediationAdapterWrapper", str2);
            c1629b.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
            return;
        }
        this.f2358o = maxAdapterResponseParameters;
        this.f2357n.m3582a(c1629b);
        final MaxAdFormat format = abstractC1482a3.getFormat();
        if (format == MaxAdFormat.INTERSTITIAL) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3533a(maxAdapterResponseParameters, activity);
                }
            };
        } else if (format == MaxAdFormat.APP_OPEN) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3545b(maxAdapterResponseParameters, activity);
                }
            };
        } else if (format == MaxAdFormat.REWARDED) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3549c(maxAdapterResponseParameters, activity);
                }
            };
        } else if (format == MaxAdFormat.NATIVE) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3551d(maxAdapterResponseParameters, activity);
                }
            };
        } else {
            if (!format.isAdViewAd()) {
                throw new IllegalStateException("Failed to load " + abstractC1482a3 + ": " + abstractC1482a3.getFormat() + " is not a supported ad format");
            }
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3534a(maxAdapterResponseParameters, format, activity);
                }
            };
        }
        m3538a(Constants.LOAD_AD, format, new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3528a(abstractC1482a3, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public String m3567b() {
        MaxAdapter maxAdapter = this.f2350g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            C1768p.m5164c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f2347d, th);
            this.f2345b.m4764E().m4332a("MediationAdapterWrapper", "adapter_version", th, CollectionUtils.hashMap("adapter_class", this.f2348e.m3196b()));
            m3537a("adapter_version");
            this.f2345b.m4790V().m3519a(this.f2348e.m3196b(), "adapter_version", this.f2352i);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3568b(AbstractC1482a3 abstractC1482a3, final Activity activity) {
        Runnable runnable;
        if (m3540a(abstractC1482a3, activity)) {
            if (abstractC1482a3.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3526a(activity);
                    }
                };
            } else if (abstractC1482a3.getFormat() == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3543b(activity);
                    }
                };
            } else {
                if (abstractC1482a3.getFormat() != MaxAdFormat.REWARDED) {
                    throw new IllegalStateException("Failed to show " + abstractC1482a3 + ": " + abstractC1482a3.getFormat() + " is not a supported ad format");
                }
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.h$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3548c(activity);
                    }
                };
            }
            m3536a(runnable, abstractC1482a3);
        }
    }

    /* JADX INFO: renamed from: c */
    public MediationServiceImpl.C1629b m3569c() {
        return this.f2357n.f2366a;
    }

    /* JADX INFO: renamed from: d */
    public View m3570d() {
        return this.f2353j;
    }

    /* JADX INFO: renamed from: e */
    public MaxNativeAd m3571e() {
        return this.f2354k;
    }

    /* JADX INFO: renamed from: f */
    public MaxNativeAdView m3572f() {
        return this.f2355l;
    }

    /* JADX INFO: renamed from: g */
    public String m3573g() {
        return this.f2347d;
    }

    /* JADX INFO: renamed from: h */
    public ViewGroup m3574h() {
        return this.f2356m;
    }

    /* JADX INFO: renamed from: i */
    public String m3575i() {
        MaxAdapter maxAdapter = this.f2350g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            C1768p.m5164c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f2347d, th);
            this.f2345b.m4764E().m4332a("MediationAdapterWrapper", "sdk_version", th, CollectionUtils.hashMap("adapter_class", this.f2348e.m3196b()));
            m3537a("sdk_version");
            this.f2345b.m4790V().m3519a(this.f2348e.m3196b(), "sdk_version", this.f2352i);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m3576j() {
        return this.f2360q.get() && this.f2361r.get();
    }

    /* JADX INFO: renamed from: k */
    public boolean m3577k() {
        return this.f2359p.get();
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f2349f + "'}";
    }
}
