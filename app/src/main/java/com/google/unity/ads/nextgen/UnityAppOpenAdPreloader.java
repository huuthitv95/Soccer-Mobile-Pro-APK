package com.google.unity.ads.nextgen;

import android.app.Activity;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAd;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAdPreloader;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadConfiguration;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class UnityAppOpenAdPreloader {
    private final Activity activity;
    private final UnityPreloadCallback preloadCallback;
    private final AppOpenAdPreloaderWrapper preloaderWrapper;
    private final ExecutorService service;

    public UnityAppOpenAdPreloader(Activity activity, UnityPreloadCallback preloadCallback) {
        this(activity, preloadCallback, new AppOpenAdPreloaderWrapper(), Executors.newSingleThreadExecutor());
    }

    public UnityAppOpenAdPreloader(Activity activity, UnityPreloadCallback preloadCallback, AppOpenAdPreloaderWrapper preloaderWrapper, ExecutorService service) {
        this.activity = activity;
        this.preloadCallback = preloadCallback;
        this.service = service;
        this.preloaderWrapper = preloaderWrapper;
    }

    public boolean start(String preloadId, PreloadConfiguration preloadConfiguration) {
        return this.preloaderWrapper.start(preloadId, preloadConfiguration, new C108681(this));
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityAppOpenAdPreloader$1 */
    class C108681 implements PreloadCallback {
        final /* synthetic */ UnityAppOpenAdPreloader this$0;

        C108681(final UnityAppOpenAdPreloader this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onAdPreloaded(final String preloadId, final ResponseInfo responseInfo) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAdPreloader$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23136x7497d6ec(preloadId, responseInfo);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdPreloaded$0$com-google-unity-ads-nextgen-UnityAppOpenAdPreloader$1 */
        /* synthetic */ void m23136x7497d6ec(String str, ResponseInfo responseInfo) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdPreloaded(str, responseInfo);
            }
        }

        public void onAdsExhausted(final String preloadId) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAdPreloader$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23137x162be000(preloadId);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdsExhausted$0$com-google-unity-ads-nextgen-UnityAppOpenAdPreloader$1 */
        /* synthetic */ void m23137x162be000(String str) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdsExhausted(str);
            }
        }

        public void onAdFailedToPreload(final String preloadId, final LoadAdError adError) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityAppOpenAdPreloader$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23135x46a11ce3(preloadId, adError);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToPreload$0$com-google-unity-ads-nextgen-UnityAppOpenAdPreloader$1 */
        /* synthetic */ void m23135x46a11ce3(String str, LoadAdError loadAdError) {
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

    public UnityAppOpenAd pollAd(String preloadId, UnityAppOpenAdCallback callback) {
        AppOpenAd appOpenAdPollAd = this.preloaderWrapper.pollAd(preloadId);
        if (appOpenAdPollAd == null) {
            return null;
        }
        return new UnityAppOpenAd(this.activity, callback, appOpenAdPollAd);
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

    public static class AppOpenAdPreloaderWrapper {
        public boolean start(String preloadId, PreloadConfiguration config, PreloadCallback callback) {
            return AppOpenAdPreloader.start(preloadId, config, callback);
        }

        public boolean isAdAvailable(String preloadId) {
            return AppOpenAdPreloader.isAdAvailable(preloadId);
        }

        public int getNumAdsAvailable(String preloadId) {
            return AppOpenAdPreloader.getNumAdsAvailable(preloadId);
        }

        public AppOpenAd pollAd(String preloadId) {
            return AppOpenAdPreloader.pollAd(preloadId);
        }

        public PreloadConfiguration getConfiguration(String preloadId) {
            return AppOpenAdPreloader.getConfiguration(preloadId);
        }

        public Map<String, PreloadConfiguration> getConfigurations() {
            return AppOpenAdPreloader.getConfigurations();
        }

        public boolean destroy(String preloadId) {
            return AppOpenAdPreloader.destroy(preloadId);
        }
    }
}
