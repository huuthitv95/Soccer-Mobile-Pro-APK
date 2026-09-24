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
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes6.dex */
public class UnityRewardedAd {
    private final Activity activity;
    private UnityRewardedAdCallback callback;
    private RewardedAd rewardedAd;
    private final OnPaidEventListener onPaidEventListener = new C108341(this);
    private final FullScreenContentCallback fullScreenContentCallback = new C108352(this);

    public void destroy() {
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityRewardedAd$1 */
    class C108341 implements OnPaidEventListener {
        final /* synthetic */ UnityRewardedAd this$0;

        C108341(final UnityRewardedAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44263lambda$onPaidEvent$0$comgoogleunityadsUnityRewardedAd$1(adValue);
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onPaidEvent$0$com-google-unity-ads-UnityRewardedAd$1, reason: not valid java name */
        /* synthetic */ void m44263lambda$onPaidEvent$0$comgoogleunityadsUnityRewardedAd$1(AdValue adValue) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityRewardedAd$2 */
    class C108352 extends FullScreenContentCallback {
        final /* synthetic */ UnityRewardedAd this$0;

        C108352(final UnityRewardedAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(final AdError error) {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23097xedca1065(error);
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-UnityRewardedAd$2 */
        /* synthetic */ void m23097xedca1065(AdError adError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdFailedToShowFullScreenContent(adError);
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23098xb7d2628c();
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdShowedFullScreenContent$0$com-google-unity-ads-UnityRewardedAd$2 */
        /* synthetic */ void m23098xb7d2628c() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdShowedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23096xaa98d9bb();
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdDismissedFullScreenContent$0$com-google-unity-ads-UnityRewardedAd$2 */
        /* synthetic */ void m23096xaa98d9bb() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdDismissedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44265lambda$onAdImpression$0$comgoogleunityadsUnityRewardedAd$2();
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdImpression$0$com-google-unity-ads-UnityRewardedAd$2, reason: not valid java name */
        /* synthetic */ void m44265lambda$onAdImpression$0$comgoogleunityadsUnityRewardedAd$2() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdImpression();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44264lambda$onAdClicked$0$comgoogleunityadsUnityRewardedAd$2();
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdClicked$0$com-google-unity-ads-UnityRewardedAd$2, reason: not valid java name */
        /* synthetic */ void m44264lambda$onAdClicked$0$comgoogleunityadsUnityRewardedAd$2() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdClicked();
            }
        }
    }

    public UnityRewardedAd(Activity activity, UnityRewardedAdCallback callback) {
        this.activity = activity;
        this.callback = callback;
    }

    public void setRewardedAd(RewardedAd rewardedAd) {
        this.rewardedAd = rewardedAd;
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m44261lambda$setRewardedAd$0$comgoogleunityadsUnityRewardedAd();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setRewardedAd$0$com-google-unity-ads-UnityRewardedAd, reason: not valid java name */
    /* synthetic */ void m44261lambda$setRewardedAd$0$comgoogleunityadsUnityRewardedAd() {
        this.rewardedAd.setOnPaidEventListener(this.onPaidEventListener);
        this.rewardedAd.setFullScreenContentCallback(this.fullScreenContentCallback);
    }

    public void loadAd(final String adUnitId, final AdRequest request) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m44258lambda$loadAd$0$comgoogleunityadsUnityRewardedAd(adUnitId, request);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$loadAd$0$com-google-unity-ads-UnityRewardedAd, reason: not valid java name */
    /* synthetic */ void m44258lambda$loadAd$0$comgoogleunityadsUnityRewardedAd(String str, AdRequest adRequest) {
        RewardedAd.load(this.activity, str, adRequest, new C108363(this));
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityRewardedAd$3 */
    class C108363 extends RewardedAdLoadCallback {
        final /* synthetic */ UnityRewardedAd this$0;

        C108363(final UnityRewardedAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(RewardedAd ad) {
            this.this$0.rewardedAd = ad;
            this.this$0.rewardedAd.setOnPaidEventListener(this.this$0.onPaidEventListener);
            this.this$0.rewardedAd.setFullScreenContentCallback(this.this$0.fullScreenContentCallback);
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44267lambda$onAdLoaded$0$comgoogleunityadsUnityRewardedAd$3();
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdLoaded$0$com-google-unity-ads-UnityRewardedAd$3, reason: not valid java name */
        /* synthetic */ void m44267lambda$onAdLoaded$0$comgoogleunityadsUnityRewardedAd$3() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onRewardedAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError error) {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44266lambda$onAdFailedToLoad$0$comgoogleunityadsUnityRewardedAd$3(error);
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-UnityRewardedAd$3, reason: not valid java name */
        /* synthetic */ void m44266lambda$onAdFailedToLoad$0$comgoogleunityadsUnityRewardedAd$3(LoadAdError loadAdError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onRewardedAdFailedToLoad(loadAdError);
            }
        }
    }

    public void pollAd(String adUnitId) {
        RewardedAd rewardedAdPollAd = RewardedAd.pollAd(this.activity, adUnitId);
        this.rewardedAd = rewardedAdPollAd;
        if (rewardedAdPollAd == null) {
            Log.e(PluginUtils.LOGTAG, "Failed to obtain a Rewarded Ad from the preloader.");
            final LoadAdError loadAdError = new LoadAdError(0, "Failed to obtain a Rewarded Ad from the preloader.", MobileAds.ERROR_DOMAIN, null, null);
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44259lambda$pollAd$0$comgoogleunityadsUnityRewardedAd(loadAdError);
                }
            }).start();
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44260lambda$pollAd$1$comgoogleunityadsUnityRewardedAd();
                }
            });
            this.rewardedAd.setFullScreenContentCallback(this.fullScreenContentCallback);
        }
    }

    /* JADX INFO: renamed from: lambda$pollAd$0$com-google-unity-ads-UnityRewardedAd, reason: not valid java name */
    /* synthetic */ void m44259lambda$pollAd$0$comgoogleunityadsUnityRewardedAd(LoadAdError loadAdError) {
        UnityRewardedAdCallback unityRewardedAdCallback = this.callback;
        if (unityRewardedAdCallback != null) {
            unityRewardedAdCallback.onRewardedAdFailedToLoad(loadAdError);
        }
    }

    /* JADX INFO: renamed from: lambda$pollAd$1$com-google-unity-ads-UnityRewardedAd, reason: not valid java name */
    /* synthetic */ void m44260lambda$pollAd$1$comgoogleunityadsUnityRewardedAd() {
        this.rewardedAd.setOnPaidEventListener(this.onPaidEventListener);
    }

    public boolean isAdAvailable(String adUnitId) {
        return RewardedAd.isAdAvailable(this.activity, adUnitId);
    }

    public void show() {
        if (this.rewardedAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show rewarded ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44262lambda$show$0$comgoogleunityadsUnityRewardedAd();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$show$0$com-google-unity-ads-UnityRewardedAd, reason: not valid java name */
    /* synthetic */ void m44262lambda$show$0$comgoogleunityadsUnityRewardedAd() {
        this.rewardedAd.setImmersiveMode(true);
        this.rewardedAd.show(this.activity, new C108374(this));
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityRewardedAd$4 */
    class C108374 implements OnUserEarnedRewardListener {
        final /* synthetic */ UnityRewardedAd this$0;

        C108374(final UnityRewardedAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(final RewardItem rewardItem) {
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23099xe1b880e4(rewardItem);
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onUserEarnedReward$0$com-google-unity-ads-UnityRewardedAd$4 */
        /* synthetic */ void m23099xe1b880e4(RewardItem rewardItem) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onUserEarnedReward(rewardItem.getType(), rewardItem.getAmount());
            }
        }
    }

    public void setServerSideVerificationOptions(final ServerSideVerificationOptions serverSideVerificationOptions) {
        if (this.rewardedAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried set server side verification before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityRewardedAd$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23095x441f36fd(serverSideVerificationOptions);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$setServerSideVerificationOptions$0$com-google-unity-ads-UnityRewardedAd */
    /* synthetic */ void m23095x441f36fd(ServerSideVerificationOptions serverSideVerificationOptions) {
        this.rewardedAd.setServerSideVerificationOptions(serverSideVerificationOptions);
    }

    public String getAdUnitId() {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null) {
            return null;
        }
        return rewardedAd.getAdUnitId();
    }

    public long getPlacementId() {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null) {
            return 0L;
        }
        return rewardedAd.getPlacementId();
    }

    public void setPlacementId(long placementId) {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null) {
            return;
        }
        rewardedAd.setPlacementId(placementId);
    }

    public ResponseInfo getResponseInfo() {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return rewardedAd.getResponseInfo();
    }

    public RewardItem getRewardItem() {
        if (this.rewardedAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get reward item before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
            return null;
        }
        FutureTask futureTask = new FutureTask(new Callable<RewardItem>(this) { // from class: com.google.unity.ads.UnityRewardedAd.5
            final /* synthetic */ UnityRewardedAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RewardItem call() {
                return this.this$0.rewardedAd.getRewardItem();
            }
        });
        this.activity.runOnUiThread(futureTask);
        try {
            return (RewardItem) futureTask.get();
        } catch (InterruptedException e) {
            Log.e(PluginUtils.LOGTAG, String.format("Unable to get reward item: %s", e.getLocalizedMessage()));
            return null;
        } catch (ExecutionException e2) {
            Log.e(PluginUtils.LOGTAG, String.format("Unable to get reward item: %s", e2.getLocalizedMessage()));
            return null;
        }
    }
}
