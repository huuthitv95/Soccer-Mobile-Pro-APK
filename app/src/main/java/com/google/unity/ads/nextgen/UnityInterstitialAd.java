package com.google.unity.ads.nextgen;

import android.app.Activity;
import android.util.Log;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAdEventCallback;
import com.google.unity.ads.PluginUtils;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class UnityInterstitialAd extends UnityAdBase<InterstitialAd, UnityInterstitialAdCallback> {
    private final AdWrapper<InterstitialAd> adWrapper;

    public UnityInterstitialAd(Activity activity, UnityInterstitialAdCallback callback) {
        this(activity, callback, AdWrapper.forInterstitial(), Executors.newSingleThreadExecutor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnityInterstitialAd(Activity activity, UnityInterstitialAdCallback callback, InterstitialAd interstitialAd) {
        this(activity, callback, AdWrapper.forInterstitial(), Executors.newSingleThreadExecutor());
        this.f22624ad = interstitialAd;
    }

    UnityInterstitialAd(Activity activity, UnityInterstitialAdCallback callback, AdWrapper<InterstitialAd> adWrapper, Executor executor) {
        super(activity, callback, executor);
        this.adWrapper = adWrapper;
    }

    InterstitialAd getInterstitialAd() {
        return (InterstitialAd) this.f22624ad;
    }

    public void load(final AdRequest request) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m44310lambda$load$0$comgoogleunityadsnextgenUnityInterstitialAd(request);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$load$0$com-google-unity-ads-nextgen-UnityInterstitialAd, reason: not valid java name */
    /* synthetic */ void m44310lambda$load$0$comgoogleunityadsnextgenUnityInterstitialAd(AdRequest adRequest) {
        this.adWrapper.load(adRequest, new C108741(this));
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityInterstitialAd$1 */
    class C108741 implements AdLoadCallback<InterstitialAd> {
        final /* synthetic */ UnityInterstitialAd this$0;

        C108741(final UnityInterstitialAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onAdLoaded(InterstitialAd ad) {
            this.this$0.f22624ad = ad;
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23142x9ff95d78();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdLoaded$0$com-google-unity-ads-nextgen-UnityInterstitialAd$1 */
        /* synthetic */ void m23142x9ff95d78() {
            if (this.this$0.callback != 0) {
                ((UnityInterstitialAdCallback) this.this$0.callback).onInterstitialAdLoaded();
            }
        }

        public void onAdFailedToLoad(final LoadAdError adError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23141x1d273dbf(adError);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-nextgen-UnityInterstitialAd$1 */
        /* synthetic */ void m23141x1d273dbf(LoadAdError loadAdError) {
            if (this.this$0.callback != 0) {
                ((UnityInterstitialAdCallback) this.this$0.callback).onInterstitialAdFailedToLoad(loadAdError);
            }
        }
    }

    public void show() {
        if (this.f22624ad == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to show intertitial ad before it was ready. Please call loadAd first and wait for a successful onAdLoaded callback.");
        } else {
            ((InterstitialAd) this.f22624ad).setAdEventCallback(new C108752(this));
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44311lambda$show$0$comgoogleunityadsnextgenUnityInterstitialAd();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityInterstitialAd$2 */
    class C108752 implements InterstitialAdEventCallback {
        final /* synthetic */ UnityInterstitialAd this$0;

        C108752(final UnityInterstitialAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onAdShowedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23148xedee5da();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdShowedFullScreenContent$0$com-google-unity-ads-nextgen-UnityInterstitialAd$2 */
        /* synthetic */ void m23148xedee5da() {
            if (this.this$0.callback != 0) {
                ((UnityInterstitialAdCallback) this.this$0.callback).onAdShowedFullScreenContent();
            }
        }

        public void onAdDismissedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23144xbab90e89();
                }
            });
            this.this$0.f22624ad = null;
        }

        /* JADX INFO: renamed from: lambda$onAdDismissedFullScreenContent$0$com-google-unity-ads-nextgen-UnityInterstitialAd$2 */
        /* synthetic */ void m23144xbab90e89() {
            if (this.this$0.callback != 0) {
                ((UnityInterstitialAdCallback) this.this$0.callback).onAdDismissedFullScreenContent();
            }
        }

        public void onAdFailedToShowFullScreenContent(final FullScreenContentError fullScreenContentError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23145xc2cb9633(fullScreenContentError);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-nextgen-UnityInterstitialAd$2 */
        /* synthetic */ void m23145xc2cb9633(FullScreenContentError fullScreenContentError) {
            if (this.this$0.callback != 0) {
                ((UnityInterstitialAdCallback) this.this$0.callback).onAdFailedToShowFullScreenContent(fullScreenContentError);
            }
        }

        public void onAdImpression() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23146x66dc9d75();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdImpression$0$com-google-unity-ads-nextgen-UnityInterstitialAd$2 */
        /* synthetic */ void m23146x66dc9d75() {
            if (this.this$0.callback != 0) {
                ((UnityInterstitialAdCallback) this.this$0.callback).onAdImpression();
            }
        }

        public void onAdClicked() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23143x667c9bf5();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdClicked$0$com-google-unity-ads-nextgen-UnityInterstitialAd$2 */
        /* synthetic */ void m23143x667c9bf5() {
            if (this.this$0.callback != 0) {
                ((UnityInterstitialAdCallback) this.this$0.callback).onAdClicked();
            }
        }

        public void onAdPaid(final AdValue adValue) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAd$2$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23147x49233d52(adValue);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdPaid$0$com-google-unity-ads-nextgen-UnityInterstitialAd$2 */
        /* synthetic */ void m23147x49233d52(AdValue adValue) {
            if (this.this$0.callback != 0) {
                ((UnityInterstitialAdCallback) this.this$0.callback).onPaidEvent(Util.getAdValuePrecisionType(adValue.getPrecisionType()), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* JADX INFO: renamed from: lambda$show$0$com-google-unity-ads-nextgen-UnityInterstitialAd, reason: not valid java name */
    /* synthetic */ void m44311lambda$show$0$comgoogleunityadsnextgenUnityInterstitialAd() {
        ((InterstitialAd) this.f22624ad).setImmersiveMode(true);
        ((InterstitialAd) this.f22624ad).show(this.activity);
    }

    public long getPlacementId() {
        if (this.f22624ad == 0) {
            return 0L;
        }
        return ((InterstitialAd) this.f22624ad).getPlacementId();
    }

    public void setPlacementId(long placementId) {
        if (this.f22624ad == 0) {
            return;
        }
        ((InterstitialAd) this.f22624ad).setPlacementId(placementId);
    }

    public ResponseInfo getResponseInfo() {
        if (this.f22624ad == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return ((InterstitialAd) this.f22624ad).getResponseInfo();
    }
}
