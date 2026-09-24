package com.unity3d.services.banners.bridge;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.unity3d.ads.BannerShowListenerWithOnFailedToShow;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.ads.operation.load.LoadBannerModule;
import com.unity3d.services.ads.operation.load.LoadBannerOperationState;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.p295di.IServiceProvider;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInvoker;
import gatewayprotocol.p299v1.ErrorOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: BannerBridge.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001$B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J.\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J,\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J:\u0010\u001a\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0007J\u001a\u0010\"\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010#\u001a\u00020\u001cH\u0007¨\u0006%"}, m43475d2 = {"Lcom/unity3d/services/banners/bridge/BannerBridge;", "", "()V", "destroy", "", "bannerAdId", "", "didAttach", "didAttachScarBanner", "didDestroy", "didDetach", "didDetachScarBanner", "didLoad", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "", "data", "Lorg/json/JSONObject;", "load", "placementId", "bannerSize", "Lcom/unity3d/services/banners/UnityBannerSize;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "onBannerLoaded", "bannerAdView", "Lcom/unity3d/services/banners/BannerView;", "resize", "left", "", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "alpha", "", "visibilityChanged", "visibility", "BannerEvent", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class BannerBridge {
    public static final BannerBridge INSTANCE = new BannerBridge();

    /* JADX INFO: compiled from: BannerBridge.kt */
    @Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m43475d2 = {"Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "", "(Ljava/lang/String;I)V", "BANNER_VISIBILITY_CHANGED", "BANNER_RESIZED", "BANNER_LOADED", "BANNER_DESTROYED", "BANNER_ATTACHED", "BANNER_DETACHED", "BANNER_LOAD_PLACEMENT", "BANNER_DESTROY_BANNER", "SCAR_BANNER_LOADED", "SCAR_BANNER_LOAD_FAILED", "SCAR_BANNER_ATTACHED", "SCAR_BANNER_DETACHED", "SCAR_BANNER_OPENED", "SCAR_BANNER_CLOSED", "SCAR_BANNER_IMPRESSION", "SCAR_BANNER_CLICKED", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public enum BannerEvent {
        BANNER_VISIBILITY_CHANGED,
        BANNER_RESIZED,
        BANNER_LOADED,
        BANNER_DESTROYED,
        BANNER_ATTACHED,
        BANNER_DETACHED,
        BANNER_LOAD_PLACEMENT,
        BANNER_DESTROY_BANNER,
        SCAR_BANNER_LOADED,
        SCAR_BANNER_LOAD_FAILED,
        SCAR_BANNER_ATTACHED,
        SCAR_BANNER_DETACHED,
        SCAR_BANNER_OPENED,
        SCAR_BANNER_CLOSED,
        SCAR_BANNER_IMPRESSION,
        SCAR_BANNER_CLICKED
    }

    private BannerBridge() {
    }

    @JvmStatic
    public static final void destroy(String bannerAdId) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DESTROY_BANNER, bannerAdId);
        }
    }

    @JvmStatic
    public static final void didAttach(String bannerAdId) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_ATTACHED, bannerAdId);
        }
    }

    @JvmStatic
    public static final void didAttachScarBanner(String bannerAdId) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_ATTACHED, bannerAdId);
        }
    }

    @JvmStatic
    public static final void didDestroy(String bannerAdId) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DESTROYED, bannerAdId);
        }
    }

    @JvmStatic
    public static final void didDetach(String bannerAdId) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DETACHED, bannerAdId);
        }
    }

    @JvmStatic
    public static final void didDetachScarBanner(String bannerAdId) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_DETACHED, bannerAdId);
        }
    }

    @JvmStatic
    public static final void didLoad(String bannerAdId) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_LOADED, bannerAdId);
        }
    }

    private final boolean isHeaderBidding(JSONObject data) {
        if (data == null) {
            return false;
        }
        return data.has("adMarkup");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void load(final String placementId, final String bannerAdId, UnityBannerSize bannerSize, final UnityAdsLoadOptions loadOptions) {
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        final SDKMetricsSender sDKMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
        final Map mapMapOf = MapsKt.mapOf(TuplesKt.m43482to("is_header_bidding", String.valueOf(INSTANCE.isHeaderBidding(loadOptions.getData()))));
        final BannerView bannerView = BannerViewCache.getInstance().getBannerView(bannerAdId);
        IServiceProvider iServiceProvider = null;
        Object[] objArr = 0;
        if (bannerView == null) {
            sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_load_not_found", null, mapMapOf));
            return;
        }
        final boolean zInvoke = ((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke();
        int i = 1;
        boolean z = loadOptions.getObjectId() != null;
        if (zInvoke && !z) {
            loadOptions.setObjectId(bannerAdId);
        }
        final BannerView.IListener listener = bannerView.getListener();
        if (zInvoke) {
            new UnityAdsSDK(iServiceProvider, i, objArr == true ? 1 : 0).load(placementId, loadOptions, new InternalLoadListener() { // from class: com.unity3d.services.banners.bridge.BannerBridge$load$listener$1
                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoadFail(UnityAdsError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    BannerView bannerView2 = BannerViewCache.getInstance().getBannerView(bannerAdId);
                    if (bannerView2 == null || bannerView2.getListener() == null) {
                        sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_listener_load_fail_not_found", null, mapMapOf));
                    } else {
                        bannerView2.getListener().onBannerFailedToLoad(bannerView2, BannerErrorInfo.fromLoadError(error));
                    }
                }

                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoaded(AdObject adObject) {
                    Intrinsics.checkNotNullParameter(adObject, "adObject");
                    BannerBridge bannerBridge = BannerBridge.INSTANCE;
                    BannerView bannerAdView = bannerView;
                    Intrinsics.checkNotNullExpressionValue(bannerAdView, "bannerAdView");
                    bannerBridge.onBannerLoaded(bannerAdView, bannerAdId, placementId, loadOptions);
                }
            }, bannerSize);
        } else {
            LoadBannerModule.getInstance().executeAdOperation(new WebViewBridgeInvoker(), new LoadBannerOperationState(placementId, bannerAdId, bannerSize, new IUnityAdsLoadListener() { // from class: com.unity3d.services.banners.bridge.BannerBridge$load$listener$2
                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsAdLoaded(String placementId2) {
                    if (listener == null) {
                        sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_listener_loaded_not_found", null, mapMapOf));
                    }
                    if (zInvoke) {
                        BannerBridge bannerBridge = BannerBridge.INSTANCE;
                        BannerView bannerAdView = bannerView;
                        Intrinsics.checkNotNullExpressionValue(bannerAdView, "bannerAdView");
                        bannerBridge.onBannerLoaded(bannerAdView, bannerAdId, placementId2, loadOptions);
                    }
                }

                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsFailedToLoad(String placementId2, UnityAds.UnityAdsLoadError error, String message) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    BannerView bannerView2 = BannerViewCache.getInstance().getBannerView(bannerAdId);
                    if (bannerView2 == null || bannerView2.getListener() == null) {
                        sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_listener_load_fail_not_found", null, mapMapOf));
                    } else {
                        bannerView2.getListener().onBannerFailedToLoad(bannerView2, BannerErrorInfo.fromLoadError(error, message));
                    }
                }
            }, loadOptions, new ConfigurationReader().getCurrentConfiguration()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onBannerLoaded(BannerView bannerAdView, final String bannerAdId, final String placementId, final UnityAdsLoadOptions loadOptions) {
        final BannerView bannerView;
        final BannerView.IListener listener = bannerAdView.getListener();
        BannerView bannerView2 = BannerViewCache.getInstance().getBannerView(bannerAdId);
        if (bannerView2 == null) {
            if (listener != null) {
                listener.onBannerFailedToLoad(bannerAdView, new BannerErrorInfo("Banner view not found in cache during show", BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL.getNumber()));
                return;
            }
            return;
        }
        final BannerView bannerView3 = bannerView2;
        if (ViewCompat.isAttachedToWindow(bannerView3)) {
            if (BannerViewCache.getInstance().getBannerView(bannerAdId) != null) {
                UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
                unityAdsShowOptions.setObjectId(loadOptions.getObjectId());
                IServiceProvider iServiceProvider = null;
                Object[] objArr = 0;
                if (loadOptions.loadConfiguration != null) {
                    unityAdsShowOptions.showConfiguration = new ShowConfigurationInternal(null, null, 3, null);
                }
                new UnityAdsSDK(iServiceProvider, 1, objArr == true ? 1 : 0).show(placementId, unityAdsShowOptions, new BannerBridge$onBannerLoaded$1$2(listener, bannerAdView));
            } else if (listener instanceof BannerShowListenerWithOnFailedToShow) {
                ((BannerShowListenerWithOnFailedToShow) listener).onBannerFailedToShow(bannerAdView, new BannerErrorInfo("Banner view not found in cache during show", BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL.getNumber()));
            }
            bannerView = bannerAdView;
        } else {
            bannerView = bannerAdView;
            bannerView3.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.services.banners.bridge.BannerBridge$onBannerLoaded$$inlined$doOnAttach$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    bannerView3.removeOnAttachStateChangeListener(this);
                    if (BannerViewCache.getInstance().getBannerView(bannerAdId) == null) {
                        BannerView.IListener iListener = listener;
                        if (iListener instanceof BannerShowListenerWithOnFailedToShow) {
                            Intrinsics.checkNotNull(iListener, "null cannot be cast to non-null type com.unity3d.ads.BannerShowListenerWithOnFailedToShow");
                            ((BannerShowListenerWithOnFailedToShow) listener).onBannerFailedToShow(bannerView, new BannerErrorInfo("Banner view not found in cache during show", BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL.getNumber()));
                            return;
                        }
                        return;
                    }
                    UnityAdsShowOptions unityAdsShowOptions2 = new UnityAdsShowOptions();
                    unityAdsShowOptions2.setObjectId(loadOptions.getObjectId());
                    IServiceProvider iServiceProvider2 = null;
                    Object[] objArr2 = 0;
                    if (loadOptions.loadConfiguration != null) {
                        unityAdsShowOptions2.showConfiguration = new ShowConfigurationInternal(null, null, 3, null);
                    }
                    new UnityAdsSDK(iServiceProvider2, 1, objArr2 == true ? 1 : 0).show(placementId, unityAdsShowOptions2, new BannerBridge$onBannerLoaded$1$2(listener, bannerView));
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                }
            });
        }
        if (listener != null) {
            listener.onBannerLoaded(bannerView);
        }
    }

    @JvmStatic
    public static final void resize(String bannerAdId, int left, int top, int right, int bottom, float alpha) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_RESIZED, bannerAdId, Integer.valueOf(left), Integer.valueOf(top), Integer.valueOf(right), Integer.valueOf(bottom), Float.valueOf(alpha));
        }
    }

    @JvmStatic
    public static final void visibilityChanged(String bannerAdId, int visibility) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_VISIBILITY_CHANGED, bannerAdId, Integer.valueOf(visibility));
        }
    }
}
