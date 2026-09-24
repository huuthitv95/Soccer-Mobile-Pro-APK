package com.bytedance.sdk.openadsdk.component.p183ik;

import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3429qt;
import com.bytedance.sdk.openadsdk.p252ri.p254ik.InterfaceC3496lr;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.ik.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2967ri implements InterfaceC3496lr {

    /* JADX INFO: renamed from: ka */
    private final wjv f9002ka;

    /* JADX INFO: renamed from: ri */
    private final PAGInterstitialAdInteractionListener f9004ri;

    /* JADX INFO: renamed from: lr */
    private final AtomicBoolean f9003lr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ik */
    private final AtomicBoolean f9001ik = new AtomicBoolean(false);

    public C2967ri(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener, C3289ri c3289ri) {
        this.f9004ri = pAGInterstitialAdInteractionListener;
        this.f9002ka = c3289ri != null ? c3289ri.m14248di() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.p252ri.p254ik.InterfaceC3496lr
    /* JADX INFO: renamed from: lr */
    public void mo11530lr() {
        C3429qt.m15623ri("close_callback", this.f9001ik.get(), this.f9003lr.get(), this.f9002ka);
        if (this.f9001ik.compareAndSet(false, true)) {
            C2707ac.m10205ri("BVA", "full video onAdClose");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.f9004ri;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdDismissed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.f9004ri;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p252ri.p254ik.InterfaceC3496lr
    /* JADX INFO: renamed from: ri */
    public void mo11531ri() {
        C3429qt.m15623ri("show_callback", this.f9001ik.get(), this.f9003lr.get(), this.f9002ka);
        if (this.f9003lr.compareAndSet(false, true)) {
            C2707ac.m10205ri("BVA", "full video onAdShow");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.f9004ri;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdShowed();
            }
        }
    }
}
