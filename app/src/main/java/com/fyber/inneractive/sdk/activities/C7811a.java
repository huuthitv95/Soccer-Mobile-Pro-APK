package com.fyber.inneractive.sdk.activities;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.flow.C8121g;
import com.fyber.inneractive.sdk.flow.InterfaceC8123h;
import com.fyber.inneractive.sdk.network.AbstractC8434z;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.util.AbstractC9161j1;
import com.fyber.inneractive.sdk.util.AbstractC9181q0;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C7811a extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FyberReportAdActivity f17485a;

    public C7811a(FyberReportAdActivity fyberReportAdActivity) {
        this.f17485a = fyberReportAdActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        IAlog.m21950f("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(i), str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC8434z.m20811a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", null, null);
        FyberReportAdActivity fyberReportAdActivity = this.f17485a;
        if (fyberReportAdActivity.f17456b == webView) {
            fyberReportAdActivity.f17456b = null;
        }
        if (webView != null) {
            AbstractC9195v.m22027a(webView);
            webView.destroy();
        }
        this.f17485a.finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InterfaceC8123h interfaceC8123h;
        if (str == null) {
            return false;
        }
        if (AbstractC9161j1.m21972a(str)) {
            WebView webView2 = this.f17485a.f17456b;
            if (webView2 != null) {
                webView2.loadUrl("chrome://crash");
            }
            return true;
        }
        if (!str.startsWith("fybermarketplace://reportAd?") || (interfaceC8123h = FyberReportAdActivity.f17455f) == null) {
            return false;
        }
        String strSubstring = str.substring(28);
        C8121g c8121g = (C8121g) interfaceC8123h;
        c8121g.getClass();
        C8428w c8428w = new C8428w(EnumC8424u.FYBER_REPORT_AD, c8121g.f18070b, c8121g.f18071c);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", strSubstring);
        } catch (Exception unused) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "message", strSubstring);
        }
        c8428w.f18758f.put(jSONObject);
        c8428w.f18759g = true;
        c8428w.m20808a((String) null);
        WebView webView3 = this.f17485a.f17456b;
        if (webView3 != null) {
            AbstractC9181q0.m22008a(webView3, "reportSent();");
        }
        return true;
    }
}
