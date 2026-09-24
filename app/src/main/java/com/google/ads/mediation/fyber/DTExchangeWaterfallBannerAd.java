package com.google.ads.mediation.fyber;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.ironsource.C11495If;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: DTExchangeWaterfallBannerAd.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m43474d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001%B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0018\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u001c\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u001d\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u001e\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u001f\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\"\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010#\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010$\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000¨\u0006&"}, m43475d2 = {"Lcom/google/ads/mediation/fyber/DTExchangeWaterfallBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/fyber/inneractive/sdk/external/InneractiveAdSpot$RequestListener;", "Lcom/fyber/inneractive/sdk/external/InneractiveAdViewEventsListener;", "adLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "<init>", "(Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "bannerAdCallback", "requestedAdSize", "Lcom/google/android/gms/ads/AdSize;", "bannerSpot", "Lcom/fyber/inneractive/sdk/external/InneractiveAdSpot;", "bannerWrapperView", "Landroid/view/ViewGroup;", "loadAd", "", "adConfiguration", "Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;", "getView", "Landroid/view/View;", "onInneractiveSuccessfulAdRequest", "adSpot", "onInneractiveFailedAdRequest", "inneractiveErrorCode", "Lcom/fyber/inneractive/sdk/external/InneractiveErrorCode;", "onAdImpression", C11495If.f24687f, "onAdWillCloseInternalBrowser", "onAdWillOpenExternalApp", "onAdEnteredErrorState", "adDisplayError", "Lcom/fyber/inneractive/sdk/external/InneractiveUnitController$AdDisplayError;", "onAdExpanded", "onAdResized", "onAdCollapsed", "Companion", "dtexchange_release"}, m43476k = 1, m43477mv = {2, 1, 0}, m43479xi = 48)
public final class DTExchangeWaterfallBannerAd implements MediationBannerAd, InneractiveAdSpot.RequestListener, InneractiveAdViewEventsListener {
    private static final String TAG = Reflection.getOrCreateKotlinClass(DTExchangeWaterfallBannerAd.class).getSimpleName();
    private final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> adLoadCallback;
    private MediationBannerAdCallback bannerAdCallback;
    private InneractiveAdSpot bannerSpot;
    private ViewGroup bannerWrapperView;
    private AdSize requestedAdSize;

