package com.mbridge.msdk.config.dynamic.baseview.webview.client;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView;
import com.mbridge.msdk.config.dynamic.baseview.webview.listener.InterfaceC12891a;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.webview.client.b */
/* JADX INFO: compiled from: MBWebViewClient.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12890b extends WebViewClient {

    /* JADX INFO: renamed from: a */
    private final String f34694a = "MBWebViewClient";

    /* JADX INFO: renamed from: b */
    private InterfaceC12891a f34695b;

    /* JADX INFO: renamed from: a */
    public void m36037a(InterfaceC12891a interfaceC12891a) {
        this.f34695b = interfaceC12891a;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        InterfaceC12891a interfaceC12891a = this.f34695b;
        if (interfaceC12891a != null) {
            interfaceC12891a.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC12891a interfaceC12891a = this.f34695b;
        if (interfaceC12891a != null) {
            interfaceC12891a.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        InterfaceC12891a interfaceC12891a = this.f34695b;
        if (interfaceC12891a != null) {
            interfaceC12891a.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C13219q0.m37816b("MBWebViewClient", "WebView called onRenderProcessGone");
        if (webView != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                if (webView instanceof ComponentWebView) {
                    ComponentWebView componentWebView = (ComponentWebView) webView;
                    if (!componentWebView.isDestroyed()) {
                        componentWebView.destroy();
                    }
                } else {
                    webView.destroy();
                }
            } catch (Throwable th) {
                C13219q0.m37816b("MBWebViewClient", th.getMessage());
                return true;
            }
        }
        InterfaceC12891a interfaceC12891a = this.f34695b;
        if (interfaceC12891a != null) {
            interfaceC12891a.onRenderProcessGone(webView);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InterfaceC12891a interfaceC12891a = this.f34695b;
        return interfaceC12891a != null ? interfaceC12891a.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        InterfaceC12891a interfaceC12891a = this.f34695b;
        if (interfaceC12891a != null) {
            interfaceC12891a.onReceivedError(webView, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        InterfaceC12891a interfaceC12891a = this.f34695b;
        if (interfaceC12891a != null) {
            return interfaceC12891a.shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
