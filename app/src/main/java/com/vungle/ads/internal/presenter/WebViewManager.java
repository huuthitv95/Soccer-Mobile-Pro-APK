package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.webkit.WebView;
import com.ironsource.C11540L6;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.p298ui.VungleWebClient;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.platform.WebViewUtil;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WebViewManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001(B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0004J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJM\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\b&\u0010'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002"}, m43475d2 = {"Lcom/vungle/ads/internal/presenter/WebViewManager;", "", "()V", "TAG", "", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "webViewCache", "Ljava/util/LinkedHashMap;", "Lcom/vungle/ads/internal/presenter/WebViewManager$WebViewEntry;", "Lkotlin/collections/LinkedHashMap;", "destroyWebView", "", "key", "destroyWebViewInternal", "getOrCreateWebView", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "getOrCreateWebViewClient", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "offloadExecutor", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", C11540L6.f24917H, "Lcom/vungle/ads/internal/platform/Platform;", "preloadWebView", "adv", "templatePath", "webSettings", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "delegate", "Lcom/vungle/ads/internal/presenter/PreloadDelegate;", "loadDuration", "", "preloadWebView$vungle_ads_release", "(Landroid/content/Context;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Lcom/vungle/ads/internal/presenter/PreloadDelegate;Ljava/lang/Long;)V", "WebViewEntry", "vungle-ads_release", "executors", "Lcom/vungle/ads/internal/executor/Executors;"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public final class WebViewManager {
    private static final String TAG = "WebViewManager";
    public static final WebViewManager INSTANCE = new WebViewManager();
    private static final ReentrantLock lock = new ReentrantLock();
    private static final LinkedHashMap<String, WebViewEntry> webViewCache = new LinkedHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: WebViewManager.kt */
    @Metadata(m43474d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m43475d2 = {"Lcom/vungle/ads/internal/presenter/WebViewManager$WebViewEntry;", "", "webView", "Landroid/webkit/WebView;", "webViewClient", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "(Landroid/webkit/WebView;Lcom/vungle/ads/internal/ui/VungleWebClient;)V", "getWebView", "()Landroid/webkit/WebView;", "getWebViewClient", "()Lcom/vungle/ads/internal/ui/VungleWebClient;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
    static final /* data */ class WebViewEntry {
        private final WebView webView;
        private final VungleWebClient webViewClient;

        public WebViewEntry(WebView webView, VungleWebClient webViewClient) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
            this.webView = webView;
            this.webViewClient = webViewClient;
        }

        public static /* synthetic */ WebViewEntry copy$default(WebViewEntry webViewEntry, WebView webView, VungleWebClient vungleWebClient, int i, Object obj) {
            if ((i & 1) != 0) {
                webView = webViewEntry.webView;
            }
            if ((i & 2) != 0) {
                vungleWebClient = webViewEntry.webViewClient;
            }
            return webViewEntry.copy(webView, vungleWebClient);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final WebView getWebView() {
            return this.webView;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final VungleWebClient getWebViewClient() {
            return this.webViewClient;
        }

        public final WebViewEntry copy(WebView webView, VungleWebClient webViewClient) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
            return new WebViewEntry(webView, webViewClient);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebViewEntry)) {
                return false;
            }
            WebViewEntry webViewEntry = (WebViewEntry) other;
            return Intrinsics.areEqual(this.webView, webViewEntry.webView) && Intrinsics.areEqual(this.webViewClient, webViewEntry.webViewClient);
        }

        public final WebView getWebView() {
            return this.webView;
        }

        public final VungleWebClient getWebViewClient() {
            return this.webViewClient;
        }

        public int hashCode() {
            return (this.webView.hashCode() * 31) + this.webViewClient.hashCode();
        }

        public String toString() {
            return "WebViewEntry(webView=" + this.webView + ", webViewClient=" + this.webViewClient + ')';
        }
    }

    private WebViewManager() {
    }

    private final void destroyWebViewInternal(String key) {
        webViewCache.remove(key);
    }

    public final void destroyWebView(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            INSTANCE.destroyWebViewInternal(key);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final WebView getOrCreateWebView(Context context, String key) {
        WebView webView;
        Intrinsics.checkNotNullParameter(context, "context");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            LinkedHashMap<String, WebViewEntry> linkedHashMap = webViewCache;
            WebViewEntry webViewEntry = linkedHashMap.get(key);
            if (webViewEntry != null) {
                Logger.INSTANCE.m43467d(TAG, "Reusing cached webview. Cache size: " + linkedHashMap.size());
                webView = webViewEntry.getWebView();
            } else {
                Logger.INSTANCE.m43467d(TAG, "Creating new webview. Cache size: " + linkedHashMap.size());
                webView = new WebView(context);
            }
            return webView;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final VungleWebClient getOrCreateWebViewClient(AdPayload advertisement, Placement placement, VungleThreadPoolExecutor offloadExecutor, Platform platform) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        Intrinsics.checkNotNullParameter(platform, "platform");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            WebViewEntry webViewEntry = webViewCache.get(advertisement.eventId());
            VungleWebClient webViewClient = webViewEntry != null ? webViewEntry.getWebViewClient() : null;
            if (webViewClient == null) {
                webViewClient = new VungleWebClient(advertisement, placement, offloadExecutor, platform, null, null, 48, null);
            }
            return webViewClient;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void preloadWebView$vungle_ads_release(final Context context, final AdPayload adv, final Placement placement, final String templatePath, final AdPayload.WebViewSettings webSettings, final PreloadDelegate delegate, final Long loadDuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adv, "adv");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(templatePath, "templatePath");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            Logger.Companion companion = Logger.INSTANCE;
            StringBuilder sb = new StringBuilder("Preload webview start. Cache size: ");
            LinkedHashMap<String, WebViewEntry> linkedHashMap = webViewCache;
            sb.append(linkedHashMap.size());
            companion.m43467d(TAG, sb.toString());
            final String strEventId = adv.eventId();
            if (!linkedHashMap.containsKey(strEventId)) {
                ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke$lambda-3$lambda-1, reason: not valid java name */
                    private static final Executors m44815invoke$lambda3$lambda1(Lazy<? extends Executors> lazy) {
                        return lazy.getValue();
                    }

                    /* JADX INFO: renamed from: invoke$lambda-3$lambda-2, reason: not valid java name */
                    private static final Platform m44816invoke$lambda3$lambda2(Lazy<? extends Platform> lazy) {
                        return lazy.getValue();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object objM44946constructorimpl;
                        WebViewManager webViewManager = WebViewManager.INSTANCE;
                        final Context context2 = context;
                        AdPayload adPayload = adv;
                        Placement placement2 = placement;
                        PreloadDelegate preloadDelegate = delegate;
                        Long l = loadDuration;
                        String str = templatePath;
                        String str2 = strEventId;
                        AdPayload.WebViewSettings webViewSettings = webSettings;
                        try {
                            Result.Companion companion2 = Result.INSTANCE;
                            WebView webView = new WebView(context2.getApplicationContext());
                            WebViewUtil.INSTANCE.applyWebSettings(webView, webViewSettings);
                            ServiceLocator.Companion companion3 = ServiceLocator.INSTANCE;
                            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Executors>() { // from class: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1$invoke$lambda-3$$inlined$inject$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                public final Executors invoke() {
                                    return ServiceLocator.INSTANCE.getInstance(context2).getService(Executors.class);
                                }
                            });
                            ServiceLocator.Companion companion4 = ServiceLocator.INSTANCE;
                            VungleWebClient vungleWebClient = new VungleWebClient(adPayload, placement2, m44815invoke$lambda3$lambda1(lazy).getOffloadExecutor(), m44816invoke$lambda3$lambda2(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Platform>() { // from class: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1$invoke$lambda-3$$inlined$inject$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                public final Platform invoke() {
                                    return ServiceLocator.INSTANCE.getInstance(context2).getService(Platform.class);
                                }
                            })), preloadDelegate, l);
                            vungleWebClient.setConsentStatus(ConfigManager.INSTANCE.getGDPRIsCountryDataProtected() && Intrinsics.areEqual("unknown", PrivacyManager.INSTANCE.getConsentStatus()), ConfigManager.INSTANCE.getGDPRConsentTitle(), ConfigManager.INSTANCE.getGDPRConsentMessage(), ConfigManager.INSTANCE.getGDPRButtonAccept(), ConfigManager.INSTANCE.getGDPRButtonDeny());
                            webView.setWebViewClient(vungleWebClient);
                            webView.loadUrl(str);
                            WebViewManager.webViewCache.put(String.valueOf(str2), new WebViewManager.WebViewEntry(webView, vungleWebClient));
                            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.CONCURRENT_CACHED_WEBVIEW_COUNT, WebViewManager.webViewCache.size(), adPayload.getLogEntry(), null, 8, null);
                            objM44946constructorimpl = Result.m44946constructorimpl(Integer.valueOf(Logger.INSTANCE.m43467d("WebViewManager", "Preload complete. Cache size: " + WebViewManager.webViewCache.size())));
                        } catch (Throwable th) {
                            Result.Companion companion5 = Result.INSTANCE;
                            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
                        }
                        PreloadDelegate preloadDelegate2 = delegate;
                        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
                        if (thM44949exceptionOrNullimpl != null) {
                            Logger.INSTANCE.m43469e("WebViewManager", "Preload webview failed", thM44949exceptionOrNullimpl);
                            preloadDelegate2.onAdReadyToPlay();
                        }
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
