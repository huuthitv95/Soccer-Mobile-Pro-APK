package com.fyber.inneractive.sdk.config;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.g0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC7966g0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        WebView webView2 = iAConfigManager.f17666J;
        if (webView2 == null || iAConfigManager.f17674f == null) {
            return;
        }
        webView2.destroy();
        try {
            webView = new WebView(iAConfigManager.f17674f);
            webView.setWebViewClient(new C8052y());
        } catch (Throwable unused) {
            IAlog.m21945a("failed to create a new webview", new Object[0]);
            webView = null;
        }
        iAConfigManager.f17666J = webView;
    }
}
