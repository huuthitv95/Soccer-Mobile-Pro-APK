package com.bytedance.sdk.openadsdk.p252ri.p258ri;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ri.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3515ri implements PAGBannerAdLoadListener {

    /* JADX INFO: renamed from: ri */
    private final PAGBannerAdLoadListener f12745ri;

    public C3515ri(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.f12745ri = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
    public void onError(final int i, final String str) {
        if (this.f12745ri == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.ri.ri.1
            @Override // java.lang.Runnable
            public void run() {
                C3515ri.this.f12745ri.onError(i, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.f12745ri == null) {
            return;
        }
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.ri.ri.2
            @Override // java.lang.Runnable
            public void run() {
                C3515ri.this.f12745ri.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
