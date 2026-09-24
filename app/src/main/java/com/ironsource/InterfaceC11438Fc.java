package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Fc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11438Fc extends InterfaceC11384Cc {
    void onInterstitialAdRewarded(String str, int i);

    void onInterstitialClick();

    void onInterstitialClose();

    void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject);

    void onInterstitialInitFailed(String str);

    void onInterstitialInitSuccess();

    void onInterstitialLoadFailed(String str);

    void onInterstitialLoadSuccess(C11471H9 c11471h9);

    void onInterstitialOpen();

    void onInterstitialShowFailed(String str);

    void onInterstitialShowSuccess();
}
