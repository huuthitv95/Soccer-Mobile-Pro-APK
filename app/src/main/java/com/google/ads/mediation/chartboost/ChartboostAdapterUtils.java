package com.google.ads.mediation.chartboost;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.privacy.model.COPPA;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
class ChartboostAdapterUtils {
    static final String KEY_AD_LOCATION = "adLocation";
    static final String KEY_APP_ID = "appId";
    static final String KEY_APP_SIGNATURE = "appSignature";
    static final String LOCATION_DEFAULT = "default";
    private static Mediation chartboostMediation;

    ChartboostAdapterUtils() {
    }

    static ChartboostParams createChartboostParams(Bundle bundle) {
        ChartboostParams chartboostParams = new ChartboostParams();
        String string = bundle.getString("appId");
        String string2 = bundle.getString(KEY_APP_SIGNATURE);
        if (string != null && string2 != null) {
            chartboostParams.setAppId(string.trim());
            chartboostParams.setAppSignature(string2.trim());
        }
        String string3 = bundle.getString(KEY_AD_LOCATION);
        if (TextUtils.isEmpty(string3)) {
            Log.w(ChartboostMediationAdapter.TAG, String.format("Chartboost ad location is empty, defaulting to %s. Please set the Ad Location parameter in the AdMob UI.", "default"));
            string3 = "default";
        }
        chartboostParams.setLocation(string3.trim());
        return chartboostParams;
    }

    static Banner.BannerSize findClosestBannerSize(Context context, AdSize adSize) {
        AdSize adSize2 = new AdSize(Banner.BannerSize.STANDARD.getWidth(), Banner.BannerSize.STANDARD.getHeight());
        AdSize adSize3 = new AdSize(Banner.BannerSize.MEDIUM.getWidth(), Banner.BannerSize.MEDIUM.getHeight());
        AdSize adSize4 = new AdSize(Banner.BannerSize.LEADERBOARD.getWidth(), Banner.BannerSize.LEADERBOARD.getHeight());
        ArrayList arrayList = new ArrayList();
        arrayList.add(adSize2);
        arrayList.add(adSize3);
        arrayList.add(adSize4);
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize == null) {
            return null;
        }
        if (adSizeFindClosestSize.equals(adSize2)) {
            return Banner.BannerSize.STANDARD;
        }
        if (adSizeFindClosestSize.equals(adSize3)) {
            return Banner.BannerSize.MEDIUM;
        }
        if (adSizeFindClosestSize.equals(adSize4)) {
            return Banner.BannerSize.LEADERBOARD;
        }
        return null;
    }

    static String getAdapterVersion() {
        return BuildConfig.ADAPTER_VERSION;
    }

    static Mediation getChartboostMediation() {
        if (chartboostMediation == null) {
            chartboostMediation = new Mediation("AdMob", Chartboost.getSDKVersion(), BuildConfig.ADAPTER_VERSION);
        }
        return chartboostMediation;
    }

    static boolean isValidChartboostParams(ChartboostParams chartboostParams) {
        if (chartboostParams == null) {
            return false;
        }
        if (!TextUtils.isEmpty(chartboostParams.getAppId()) && !TextUtils.isEmpty(chartboostParams.getAppSignature())) {
            return true;
        }
        Log.e(ChartboostMediationAdapter.TAG, "Missing or invalid App ID or App Signature configured for this ad source instancein the AdMob or Ad Manager UI.");
        return false;
    }

    static void updateCoppaStatus(Context context, RequestConfiguration requestConfiguration) {
        int tagForChildDirectedTreatment = requestConfiguration.getTagForChildDirectedTreatment();
        int tagForUnderAgeOfConsent = requestConfiguration.getTagForUnderAgeOfConsent();
        if (tagForChildDirectedTreatment == 1 || tagForUnderAgeOfConsent == 1) {
            Chartboost.addDataUseConsent(context, new COPPA(true));
        } else if (tagForChildDirectedTreatment == 0 || tagForUnderAgeOfConsent == 0) {
            Chartboost.addDataUseConsent(context, new COPPA(false));
        }
    }
}
