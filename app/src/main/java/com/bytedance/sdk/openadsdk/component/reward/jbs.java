package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: loaded from: classes3.dex */
public class jbs implements PAGRewardedAdLoadListener {

    /* JADX INFO: renamed from: ri */
    final PAGRewardedAdLoadListener f9166ri;

    public jbs(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.f9166ri = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
    public void onError(final int i, final String str) {
        if (this.f9166ri != null) {
            dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.jbs.1
                @Override // java.lang.Runnable
                public void run() {
                    if (jbs.this.f9166ri != null) {
                        jbs.this.f9166ri.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.f9166ri != null) {
            dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.jbs.2
                @Override // java.lang.Runnable
                public void run() {
                    if (jbs.this.f9166ri != null) {
                        jbs.this.f9166ri.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }
}
