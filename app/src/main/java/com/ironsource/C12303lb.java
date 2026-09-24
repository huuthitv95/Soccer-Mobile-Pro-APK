package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.lb */
/* JADX INFO: loaded from: classes6.dex */
public final class C12303lb {

    /* JADX INFO: renamed from: a */
    private final C11717Va f30860a;

    /* JADX INFO: renamed from: com.ironsource.lb$a */
    public static final class a implements InterfaceC12611y0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC11451G7 f30861a;

        a(InterfaceC11451G7 interfaceC11451G7) {
            this.f30861a = interfaceC11451G7;
        }

        @Override // com.ironsource.InterfaceC12611y0
        /* JADX INFO: renamed from: a */
        public AbstractC12593x0 mo28169a(boolean z, C12220h0 adProperties) {
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return C11619Pd.f25533z.m27259a(adProperties, this.f30861a.mo25844f().mo25856a(), z);
        }
    }

    public C12303lb(String adUnitId, C11717Va.b config, C12414p0 adTools, C12128c6 adControllerFactory, InterfaceC11451G7 provider, InterfaceC12400o4 currentTimeProvider, C12546u7 idFactory, C11775Z0 adUnitValidator) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        this.f30860a = new C11717Va(LevelPlay.AdFormat.REWARDED, adUnitId, config, adTools, adControllerFactory, adUnitValidator, m32077a(provider), provider, currentTimeProvider, idFactory);
    }

    /* JADX INFO: renamed from: a */
    public final String m32079a() {
        String string = this.f30860a.m27716e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m32082b() {
        IronLog.API.info("LevelPlayRewardedAd.isAdReady()");
        return this.f30860a.m27724m();
    }

    /* JADX INFO: renamed from: c */
    public final void m32083c() {
        IronLog.API.info("LevelPlayRewardedAd.loadAd()");
        this.f30860a.m27725n();
    }

    /* JADX INFO: renamed from: a */
    public final void m32080a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.f30860a.m27704a(activity, str);
    }

    /* JADX INFO: renamed from: a */
    public final void m32081a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        IronLog.API.info("LevelPlayRewardedAd.setListener()");
        this.f30860a.m27705a(levelPlayRewardedAdListener != null ? C12324mb.m32224b(levelPlayRewardedAdListener) : null);
    }

    /* JADX INFO: renamed from: a */
    public final LevelPlayReward m32078a(String str) {
        IronLog.API.info("LevelPlayRewardedAd.getReward()");
        return this.f30860a.m27702a(str);
    }

    /* JADX INFO: renamed from: a */
    private final a m32077a(InterfaceC11451G7 interfaceC11451G7) {
        return new a(interfaceC11451G7);
    }
}
