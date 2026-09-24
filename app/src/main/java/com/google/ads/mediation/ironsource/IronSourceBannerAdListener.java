package com.google.ads.mediation.ironsource;

import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceBannerAdListener implements ISDemandOnlyBannerListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdClicked(String str) {
        MediationBannerAdCallback bannerAdCallback;
        Log.d(IronSourceConstants.TAG, String.format("IronSource banner ad clicked for instance ID: %s", str));
        IronSourceBannerAd fromAvailableInstances = IronSourceBannerAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || (bannerAdCallback = fromAvailableInstances.getBannerAdCallback()) == null) {
            return;
        }
        bannerAdCallback.onAdOpened();
        bannerAdCallback.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdLeftApplication(String str) {
        MediationBannerAdCallback bannerAdCallback;
        Log.d(IronSourceConstants.TAG, String.format("IronSource banner ad has caused user to leave the application for instance ID: %s", str));
        IronSourceBannerAd fromAvailableInstances = IronSourceBannerAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || (bannerAdCallback = fromAvailableInstances.getBannerAdCallback()) == null) {
            return;
        }
        bannerAdCallback.onAdLeftApplication();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdLoadFailed(String str, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.w(IronSourceConstants.TAG, adError.toString());
        IronSourceBannerAd fromAvailableInstances = IronSourceBannerAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null) {
            return;
        }
        MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> adLoadCallback = fromAvailableInstances.getAdLoadCallback();
        if (adLoadCallback != null) {
            adLoadCallback.onFailure(adError);
        }
        if (ironSourceError.getErrorCode() == 1050 || ironSourceError.getErrorCode() == 619) {
            return;
        }
        IronSourceBannerAd.removeFromAvailableInstances(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdLoaded(String str) {
        Log.d(IronSourceConstants.TAG, String.format("IronSource banner ad loaded for instance ID: %s", str));
        IronSourceBannerAd fromAvailableInstances = IronSourceBannerAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || fromAvailableInstances.getIronSourceAdView() == null) {
            return;
        }
        fromAvailableInstances.getIronSourceAdView().addView(fromAvailableInstances.getIronSourceBannerLayout());
        if (fromAvailableInstances.getAdLoadCallback() != null) {
            fromAvailableInstances.setBannerAdCallback(fromAvailableInstances.getAdLoadCallback().onSuccess(fromAvailableInstances));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdShown(String str) {
        MediationBannerAdCallback bannerAdCallback;
        Log.d(IronSourceConstants.TAG, String.format("IronSource banner ad shown for instance ID: %s", str));
        IronSourceBannerAd fromAvailableInstances = IronSourceBannerAd.getFromAvailableInstances(str);
        if (fromAvailableInstances != null && (bannerAdCallback = fromAvailableInstances.getBannerAdCallback()) != null) {
            bannerAdCallback.reportAdImpression();
        }
        IronSourceBannerAd.clearAllAvailableInstancesExceptOne(str);
    }
}
