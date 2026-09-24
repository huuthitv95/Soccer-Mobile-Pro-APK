package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C11540L6;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class IronSource {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.IronSource$a */
    public enum EnumC12328a {
        REWARDED_VIDEO(C11540L6.f24915G0),
        INTERSTITIAL("interstitial"),
        BANNER("banner"),
        NATIVE_AD("nativeAd");


        /* JADX INFO: renamed from: a */
        private String f30985a;

        EnumC12328a(String str) {
            this.f30985a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f30985a;
        }
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        return C12367p.m32628h().mo26640a(activity, iSBannerSize);
    }

    public static void destroyISDemandOnlyBanner(String str) {
        C12367p.m32628h().mo26642e(str);
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        return C12367p.m32628h().mo26639a(context);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return C12367p.m32628h().mo26647d(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return C12367p.m32628h().mo26652h(str);
    }

    public static void loadISDemandOnlyBanner(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        C12367p.m32628h().mo26641a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        C12367p.m32628h().mo26643a(activity, str);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        C12367p.m32628h().mo26651b(activity, str);
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        C12367p.m32628h().m32653a(str, jSONObject);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        C12367p.m32628h().mo26644a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        C12367p.m32628h().mo26649a(iSDemandOnlyRewardedVideoListener);
    }

    public static void setMediationType(String str) {
        C12367p.m32628h().mo27299f(str);
    }

    public static void showISDemandOnlyInterstitial(String str) {
        C12367p.m32628h().mo26646c(str);
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        C12367p.m32628h().mo26650a(str);
    }
}
