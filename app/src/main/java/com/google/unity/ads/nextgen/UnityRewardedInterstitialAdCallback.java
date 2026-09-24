package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;

/* JADX INFO: loaded from: classes6.dex */
public interface UnityRewardedInterstitialAdCallback extends UnityFullScreenContentCallback, UnityPaidEventListener {
    void onRewardedInterstitialAdFailedToLoad(LoadAdError error);

    void onRewardedInterstitialAdLoaded();

    void onUserEarnedReward(String type, float amount);
}
