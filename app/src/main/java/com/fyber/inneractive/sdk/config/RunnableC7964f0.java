package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C11341A5;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.f0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC7964f0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f17727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f17728b;

    public RunnableC7964f0(String str, String str2) {
        this.f17727a = str;
        this.f17728b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        WebView webView;
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        if (iAConfigManager.f17666J == null && (context = iAConfigManager.f17674f) != null) {
            try {
                webView = new WebView(context);
                webView.setWebViewClient(new C8052y());
            } catch (Throwable unused) {
                IAlog.m21945a("failed to create a new webview", new Object[0]);
                webView = null;
            }
            iAConfigManager.f17666J = webView;
        }
        WebView webView2 = iAConfigManager.f17666J;
        String str = this.f17727a;
        String str2 = this.f17728b;
        if (webView2 != null) {
            if (str2 == null) {
                str2 = "";
            }
            webView2.loadDataWithBaseURL(str, str2, "text/html", C11341A5.f23802O, null);
        }
        AbstractC9183r.f21478b.postDelayed(IAConfigManager.f17656O, TimeUnit.SECONDS.toMillis(10L));
    }
}
