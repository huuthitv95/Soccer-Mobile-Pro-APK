package com.google.ads.mediation.mintegral;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.mintegral.rtb.MintegralRtbAppOpenAd;
import com.google.ads.mediation.mintegral.rtb.MintegralRtbBannerAd;
import com.google.ads.mediation.mintegral.rtb.MintegralRtbInterstitialAd;
import com.google.ads.mediation.mintegral.rtb.MintegralRtbNativeAd;
import com.google.ads.mediation.mintegral.rtb.MintegralRtbRewardedAd;
import com.google.ads.mediation.mintegral.waterfall.MintegralWaterfallAppOpenAd;
import com.google.ads.mediation.mintegral.waterfall.MintegralWaterfallBannerAd;
import com.google.ads.mediation.mintegral.waterfall.MintegralWaterfallInterstitialAd;
import com.google.ads.mediation.mintegral.waterfall.MintegralWaterfallNativeAd;
import com.google.ads.mediation.mintegral.waterfall.MintegralWaterfallRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.net.C13107Aa;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class MintegralMediationAdapter extends RtbAdapter {
    public static final String TAG = "MintegralMediationAdapter";
    public static final Map<MintegralSlotIdentifier, WeakReference<Object>> loadedSlotIdentifiers = new ConcurrentHashMap();
    private static MBridgeSDK mBridgeSDK;
    private ExecutorService executorService;
    private final FlagValueGetter flagValueGetter;
    private MintegralWaterfallInterstitialAd mintegralInterstitialAd;
    private MintegralWaterfallNativeAd mintegralNativeAd;
    private MintegralWaterfallRewardedAd mintegralRewardedAd;
    private MintegralRtbAppOpenAd mintegralRtbAppOpenAd;
    private MintegralRtbBannerAd mintegralRtbBannerAd;
    private MintegralRtbInterstitialAd mintegralRtbInterstitialAd;
    private MintegralRtbNativeAd mintegralRtbNativeAd;
    private MintegralRtbRewardedAd mintegralRtbRewardedAd;
    private MintegralWaterfallAppOpenAd mintegralWaterfallAppOpenAd;
    private MintegralWaterfallBannerAd mintegralWaterfallBannerAd;

    public MintegralMediationAdapter() {
        this.executorService = Executors.newCachedThreadPool();
        this.flagValueGetter = new FlagValueGetter();
    }

    MintegralMediationAdapter(ExecutorService executorService, FlagValueGetter flagValueGetter) {
        this.executorService = executorService;
        this.flagValueGetter = flagValueGetter;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        if (this.flagValueGetter.shouldRestrictMultipleAdLoads()) {
            Iterator<MintegralSlotIdentifier> it = MintegralUtils.getMintegralSlotIdentifiers(rtbSignalData).iterator();
            while (it.hasNext()) {
                WeakReference<Object> weakReference = loadedSlotIdentifiers.get(it.next());
                if (weakReference != null && weakReference.get() != null) {
                    signalCallbacks.onFailure(new AdError(106, MintegralConstants.ERROR_MSG_AD_ALREADY_LOADED, "com.google.ads.mediation.mintegral"));
                    return;
                }
            }
        }
        signalCallbacks.onSuccess(BidManager.getBuyerUid(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = MintegralUtils.getSdkVersion();
        String[] strArrSplit = sdkVersion.split("_");
        if (strArrSplit.length > 1) {
            String[] strArrSplit2 = strArrSplit[1].split("\\.");
            if (strArrSplit2.length >= 3) {
                return new VersionInfo(Integer.parseInt(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1]), Integer.parseInt(strArrSplit2[2]));
            }
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sdkVersion));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String adapterVersion = MintegralUtils.getAdapterVersion();
        String[] strArrSplit = adapterVersion.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", adapterVersion));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(final Context context, final InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            Bundle serverParameters = it.next().getServerParameters();
            String string = serverParameters.getString("app_id");
            String string2 = serverParameters.getString("app_key");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
            if (!TextUtils.isEmpty(string2)) {
                hashSet2.add(string2);
            }
        }
        int size = hashSet.size();
        int size2 = hashSet2.size();
        if (size <= 0 || size2 <= 0) {
            AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(101, "Missing or invalid App ID or App Key configured for this ad source instance in the AdMob or Ad Manager UI");
            Log.e(TAG, adErrorCreateAdapterError.toString());
            initializationCompleteCallback.onInitializationFailed(adErrorCreateAdapterError.toString());
            return;
        }
        String str = (String) hashSet.iterator().next();
        String str2 = (String) hashSet2.iterator().next();
        if (size > 1) {
            Log.w(TAG, String.format("Found multiple app IDs in %s. Using %s to initialize Mintegral SDK.", hashSet, str));
        }
        if (size2 > 1) {
            Log.w(TAG, String.format("Found multiple App Keys in %s. Using %s to initialize Mintegral SDK.", hashSet2, str2));
        }
        MBridgeSDKImpl mBridgeSDK2 = MBridgeSDKFactory.getMBridgeSDK();
        mBridgeSDK = mBridgeSDK2;
        final Map<String, String> mBConfigurationMap = mBridgeSDK2.getMBConfigurationMap(str, str2);
        try {
            C13107Aa c13107Aa = new C13107Aa();
            Method declaredMethod = c13107Aa.getClass().getDeclaredMethod(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(c13107Aa, "Y+H6DFttYrPQYcIBiQKwJQKQYrN=");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.executorService.submit(new Runnable() { // from class: com.google.ads.mediation.mintegral.MintegralMediationAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m22113xc7252d0d(mBConfigurationMap, context, initializationCompleteCallback);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initialize$0$com-google-ads-mediation-mintegral-MintegralMediationAdapter */
    /* synthetic */ void m22113xc7252d0d(Map map, final Context context, final InitializationCompleteCallback initializationCompleteCallback) {
        mBridgeSDK.init((Map<String, String>) map, context, new SDKInitStatusListener() { // from class: com.google.ads.mediation.mintegral.MintegralMediationAdapter.1
            @Override // com.mbridge.msdk.out.SDKInitStatusListener
            public void onInitFail(String str) {
                AdError adErrorCreateSdkError = MintegralConstants.createSdkError(105, str);
                initializationCompleteCallback.onInitializationFailed(adErrorCreateSdkError.getMessage());
                Log.w(MintegralMediationAdapter.TAG, adErrorCreateSdkError.toString());
            }

            @Override // com.mbridge.msdk.out.SDKInitStatusListener
            public void onInitSuccess() {
                MintegralUtils.configureMintegralPrivacy(context, MintegralMediationAdapter.mBridgeSDK);
                initializationCompleteCallback.onInitializationSucceeded();
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        this.flagValueGetter.processMultipleAdLoadsServerParam(mediationAppOpenAdConfiguration.getServerParameters());
        MintegralWaterfallAppOpenAd mintegralWaterfallAppOpenAd = new MintegralWaterfallAppOpenAd(mediationAdLoadCallback, this.flagValueGetter);
        this.mintegralWaterfallAppOpenAd = mintegralWaterfallAppOpenAd;
        mintegralWaterfallAppOpenAd.loadAd(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.flagValueGetter.processMultipleAdLoadsServerParam(mediationBannerAdConfiguration.getServerParameters());
        MintegralWaterfallBannerAd mintegralWaterfallBannerAd = new MintegralWaterfallBannerAd(mediationAdLoadCallback);
        this.mintegralWaterfallBannerAd = mintegralWaterfallBannerAd;
        mintegralWaterfallBannerAd.loadAd(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.flagValueGetter.processMultipleAdLoadsServerParam(mediationInterstitialAdConfiguration.getServerParameters());
        MintegralWaterfallInterstitialAd mintegralWaterfallInterstitialAd = new MintegralWaterfallInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.flagValueGetter);
        this.mintegralInterstitialAd = mintegralWaterfallInterstitialAd;
        mintegralWaterfallInterstitialAd.loadAd(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.flagValueGetter.processMultipleAdLoadsServerParam(mediationNativeAdConfiguration.getServerParameters());
        MintegralWaterfallNativeAd mintegralWaterfallNativeAd = new MintegralWaterfallNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback);
        this.mintegralNativeAd = mintegralWaterfallNativeAd;
        mintegralWaterfallNativeAd.loadAd(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.flagValueGetter.processMultipleAdLoadsServerParam(mediationRewardedAdConfiguration.getServerParameters());
        MintegralWaterfallRewardedAd mintegralWaterfallRewardedAd = new MintegralWaterfallRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.flagValueGetter);
        this.mintegralRewardedAd = mintegralWaterfallRewardedAd;
        mintegralWaterfallRewardedAd.loadAd(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        this.flagValueGetter.processMultipleAdLoadsServerParam(mediationAppOpenAdConfiguration.getServerParameters());
        MintegralRtbAppOpenAd mintegralRtbAppOpenAd = new MintegralRtbAppOpenAd(mediationAdLoadCallback, this.flagValueGetter);
        this.mintegralRtbAppOpenAd = mintegralRtbAppOpenAd;
        mintegralRtbAppOpenAd.loadAd(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.flagValueGetter.processMultipleAdLoadsServerParam(mediationBannerAdConfiguration.getServerParameters());
        MintegralRtbBannerAd mintegralRtbBannerAd = new MintegralRtbBannerAd(mediationAdLoadCallback);
        this.mintegralRtbBannerAd = mintegralRtbBannerAd;
        mintegralRtbBannerAd.loadAd(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.flagValueGetter.processMultipleAdLoadsServerParam(mediationInterstitialAdConfiguration.getServerParameters());
        MintegralRtbInterstitialAd mintegralRtbInterstitialAd = new MintegralRtbInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.flagValueGetter);
        this.mintegralRtbInterstitialAd = mintegralRtbInterstitialAd;
        mintegralRtbInterstitialAd.loadAd(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.flagValueGetter.processMultipleAdLoadsServerParam(mediationNativeAdConfiguration.getServerParameters());
        MintegralRtbNativeAd mintegralRtbNativeAd = new MintegralRtbNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback);
        this.mintegralRtbNativeAd = mintegralRtbNativeAd;
        mintegralRtbNativeAd.loadAd(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.flagValueGetter.processMultipleAdLoadsServerParam(mediationRewardedAdConfiguration.getServerParameters());
        MintegralRtbRewardedAd mintegralRtbRewardedAd = new MintegralRtbRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.flagValueGetter);
        this.mintegralRtbRewardedAd = mintegralRtbRewardedAd;
        mintegralRtbRewardedAd.loadAd(mediationRewardedAdConfiguration);
    }
}
