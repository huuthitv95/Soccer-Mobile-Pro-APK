package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;

/* JADX INFO: renamed from: com.applovin.impl.adview.d */
/* JADX INFO: loaded from: classes3.dex */
class C1495d {

    /* JADX INFO: renamed from: a */
    private final C1748l f1095a;

    /* JADX INFO: renamed from: b */
    private final WebViewRenderProcessClient f1096b = new a();

    /* JADX INFO: renamed from: com.applovin.impl.adview.d$a */
    class a extends WebViewRenderProcessClient {
        a() {
        }

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof C1493b) {
                AbstractC1736b currentAd = ((C1493b) webView).getCurrentAd();
                C1495d.this.f1095a.m4782Q();
                if (C1768p.m5160a()) {
                    C1495d.this.f1095a.m4782Q().m5174b("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    }

    C1495d(C1748l c1748l) {
        this.f1095a = c1748l;
    }

    /* JADX INFO: renamed from: a */
    WebViewRenderProcessClient m2014a() {
        return this.f1096b;
    }
}
