package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.AbstractC1677p0;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.mediation.MaxRewardImpl;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MediationAdapterBase implements MaxAdapter, MaxNativeAdAdapter, MaxInterstitialAdViewAdapter, MaxRewardedAdViewAdapter, MaxAppOpenAdapter {
    private static final String ADAPTIVE_AD_VIEW_TYPE_INLINE = "inline";
    private boolean alwaysRewardUser;
    private final C1768p mLogger;
    private final C1748l mSdk;
    private final String mTag;
    private final AppLovinSdk mWrappingSdk;
    private MaxReward reward;

    public MediationAdapterBase(AppLovinSdk appLovinSdk) {
        this.mWrappingSdk = appLovinSdk;
        C1748l c1748lM5807a = appLovinSdk.m5807a();
        this.mSdk = c1748lM5807a;
        this.mLogger = c1748lM5807a.m4782Q();
        this.mTag = getClass().getSimpleName();
    }

    protected static String mediationTag() {
        return "AppLovinSdk_" + AppLovinSdk.VERSION;
    }

    protected void checkActivities(Context context, Class<?>... clsArr) {
    }

    protected void checkExistence(Class<?>... clsArr) {
        if (clsArr == null || clsArr.length <= 0) {
            return;
        }
        for (Class<?> cls : clsArr) {
            log("Found: " + cls.getName());
        }
    }

    protected void configureReward(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        this.alwaysRewardUser = BundleUtils.getBoolean("always_reward_user", maxAdapterResponseParameters.isTesting(), serverParameters);
        int i = BundleUtils.getInt("amount", 0, serverParameters);
        String string = BundleUtils.getString("currency", "", serverParameters);
        log("Creating reward: " + i + " " + string);
        this.reward = MaxRewardImpl.create(i, string);
    }

    protected Future<Drawable> createDrawableFuture(final String str, final Resources resources) {
        return getCachingExecutorService().submit(new Callable<Drawable>() { // from class: com.applovin.mediation.adapters.MediationAdapterBase.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Drawable call() throws Exception {
                InputStream inputStreamOpenStream = new URL(str).openStream();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeStream(inputStreamOpenStream));
                inputStreamOpenStream.close();
                return bitmapDrawable;
            }
        });
    }

    /* JADX INFO: renamed from: d */
    protected void m5769d(String str) {
        if (C1768p.m5160a()) {
            this.mLogger.m5171a(this.mTag, str);
        }
    }

    /* JADX INFO: renamed from: e */
    protected void m5770e(String str) {
        if (C1768p.m5160a()) {
            this.mLogger.m5174b(this.mTag, str);
        }
    }

    /* JADX INFO: renamed from: e */
    protected void m5771e(String str, Throwable th) {
        if (C1768p.m5160a()) {
            this.mLogger.m5172a(this.mTag, str, th);
        }
    }

    protected int getAdaptiveAdViewWidth(MaxAdapterParameters maxAdapterParameters, Context context) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner_width");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj != null) {
            m5770e("Expected parameter \"adaptive_banner_width\" to be of type Integer, received: " + obj.getClass());
        }
        return AppLovinSdkUtils.pxToDp(context, AbstractC1677p0.m3793a(context).x);
    }

    protected Context getApplicationContext() {
        return C1748l.m4756p();
    }

    protected ExecutorService getCachingExecutorService() {
        return this.mSdk.m4853s0().m2609b();
    }

    protected int getInlineAdaptiveAdViewMaximumHeight(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("inline_adaptive_banner_max_height");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj == null) {
            return -1;
        }
        m5770e("Expected parameter \"inline_adaptive_banner_max_height\" to be of type Integer, received: " + obj.getClass());
        return -1;
    }

    protected MaxReward getReward() {
        MaxReward maxReward = this.reward;
        return maxReward != null ? maxReward : MaxRewardImpl.createDefault();
    }

    String getVersionString(Class cls, String str) {
        String strM4078b = AbstractC1701q7.m4078b(cls, str);
        if (strM4078b == null) {
            log("Failed to retrieve version string.");
        }
        return strM4078b;
    }

    protected AppLovinSdk getWrappingSdk() {
        return this.mWrappingSdk;
    }

    /* JADX INFO: renamed from: i */
    protected void m5772i(String str) {
        if (C1768p.m5160a()) {
            this.mLogger.m5175d(this.mTag, str);
        }
    }

    protected boolean isAdaptiveAdViewFormat(MaxAdFormat maxAdFormat, MaxAdapterParameters maxAdapterParameters) {
        return (maxAdFormat == MaxAdFormat.MREC && isInlineAdaptiveAdView(maxAdapterParameters)) || maxAdFormat == MaxAdFormat.BANNER || maxAdFormat == MaxAdFormat.LEADER;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public boolean isBeta() {
        return false;
    }

    protected boolean isInlineAdaptiveAdView(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner_type");
        if (obj instanceof String) {
            return ADAPTIVE_AD_VIEW_TYPE_INLINE.equalsIgnoreCase((String) obj);
        }
        if (obj == null) {
            return false;
        }
        m5770e("Expected parameter \"adaptive_banner_type\" to be of type String, received: " + obj.getClass());
        return false;
    }

    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        m5769d("This adapter (" + getAdapterVersion() + ") does not support app open ads.");
        maxAppOpenAdapterListener.onAppOpenAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        m5769d("This adapter (" + getAdapterVersion() + ") does not support native ads.");
        maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    protected void log(String str) {
        if (C1768p.m5160a()) {
            this.mLogger.m5175d(this.mTag, str);
        }
    }

    protected void log(String str, Throwable th) {
        if (C1768p.m5160a()) {
            this.mLogger.m5172a(this.mTag, str, th);
        }
    }

    protected boolean shouldAlwaysRewardUser() {
        return this.alwaysRewardUser;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldCollectSignalsOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldDestroyOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldInitializeOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldLoadAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldShowAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return null;
    }

    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        m5769d("This adapter (" + getAdapterVersion() + ") does not support app open ads.");
        maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        m5769d("This adapter (" + getAdapterVersion() + ") does not support interstitial ad view ads.");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        m5769d("This adapter (" + getAdapterVersion() + ") does not support rewarded ad view ads.");
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    protected void userError(String str) {
        userError(str, null);
    }

    protected void userError(String str, Throwable th) {
        C1768p.m5164c(this.mTag, str, th);
    }

    /* JADX INFO: renamed from: w */
    protected void m5773w(String str) {
        if (C1768p.m5160a()) {
            this.mLogger.m5178k(this.mTag, str);
        }
    }
}
