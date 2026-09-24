package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface UnityPreloadCallback {
    void onAdFailedToPreload(String preloadId, LoadAdError adError);

    void onAdPreloaded(String preloadId, ResponseInfo responseInfo);

    void onAdsExhausted(String preloadId);
}
