package com.applovin.mediation.adapters;

import android.os.Bundle;
import com.applovin.impl.InterfaceC1659n2;
import com.applovin.impl.InterfaceC1669o2;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinAdapterInterstitialListener implements InterfaceC1669o2, AppLovinAdClickListener, InterfaceC1659n2 {
    private final MaxInterstitialAdapterListener listener;
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterInterstitialListener(AppLovinMediationAdapter appLovinMediationAdapter, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxInterstitialAdapterListener;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad clicked");
        this.listener.onInterstitialAdClicked();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad shown");
        Bundle bundle = new Bundle(1);
        if (appLovinAd instanceof AbstractC1736b) {
            bundle.putBundle("applovin_ad_view_info", ((AbstractC1736b) appLovinAd).m4538h());
        }
        this.listener.onInterstitialAdDisplayed(bundle);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad hidden");
        this.listener.onInterstitialAdHidden();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad loaded");
        this.parentAdapter.loadedInterstitialAd = appLovinAd;
        this.listener.onInterstitialAdLoaded();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new AppLovinError(i, ""));
    }

    @Override // com.applovin.impl.InterfaceC1669o2
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        this.parentAdapter.log("Interstitial ad failed to load with error: " + appLovinError);
        this.listener.onInterstitialAdLoadFailed(AppLovinMediationAdapter.toMaxError(appLovinError));
    }

    @Override // com.applovin.impl.InterfaceC1659n2
    public void onAdDisplayFailed(String str) {
        this.parentAdapter.log("Interstitial ad failed to display with error: " + str);
        this.listener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
    }
}
