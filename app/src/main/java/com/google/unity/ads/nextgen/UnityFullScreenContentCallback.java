package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;

/* JADX INFO: loaded from: classes6.dex */
public interface UnityFullScreenContentCallback {
    void onAdClicked();

    void onAdDismissedFullScreenContent();

    void onAdFailedToShowFullScreenContent(FullScreenContentError error);

    void onAdImpression();

    void onAdShowedFullScreenContent();
}
