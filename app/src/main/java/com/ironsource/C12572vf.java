package com.ironsource;

import android.content.Context;
import android.os.Handler;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.vf */
/* JADX INFO: loaded from: classes6.dex */
public final class C12572vf {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11614P8.a f32622a;

    /* JADX INFO: renamed from: b */
    private final WeakReference<TestSuiteActivity> f32623b;

    /* JADX INFO: renamed from: c */
    private final Handler f32624c;

    /* JADX INFO: renamed from: d */
    private final AtomicReference<LevelPlayBannerAdView> f32625d;

    /* JADX INFO: renamed from: e */
    private final AtomicReference<LevelPlayInterstitialAd> f32626e;

    /* JADX INFO: renamed from: f */
    private final AtomicReference<LevelPlayRewardedAd> f32627f;

    public C12572vf(TestSuiteActivity activity, Handler handler) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f32622a = C11455Gb.f24351s.m25903a().mo25774d();
        this.f32623b = new WeakReference<>(activity);
        this.f32624c = handler;
        this.f32625d = new AtomicReference<>();
        this.f32626e = new AtomicReference<>();
        this.f32627f = new AtomicReference<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m33974a(C11405Df loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.f32622a.mo25737a(loadAdConfig);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.f32626e;
        String strM25633a = loadAdConfig.m25633a();
        if (strM25633a == null) {
            strM25633a = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(strM25633a);
        levelPlayInterstitialAd.setListener(new C11351Af());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    /* JADX INFO: renamed from: b */
    public final void m33976b(C11405Df loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.f32622a.mo25737a(loadAdConfig);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.f32627f;
        String strM25633a = loadAdConfig.m25633a();
        if (strM25633a == null) {
            strM25633a = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(strM25633a);
        levelPlayRewardedAd.setListener(new C11513Jf());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m33977c() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.f32626e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m33978d() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.f32627f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m33979e() {
        TestSuiteActivity testSuiteActivityM33970b = m33970b();
        if (testSuiteActivityM33970b != null) {
            LevelPlayInterstitialAd levelPlayInterstitialAd = this.f32626e.get();
            Intrinsics.checkNotNullExpressionValue(levelPlayInterstitialAd, "interstitialAdRef.get()");
            LevelPlayInterstitialAd.showAd$default(levelPlayInterstitialAd, testSuiteActivityM33970b, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m33980f() {
        TestSuiteActivity testSuiteActivityM33970b = m33970b();
        if (testSuiteActivityM33970b != null) {
            LevelPlayRewardedAd levelPlayRewardedAd = this.f32627f.get();
            Intrinsics.checkNotNullExpressionValue(levelPlayRewardedAd, "rewardedAdRef.get()");
            LevelPlayRewardedAd.showAd$default(levelPlayRewardedAd, testSuiteActivityM33970b, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m33971b(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView it) {
        Intrinsics.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        Intrinsics.checkNotNullParameter(it, "$it");
        testSuiteActivity.getContainer().removeView(it);
    }

    /* JADX INFO: renamed from: a */
    public final void m33975a(C11405Df loadAdConfig, String description, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        Intrinsics.checkNotNullParameter(description, "description");
        m33972a();
        TestSuiteActivity testSuiteActivityM33970b = m33970b();
        if (testSuiteActivityM33970b != null) {
            this.f32622a.mo25737a(loadAdConfig);
            LevelPlayBannerAdView.Config configBuild = new LevelPlayBannerAdView.Config.Builder().setAdSize(C11459Gf.f24392a.m25943b(description, i, i2)).build();
            AtomicReference<LevelPlayBannerAdView> atomicReference = this.f32625d;
            String strM25633a = loadAdConfig.m25633a();
            if (strM25633a == null) {
                strM25633a = "";
            }
            LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(testSuiteActivityM33970b, strM25633a, configBuild);
            levelPlayBannerAdView.setBannerListener(new C12590wf());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    /* JADX INFO: renamed from: b */
    private final TestSuiteActivity m33970b() {
        return this.f32623b.get();
    }

    /* JADX INFO: renamed from: a */
    public final void m33973a(double d) {
        final LevelPlayBannerAdView levelPlayBannerAdView;
        final TestSuiteActivity testSuiteActivityM33970b = m33970b();
        if (testSuiteActivityM33970b == null || (levelPlayBannerAdView = this.f32625d.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.f32624c.post(new Runnable() { // from class: com.ironsource.vf$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C12572vf.m33969a(testSuiteActivityM33970b, levelPlayBannerAdView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m33969a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView banner) {
        Intrinsics.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        Intrinsics.checkNotNullParameter(banner, "$banner");
        testSuiteActivity.getContainer().addView(banner, C11549Lf.f25085a.m26438a((Context) testSuiteActivity));
    }

    /* JADX INFO: renamed from: a */
    public final void m33972a() {
        final LevelPlayBannerAdView andSet;
        final TestSuiteActivity testSuiteActivityM33970b = m33970b();
        if (testSuiteActivityM33970b == null || (andSet = this.f32625d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.f32624c.post(new Runnable() { // from class: com.ironsource.vf$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12572vf.m33971b(testSuiteActivityM33970b, andSet);
            }
        });
    }
}
