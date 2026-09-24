package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.mediation.ads.AbstractC1644a;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.C1748l;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.InterfaceC1635a {

    /* JADX INFO: renamed from: b */
    private static WeakReference f4131b = new WeakReference(null);

    /* JADX INFO: renamed from: a */
    private final MaxFullscreenAdImpl f4132a;

    public MaxInterstitialAd(String str) {
        this(str, C1748l.m4756p());
    }

    @Deprecated
    public MaxInterstitialAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Context context) {
        AbstractC1644a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
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
            f4131b = new WeakReference((Activity) context);
        }
        this.f4132a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.m5807a(), context);
    }

    public void destroy() {
        this.f4132a.logApiCall("destroy()");
        this.f4132a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.InterfaceC1635a
    public Activity getActivity() {
        this.f4132a.logApiCall("getActivity()");
        return (Activity) f4131b.get();
    }

    public String getAdUnitId() {
        return this.f4132a.getAdUnitId();
    }

    public boolean isLoading() {
        boolean zIsLoading = this.f4132a.isLoading();
        this.f4132a.logApiCall("isLoading() " + zIsLoading + " for ad unit id " + this.f4132a.getAdUnitId());
        return zIsLoading;
    }

    public boolean isReady() {
        boolean zIsReady = this.f4132a.isReady();
        this.f4132a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f4132a.getAdUnitId());
        return zIsReady;
    }

    public boolean isShowing() {
        boolean zIsShowing = this.f4132a.isShowing();
        this.f4132a.logApiCall("isShowing() " + zIsShowing + " for ad unit id " + this.f4132a.getAdUnitId());
        return zIsShowing;
    }

    public void loadAd() {
        this.f4132a.logApiCall("loadAd()");
        this.f4132a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f4132a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f4132a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f4132a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f4132a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f4132a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f4132a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f4132a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f4132a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f4132a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f4132a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f4132a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f4132a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f4132a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f4132a.setRevenueListener(maxAdRevenueListener);
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
        this.f4132a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        AbstractC1701q7.m4081b(str2, "MaxInterstitialAd");
        this.f4132a.showAd(str, str2, getActivity());
    }

    public void showAd(String str, String str2, Activity activity) {
        this.f4132a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", activity=" + activity + ")");
        AbstractC1701q7.m4081b(str2, "MaxInterstitialAd");
        this.f4132a.showAd(str, str2, activity);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle) {
        this.f4132a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + lifecycle + ")");
        this.f4132a.showAd(str, str2, viewGroup, lifecycle, getActivity());
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        this.f4132a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + lifecycle + ", activity=" + activity + ")");
        this.f4132a.showAd(str, str2, viewGroup, lifecycle, activity);
    }

    public String toString() {
        return "" + this.f4132a;
    }
}
