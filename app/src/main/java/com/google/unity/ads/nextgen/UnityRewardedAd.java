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
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAd;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAdEventCallback;
import com.google.unity.ads.PluginUtils;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class UnityRewardedAd extends UnityAdBase<RewardedAd, UnityRewardedAdCallback> {
    private final AdWrapper<RewardedAd> adWrapper;

    public UnityRewardedAd(Activity activity, UnityRewardedAdCallback callback) {
        this(activity, callback, AdWrapper.forRewarded(), Executors.newSingleThreadExecutor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnityRewardedAd(Activity activity, UnityRewardedAdCallback callback, RewardedAd rewardedAd) {
        this(activity, callback, AdWrapper.forRewarded(), Executors.newSingleThreadExecutor());
        this.f22624ad = rewardedAd;
    }

    UnityRewardedAd(Activity activity, UnityRewardedAdCallback callback, AdWrapper<RewardedAd> adWrapper, Executor executor) {
        super(activity, callback, executor);
        this.adWrapper = adWrapper;
    }

    RewardedAd getRewardedAd() {
        return (RewardedAd) this.f22624ad;
    }

    public void load(final AdRequest request) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m44314lambda$load$0$comgoogleunityadsnextgenUnityRewardedAd(request);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$load$0$com-google-unity-ads-nextgen-UnityRewardedAd, reason: not valid java name */
    /* synthetic */ void m44314lambda$load$0$comgoogleunityadsnextgenUnityRewardedAd(AdRequest adRequest) {
        this.adWrapper.load(adRequest, new C108771(this));
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityRewardedAd$1 */
    class C108771 implements AdLoadCallback<RewardedAd> {
        final /* synthetic */ UnityRewardedAd this$0;

        C108771(final UnityRewardedAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onAdLoaded(RewardedAd rewardedAd) {
            this.this$0.f22624ad = rewardedAd;
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAd$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23153xb5787f5a();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdLoaded$0$com-google-unity-ads-nextgen-UnityRewardedAd$1 */
        /* synthetic */ void m23153xb5787f5a() {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onRewardedAdLoaded();
            }
        }

        public void onAdFailedToLoad(final LoadAdError adError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23152x62b79b21(adError);
                }
            });
            this.this$0.f22624ad = null;
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-nextgen-UnityRewardedAd$1 */
        /* synthetic */ void m23152x62b79b21(LoadAdError loadAdError) {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onRewardedAdFailedToLoad(loadAdError);
            }
        }
    }

    public void show() {
        if (this.f22624ad == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to show rewarded ad before it was ready. Please call load first and wait for a successful onAdLoaded callback.");
        } else {
            ((RewardedAd) this.f22624ad).setAdEventCallback(new C108782(this));
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44315lambda$show$0$comgoogleunityadsnextgenUnityRewardedAd();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityRewardedAd$2 */
    class C108782 implements RewardedAdEventCallback {
        final /* synthetic */ UnityRewardedAd this$0;

        C108782(final UnityRewardedAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onAdShowedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23158x8c6b603c();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdShowedFullScreenContent$0$com-google-unity-ads-nextgen-UnityRewardedAd$2 */
        /* synthetic */ void m23158x8c6b603c() {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onAdShowedFullScreenContent();
            }
        }

        public void onAdDismissedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAd$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23155x615b386b();
                }
            });
            this.this$0.f22624ad = null;
        }

        /* JADX INFO: renamed from: lambda$onAdDismissedFullScreenContent$0$com-google-unity-ads-nextgen-UnityRewardedAd$2 */
        /* synthetic */ void m23155x615b386b() {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onAdDismissedFullScreenContent();
            }
        }

        public void onAdFailedToShowFullScreenContent(final FullScreenContentError fullScreenContentError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAd$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23156xc8682515(fullScreenContentError);
                }
            });
            this.this$0.f22624ad = null;
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-nextgen-UnityRewardedAd$2 */
        /* synthetic */ void m23156xc8682515(FullScreenContentError fullScreenContentError) {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onAdFailedToShowFullScreenContent(fullScreenContentError);
            }
        }

        public void onAdImpression() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23157x27131d57();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdImpression$0$com-google-unity-ads-nextgen-UnityRewardedAd$2 */
        /* synthetic */ void m23157x27131d57() {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onAdImpression();
            }
        }

        public void onAdClicked() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAd$2$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23154x9f765bd7();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdClicked$0$com-google-unity-ads-nextgen-UnityRewardedAd$2 */
        /* synthetic */ void m23154x9f765bd7() {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onAdClicked();
            }
        }

        public void onAdPaid(final AdValue adValue) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAd$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44316lambda$onAdPaid$0$comgoogleunityadsnextgenUnityRewardedAd$2(adValue);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdPaid$0$com-google-unity-ads-nextgen-UnityRewardedAd$2, reason: not valid java name */
        /* synthetic */ void m44316lambda$onAdPaid$0$comgoogleunityadsnextgenUnityRewardedAd$2(AdValue adValue) {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onPaidEvent(Util.getAdValuePrecisionType(adValue.getPrecisionType()), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* JADX INFO: renamed from: lambda$show$0$com-google-unity-ads-nextgen-UnityRewardedAd, reason: not valid java name */
    /* synthetic */ void m44315lambda$show$0$comgoogleunityadsnextgenUnityRewardedAd() {
        ((RewardedAd) this.f22624ad).setImmersiveMode(true);
        ((RewardedAd) this.f22624ad).show(this.activity, new C108793(this));
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityRewardedAd$3 */
    class C108793 implements OnUserEarnedRewardListener {
        final /* synthetic */ UnityRewardedAd this$0;

        C108793(final UnityRewardedAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onUserEarnedReward(final RewardItem rewardItem) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityRewardedAd$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23159x4450c893(rewardItem);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onUserEarnedReward$0$com-google-unity-ads-nextgen-UnityRewardedAd$3 */
        /* synthetic */ void m23159x4450c893(RewardItem rewardItem) {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onUserEarnedReward(rewardItem.getType(), rewardItem.getAmount());
            }
        }
    }

    public long getPlacementId() {
        if (this.f22624ad == 0) {
            return 0L;
        }
        return ((RewardedAd) this.f22624ad).getPlacementId();
    }

    public void setPlacementId(long placementId) {
        if (this.f22624ad == 0) {
            return;
        }
        ((RewardedAd) this.f22624ad).setPlacementId(placementId);
    }

    public ResponseInfo getResponseInfo() {
        if (this.f22624ad == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return ((RewardedAd) this.f22624ad).getResponseInfo();
    }
}
