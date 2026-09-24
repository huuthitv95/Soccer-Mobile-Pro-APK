package com.google.unity.ads.nextgen;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAd;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.unity.ads.PluginUtils;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes6.dex */
public class UnityBannerAd {
    private View adView;
    private BannerAd bannerAd;
    private FrameLayout bannerLayout;
    private final UnityBannerAdCallback callback;
    protected boolean hidden;
    private int horizontalOffset;
    private View.OnLayoutChangeListener layoutChangeListener;
    private int positionCode;
    protected Activity unityPlayerActivity;
    private int verticalOffset;

    protected static class Insets {
        int top = 0;
        int bottom = 0;
        int left = 0;
        int right = 0;

        protected Insets() {
        }
    }

    public UnityBannerAd(Activity activity, UnityBannerAdCallback callback) {
        this.unityPlayerActivity = activity;
        this.callback = callback;
    }

    public void create(int positionCode) {
        this.horizontalOffset = 0;
        this.verticalOffset = 0;
        this.positionCode = positionCode;
        this.hidden = false;
    }

    public void create(final int positionX, final int positionY) {
        this.positionCode = -1;
        this.horizontalOffset = positionX;
        this.verticalOffset = positionY;
        this.hidden = false;
    }

    protected void load(final BannerAdRequest adRequest) {
        BannerAd.load(adRequest, new C108691(this));
        setLayoutChangeListener();
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityBannerAd$1 */
    class C108691 implements AdLoadCallback<BannerAd> {
        final /* synthetic */ UnityBannerAd this$0;

        C108691(final UnityBannerAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onAdLoaded(BannerAd ad) {
            this.this$0.bannerAd = ad;
            if (!this.this$0.hidden) {
                this.this$0.show();
            }
            new Thread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityBannerAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44309lambda$onAdLoaded$0$comgoogleunityadsnextgenUnityBannerAd$1();
                }
            }).start();
            ad.setAdEventCallback(new BannerAdEventCallback(this) { // from class: com.google.unity.ads.nextgen.UnityBannerAd.1.1
                final /* synthetic */ C108691 this$1;

                {
                    Objects.requireNonNull(this);
                    this.this$1 = this;
                }

                public void onAdImpression() {
                    if (this.this$1.this$0.callback != null) {
                        this.this$1.this$0.callback.onAdImpression();
                    }
                }

                public void onAdClicked() {
                    if (this.this$1.this$0.callback != null) {
                        this.this$1.this$0.callback.onAdClicked();
                    }
                }

                public void onAdShowedFullScreenContent() {
                    if (this.this$1.this$0.callback != null) {
                        this.this$1.this$0.callback.onAdOpened();
                    }
                }

                public void onAdDismissedFullScreenContent() {
                    if (this.this$1.this$0.callback != null) {
                        this.this$1.this$0.callback.onAdClosed();
                    }
                }

                public void onAdPaid(AdValue adValue) {
                    if (this.this$1.this$0.callback != null) {
                        this.this$1.this$0.callback.onPaidEvent(Util.getAdValuePrecisionType(adValue.getPrecisionType()), adValue.getValueMicros(), adValue.getCurrencyCode());
                    }
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onAdLoaded$0$com-google-unity-ads-nextgen-UnityBannerAd$1, reason: not valid java name */
        /* synthetic */ void m44309lambda$onAdLoaded$0$comgoogleunityadsnextgenUnityBannerAd$1() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdLoaded();
            }
        }

        public void onAdFailedToLoad(final LoadAdError adError) {
            new Thread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityBannerAd$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m23140x34b7b3ff(adError);
                }
            }).start();
        }

        /* JADX INFO: renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-nextgen-UnityBannerAd$1 */
        /* synthetic */ void m23140x34b7b3ff(LoadAdError loadAdError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdFailedToLoad(loadAdError);
            }
        }
    }

    protected void show() {
        this.unityPlayerActivity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityBannerAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m44308lambda$show$0$comgoogleunityadsnextgenUnityBannerAd();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$show$0$com-google-unity-ads-nextgen-UnityBannerAd, reason: not valid java name */
    /* synthetic */ void m44308lambda$show$0$comgoogleunityadsnextgenUnityBannerAd() {
        if (this.bannerAd == null) {
            Log.w(PluginUtils.LOGTAG, "Tried to show banner before ad was ready.");
            return;
        }
        if (this.bannerLayout == null) {
            this.bannerLayout = new FrameLayout(this.unityPlayerActivity);
        }
        if (this.bannerLayout.getParent() == null) {
            this.unityPlayerActivity.addContentView(this.bannerLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        this.adView = this.bannerAd.getView(this.unityPlayerActivity);
        this.bannerLayout.removeAllViews();
        this.bannerLayout.addView(this.adView);
        this.adView.setVisibility(0);
        updatePosition();
        this.hidden = false;
    }

    protected void hide() {
        this.unityPlayerActivity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityBannerAd$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m44307lambda$hide$0$comgoogleunityadsnextgenUnityBannerAd();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$hide$0$com-google-unity-ads-nextgen-UnityBannerAd, reason: not valid java name */
    /* synthetic */ void m44307lambda$hide$0$comgoogleunityadsnextgenUnityBannerAd() {
        FrameLayout frameLayout = this.bannerLayout;
        if (frameLayout == null || frameLayout.getParent() == null) {
            return;
        }
        ((ViewGroup) this.bannerLayout.getParent()).removeView(this.bannerLayout);
        this.hidden = true;
    }

    public ResponseInfo getResponseInfo() {
        BannerAd bannerAd = this.bannerAd;
        if (bannerAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return bannerAd.getResponseInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePosition() {
        if (this.adView == null || this.hidden) {
            return;
        }
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityBannerAd.2
            final /* synthetic */ UnityBannerAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.adView.setLayoutParams(this.this$0.getLayoutParams());
            }
        });
    }

    public void setPosition(final int code) {
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityBannerAd.3
            final /* synthetic */ UnityBannerAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.positionCode = code;
                this.this$0.updatePosition();
            }
        });
    }

    public void setPosition(final int positionX, final int positionY) {
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityBannerAd.4
            final /* synthetic */ UnityBannerAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.positionCode = -1;
                this.this$0.horizontalOffset = positionX;
                this.this$0.verticalOffset = positionY;
                this.this$0.updatePosition();
            }
        });
    }

    public float getHeightInPixels() {
        if (this.bannerAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get height of a null banner ad.");
            return -1.0f;
        }
        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.unity.ads.nextgen.UnityBannerAd$$ExternalSyntheticLambda4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m23138xa2e7759d();
            }
        });
        this.unityPlayerActivity.runOnUiThread(futureTask);
        try {
            return ((Integer) futureTask.get()).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e(PluginUtils.LOGTAG, String.format("Failed to get ad view height: %s", e.getLocalizedMessage()));
            return -1.0f;
        }
    }

    /* JADX INFO: renamed from: lambda$getHeightInPixels$0$com-google-unity-ads-nextgen-UnityBannerAd */
    /* synthetic */ Integer m23138xa2e7759d() throws Exception {
        return Integer.valueOf(this.bannerAd.getAdSize().getHeightInPixels(this.unityPlayerActivity));
    }

    public float getWidthInPixels() {
        if (this.bannerAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get width of a null banner ad.");
            return -1.0f;
        }
        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.unity.ads.nextgen.UnityBannerAd$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m23139xe4b292f0();
            }
        });
        this.unityPlayerActivity.runOnUiThread(futureTask);
        try {
            return ((Integer) futureTask.get()).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e(PluginUtils.LOGTAG, String.format("Failed to get ad view width: %s", e.getLocalizedMessage()));
            return -1.0f;
        }
    }

    /* JADX INFO: renamed from: lambda$getWidthInPixels$0$com-google-unity-ads-nextgen-UnityBannerAd */
    /* synthetic */ Integer m23139xe4b292f0() throws Exception {
        return Integer.valueOf(this.bannerAd.getAdSize().getWidthInPixels(this.unityPlayerActivity));
    }

    public boolean isCollapsible() {
        BannerAd bannerAd = this.bannerAd;
        if (bannerAd == null) {
            return false;
        }
        return bannerAd.isCollapsible();
    }

    public void destroy() {
        this.unityPlayerActivity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.nextgen.UnityBannerAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m44306lambda$destroy$0$comgoogleunityadsnextgenUnityBannerAd();
            }
        });
        this.unityPlayerActivity.getWindow().getDecorView().getRootView().removeOnLayoutChangeListener(this.layoutChangeListener);
    }

    /* JADX INFO: renamed from: lambda$destroy$0$com-google-unity-ads-nextgen-UnityBannerAd, reason: not valid java name */
    /* synthetic */ void m44306lambda$destroy$0$comgoogleunityadsnextgenUnityBannerAd() {
        if (this.bannerAd == null) {
            return;
        }
        FrameLayout frameLayout = this.bannerLayout;
        if (frameLayout != null) {
            frameLayout.removeView(this.adView);
        }
        this.bannerAd.destroy();
    }

    protected void setLayoutChangeListener() {
        this.layoutChangeListener = new View.OnLayoutChangeListener(this) { // from class: com.google.unity.ads.nextgen.UnityBannerAd.5
            final /* synthetic */ UnityBannerAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                if ((left == oldLeft && right == oldRight && bottom == oldBottom && top == oldTop) || this.this$0.hidden) {
                    return;
                }
                this.this$0.updatePosition();
            }
        };
        this.unityPlayerActivity.getWindow().getDecorView().getRootView().addOnLayoutChangeListener(this.layoutChangeListener);
    }

    protected FrameLayout.LayoutParams getLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = PluginUtils.getLayoutGravityForPositionCode(this.positionCode);
        Insets safeInsets = getSafeInsets();
        int i = safeInsets.left;
        int i2 = safeInsets.top;
        layoutParams.bottomMargin = safeInsets.bottom;
        layoutParams.rightMargin = safeInsets.right;
        if (this.positionCode == -1) {
            int iConvertDpToPixel = (int) PluginUtils.convertDpToPixel(this.horizontalOffset);
            if (iConvertDpToPixel >= i) {
                i = iConvertDpToPixel;
            }
            int iConvertDpToPixel2 = (int) PluginUtils.convertDpToPixel(this.verticalOffset);
            if (iConvertDpToPixel2 >= i2) {
                i2 = iConvertDpToPixel2;
            }
            layoutParams.leftMargin = i;
            layoutParams.topMargin = i2;
            return layoutParams;
        }
        layoutParams.leftMargin = i;
        int i3 = this.positionCode;
        if (i3 != 0 && i3 != 2 && i3 != 3) {
            return layoutParams;
        }
        layoutParams.topMargin = i2;
        return layoutParams;
    }

    private Insets getSafeInsets() {
        Window window;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        Insets insets = new Insets();
        if (Build.VERSION.SDK_INT < 28 || (window = this.unityPlayerActivity.getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            return insets;
        }
        insets.top = displayCutout.getSafeInsetTop();
        insets.left = displayCutout.getSafeInsetLeft();
        insets.bottom = displayCutout.getSafeInsetBottom();
        insets.right = displayCutout.getSafeInsetRight();
        return insets;
    }
}
