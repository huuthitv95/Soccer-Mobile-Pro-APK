package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.bb */
/* JADX INFO: loaded from: classes6.dex */
public final class C12115bb {

    /* JADX INFO: renamed from: com.ironsource.bb$a */
    public static final class a implements InterfaceC11734Wa {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ LevelPlayInterstitialAdListener f30132a;

        a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
            this.f30132a = levelPlayInterstitialAdListener;
        }

        @Override // com.ironsource.InterfaceC11734Wa
        public void onAdClicked(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClicked() adInfo: " + adInfo);
            this.f30132a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.InterfaceC11734Wa
        public void onAdClosed(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClosed() adInfo: " + adInfo);
            this.f30132a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.InterfaceC11734Wa
        public void onAdDisplayFailed(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.f30132a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.InterfaceC11734Wa
        public void onAdDisplayed(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.f30132a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.InterfaceC11734Wa
        public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.f30132a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.InterfaceC11734Wa
        public void onAdLoadFailed(LevelPlayAdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() error: " + error);
            this.f30132a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.InterfaceC11734Wa
        public void onAdLoaded(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() adInfo: " + adInfo);
            this.f30132a.onAdLoaded(adInfo);
        }

        @Override // com.ironsource.InterfaceC11734Wa
        public /* synthetic */ void onAdRewarded(LevelPlayReward levelPlayReward, LevelPlayAdInfo levelPlayAdInfo) {
            InterfaceC11734Wa.CC.$default$onAdRewarded(this, levelPlayReward, levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final InterfaceC11734Wa m31195b(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        return new a(levelPlayInterstitialAdListener);
    }
}
