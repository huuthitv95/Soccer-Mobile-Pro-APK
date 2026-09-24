package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: loaded from: classes3.dex */
public class RewardedInterstitialAd implements FullScreenAd {
    public static final int UNSET_VIDEO_DURATION = -1;
    private final RewardedInterstitialAdApi mRewardedInterstitialAdApi;

    public interface RewardedInterstitialAdLoadConfigBuilder extends InterfaceC4297Ad.LoadConfigBuilder {

        /* JADX INFO: renamed from: com.facebook.ads.RewardedInterstitialAd$RewardedInterstitialAdLoadConfigBuilder$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }

        @Override // com.facebook.ads.InterfaceC4297Ad.LoadConfigBuilder
        RewardedInterstitialLoadAdConfig build();

        RewardedInterstitialAdLoadConfigBuilder withAdListener(RewardedInterstitialAdListener rewardedInterstitialAdListener);

        @Override // com.facebook.ads.InterfaceC4297Ad.LoadConfigBuilder
        RewardedInterstitialAdLoadConfigBuilder withBid(String str);

        RewardedInterstitialAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z);

        RewardedInterstitialAdLoadConfigBuilder withRewardData(RewardData rewardData);
    }

    public interface RewardedInterstitialAdShowConfigBuilder extends FullScreenAd.ShowConfigBuilder {

        /* JADX INFO: renamed from: com.facebook.ads.RewardedInterstitialAd$RewardedInterstitialAdShowConfigBuilder$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }

        @Override // com.facebook.ads.FullScreenAd.ShowConfigBuilder
        RewardedInterstitialShowAdConfig build();

        RewardedInterstitialAdShowConfigBuilder withAppOrientation(int i);
    }

    public interface RewardedInterstitialLoadAdConfig extends InterfaceC4297Ad.LoadAdConfig {
    }

    public interface RewardedInterstitialShowAdConfig extends FullScreenAd.ShowAdConfig {
    }

    public RewardedInterstitialAd(Context context, String str) {
        this.mRewardedInterstitialAdApi = DynamicLoaderFactory.makeLoader(context).createRewardedInterstitialAd(context, str, this);
    }

    @Override // com.facebook.ads.FullScreenAd
    public RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mRewardedInterstitialAdApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.FullScreenAd
    public RewardedInterstitialAdShowConfigBuilder buildShowAdConfig() {
        return this.mRewardedInterstitialAdApi.buildShowAdConfig();
    }

    @Override // com.facebook.ads.InterfaceC4297Ad
    public void destroy() {
        this.mRewardedInterstitialAdApi.destroy();
    }

    @Override // com.facebook.ads.InterfaceC4297Ad
    public String getPlacementId() {
        return this.mRewardedInterstitialAdApi.getPlacementId();
    }

    public int getVideoDuration() {
        return this.mRewardedInterstitialAdApi.getVideoDuration();
    }

    @Override // com.facebook.ads.InterfaceC4297Ad
    public boolean isAdInvalidated() {
        return this.mRewardedInterstitialAdApi.isAdInvalidated();
    }

    public boolean isAdLoaded() {
        return this.mRewardedInterstitialAdApi.isAdLoaded();
    }

    @Override // com.facebook.ads.InterfaceC4297Ad
    public void loadAd() {
        this.mRewardedInterstitialAdApi.loadAd();
    }

    public void loadAd(RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig) {
        this.mRewardedInterstitialAdApi.loadAd(rewardedInterstitialLoadAdConfig);
    }

    @Override // com.facebook.ads.InterfaceC4297Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mRewardedInterstitialAdApi.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.FullScreenAd
    public boolean show() {
        return this.mRewardedInterstitialAdApi.show();
    }

    public boolean show(RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig) {
        return this.mRewardedInterstitialAdApi.show(rewardedInterstitialShowAdConfig);
    }
}
