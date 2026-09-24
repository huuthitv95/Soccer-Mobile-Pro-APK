package com.bytedance.sdk.openadsdk.p252ri.p254ik;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ri.ik.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3497ri implements PAGInterstitialAdLoadListener {

    /* JADX INFO: renamed from: ri */
    private final PAGInterstitialAdLoadListener f12671ri;

    public C3497ri(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.f12671ri = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
    public void onError(final int i, final String str) {
        if (this.f12671ri == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.ik.ri.1
            @Override // java.lang.Runnable
            public void run() {
                if (C3497ri.this.f12671ri != null) {
                    C3497ri.this.f12671ri.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.f12671ri == null) {
            return;
        }
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.ik.ri.2
            @Override // java.lang.Runnable
            public void run() {
                if (C3497ri.this.f12671ri != null) {
                    C3497ri.this.f12671ri.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}
