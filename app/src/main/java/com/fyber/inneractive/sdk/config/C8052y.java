package com.fyber.inneractive.sdk.config;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.util.AbstractC9195v;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.y */
/* JADX INFO: loaded from: classes4.dex */
public final class C8052y extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        if (iAConfigManager.f17666J == webView) {
            iAConfigManager.f17666J = null;
        }
        if (webView == null) {
            return true;
        }
        AbstractC9195v.m22027a(webView);
        webView.destroy();
        return true;
    }
}
