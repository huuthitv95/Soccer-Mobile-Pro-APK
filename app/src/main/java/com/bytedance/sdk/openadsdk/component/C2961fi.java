package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.p252ri.p255ka.InterfaceC3498lr;
import com.ironsource.C11495If;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2961fi implements InterfaceC3498lr {

    /* JADX INFO: renamed from: ri */
    private final PAGAppOpenAdInteractionListener f8951ri;

    /* JADX INFO: renamed from: lr */
    private final AtomicBoolean f8950lr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ik */
    private final AtomicBoolean f8949ik = new AtomicBoolean(false);

    public C2961fi(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.f8951ri = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.p252ri.p255ka.InterfaceC3498lr
    /* JADX INFO: renamed from: ik */
    public void mo11488ik() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.f8950lr.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.f8951ri) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.p252ri.p255ka.InterfaceC3498lr
    /* JADX INFO: renamed from: lr */
    public void mo11489lr() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        C2707ac.m10205ri("BVA", "onAdSkip");
        if (this.f8950lr.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.f8951ri) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        C2707ac.m10205ri("BVA", C11495If.f24687f);
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.f8951ri;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p252ri.p255ka.InterfaceC3498lr
    /* JADX INFO: renamed from: ri */
    public void mo11490ri() {
        if (this.f8949ik.compareAndSet(false, true)) {
            C2707ac.m10205ri("BVA", "onAdShow");
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.f8951ri;
            if (pAGAppOpenAdInteractionListener != null) {
                pAGAppOpenAdInteractionListener.onAdShowed();
            }
        }
    }
}
