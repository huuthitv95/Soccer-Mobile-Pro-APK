package com.unity3d.ads;

import kotlin.Metadata;

/* JADX INFO: compiled from: BannerShowListener.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m43474d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\n"}, m43475d2 = {"Lcom/unity3d/ads/BannerShowListener;", "", "onClicked", "", "banner", "Lcom/unity3d/ads/BannerAd;", "onFailedToShow", "error", "Lcom/unity3d/ads/UnityAdsError;", "onImpression", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public interface BannerShowListener {
    void onClicked(BannerAd banner);

    void onFailedToShow(BannerAd banner, UnityAdsError error);

    void onImpression(BannerAd banner);
}
