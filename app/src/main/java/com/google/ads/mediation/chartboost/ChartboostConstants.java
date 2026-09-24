package com.google.ads.mediation.chartboost;

import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.StartError;
import com.google.android.gms.ads.AdError;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class ChartboostConstants {
    static final String CHARTBOOST_SDK_ERROR_DOMAIN = "com.chartboost.sdk";
    static final int ERROR_AD_ALREADY_LOADED = 102;
    static final int ERROR_AD_NOT_READY = 104;
    static final int ERROR_BANNER_SIZE_MISMATCH = 101;
    static final String ERROR_DOMAIN = "com.google.ads.mediation.chartboost";
    static final int ERROR_INVALID_SERVER_PARAMETERS = 103;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    public static AdError createAdapterError(int i, String str) {
        return new AdError(i, str, "com.google.ads.mediation.chartboost");
    }

    static AdError createSDKError(CacheError cacheError) {
        return new AdError(cacheError.getCode().getErrorCode(), cacheError.toString(), CHARTBOOST_SDK_ERROR_DOMAIN);
    }

    static AdError createSDKError(ClickError clickError) {
        return new AdError(clickError.getCode().getErrorCode(), clickError.toString(), CHARTBOOST_SDK_ERROR_DOMAIN);
    }

    static AdError createSDKError(ShowError showError) {
        return new AdError(showError.getCode().getErrorCode(), showError.toString(), CHARTBOOST_SDK_ERROR_DOMAIN);
    }

    static AdError createSDKError(StartError startError) {
        return new AdError(startError.getCode().getErrorCode(), startError.toString(), CHARTBOOST_SDK_ERROR_DOMAIN);
    }
}
