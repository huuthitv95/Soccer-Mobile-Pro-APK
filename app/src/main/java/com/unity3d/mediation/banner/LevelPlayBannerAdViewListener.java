package com.unity3d.mediation.banner;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface LevelPlayBannerAdViewListener {

    /* JADX INFO: renamed from: com.unity3d.mediation.banner.LevelPlayBannerAdViewListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onAdDisplayFailed(LevelPlayBannerAdViewListener levelPlayBannerAdViewListener, LevelPlayAdInfo adInfo, LevelPlayAdError error) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    void onAdClicked(LevelPlayAdInfo levelPlayAdInfo);

    void onAdCollapsed(LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayFailed(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdError levelPlayAdError);

    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    void onAdExpanded(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLeftApplication(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
