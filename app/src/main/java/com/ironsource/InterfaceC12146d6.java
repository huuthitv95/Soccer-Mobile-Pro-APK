package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* JADX INFO: renamed from: com.ironsource.d6 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12146d6 {
    /* JADX INFO: renamed from: a */
    void mo27703a();

    /* JADX INFO: renamed from: a */
    void mo27708a(LevelPlayAdError levelPlayAdError);

    /* JADX INFO: renamed from: a */
    void mo27712a(LevelPlayReward levelPlayReward);

    void onAdClicked();

    void onAdClosed();

    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
