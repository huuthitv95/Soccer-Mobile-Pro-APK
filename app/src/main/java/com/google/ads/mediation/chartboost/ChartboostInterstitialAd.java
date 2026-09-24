package com.google.ads.mediation.chartboost;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public class ChartboostInterstitialAd implements MediationInterstitialAd, InterstitialCallback {
    private Interstitial chartboostInterstitialAd;
    private MediationInterstitialAdCallback interstitialAdCallback;
    private final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback;

    public ChartboostInterstitialAd(MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndLoadInterstitialAd(String str) {
        if (!TextUtils.isEmpty(str)) {
            Interstitial interstitial = new Interstitial(str, this, ChartboostAdapterUtils.getChartboostMediation());
            this.chartboostInterstitialAd = interstitial;
            interstitial.cache();
        } else {
            AdError adErrorCreateAdapterError = ChartboostConstants.createAdapterError(103, "Missing or invalid location.");
            Log.w(ChartboostMediationAdapter.TAG, adErrorCreateAdapterError.toString());
            MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adErrorCreateAdapterError);
            }
        }
    }

    public void loadAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Context context = mediationInterstitialAdConfiguration.getContext();
        ChartboostParams chartboostParamsCreateChartboostParams = ChartboostAdapterUtils.createChartboostParams(mediationInterstitialAdConfiguration.getServerParameters());
        if (ChartboostAdapterUtils.isValidChartboostParams(chartboostParamsCreateChartboostParams)) {
            final String location = chartboostParamsCreateChartboostParams.getLocation();
            ChartboostAdapterUtils.updateCoppaStatus(context, MobileAds.getRequestConfiguration());
            ChartboostInitializer.getInstance().initialize(context, chartboostParamsCreateChartboostParams, new ChartboostInitializer.Listener() { // from class: com.google.ads.mediation.chartboost.ChartboostInterstitialAd.1
                @Override // com.google.ads.mediation.chartboost.ChartboostInitializer.Listener
                public void onInitializationFailed(AdError adError) {
                    Log.w(ChartboostMediationAdapter.TAG, adError.toString());
                    ChartboostInterstitialAd.this.mediationAdLoadCallback.onFailure(adError);
                }

                @Override // com.google.ads.mediation.chartboost.ChartboostInitializer.Listener
                public void onInitializationSucceeded() {
                    ChartboostInterstitialAd.this.createAndLoadInterstitialAd(location);
                }
            });
        } else {
            AdError adErrorCreateAdapterError = ChartboostConstants.createAdapterError(103, "Failed to load interstitial ad from Chartboost. Missing or invalid server parameters.");
            Log.e(ChartboostMediationAdapter.TAG, adErrorCreateAdapterError.toString());
            this.mediationAdLoadCallback.onFailure(adErrorCreateAdapterError);
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdClicked(ClickEvent clickEvent, ClickError clickError) {
        if (clickError != null) {
            Log.w(ChartboostMediationAdapter.TAG, ChartboostConstants.createSDKError(clickError).toString());
            return;
        }
        Log.d(ChartboostMediationAdapter.TAG, "Chartboost interstitial ad has been clicked.");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
    public void onAdDismiss(DismissEvent dismissEvent) {
        Log.d(ChartboostMediationAdapter.TAG, "Chartboost interstitial ad has been dismissed.");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdExpired(ExpirationEvent expirationEvent) {
        Log.d(ChartboostMediationAdapter.TAG, "Chartboost interstitial ad Expired.");
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdLoaded(CacheEvent cacheEvent, CacheError cacheError) {
        if (cacheError == null) {
            Log.d(ChartboostMediationAdapter.TAG, "Chartboost interstitial ad has been loaded.");
            MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
            if (mediationAdLoadCallback != null) {
                this.interstitialAdCallback = mediationAdLoadCallback.onSuccess(this);
                return;
            }
            return;
        }
        AdError adErrorCreateSDKError = ChartboostConstants.createSDKError(cacheError);
        Log.w(ChartboostMediationAdapter.TAG, adErrorCreateSDKError.toString());
        MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback2 = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback2 != null) {
            mediationAdLoadCallback2.onFailure(adErrorCreateSDKError);
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdRequestedToShow(ShowEvent showEvent) {
        Log.d(ChartboostMediationAdapter.TAG, "Chartboost interstitial ad is requested to be shown.");
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdShown(ShowEvent showEvent, ShowError showError) {
        if (showError == null) {
            Log.d(ChartboostMediationAdapter.TAG, "Chartboost interstitial has been shown.");
            MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdOpened();
                return;
            }
            return;
        }
        AdError adErrorCreateSDKError = ChartboostConstants.createSDKError(showError);
        Log.w(ChartboostMediationAdapter.TAG, adErrorCreateSDKError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback2 = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback2 != null) {
            mediationInterstitialAdCallback2.onAdFailedToShow(adErrorCreateSDKError);
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onImpressionRecorded(ImpressionEvent impressionEvent) {
        Log.d(ChartboostMediationAdapter.TAG, "Chartboost interstitial ad impression recorded.");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        Interstitial interstitial = this.chartboostInterstitialAd;
        if (interstitial != null && interstitial.isCached()) {
            this.chartboostInterstitialAd.show();
        } else {
            Log.w(ChartboostMediationAdapter.TAG, ChartboostConstants.createAdapterError(104, "Chartboost interstitial ad is not yet ready to be shown.").toString());
        }
    }
}
