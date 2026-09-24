package com.mbridge.msdk.mbsignalcommon.listener;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.listener.a */
/* JADX INFO: compiled from: DefaultRVWebViewListener.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13376a implements InterfaceC13389c {
    /* JADX INFO: renamed from: a */
    public void mo38672a(Object obj) {
        C13219q0.m37813a("RVWindVaneWebView", "getEndScreenInfo");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    /* JADX INFO: renamed from: b */
    public void mo38121b(WebView webView, int i) {
        C13219q0.m37813a("RVWindVaneWebView", "loadingResourceStatus");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    public void onPageFinished(WebView webView, String str) {
        C13219q0.m37813a("RVWindVaneWebView", "onPageFinished");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C13219q0.m37813a("RVWindVaneWebView", "onPageStarted");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    public void onProgressChanged(WebView webView, int i) {
        C13219q0.m37813a("RVWindVaneWebView", "onProgressChanged");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        C13219q0.m37813a("RVWindVaneWebView", "onReceivedError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C13219q0.m37813a("RVWindVaneWebView", "onReceivedSslError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    public void onRenderProcessGone(WebView webView) {
        C13219q0.m37813a("RVWindVaneWebView", "onRenderProcessGone");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C13219q0.m37813a("RVWindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void mo38671a(WebView webView, String str, String str2, int i, int i2) {
        C13219q0.m37813a("RVWindVaneWebView", "loadAds");
    }

    /* JADX INFO: renamed from: a */
    public void mo38673a(Object obj, String str) {
        C13219q0.m37813a("RVWindVaneWebView", "operateComponent");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
    /* JADX INFO: renamed from: a */
    public void mo34467a(WebView webView, int i) {
        C13219q0.m37813a("RVWindVaneWebView", "readyState");
    }
}
