package com.google.unity.ads.nextgen;

import android.app.Activity;
import android.util.Log;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.rewarded.OnUserEarnedRewardListener;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardItem;
import com.google.android.libraries.ads.mobile.sdk.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.rewardedinterstitial.RewardedInterstitialAdEventCallback;
import com.google.unity.ads.PluginUtils;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class UnityRewardedInterstitialAd extends UnityAdBase<RewardedInterstitialAd, UnityRewardedInterstitialAdCallback> {
    private final AdWrapper<RewardedInterstitialAd> adWrapper;

    public UnityRewardedInterstitialAd(Activity activity, UnityRewardedInterstitialAdCallback callback) {
        this(activity, callback, AdWrapper.forRewardedInterstitial(), Executors.newSingleThreadExecutor());
    }

    UnityRewardedInterstitialAd(Activity activity, UnityRewardedInterstitialAdCallback callback, AdWrapper<RewardedInterstitialAd> adWrapper, Executor executor) {
        super(activity, callback, executor);
        this.adWrapper = adWrapper;
    }

    public void load(final AdRequest request) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m23163xecaa125a(request);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$load$0$com-google-unity-ads-nextgen-UnityRewardedInterstitialAd */
    /* synthetic */ void m23163xecaa125a(AdRequest adRequest) {
        this.adWrapper.load(adRequest, new C108811(this));
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$1 */
    class C108811 implements AdLoadCallback<RewardedInterstitialAd> {
        final /* synthetic */ UnityRewardedInterstitialAd this$0;

        C108811(final UnityRewardedInterstitialAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
            this.this$0.f22624ad = rewardedInterstitialAd;
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23166xf40e15a6();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdLoaded$0$com-google-unity-ads-nextgen-UnityRewardedInterstitialAd$1 */
        /* synthetic */ void m23166xf40e15a6() {
            if (this.this$0.callback != 0) {
                ((UnityRewardedInterstitialAdCallback) this.this$0.callback).onRewardedInterstitialAdLoaded();
            }
        }

        public void onAdFailedToLoad(final LoadAdError adError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23165xf456beed(adError);
                }
            });
            this.this$0.f22624ad = null;
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-nextgen-UnityRewardedInterstitialAd$1 */
        /* synthetic */ void m23165xf456beed(LoadAdError loadAdError) {
            if (this.this$0.callback != 0) {
                ((UnityRewardedInterstitialAdCallback) this.this$0.callback).onRewardedInterstitialAdFailedToLoad(loadAdError);
            }
        }
    }

    public void show() {
        if (this.f22624ad == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to show rewarded interstitial ad before it was ready. Please call load first and wait for a successful onAdLoaded callback.");
        } else {
            ((RewardedInterstitialAd) this.f22624ad).setAdEventCallback(new C108822(this));
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23164x2c9881e3();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$2 */
    class C108822 implements RewardedInterstitialAdEventCallback {
        final /* synthetic */ UnityRewardedInterstitialAd this$0;

        C108822(final UnityRewardedInterstitialAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onAdShowedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23172x36d9ad08();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdShowedFullScreenContent$0$com-google-unity-ads-nextgen-UnityRewardedInterstitialAd$2 */
        /* synthetic */ void m23172x36d9ad08() {
            if (this.this$0.callback != 0) {
                ((UnityRewardedInterstitialAdCallback) this.this$0.callback).onAdShowedFullScreenContent();
            }
        }

        public void onAdDismissedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23168x74d3b6b7();
                }
            });
            this.this$0.f22624ad = null;
        }

        /* JADX INFO: renamed from: lambda$onAdDismissedFullScreenContent$0$com-google-unity-ads-nextgen-UnityRewardedInterstitialAd$2 */
        /* synthetic */ void m23168x74d3b6b7() {
            if (this.this$0.callback != 0) {
                ((UnityRewardedInterstitialAdCallback) this.this$0.callback).onAdDismissedFullScreenContent();
            }
        }

        public void onAdFailedToShowFullScreenContent(final FullScreenContentError fullScreenContentError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23169xd6e0f461(fullScreenContentError);
                }
            });
            this.this$0.f22624ad = null;
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-nextgen-UnityRewardedInterstitialAd$2 */
        /* synthetic */ void m23169xd6e0f461(FullScreenContentError fullScreenContentError) {
            if (this.this$0.callback != 0) {
                ((UnityRewardedInterstitialAdCallback) this.this$0.callback).onAdFailedToShowFullScreenContent(fullScreenContentError);
            }
        }

        public void onAdImpression() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23170xf29f99a3();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdImpression$0$com-google-unity-ads-nextgen-UnityRewardedInterstitialAd$2 */
        /* synthetic */ void m23170xf29f99a3() {
            if (this.this$0.callback != 0) {
                ((UnityRewardedInterstitialAdCallback) this.this$0.callback).onAdImpression();
            }
        }

        public void onAdClicked() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$2$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23167xeb991823();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdClicked$0$com-google-unity-ads-nextgen-UnityRewardedInterstitialAd$2 */
        /* synthetic */ void m23167xeb991823() {
            if (this.this$0.callback != 0) {
                ((UnityRewardedInterstitialAdCallback) this.this$0.callback).onAdClicked();
            }
        }

        public void onAdPaid(final AdValue adValue) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23171xaeeb0c80(adValue);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdPaid$0$com-google-unity-ads-nextgen-UnityRewardedInterstitialAd$2 */
        /* synthetic */ void m23171xaeeb0c80(AdValue adValue) {
            if (this.this$0.callback != 0) {
                ((UnityRewardedInterstitialAdCallback) this.this$0.callback).onPaidEvent(Util.getAdValuePrecisionType(adValue.getPrecisionType()), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* JADX INFO: renamed from: lambda$show$0$com-google-unity-ads-nextgen-UnityRewardedInterstitialAd */
    /* synthetic */ void m23164x2c9881e3() {
        ((RewardedInterstitialAd) this.f22624ad).setImmersiveMode(true);
        ((RewardedInterstitialAd) this.f22624ad).show(this.activity, new C108833(this));
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$3 */
    class C108833 implements OnUserEarnedRewardListener {
        final /* synthetic */ UnityRewardedInterstitialAd this$0;

        C108833(final UnityRewardedInterstitialAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onUserEarnedReward(final RewardItem rewardItem) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23173x99e7445f(rewardItem);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onUserEarnedReward$0$com-google-unity-ads-nextgen-UnityRewardedInterstitialAd$3 */
        /* synthetic */ void m23173x99e7445f(RewardItem rewardItem) {
            if (this.this$0.callback != 0) {
                ((UnityRewardedInterstitialAdCallback) this.this$0.callback).onUserEarnedReward(rewardItem.getType(), rewardItem.getAmount());
            }
        }
    }

    public long getPlacementId() {
        if (this.f22624ad == 0) {
            return 0L;
        }
        return ((RewardedInterstitialAd) this.f22624ad).getPlacementId();
    }

    public void setPlacementId(long placementId) {
        if (this.f22624ad == 0) {
            return;
        }
        ((RewardedInterstitialAd) this.f22624ad).setPlacementId(placementId);
    }

    public ResponseInfo getResponseInfo() {
        if (this.f22624ad == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return ((RewardedInterstitialAd) this.f22624ad).getResponseInfo();
    }
}
