package com.mbridge.msdk.mbsignalcommon.windvane;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.windvane.c */
/* JADX INFO: compiled from: IWebViewListener.java */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC13389c {
    /* JADX INFO: renamed from: a */
    void mo34467a(WebView webView, int i);

    /* JADX INFO: renamed from: b */
    void mo38121b(WebView webView, int i);

    void onPageFinished(WebView webView, String str);

    void onPageStarted(WebView webView, String str, Bitmap bitmap);

    void onProgressChanged(WebView webView, int i);

    void onReceivedError(WebView webView, int i, String str, String str2);

    void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    void onRenderProcessGone(WebView webView);

    boolean shouldOverrideUrlLoading(WebView webView, String str);
}
