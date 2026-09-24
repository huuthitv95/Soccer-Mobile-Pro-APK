package com.google.ads.mediation.fyber;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.share.internal.ShareConstants;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.external.NativeAdEventsListener;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.external.NativeAdVideoContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DTExchangeNativeAdMapper.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m43474d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ8\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u001a\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bH\u0002J\b\u0010!\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m43475d2 = {"Lcom/google/ads/mediation/fyber/DTExchangeNativeAdMapper;", "Lcom/google/android/gms/ads/mediation/NativeAdMapper;", "adLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationNativeAdCallback;", "<init>", "(Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "mediationNativeAdCallback", "nativeAdSpot", "Lcom/fyber/inneractive/sdk/external/InneractiveAdSpot;", "adContent", "Lcom/fyber/inneractive/sdk/external/NativeAdContent;", "loadAd", "", "mediationNativeAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationNativeAdConfiguration;", "trackViews", "containerView", "Landroid/view/View;", "clickableAssetViews", "", "", "nonClickableAssetViews", "mapAssetNameToViewTag", "nativeAdAssetName", "reportErrorAndDestroy", "message", "errorCode", "Lcom/fyber/inneractive/sdk/external/InneractiveErrorCode;", "mapNativeAd", "context", "Landroid/content/Context;", "nativeAdContent", "destroy", "NativeMappedImage", "Companion", "dtexchange_release"}, m43476k = 1, m43477mv = {2, 1, 0}, m43479xi = 48)
public final class DTExchangeNativeAdMapper extends NativeAdMapper {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "DTExchangeNativeAdMapper";
    private NativeAdContent adContent;
    private final MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> adLoadCallback;
    private MediationNativeAdCallback mediationNativeAdCallback;
    private InneractiveAdSpot nativeAdSpot;

    /* JADX INFO: compiled from: DTExchangeNativeAdMapper.kt */
    @Metadata(m43474d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m43475d2 = {"Lcom/google/ads/mediation/fyber/DTExchangeNativeAdMapper$Companion;", "", "<init>", "()V", "TAG", "", "dtexchange_release"}, m43476k = 1, m43477mv = {2, 1, 0}, m43479xi = 48)
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: DTExchangeNativeAdMapper.kt */
    @Metadata(m43474d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m43475d2 = {"Lcom/google/ads/mediation/fyber/DTExchangeNativeAdMapper$NativeMappedImage;", "Lcom/google/android/gms/ads/nativead/NativeAd$Image;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getDrawable", "", "getUri", "getScale", "", "dtexchange_release"}, m43476k = 1, m43477mv = {2, 1, 0}, m43479xi = 48)
    public static final class NativeMappedImage extends NativeAd.Image {
        private final Uri uri;

        public NativeMappedImage(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public /* bridge */ /* synthetic */ Drawable getDrawable() {
            return (Drawable) m44021getDrawable();
        }

        /* JADX INFO: renamed from: getDrawable, reason: collision with other method in class */
        public Void m44021getDrawable() {
            return null;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public Uri getUri() {
            return this.uri;
        }
    }

    public DTExchangeNativeAdMapper(MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> adLoadCallback) {
        Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
        this.adLoadCallback = adLoadCallback;
    }

    private final String mapAssetNameToViewTag(String nativeAdAssetName) {
        int iHashCode = nativeAdAssetName.hashCode();
        if (iHashCode == 1567014) {
            return !nativeAdAssetName.equals("3009") ? NativeAdContent.ViewTag.OTHER : NativeAdContent.ViewTag.RATING;
        }
        switch (iHashCode) {
            case 1567006:
                return !nativeAdAssetName.equals("3001") ? NativeAdContent.ViewTag.OTHER : "TITLE";
            case 1567007:
                return !nativeAdAssetName.equals("3002") ? NativeAdContent.ViewTag.OTHER : NativeAdContent.ViewTag.CTA;
            case 1567008:
                return !nativeAdAssetName.equals("3003") ? NativeAdContent.ViewTag.OTHER : NativeAdContent.ViewTag.AD_ICON;
            case 1567009:
                return !nativeAdAssetName.equals("3004") ? NativeAdContent.ViewTag.OTHER : "DESCRIPTION";
            default:
                return NativeAdContent.ViewTag.OTHER;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mapNativeAd(Context context, NativeAdContent nativeAdContent) {
        nativeAdContent.bindMediaView(new MediaView(context));
        this.adContent = nativeAdContent;
        String adTitle = nativeAdContent.getAdTitle();
        if (adTitle != null) {
            setHeadline(adTitle);
        }
        String adDescription = nativeAdContent.getAdDescription();
        if (adDescription != null) {
            setBody(adDescription);
        }
        Uri appIcon = nativeAdContent.getAppIcon();
        if (appIcon != null) {
            setIcon(new NativeMappedImage(appIcon));
        }
        String adCallToAction = nativeAdContent.getAdCallToAction();
        if (adCallToAction != null) {
            setCallToAction(adCallToAction);
        }
        MediaView mediaView = nativeAdContent.getMediaView();
        if (mediaView != null) {
            setMediaView(mediaView);
        }
        Float rating = nativeAdContent.getRating();
        if (rating != null) {
            setStarRating(Double.valueOf(rating.floatValue()));
        }
        Float mediaAspectRatio = nativeAdContent.getMediaAspectRatio();
        if (mediaAspectRatio != null) {
            setMediaContentAspectRatio(mediaAspectRatio.floatValue());
        }
        setOverrideClickHandling(true);
        setOverrideImpressionRecording(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportErrorAndDestroy(String message, InneractiveErrorCode errorCode) {
        Log.e(TAG, message);
        MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback = this.adLoadCallback;
        if (errorCode == null) {
            errorCode = InneractiveErrorCode.SDK_INTERNAL_ERROR;
        }
        mediationAdLoadCallback.onFailure(DTExchangeErrorCodes.getAdError(errorCode));
        InneractiveAdSpot inneractiveAdSpot = this.nativeAdSpot;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        this.nativeAdSpot = null;
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void destroy() {
        super.destroy();
        InneractiveAdSpot inneractiveAdSpot = this.nativeAdSpot;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        this.nativeAdSpot = null;
        NativeAdContent nativeAdContent = this.adContent;
        if (nativeAdContent != null) {
            nativeAdContent.destroy();
        }
        this.adContent = null;
        this.mediationNativeAdCallback = null;
    }

    public final void loadAd(final MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        Intrinsics.checkNotNullParameter(mediationNativeAdConfiguration, "mediationNativeAdConfiguration");
        InneractiveAdManager.setMediationName(FyberMediationAdapter.MEDIATOR_NAME);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        String bidResponse = mediationNativeAdConfiguration.getBidResponse();
        Intrinsics.checkNotNullExpressionValue(bidResponse, "getBidResponse(...)");
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        NativeAdUnitController nativeAdUnitControllerCreateNativeAdUnitController = FyberFactory.createNativeAdUnitController();
        NativeAdVideoContentController nativeAdVideoContentControllerCreateNativeAdVideoContentController = FyberFactory.createNativeAdVideoContentController();
        nativeAdVideoContentControllerCreateNativeAdVideoContentController.setEventsListener(new VideoContentListener() { // from class: com.google.ads.mediation.fyber.DTExchangeNativeAdMapper$loadAd$1$1
            @Override // com.fyber.inneractive.sdk.external.VideoContentListener
            public void onCompleted() {
                MediationNativeAdCallback mediationNativeAdCallback = this.this$0.mediationNativeAdCallback;
                if (mediationNativeAdCallback != null) {
                    mediationNativeAdCallback.onVideoComplete();
                }
            }

            @Override // com.fyber.inneractive.sdk.external.VideoContentListener
            @Deprecated(message = "Deprecated in Java")
            public void onPlayerError() {
            }

            @Override // com.fyber.inneractive.sdk.external.VideoContentListener
            public void onProgress(int totalDurationInMsec, int positionInMsec) {
            }
        });
        nativeAdUnitControllerCreateNativeAdUnitController.addContentController(nativeAdVideoContentControllerCreateNativeAdVideoContentController);
        nativeAdUnitControllerCreateNativeAdUnitController.setEventsListener(new NativeAdEventsListener() { // from class: com.google.ads.mediation.fyber.DTExchangeNativeAdMapper$loadAd$1$2
            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdClicked(InneractiveAdSpot adSpot) {
                Intrinsics.checkNotNullParameter(adSpot, "adSpot");
                MediationNativeAdCallback mediationNativeAdCallback = this.this$0.mediationNativeAdCallback;
                if (mediationNativeAdCallback != null) {
                    mediationNativeAdCallback.reportAdClicked();
                }
                MediationNativeAdCallback mediationNativeAdCallback2 = this.this$0.mediationNativeAdCallback;
                if (mediationNativeAdCallback2 != null) {
                    mediationNativeAdCallback2.onAdOpened();
                }
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdImpression(InneractiveAdSpot adSpot) {
                Intrinsics.checkNotNullParameter(adSpot, "adSpot");
                MediationNativeAdCallback mediationNativeAdCallback = this.this$0.mediationNativeAdCallback;
                if (mediationNativeAdCallback != null) {
                    mediationNativeAdCallback.onAdOpened();
                }
                MediationNativeAdCallback mediationNativeAdCallback2 = this.this$0.mediationNativeAdCallback;
                if (mediationNativeAdCallback2 != null) {
                    mediationNativeAdCallback2.reportAdImpression();
                }
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillCloseInternalBrowser(InneractiveAdSpot adSpot) {
                Intrinsics.checkNotNullParameter(adSpot, "adSpot");
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillOpenExternalApp(InneractiveAdSpot adSpot) {
                Intrinsics.checkNotNullParameter(adSpot, "adSpot");
                MediationNativeAdCallback mediationNativeAdCallback = this.this$0.mediationNativeAdCallback;
                if (mediationNativeAdCallback != null) {
                    mediationNativeAdCallback.onAdLeftApplication();
                }
            }
        });
        inneractiveAdSpotCreateSpot.addUnitController(nativeAdUnitControllerCreateNativeAdUnitController);
        inneractiveAdSpotCreateSpot.setRequestListener(new InneractiveAdSpot.NativeAdRequestListener() { // from class: com.google.ads.mediation.fyber.DTExchangeNativeAdMapper$loadAd$1$3
            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveFailedAdRequest(InneractiveAdSpot adSpot, InneractiveErrorCode errorCode) {
                this.this$0.reportErrorAndDestroy("onInneractiveFailedAdRequest error: " + errorCode, errorCode);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.NativeAdRequestListener
            public void onInneractiveSuccessfulNativeAdRequest(InneractiveAdSpot adSpot, NativeAdContent content) {
                if (content == null) {
                    this.this$0.reportErrorAndDestroy("content is NOT NativeAdContent", InneractiveErrorCode.SDK_INTERNAL_ERROR);
                    return;
                }
                DTExchangeNativeAdMapper dTExchangeNativeAdMapper = this.this$0;
                Context context = mediationNativeAdConfiguration.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                dTExchangeNativeAdMapper.mapNativeAd(context, content);
                DTExchangeNativeAdMapper dTExchangeNativeAdMapper2 = this.this$0;
                dTExchangeNativeAdMapper2.mediationNativeAdCallback = (MediationNativeAdCallback) dTExchangeNativeAdMapper2.adLoadCallback.onSuccess(this.this$0);
            }
        });
        FyberAdapterUtils.updateFyberExtraParams(mediationNativeAdConfiguration.getMediationExtras());
        inneractiveAdSpotCreateSpot.loadAd(bidResponse);
        this.nativeAdSpot = inneractiveAdSpotCreateSpot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void trackViews(View containerView, Map<String, ? extends View> clickableAssetViews, Map<String, ? extends View> nonClickableAssetViews) {
        MediaView mediaView;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(clickableAssetViews, "clickableAssetViews");
        Intrinsics.checkNotNullParameter(nonClickableAssetViews, "nonClickableAssetViews");
        containerView.setTag(NativeAdContent.ViewTag.ROOT);
        NativeAdContent nativeAdContent = this.adContent;
        if (nativeAdContent != null && (mediaView = nativeAdContent.getMediaView()) != null) {
            mediaView.setTag(NativeAdContent.ViewTag.MEDIA_VIEW);
        }
        for (Map.Entry<String, ? extends View> entry : clickableAssetViews.entrySet()) {
            entry.getValue().setTag(mapAssetNameToViewTag(entry.getKey()));
        }
        NativeAdContent nativeAdContent2 = this.adContent;
        if (nativeAdContent2 != 0) {
            nativeAdContent2.registerViewsForInteraction((ViewGroup) containerView, nativeAdContent2 != 0 ? nativeAdContent2.getMediaView() : null, null, clickableAssetViews.values());
        }
    }
}
