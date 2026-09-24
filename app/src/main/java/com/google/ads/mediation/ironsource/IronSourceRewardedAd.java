package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.ironsource.mediationsdk.IronSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceRewardedAd implements MediationRewardedAd {
    static final ConcurrentHashMap<String, WeakReference<IronSourceRewardedAd>> availableInstances = new ConcurrentHashMap<>();
    private static final IronSourceRewardedAdListener ironSourceRewardedListener = new IronSourceRewardedAdListener();
    private final String instanceID;
    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback;
    private MediationRewardedAdCallback mediationRewardedAdCallback;

    public IronSourceRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.instanceID = mediationRewardedAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.mediationAdLoadCallback = mediationAdLoadCallback;
    }

    static IronSourceRewardedAd getFromAvailableInstances(String str) {
        ConcurrentHashMap<String, WeakReference<IronSourceRewardedAd>> concurrentHashMap = availableInstances;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).get();
        }
        return null;
    }

    static IronSourceRewardedAdListener getIronSourceRewardedListener() {
        return ironSourceRewardedListener;
    }

    private boolean isParamsValid(Context context) {
        AdError adErrorValidateIronSourceAdLoadParams = IronSourceAdapterUtils.validateIronSourceAdLoadParams(context, this.instanceID);
        if (adErrorValidateIronSourceAdLoadParams != null) {
            onAdFailedToLoad(adErrorValidateIronSourceAdLoadParams);
            return false;
        }
        if (IronSourceAdapterUtils.canLoadIronSourceAdInstance(this.instanceID, availableInstances)) {
            return true;
        }
        onAdFailedToLoad(new AdError(103, String.format("An IronSource Rewarded ad is already loading for instance ID: %s", this.instanceID), "com.google.ads.mediation.ironsource"));
        return false;
    }

    private boolean loadValidConfig(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        if (!isParamsValid(mediationRewardedAdConfiguration.getContext())) {
            return false;
        }
        availableInstances.put(this.instanceID, new WeakReference<>(this));
        Log.d(IronSourceConstants.TAG, String.format("Loading IronSource rewarded ad with instance ID: %s", this.instanceID));
        return true;
    }

    private void onAdFailedToLoad(AdError adError) {
        Log.w(IronSourceConstants.TAG, adError.toString());
        this.mediationAdLoadCallback.onFailure(adError);
    }

    static void removeFromAvailableInstances(String str) {
        availableInstances.remove(str);
    }

    public MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> getMediationAdLoadCallback() {
        return this.mediationAdLoadCallback;
    }

    MediationRewardedAdCallback getRewardedAdCallback() {
        return this.mediationRewardedAdCallback;
    }

    public void loadWaterfallAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        if (loadValidConfig(mediationRewardedAdConfiguration)) {
            IronSource.loadISDemandOnlyRewardedVideo((Activity) mediationRewardedAdConfiguration.getContext(), this.instanceID);
        }
    }

    void setRewardedAdCallback(MediationRewardedAdCallback mediationRewardedAdCallback) {
        this.mediationRewardedAdCallback = mediationRewardedAdCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        Log.d(IronSourceConstants.TAG, String.format("Showing IronSource rewarded ad for instance ID: %s", this.instanceID));
        IronSource.showISDemandOnlyRewardedVideo(this.instanceID);
    }
}
