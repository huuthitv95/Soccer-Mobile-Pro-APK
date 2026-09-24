package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3429qt;
import com.bytedance.sdk.openadsdk.p252ri.p253fi.InterfaceC3495ri;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C3043sf implements InterfaceC3495ri {

    /* JADX INFO: renamed from: di */
    private final wjv f9525di;

    /* JADX INFO: renamed from: fi */
    private final AtomicBoolean f9526fi;

    /* JADX INFO: renamed from: ik */
    private final AtomicBoolean f9527ik;

    /* JADX INFO: renamed from: ka */
    private final AtomicBoolean f9528ka;

    /* JADX INFO: renamed from: lr */
    private final PAGRewardedAdInteractionCallback f9529lr;

    /* JADX INFO: renamed from: ri */
    private final PAGRewardedAdInteractionListener f9530ri;

    public C3043sf(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback, C3289ri c3289ri) {
        this.f9527ik = new AtomicBoolean(false);
        this.f9528ka = new AtomicBoolean(false);
        this.f9526fi = new AtomicBoolean(false);
        this.f9529lr = pAGRewardedAdInteractionCallback;
        this.f9530ri = null;
        this.f9525di = c3289ri != null ? c3289ri.m14248di() : null;
    }

    public C3043sf(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener, C3289ri c3289ri) {
        this.f9527ik = new AtomicBoolean(false);
        this.f9528ka = new AtomicBoolean(false);
        this.f9526fi = new AtomicBoolean(false);
        this.f9530ri = pAGRewardedAdInteractionListener;
        this.f9529lr = null;
        this.f9525di = c3289ri != null ? c3289ri.m14248di() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.p252ri.p253fi.InterfaceC3495ri
    /* JADX INFO: renamed from: lr */
    public void mo12180lr() {
        this.f9528ka.get();
        C3429qt.m15623ri("close_callback", this.f9528ka.get(), this.f9527ik.get(), this.f9525di);
        if (this.f9528ka.compareAndSet(false, true)) {
            C2707ac.m10205ri("BVA", "reward video onAdClose");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.f9530ri;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdDismissed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f9529lr;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdDismissed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.f9530ri;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f9529lr;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p252ri.p253fi.InterfaceC3495ri
    /* JADX INFO: renamed from: ri */
    public void mo12181ri() {
        this.f9527ik.get();
        C3429qt.m15623ri("show_callback", this.f9528ka.get(), this.f9527ik.get(), this.f9525di);
        if (this.f9527ik.compareAndSet(false, true)) {
            C2707ac.m10205ri("BVA", "reward video onAdShow");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.f9530ri;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdShowed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f9529lr;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p252ri.p253fi.InterfaceC3495ri
    /* JADX INFO: renamed from: ri */
    public void mo12182ri(boolean z, int i, String str, int i2, String str2) {
        if (this.f9526fi.compareAndSet(false, true)) {
            C2707ac.m10205ri("BVA", "reward video onRewardVerify");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.f9530ri;
            if (pAGRewardedAdInteractionListener != null) {
                if (z) {
                    pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i, str));
                    return;
                } else {
                    pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i2, str2);
                    return;
                }
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f9529lr;
            if (pAGRewardedAdInteractionCallback != null) {
                if (z) {
                    pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i, str));
                } else {
                    pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i2, str2));
                }
            }
        }
    }
}
