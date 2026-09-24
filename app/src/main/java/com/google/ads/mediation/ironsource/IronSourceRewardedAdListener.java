package com.google.ads.mediation.ironsource;

import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceRewardedAdListener implements ISDemandOnlyRewardedVideoListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        MediationRewardedAdCallback rewardedAdCallback;
        Log.d(IronSourceConstants.TAG, String.format("IronSource rewarded ad clicked for instance ID: %s", str));
        IronSourceRewardedAd fromAvailableInstances = IronSourceRewardedAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || (rewardedAdCallback = fromAvailableInstances.getRewardedAdCallback()) == null) {
            return;
        }
        rewardedAdCallback.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        MediationRewardedAdCallback rewardedAdCallback;
        Log.d(IronSourceConstants.TAG, String.format("IronSource rewarded ad closed for instance ID: %s", str));
        IronSourceRewardedAd fromAvailableInstances = IronSourceRewardedAd.getFromAvailableInstances(str);
        if (fromAvailableInstances != null && (rewardedAdCallback = fromAvailableInstances.getRewardedAdCallback()) != null) {
            rewardedAdCallback.onAdClosed();
        }
        IronSourceRewardedAd.removeFromAvailableInstances(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.e(IronSourceConstants.TAG, adError.toString());
        IronSourceRewardedAd fromAvailableInstances = IronSourceRewardedAd.getFromAvailableInstances(str);
        if (fromAvailableInstances != null && fromAvailableInstances.getMediationAdLoadCallback() != null) {
            fromAvailableInstances.getMediationAdLoadCallback().onFailure(adError);
        }
        IronSourceRewardedAd.removeFromAvailableInstances(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        Log.d(IronSourceConstants.TAG, String.format("IronSource rewarded ad loaded for instance ID: %s", str));
        IronSourceRewardedAd fromAvailableInstances = IronSourceRewardedAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || fromAvailableInstances.getMediationAdLoadCallback() == null) {
            return;
        }
        fromAvailableInstances.setRewardedAdCallback(fromAvailableInstances.getMediationAdLoadCallback().onSuccess(fromAvailableInstances));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        MediationRewardedAdCallback rewardedAdCallback;
        Log.d(IronSourceConstants.TAG, String.format("IronSource rewarded ad opened for instance ID: %s", str));
        IronSourceRewardedAd fromAvailableInstances = IronSourceRewardedAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || (rewardedAdCallback = fromAvailableInstances.getRewardedAdCallback()) == null) {
            return;
        }
        rewardedAdCallback.onAdOpened();
        rewardedAdCallback.onVideoStart();
        rewardedAdCallback.reportAdImpression();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        MediationRewardedAdCallback rewardedAdCallback;
        Log.d(IronSourceConstants.TAG, String.format("IronSource rewarded ad received reward for instance ID: %s", str));
        IronSourceRewardedAd fromAvailableInstances = IronSourceRewardedAd.getFromAvailableInstances(str);
        if (fromAvailableInstances == null || (rewardedAdCallback = fromAvailableInstances.getRewardedAdCallback()) == null) {
            return;
        }
        rewardedAdCallback.onVideoComplete();
        rewardedAdCallback.onUserEarnedReward();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        MediationRewardedAdCallback rewardedAdCallback;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.e(IronSourceConstants.TAG, adError.toString());
        IronSourceRewardedAd fromAvailableInstances = IronSourceRewardedAd.getFromAvailableInstances(str);
        if (fromAvailableInstances != null && (rewardedAdCallback = fromAvailableInstances.getRewardedAdCallback()) != null) {
            rewardedAdCallback.onAdFailedToShow(adError);
        }
        IronSourceRewardedAd.removeFromAvailableInstances(str);
    }
}
