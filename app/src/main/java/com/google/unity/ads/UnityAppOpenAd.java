package com.google.unity.ads;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class UnityAppOpenAd {
    private final Activity activity;
    AppOpenAd appOpenAd;
    private final UnityAppOpenAdCallback callback;
    private final OnPaidEventListener onPaidEventListener = new C108271(this);
    private final FullScreenContentCallback fullScreenContentCallback = new C108282(this);

    public void destroy() {
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityAppOpenAd$1 */
    class C108271 implements OnPaidEventListener {
        final /* synthetic */ UnityAppOpenAd this$0;

        C108271(final UnityAppOpenAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44244lambda$onPaidEvent$0$comgoogleunityadsUnityAppOpenAd$1(adValue);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onPaidEvent$0$com-google-unity-ads-UnityAppOpenAd$1, reason: not valid java name */
        /* synthetic */ void m44244lambda$onPaidEvent$0$comgoogleunityadsUnityAppOpenAd$1(AdValue adValue) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityAppOpenAd$2 */
    class C108282 extends FullScreenContentCallback {
        final /* synthetic */ UnityAppOpenAd this$0;

        C108282(final UnityAppOpenAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(final AdError error) {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23087xd8053296(error);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-UnityAppOpenAd$2 */
        /* synthetic */ void m23087xd8053296(AdError adError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdFailedToShowFullScreenContent(adError);
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23088x52267f8f();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdShowedFullScreenContent$0$com-google-unity-ads-UnityAppOpenAd$2 */
        /* synthetic */ void m23088x52267f8f() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdShowedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23086x202ce680();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdDismissedFullScreenContent$0$com-google-unity-ads-UnityAppOpenAd$2 */
        /* synthetic */ void m23086x202ce680() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdDismissedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44246lambda$onAdImpression$0$comgoogleunityadsUnityAppOpenAd$2();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdImpression$0$com-google-unity-ads-UnityAppOpenAd$2, reason: not valid java name */
        /* synthetic */ void m44246lambda$onAdImpression$0$comgoogleunityadsUnityAppOpenAd$2() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdImpression();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44245lambda$onAdClicked$0$comgoogleunityadsUnityAppOpenAd$2();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdClicked$0$com-google-unity-ads-UnityAppOpenAd$2, reason: not valid java name */
        /* synthetic */ void m44245lambda$onAdClicked$0$comgoogleunityadsUnityAppOpenAd$2() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdClicked();
            }
        }
    }

    public UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback callback) {
        this.activity = activity;
        this.callback = callback;
    }

    public void loadAd(final String adUnitId, final AdRequest request) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m44239lambda$loadAd$0$comgoogleunityadsUnityAppOpenAd(adUnitId, request);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$loadAd$0$com-google-unity-ads-UnityAppOpenAd, reason: not valid java name */
    /* synthetic */ void m44239lambda$loadAd$0$comgoogleunityadsUnityAppOpenAd(String str, AdRequest adRequest) {
        AppOpenAd.load(this.activity, str, adRequest, new C108293(this));
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityAppOpenAd$3 */
    class C108293 extends AppOpenAd.AppOpenAdLoadCallback {
        final /* synthetic */ UnityAppOpenAd this$0;

        C108293(final UnityAppOpenAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(AppOpenAd ad) {
            this.this$0.appOpenAd = ad;
            this.this$0.appOpenAd.setOnPaidEventListener(this.this$0.onPaidEventListener);
            this.this$0.appOpenAd.setFullScreenContentCallback(this.this$0.fullScreenContentCallback);
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44248lambda$onAdLoaded$0$comgoogleunityadsUnityAppOpenAd$3();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdLoaded$0$com-google-unity-ads-UnityAppOpenAd$3, reason: not valid java name */
        /* synthetic */ void m44248lambda$onAdLoaded$0$comgoogleunityadsUnityAppOpenAd$3() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAppOpenAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError error) {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44247lambda$onAdFailedToLoad$0$comgoogleunityadsUnityAppOpenAd$3(error);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-UnityAppOpenAd$3, reason: not valid java name */
        /* synthetic */ void m44247lambda$onAdFailedToLoad$0$comgoogleunityadsUnityAppOpenAd$3(LoadAdError loadAdError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAppOpenAdFailedToLoad(loadAdError);
            }
        }
    }

    void setAppOpenAd(AppOpenAd appOpenAd) {
        this.appOpenAd = appOpenAd;
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m44242lambda$setAppOpenAd$0$comgoogleunityadsUnityAppOpenAd();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setAppOpenAd$0$com-google-unity-ads-UnityAppOpenAd, reason: not valid java name */
    /* synthetic */ void m44242lambda$setAppOpenAd$0$comgoogleunityadsUnityAppOpenAd() {
        this.appOpenAd.setOnPaidEventListener(this.onPaidEventListener);
        this.appOpenAd.setFullScreenContentCallback(this.fullScreenContentCallback);
    }

    public void pollAd(String adUnitId) {
        AppOpenAd appOpenAdPollAd = AppOpenAd.pollAd(this.activity, adUnitId);
        this.appOpenAd = appOpenAdPollAd;
        if (appOpenAdPollAd == null) {
            Log.e(PluginUtils.LOGTAG, "Failed to obtain an App Open Ad from the preloader.");
            final LoadAdError loadAdError = new LoadAdError(0, "Failed to obtain an App Open Ad from the preloader.", MobileAds.ERROR_DOMAIN, null, null);
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44240lambda$pollAd$0$comgoogleunityadsUnityAppOpenAd(loadAdError);
                }
            }).start();
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44241lambda$pollAd$1$comgoogleunityadsUnityAppOpenAd();
                }
            });
            this.appOpenAd.setFullScreenContentCallback(this.fullScreenContentCallback);
        }
    }

    /* JADX INFO: renamed from: lambda$pollAd$0$com-google-unity-ads-UnityAppOpenAd, reason: not valid java name */
    /* synthetic */ void m44240lambda$pollAd$0$comgoogleunityadsUnityAppOpenAd(LoadAdError loadAdError) {
        UnityAppOpenAdCallback unityAppOpenAdCallback = this.callback;
        if (unityAppOpenAdCallback != null) {
            unityAppOpenAdCallback.onAppOpenAdFailedToLoad(loadAdError);
        }
    }

    /* JADX INFO: renamed from: lambda$pollAd$1$com-google-unity-ads-UnityAppOpenAd, reason: not valid java name */
    /* synthetic */ void m44241lambda$pollAd$1$comgoogleunityadsUnityAppOpenAd() {
        this.appOpenAd.setOnPaidEventListener(this.onPaidEventListener);
    }

    public boolean isAdAvailable(String adUnitId) {
        return AppOpenAd.isAdAvailable(this.activity, adUnitId);
    }

    public void show() {
        if (this.appOpenAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show app open ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44243lambda$show$0$comgoogleunityadsUnityAppOpenAd();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$show$0$com-google-unity-ads-UnityAppOpenAd, reason: not valid java name */
    /* synthetic */ void m44243lambda$show$0$comgoogleunityadsUnityAppOpenAd() {
        this.appOpenAd.setImmersiveMode(true);
        this.appOpenAd.show(this.activity);
    }

    public String getAdUnitId() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return null;
        }
        return appOpenAd.getAdUnitId();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnNewThread(final Runnable action) {
        new Thread(action).start();
    }
}
