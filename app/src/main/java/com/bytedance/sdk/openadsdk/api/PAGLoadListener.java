package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.xha;

/* JADX INFO: loaded from: classes3.dex */
public interface PAGLoadListener<Ad> extends xha {
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.xha
    void onError(int i, String str);
}
