package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;

/* JADX INFO: loaded from: classes6.dex */
public interface UnityBannerAdCallback extends UnityPaidEventListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(LoadAdError error);

    void onAdImpression();

    void onAdLoaded();

    void onAdOpened();
}
