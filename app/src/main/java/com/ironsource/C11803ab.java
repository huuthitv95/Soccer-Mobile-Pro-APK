package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ab */
/* JADX INFO: loaded from: classes6.dex */
public final class C11803ab {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11451G7 f26782a;

    /* JADX INFO: renamed from: b */
    private final C11717Va f26783b;

    /* JADX INFO: renamed from: com.ironsource.ab$a */
    public static final class a implements InterfaceC12611y0 {
        a() {
        }

        @Override // com.ironsource.InterfaceC12611y0
        /* JADX INFO: renamed from: a */
        public AbstractC12593x0 mo28169a(boolean z, C12220h0 adProperties) {
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return C12638z9.f33257z.m34278a(adProperties, C11803ab.this.f26782a.mo25844f().mo25856a(), z);
        }
    }

    public C11803ab(String adUnitId, C11717Va.b config, C12414p0 adTools, C12128c6 adControllerFactory, InterfaceC11451G7 provider, InterfaceC12400o4 currentTimeProvider, C12546u7 idFactory, C11775Z0 adUnitValidator) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        this.f26782a = provider;
        this.f26783b = new C11717Va(LevelPlay.AdFormat.INTERSTITIAL, adUnitId, config, adTools, adControllerFactory, adUnitValidator, m28163a(), provider, currentTimeProvider, idFactory);
    }

    /* JADX INFO: renamed from: b */
    public final String m28166b() {
        String string = this.f26783b.m27716e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m28167c() {
        IronLog.API.info("LevelPlayInterstitialAd.isAdReady()");
        return this.f26783b.m27724m();
    }

    /* JADX INFO: renamed from: d */
    public final void m28168d() {
        IronLog.API.info("LevelPlayInterstitialAd.loadAd()");
        this.f26783b.m27725n();
    }

    /* JADX INFO: renamed from: a */
    public final void m28165a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        IronLog.API.info("LevelPlayInterstitialAd.setListener()");
        this.f26783b.m27705a(levelPlayInterstitialAdListener != null ? C12115bb.m31195b(levelPlayInterstitialAdListener) : null);
    }

    /* JADX INFO: renamed from: a */
    public final void m28164a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + str);
        this.f26783b.m27704a(activity, str);
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC12611y0 m28163a() {
        return new a();
    }
}
