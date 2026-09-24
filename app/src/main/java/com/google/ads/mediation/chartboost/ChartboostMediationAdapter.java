package com.google.ads.mediation.chartboost;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.chartboost.sdk.Chartboost;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ChartboostMediationAdapter extends Adapter {
    static final String ERROR_MESSAGE_INVALID_SERVER_PARAMETERS = "Invalid server parameters.";
    static final String ERROR_MESSAGE_MISSING_OR_INVALID_APP_ID = "Missing or invalid App ID.";
    static final String TAG = "ChartboostMediationAdapter";
    private static String preferredAppID;
    private static String preferredAppSignature;
    private ChartboostBannerAd bannerAd;
    private ChartboostInterstitialAd interstitialAd;
    private ChartboostRewardedAd rewardedAd;

    public static void setAppParams(String str, String str2) {
        preferredAppID = str;
        preferredAppSignature = str2;
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String sDKVersion = Chartboost.getSDKVersion();
        String[] strArrSplit = sDKVersion.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sDKVersion));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String adapterVersion = ChartboostAdapterUtils.getAdapterVersion();
        String[] strArrSplit = adapterVersion.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", adapterVersion));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, final InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        ChartboostParams chartboostParamsCreateChartboostParams;
        if (TextUtils.isEmpty(preferredAppID) || TextUtils.isEmpty(preferredAppSignature)) {
            HashMap map = new HashMap();
            Iterator<MediationConfiguration> it = list.iterator();
            while (it.hasNext()) {
                Bundle serverParameters = it.next().getServerParameters();
                String string = serverParameters.getString(RemoteConfigConstants.RequestFieldKey.APP_ID);
                if (!TextUtils.isEmpty(string)) {
                    map.put(string, serverParameters);
                }
            }
            int size = map.size();
            if (size <= 0) {
                AdError adErrorCreateAdapterError = ChartboostConstants.createAdapterError(103, ERROR_MESSAGE_MISSING_OR_INVALID_APP_ID);
                initializationCompleteCallback.onInitializationFailed(adErrorCreateAdapterError.toString());
                Log.e(TAG, adErrorCreateAdapterError.toString());
                return;
            }
            String str = (String) map.keySet().iterator().next();
            Bundle bundle = (Bundle) map.get(str);
            if (size > 1) {
                Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Chartboost SDK.", RemoteConfigConstants.RequestFieldKey.APP_ID, map.keySet(), str));
            }
            if (bundle == null) {
                AdError adErrorCreateAdapterError2 = ChartboostConstants.createAdapterError(103, ERROR_MESSAGE_INVALID_SERVER_PARAMETERS);
                initializationCompleteCallback.onInitializationFailed(adErrorCreateAdapterError2.toString());
                Log.e(TAG, adErrorCreateAdapterError2.toString());
                return;
            }
            chartboostParamsCreateChartboostParams = ChartboostAdapterUtils.createChartboostParams(bundle);
        } else {
            Log.d(TAG, String.format("Preferred parameters have been set. Initializing Chartboost SDK with App ID: '%s', App Signature: '%s'", preferredAppID, preferredAppSignature));
            chartboostParamsCreateChartboostParams = new ChartboostParams();
            chartboostParamsCreateChartboostParams.setAppId(preferredAppID);
            chartboostParamsCreateChartboostParams.setAppSignature(preferredAppSignature);
        }
        if (ChartboostAdapterUtils.isValidChartboostParams(chartboostParamsCreateChartboostParams)) {
            ChartboostInitializer.getInstance().initialize(context, chartboostParamsCreateChartboostParams, new ChartboostInitializer.Listener() { // from class: com.google.ads.mediation.chartboost.ChartboostMediationAdapter.1
                @Override // com.google.ads.mediation.chartboost.ChartboostInitializer.Listener
                public void onInitializationFailed(AdError adError) {
                    initializationCompleteCallback.onInitializationFailed(adError.toString());
                }

                @Override // com.google.ads.mediation.chartboost.ChartboostInitializer.Listener
                public void onInitializationSucceeded() {
                    initializationCompleteCallback.onInitializationSucceeded();
                }
            });
            return;
        }
        AdError adErrorCreateAdapterError3 = ChartboostConstants.createAdapterError(103, ERROR_MESSAGE_INVALID_SERVER_PARAMETERS);
        initializationCompleteCallback.onInitializationFailed(adErrorCreateAdapterError3.toString());
        Log.e(TAG, adErrorCreateAdapterError3.toString());
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        ChartboostBannerAd chartboostBannerAd = new ChartboostBannerAd(mediationAdLoadCallback);
        this.bannerAd = chartboostBannerAd;
        chartboostBannerAd.loadAd(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        ChartboostInterstitialAd chartboostInterstitialAd = new ChartboostInterstitialAd(mediationAdLoadCallback);
        this.interstitialAd = chartboostInterstitialAd;
        chartboostInterstitialAd.loadAd(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        ChartboostRewardedAd chartboostRewardedAd = new ChartboostRewardedAd(mediationAdLoadCallback);
        this.rewardedAd = chartboostRewardedAd;
        chartboostRewardedAd.loadAd(mediationRewardedAdConfiguration);
    }
}
