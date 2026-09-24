package com.mbridge.msdk.mbsignalcommon.listener;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.listener.b */
/* JADX INFO: compiled from: DefaultWebViewListener.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13377b implements InterfaceC13389c {
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    /* JADX INFO: renamed from: a */
    public void mo34467a(WebView webView, int i) {
        C13219q0.m37813a("WindVaneWebView", "readyState");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    /* JADX INFO: renamed from: b */
    public void mo38121b(WebView webView, int i) {
        C13219q0.m37813a("WindVaneWebView", "loadingResourceStatus");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    public void onPageFinished(WebView webView, String str) {
        C13219q0.m37813a("WindVaneWebView", "onPageFinished");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C13219q0.m37813a("WindVaneWebView", "onPageStarted");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    public void onProgressChanged(WebView webView, int i) {
        C13219q0.m37813a("WindVaneWebView", "onProgressChanged");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        C13219q0.m37813a("WindVaneWebView", "onReceivedError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C13219q0.m37813a("WindVaneWebView", "onReceivedSslError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    public void onRenderProcessGone(WebView webView) {
        C13219q0.m37813a("WindVaneWebView", "onRenderProcessGone");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C13219q0.m37813a("WindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }
}
