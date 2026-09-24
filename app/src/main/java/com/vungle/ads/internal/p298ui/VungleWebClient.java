package com.vungle.ads.internal.p298ui;

import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.webkit.ProxyConfig;
import com.google.common.net.HttpHeaders;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.player.h$a$$ExternalSyntheticApiModelOutline0;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.EvaluateJsError;
import com.vungle.ads.OneShotSingleValueMetric;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import com.vungle.ads.internal.p298ui.view.WebViewAPI;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.PreloadDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.BlackScreenDetector;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.OnSilentModeChangeListener;
import com.vungle.ads.internal.util.ThreadUtil;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: VungleWebClient.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0097\u0001\u0098\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000e\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020bJ \u0010c\u001a\u00020`2\u0006\u0010d\u001a\u00020'2\u0006\u0010e\u001a\u00020'2\u0006\u0010f\u001a\u00020\u0018H\u0002J\u0010\u0010g\u001a\u00020\u00182\u0006\u0010e\u001a\u00020'H\u0002J\u0018\u0010h\u001a\u00020`2\u0006\u0010i\u001a\u00020b2\b\b\u0002\u0010j\u001a\u00020'J\u0016\u0010k\u001a\u00020`2\u0006\u0010l\u001a\u00020\u000f2\u0006\u0010m\u001a\u00020\u000fJ\u0006\u0010n\u001a\u00020`J\u0010\u0010o\u001a\u00020`2\u0006\u0010p\u001a\u00020\u0018H\u0016J\u0010\u0010q\u001a\u00020`2\u0006\u0010r\u001a\u00020\u0018H\u0016J\u001c\u0010s\u001a\u00020`2\b\u0010t\u001a\u0004\u0018\u00010B2\b\u0010e\u001a\u0004\u0018\u00010'H\u0016J&\u0010u\u001a\u00020`2\b\u0010t\u001a\u0004\u0018\u00010B2\b\u0010v\u001a\u0004\u0018\u00010w2\b\u0010x\u001a\u0004\u0018\u00010yH\u0016J*\u0010u\u001a\u00020`2\b\u0010t\u001a\u0004\u0018\u00010B2\u0006\u0010z\u001a\u00020b2\u0006\u0010{\u001a\u00020'2\u0006\u0010|\u001a\u00020'H\u0017J&\u0010}\u001a\u00020`2\b\u0010t\u001a\u0004\u0018\u00010B2\b\u0010v\u001a\u0004\u0018\u00010w2\b\u0010~\u001a\u0004\u0018\u00010\u007fH\u0016J\u001f\u0010\u0080\u0001\u001a\u00020\u00182\b\u0010t\u001a\u0004\u0018\u00010B2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0016J2\u0010\u0083\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0084\u00012\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010'2\u0007\u0010\u0086\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0003\b\u0087\u0001J\u001d\u0010\u0088\u0001\u001a\u00020`2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010B2\u0007\u0010\u008a\u0001\u001a\u00020'H\u0002J\u0011\u0010\u008b\u0001\u001a\u00020`2\u0006\u00109\u001a\u00020\u0018H\u0016J>\u0010\u008c\u0001\u001a\u00020`2\u0007\u0010\u008d\u0001\u001a\u00020\u00182\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010'2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010'2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010'2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010'H\u0016J\u0011\u0010\u0092\u0001\u001a\u00020`2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0013\u0010\u0093\u0001\u001a\u00020`2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0013\u0010\u0094\u0001\u001a\u00020`2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\u001f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u007f2\b\u0010t\u001a\u0004\u0018\u00010B2\b\u0010v\u001a\u0004\u0018\u00010wH\u0016J\u001d\u0010\u0096\u0001\u001a\u00020\u00182\b\u0010t\u001a\u0004\u0018\u00010B2\b\u0010e\u001a\u0004\u0018\u00010'H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u00020\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001f\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R&\u0010&\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R&\u0010-\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R&\u00101\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R&\u00105\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R(\u00109\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010?\u0012\u0004\b:\u0010\u001a\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010@R&\u0010A\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bC\u0010\u001a\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR&\u0010H\u001a\u0004\u0018\u00010I8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bJ\u0010\u001a\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020PX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020PX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010R\u001a\u00020\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bS\u0010\u001a\u001a\u0004\bT\u0010\u001c\"\u0004\bU\u0010\u001eR\u000e\u0010V\u001a\u00020WX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010X\u001a\u0004\u0018\u00010Y8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bZ\u0010\u001a\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006\u0099\u0001"}, m43475d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient;", "Landroid/webkit/WebViewClient;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI;", "Lcom/vungle/ads/internal/util/OnSilentModeChangeListener;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "offloadExecutor", "Ljava/util/concurrent/ExecutorService;", C11540L6.f24917H, "Lcom/vungle/ads/internal/platform/Platform;", "delegate", "Lcom/vungle/ads/internal/presenter/PreloadDelegate;", "loadDuration", "", "(Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Ljava/util/concurrent/ExecutorService;Lcom/vungle/ads/internal/platform/Platform;Lcom/vungle/ads/internal/presenter/PreloadDelegate;Ljava/lang/Long;)V", "blackScreenDetector", "Lcom/vungle/ads/internal/util/BlackScreenDetector;", "getBlackScreenDetector", "()Lcom/vungle/ads/internal/util/BlackScreenDetector;", "blackScreenDetector$delegate", "Lkotlin/Lazy;", "collectConsent", "", "getCollectConsent$vungle_ads_release$annotations", "()V", "getCollectConsent$vungle_ads_release", "()Z", "setCollectConsent$vungle_ads_release", "(Z)V", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "getErrorHandler$vungle_ads_release$annotations", "getErrorHandler$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "setErrorHandler$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "gdprAccept", "", "getGdprAccept$vungle_ads_release$annotations", "getGdprAccept$vungle_ads_release", "()Ljava/lang/String;", "setGdprAccept$vungle_ads_release", "(Ljava/lang/String;)V", "gdprBody", "getGdprBody$vungle_ads_release$annotations", "getGdprBody$vungle_ads_release", "setGdprBody$vungle_ads_release", "gdprDeny", "getGdprDeny$vungle_ads_release$annotations", "getGdprDeny$vungle_ads_release", "setGdprDeny$vungle_ads_release", "gdprTitle", "getGdprTitle$vungle_ads_release$annotations", "getGdprTitle$vungle_ads_release", "setGdprTitle$vungle_ads_release", C11744X3.i.f26382o, "isViewable$vungle_ads_release$annotations", "isViewable$vungle_ads_release", "()Ljava/lang/Boolean;", "setViewable$vungle_ads_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "loadedWebView", "Landroid/webkit/WebView;", "getLoadedWebView$vungle_ads_release$annotations", "getLoadedWebView$vungle_ads_release", "()Landroid/webkit/WebView;", "setLoadedWebView$vungle_ads_release", "(Landroid/webkit/WebView;)V", "mraidDelegate", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "getMraidDelegate$vungle_ads_release$annotations", "getMraidDelegate$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "setMraidDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;)V", "partialDownloadErrorMetric", "Lcom/vungle/ads/OneShotSingleValueMetric;", "partialDownloadMetric", C11744X3.i.f26390s, "getReady$vungle_ads_release$annotations", "getReady$vungle_ads_release", "setReady$vungle_ads_release", "skippedUrlMetric", "Lcom/vungle/ads/SingleValueMetric;", "webViewObserver", "Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "getWebViewObserver$vungle_ads_release$annotations", "getWebViewObserver$vungle_ads_release", "()Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "setWebViewObserver$vungle_ads_release", "(Lcom/vungle/ads/internal/omsdk/WebViewObserver;)V", "handleBlackScreenDetection", "", "samplingFactor", "", "handleWebViewError", "errorMsg", "url", "didCrash", "isCriticalAsset", "notifyBlackScreenResult", "percentage", "errorMessage", "notifyDiskAvailableSize", "availableDiskSize", "appFolderSize", "notifyPresentAppStoreFailed", "notifyPropertiesChange", "skipCmdQueue", "notifySilentModeChange", "silentModeEnabled", "onPageFinished", "view", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "parseRange", "Lkotlin/Pair;", "rangeHeader", "contentLength", "parseRange$vungle_ads_release", "runJavascriptOnWebView", "webView", "injectJs", "setAdVisibility", "setConsentStatus", "collectedConsent", "title", "message", "accept", "deny", "setErrorHandler", "setMraidDelegate", "setWebViewObserver", "shouldInterceptRequest", "shouldOverrideUrlLoading", "Companion", "VungleWebViewRenderProcessClient", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public final class VungleWebClient extends WebViewClient implements WebViewAPI, OnSilentModeChangeListener {
    private static final String COMMAND_COMPLETE = "window.vungle.mraidBridge.notifyCommandComplete()";
    private static final String TAG = "VungleWebClient";
    private final AdPayload advertisement;

    /* JADX INFO: renamed from: blackScreenDetector$delegate, reason: from kotlin metadata */
    private final Lazy blackScreenDetector;
    private boolean collectConsent;
    private final PreloadDelegate delegate;
    private WebViewAPI.WebClientErrorHandler errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private Boolean isViewable;
    private final Long loadDuration;
    private WebView loadedWebView;
    private WebViewAPI.MraidDelegate mraidDelegate;
    private final ExecutorService offloadExecutor;
    private final OneShotSingleValueMetric partialDownloadErrorMetric;
    private final OneShotSingleValueMetric partialDownloadMetric;
    private final Placement placement;
    private final Platform platform;
    private boolean ready;
    private final SingleValueMetric skippedUrlMetric;
    private WebViewObserver webViewObserver;

    /* JADX INFO: compiled from: VungleWebClient.kt */
    @Metadata(m43474d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m43475d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient$VungleWebViewRenderProcessClient;", "Landroid/webkit/WebViewRenderProcessClient;", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "onRenderProcessResponsive", "", "webView", "Landroid/webkit/WebView;", "webViewRenderProcess", "Landroid/webkit/WebViewRenderProcess;", "onRenderProcessUnresponsive", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
    public static final class VungleWebViewRenderProcessClient extends WebViewRenderProcessClient {
        private WebViewAPI.WebClientErrorHandler errorHandler;

        public VungleWebViewRenderProcessClient(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            Intrinsics.checkNotNullParameter(webView, "webView");
        }

        public void onRenderProcessUnresponsive(final WebView webView, final WebViewRenderProcess webViewRenderProcess) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Logger.INSTANCE.m43472w(VungleWebClient.TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$VungleWebViewRenderProcessClient$onRenderProcessUnresponsive$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder sb = new StringBuilder("onRenderProcessUnresponsive(Title = ");
                    sb.append(webView.getTitle());
                    sb.append(", URL = ");
                    sb.append(webView.getOriginalUrl());
                    sb.append(", (webViewRenderProcess != null) = ");
                    sb.append(webViewRenderProcess != null);
                    return sb.toString();
                }
            });
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                webClientErrorHandler.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }
    }

    public VungleWebClient(AdPayload advertisement, Placement placement, ExecutorService offloadExecutor, Platform platform, PreloadDelegate preloadDelegate, Long l) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = offloadExecutor;
        this.platform = platform;
        this.delegate = preloadDelegate;
        this.loadDuration = l;
        this.blackScreenDetector = LazyKt.lazy(new Function0<BlackScreenDetector>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$blackScreenDetector$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BlackScreenDetector invoke() {
                return new BlackScreenDetector();
            }
        });
        this.partialDownloadMetric = new OneShotSingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET);
        this.partialDownloadErrorMetric = new OneShotSingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET);
        this.skippedUrlMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    public /* synthetic */ VungleWebClient(AdPayload adPayload, Placement placement, ExecutorService executorService, Platform platform, PreloadDelegate preloadDelegate, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adPayload, placement, executorService, (i & 8) != 0 ? null : platform, (i & 16) != 0 ? null : preloadDelegate, (i & 32) != 0 ? null : l);
    }

    private final BlackScreenDetector getBlackScreenDetector() {
        return (BlackScreenDetector) this.blackScreenDetector.getValue();
    }

    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    private final void handleWebViewError(String errorMsg, String url, boolean didCrash) {
        String str = url + ' ' + errorMsg;
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            webClientErrorHandler.onReceivedError(str, didCrash);
        }
    }

    private final boolean isCriticalAsset(String url) {
        if (url.length() > 0) {
            return this.advertisement.isCriticalAsset(url);
        }
        return false;
    }

    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void notifyBlackScreenResult$default(VungleWebClient vungleWebClient, int i, String str, int i2, Object obj) throws Throwable {
        if ((i2 & 2) != 0) {
            str = "";
        }
        vungleWebClient.notifyBlackScreenResult(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notifyPropertiesChange$lambda-19, reason: not valid java name */
    public static final void m44834notifyPropertiesChange$lambda19(boolean z, VungleWebClient this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "placementType", this$0.advertisement.templateType());
        Boolean bool = this$0.isViewable;
        if (bool != null) {
            bool.booleanValue();
            JsonElementBuildersKt.put(jsonObjectBuilder, C11744X3.i.f26382o, bool);
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, C11540L6.f24911F, "android");
        JsonElementBuildersKt.put(jsonObjectBuilder, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
        JsonElementBuildersKt.put(jsonObjectBuilder, "incentivized", Boolean.valueOf(this$0.placement.isRewardedVideo()));
        Platform platform = this$0.platform;
        if (platform != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSilent", Boolean.valueOf(platform.isSilentModeEnabled()));
        }
        Long l = this$0.loadDuration;
        if (l != null) {
            l.longValue();
            JsonElementBuildersKt.put(jsonObjectBuilder, "timeLoaded", this$0.loadDuration);
        }
        if (this$0.collectConsent) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", (Boolean) true);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentTitleText", this$0.gdprTitle);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentBodyText", this$0.gdprBody);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentAcceptButtonText", this$0.gdprAccept);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentDenyButtonText", this$0.gdprDeny);
        } else {
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", (Boolean) false);
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, "sdkVersion", BuildConfig.VERSION_NAME);
        String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + AbstractJsonLexerKt.COMMA + z + ')';
        WebView webView = this$0.loadedWebView;
        if (webView != null) {
            this$0.runJavascriptOnWebView(webView, str);
        }
    }

    private final void runJavascriptOnWebView(final WebView webView, final String injectJs) {
        try {
            Logger.INSTANCE.m43472w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.runJavascriptOnWebView.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "mraid Injecting JS " + injectJs;
                }
            });
            ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.runJavascriptOnWebView.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    WebView webView2 = webView;
                    if (webView2 != null) {
                        webView2.evaluateJavascript(injectJs, null);
                    }
                }
            });
        } catch (Throwable th) {
            new EvaluateJsError("Evaluate js failed " + th.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-11$lambda-10$lambda-9, reason: not valid java name */
    public static final void m44835shouldOverrideUrlLoading$lambda11$lambda10$lambda9(WebViewAPI.MraidDelegate it, String command, JsonObject args, VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(args, "$args");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (it.processCommand(command, args)) {
            this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-11$lambda-5, reason: not valid java name */
    public static final void m44836shouldOverrideUrlLoading$lambda11$lambda5(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + this$0.advertisement.createMRAIDArgs() + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-11$lambda-6, reason: not valid java name */
    public static final void m44837shouldOverrideUrlLoading$lambda11$lambda6(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdReadyToPlay();
        }
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-11$lambda-7, reason: not valid java name */
    public static final void m44838shouldOverrideUrlLoading$lambda11$lambda7(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdFailedToPlay();
        }
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: renamed from: getCollectConsent$vungle_ads_release, reason: from getter */
    public final boolean getCollectConsent() {
        return this.collectConsent;
    }

    /* JADX INFO: renamed from: getErrorHandler$vungle_ads_release, reason: from getter */
    public final WebViewAPI.WebClientErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    /* JADX INFO: renamed from: getGdprAccept$vungle_ads_release, reason: from getter */
    public final String getGdprAccept() {
        return this.gdprAccept;
    }

    /* JADX INFO: renamed from: getGdprBody$vungle_ads_release, reason: from getter */
    public final String getGdprBody() {
        return this.gdprBody;
    }

    /* JADX INFO: renamed from: getGdprDeny$vungle_ads_release, reason: from getter */
    public final String getGdprDeny() {
        return this.gdprDeny;
    }

    /* JADX INFO: renamed from: getGdprTitle$vungle_ads_release, reason: from getter */
    public final String getGdprTitle() {
        return this.gdprTitle;
    }

    /* JADX INFO: renamed from: getLoadedWebView$vungle_ads_release, reason: from getter */
    public final WebView getLoadedWebView() {
        return this.loadedWebView;
    }

    /* JADX INFO: renamed from: getMraidDelegate$vungle_ads_release, reason: from getter */
    public final WebViewAPI.MraidDelegate getMraidDelegate() {
        return this.mraidDelegate;
    }

    /* JADX INFO: renamed from: getReady$vungle_ads_release, reason: from getter */
    public final boolean getReady() {
        return this.ready;
    }

    /* JADX INFO: renamed from: getWebViewObserver$vungle_ads_release, reason: from getter */
    public final WebViewObserver getWebViewObserver() {
        return this.webViewObserver;
    }

    public final void handleBlackScreenDetection(int samplingFactor) {
        getBlackScreenDetector().start(this.loadedWebView, samplingFactor, new Function2<Integer, String, Unit>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.handleBlackScreenDetection.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str) throws Throwable {
                invoke(num.intValue(), str);
                return Unit.INSTANCE;
            }

            public final void invoke(int i, String errorMessage) throws Throwable {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                VungleWebClient.this.notifyBlackScreenResult(i, errorMessage);
            }
        });
    }

    /* JADX INFO: renamed from: isViewable$vungle_ads_release, reason: from getter */
    public final Boolean getIsViewable() {
        return this.isViewable;
    }

    public final void notifyBlackScreenResult(int percentage, String errorMessage) throws Throwable {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyBlackScreenResult(" + percentage + ')');
        }
        Logger.INSTANCE.m43467d(TAG, "Returning black screen result: " + percentage + '%');
        if (percentage >= 0) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.BLACK_SCREEN_IS_DETECTED, percentage, this.advertisement.getLogEntry(), null, 8, null);
        } else {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR, errorMessage, this.advertisement.getLogEntry());
        }
    }

    public final void notifyDiskAvailableSize(long availableDiskSize, long appFolderSize) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + availableDiskSize + '-' + appFolderSize + ')');
        }
    }

    public final void notifyPresentAppStoreFailed() {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyPresentAppStoreFailed(0)");
        }
    }

    @Override // com.vungle.ads.internal.p298ui.view.WebViewAPI
    public void notifyPropertiesChange(final boolean skipCmdQueue) {
        this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m44834notifyPropertiesChange$lambda19(skipCmdQueue, this);
            }
        });
    }

    @Override // com.vungle.ads.internal.util.OnSilentModeChangeListener
    public void notifySilentModeChange(boolean silentModeEnabled) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSilent", Boolean.valueOf(silentModeEnabled));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + ')');
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        Logger.INSTANCE.m43472w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.onPageFinished.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "onPageFinished.";
            }
        });
        if (view == null) {
            return;
        }
        this.loadedWebView = view;
        if (view != null) {
            view.setVisibility(0);
        }
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            view.setWebViewRenderProcessClient(h$a$$ExternalSyntheticApiModelOutline0.m43321m((Object) new VungleWebViewRenderProcessClient(this.errorHandler)));
        }
        WebViewObserver webViewObserver = this.webViewObserver;
        if (webViewObserver != null) {
            webViewObserver.onPageFinished(view);
        }
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        super.onReceivedError(view, errorCode, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);
        String strValueOf = String.valueOf(error != null ? error.getDescription() : null);
        String strValueOf2 = String.valueOf(request != null ? request.getUrl() : null);
        boolean z = request != null && request.isForMainFrame();
        Logger.INSTANCE.m43468e(TAG, "Error desc " + strValueOf + ' ' + z + " for URL " + strValueOf2);
        handleWebViewError(strValueOf, strValueOf2, isCriticalAsset(strValueOf2) && z);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        super.onReceivedHttpError(view, request, errorResponse);
        String strValueOf = String.valueOf(errorResponse != null ? Integer.valueOf(errorResponse.getStatusCode()) : null);
        String strValueOf2 = String.valueOf(request != null ? request.getUrl() : null);
        boolean z = request != null && request.isForMainFrame();
        Logger.INSTANCE.m43468e(TAG, "Http Error desc " + strValueOf + ' ' + z + " for URL " + strValueOf2);
        handleWebViewError(strValueOf, strValueOf2, isCriticalAsset(strValueOf2) && z);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(final WebView view, final RenderProcessGoneDetail detail) {
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            Logger.INSTANCE.m43472w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.onRenderProcessGone.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder sb = new StringBuilder("onRenderProcessGone url: ");
                    WebView webView = view;
                    sb.append(webView != null ? webView.getUrl() : null);
                    return sb.toString();
                }
            });
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                return webClientErrorHandler.onWebRenderingProcessGone(view, true);
            }
            return true;
        }
        Logger.INSTANCE.m43472w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.onRenderProcessGone.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder sb = new StringBuilder("onRenderProcessGone url: ");
                WebView webView = view;
                sb.append(webView != null ? webView.getUrl() : null);
                sb.append(", did crash: ");
                RenderProcessGoneDetail renderProcessGoneDetail = detail;
                sb.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
                return sb.toString();
            }
        });
        WebViewAPI.WebClientErrorHandler webClientErrorHandler2 = this.errorHandler;
        if (webClientErrorHandler2 != null) {
            return webClientErrorHandler2.onWebRenderingProcessGone(view, detail != null ? Boolean.valueOf(detail.didCrash()) : null);
        }
        return super.onRenderProcessGone(view, detail);
    }

    public final Pair<Long, Long> parseRange$vungle_ads_release(String rangeHeader, long contentLength) {
        Object objM44946constructorimpl;
        Pair pair;
        try {
            Result.Companion companion = Result.INSTANCE;
            VungleWebClient vungleWebClient = this;
            if (rangeHeader == null || !StringsKt.startsWith$default(rangeHeader, "bytes=", false, 2, (Object) null)) {
                pair = new Pair(0L, null);
            } else {
                List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.removePrefix(rangeHeader, (CharSequence) "bytes="), new String[]{"-"}, false, 0, 6, (Object) null);
                String str = (String) CollectionsKt.getOrNull(listSplit$default, 0);
                Long longOrNull = str != null ? StringsKt.toLongOrNull(str) : null;
                String str2 = (String) CollectionsKt.getOrNull(listSplit$default, 1);
                Long longOrNull2 = str2 != null ? StringsKt.toLongOrNull(str2) : null;
                if (longOrNull == null) {
                    if (longOrNull2 == null) {
                        longOrNull = 0L;
                    } else {
                        longOrNull = Long.valueOf(contentLength - longOrNull2.longValue());
                        longOrNull2 = null;
                    }
                }
                pair = new Pair(longOrNull, longOrNull2);
            }
            objM44946constructorimpl = Result.m44946constructorimpl(pair);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m44949exceptionOrNullimpl(objM44946constructorimpl) != null) {
            objM44946constructorimpl = new Pair(0L, null);
        }
        return (Pair) objM44946constructorimpl;
    }

    @Override // com.vungle.ads.internal.p298ui.view.WebViewAPI
    public void setAdVisibility(boolean isViewable) {
        this.isViewable = Boolean.valueOf(isViewable);
        WebView webView = this.loadedWebView;
        if (webView != null) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, C11744X3.i.f26382o, Boolean.valueOf(isViewable));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + ')');
        }
    }

    public final void setCollectConsent$vungle_ads_release(boolean z) {
        this.collectConsent = z;
    }

    @Override // com.vungle.ads.internal.p298ui.view.WebViewAPI
    public void setConsentStatus(boolean collectedConsent, String title, String message, String accept, String deny) {
        this.collectConsent = collectedConsent;
        this.gdprTitle = title;
        this.gdprBody = message;
        this.gdprAccept = accept;
        this.gdprDeny = deny;
    }

    @Override // com.vungle.ads.internal.p298ui.view.WebViewAPI
    public void setErrorHandler(WebViewAPI.WebClientErrorHandler errorHandler) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        this.errorHandler = webClientErrorHandler;
    }

    public final void setGdprAccept$vungle_ads_release(String str) {
        this.gdprAccept = str;
    }

    public final void setGdprBody$vungle_ads_release(String str) {
        this.gdprBody = str;
    }

    public final void setGdprDeny$vungle_ads_release(String str) {
        this.gdprDeny = str;
    }

    public final void setGdprTitle$vungle_ads_release(String str) {
        this.gdprTitle = str;
    }

    public final void setLoadedWebView$vungle_ads_release(WebView webView) {
        this.loadedWebView = webView;
    }

    @Override // com.vungle.ads.internal.p298ui.view.WebViewAPI
    public void setMraidDelegate(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setMraidDelegate$vungle_ads_release(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setReady$vungle_ads_release(boolean z) {
        this.ready = z;
    }

    public final void setViewable$vungle_ads_release(Boolean bool) {
        this.isViewable = bool;
    }

    @Override // com.vungle.ads.internal.p298ui.view.WebViewAPI
    public void setWebViewObserver(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    public final void setWebViewObserver$vungle_ads_release(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        long length;
        Uri url = request != null ? request.getUrl() : null;
        if (url == null) {
            return null;
        }
        String scheme = url.getScheme();
        if (scheme != null) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = scheme.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase != null) {
                if (!Intrinsics.areEqual(lowerCase, ProxyConfig.MATCH_HTTP) && !Intrinsics.areEqual(lowerCase, "https")) {
                    return null;
                }
                if (!this.advertisement.isPartialDownloadEnabled()) {
                    Logger.INSTANCE.m43472w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.shouldInterceptRequest.1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "shouldInterceptRequest called but partial download is disabled.";
                        }
                    });
                    return null;
                }
                String string = url.toString();
                Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
                AdAsset localPartialDownloadAssets = this.advertisement.getLocalPartialDownloadAssets(string);
                String localPath = localPartialDownloadAssets != null ? localPartialDownloadAssets.getLocalPath() : null;
                String str = localPath;
                if (str == null || str.length() == 0) {
                    return null;
                }
                File file = new File(localPath);
                if (!file.exists()) {
                    return null;
                }
                long contentLength = localPartialDownloadAssets.getContentLength();
                if (contentLength <= 0) {
                    return null;
                }
                long length2 = file.length();
                final String str2 = request.getRequestHeaders().get("Range");
                this.partialDownloadMetric.setMeta(str2 + " cached:" + length2 + ' ' + string);
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                Pair<Long, Long> range$vungle_ads_release = parseRange$vungle_ads_release(str2, contentLength);
                localPartialDownloadAssets.setRangeStart(range$vungle_ads_release.getFirst().longValue());
                localPartialDownloadAssets.setRangeEnd(range$vungle_ads_release.getSecond());
                long jLongValue = range$vungle_ads_release.component1().longValue();
                Long lComponent2 = range$vungle_ads_release.component2();
                long j = length2 - jLongValue;
                Logger.INSTANCE.m43470i(TAG, ">>request: " + url + " rangeStart=" + jLongValue + " rangeEnd=" + lComponent2 + " cachedFileLength=" + length2 + " availableBytes=" + j + " contentLength=" + contentLength + ' ');
                if (j <= 0) {
                    Logger.INSTANCE.m43472w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.shouldInterceptRequest.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Requested range exceeds cached file: " + str2;
                        }
                    });
                    localPartialDownloadAssets.waitForDownload();
                    length = file.length();
                } else {
                    length = length2;
                }
                long jLongValue2 = lComponent2 != null ? lComponent2.longValue() : length - 1;
                long j2 = (jLongValue2 - jLongValue) + 1;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    VungleWebClient vungleWebClient = this;
                    FileInputStream fileInputStream = new FileInputStream(file);
                    WebResourceResponse webResourceResponse = new WebResourceResponse(localPartialDownloadAssets.getMimeType(), "UTF-8", 206, "Partial Content", MapsKt.mapOf(TuplesKt.m43482to("Content-Type", localPartialDownloadAssets.getMimeType()), TuplesKt.m43482to(HttpHeaders.ACCEPT_RANGES, "bytes"), TuplesKt.m43482to(HttpHeaders.CONTENT_LENGTH, String.valueOf(j2)), TuplesKt.m43482to(HttpHeaders.CONTENT_RANGE, "bytes " + jLongValue + '-' + jLongValue2 + '/' + contentLength)), new BufferedInputStream(fileInputStream, 1024));
                    Logger.Companion companion2 = Logger.INSTANCE;
                    StringBuilder sb = new StringBuilder("<<Return:");
                    sb.append(webResourceResponse.getResponseHeaders());
                    companion2.m43470i(TAG, sb.toString());
                    return webResourceResponse;
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(Result.m44946constructorimpl(ResultKt.createFailure(th)));
                    if (thM44949exceptionOrNullimpl != null) {
                        Logger.INSTANCE.m43469e(TAG, "Error serving local range video: " + thM44949exceptionOrNullimpl.getMessage(), thM44949exceptionOrNullimpl);
                        this.partialDownloadErrorMetric.setMeta(string + ' ' + thM44949exceptionOrNullimpl.getMessage());
                        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadErrorMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                    }
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b0 A[Catch: all -> 0x0161, TryCatch #0 {all -> 0x0161, blocks: (B:3:0x000b, B:5:0x0021, B:8:0x0029, B:10:0x003a, B:13:0x0042, B:15:0x004f, B:17:0x0056, B:37:0x00ac, B:39:0x00b0, B:42:0x00b8, B:43:0x00c5, B:45:0x00cb, B:46:0x00de, B:24:0x006a, B:27:0x0073, B:28:0x007f, B:31:0x0088, B:32:0x0093, B:34:0x009b, B:36:0x009f, B:53:0x0101, B:48:0x00ef, B:50:0x00f8, B:55:0x012f, B:57:0x0144, B:60:0x0159), top: B:67:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8 A[Catch: all -> 0x0161, TryCatch #0 {all -> 0x0161, blocks: (B:3:0x000b, B:5:0x0021, B:8:0x0029, B:10:0x003a, B:13:0x0042, B:15:0x004f, B:17:0x0056, B:37:0x00ac, B:39:0x00b0, B:42:0x00b8, B:43:0x00c5, B:45:0x00cb, B:46:0x00de, B:24:0x006a, B:27:0x0073, B:28:0x007f, B:31:0x0088, B:32:0x0093, B:34:0x009b, B:36:0x009f, B:53:0x0101, B:48:0x00ef, B:50:0x00f8, B:55:0x012f, B:57:0x0144, B:60:0x0159), top: B:67:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb A[Catch: all -> 0x0161, LOOP:0: B:43:0x00c5->B:45:0x00cb, LOOP_END, TryCatch #0 {all -> 0x0161, blocks: (B:3:0x000b, B:5:0x0021, B:8:0x0029, B:10:0x003a, B:13:0x0042, B:15:0x004f, B:17:0x0056, B:37:0x00ac, B:39:0x00b0, B:42:0x00b8, B:43:0x00c5, B:45:0x00cb, B:46:0x00de, B:24:0x006a, B:27:0x0073, B:28:0x007f, B:31:0x0088, B:32:0x0093, B:34:0x009b, B:36:0x009f, B:53:0x0101, B:48:0x00ef, B:50:0x00f8, B:55:0x012f, B:57:0x0144, B:60:0x0159), top: B:67:0x000b }] */
    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public boolean shouldOverrideUrlLoading(final WebView view, final String url) {
        final WebViewAPI.MraidDelegate mraidDelegate;
        JsonObjectBuilder jsonObjectBuilder;
        try {
            Logger.INSTANCE.m43467d(TAG, "MRAID Command " + url);
            String str = url;
            if (str != null && str.length() != 0) {
                Uri uri = Uri.parse(url);
                Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
                String scheme = uri.getScheme();
                if (scheme != null && scheme.length() != 0) {
                    String scheme2 = uri.getScheme();
                    if (!Intrinsics.areEqual(scheme2, CampaignEx.JSON_KEY_MRAID)) {
                        if (!StringsKt.equals(ProxyConfig.MATCH_HTTP, scheme2, true)) {
                            if (StringsKt.equals("https", scheme2, true)) {
                            }
                        }
                        Logger.INSTANCE.m43467d(TAG, "Open URL" + url);
                        WebViewAPI.MraidDelegate mraidDelegate2 = this.mraidDelegate;
                        if (mraidDelegate2 != null) {
                            JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
                            JsonElementBuildersKt.put(jsonObjectBuilder2, "url", url);
                            mraidDelegate2.processCommand("openNonMraid", jsonObjectBuilder2.build());
                        }
                        return true;
                    }
                    final String host = uri.getHost();
                    if (host != null) {
                        int iHashCode = host.hashCode();
                        if (iHashCode != -1943542072) {
                            if (iHashCode != 88409791) {
                                if (iHashCode == 119543762 && host.equals("readyToPlay")) {
                                    this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            VungleWebClient.m44837shouldOverrideUrlLoading$lambda11$lambda6(this.f$0, view);
                                        }
                                    });
                                } else {
                                    mraidDelegate = this.mraidDelegate;
                                    if (mraidDelegate == null) {
                                        runJavascriptOnWebView(view, COMMAND_COMPLETE);
                                        return true;
                                    }
                                    if (mraidDelegate != null) {
                                        jsonObjectBuilder = new JsonObjectBuilder();
                                        for (String param : uri.getQueryParameterNames()) {
                                            Intrinsics.checkNotNullExpressionValue(param, "param");
                                            JsonElementBuildersKt.put(jsonObjectBuilder, param, uri.getQueryParameter(param));
                                        }
                                        final JsonObject jsonObjectBuild = jsonObjectBuilder.build();
                                        this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                VungleWebClient.m44835shouldOverrideUrlLoading$lambda11$lambda10$lambda9(mraidDelegate, host, jsonObjectBuild, this, view);
                                            }
                                        });
                                    }
                                }
                            } else if (host.equals("failToLoad")) {
                                this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda4
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        VungleWebClient.m44838shouldOverrideUrlLoading$lambda11$lambda7(this.f$0, view);
                                    }
                                });
                            } else {
                                mraidDelegate = this.mraidDelegate;
                                if (mraidDelegate == null) {
                                    runJavascriptOnWebView(view, COMMAND_COMPLETE);
                                    return true;
                                }
                                if (mraidDelegate != null) {
                                    jsonObjectBuilder = new JsonObjectBuilder();
                                    while (r8.hasNext()) {
                                        Intrinsics.checkNotNullExpressionValue(param, "param");
                                        JsonElementBuildersKt.put(jsonObjectBuilder, param, uri.getQueryParameter(param));
                                    }
                                    final JsonObject jsonObjectBuild2 = jsonObjectBuilder.build();
                                    this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            VungleWebClient.m44835shouldOverrideUrlLoading$lambda11$lambda10$lambda9(mraidDelegate, host, jsonObjectBuild2, this, view);
                                        }
                                    });
                                }
                            }
                        } else if (!host.equals("propertiesChangeCompleted")) {
                            mraidDelegate = this.mraidDelegate;
                            if (mraidDelegate == null) {
                                runJavascriptOnWebView(view, COMMAND_COMPLETE);
                                return true;
                            }
                            if (mraidDelegate != null) {
                                jsonObjectBuilder = new JsonObjectBuilder();
                                while (r8.hasNext()) {
                                    Intrinsics.checkNotNullExpressionValue(param, "param");
                                    JsonElementBuildersKt.put(jsonObjectBuilder, param, uri.getQueryParameter(param));
                                }
                                final JsonObject jsonObjectBuild3 = jsonObjectBuilder.build();
                                this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        VungleWebClient.m44835shouldOverrideUrlLoading$lambda11$lambda10$lambda9(mraidDelegate, host, jsonObjectBuild3, this, view);
                                    }
                                });
                            }
                        } else if (!this.ready) {
                            this.ready = true;
                            this.offloadExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.VungleWebClient$$ExternalSyntheticLambda2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    VungleWebClient.m44836shouldOverrideUrlLoading$lambda11$lambda5(this.f$0, view);
                                }
                            });
                        }
                        return true;
                    }
                    this.skippedUrlMetric.setMeta("url: " + url);
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.skippedUrlMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
                    Logger.INSTANCE.m43472w(TAG, new Function0<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.shouldOverrideUrlLoading.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "skipped url: " + url;
                        }
                    });
                    return false;
                }
                return false;
            }
            Logger.INSTANCE.m43468e(TAG, "Invalid URL ");
            return false;
        } catch (Throwable th) {
            if (th instanceof OutOfMemoryError) {
                new OutOfMemory("mraid:" + url).logErrorNoReturnValue$vungle_ads_release();
            }
            return false;
        }
    }
}
