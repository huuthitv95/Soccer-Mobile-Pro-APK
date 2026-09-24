package com.unity3d.ads;

import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import kotlin.Metadata;

/* JADX INFO: compiled from: BannerAd.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m43475d2 = {"Lcom/unity3d/ads/BannerShowListenerWithOnFailedToShow;", "", "onBannerFailedToShow", "", "bannerAdView", "Lcom/unity3d/services/banners/BannerView;", "errorInfo", "Lcom/unity3d/services/banners/BannerErrorInfo;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public interface BannerShowListenerWithOnFailedToShow {
    void onBannerFailedToShow(BannerView bannerAdView, BannerErrorInfo errorInfo);
}
