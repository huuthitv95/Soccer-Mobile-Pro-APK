package com.bytedance.sdk.openadsdk.p252ri.p255ka;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ri.ka.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3499ri implements PAGAppOpenAdLoadListener {

    /* JADX INFO: renamed from: ri */
    private final PAGAppOpenAdLoadListener f12677ri;

    public C3499ri(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.f12677ri = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
    public void onError(final int i, final String str) {
        if (this.f12677ri == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.ka.ri.1
            @Override // java.lang.Runnable
            public void run() {
                if (C3499ri.this.f12677ri != null) {
                    C3499ri.this.f12677ri.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGAppOpenAd pAGAppOpenAd) {
        if (this.f12677ri == null) {
            return;
        }
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.ka.ri.2
            @Override // java.lang.Runnable
            public void run() {
                if (C3499ri.this.f12677ri != null) {
                    C3499ri.this.f12677ri.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