    public DTExchangeWaterfallBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> adLoadCallback) {
        Intrinsics.checkNotNullParameter(adLoadCallback, "adLoadCallback");
        this.adLoadCallback = adLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        ViewGroup viewGroup = this.bannerWrapperView;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerWrapperView");
            viewGroup = null;
        }
        return viewGroup;
    }

    public final void loadAd(final MediationBannerAdConfiguration adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        final Bundle serverParameters = adConfiguration.getServerParameters();
        Intrinsics.checkNotNullExpressionValue(serverParameters, "getServerParameters(...)");
        String string = serverParameters.getString("applicationId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", DTExchangeErrorCodes.ERROR_DOMAIN);
            Log.w(TAG, adError.toString());
            this.adLoadCallback.onFailure(adError);
        } else {
            InneractiveAdManager.setMediationName(FyberMediationAdapter.MEDIATOR_NAME);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(adConfiguration.getContext(), string, new OnFyberMarketplaceInitializedListener() { // from class: com.google.ads.mediation.fyber.DTExchangeWaterfallBannerAd.loadAd.1
                @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
                public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
                    Intrinsics.checkNotNullParameter(fyberInitStatus, "fyberInitStatus");
                    if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                        AdError adError2 = DTExchangeErrorCodes.getAdError(fyberInitStatus);
                        Log.w(DTExchangeWaterfallBannerAd.TAG, adError2.toString());
                        DTExchangeWaterfallBannerAd.this.adLoadCallback.onFailure(adError2);
                        return;
                    }
                    String string2 = serverParameters.getString("spotId");
                    if (TextUtils.isEmpty(string2)) {
                        AdError adError3 = new AdError(101, "Cannot render banner ad. Please define a valid spot id on the AdMob UI.", DTExchangeErrorCodes.ERROR_DOMAIN);
                        Log.w(DTExchangeWaterfallBannerAd.TAG, adError3.toString());
                        DTExchangeWaterfallBannerAd.this.adLoadCallback.onFailure(adError3);
                        return;
                    }
                    DTExchangeWaterfallBannerAd.this.bannerSpot = InneractiveAdSpotManager.get().createSpot();
                    InneractiveAdViewUnitController inneractiveAdViewUnitController = new InneractiveAdViewUnitController();
                    InneractiveAdSpot inneractiveAdSpot = DTExchangeWaterfallBannerAd.this.bannerSpot;
                    InneractiveAdSpot inneractiveAdSpot2 = null;
                    if (inneractiveAdSpot == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
                        inneractiveAdSpot = null;
                    }
                    inneractiveAdSpot.addUnitController(inneractiveAdViewUnitController);
                    DTExchangeWaterfallBannerAd.this.bannerWrapperView = new RelativeLayout(adConfiguration.getContext());
                    DTExchangeWaterfallBannerAd dTExchangeWaterfallBannerAd = DTExchangeWaterfallBannerAd.this;
                    DTExchangeWaterfallBannerAd dTExchangeWaterfallBannerAd2 = dTExchangeWaterfallBannerAd;
                    InneractiveAdSpot inneractiveAdSpot3 = dTExchangeWaterfallBannerAd.bannerSpot;
                    if (inneractiveAdSpot3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
                        inneractiveAdSpot3 = null;
                    }
                    inneractiveAdSpot3.setRequestListener(dTExchangeWaterfallBannerAd2);
                    DTExchangeWaterfallBannerAd.this.requestedAdSize = adConfiguration.getAdSize();
                    FyberAdapterUtils.updateFyberExtraParams(adConfiguration.getMediationExtras());
                    InneractiveAdRequest inneractiveAdRequest = new InneractiveAdRequest(string2);
                    InneractiveAdSpot inneractiveAdSpot4 = DTExchangeWaterfallBannerAd.this.bannerSpot;
                    if (inneractiveAdSpot4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
                    } else {
                        inneractiveAdSpot2 = inneractiveAdSpot4;
                    }
                    inneractiveAdSpot2.requestAd(inneractiveAdRequest);
                }
            });
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(InneractiveAdSpot adSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
        MediationBannerAdCallback mediationBannerAdCallback2 = this.bannerAdCallback;
        if (mediationBannerAdCallback2 != null) {
            mediationBannerAdCallback2.onAdOpened();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdCollapsed(InneractiveAdSpot adSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(InneractiveAdSpot adSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdExpanded(InneractiveAdSpot adSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(InneractiveAdSpot adSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdResized(InneractiveAdSpot adSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(InneractiveAdSpot adSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(InneractiveAdSpot adSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.bannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(InneractiveAdSpot adSpot, InneractiveErrorCode inneractiveErrorCode) {
        Intrinsics.checkNotNullParameter(inneractiveErrorCode, "inneractiveErrorCode");
        AdError adError = DTExchangeErrorCodes.getAdError(inneractiveErrorCode);
        Log.w(TAG, adError.toString());
        this.adLoadCallback.onFailure(adError);
        if (adSpot != null) {
            adSpot.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot adSpot) {
        InneractiveAdSpot inneractiveAdSpot = this.bannerSpot;
        InneractiveAdSpot inneractiveAdSpot2 = null;
        if (inneractiveAdSpot == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
            inneractiveAdSpot = null;
        }
        if (!(inneractiveAdSpot.getSelectedUnitController() instanceof InneractiveAdViewUnitController)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String name = InneractiveUnitController.class.getName();
            InneractiveAdSpot inneractiveAdSpot3 = this.bannerSpot;
            if (inneractiveAdSpot3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
                inneractiveAdSpot3 = null;
            }
            String str = String.format("Unexpected controller type. Expected: %s. Actual: %s", Arrays.copyOf(new Object[]{name, inneractiveAdSpot3.getSelectedUnitController().getClass().getName()}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            AdError adError = new AdError(105, str, DTExchangeErrorCodes.ERROR_DOMAIN);
            Log.w(TAG, adError.toString());
            this.adLoadCallback.onFailure(adError);
            InneractiveAdSpot inneractiveAdSpot4 = this.bannerSpot;
            if (inneractiveAdSpot4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
                inneractiveAdSpot4 = null;
            }
            inneractiveAdSpot4.destroy();
        }
        InneractiveAdSpot inneractiveAdSpot5 = this.bannerSpot;
        if (inneractiveAdSpot5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
            inneractiveAdSpot5 = null;
        }
        InneractiveUnitController selectedUnitController = inneractiveAdSpot5.getSelectedUnitController();
        Intrinsics.checkNotNull(selectedUnitController, "null cannot be cast to non-null type com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController");
        InneractiveAdViewUnitController inneractiveAdViewUnitController = (InneractiveAdViewUnitController) selectedUnitController;
        inneractiveAdViewUnitController.setEventsListener(this);
        ViewGroup viewGroup = this.bannerWrapperView;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerWrapperView");
            viewGroup = null;
        }
        inneractiveAdViewUnitController.bindView(viewGroup);
        ViewGroup viewGroup2 = this.bannerWrapperView;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerWrapperView");
            viewGroup2 = null;
        }
        Context context = viewGroup2.getContext();
        float f = context.getResources().getDisplayMetrics().density;
        int iRoundToInt = MathKt.roundToInt(inneractiveAdViewUnitController.getAdContentWidth() / f);
        int iRoundToInt2 = MathKt.roundToInt(inneractiveAdViewUnitController.getAdContentHeight() / f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AdSize(iRoundToInt, iRoundToInt2));
        AdSize adSize = this.requestedAdSize;
        if (adSize == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestedAdSize");
            adSize = null;
        }
        if (MediationUtils.findClosestSize(context, adSize, arrayList) != null) {
            this.bannerAdCallback = this.adLoadCallback.onSuccess(this);
            return;
        }
        AdSize adSize2 = this.requestedAdSize;
        if (adSize2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestedAdSize");
            adSize2 = null;
        }
        int iRoundToInt3 = MathKt.roundToInt(adSize2.getWidthInPixels(context) / f);
        AdSize adSize3 = this.requestedAdSize;
        if (adSize3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestedAdSize");
            adSize3 = null;
        }
        int iRoundToInt4 = MathKt.roundToInt(adSize3.getHeightInPixels(context) / f);
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format("The loaded ad size did not match the requested ad size. Requested ad size: %dx%d. Loaded ad size: %dx%d.", Arrays.copyOf(new Object[]{Integer.valueOf(iRoundToInt3), Integer.valueOf(iRoundToInt4), Integer.valueOf(iRoundToInt), Integer.valueOf(iRoundToInt2)}, 4));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        AdError adError2 = new AdError(103, str2, DTExchangeErrorCodes.ERROR_DOMAIN);
        Log.w(TAG, adError2.toString());
        this.adLoadCallback.onFailure(adError2);
        InneractiveAdSpot inneractiveAdSpot6 = this.bannerSpot;
        if (inneractiveAdSpot6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerSpot");
        } else {
            inneractiveAdSpot2 = inneractiveAdSpot6;
        }
        inneractiveAdSpot2.destroy();
    }
}
