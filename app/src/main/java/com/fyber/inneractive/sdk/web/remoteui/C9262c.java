package com.fyber.inneractive.sdk.web.remoteui;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.network.events.EnumC8372b;
import com.fyber.inneractive.sdk.player.p277ui.remote.InterfaceC8895a;
import com.fyber.inneractive.sdk.util.AbstractC9154h0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.remoteui.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C9262c extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public InterfaceC9260a f21664a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8895a f21665b;

    public C9262c(InterfaceC9260a interfaceC9260a, InterfaceC8895a interfaceC8895a) {
        this.f21664a = interfaceC9260a;
        this.f21665b = interfaceC8895a;
    }

    /* JADX INFO: renamed from: a */
    public final void m22089a(EnumC8372b enumC8372b, String str, String str2) {
        HashMap map;
        if (this.f21664a != null) {
            if (TextUtils.isEmpty(str2)) {
                map = null;
            } else {
                HashMap map2 = new HashMap(1);
                map2.put("failedURL", str2);
                map = map2;
            }
            this.f21664a.mo21463a(enumC8372b, str, true, map);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m22090a(String str, RenderProcessGoneDetail renderProcessGoneDetail) {
        String strValueOf = "unknown";
        if (Build.VERSION.SDK_INT >= 26) {
            strValueOf = renderProcessGoneDetail != null ? String.valueOf(renderProcessGoneDetail.didCrash()) : "unknown";
            IAlog.m21945a("%s: onRenderProcessGone: handled, webview crashed: %s view: %s", "RemoteUiWebViewClient", strValueOf, str);
        } else {
            IAlog.m21945a("%s: onRenderProcessGone: handled, view: %s", "RemoteUiWebViewClient", str);
        }
        m22089a(EnumC8372b.WEB_VIEW_CRASH_ERROR, "Webview did crash: " + strValueOf + " on webview: " + str, null);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        IAlog.m21945a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "RemoteUiWebViewClient", str, Integer.valueOf(i), str2);
        String str3 = str + " errCode: " + i;
        EnumC8372b enumC8372b = EnumC8372b.TEMPLATE_CONTENT_ERROR;
        if (!AbstractC9154h0.m21969e(str2)) {
            str2 = null;
        }
        m22089a(enumC8372b, str3, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int errorCode;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String string = "";
        if (webResourceError != null) {
            string = webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : "";
            errorCode = webResourceError.getErrorCode();
        } else {
            errorCode = -999;
        }
        String string2 = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? "unknown" : webResourceRequest.getUrl().toString();
        IAlog.m21945a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "RemoteUiWebViewClient", string, Integer.valueOf(errorCode), string2);
        String str = string + " errCode: " + errorCode;
        EnumC8372b enumC8372b = EnumC8372b.TEMPLATE_CONTENT_ERROR;
        if (!AbstractC9154h0.m21969e(string2)) {
            string2 = null;
        }
        m22089a(enumC8372b, str, string2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        int statusCode = webResourceResponse != null ? webResourceResponse.getStatusCode() : -1;
        String string = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? "" : webResourceRequest.getUrl().toString();
        IAlog.m21945a("%s: onReceivedHttpError: errorCode: %d, failing url: %s", "RemoteUiWebViewClient", Integer.valueOf(statusCode), string);
        m22089a(EnumC8372b.HTTP_ERROR, String.valueOf(statusCode), string);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        String url = sslError != null ? sslError.getUrl() : "";
        IAlog.m21945a("%s: onReceivedSslError: failing url: %s", "RemoteUiWebViewClient", url);
        m22089a(EnumC8372b.SSL_ERROR, null, url);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == null) {
            m22090a("unknown", renderProcessGoneDetail);
            return true;
        }
        m22090a(webView.toString(), renderProcessGoneDetail);
        webView.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "unknown";
        if (url != null && !TextUtils.isEmpty(url.getScheme()) && !TextUtils.isEmpty(url.getAuthority()) && !TextUtils.isEmpty(url.getHost())) {
            Locale locale = Locale.US;
            if ("FyRemote://".toLowerCase(locale).contains(url.getScheme().toLowerCase(locale))) {
                HashMap mapM21964a = AbstractC9154h0.m21964a(url);
                String host = url.getHost();
                InterfaceC8895a interfaceC8895a = this.f21665b;
                if (interfaceC8895a != null) {
                    interfaceC8895a.mo21461a(host, mapM21964a);
                }
            }
        }
        IAlog.m21945a("%s: shouldOverrideUrlLoading: url: %s", "RemoteUiWebViewClient", string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IAlog.m21945a("%s: shouldOverrideUrlLoading: url: %s", "RemoteUiWebViewClient", str);
        Uri uri = Uri.parse(str);
        if (uri != null && !TextUtils.isEmpty(uri.getScheme()) && !TextUtils.isEmpty(uri.getAuthority()) && !TextUtils.isEmpty(uri.getHost())) {
            Locale locale = Locale.US;
            if ("FyRemote://".toLowerCase(locale).contains(uri.getScheme().toLowerCase(locale))) {
                HashMap mapM21964a = AbstractC9154h0.m21964a(uri);
                String host = uri.getHost();
                InterfaceC8895a interfaceC8895a = this.f21665b;
                if (interfaceC8895a != null) {
                    interfaceC8895a.mo21461a(host, mapM21964a);
                }
            }
        }
        return true;
    }
}
