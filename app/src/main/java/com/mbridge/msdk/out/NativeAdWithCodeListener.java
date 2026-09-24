package com.mbridge.msdk.out;

import com.mbridge.msdk.util.C13883a;

/* JADX INFO: loaded from: classes6.dex */
public abstract class NativeAdWithCodeListener implements NativeListener.NativeAdListener {
    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        onAdLoadErrorWithCode(C13883a.m41419a(1000, str), str);
    }

    public abstract void onAdLoadErrorWithCode(int i, String str);
}
