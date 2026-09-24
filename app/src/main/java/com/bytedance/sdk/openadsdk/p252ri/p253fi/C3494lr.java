package com.bytedance.sdk.openadsdk.p252ri.p253fi;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ri.fi.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3494lr implements PAGRewardedAdLoadListener {

    /* JADX INFO: renamed from: ri */
    private final PAGRewardedAdLoadListener f12665ri;

    public C3494lr(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.f12665ri = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
    public void onError(final int i, final String str) {
        if (this.f12665ri == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.fi.lr.1
            @Override // java.lang.Runnable
            public void run() {
                if (C3494lr.this.f12665ri != null) {
                    C3494lr.this.f12665ri.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.f12665ri == null) {
            return;
        }
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.fi.lr.2
            @Override // java.lang.Runnable
            public void run() {
                if (C3494lr.this.f12665ri != null) {
                    C3494lr.this.f12665ri.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
