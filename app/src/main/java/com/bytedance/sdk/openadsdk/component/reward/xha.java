package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends AbstractC3003ri<PAGInterstitialAdLoadListener, TTClientBidding> {
    xha(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: ri */
    public static xha m12322ri(Context context) {
        return (xha) C2982ac.m11615ri(context, 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: di */
    protected int mo11639di() {
        return 5;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: lr */
    protected int mo11640lr() {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public TTClientBidding mo11644ri(Context context, C3289ri c3289ri, AdSlot adSlot) {
        return new C3001nr(context, c3289ri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: lr, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo11642lr(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof C3001nr) {
            ((C3001nr) tTClientBidding).m11772lr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: ri */
    protected bgr mo11643ri() {
        return bgr.m11631ri(this.f9226ri, bgr.EnumC2984ri.FULL_SCREEN_VIDEO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Object mo11645ri(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof C3001nr) {
            return ((C3001nr) tTClientBidding).m11773ri();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo11646ri(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, int i, String str) {
        pAGInterstitialAdLoadListener.onError(i, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo11647ri(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, Object obj) {
        if (pAGInterstitialAdLoadListener == null || obj == null || !(obj instanceof PAGInterstitialAd)) {
            return;
        }
        pAGInterstitialAdLoadListener.onAdLoaded((PAGInterstitialAd) obj);
    }
}
