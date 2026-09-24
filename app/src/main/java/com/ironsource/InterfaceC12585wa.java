package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.wa */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12585wa {
    /* JADX INFO: renamed from: b */
    void mo33901b(IronSourceError ironSourceError);

    /* JADX INFO: renamed from: d */
    void mo33904d(IronSourceError ironSourceError);

    /* JADX INFO: renamed from: i */
    void mo33906i();

    /* JADX INFO: renamed from: k */
    void mo33907k();

    void onAdClicked();

    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLeftApplication();

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
