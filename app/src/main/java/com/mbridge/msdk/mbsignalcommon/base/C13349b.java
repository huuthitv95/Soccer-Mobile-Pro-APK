package com.mbridge.msdk.mbsignalcommon.base;

import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.io.File;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.base.b */
/* JADX INFO: compiled from: BaseWebViewClient.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13349b extends WebViewClient {

    /* JADX INFO: renamed from: a */
    private InterfaceC13348a f37044a;

    /* JADX INFO: renamed from: b */
    private InterfaceC13389c f37045b;

    /* JADX INFO: renamed from: a */
    protected boolean m38609a(String str, String str2) {
        try {
            return new File(str).getCanonicalFile().getPath().startsWith(new File(str2).getCanonicalFile().getPath());
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        InterfaceC13389c interfaceC13389c = this.f37045b;
        if (interfaceC13389c != null) {
            interfaceC13389c.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        InterfaceC13389c interfaceC13389c = this.f37045b;
        if (interfaceC13389c != null) {
            interfaceC13389c.onReceivedError(webView, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        InterfaceC13389c interfaceC13389c = this.f37045b;
        if (interfaceC13389c != null) {
            interfaceC13389c.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C13219q0.m37816b("BaseWebViewClient", "WebView called onRenderProcessGone");
        if (webView != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                if (webView instanceof WindVaneWebView) {
                    ((WindVaneWebView) webView).release();
                } else {
                    webView.destroy();
                }
            } catch (Throwable th) {
                C13219q0.m37816b("BaseWebViewClient", th.getMessage());
                return true;
            }
        }
        InterfaceC13389c interfaceC13389c = this.f37045b;
        if (interfaceC13389c != null) {
            interfaceC13389c.onRenderProcessGone(webView);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InterfaceC13348a interfaceC13348a = this.f37044a;
        if (interfaceC13348a != null && interfaceC13348a.mo38605a(str)) {
            return true;
        }
        InterfaceC13389c interfaceC13389c = this.f37045b;
        if (interfaceC13389c != null) {
            interfaceC13389c.shouldOverrideUrlLoading(webView, str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    /* JADX INFO: renamed from: a */
    public void m38607a(InterfaceC13348a interfaceC13348a) {
        this.f37044a = interfaceC13348a;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13348a m38606a() {
        return this.f37044a;
    }

    /* JADX INFO: renamed from: a */
    public void m38608a(InterfaceC13389c interfaceC13389c) {
        this.f37045b = interfaceC13389c;
    }
}
