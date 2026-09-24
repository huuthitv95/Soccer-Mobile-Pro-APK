package com.unity3d.ironsourceads.rewarded;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes9.dex */
public interface RewardedAdLoaderListener {
    void onRewardedAdLoadFailed(IronSourceError ironSourceError);

    void onRewardedAdLoaded(RewardedAd rewardedAd);
}
