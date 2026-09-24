package com.google.ads.mediation.chartboost;

import android.content.Context;
import android.util.Log;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.RewardEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public class ChartboostRewardedAd implements MediationRewardedAd, RewardedCallback {
    private Rewarded chartboostRewardedAd;
    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback;
    private MediationRewardedAdCallback rewardedAdCallback;

    public ChartboostRewardedAd(MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
    }

    public void loadAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Context context = mediationRewardedAdConfiguration.getContext();
        ChartboostParams chartboostParamsCreateChartboostParams = ChartboostAdapterUtils.createChartboostParams(mediationRewardedAdConfiguration.getServerParameters());
        if (ChartboostAdapterUtils.isValidChartboostParams(chartboostParamsCreateChartboostParams)) {
            final String location = chartboostParamsCreateChartboostParams.getLocation();
            ChartboostAdapterUtils.updateCoppaStatus(context, MobileAds.getRequestConfiguration());
            ChartboostInitializer.getInstance().initialize(context, chartboostParamsCreateChartboostParams, new ChartboostInitializer.Listener() { // from class: com.google.ads.mediation.chartboost.ChartboostRewardedAd.1
                @Override // com.google.ads.mediation.chartboost.ChartboostInitializer.Listener
                public void onInitializationFailed(AdError adError) {
                    Log.w(ChartboostMediationAdapter.TAG, adError.toString());
                    ChartboostRewardedAd.this.mediationAdLoadCallback.onFailure(adError);
                }

                @Override // com.google.ads.mediation.chartboost.ChartboostInitializer.Listener
                public void onInitializationSucceeded() {
                    ChartboostRewardedAd.this.chartboostRewardedAd = new Rewarded(location, ChartboostRewardedAd.this, ChartboostAdapterUtils.getChartboostMediation());
                    ChartboostRewardedAd.this.chartboostRewardedAd.cache();
                }
            });
        } else {
            AdError adErrorCreateAdapterError = ChartboostConstants.createAdapterError(103, "Failed to load rewarded ad from Chartboost. Missing or invalid server parameters.");
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
        Log.d(ChartboostMediationAdapter.TAG, "Chartboost rewarded ad has been clicked.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
    public void onAdDismiss(DismissEvent dismissEvent) {
        Log.d(ChartboostMediationAdapter.TAG, "Chartboost rewarded ad has been dismissed.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdExpired(ExpirationEvent expirationEvent) {
        Log.d(ChartboostMediationAdapter.TAG, "Chartboost banner ad Expired.");
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdLoaded(CacheEvent cacheEvent, CacheError cacheError) {
        if (cacheError == null) {
            Log.d(ChartboostMediationAdapter.TAG, "Chartboost rewarded ad has been loaded.");
            MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
            if (mediationAdLoadCallback != null) {
                this.rewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
                return;
            }
            return;
        }
        AdError adErrorCreateSDKError = ChartboostConstants.createSDKError(cacheError);
        Log.w(ChartboostMediationAdapter.TAG, adErrorCreateSDKError.toString());
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback2 = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback2 != null) {
            mediationAdLoadCallback2.onFailure(adErrorCreateSDKError);
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdRequestedToShow(ShowEvent showEvent) {
        Log.d(ChartboostMediationAdapter.TAG, "Chartboost rewarded ad is requested to be shown.");
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdShown(ShowEvent showEvent, ShowError showError) {
        if (showError == null) {
            Log.d(ChartboostMediationAdapter.TAG, "Chartboost rewarded ad has been shown.");
            MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdOpened();
                this.rewardedAdCallback.onVideoStart();
                return;
            }
            return;
        }
        AdError adErrorCreateSDKError = ChartboostConstants.createSDKError(showError);
        Log.w(ChartboostMediationAdapter.TAG, adErrorCreateSDKError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback2 = this.rewardedAdCallback;
        if (mediationRewardedAdCallback2 != null) {
            mediationRewardedAdCallback2.onAdFailedToShow(adErrorCreateSDKError);
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onImpressionRecorded(ImpressionEvent impressionEvent) {
        Log.d(ChartboostMediationAdapter.TAG, "Chartboost rewarded ad impression recorded.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.chartboost.sdk.callbacks.RewardedCallback
    public void onRewardEarned(RewardEvent rewardEvent) {
        Log.d(ChartboostMediationAdapter.TAG, "User earned a rewarded from Chartboost rewarded ad.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.rewardedAdCallback.onUserEarnedReward();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        Rewarded rewarded = this.chartboostRewardedAd;
        if (rewarded != null && rewarded.isCached()) {
            this.chartboostRewardedAd.show();
        } else {
            Log.w(ChartboostMediationAdapter.TAG, ChartboostConstants.createAdapterError(104, "Chartboost rewarded ad is not yet ready to be shown.").toString());
        }
    }
}
