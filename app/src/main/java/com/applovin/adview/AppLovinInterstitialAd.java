package com.applovin.adview;

import android.content.Context;
import com.applovin.impl.C1679p2;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinInterstitialAd {
    public static AppLovinInterstitialAdDialog create() {
        return create(AppLovinSdk.getInstance(C1748l.m4756p()), C1748l.m4756p());
    }

    @Deprecated
    public static AppLovinInterstitialAdDialog create(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context != null) {
            return new C1679p2(appLovinSdk, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    public String toString() {
        return "AppLovinInterstitialAd{}";
    }
}
