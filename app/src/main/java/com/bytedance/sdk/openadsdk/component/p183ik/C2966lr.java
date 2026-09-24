package com.bytedance.sdk.openadsdk.component.p183ik;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.ik.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2966lr implements PAGInterstitialAdLoadListener {

    /* JADX INFO: renamed from: ri */
    final PAGInterstitialAdLoadListener f8995ri;

    public C2966lr(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.f8995ri = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
    public void onError(final int i, final String str) {
        if (this.f8995ri != null) {
            dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.ik.lr.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C2966lr.this.f8995ri != null) {
                        C2966lr.this.f8995ri.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.f8995ri != null) {
            dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.ik.lr.2
                @Override // java.lang.Runnable
                public void run() {
                    if (C2966lr.this.f8995ri != null) {
                        C2966lr.this.f8995ri.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }
}
