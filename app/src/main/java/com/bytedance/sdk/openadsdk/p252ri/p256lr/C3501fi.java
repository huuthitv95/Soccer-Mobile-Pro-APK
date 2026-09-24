package com.bytedance.sdk.openadsdk.p252ri.p256lr;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ri.lr.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3501fi implements PAGNativeAdLoadListener {

    /* JADX INFO: renamed from: ri */
    private final PAGNativeAdLoadListener f12683ri;

    public C3501fi(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.f12683ri = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
    public void onError(final int i, final String str) {
        if (this.f12683ri == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.lr.fi.1
            @Override // java.lang.Runnable
            public void run() {
                if (C3501fi.this.f12683ri != null) {
                    C3501fi.this.f12683ri.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.f12683ri == null) {
            return;
        }
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.lr.fi.2
            @Override // java.lang.Runnable
            public void run() {
                if (C3501fi.this.f12683ri != null) {
                    C3501fi.this.f12683ri.onAdLoaded(pAGNativeAd);
                }
            }
        });
    }
}
