package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.mediation.ads.AbstractC1644a;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxRewardedAdImpl;
import com.applovin.impl.sdk.C1748l;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.InterfaceC1635a {

    /* JADX INFO: renamed from: b */
    private static final Map f4133b = new HashMap();

    /* JADX INFO: renamed from: c */
    private static final Object f4134c = new Object();

    /* JADX INFO: renamed from: d */
    private static WeakReference f4135d = new WeakReference(null);

    /* JADX INFO: renamed from: a */
    private final MaxRewardedAdImpl f4136a;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk, Context context) {
        this.f4136a = new MaxRewardedAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.m5807a(), context);
    }

    public static MaxRewardedAd getInstance(String str) {
        return getInstance(str, C1748l.m4756p());
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, Context context) {
        return getInstance(str, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Context context) {
        AbstractC1644a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context instanceof Activity) {
            f4135d = new WeakReference((Activity) context);
        }
        synchronized (f4134c) {
            Map map = f4133b;
            MaxRewardedAd maxRewardedAd = (MaxRewardedAd) map.get(str);
            if (maxRewardedAd != null) {
                return maxRewardedAd;
            }
            MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk, context);
            map.put(str, maxRewardedAd2);
            return maxRewardedAd2;
        }
    }

    public void destroy() {
        this.f4136a.logApiCall("destroy()");
        synchronized (f4134c) {
            f4133b.remove(this.f4136a.getAdUnitId());
        }
        this.f4136a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.InterfaceC1635a
    public Activity getActivity() {
        this.f4136a.logApiCall("getActivity()");
        return (Activity) f4135d.get();
    }

    public String getAdUnitId() {
        return this.f4136a.getAdUnitId();
    }

    public boolean isLoading() {
        boolean zIsLoading = this.f4136a.isLoading();
        this.f4136a.logApiCall("isLoading() " + zIsLoading + " for ad unit id " + this.f4136a.getAdUnitId());
        return zIsLoading;
    }

    public boolean isReady() {
        boolean zIsReady = this.f4136a.isReady();
        this.f4136a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f4136a.getAdUnitId());
        return zIsReady;
    }

    public boolean isShowing() {
        boolean zIsShowing = this.f4136a.isShowing();
        this.f4136a.logApiCall("isShowing() " + zIsShowing + " for ad unit id " + this.f4136a.getAdUnitId());
        return zIsShowing;
    }

    public void loadAd() {
        this.f4136a.logApiCall("loadAd()");
        this.f4136a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f4136a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f4136a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f4136a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f4136a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f4136a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f4136a.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f4136a.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f4136a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f4136a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f4136a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f4136a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f4136a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f4136a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f4136a.setRevenueListener(maxAdRevenueListener);
    }

    @Deprecated
    public void showAd() {
        showAd((String) null);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, Lifecycle lifecycle) {
        showAd((String) null, viewGroup, lifecycle);
    }

    public void showAd(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        showAd((String) null, viewGroup, lifecycle, activity);
    }

    @Deprecated
    public void showAd(String str) {
        showAd(str, (String) null);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, Lifecycle lifecycle) {
        showAd(str, (String) null, viewGroup, lifecycle);
    }

    public void showAd(String str, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        showAd(str, null, viewGroup, lifecycle, activity);
    }

    @Deprecated
    public void showAd(String str, String str2) {
        this.f4136a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        AbstractC1701q7.m4081b(str2, "MaxRewardedAd");
        this.f4136a.showAd(str, str2, getActivity());
    }

    public void showAd(String str, String str2, Activity activity) {
        this.f4136a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", activity=" + activity + ")");
        AbstractC1701q7.m4081b(str2, "MaxRewardedAd");
        this.f4136a.showAd(str, str2, activity);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle) {
        this.f4136a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + lifecycle + ")");
        this.f4136a.showAd(str, str2, viewGroup, lifecycle, getActivity());
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        this.f4136a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + lifecycle + ", activity=" + activity + ")");
        this.f4136a.showAd(str, str2, viewGroup, lifecycle, activity);
    }

    public String toString() {
        return "" + this.f4136a;
    }
}
