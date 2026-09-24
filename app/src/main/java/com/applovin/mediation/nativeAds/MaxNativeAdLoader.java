package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.AbstractC1644a;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.sdk.C1748l;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MaxNativeAdLoader {

    /* JADX INFO: renamed from: a */
    private final MaxNativeAdLoaderImpl f4151a;

    public MaxNativeAdLoader(String str) {
        this(str, C1748l.m4756p());
    }

    @Deprecated
    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        AbstractC1644a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f4151a = new MaxNativeAdLoaderImpl(str, appLovinSdk.m5807a());
    }

    /* JADX INFO: renamed from: a */
    public void m5788a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f4151a.logApiCall("a()");
        this.f4151a.registerClickableViews(list, viewGroup, maxAd);
    }

    /* JADX INFO: renamed from: b */
    public void m5789b(MaxAd maxAd) {
        this.f4151a.logApiCall("b()");
        this.f4151a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.f4151a.logApiCall("destroy()");
        this.f4151a.destroy();
    }

    public void destroy(MaxAd maxAd) {
        this.f4151a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f4151a.destroy(maxAd);
    }

    public String getAdUnitId() {
        return this.f4151a.getAdUnitId();
    }

    public String getPlacement() {
        this.f4151a.logApiCall("getPlacement()");
        return this.f4151a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f4151a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f4151a.loadAd(maxNativeAdView);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.f4151a.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f4151a.render(maxNativeAdView, maxAd);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f4151a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f4151a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.f4151a.logApiCall("setCustomData(value=" + str + ")");
        this.f4151a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f4151a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f4151a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f4151a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f4151a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f4151a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f4151a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.f4151a.logApiCall("setPlacement(placement=" + str + ")");
        this.f4151a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f4151a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f4151a.setRevenueListener(maxAdRevenueListener);
    }
}
