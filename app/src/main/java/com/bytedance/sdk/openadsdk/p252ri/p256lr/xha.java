package com.bytedance.sdk.openadsdk.p252ri.p256lr;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: loaded from: classes3.dex */
public class xha implements InterfaceC3500di {

    /* JADX INFO: renamed from: ri */
    private final PAGNativeAdInteractionListener f12737ri;

    public xha(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.f12737ri = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.p252ri.p256lr.InterfaceC3500di
    /* JADX INFO: renamed from: lr */
    public boolean mo15861lr() {
        return this.f12737ri != null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.lr.xha.1
            @Override // java.lang.Runnable
            public void run() {
                if (xha.this.f12737ri != null) {
                    xha.this.f12737ri.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p252ri.p256lr.InterfaceC3500di
    /* JADX INFO: renamed from: ri */
    public void mo15862ri() {
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.lr.xha.3
            @Override // java.lang.Runnable
            public void run() {
                if (xha.this.f12737ri != null) {
                    xha.this.f12737ri.onAdDismissed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p252ri.p256lr.InterfaceC3500di
    /* JADX INFO: renamed from: ri */
    public void mo15863ri(PAGNativeAd pAGNativeAd) {
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.lr.xha.2
            @Override // java.lang.Runnable
            public void run() {
                if (xha.this.f12737ri != null) {
                    xha.this.f12737ri.onAdShowed();
                }
            }
        });
    }
}
