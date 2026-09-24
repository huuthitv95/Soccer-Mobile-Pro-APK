package com.ironsource.mediationsdk;

import com.ironsource.C12317m4;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.AdUnitAdapterInterface;
import com.ironsource.mediationsdk.sdk.BannerAdapterInterface;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAdapter implements RewardedVideoAdapterInterface, InterstitialAdapterInterface, BannerAdapterInterface, NativeAdAdapterInterface, AdapterNetworkDataInterface {
    private static Boolean mAdapterDebug;
    private String mPluginType;
    private final String mProviderName;
    private String mProviderNetworkKey;
    private final Map<LevelPlay.AdFormat, AdUnitAdapterInterface> mAdUnitAdapters = new HashMap();
    protected LoadWhileShowSupportState mLWSSupportState = LoadWhileShowSupportState.NONE;
    protected LoadWhileShowSupportState mBannerLoadWhileShowSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;

    public AbstractAdapter(String str) {
        this.mProviderName = str;
    }

    /* JADX INFO: renamed from: a */
    private BannerAdapterInterface m32230a() {
        return (BannerAdapterInterface) this.mAdUnitAdapters.get(LevelPlay.AdFormat.BANNER);
    }

    /* JADX INFO: renamed from: b */
    private InterstitialAdapterInterface m32231b() {
        return (InterstitialAdapterInterface) this.mAdUnitAdapters.get(LevelPlay.AdFormat.INTERSTITIAL);
    }

    /* JADX INFO: renamed from: c */
    private NativeAdAdapterInterface m32232c() {
        return (NativeAdAdapterInterface) this.mAdUnitAdapters.get(LevelPlay.AdFormat.NATIVE_AD);
    }

    /* JADX INFO: renamed from: d */
    private RewardedVideoAdapterInterface m32233d() {
        return (RewardedVideoAdapterInterface) this.mAdUnitAdapters.get(LevelPlay.AdFormat.REWARDED);
    }

    public static void postBackgroundThread(Runnable runnable) {
        IronSourceThreadManager.INSTANCE.postAdapterBackgroundTask(runnable);
    }

    public static void postOnUIThread(Runnable runnable) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        BannerAdapterInterface bannerAdapterInterfaceM32230a = m32230a();
        if (bannerAdapterInterfaceM32230a != null) {
            bannerAdapterInterfaceM32230a.collectBannerBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        Map<String, Object> bannerBiddingData = getBannerBiddingData(jSONObject, jSONObject2);
        if (bannerBiddingData != null) {
            biddingDataCallback.onSuccess(bannerBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void collectInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        InterstitialAdapterInterface interstitialAdapterInterfaceM32231b = m32231b();
        if (interstitialAdapterInterfaceM32231b != null) {
            interstitialAdapterInterfaceM32231b.collectInterstitialBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        Map<String, Object> interstitialBiddingData = getInterstitialBiddingData(jSONObject, jSONObject2);
        if (interstitialBiddingData != null) {
            biddingDataCallback.onSuccess(interstitialBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void collectNativeAdBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        NativeAdAdapterInterface nativeAdAdapterInterfaceM32232c = m32232c();
        if (nativeAdAdapterInterfaceM32232c != null) {
            nativeAdAdapterInterfaceM32232c.collectNativeAdBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        Map<String, Object> nativeAdBiddingData = getNativeAdBiddingData(jSONObject, jSONObject2);
        if (nativeAdBiddingData != null) {
            biddingDataCallback.onSuccess(nativeAdBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceM32233d = m32233d();
        if (rewardedVideoAdapterInterfaceM32233d != null) {
            rewardedVideoAdapterInterfaceM32233d.collectRewardedVideoBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        Map<String, Object> rewardedVideoBiddingData = getRewardedVideoBiddingData(jSONObject, jSONObject2);
        if (rewardedVideoBiddingData != null) {
            biddingDataCallback.onSuccess(rewardedVideoBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void destroyBanner(JSONObject jSONObject) {
        BannerAdapterInterface bannerAdapterInterfaceM32230a = m32230a();
        if (bannerAdapterInterfaceM32230a != null) {
            bannerAdapterInterfaceM32230a.destroyBanner(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void destroyInterstitialAd(JSONObject jSONObject) {
        InterstitialAdapterInterface interstitialAdapterInterfaceM32231b = m32231b();
        if (interstitialAdapterInterfaceM32231b != null) {
            interstitialAdapterInterfaceM32231b.destroyInterstitialAd(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(JSONObject jSONObject) {
        NativeAdAdapterInterface nativeAdAdapterInterfaceM32232c = m32232c();
        if (nativeAdAdapterInterfaceM32232c != null) {
            nativeAdAdapterInterfaceM32232c.destroyNativeAd(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void destroyRewardedVideoAd(JSONObject jSONObject) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceM32233d = m32233d();
        if (rewardedVideoAdapterInterfaceM32233d != null) {
            rewardedVideoAdapterInterfaceM32233d.destroyRewardedVideoAd(jSONObject);
        }
    }

    public void earlyInit(String str, String str2, JSONObject jSONObject) {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public int getAdaptiveHeight(int i) {
        BannerAdapterInterface bannerAdapterInterfaceM32230a = m32230a();
        if (bannerAdapterInterfaceM32230a != null) {
            return bannerAdapterInterfaceM32230a.getAdaptiveHeight(i);
        }
        return -1;
    }

    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        BannerAdapterInterface bannerAdapterInterfaceM32230a = m32230a();
        if (bannerAdapterInterfaceM32230a != null) {
            return bannerAdapterInterfaceM32230a.getBannerBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public LoadWhileShowSupportState getBannerLoadWhileShowSupportState(JSONObject jSONObject) {
        return this.mBannerLoadWhileShowSupportState;
    }

    public abstract String getCoreSDKVersion();

    public String getDynamicUserId() {
        return C12367p.m32628h().m32666g();
    }

    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        InterstitialAdapterInterface interstitialAdapterInterfaceM32231b = m32231b();
        if (interstitialAdapterInterfaceM32231b != null) {
            return interstitialAdapterInterfaceM32231b.getInterstitialBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        return this.mLWSSupportState;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public Map<String, Object> getNativeAdBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        NativeAdAdapterInterface nativeAdAdapterInterfaceM32232c = m32232c();
        if (nativeAdAdapterInterfaceM32232c != null) {
            return nativeAdAdapterInterfaceM32232c.getNativeAdBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public String getPluginType() {
        return this.mPluginType;
    }

    public String getProviderName() {
        return this.mProviderName;
    }

    public String getProviderNetworkKey() {
        return this.mProviderNetworkKey;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceM32233d = m32233d();
        if (rewardedVideoAdapterInterfaceM32233d != null) {
            return rewardedVideoAdapterInterfaceM32233d.getRewardedVideoBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public abstract String getVersion();

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceM32233d = m32233d();
            try {
                if (rewardedVideoAdapterInterfaceM32233d != null) {
                    rewardedVideoAdapterInterfaceM32233d.initAndLoadRewardedVideo(str, str2, jSONObject, jSONObject2, rewardedVideoSmashListener);
                } else if (rewardedVideoSmashListener != null) {
                    rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
                }
            } catch (Error e) {
                e = e;
                Error error = e;
                C12317m4.m32153d().m32155a(error);
                IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + error.getMessage());
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        } catch (Error e2) {
            e = e2;
        }
    }

    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        try {
            BannerAdapterInterface bannerAdapterInterfaceM32230a = m32230a();
            if (bannerAdapterInterfaceM32230a != null) {
                bannerAdapterInterfaceM32230a.initBannerForBidding(str, str2, jSONObject, bannerSmashListener);
            } else if (bannerSmashListener != null) {
                bannerSmashListener.onBannerInitFailed(new IronSourceError(510, "method not implemented"));
            }
        } catch (Error e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            StringBuilder sb = new StringBuilder("error - ");
            sb.append(e.getMessage());
            bannerSmashListener.onBannerInitFailed(new IronSourceError(510, sb.toString()));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        try {
            BannerAdapterInterface bannerAdapterInterfaceM32230a = m32230a();
            if (bannerAdapterInterfaceM32230a != null) {
                bannerAdapterInterfaceM32230a.initBanners(str, str2, jSONObject, bannerSmashListener);
            } else if (bannerSmashListener != null) {
                bannerSmashListener.onBannerInitFailed(new IronSourceError(510, "method not implemented"));
            }
        } catch (Error e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            StringBuilder sb = new StringBuilder("error - ");
            sb.append(e.getMessage());
            bannerSmashListener.onBannerInitFailed(new IronSourceError(510, sb.toString()));
        }
    }

    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        try {
            InterstitialAdapterInterface interstitialAdapterInterfaceM32231b = m32231b();
            if (interstitialAdapterInterfaceM32231b != null) {
                interstitialAdapterInterfaceM32231b.initInterstitial(str, str2, jSONObject, interstitialSmashListener);
            } else if (interstitialSmashListener != null) {
                interstitialSmashListener.onInterstitialInitFailed(new IronSourceError(510, "method not implemented"));
            }
        } catch (Error e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            StringBuilder sb = new StringBuilder("error - ");
            sb.append(e.getMessage());
            interstitialSmashListener.onInterstitialInitFailed(new IronSourceError(510, sb.toString()));
        }
    }

    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        try {
            InterstitialAdapterInterface interstitialAdapterInterfaceM32231b = m32231b();
            if (interstitialAdapterInterfaceM32231b != null) {
                interstitialAdapterInterfaceM32231b.initInterstitialForBidding(str, str2, jSONObject, interstitialSmashListener);
            } else if (interstitialSmashListener != null) {
                interstitialSmashListener.onInterstitialInitFailed(new IronSourceError(510, "method not implemented"));
            }
        } catch (Error e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            StringBuilder sb = new StringBuilder("error - ");
            sb.append(e.getMessage());
            interstitialSmashListener.onInterstitialInitFailed(new IronSourceError(510, sb.toString()));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(String str, String str2, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener) {
        NativeAdAdapterInterface nativeAdAdapterInterfaceM32232c = m32232c();
        if (nativeAdAdapterInterfaceM32232c != null) {
            nativeAdAdapterInterfaceM32232c.initNativeAdForBidding(str, str2, jSONObject, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAds(String str, String str2, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener) {
        NativeAdAdapterInterface nativeAdAdapterInterfaceM32232c = m32232c();
        if (nativeAdAdapterInterfaceM32232c != null) {
            nativeAdAdapterInterfaceM32232c.initNativeAds(str, str2, jSONObject, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceM32233d = m32233d();
        if (rewardedVideoAdapterInterfaceM32233d != null) {
            rewardedVideoAdapterInterfaceM32233d.initRewardedVideoForDemandOnly(str, str2, jSONObject, rewardedVideoSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceM32233d = m32233d();
            if (rewardedVideoAdapterInterfaceM32233d != null) {
                rewardedVideoAdapterInterfaceM32233d.initRewardedVideoWithCallback(str, str2, jSONObject, rewardedVideoSmashListener);
            } else if (rewardedVideoSmashListener != null) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(new IronSourceError(510, "method not implemented"));
            }
        } catch (Error e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            StringBuilder sb = new StringBuilder("error - ");
            sb.append(e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoInitFailed(new IronSourceError(510, sb.toString()));
        }
    }

    protected boolean isAdaptersDebugEnabled() {
        Boolean bool = mAdapterDebug;
        return bool != null && bool.booleanValue();
    }

    public boolean isInterstitialReady(JSONObject jSONObject) {
        InterstitialAdapterInterface interstitialAdapterInterfaceM32231b = m32231b();
        if (interstitialAdapterInterfaceM32231b != null) {
            return interstitialAdapterInterfaceM32231b.isInterstitialReady(jSONObject);
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceM32233d = m32233d();
        if (rewardedVideoAdapterInterfaceM32233d != null) {
            return rewardedVideoAdapterInterfaceM32233d.isRewardedVideoAvailable(jSONObject);
        }
        return false;
    }

    public boolean isUsingActivityBeforeImpression(LevelPlay.AdFormat adFormat) {
        return true;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(JSONObject jSONObject, JSONObject jSONObject2, ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener) {
        BannerAdapterInterface bannerAdapterInterfaceM32230a = m32230a();
        if (bannerAdapterInterfaceM32230a != null) {
            bannerAdapterInterfaceM32230a.loadBanner(jSONObject, jSONObject2, iSBannerSize, bannerSmashListener);
        }
    }

    public void loadBannerForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener) {
        BannerAdapterInterface bannerAdapterInterfaceM32230a = m32230a();
        if (bannerAdapterInterfaceM32230a != null) {
            bannerAdapterInterfaceM32230a.loadBannerForBidding(jSONObject, jSONObject2, str, iSBannerSize, bannerSmashListener);
        }
    }

    public void loadBannerForDemandOnlyForBidding(JSONObject jSONObject, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, BannerSmashListener bannerSmashListener) {
        BannerAdapterInterface bannerAdapterInterfaceM32230a = m32230a();
        if (bannerAdapterInterfaceM32230a != null) {
            bannerAdapterInterfaceM32230a.loadBannerForDemandOnlyForBidding(jSONObject, str, iSDemandOnlyBannerLayout, bannerSmashListener);
        }
    }

    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        InterstitialAdapterInterface interstitialAdapterInterfaceM32231b = m32231b();
        if (interstitialAdapterInterfaceM32231b != null) {
            interstitialAdapterInterfaceM32231b.loadInterstitial(jSONObject, jSONObject2, interstitialSmashListener);
        }
    }

    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, InterstitialSmashListener interstitialSmashListener) {
        InterstitialAdapterInterface interstitialAdapterInterfaceM32231b = m32231b();
        if (interstitialAdapterInterfaceM32231b != null) {
            interstitialAdapterInterfaceM32231b.loadInterstitialForBidding(jSONObject, jSONObject2, str, interstitialSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAd(JSONObject jSONObject, JSONObject jSONObject2, NativeAdSmashListener nativeAdSmashListener) {
        NativeAdAdapterInterface nativeAdAdapterInterfaceM32232c = m32232c();
        if (nativeAdAdapterInterfaceM32232c != null) {
            nativeAdAdapterInterfaceM32232c.loadNativeAd(jSONObject, jSONObject2, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, NativeAdSmashListener nativeAdSmashListener) {
        NativeAdAdapterInterface nativeAdAdapterInterfaceM32232c = m32232c();
        if (nativeAdAdapterInterfaceM32232c != null) {
            nativeAdAdapterInterfaceM32232c.loadNativeAdForBidding(jSONObject, jSONObject2, str, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceM32233d = m32233d();
        if (rewardedVideoAdapterInterfaceM32233d != null) {
            rewardedVideoAdapterInterfaceM32233d.loadRewardedVideo(jSONObject, jSONObject2, rewardedVideoSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceM32233d = m32233d();
        if (rewardedVideoAdapterInterfaceM32233d != null) {
            rewardedVideoAdapterInterfaceM32233d.loadRewardedVideoForBidding(jSONObject, jSONObject2, str, rewardedVideoSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewBound(JSONObject jSONObject) {
        BannerAdapterInterface bannerAdapterInterfaceM32230a = m32230a();
        if (bannerAdapterInterfaceM32230a != null) {
            bannerAdapterInterfaceM32230a.onBannerViewBound(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewWillBind(JSONObject jSONObject) {
        BannerAdapterInterface bannerAdapterInterfaceM32230a = m32230a();
        if (bannerAdapterInterfaceM32230a != null) {
            bannerAdapterInterfaceM32230a.onBannerViewWillBind(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        Iterator<AdUnitAdapterInterface> it = this.mAdUnitAdapters.values().iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackFailed(str);
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        Iterator<AdUnitAdapterInterface> it = this.mAdUnitAdapters.values().iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
    }

    protected void setAdapterDebug(Boolean bool) {
        mAdapterDebug = bool;
    }

    protected void setBannerAdapter(BannerAdapterInterface bannerAdapterInterface) {
        this.mAdUnitAdapters.put(LevelPlay.AdFormat.BANNER, bannerAdapterInterface);
    }

    protected void setConsent(boolean z) {
    }

    protected void setInterstitialAdapter(InterstitialAdapterInterface interstitialAdapterInterface) {
        this.mAdUnitAdapters.put(LevelPlay.AdFormat.INTERSTITIAL, interstitialAdapterInterface);
    }

    protected void setMetaData(String str, List<String> list) {
    }

    protected void setNativeAdAdapter(NativeAdAdapterInterface nativeAdAdapterInterface) {
        this.mAdUnitAdapters.put(LevelPlay.AdFormat.NATIVE_AD, nativeAdAdapterInterface);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(AdapterNetworkData adapterNetworkData) {
        IronLog.INTERNAL.verbose("setNetworkData not implemented | adapter=" + getClass().getSimpleName() + ", networkData=" + adapterNetworkData);
    }

    public void setNewConsent(boolean z) {
        setConsent(z);
    }

    public void setPluginData(String str) {
        this.mPluginType = str;
    }

    public void setProviderNetworkKey(String str) {
        this.mProviderNetworkKey = str;
    }

    protected void setRewardedVideoAdapter(RewardedVideoAdapterInterface rewardedVideoAdapterInterface) {
        this.mAdUnitAdapters.put(LevelPlay.AdFormat.REWARDED, rewardedVideoAdapterInterface);
    }

    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        InterstitialAdapterInterface interstitialAdapterInterfaceM32231b = m32231b();
        if (interstitialAdapterInterfaceM32231b != null) {
            interstitialAdapterInterfaceM32231b.showInterstitial(jSONObject, interstitialSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceM32233d = m32233d();
        if (rewardedVideoAdapterInterfaceM32233d != null) {
            rewardedVideoAdapterInterfaceM32233d.showRewardedVideo(jSONObject, rewardedVideoSmashListener);
        }
    }
}
