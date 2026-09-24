package com.vungle.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.ironsource.C12148d8;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.BannerAdImpl;
import com.vungle.ads.internal.ImpressionTracker;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.p298ui.VungleWebClient;
import com.vungle.ads.internal.p298ui.WatermarkView;
import com.vungle.ads.internal.p298ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.RingerModeReceiver;
import com.vungle.ads.internal.util.ThreadUtil;
import com.vungle.ads.internal.util.ViewUtility;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleBannerView.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0001]B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010A\u001a\u00020BH\u0002J\u0006\u0010C\u001a\u00020BJ\u0010\u0010D\u001a\u00020B2\u0006\u0010E\u001a\u000205H\u0002J\u0006\u0010F\u001a\u00020\bJ\u000e\u0010G\u001a\u00020B2\u0006\u0010H\u001a\u00020IJ\u0012\u0010G\u001a\u00020B2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0006J\b\u0010K\u001a\u00020BH\u0002J\b\u0010L\u001a\u00020BH\u0002J\b\u0010M\u001a\u00020BH\u0014J\u0010\u0010N\u001a\u00020B2\u0006\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020BH\u0014J\u0010\u0010R\u001a\u00020B2\u0006\u0010S\u001a\u00020!H\u0014J\b\u0010T\u001a\u00020BH\u0002J\u0010\u0010U\u001a\u00020B2\u0006\u0010V\u001a\u000205H\u0002J \u0010W\u001a\u00020B2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\bH\u0002R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010#\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b$\u0010\u001dR\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010'\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010\u001dR\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u000e\u00101\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u001dR\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006^²\u0006\n\u0010_\u001a\u00020`X\u008a\u0084\u0002²\u0006\n\u0010a\u001a\u00020bX\u008a\u0084\u0002²\u0006\n\u0010c\u001a\u00020dX\u008a\u0084\u0002"}, m43475d2 = {"Lcom/vungle/ads/VungleBannerView;", "Landroid/widget/RelativeLayout;", "Lcom/vungle/ads/VungleAdType;", "context", "Landroid/content/Context;", "placementId", "", C11744X3.i.f26343O, "Lcom/vungle/ads/VungleAdSize;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/VungleAdSize;)V", "adConfig", "Lcom/vungle/ads/AdConfig;", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "adListener", "Lcom/vungle/ads/BannerAdListener;", "getAdListener", "()Lcom/vungle/ads/BannerAdListener;", "setAdListener", "(Lcom/vungle/ads/BannerAdListener;)V", "getAdSize", "()Lcom/vungle/ads/VungleAdSize;", "adViewImpl", "Lcom/vungle/ads/internal/BannerAdImpl;", "adWidget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "value", "adapterAdFormat", "getAdapterAdFormat", "()Ljava/lang/String;", "setAdapterAdFormat", "(Ljava/lang/String;)V", "calculatedPixelHeight", "", "calculatedPixelWidth", "creativeId", "getCreativeId", "destroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "eventId", "getEventId", "imageView", "Lcom/vungle/ads/internal/ui/WatermarkView;", "impressionTracker", "Lcom/vungle/ads/internal/ImpressionTracker;", "getImpressionTracker", "()Lcom/vungle/ads/internal/ImpressionTracker;", "impressionTracker$delegate", "Lkotlin/Lazy;", "isAdAttachedToWindow", "isAdDownloaded", "isInvisibleLogged", "isOnImpressionCalled", "", "isReceiverRegistered", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "getPlacementId", "presenter", "Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "presenterStarted", "ringerModeReceiver", "Lcom/vungle/ads/internal/util/RingerModeReceiver;", "checkHardwareAcceleration", "", "finishAd", "finishAdInternal", "isFinishedByApi", "getAdViewSize", "load", "csbData", "Lcom/vungle/ads/VungleCSBData;", "adMarkup", "logViewInvisibleOnPlay", "logViewVisibleOnPlay", "onAttachedToWindow", "onBannerAdLoaded", "baseAd", "Lcom/vungle/ads/BaseAd;", "onDetachedFromWindow", "onWindowVisibilityChanged", "visibility", "renderAd", "setAdVisibility", C12148d8.f30227k, "willPresentAdView", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "fixedAdSize", "Companion", "vungle-ads_release", "executors", "Lcom/vungle/ads/internal/executor/Executors;", "omTrackerFactory", "Lcom/vungle/ads/internal/omsdk/OMTracker$Factory;", C11540L6.f24917H, "Lcom/vungle/ads/internal/platform/Platform;"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public final class VungleBannerView extends RelativeLayout implements VungleAdType {
    private static final String TAG = "VungleBannerView";
    private BannerAdListener adListener;
    private final VungleAdSize adSize;
    private final BannerAdImpl adViewImpl;
    private MRAIDAdWidget adWidget;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    private final AtomicBoolean destroyed;
    private WatermarkView imageView;

    /* JADX INFO: renamed from: impressionTracker$delegate, reason: from kotlin metadata */
    private final Lazy impressionTracker;
    private final AtomicBoolean isAdAttachedToWindow;
    private final AtomicBoolean isAdDownloaded;
    private final AtomicBoolean isInvisibleLogged;
    private boolean isOnImpressionCalled;
    private boolean isReceiverRegistered;
    private final String placementId;
    private MRAIDPresenter presenter;
    private final AtomicBoolean presenterStarted;
    private final RingerModeReceiver ringerModeReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleBannerView(final Context context, String placementId, VungleAdSize adSize) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.placementId = placementId;
        this.adSize = adSize;
        this.ringerModeReceiver = new RingerModeReceiver();
        BannerAdImpl bannerAdImpl = new BannerAdImpl(context, placementId, adSize, new AdConfig());
        this.adViewImpl = bannerAdImpl;
        this.destroyed = new AtomicBoolean(false);
        this.presenterStarted = new AtomicBoolean(false);
        this.isAdDownloaded = new AtomicBoolean(false);
        this.isAdAttachedToWindow = new AtomicBoolean(false);
        this.isInvisibleLogged = new AtomicBoolean(false);
        this.impressionTracker = LazyKt.lazy(new Function0<ImpressionTracker>() { // from class: com.vungle.ads.VungleBannerView$impressionTracker$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ImpressionTracker invoke() {
                return new ImpressionTracker(context);
            }
        });
        bannerAdImpl.setAdListener(new BannerAdListener() { // from class: com.vungle.ads.VungleBannerView.1
            @Override // com.vungle.ads.BaseAdListener
            public void onAdClicked(BaseAd baseAd) {
                Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdClicked(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdEnd(BaseAd baseAd) {
                Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdEnd(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdFailedToLoad(BaseAd baseAd, VungleError adError) {
                Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                Intrinsics.checkNotNullParameter(adError, "adError");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToLoad(baseAd, adError);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdFailedToPlay(BaseAd baseAd, VungleError adError) {
                Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                Intrinsics.checkNotNullParameter(adError, "adError");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToPlay(baseAd, adError);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdImpression(BaseAd baseAd) {
                Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdImpression(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdLeftApplication(BaseAd baseAd) {
                Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdLeftApplication(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdLoaded(BaseAd baseAd) throws Throwable {
                Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                VungleBannerView.this.onBannerAdLoaded(baseAd);
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdStart(BaseAd baseAd) {
                Intrinsics.checkNotNullParameter(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdStart(baseAd);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkHardwareAcceleration() throws Throwable {
        Logger.INSTANCE.m43471w(TAG, "hardwareAccelerated = " + isHardwareAccelerated());
        if (isHardwareAccelerated()) {
            return;
        }
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.HARDWARE_ACCELERATE_DISABLED, 0L, this.adViewImpl.getLogEntry(), null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAdInternal(boolean isFinishedByApi) {
        if (this.destroyed.get()) {
            return;
        }
        this.destroyed.set(true);
        int i = (isFinishedByApi ? 4 : 0) | 2;
        MRAIDPresenter mRAIDPresenter = this.presenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.stop();
        }
        MRAIDPresenter mRAIDPresenter2 = this.presenter;
        if (mRAIDPresenter2 != null) {
            mRAIDPresenter2.detach(i);
        }
        getImpressionTracker().destroy();
        try {
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this);
            }
            removeAllViews();
        } catch (Exception e) {
            Logger.INSTANCE.m43467d(TAG, "Removing webView error: " + e);
        }
    }

    private final ImpressionTracker getImpressionTracker() {
        return (ImpressionTracker) this.impressionTracker.getValue();
    }

    public static /* synthetic */ void load$default(VungleBannerView vungleBannerView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        vungleBannerView.load(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewInvisibleOnPlay() throws Throwable {
        if (this.isInvisibleLogged.getAndSet(true)) {
            return;
        }
        Logger.INSTANCE.m43467d(TAG, "ImpressionTracker checked the banner view invisible on play, log AD_VISIBILITY_INVISIBLE. " + hashCode());
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(1L);
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, this.adViewImpl.getLogEntry(), (String) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() throws Throwable {
        long j = this.isInvisibleLogged.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(Long.valueOf(j));
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, this.adViewImpl.getLogEntry(), (String) null, 4, (Object) null);
        Logger.INSTANCE.m43467d(TAG, "Log metric AD_VISIBILITY: " + j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBannerAdLoaded(BaseAd baseAd) throws Throwable {
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), this.adViewImpl.getLogEntry(), (String) null, 4, (Object) null);
        this.adViewImpl.getResponseToShowMetric().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.adViewImpl.getResponseToShowMetric(), this.adViewImpl.getLogEntry(), (String) null, 4, (Object) null);
        this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric().markStart();
        this.adViewImpl.getShowToCloseMetric().markStart();
        this.adViewImpl.getShowToFailMetric().markStart();
        VungleError vungleErrorCanPlayAd = this.adViewImpl.getAdInternal$vungle_ads_release().canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            if (this.adViewImpl.getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                this.adViewImpl.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
            }
            BannerAdListener bannerAdListener = this.adListener;
            if (bannerAdListener != null) {
                bannerAdListener.onAdFailedToPlay(baseAd, vungleErrorCanPlayAd);
                return;
            }
            return;
        }
        AdPayload advertisement = this.adViewImpl.getAdInternal$vungle_ads_release().getAdvertisement();
        Placement placement = this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement();
        if (advertisement == null || placement == null) {
            BannerAdListener bannerAdListener2 = this.adListener;
            if (bannerAdListener2 != null) {
                bannerAdListener2.onAdFailedToPlay(baseAd, new AdNotLoadedCantPlay("Ad or Placement is null").setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry()).logError$vungle_ads_release());
                return;
            }
            return;
        }
        this.adViewImpl.getAdInternal$vungle_ads_release().cancelDownload$vungle_ads_release();
        this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric(), this.adViewImpl.getLogEntry(), (String) null, 4, (Object) null);
        this.adViewImpl.getAdInternal$vungle_ads_release().getValidationToPresentMetric().markStart();
        try {
            willPresentAdView(advertisement, placement, getAdViewSize());
            this.isAdDownloaded.set(true);
            BannerAdListener bannerAdListener3 = this.adListener;
            if (bannerAdListener3 != null) {
                bannerAdListener3.onAdLoaded(baseAd);
            }
            renderAd();
        } catch (InstantiationException unused) {
        }
    }

    private final void renderAd() {
        if (this.destroyed.get()) {
            Logger.INSTANCE.m43471w(TAG, "renderAd() - destroyed");
            return;
        }
        if (!this.isAdDownloaded.get()) {
            Logger.INSTANCE.m43467d(TAG, "renderAd() - not ready: not downloaded.");
            return;
        }
        if (!this.isAdAttachedToWindow.get()) {
            Logger.INSTANCE.m43467d(TAG, "renderAd() - not ready: not attached.");
            return;
        }
        if (!this.presenterStarted.getAndSet(true)) {
            MRAIDPresenter mRAIDPresenter = this.presenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.prepare();
            }
            getImpressionTracker().addView(this, new ImpressionTracker.ImpressionListener() { // from class: com.vungle.ads.VungleBannerView.renderAd.1
                @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
                public void onImpression(View view) throws Throwable {
                    Logger.INSTANCE.m43467d(VungleBannerView.TAG, "ImpressionTracker checked the banner view become visible.");
                    VungleBannerView.this.isOnImpressionCalled = true;
                    VungleBannerView.this.logViewVisibleOnPlay();
                    VungleBannerView.this.checkHardwareAcceleration();
                    MRAIDPresenter mRAIDPresenter2 = VungleBannerView.this.presenter;
                    if (mRAIDPresenter2 != null) {
                        mRAIDPresenter2.start();
                    }
                }

                @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
                public void onViewInvisible(View view) throws Throwable {
                    VungleBannerView.this.logViewInvisibleOnPlay();
                }
            });
        }
        MRAIDAdWidget mRAIDAdWidget = this.adWidget;
        if (mRAIDAdWidget != null && !Intrinsics.areEqual(mRAIDAdWidget.getParent(), this)) {
            ViewParent parent = mRAIDAdWidget.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(mRAIDAdWidget);
            }
            addView(mRAIDAdWidget, this.calculatedPixelWidth, this.calculatedPixelHeight);
        }
        WatermarkView watermarkView = this.imageView;
        if (watermarkView != null && !Intrinsics.areEqual(watermarkView.getParent(), this)) {
            ViewParent parent2 = watermarkView.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(watermarkView);
            }
            addView(watermarkView, this.calculatedPixelWidth, this.calculatedPixelHeight);
            watermarkView.bringToFront();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.calculatedPixelHeight;
            layoutParams.width = this.calculatedPixelWidth;
            requestLayout();
        }
    }

    private final void setAdVisibility(boolean isVisible) {
        MRAIDPresenter mRAIDPresenter;
        if (!this.isOnImpressionCalled || this.destroyed.get() || (mRAIDPresenter = this.presenter) == null) {
            return;
        }
        mRAIDPresenter.setAdVisibility(isVisible);
    }

    private final void willPresentAdView(AdPayload advertisement, Placement placement, VungleAdSize fixedAdSize) throws InstantiationException {
        ViewUtility viewUtility = ViewUtility.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.calculatedPixelHeight = viewUtility.dpToPixels(context, fixedAdSize.getHeight());
        ViewUtility viewUtility2 = ViewUtility.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.calculatedPixelWidth = viewUtility2.dpToPixels(context2, fixedAdSize.getWidth());
        final AdPlayCallbackWrapper adPlayCallback$vungle_ads_release = this.adViewImpl.getAdPlayCallback();
        final Placement placement2 = this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement();
        AdEventListener adEventListener = new AdEventListener(adPlayCallback$vungle_ads_release, placement2) { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$adEventListener$1
            {
                super(adPlayCallback$vungle_ads_release, placement2);
            }
        };
        try {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            MRAIDAdWidget mRAIDAdWidget = new MRAIDAdWidget(context3, advertisement.eventId());
            this.adWidget = mRAIDAdWidget;
            mRAIDAdWidget.setCloseDelegate(new MRAIDAdWidget.CloseDelegate() { // from class: com.vungle.ads.VungleBannerView.willPresentAdView.1
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate
                public void close() {
                    VungleBannerView.this.finishAdInternal(false);
                }
            });
            mRAIDAdWidget.setOnViewTouchListener(new MRAIDAdWidget.OnViewTouchListener() { // from class: com.vungle.ads.VungleBannerView.willPresentAdView.2
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener
                public boolean onTouch(MotionEvent event) {
                    MRAIDPresenter mRAIDPresenter = VungleBannerView.this.presenter;
                    if (mRAIDPresenter == null) {
                        return false;
                    }
                    mRAIDPresenter.onViewTouched(event);
                    return false;
                }
            });
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            final Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Executors>() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Executors invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context4).getService(Executors.class);
                }
            });
            ServiceLocator.Companion companion2 = ServiceLocator.INSTANCE;
            final Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "context");
            OMTracker oMTrackerMake = m44748willPresentAdView$lambda6(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<OMTracker.Factory>() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMTracker$Factory, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final OMTracker.Factory invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context5).getService(OMTracker.Factory.class);
                }
            })).make(advertisement.omEnabled());
            ServiceLocator.Companion companion3 = ServiceLocator.INSTANCE;
            final Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "context");
            Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Platform>() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Platform invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context6).getService(Platform.class);
                }
            });
            VungleWebClient orCreateWebViewClient = WebViewManager.INSTANCE.getOrCreateWebViewClient(advertisement, placement, m44747willPresentAdView$lambda5(lazy).getOFFLOAD_EXECUTOR(), m44749willPresentAdView$lambda7(lazy2));
            this.ringerModeReceiver.setListener(orCreateWebViewClient);
            orCreateWebViewClient.setWebViewObserver(oMTrackerMake);
            MRAIDPresenter mRAIDPresenter = new MRAIDPresenter(mRAIDAdWidget, advertisement, placement, orCreateWebViewClient, m44747willPresentAdView$lambda5(lazy).getJOB_EXECUTOR(), oMTrackerMake, m44749willPresentAdView$lambda7(lazy2));
            mRAIDPresenter.setEventListener(adEventListener);
            this.presenter = mRAIDPresenter;
            String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                Context context7 = getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "context");
                this.imageView = new WatermarkView(context7, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e) {
            adEventListener.onError(new AdCantPlayWithoutWebView(e.getMessage()).setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry()).logError$vungle_ads_release(), this.placementId);
            throw e;
        }
    }

    /* JADX INFO: renamed from: willPresentAdView$lambda-5, reason: not valid java name */
    private static final Executors m44747willPresentAdView$lambda5(Lazy<? extends Executors> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: willPresentAdView$lambda-6, reason: not valid java name */
    private static final OMTracker.Factory m44748willPresentAdView$lambda6(Lazy<OMTracker.Factory> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: willPresentAdView$lambda-7, reason: not valid java name */
    private static final Platform m44749willPresentAdView$lambda7(Lazy<? extends Platform> lazy) {
        return lazy.getValue();
    }

    public final void finishAd() {
        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.VungleBannerView.finishAd.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                VungleBannerView.this.finishAdInternal(true);
            }
        });
    }

    public final AdConfig getAdConfig() {
        return this.adViewImpl.getAdConfig();
    }

    public final BannerAdListener getAdListener() {
        return this.adListener;
    }

    public final VungleAdSize getAdSize() {
        return this.adSize;
    }

    public final VungleAdSize getAdViewSize() {
        return this.adViewImpl.getAdViewSize();
    }

    @Override // com.vungle.ads.VungleAdType
    public String getAdapterAdFormat() {
        return this.adViewImpl.getAdapterAdFormat();
    }

    public final String getCreativeId() {
        return this.adViewImpl.getCreativeId();
    }

    public final String getEventId() {
        return this.adViewImpl.getEventId();
    }

    public final LogEntry getLogEntry$vungle_ads_release() {
        return this.adViewImpl.getLogEntry();
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final void load(VungleCSBData csbData) {
        Intrinsics.checkNotNullParameter(csbData, "csbData");
        this.adViewImpl.load(csbData);
    }

    public final void load(String adMarkup) {
        this.adViewImpl.load(adMarkup);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.INSTANCE.m43467d(TAG, "onAttachedToWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(true);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            try {
                if (!this.isReceiverRegistered) {
                    getContext().registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                    this.isReceiverRegistered = true;
                    Logger.INSTANCE.m43467d(TAG, "registerReceiver(): " + this.ringerModeReceiver.hashCode());
                }
            } catch (Exception e) {
                Logger.INSTANCE.m43468e(TAG, "registerReceiver error: " + e.getLocalizedMessage());
            }
        }
        renderAd();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Logger.INSTANCE.m43467d(TAG, "onDetachedFromWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(false);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            try {
                if (this.isReceiverRegistered) {
                    getContext().unregisterReceiver(this.ringerModeReceiver);
                    this.isReceiverRegistered = false;
                }
            } catch (Exception e) {
                Logger.INSTANCE.m43468e(TAG, "unregisterReceiver error: " + e.getLocalizedMessage());
            }
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        setAdVisibility(visibility == 0);
    }

    public final void setAdListener(BannerAdListener bannerAdListener) {
        this.adListener = bannerAdListener;
    }

    @Override // com.vungle.ads.VungleAdType
    public void setAdapterAdFormat(String str) {
        this.adViewImpl.setAdapterAdFormat(str);
    }
}
