package com.applovin.impl.adview;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.AbstractC1534d8;
import com.applovin.impl.AbstractC1568h2;
import com.applovin.impl.AbstractC1664n7;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1795v4;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1711r7;
import com.applovin.impl.C1789u7;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdSize;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.applovin.impl.adview.c */
/* JADX INFO: loaded from: classes3.dex */
public class C1494c extends AbstractC1795v4 {

    /* JADX INFO: renamed from: a */
    private final C1748l f1092a;

    /* JADX INFO: renamed from: b */
    private final C1768p f1093b;

    /* JADX INFO: renamed from: c */
    private final C1488a f1094c;

    public C1494c(C1488a c1488a, C1748l c1748l) {
        this.f1092a = c1748l;
        this.f1093b = c1748l.m4782Q();
        this.f1094c = c1488a;
    }

    /* JADX INFO: renamed from: a */
    private static Map m2001a(AbstractC1736b abstractC1736b, Uri uri, boolean z) {
        Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) abstractC1736b);
        CollectionUtils.putStringIfValid("url", uri.toString(), mapM2787a);
        CollectionUtils.putStringIfValid("is_blocked_auto_redirect", String.valueOf(z), mapM2787a);
        return mapM2787a;
    }

    /* JADX INFO: renamed from: a */
    private void m2002a(Uri uri) {
        String str;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            str = "Tracked event: " + queryParameter;
        } else {
            str = "Failed to track event: " + queryParameter;
        }
        AbstractC1701q7.m4053a(str, C1748l.m4756p());
    }

    /* JADX INFO: renamed from: a */
    private static void m2003a(Uri uri, boolean z, AbstractC1736b abstractC1736b, C1748l c1748l) {
        if (c1748l.m4821c(C1831z4.f3821S6).contains(uri.getScheme())) {
            return;
        }
        c1748l.m4764E().m2682d(C1548f2.f1497Q0, m2001a(abstractC1736b, uri, z));
    }

    /* JADX INFO: renamed from: a */
    private void m2004a(MotionEvent motionEvent) {
        this.f1094c.m1946a(motionEvent);
    }

    /* JADX INFO: renamed from: a */
    private void m2005a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, AbstractC1736b abstractC1736b) {
        if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f1092a.m4801a(C1831z4.f3901c6)).booleanValue()) {
            throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + (abstractC1736b != null ? String.valueOf(abstractC1736b.getAdIdNumber()) : AbstractJsonLexerKt.NULL));
        }
        if (webView == null || !webView.equals(this.f1094c.m1967f())) {
            return;
        }
        this.f1094c.m1959b();
        AppLovinAdSize appLovinAdSizeM1972k = this.f1094c.m1972k();
        if (AbstractC1701q7.m4065a(appLovinAdSizeM1972k)) {
            this.f1094c.m1956a(appLovinAdSizeM1972k);
            this.f1094c.m1943F();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2006a(C1493b c1493b, Uri uri) {
        AbstractC1736b currentAd = c1493b.getCurrentAd();
        AppLovinAdView appLovinAdViewM1970i = this.f1094c.m1970i();
        if (appLovinAdViewM1970i != null && currentAd != null) {
            if (currentAd instanceof C1711r7) {
                ((C1711r7) currentAd).getAdEventTracker().m3647v();
            }
            this.f1094c.m1951a(currentAd, appLovinAdViewM1970i, uri, c1493b.getAndClearLastClickEvent());
        } else if (C1768p.m5160a()) {
            this.f1093b.m5174b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2007a(C1711r7 c1711r7, C1493b c1493b) {
        C1789u7 c1789u7M4228a1 = c1711r7.m4228a1();
        if (c1789u7M4228a1 != null) {
            AbstractC1534d8.m2440a(c1789u7M4228a1.m5315b(), this.f1094c.m1971j());
            m2006a(c1493b, c1789u7M4228a1.m5316c());
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m2008a(boolean z, AbstractC1736b abstractC1736b, Uri uri) {
        if (z) {
            return false;
        }
        boolean zM4506S0 = abstractC1736b.m4506S0();
        m2003a(uri, zM4506S0, abstractC1736b, this.f1092a);
        return zM4506S0;
    }

    /* JADX INFO: renamed from: b */
    private void m2009b() {
        this.f1094c.m1976z();
    }

    /* JADX INFO: renamed from: c */
    private void m2010c() {
        this.f1094c.m1944a();
    }

    @Override // com.applovin.impl.AbstractC1795v4
    /* JADX INFO: renamed from: a */
    protected Map mo1977a() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", "AdWebViewClient");
        mapHashMap.putAll(AbstractC1568h2.m2787a((AppLovinAdImpl) this.f1094c.m1968g()));
        return mapHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:78:0x015d  */
    /* JADX INFO: renamed from: a */
    protected boolean m2011a(WebView webView, String str) {
        boolean z;
        if (this.f1094c == null) {
            return true;
        }
        if (C1768p.m5160a()) {
            this.f1093b.m5175d("AdWebView", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof C1493b)) {
            Uri uri = Uri.parse(str);
            C1493b c1493b = (C1493b) webView;
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            AbstractC1736b abstractC1736bM1968g = this.f1094c.m1968g();
            if (abstractC1736bM1968g == null) {
                if (C1768p.m5160a()) {
                    this.f1093b.m5174b("AdWebView", "Unable to process click, ad not found!");
                }
                return true;
            }
            boolean zM3112a = c1493b.m3112a();
            if (!"applovin".equals(scheme) || !AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equals(host)) {
                Iterator it = abstractC1736bM1968g.m4511V().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    String str2 = (String) it.next();
                    if (StringUtils.isValidString(path) && path.contains(str2)) {
                        z = false;
                        break;
                    }
                }
                if (!zM3112a) {
                    boolean zM4504R0 = abstractC1736bM1968g.m4504R0();
                    boolean z2 = zM4504R0 ? false : z;
                    m2003a(uri, zM4504R0, abstractC1736bM1968g, this.f1092a);
                    z = z2;
                }
                if (z) {
                    List listM4548m0 = abstractC1736bM1968g.m4548m0();
                    List listM4546l0 = abstractC1736bM1968g.m4546l0();
                    if ((listM4548m0.isEmpty() || listM4548m0.contains(scheme)) && (listM4546l0.isEmpty() || listM4546l0.contains(host))) {
                        if (abstractC1736bM1968g instanceof C1711r7) {
                            C1711r7 c1711r7 = (C1711r7) abstractC1736bM1968g;
                            if (c1711r7.m4243q1()) {
                                m2007a(c1711r7, c1493b);
                            } else {
                                m2006a(c1493b, uri);
                            }
                        } else {
                            m2006a(c1493b, uri);
                        }
                    } else if (C1768p.m5160a()) {
                        this.f1093b.m5174b("AdWebView", "URL is not whitelisted - bypassing click");
                    }
                }
            } else if ("/vibrate".equals(path)) {
                long j = StringUtils.parseLong(uri.getQueryParameter("duration_ms"), 0L);
                if (j > 0) {
                    AbstractC1701q7.m4045a(StringUtils.parseFloat(uri.getQueryParameter("intensity"), 0.5f), j, this.f1092a);
                }
            } else if ("/adservice/close_ad".equals(path)) {
                m2009b();
            } else if ("/adservice/expand_ad".equals(path)) {
                if (m2008a(zM3112a, abstractC1736bM1968g, uri)) {
                    if (C1768p.m5160a()) {
                        this.f1093b.m5174b("AdWebView", "Skipping expand command without user interaction");
                    }
                    return true;
                }
                m2004a(c1493b.getLastClickEvent());
            } else if ("/adservice/contract_ad".equals(path)) {
                m2010c();
            } else {
                if ("/adservice/no_op".equals(path)) {
                    return true;
                }
                if ("/adservice/load_url".equals(path)) {
                    if (m2008a(zM3112a, abstractC1736bM1968g, uri)) {
                        if (C1768p.m5160a()) {
                            this.f1093b.m5174b("AdWebView", "Skipping URL load command without user interaction");
                        }
                        return true;
                    }
                    AbstractC1664n7.m3677a(uri, this.f1094c, this.f1092a);
                } else if ("/adservice/track_click_now".equals(path)) {
                    if (m2008a(zM3112a, abstractC1736bM1968g, uri)) {
                        if (C1768p.m5160a()) {
                            this.f1093b.m5174b("AdWebView", "Skipping click tracking command without user interaction");
                        }
                        return true;
                    }
                    if (abstractC1736bM1968g instanceof C1711r7) {
                        m2007a((C1711r7) abstractC1736bM1968g, c1493b);
                    } else {
                        m2006a(c1493b, Uri.parse("/adservice/track_click_now"));
                    }
                } else if ("/adservice/deeplink".equals(path)) {
                    if (m2008a(zM3112a, abstractC1736bM1968g, uri)) {
                        if (C1768p.m5160a()) {
                            this.f1093b.m5174b("AdWebView", "Skipping deep link plus command without user interaction");
                        }
                        return true;
                    }
                    if (abstractC1736bM1968g instanceof C1711r7) {
                        C1711r7 c1711r8 = (C1711r7) abstractC1736bM1968g;
                        if (c1711r8.m4243q1()) {
                            m2007a(c1711r8, c1493b);
                        } else {
                            m2006a(c1493b, uri);
                        }
                    } else {
                        m2006a(c1493b, uri);
                    }
                } else if ("/adservice/postback".equals(path)) {
                    AbstractC1664n7.m3680a(uri, abstractC1736bM1968g, this.f1092a);
                } else if ("/ga_init".equals(path)) {
                    this.f1094c.m1963c(uri);
                } else if ("/ga_event".equals(path)) {
                    this.f1094c.m1960b(uri);
                } else if ("/playable_event".equals(path)) {
                    m2002a(uri);
                } else if ("/save_template_state".equals(path)) {
                    abstractC1736bM1968g.m4526b(uri.getQueryParameter("state"));
                } else if ("/template_error".equals(path)) {
                    AbstractC1664n7.m3690c(uri, abstractC1736bM1968g, this.f1092a);
                } else if ("/adservice/fully_watched".equals(path)) {
                    this.f1094c.m1939A();
                } else if ("/adservice/preload".equals(path)) {
                    AbstractC1664n7.m3688b(uri, abstractC1736bM1968g, this.f1092a);
                } else if ("/adservice/custom_intent".equals(path)) {
                    AbstractC1664n7.m3679a(uri, abstractC1736bM1968g, this.f1094c.m1970i(), this.f1092a);
                } else if ("/config_system_bars".equals(path)) {
                    this.f1094c.m1945a(uri);
                } else {
                    if (C1768p.m5160a()) {
                        this.f1093b.m5178k("AdWebView", "Unknown URL: " + str);
                    }
                    if (C1768p.m5160a()) {
                        this.f1093b.m5178k("AdWebView", "Path: " + path);
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    protected C1488a m2012d() {
        return this.f1094c;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (C1768p.m5160a()) {
            this.f1093b.m5175d("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (C1768p.m5160a()) {
            this.f1093b.m5175d("AdWebView", "Loaded URL: " + str);
        }
        this.f1094c.m1947a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        AbstractC1736b abstractC1736bM1968g = this.f1094c.m1968g();
        String str3 = "Received error with error code: " + i + " with description \\'" + str + "\\' for URL: " + str2;
        if (C1768p.m5160a()) {
            this.f1093b.m5174b("AdWebView", str3 + " for ad: " + abstractC1736bM1968g);
        }
        if (AbstractC1701q7.m4067a(str2, this.f1092a)) {
            this.f1092a.m4764E().m4330a("adWebViewReceivedError", str2, i, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        AbstractC1736b abstractC1736bM1968g = this.f1094c.m1968g();
        if (C1768p.m5160a()) {
            this.f1093b.m5174b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + abstractC1736bM1968g);
        }
        if (AbstractC1701q7.m4067a(webResourceRequest.getUrl().toString(), this.f1092a)) {
            this.f1092a.m4764E().m4330a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        AbstractC1736b abstractC1736bM1968g = this.f1094c.m1968g();
        String str = "Received SSL error: " + sslError;
        if (C1768p.m5160a()) {
            this.f1093b.m5174b("AdWebView", str + " for ad: " + abstractC1736bM1968g);
        }
    }

    @Override // com.applovin.impl.AbstractC1795v4, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        AbstractC1736b abstractC1736bM1968g = this.f1094c.m1968g();
        C1768p.m5167h("AdWebView", "Render process gone for ad: " + abstractC1736bM1968g + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        boolean zOnRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (((Boolean) this.f1092a.m4801a(C1831z4.f3844V5)).booleanValue()) {
            m2005a(webView, renderProcessGoneDetail, abstractC1736bM1968g);
        }
        return zOnRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return m2011a(webView, url.toString());
        }
        if (!C1768p.m5160a()) {
            return false;
        }
        this.f1093b.m5174b("AdWebView", "No url found for request");
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return m2011a(webView, str);
    }
}
