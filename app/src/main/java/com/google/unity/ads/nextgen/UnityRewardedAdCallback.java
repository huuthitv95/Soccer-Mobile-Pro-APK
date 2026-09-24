package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;

/* JADX INFO: loaded from: classes6.dex */
public interface UnityRewardedAdCallback extends UnityFullScreenContentCallback, UnityPaidEventListener {
    void onRewardedAdFailedToLoad(LoadAdError error);

    void onRewardedAdLoaded();

    void onUserEarnedReward(String type, float amount);
}
