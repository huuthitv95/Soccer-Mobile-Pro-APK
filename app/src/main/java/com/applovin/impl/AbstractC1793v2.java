package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C11495If;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.v2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1793v2 {

    /* JADX INFO: renamed from: a */
    private static boolean f3459a = true;

    /* JADX INFO: renamed from: b */
    private static boolean f3460b = true;

    /* JADX INFO: renamed from: a */
    private static AppLovinAd m5364a(AppLovinAd appLovinAd) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        return appLovinAdImpl.getDummyAd() != null ? appLovinAdImpl.getDummyAd() : appLovinAd;
    }

    /* JADX INFO: renamed from: a */
    public static void m5365a(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5442d(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5366a(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView, final AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5411b(appLovinAdViewEventListener, appLovinAd, appLovinAdView, appLovinAdViewDisplayErrorCode);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5367a(AppLovinNativeAdEventListener appLovinNativeAdEventListener, AppLovinNativeAd appLovinNativeAd) {
        try {
            appLovinNativeAdEventListener.onNativeAdClicked(appLovinNativeAd);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad click", th);
            m5439c("nativeAdClicked", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5368a(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, AppLovinError appLovinError) {
        try {
            appLovinNativeAdLoadListener.onNativeAdLoadFailed(appLovinError);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad failing to load", th);
            m5439c("nativeAdLoadFailed", th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5369a(final MaxAdExpirationListener maxAdExpirationListener, final MaxAd maxAd, final MaxAd maxAd2, final boolean z) {
        if (maxAd == null || maxAd2 == null || maxAdExpirationListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5400a(z, maxAdExpirationListener, maxAd, maxAd2);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5370a(MaxAdListener maxAdListener, MaxAd maxAd) {
        m5375a(maxAdListener, maxAd, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m5371a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        m5372a(maxAdListener, maxAd, maxError, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m5372a(final MaxAdListener maxAdListener, final MaxAd maxAd, final MaxError maxError, final boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5402a(z, maxAdListener, maxAd, maxError);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5373a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        m5374a(maxAdListener, maxAd, maxReward, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m5374a(final MaxAdListener maxAdListener, final MaxAd maxAd, final MaxReward maxReward, final boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5403a(z, maxAdListener, maxAd, maxReward);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5375a(final MaxAdListener maxAdListener, final MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5401a(z, maxAdListener, maxAd);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5376a(MaxAdListener maxAdListener, String str, MaxError maxError) {
        m5377a(maxAdListener, str, maxError, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m5377a(final MaxAdListener maxAdListener, final String str, final MaxError maxError, final boolean z) {
        if (str == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5404a(z, maxAdListener, str, maxError);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5378a(MaxAdRequestListener maxAdRequestListener, String str) {
        m5379a(maxAdRequestListener, str, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m5379a(final MaxAdRequestListener maxAdRequestListener, final String str, final boolean z) {
        if (str == null || maxAdRequestListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5405a(z, maxAdRequestListener, str);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5380a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        m5381a(maxAdRevenueListener, maxAd, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m5381a(final MaxAdRevenueListener maxAdRevenueListener, final MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxAdRevenueListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5406a(z, maxAdRevenueListener, maxAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5382a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        try {
            maxAdReviewListener.onCreativeIdGenerated(str, maxAd);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify Ad Review creative id generated", th);
            m5439c("adReviewCreativeIdGenerated", th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5383a(final MaxAdReviewListener maxAdReviewListener, final String str, final MaxAd maxAd, boolean z) {
        if (maxAdReviewListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1793v2.m5382a(maxAdReviewListener, str, maxAd);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5384a(final MaxNativeAdListener maxNativeAdListener, final MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5407a(z, maxNativeAdListener, maxAd);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5385a(final MaxNativeAdListener maxNativeAdListener, final MaxNativeAdView maxNativeAdView, final MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5408a(z, maxNativeAdListener, maxNativeAdView, maxAd);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5386a(final MaxNativeAdListener maxNativeAdListener, final String str, final MaxError maxError, final boolean z) {
        if (str == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5409a(z, maxNativeAdListener, str, maxError);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5387a(final AppLovinAdClickListener appLovinAdClickListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdClickListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5418b(appLovinAdClickListener, appLovinAd);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5388a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5436c(appLovinAdDisplayListener, appLovinAd);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5389a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final String str) {
        if (appLovinAdDisplayListener instanceof InterfaceC1659n2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1793v2.m5420b(appLovinAdDisplayListener, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5390a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final int i) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5421b(appLovinAdRewardListener, appLovinAd, i);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5391a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5446d(appLovinAdRewardListener, appLovinAd, map);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5392a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5423b(appLovinAdVideoPlaybackListener, appLovinAd);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5393a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd, final double d, final boolean z) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5424b(appLovinAdVideoPlaybackListener, appLovinAd, d, z);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5394a(final AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, final String str) {
        if (appLovinBidTokenCollectionListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1793v2.m5438c(appLovinBidTokenCollectionListener, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5395a(final AppLovinPostbackListener appLovinPostbackListener, final String str) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda27
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1793v2.m5426b(appLovinPostbackListener, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5396a(final AppLovinPostbackListener appLovinPostbackListener, final String str, final int i) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1793v2.m5427b(appLovinPostbackListener, str, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5397a(String str, Throwable th) {
        C1768p.m5162b("ListenerCallbackInvoker", "Error in internal callback '" + str + "'", th);
    }

    /* JADX INFO: renamed from: a */
    private static void m5398a(String str, Throwable th, boolean z) {
        if (z) {
            m5428b(str, th);
        } else {
            m5397a(str, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5399a(boolean z) {
        f3460b = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5400a(boolean z, MaxAdExpirationListener maxAdExpirationListener, MaxAd maxAd, MaxAd maxAd2) {
        if (!m5441c(z)) {
            maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
            return;
        }
        try {
            maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
        } catch (Throwable th) {
            m5398a("onExpiredAdReloaded", th, z);
            m5429b("maxExpiredAdReloaded", th, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5401a(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (!m5441c(z)) {
            maxAdListener.onAdClicked(maxAd);
            return;
        }
        try {
            maxAdListener.onAdClicked(maxAd);
        } catch (Throwable th) {
            m5398a(C11495If.f24687f, th, z);
            m5429b("maxAdClicked", th, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5402a(boolean z, MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        if (!m5441c(z)) {
            maxAdListener.onAdDisplayFailed(maxAd, maxError);
            return;
        }
        try {
            maxAdListener.onAdDisplayFailed(maxAd, maxError);
        } catch (Throwable th) {
            m5398a("onAdDisplayFailed", th, z);
            m5429b("maxAdDisplayFailed", th, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5403a(boolean z, MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        if (!m5441c(z)) {
            ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
            return;
        }
        try {
            ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
        } catch (Throwable th) {
            m5398a("onUserRewarded", th, z);
            m5429b("maxRewardedUser", th, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5404a(boolean z, MaxAdListener maxAdListener, String str, MaxError maxError) {
        if (!m5441c(z)) {
            maxAdListener.onAdLoadFailed(str, maxError);
            return;
        }
        try {
            maxAdListener.onAdLoadFailed(str, maxError);
        } catch (Throwable th) {
            m5398a(C11495If.f24683b, th, z);
            m5429b("maxAdLoadFailed", th, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5405a(boolean z, MaxAdRequestListener maxAdRequestListener, String str) {
        if (!m5441c(z)) {
            maxAdRequestListener.onAdRequestStarted(str);
            return;
        }
        try {
            maxAdRequestListener.onAdRequestStarted(str);
        } catch (Throwable th) {
            m5398a("onAdRequestStarted", th, z);
            m5429b("maxAdRequestStarted", th, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5406a(boolean z, MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        if (!m5441c(z)) {
            maxAdRevenueListener.onAdRevenuePaid(maxAd);
            return;
        }
        try {
            maxAdRevenueListener.onAdRevenuePaid(maxAd);
        } catch (Throwable th) {
            m5398a("onAdRevenuePaid", th, z);
            m5429b("maxAdPaidRevenue", th, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5407a(boolean z, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        if (!m5441c(z)) {
            maxNativeAdListener.onNativeAdClicked(maxAd);
            return;
        }
        try {
            maxNativeAdListener.onNativeAdClicked(maxAd);
        } catch (Throwable th) {
            m5398a("onNativeAdClicked", th, z);
            m5429b("maxNativeAdClicked", th, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5408a(boolean z, MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!m5441c(z)) {
            maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
            return;
        }
        try {
            maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
        } catch (Throwable th) {
            m5398a("onNativeAdLoaded", th, z);
            m5429b("maxNativeAdLoaded", th, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5409a(boolean z, MaxNativeAdListener maxNativeAdListener, String str, MaxError maxError) {
        if (!m5441c(z)) {
            maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
            return;
        }
        try {
            maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
        } catch (Throwable th) {
            m5398a("onNativeAdLoadFailed", th, z);
            m5429b("maxNativeAdLoadFailed", th, z);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5410b(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5449e(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5411b(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        try {
            appLovinAdViewEventListener.adFailedToDisplay(m5364a(appLovinAd), appLovinAdView, appLovinAdViewDisplayErrorCode);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify ad event listener about display failed event", th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5412b(final AppLovinNativeAdEventListener appLovinNativeAdEventListener, final AppLovinNativeAd appLovinNativeAd) {
        if (appLovinNativeAdEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda25
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1793v2.m5367a(appLovinNativeAdEventListener, appLovinNativeAd);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5413b(final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, final AppLovinError appLovinError) {
        if (appLovinNativeAdLoadListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1793v2.m5368a(appLovinNativeAdLoadListener, appLovinError);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5414b(MaxAdListener maxAdListener, MaxAd maxAd) {
        m5415b(maxAdListener, maxAd, false);
    }

    /* JADX INFO: renamed from: b */
    public static void m5415b(final MaxAdListener maxAdListener, final MaxAd maxAd, final boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5431b(z, maxAdListener, maxAd);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m5416b(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        m5383a(maxAdReviewListener, str, maxAd, false);
    }

    /* JADX INFO: renamed from: b */
    public static void m5417b(final MaxNativeAdListener maxNativeAdListener, final MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5432b(z, maxNativeAdListener, maxAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5418b(AppLovinAdClickListener appLovinAdClickListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdClickListener.adClicked(m5364a(appLovinAd));
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
            m5439c("adClicked", th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5419b(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5445d(appLovinAdDisplayListener, appLovinAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5420b(AppLovinAdDisplayListener appLovinAdDisplayListener, String str) {
        ((InterfaceC1659n2) appLovinAdDisplayListener).onAdDisplayFailed(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5421b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, int i) {
        try {
            appLovinAdRewardListener.validationRequestFailed(m5364a(appLovinAd), i);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request failing", th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5422b(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5452e(appLovinAdRewardListener, appLovinAd, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5423b(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackBegan(m5364a(appLovinAd));
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback began", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5424b(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd, double d, boolean z) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackEnded(m5364a(appLovinAd), d, z);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback ended", th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5425b(final AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, final String str) {
        if (appLovinBidTokenCollectionListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1793v2.m5447d(appLovinBidTokenCollectionListener, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5426b(AppLovinPostbackListener appLovinPostbackListener, String str) {
        try {
            appLovinPostbackListener.onPostbackSuccess(str);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") executed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5427b(AppLovinPostbackListener appLovinPostbackListener, String str, int i) {
        try {
            appLovinPostbackListener.onPostbackFailure(str, i);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") failing to execute with error code (" + i + "):", th);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m5428b(String str, Throwable th) {
        C1768p.m5164c("ListenerCallbackInvoker", "Error in publisher callback '" + str + "'", th);
    }

    /* JADX INFO: renamed from: b */
    private static void m5429b(String str, Throwable th, boolean z) {
        if (C1748l.f3003E0 != null) {
            C1748l.f3003E0.m4764E().m4332a("ListenerCallbackInvoker", str, th, CollectionUtils.hashMap("details", "isPublisherCallback=" + z));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5430b(boolean z) {
        f3459a = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5431b(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (!m5441c(z)) {
            ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
            return;
        }
        try {
            ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
        } catch (Throwable th) {
            m5398a("onAdCollapsed", th, z);
            m5429b("maxAdCollapsed", th, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5432b(boolean z, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        if (!m5441c(z)) {
            maxNativeAdListener.onNativeAdExpired(maxAd);
            return;
        }
        try {
            maxNativeAdListener.onNativeAdExpired(maxAd);
        } catch (Throwable th) {
            m5398a("onNativeAdExpired", th, z);
            m5429b("maxNativeAdExpired", th, z);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m5433c(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5454f(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m5434c(MaxAdListener maxAdListener, MaxAd maxAd) {
        m5435c(maxAdListener, maxAd, false);
    }

    /* JADX INFO: renamed from: c */
    public static void m5435c(final MaxAdListener maxAdListener, final MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5440c(z, maxAdListener, maxAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5436c(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adDisplayed(m5364a(appLovinAd));
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
            m5439c("adDisplayed", th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m5437c(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5457f(appLovinAdRewardListener, appLovinAd, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5438c(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollected(str);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify bid token listener about successful bid token collection", th);
            m5439c("onBidTokenCollected", th);
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m5439c(String str, Throwable th) {
        C1748l c1748l = C1748l.f3003E0;
        if (c1748l != null) {
            c1748l.m4764E().m4329a("ListenerCallbackInvoker", str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5440c(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (!m5441c(z)) {
            maxAdListener.onAdDisplayed(maxAd);
            return;
        }
        try {
            maxAdListener.onAdDisplayed(maxAd);
        } catch (Throwable th) {
            m5398a("onAdDisplayed", th, z);
            m5429b("maxAdDisplayed", th, z);
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m5441c(boolean z) {
        return z ? f3459a : f3460b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m5442d(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adClosedFullscreen(m5364a(appLovinAd), appLovinAdView);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen closed event", th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m5443d(MaxAdListener maxAdListener, MaxAd maxAd) {
        m5444d(maxAdListener, maxAd, false);
    }

    /* JADX INFO: renamed from: d */
    public static void m5444d(final MaxAdListener maxAdListener, final MaxAd maxAd, final boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5448d(z, maxAdListener, maxAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m5445d(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adHidden(m5364a(appLovinAd));
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
            m5439c("adHidden", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m5446d(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userRewardRejected(m5364a(appLovinAd), map);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request being rejected", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m5447d(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollectionFailed(str);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify bid token listener about bid token collection failure", th);
            m5439c("onBidTokenCollectionFailed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m5448d(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (!m5441c(z)) {
            ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
            return;
        }
        try {
            ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
        } catch (Throwable th) {
            m5398a("onAdExpanded", th, z);
            m5429b("maxAdExpanded", th, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m5449e(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adLeftApplication(m5364a(appLovinAd), appLovinAdView);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify ad event listener about application leave event", th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m5450e(MaxAdListener maxAdListener, MaxAd maxAd) {
        m5451e(maxAdListener, maxAd, false);
    }

    /* JADX INFO: renamed from: e */
    public static void m5451e(final MaxAdListener maxAdListener, final MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5453e(z, maxAdListener, maxAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m5452e(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userOverQuota(m5364a(appLovinAd), map);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify ad reward listener about exceeding quota", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m5453e(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (!m5441c(z)) {
            maxAdListener.onAdHidden(maxAd);
            return;
        }
        try {
            maxAdListener.onAdHidden(maxAd);
        } catch (Throwable th) {
            m5398a("onAdHidden", th, z);
            m5429b("maxAdHidden", th, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m5454f(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adOpenedFullscreen(m5364a(appLovinAd), appLovinAdView);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen opened event", th);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m5455f(MaxAdListener maxAdListener, MaxAd maxAd) {
        m5456f(maxAdListener, maxAd, false);
    }

    /* JADX INFO: renamed from: f */
    public static void m5456f(final MaxAdListener maxAdListener, final MaxAd maxAd, final boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.v2$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1793v2.m5458f(z, maxAdListener, maxAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m5457f(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userRewardVerified(m5364a(appLovinAd), map);
        } catch (Throwable th) {
            C1768p.m5164c("ListenerCallbackInvoker", "Unable to notify ad reward listener about successful reward validation request", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m5458f(boolean z, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (!m5441c(z)) {
            maxAdListener.onAdLoaded(maxAd);
            return;
        }
        try {
            maxAdListener.onAdLoaded(maxAd);
        } catch (Throwable th) {
            m5398a(C11495If.f24691j, th, z);
            m5429b("maxAdLoaded", th, z);
        }
    }
}
