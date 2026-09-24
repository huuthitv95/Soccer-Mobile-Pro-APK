package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.n6 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12384n6 {
    /* JADX INFO: renamed from: a */
    void mo31354a();

    /* JADX INFO: renamed from: a */
    void mo31355a(Activity activity, String str);

    /* JADX INFO: renamed from: a */
    void mo31356a(LevelPlayAdError levelPlayAdError);

    /* JADX INFO: renamed from: b */
    LevelPlayAdInfo mo31357b();

    /* JADX INFO: renamed from: c */
    InterfaceC12274k0 mo31358c();

    void loadAd();

    void onAdClicked();

    void onAdClosed();

    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
