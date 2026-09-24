package com.google.unity.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface UnityPreloadCallback {
    void onAdFailedToPreload(String preloadId, AdError adError);

    void onAdPreloaded(String preloadId, ResponseInfo responseInfo);

    void onAdsExhausted(String preloadId);
}
