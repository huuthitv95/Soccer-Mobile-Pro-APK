package com.bytedance.sdk.component.jbs;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends WebViewClient {

    /* JADX INFO: renamed from: ik */
    private final List<String> f7491ik;

    /* JADX INFO: renamed from: lr */
    private final C2640ri.ri f7492lr;

    /* JADX INFO: renamed from: ri */
    private final WebViewClient f7493ri;

    public xha(C2640ri.ri riVar, WebViewClient webViewClient, List<String> list) {
        this.f7492lr = riVar;
        this.f7493ri = webViewClient;
        this.f7491ik = list;
    }

    /* JADX INFO: renamed from: ri */
    private int m9832ri(WebView webView) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                return webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.f7493ri.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C2640ri.ri riVar = this.f7492lr;
        if (riVar != null) {
            riVar.mo9825ri(m9832ri(webView));
        }
        this.f7493ri.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f7493ri.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f7493ri.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f7493ri.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f7493ri.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return Build.VERSION.SDK_INT >= 26 ? this.f7493ri.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C2640ri.ri riVar;
        if (C2638lr.m9799ri(this.f7491ik, webResourceRequest.getUrl().toString()) && (riVar = this.f7492lr) != null) {
            riVar.mo9824ri();
        }
        return this.f7493ri.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.f7493ri.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C2640ri.ri riVar = this.f7492lr;
        if (riVar != null) {
            riVar.mo9824ri();
        }
        return this.f7493ri.shouldOverrideUrlLoading(webView, str);
    }
}
