package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.ironsource.mediationsdk.IronSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceInterstitialAd implements MediationInterstitialAd {
    static final ConcurrentHashMap<String, WeakReference<IronSourceInterstitialAd>> availableInterstitialInstances = new ConcurrentHashMap<>();
    private static final IronSourceInterstitialAdListener ironSourceInterstitialListener = new IronSourceInterstitialAdListener();
    private final String instanceID;
    private MediationInterstitialAdCallback interstitialAdCallback;
    private final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback;

    public IronSourceInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.instanceID = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.mediationAdLoadCallback = mediationAdLoadCallback;
    }

    static IronSourceInterstitialAd getFromAvailableInstances(String str) {
        ConcurrentHashMap<String, WeakReference<IronSourceInterstitialAd>> concurrentHashMap = availableInterstitialInstances;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).get();
        }
        return null;
    }

    static IronSourceInterstitialAdListener getIronSourceInterstitialListener() {
        return ironSourceInterstitialListener;
    }

    private boolean isParamsValid(Context context) {
        AdError adErrorValidateIronSourceAdLoadParams = IronSourceAdapterUtils.validateIronSourceAdLoadParams(context, this.instanceID);
        if (adErrorValidateIronSourceAdLoadParams != null) {
            onAdFailedToLoad(adErrorValidateIronSourceAdLoadParams);
            return false;
        }
        if (IronSourceAdapterUtils.canLoadIronSourceAdInstance(this.instanceID, availableInterstitialInstances)) {
            return true;
        }
        onAdFailedToLoad(new AdError(103, String.format("An IronSource interstitial ad is already loading for instance ID: %s", this.instanceID), "com.google.ads.mediation.ironsource"));
        return false;
    }

    private boolean loadValidConfig(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        if (!isParamsValid(mediationInterstitialAdConfiguration.getContext())) {
            return false;
        }
        availableInterstitialInstances.put(this.instanceID, new WeakReference<>(this));
        Log.d(IronSourceConstants.TAG, String.format("Loading IronSource interstitial ad with instance ID: %s", this.instanceID));
        return true;
    }

    private void onAdFailedToLoad(AdError adError) {
        Log.e(IronSourceConstants.TAG, adError.toString());
        MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    static void removeFromAvailableInstances(String str) {
        availableInterstitialInstances.remove(str);
    }

    MediationInterstitialAdCallback getInterstitialAdCallback() {
        return this.interstitialAdCallback;
    }

    public MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> getMediationAdLoadCallback() {
        return this.mediationAdLoadCallback;
    }

    public void loadWaterfallAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        if (loadValidConfig(mediationInterstitialAdConfiguration)) {
            IronSource.loadISDemandOnlyInterstitial((Activity) mediationInterstitialAdConfiguration.getContext(), this.instanceID);
        }
    }

    void setInterstitialAdCallback(MediationInterstitialAdCallback mediationInterstitialAdCallback) {
        this.interstitialAdCallback = mediationInterstitialAdCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        IronSource.showISDemandOnlyInterstitial(this.instanceID);
    }
}
