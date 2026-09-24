package com.applovin.impl;

import android.content.Intent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.applovin.impl.adview.C1488a;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.t */
/* JADX INFO: loaded from: classes3.dex */
public class C1772t extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    private final C1748l f3265a;

    /* JADX INFO: renamed from: b */
    private final C1768p f3266b;

    /* JADX INFO: renamed from: c */
    private final C1488a f3267c;

    public C1772t(C1488a c1488a, C1748l c1748l) {
        this.f3265a = c1748l;
        this.f3266b = c1748l.m4782Q();
        this.f3267c = c1488a;
    }

    /* JADX INFO: renamed from: a */
    private void m5205a(String str, ConsoleMessage consoleMessage) {
        String str2;
        AbstractC1736b abstractC1736bM1968g = this.f3267c.m1968g();
        if (abstractC1736bM1968g != null) {
            String str3 = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber();
            if (str == null) {
                str2 = "AdWebView";
            } else {
                str2 = "AdWebView:" + str;
            }
            Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) abstractC1736bM1968g);
            mapM2787a.putAll(AbstractC1568h2.m2788a(abstractC1736bM1968g));
            mapM2787a.put("source", str2);
            mapM2787a.put("top_main_method", str3);
            mapM2787a.put("error_message", consoleMessage.message());
            this.f3265a.m4764E().m2682d(C1548f2.f1534g1, mapM2787a);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
        if (C1768p.m5160a()) {
            this.f3266b.m5178k("AdWebView", "console.log[" + i + "] :" + str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message();
        if (C1768p.m5160a()) {
            this.f3266b.m5171a("AdWebView", str);
        }
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.ERROR) {
            return true;
        }
        String strMessage = consoleMessage.message();
        if (strMessage.contains("al_onPoststitialShow")) {
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.al_onPoststitialShow_evaluation_error"), null);
            m5205a("onPoststitialShowEvaluationError", consoleMessage);
        } else if (strMessage.contains("SyntaxError")) {
            m5205a(null, consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!C1768p.m5160a()) {
            return true;
        }
        this.f3266b.m5178k("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (!C1768p.m5160a()) {
            return true;
        }
        this.f3266b.m5178k("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!C1768p.m5160a()) {
            return true;
        }
        this.f3266b.m5178k("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        C1488a c1488a;
        if (i != 100 || (c1488a = this.f3267c) == null) {
            return;
        }
        c1488a.m1964c(webView);
    }
}
