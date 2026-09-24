package com.applovin.mediation.ads;

import android.content.Context;
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

/* JADX INFO: loaded from: classes3.dex */
public class MaxAppOpenAd {

    /* JADX INFO: renamed from: a */
    private final MaxFullscreenAdImpl f4130a;

    public MaxAppOpenAd(String str) {
        this(str, C1748l.m4756p());
    }

    @Deprecated
    public MaxAppOpenAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAppOpenAd(String str, AppLovinSdk appLovinSdk) {
        this(str, appLovinSdk, C1748l.m4756p());
    }

    private MaxAppOpenAd(String str, AppLovinSdk appLovinSdk, Context context) {
        AbstractC1644a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        this.f4130a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.m5807a(), context);
    }

    public void destroy() {
        this.f4130a.logApiCall("destroy()");
        this.f4130a.destroy();
    }

    public String getAdUnitId() {
        return this.f4130a.getAdUnitId();
    }

    public boolean isLoading() {
        boolean zIsLoading = this.f4130a.isLoading();
        this.f4130a.logApiCall("isLoading() " + zIsLoading + " for ad unit id " + this.f4130a.getAdUnitId());
        return zIsLoading;
    }

    public boolean isReady() {
        boolean zIsReady = this.f4130a.isReady();
        this.f4130a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f4130a.getAdUnitId());
        return zIsReady;
    }

    public boolean isShowing() {
        boolean zIsShowing = this.f4130a.isShowing();
        this.f4130a.logApiCall("isShowing() " + zIsShowing + " for ad unit id " + this.f4130a.getAdUnitId());
        return zIsShowing;
    }

    public void loadAd() {
        this.f4130a.logApiCall("loadAd()");
        this.f4130a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f4130a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f4130a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f4130a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f4130a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f4130a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f4130a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f4130a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f4130a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f4130a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f4130a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f4130a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f4130a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f4130a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f4130a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public void showAd(String str) {
        showAd(str, null);
    }

    public void showAd(String str, String str2) {
        this.f4130a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        AbstractC1701q7.m4081b(str2, "MaxAppOpenAd");
        this.f4130a.showAd(str, str2, null);
    }

    public String toString() {
        return "" + this.f4130a;
    }
}
