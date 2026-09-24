package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes3.dex */
public class InterstitialAd implements FullScreenAd {
    private final InterstitialAdApi mInterstitialAdApi;

    public interface InterstitialAdLoadConfigBuilder extends InterfaceC4297Ad.LoadConfigBuilder {

        /* JADX INFO: renamed from: com.facebook.ads.InterstitialAd$InterstitialAdLoadConfigBuilder$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }

        @Override // com.facebook.ads.InterfaceC4297Ad.LoadConfigBuilder
        InterstitialLoadAdConfig build();

        InterstitialAdLoadConfigBuilder withAdListener(InterstitialAdListener interstitialAdListener);

        @Override // com.facebook.ads.InterfaceC4297Ad.LoadConfigBuilder
        InterstitialAdLoadConfigBuilder withBid(String str);

        InterstitialAdLoadConfigBuilder withCacheFlags(EnumSet<CacheFlag> enumSet);

        InterstitialAdLoadConfigBuilder withRewardData(RewardData rewardData);

        InterstitialAdLoadConfigBuilder withRewardedAdListener(RewardedAdListener rewardedAdListener);
    }

    public interface InterstitialAdShowConfigBuilder extends FullScreenAd.ShowConfigBuilder {

        /* JADX INFO: renamed from: com.facebook.ads.InterstitialAd$InterstitialAdShowConfigBuilder$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }

        @Override // com.facebook.ads.FullScreenAd.ShowConfigBuilder
        InterstitialShowAdConfig build();
    }

    public interface InterstitialLoadAdConfig extends InterfaceC4297Ad.LoadAdConfig {
    }

    public interface InterstitialShowAdConfig extends FullScreenAd.ShowAdConfig {
    }

    public InterstitialAd(Context context, String str) {
        this.mInterstitialAdApi = DynamicLoaderFactory.makeLoader(context).createInterstitialAd(context, str, this);
    }

    @Override // com.facebook.ads.FullScreenAd
    public InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mInterstitialAdApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.FullScreenAd
    public InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return this.mInterstitialAdApi.buildShowAdConfig();
    }

    @Override // com.facebook.ads.InterfaceC4297Ad
    public void destroy() {
        this.mInterstitialAdApi.destroy();
    }

    @Override // com.facebook.ads.InterfaceC4297Ad
    public String getPlacementId() {
        return this.mInterstitialAdApi.getPlacementId();
    }

    @Override // com.facebook.ads.InterfaceC4297Ad
    public boolean isAdInvalidated() {
        return this.mInterstitialAdApi.isAdInvalidated();
    }

    public boolean isAdLoaded() {
        return this.mInterstitialAdApi.isAdLoaded();
    }

    @Override // com.facebook.ads.InterfaceC4297Ad
    public void loadAd() {
        this.mInterstitialAdApi.loadAd();
    }

    public void loadAd(InterstitialLoadAdConfig interstitialLoadAdConfig) {
        this.mInterstitialAdApi.loadAd(interstitialLoadAdConfig);
    }

    @Override // com.facebook.ads.InterfaceC4297Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mInterstitialAdApi.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.FullScreenAd
    public boolean show() {
        return this.mInterstitialAdApi.show();
    }

    public boolean show(InterstitialShowAdConfig interstitialShowAdConfig) {
        return this.mInterstitialAdApi.show(interstitialShowAdConfig);
    }
}
