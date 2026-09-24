package com.ironsource;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: renamed from: com.ironsource.i8 */
/* JADX INFO: loaded from: classes6.dex */
public class C12246i8 extends WebViewClient {

    /* JADX INFO: renamed from: b */
    private static final String f30578b = "i8";

    /* JADX INFO: renamed from: a */
    private final InterfaceC11434F8.a f30579a;

    public C12246i8(InterfaceC11434F8.a aVar) {
        this.f30579a = aVar;
    }

    /* JADX INFO: renamed from: a */
    private String m31736a(String str, String str2) {
        return "ISNAdViewWebClient | External Adunit failed to load." + str + " Status code: " + str2;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        try {
            this.f30579a.mo25789a(m31736a("onReceivedError", String.valueOf(i)));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            Logger.m33640e(f30578b, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            this.f30579a.mo25790b(renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system");
            return true;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f30579a.mo25789a(m31736a("onReceivedHttpError", String.valueOf(webResourceResponse.getStatusCode())));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f30579a.mo25789a(m31736a("onReceivedErrorM", String.valueOf(webResourceError.getErrorCode())));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }
}
