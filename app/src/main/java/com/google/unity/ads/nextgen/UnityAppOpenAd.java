package com.google.unity.ads.nextgen;

import android.app.Activity;
import android.util.Log;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAd;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.unity.ads.PluginUtils;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class UnityAppOpenAd extends UnityAdBase<AppOpenAd, UnityAppOpenAdCallback> {
    private final AdWrapper<AppOpenAd> adWrapper;
    private AppOpenAd appOpenAd;
    private final AppOpenAdEventCallback appOpenAdEventCallback;

    public UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback callback) {
        this(activity, callback, AdWrapper.forAppOpen(), Executors.newSingleThreadExecutor());
    }

    public UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback callback, AppOpenAd appOpenAd) {
        this(activity, callback, AdWrapper.forAppOpen(), Executors.newSingleThreadExecutor());
        this.appOpenAd = appOpenAd;
    }

    UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback callback, AdWrapper<AppOpenAd> adWrapper, Executor executor) {
        super(activity, callback, executor);
        this.appOpenAdEventCallback = new C108661(this);
        this.adWrapper = adWrapper;
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityAppOpenAd$1 */
    class C108661 implements AppOpenAdEventCallback {
        final /* synthetic */ UnityAppOpenAd this$0;

        C108661(final UnityAppOpenAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onAdShowedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$1$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23132xcc9f0bde();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdShowedFullScreenContent$0$com-google-unity-ads-nextgen-UnityAppOpenAd$1 */
        /* synthetic */ void m23132xcc9f0bde() {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onAdShowedFullScreenContent();
            }
        }

        public void onAdDismissedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$1$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23129xd4bf1cf();
                }
            });
            this.this$0.appOpenAd = null;
        }

        /* JADX INFO: renamed from: lambda$onAdDismissedFullScreenContent$0$com-google-unity-ads-nextgen-UnityAppOpenAd$1 */
        /* synthetic */ void m23129xd4bf1cf() {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onAdDismissedFullScreenContent();
            }
        }

        public void onAdFailedToShowFullScreenContent(final FullScreenContentError fullScreenContentError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23130x7bf9c7e5(fullScreenContentError);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-nextgen-UnityAppOpenAd$1 */
        /* synthetic */ void m23130x7bf9c7e5(FullScreenContentError fullScreenContentError) {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onAdFailedToShowFullScreenContent(fullScreenContentError);
            }
        }

        public void onAdImpression() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23131x97cdbf63();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdImpression$0$com-google-unity-ads-nextgen-UnityAppOpenAd$1 */
        /* synthetic */ void m23131x97cdbf63() {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onAdImpression();
            }
        }

        public void onAdClicked() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23128xfec8b0e3();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdClicked$0$com-google-unity-ads-nextgen-UnityAppOpenAd$1 */
        /* synthetic */ void m23128xfec8b0e3() {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onAdClicked();
            }
        }

        public void onAdPaid(final AdValue adValue) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44296lambda$onAdPaid$0$comgoogleunityadsnextgenUnityAppOpenAd$1(adValue);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdPaid$0$com-google-unity-ads-nextgen-UnityAppOpenAd$1, reason: not valid java name */
        /* synthetic */ void m44296lambda$onAdPaid$0$comgoogleunityadsnextgenUnityAppOpenAd$1(AdValue adValue) {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onPaidEvent(Util.getAdValuePrecisionType(adValue.getPrecisionType()), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    public void load(final AdRequest request) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m44294lambda$load$0$comgoogleunityadsnextgenUnityAppOpenAd(request);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$load$0$com-google-unity-ads-nextgen-UnityAppOpenAd, reason: not valid java name */
    /* synthetic */ void m44294lambda$load$0$comgoogleunityadsnextgenUnityAppOpenAd(AdRequest adRequest) {
        this.adWrapper.load(adRequest, new C108672(this));
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityAppOpenAd$2 */
    class C108672 implements AdLoadCallback<AppOpenAd> {
        final /* synthetic */ UnityAppOpenAd this$0;

        C108672(final UnityAppOpenAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onAdLoaded(AppOpenAd ad) {
            this.this$0.appOpenAd = ad;
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23134xcdf20ce0();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdLoaded$0$com-google-unity-ads-nextgen-UnityAppOpenAd$2 */
        /* synthetic */ void m23134xcdf20ce0() {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onAppOpenAdLoaded();
            }
        }

        public void onAdFailedToLoad(final LoadAdError adError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23133xe40cdc39(adError);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-nextgen-UnityAppOpenAd$2 */
        /* synthetic */ void m23133xe40cdc39(LoadAdError loadAdError) {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onAppOpenAdFailedToLoad(loadAdError);
            }
        }
    }

    AppOpenAd getAppOpenAd() {
        return this.appOpenAd;
    }

    public void show() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show app open ad before it was ready. Please call loadAd first and wait for a successful onAdLoaded callback.");
        } else {
            appOpenAd.setAdEventCallback(this.appOpenAdEventCallback);
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44295lambda$show$0$comgoogleunityadsnextgenUnityAppOpenAd();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$show$0$com-google-unity-ads-nextgen-UnityAppOpenAd, reason: not valid java name */
    /* synthetic */ void m44295lambda$show$0$comgoogleunityadsnextgenUnityAppOpenAd() {
        this.appOpenAd.setImmersiveMode(true);
        this.appOpenAd.show(this.activity);
    }

    public long getPlacementId() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return 0L;
        }
        return appOpenAd.getPlacementId();
    }

    public void setPlacementId(long placementId) {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return;
        }
        appOpenAd.setPlacementId(placementId);
    }

    public ResponseInfo getResponseInfo() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return appOpenAd.getResponseInfo();
    }
}
