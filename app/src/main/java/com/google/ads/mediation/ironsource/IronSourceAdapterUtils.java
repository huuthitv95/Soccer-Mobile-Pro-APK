package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.mediationsdk.ISBannerSize;
import com.unity3d.ironsourceads.AdSize;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceAdapterUtils {
    public static AdError buildAdErrorAdapterDomain(int i, String str) {
        return new AdError(i, str, "com.google.ads.mediation.ironsource");
    }

    public static AdError buildAdErrorIronSourceDomain(int i, String str) {
        return new AdError(i, str, IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
    }

    public static <T> boolean canLoadIronSourceAdInstance(String str, ConcurrentHashMap<String, WeakReference<T>> concurrentHashMap) {
        WeakReference<T> weakReference = concurrentHashMap.get(str);
        return weakReference == null || weakReference.get() == null;
    }

    public static AdSize getAdSizeFromGoogleAdSize(Context context, com.google.android.gms.ads.AdSize adSize) {
        com.google.android.gms.ads.AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, new ArrayList(Arrays.asList(com.google.android.gms.ads.AdSize.BANNER, com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE, com.google.android.gms.ads.AdSize.LARGE_BANNER, com.google.android.gms.ads.AdSize.LEADERBOARD)));
        if (adSizeFindClosestSize != null && !com.google.android.gms.ads.AdSize.BANNER.equals(adSizeFindClosestSize)) {
            if (com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE.equals(adSizeFindClosestSize)) {
                return AdSize.mediumRectangle();
            }
            if (com.google.android.gms.ads.AdSize.LARGE_BANNER.equals(adSizeFindClosestSize)) {
                return AdSize.large();
            }
            return com.google.android.gms.ads.AdSize.LEADERBOARD.equals(adSizeFindClosestSize) ? AdSize.leaderboard() : AdSize.banner();
        }
        return AdSize.banner();
    }

    public static String getAdapterVersion() {
        return BuildConfig.ADAPTER_VERSION;
    }

    public static ISBannerSize getISBannerSizeFromGoogleAdSize(Context context, com.google.android.gms.ads.AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.android.gms.ads.AdSize.BANNER);
        arrayList.add(com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE);
        arrayList.add(com.google.android.gms.ads.AdSize.LARGE_BANNER);
        com.google.android.gms.ads.AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize == null) {
            return null;
        }
        if (com.google.android.gms.ads.AdSize.BANNER.equals(adSizeFindClosestSize)) {
            return ISBannerSize.BANNER;
        }
        if (com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE.equals(adSizeFindClosestSize)) {
            return ISBannerSize.RECTANGLE;
        }
        return com.google.android.gms.ads.AdSize.LARGE_BANNER.equals(adSizeFindClosestSize) ? ISBannerSize.LARGE : new ISBannerSize(adSizeFindClosestSize.getWidth(), adSizeFindClosestSize.getHeight());
    }

    public static String getMediationType() {
        return "AdMob" + prepareVersionToiAdsSdk(getAdapterVersion()) + "SDK" + prepareVersionToiAdsSdk(MobileAds.getVersion().toString()) + "iAds511";
    }

    public static String prepareVersionToiAdsSdk(String str) {
        return str.replace(".", "");
    }

    public static AdError validateIronSourceAdLoadParams(Context context, String str) {
        if (!(context instanceof Activity)) {
            return new AdError(102, "IronSource requires an Activity context to load ads.", "com.google.ads.mediation.ironsource");
        }
        if (TextUtils.isEmpty(str)) {
            return new AdError(101, "Missing or invalid instance ID.", "com.google.ads.mediation.ironsource");
        }
        return null;
    }
}
