package com.google.unity.ads.nextgen;

import android.app.Activity;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadConfiguration;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAdPreloader;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class UnityInterstitialAdPreloader {
    private final Activity activity;
    private final UnityPreloadCallback preloadCallback;
    private final InterstitialAdPreloaderWrapper preloaderWrapper;
    private final ExecutorService service;

    public UnityInterstitialAdPreloader(Activity activity, UnityPreloadCallback preloadCallback) {
        this(activity, preloadCallback, new InterstitialAdPreloaderWrapper(), Executors.newSingleThreadExecutor());
    }

    public UnityInterstitialAdPreloader(Activity activity, UnityPreloadCallback preloadCallback, InterstitialAdPreloaderWrapper preloaderWrapper, ExecutorService service) {
        this.activity = activity;
        this.preloadCallback = preloadCallback;
        this.service = service;
        this.preloaderWrapper = preloaderWrapper;
    }

    public boolean start(String preloadId, PreloadConfiguration preloadConfiguration) {
        return this.preloaderWrapper.start(preloadId, preloadConfiguration, new C108761(this));
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityInterstitialAdPreloader$1 */
    class C108761 implements PreloadCallback {
        final /* synthetic */ UnityInterstitialAdPreloader this$0;

        C108761(final UnityInterstitialAdPreloader this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onAdPreloaded(final String preloadId, final ResponseInfo responseInfo) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAdPreloader$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23150x837f6c1d(preloadId, responseInfo);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdPreloaded$0$com-google-unity-ads-nextgen-UnityInterstitialAdPreloader$1 */
        /* synthetic */ void m23150x837f6c1d(String str, ResponseInfo responseInfo) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdPreloaded(str, responseInfo);
            }
        }

        public void onAdsExhausted(final String preloadId) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAdPreloader$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23151x3c29ef89(preloadId);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdsExhausted$0$com-google-unity-ads-nextgen-UnityInterstitialAdPreloader$1 */
        /* synthetic */ void m23151x3c29ef89(String str) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdsExhausted(str);
            }
        }

        public void onAdFailedToPreload(final String preloadId, final LoadAdError adError) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityInterstitialAdPreloader$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23149xf2f64886(preloadId, adError);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToPreload$0$com-google-unity-ads-nextgen-UnityInterstitialAdPreloader$1 */
        /* synthetic */ void m23149xf2f64886(String str, LoadAdError loadAdError) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdFailedToPreload(str, loadAdError);
            }
        }
    }

    public boolean isAdAvailable(String preloadId) {
        return this.preloaderWrapper.isAdAvailable(preloadId);
    }

    public int getNumAdsAvailable(String preloadId) {
        return this.preloaderWrapper.getNumAdsAvailable(preloadId);
    }

    public UnityInterstitialAd pollAd(String preloadId, UnityInterstitialAdCallback callback) {
        InterstitialAd interstitialAdPollAd = this.preloaderWrapper.pollAd(preloadId);
        if (interstitialAdPollAd == null) {
            return null;
        }
        return new UnityInterstitialAd(this.activity, callback, interstitialAdPollAd);
    }

    public PreloadConfiguration getConfiguration(String preloadId) {
        return this.preloaderWrapper.getConfiguration(preloadId);
    }

    public Map<String, PreloadConfiguration> getConfigurations() {
        return this.preloaderWrapper.getConfigurations();
    }

    public void destroy(String preloadId) {
        this.preloaderWrapper.destroy(preloadId);
    }

    public static class InterstitialAdPreloaderWrapper {
        public boolean start(String preloadId, PreloadConfiguration config, PreloadCallback callback) {
            return InterstitialAdPreloader.start(preloadId, config, callback);
        }

        public boolean isAdAvailable(String preloadId) {
            return InterstitialAdPreloader.isAdAvailable(preloadId);
        }

        public int getNumAdsAvailable(String preloadId) {
            return InterstitialAdPreloader.getNumAdsAvailable(preloadId);
        }

        public InterstitialAd pollAd(String preloadId) {
            return InterstitialAdPreloader.pollAd(preloadId);
        }

        public PreloadConfiguration getConfiguration(String preloadId) {
            return InterstitialAdPreloader.getConfiguration(preloadId);
        }

        public Map<String, PreloadConfiguration> getConfigurations() {
            return InterstitialAdPreloader.getConfigurations();
        }

        public boolean destroy(String preloadId) {
            return InterstitialAdPreloader.destroy(preloadId);
        }
    }
}
