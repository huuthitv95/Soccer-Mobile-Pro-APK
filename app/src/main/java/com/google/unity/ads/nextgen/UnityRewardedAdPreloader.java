package com.google.unity.ads.nextgen;

import android.app.Activity;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadConfiguration;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAd;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAdPreloader;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class UnityRewardedAdPreloader {
    private final Activity activity;
    private final UnityPreloadCallback preloadCallback;
    private final RewardedAdPreloaderWrapper preloaderWrapper;
    private final ExecutorService service;

    public UnityRewardedAdPreloader(Activity activity, UnityPreloadCallback preloadCallback) {
        this(activity, preloadCallback, new RewardedAdPreloaderWrapper(), Executors.newSingleThreadExecutor());
    }

    public UnityRewardedAdPreloader(Activity activity, UnityPreloadCallback preloadCallback, RewardedAdPreloaderWrapper preloaderWrapper, ExecutorService service) {
        this.activity = activity;
        this.preloadCallback = preloadCallback;
        this.service = service;
        this.preloaderWrapper = preloaderWrapper;
    }

    public boolean start(String preloadId, PreloadConfiguration preloadConfiguration) {
        return this.preloaderWrapper.start(preloadId, preloadConfiguration, new C108801(this));
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityRewardedAdPreloader$1 */
    class C108801 implements PreloadCallback {
        final /* synthetic */ UnityRewardedAdPreloader this$0;

        C108801(final UnityRewardedAdPreloader this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onAdPreloaded(final String preloadId, final ResponseInfo responseInfo) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAdPreloader$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23161x2414b2fb(preloadId, responseInfo);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdPreloaded$0$com-google-unity-ads-nextgen-UnityRewardedAdPreloader$1 */
        /* synthetic */ void m23161x2414b2fb(String str, ResponseInfo responseInfo) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdPreloaded(str, responseInfo);
            }
        }

        public void onAdsExhausted(final String preloadId) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAdPreloader$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23162xb501cc67(preloadId);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdsExhausted$0$com-google-unity-ads-nextgen-UnityRewardedAdPreloader$1 */
        /* synthetic */ void m23162xb501cc67(String str) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdsExhausted(str);
            }
        }

        public void onAdFailedToPreload(final String preloadId, final LoadAdError adError) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAdPreloader$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23160x93342be4(preloadId, adError);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToPreload$0$com-google-unity-ads-nextgen-UnityRewardedAdPreloader$1 */
        /* synthetic */ void m23160x93342be4(String str, LoadAdError loadAdError) {
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

    public UnityRewardedAd pollAd(String preloadId, UnityRewardedAdCallback callback) {
        RewardedAd rewardedAdPollAd = this.preloaderWrapper.pollAd(preloadId);
        if (rewardedAdPollAd == null) {
            return null;
        }
        return new UnityRewardedAd(this.activity, callback, rewardedAdPollAd);
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

    public static class RewardedAdPreloaderWrapper {
        public boolean start(String preloadId, PreloadConfiguration config, PreloadCallback callback) {
            return RewardedAdPreloader.start(preloadId, config, callback);
        }

        public boolean isAdAvailable(String preloadId) {
            return RewardedAdPreloader.isAdAvailable(preloadId);
        }

        public int getNumAdsAvailable(String preloadId) {
            return RewardedAdPreloader.getNumAdsAvailable(preloadId);
        }

        public RewardedAd pollAd(String preloadId) {
            return RewardedAdPreloader.pollAd(preloadId);
        }

        public PreloadConfiguration getConfiguration(String preloadId) {
            return RewardedAdPreloader.getConfiguration(preloadId);
        }

        public Map<String, PreloadConfiguration> getConfigurations() {
            return RewardedAdPreloader.getConfigurations();
        }

        public boolean destroy(String preloadId) {
            return RewardedAdPreloader.destroy(preloadId);
        }
    }
}
