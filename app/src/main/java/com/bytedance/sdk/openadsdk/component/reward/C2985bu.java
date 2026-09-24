package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C2985bu extends AbstractC3003ri<PAGRewardedAdLoadListener, TTClientBidding> {
    C2985bu(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: ri */
    public static C2985bu m11638ri(Context context) {
        return (C2985bu) C2982ac.m11615ri(context, 7);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: di */
    protected int mo11639di() {
        return 6;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: lr */
    protected int mo11640lr() {
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public TTClientBidding mo11644ri(Context context, C3289ri c3289ri, AdSlot adSlot) {
        return new tan(context, c3289ri, adSlot);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: lr, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo11642lr(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof tan) {
            ((tan) tTClientBidding).m12209lr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: ri */
    protected bgr mo11643ri() {
        return bgr.m11631ri(this.f9226ri, bgr.EnumC2984ri.REWARD_VIDEO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Object mo11645ri(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof tan) {
            return ((tan) tTClientBidding).m12210ri();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo11646ri(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, int i, String str) {
        pAGRewardedAdLoadListener.onError(i, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.AbstractC3003ri
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo11647ri(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, Object obj) {
        if (pAGRewardedAdLoadListener == null || obj == null || !(obj instanceof PAGRewardedAd)) {
            return;
        }
        pAGRewardedAdLoadListener.onAdLoaded((PAGRewardedAd) obj);
    }
}
