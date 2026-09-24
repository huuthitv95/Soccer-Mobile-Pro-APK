package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.chartboost.sdk.Chartboost;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.s5 */
/* JADX INFO: loaded from: classes3.dex */
public class C4042s5 extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4064t5 f16222a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3888l7 f16223b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3868ka f16224c;

    /* JADX INFO: renamed from: d */
    public final C3920mg f16225d;

    public C4042s5(InterfaceC4064t5 interfaceC4064t5, InterfaceC3888l7 interfaceC3888l7, InterfaceC3868ka interfaceC3868ka, C3920mg c3920mg) {
        this.f16222a = interfaceC4064t5;
        this.f16223b = interfaceC3888l7;
        this.f16224c = interfaceC3868ka;
        this.f16225d = c3920mg;
    }

    /* JADX INFO: renamed from: a */
    public final void m19386a(String str) {
        InterfaceC4064t5 interfaceC4064t5 = this.f16222a;
        if (interfaceC4064t5 != null) {
            interfaceC4064t5.mo18759a(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        InterfaceC4064t5 interfaceC4064t5 = this.f16222a;
        if (interfaceC4064t5 != null) {
            interfaceC4064t5.mo18761c();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (Build.VERSION.SDK_INT >= 26) {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                C4048sb.m19407a("WebView version: " + currentWebViewPackage.versionName, null);
            } else {
                m19386a("Device was not set up correctly.");
            }
        }
        this.f16222a.mo18760b();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        m19386a("Error loading " + str2 + ": " + str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            m19386a("Error loading " + webResourceRequest.getUrl().toString() + ": " + ((Object) webResourceError.getDescription()));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        StringBuilder sb = new StringBuilder("Error loading ");
        sb.append(webResourceRequest.getUrl().toString());
        sb.append(": ");
        sb.append(webResourceResponse == null ? "unknown error" : webResourceResponse.getReasonPhrase());
        C4048sb.m19407a(sb.toString(), null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        InterfaceC3888l7 interfaceC3888l7 = this.f16223b;
        if (!Chartboost.isSdkStarted() || interfaceC3888l7 == null) {
            C4048sb.m19410b("SDK is not initialized. Cannot track SSL error: " + sslError, null);
        } else {
            try {
                interfaceC3888l7.mo43989track(C3796h7.m17868a(InterfaceC3807hi.i.WEBVIEW_SSL_ERROR, sslError.toString()));
            } catch (Exception e) {
                C4048sb.m19410b("Failed to track SSL error: " + sslError, e);
            }
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String str;
        if (renderProcessGoneDetail.didCrash()) {
            str = "Webview crashed: " + renderProcessGoneDetail;
        } else {
            str = "Webview killed, likely due to low memory";
        }
        m19386a(str);
        if (webView == null || !(webView.getContext() instanceof Activity)) {
            return true;
        }
        ((Activity) webView.getContext()).finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!this.f16225d.f15357A) {
            return false;
        }
        this.f16224c.mo18375b(new C3884l3(webResourceRequest.getUrl().toString(), Boolean.FALSE));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!this.f16225d.f15357A) {
            return false;
        }
        this.f16224c.mo18375b(new C3884l3(str, Boolean.FALSE));
        return true;
    }
}
