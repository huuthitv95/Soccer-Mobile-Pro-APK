package com.google.ads.mediation.chartboost;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public class ChartboostBannerAd implements MediationBannerAd, BannerCallback {
    private MediationBannerAdCallback bannerAdCallback;
    private FrameLayout bannerContainer;
    private final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback;

    public ChartboostBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndLoadBannerAd(Context context, String str, Banner.BannerSize bannerSize) {
        if (TextUtils.isEmpty(str)) {
            AdError adErrorCreateAdapterError = ChartboostConstants.createAdapterError(103, "Missing or invalid location.");
            Log.w(ChartboostMediationAdapter.TAG, adErrorCreateAdapterError.toString());
            this.mediationAdLoadCallback.onFailure(adErrorCreateAdapterError);
        } else {
            this.bannerContainer = new FrameLayout(context);
            AdSize adSize = new AdSize(bannerSize.getWidth(), bannerSize.getHeight());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context));
            Banner banner = new Banner(context, str, bannerSize, this, ChartboostAdapterUtils.getChartboostMediation());
            this.bannerContainer.addView(banner, layoutParams);
            banner.cache();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.bannerContainer;
    }

    public void loadAd(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        final Context context = mediationBannerAdConfiguration.getContext();
        ChartboostParams chartboostParamsCreateChartboostParams = ChartboostAdapterUtils.createChartboostParams(mediationBannerAdConfiguration.getServerParameters());
        if (!ChartboostAdapterUtils.isValidChartboostParams(chartboostParamsCreateChartboostParams)) {
            AdError adErrorCreateAdapterError = ChartboostConstants.createAdapterError(103, "Failed to load banner ad from Chartboost. Missing or invalid server parameters.");
            Log.e(ChartboostMediationAdapter.TAG, adErrorCreateAdapterError.toString());
            this.mediationAdLoadCallback.onFailure(adErrorCreateAdapterError);
            return;
        }
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        final Banner.BannerSize bannerSizeFindClosestBannerSize = ChartboostAdapterUtils.findClosestBannerSize(context, adSize);
        if (bannerSizeFindClosestBannerSize == null) {
            AdError adErrorCreateAdapterError2 = ChartboostConstants.createAdapterError(101, String.format("The requested banner size: %s is not supported by Chartboost SDK.", adSize));
            Log.e(ChartboostMediationAdapter.TAG, adErrorCreateAdapterError2.toString());
            this.mediationAdLoadCallback.onFailure(adErrorCreateAdapterError2);
        } else {
            final String location = chartboostParamsCreateChartboostParams.getLocation();
            ChartboostAdapterUtils.updateCoppaStatus(context, MobileAds.getRequestConfiguration());
            ChartboostInitializer.getInstance().initialize(context, chartboostParamsCreateChartboostParams, new ChartboostInitializer.Listener() { // from class: com.google.ads.mediation.chartboost.ChartboostBannerAd.1
                @Override // com.google.ads.mediation.chartboost.ChartboostInitializer.Listener
                public void onInitializationFailed(AdError adError) {
                    Log.w(ChartboostMediationAdapter.TAG, adError.toString());
                    ChartboostBannerAd.this.mediationAdLoadCallback.onFailure(adError);
                }

                @Override // com.google.ads.mediation.chartboost.ChartboostInitializer.Listener
                public void onInitializationSucceeded() {
                    ChartboostBannerAd.this.createAndLoadBannerAd(context, location, bannerSizeFindClosestBannerSize);
                }
            });
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdClicked(ClickEvent clickEvent, ClickError clickError) {
        if (clickError != null) {
            Log.w(ChartboostMediationAdapter.TAG, ChartboostConstants.createSDKError(clickError).toString());
            return;
        }
        Log.d(ChartboostMediationAdapter.TAG, "Chartboost banner ad has been clicked.");
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdExpired(ExpirationEvent expirationEvent) {
        Log.d(ChartboostMediationAdapter.TAG, "Chartboost banner ad Expired.");
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdLoaded(CacheEvent cacheEvent, CacheError cacheError) {
        if (cacheError != null) {
            AdError adErrorCreateSDKError = ChartboostConstants.createSDKError(cacheError);
            Log.w(ChartboostMediationAdapter.TAG, adErrorCreateSDKError.toString());
            this.mediationAdLoadCallback.onFailure(adErrorCreateSDKError);
        } else {
            Log.d(ChartboostMediationAdapter.TAG, "Chartboost banner ad has been loaded.");
            this.bannerAdCallback = this.mediationAdLoadCallback.onSuccess(this);
            cacheEvent.getAd().show();
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdRequestedToShow(ShowEvent showEvent) {
        Log.d(ChartboostMediationAdapter.TAG, "Chartboost banner ad is requested to be shown.");
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdShown(ShowEvent showEvent, ShowError showError) {
        if (showError != null) {
            Log.w(ChartboostMediationAdapter.TAG, ChartboostConstants.createSDKError(showError).toString());
            return;
        }
        Log.d(ChartboostMediationAdapter.TAG, "Chartboost banner has been shown.");
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onImpressionRecorded(ImpressionEvent impressionEvent) {
        Log.d(ChartboostMediationAdapter.TAG, "Chartboost banner ad impression recorded.");
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
