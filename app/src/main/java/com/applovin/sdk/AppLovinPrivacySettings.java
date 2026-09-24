package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.AbstractC1694q0;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinPrivacySettings {
    public static Boolean getAdditionalConsentStatus(int i) {
        C1748l c1748lM4105f = AbstractC1701q7.m4105f();
        if (c1748lM4105f != null) {
            return c1748lM4105f.m4855t0().m2223a(i);
        }
        C1768p.m5167h("AppLovinPrivacySettings", "Unable to retrieve additional consent status");
        return null;
    }

    public static Boolean getPurposeConsentStatus(int i) {
        C1748l c1748lM4105f = AbstractC1701q7.m4105f();
        if (c1748lM4105f != null) {
            return c1748lM4105f.m4855t0().m2224b(i);
        }
        C1768p.m5167h("AppLovinPrivacySettings", "Unable to retrieve purpose consent status");
        return null;
    }

    public static Boolean getSpecialFeatureOptInStatus(int i) {
        C1748l c1748lM4105f = AbstractC1701q7.m4105f();
        if (c1748lM4105f != null) {
            return c1748lM4105f.m4855t0().m2226c(i);
        }
        C1768p.m5167h("AppLovinPrivacySettings", "Unable to retrieve special feature opt in status");
        return null;
    }

    public static Boolean getTcfVendorConsentStatus(int i) {
        C1748l c1748lM4105f = AbstractC1701q7.m4105f();
        if (c1748lM4105f != null) {
            return c1748lM4105f.m4855t0().m2228d(i);
        }
        C1768p.m5167h("AppLovinPrivacySettings", "Unable to retrieve TCF vendor consent status");
        return null;
    }

    public static boolean hasUserConsent() {
        return hasUserConsent(C1748l.m4756p());
    }

    @Deprecated
    public static boolean hasUserConsent(Context context) {
        Boolean boolM3959b = AbstractC1694q0.m3953b().m3959b(context);
        if (boolM3959b != null) {
            return boolM3959b.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSell() {
        return isDoNotSell(C1748l.m4756p());
    }

    @Deprecated
    public static boolean isDoNotSell(Context context) {
        Boolean boolM3959b = AbstractC1694q0.m3948a().m3959b(context);
        if (boolM3959b != null) {
            return boolM3959b.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet() {
        return isDoNotSellSet(C1748l.m4756p());
    }

    @Deprecated
    public static boolean isDoNotSellSet(Context context) {
        return AbstractC1694q0.m3948a().m3959b(context) != null;
    }

    public static boolean isUserConsentSet() {
        return isUserConsentSet(C1748l.m4756p());
    }

    @Deprecated
    public static boolean isUserConsentSet(Context context) {
        return AbstractC1694q0.m3953b().m3959b(context) != null;
    }

    public static void setDoNotSell(boolean z) {
        setDoNotSell(z, C1748l.m4756p());
    }

    @Deprecated
    public static void setDoNotSell(boolean z, Context context) {
        C1768p.m5166g("AppLovinPrivacySettings", "setDoNotSell()");
        if (AbstractC1694q0.m3952a(z, context)) {
            AppLovinSdk.getInstance(context).reinitialize(null, Boolean.valueOf(z));
        }
    }

    public static void setHasUserConsent(boolean z) {
        setHasUserConsent(z, C1748l.m4756p());
    }

    @Deprecated
    public static void setHasUserConsent(boolean z, Context context) {
        C1768p.m5166g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (AbstractC1694q0.m3954b(z, context)) {
            AppLovinSdk.getInstance(context).reinitialize(Boolean.valueOf(z), null);
        }
    }
}
