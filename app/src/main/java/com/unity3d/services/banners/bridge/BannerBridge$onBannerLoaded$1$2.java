package com.unity3d.services.banners.bridge;

import com.hbisoft.hbrecorder.Constants;
import com.unity3d.ads.BannerShowListenerWithOnFailedToShow;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BannerBridge.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, m43475d2 = {"com/unity3d/services/banners/bridge/BannerBridge$onBannerLoaded$1$2", "Lcom/unity3d/ads/core/data/model/Listeners;", "onClick", "", "placementId", "", Constants.ON_COMPLETE_KEY, "state", "Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "onError", "error", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "message", "onLeftApplication", Constants.ON_START_KEY, "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class BannerBridge$onBannerLoaded$1$2 implements Listeners {
    final /* synthetic */ BannerView $bannerAdView;
    final /* synthetic */ BannerView.IListener $bannerListener;

    BannerBridge$onBannerLoaded$1$2(BannerView.IListener iListener, BannerView bannerView) {
        this.$bannerListener = iListener;
        this.$bannerAdView = bannerView;
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onClick(String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        BannerView.IListener iListener = this.$bannerListener;
        if (iListener != null) {
            iListener.onBannerClick(this.$bannerAdView);
        }
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onComplete(String placementId, UnityAds.UnityAdsShowCompletionState state) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onError(String placementId, UnityAds.UnityAdsShowError error, String message) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.$bannerListener instanceof BannerShowListenerWithOnFailedToShow) {
            BannerErrorInfo bannerErrorInfo = BannerErrorInfo.fromShowError(error, message);
            BannerView.IListener iListener = this.$bannerListener;
            Intrinsics.checkNotNull(iListener, "null cannot be cast to non-null type com.unity3d.ads.BannerShowListenerWithOnFailedToShow");
            BannerView bannerView = this.$bannerAdView;
            Intrinsics.checkNotNullExpressionValue(bannerErrorInfo, "bannerErrorInfo");
            ((BannerShowListenerWithOnFailedToShow) iListener).onBannerFailedToShow(bannerView, bannerErrorInfo);
        }
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onLeftApplication(String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        BannerView.IListener iListener = this.$bannerListener;
        if (iListener != null) {
            iListener.onBannerLeftApplication(this.$bannerAdView);
        }
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onRewarded(String str) {
        Listeners.DefaultImpls.onRewarded(this, str);
    }

    @Override // com.unity3d.ads.core.data.model.Listeners
    public void onStart(String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        BannerView.IListener iListener = this.$bannerListener;
        if (iListener != null) {
            iListener.onBannerShown(this.$bannerAdView);
        }
    }
}
