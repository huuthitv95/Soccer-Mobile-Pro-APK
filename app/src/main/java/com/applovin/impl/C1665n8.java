package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.network.C1766e;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.applovin.impl.n8 */
/* JADX INFO: loaded from: classes3.dex */
public class C1665n8 {

    /* JADX INFO: renamed from: a */
    private final C1748l f2429a;

    /* JADX INFO: renamed from: b */
    private final C1768p f2430b;

    /* JADX INFO: renamed from: c */
    private WebView f2431c;

    /* JADX INFO: renamed from: d */
    private boolean f2432d;

    /* JADX INFO: renamed from: e */
    private final Set f2433e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.n8$a */
    class a extends AbstractC1795v4 {

        /* JADX INFO: renamed from: a */
        private final boolean f2434a;

        public a(boolean z) {
            this.f2434a = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public /* synthetic */ void m3708b() {
            C1665n8.this.f2431c.destroy();
            C1665n8.this.f2431c = null;
        }

        @Override // com.applovin.impl.AbstractC1795v4
        /* JADX INFO: renamed from: a */
        protected Map mo1977a() {
            return CollectionUtils.hashMap("name", "WebTrackerManagerWebViewClient");
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.f2434a) {
                C1768p unused = C1665n8.this.f2430b;
                if (C1768p.m5160a()) {
                    C1665n8.this.f2430b.m5171a("WebTrackerManager", "Successfully initialized web view for postbacks");
                }
                C1665n8.this.f2432d = true;
            }
        }

        @Override // com.applovin.impl.AbstractC1795v4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView == C1665n8.this.f2431c) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.n8$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3708b();
                    }
                });
            } else {
                C1665n8.this.m3700b(webView);
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    public C1665n8(C1748l c1748l) {
        this.f2429a = c1748l;
        this.f2430b = c1748l.m4782Q();
    }

    /* JADX INFO: renamed from: a */
    private WebView m3692a(String str) {
        return m3693a(str, false);
    }

    /* JADX INFO: renamed from: a */
    private WebView m3693a(String str, boolean z) {
        AbstractC1701q7.m4079b();
        WebView webViewM4075b = AbstractC1701q7.m4075b(C1748l.m4756p(), "web tracker");
        if (webViewM4075b == null) {
            return null;
        }
        webViewM4075b.getSettings().setJavaScriptEnabled(true);
        webViewM4075b.setWebViewClient(new a(z && m3704c()));
        webViewM4075b.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return webViewM4075b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3695a() {
        WebView webViewM3693a = m3693a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.f2431c = webViewM3693a;
        if (webViewM3693a == null && C1768p.m5160a()) {
            this.f2430b.m5174b("WebTrackerManager", "Failed to preload postback web view");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m3700b(final WebView webView) {
        if (webView == null || !this.f2433e.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.n8$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                webView.destroy();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3697a(AppLovinPostbackListener appLovinPostbackListener, String str, boolean z, String str2, String str3) {
        if (z) {
            appLovinPostbackListener.onPostbackSuccess(str);
            return;
        }
        appLovinPostbackListener.onPostbackFailure(str, -1);
        Map map = CollectionUtils.map("top_main_method", "firePostback");
        map.put("source", "evaluateJavascriptFailed");
        map.put("url", str);
        CollectionUtils.putStringIfValid("error_message", str3, map);
        this.f2429a.m4764E().m2682d(C1548f2.f1540i1, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m3702b(C1766e c1766e, final AppLovinPostbackListener appLovinPostbackListener) {
        final String strAppendQueryParameters = StringUtils.appendQueryParameters(c1766e.m5023f(), c1766e.m5026i(), ((Boolean) this.f2429a.m4801a(C1831z4.f3979l3)).booleanValue());
        if (this.f2431c == null) {
            WebView webViewM3693a = m3693a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.f2431c = webViewM3693a;
            if (webViewM3693a == null) {
                if (C1768p.m5160a()) {
                    this.f2430b.m5174b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
                return;
            }
        }
        if (m3704c() && !this.f2432d) {
            if (C1768p.m5160a()) {
                this.f2430b.m5174b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "firePostback");
            mapHashMap.put("source", "webViewNotInitialized");
            mapHashMap.put("url", strAppendQueryParameters);
            this.f2429a.m4764E().m2682d(C1548f2.f1540i1, mapHashMap);
            appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
            return;
        }
        String str = "al_firePostback('" + strAppendQueryParameters + "')";
        if (((Boolean) this.f2429a.m4801a(C1831z4.f3817S2)).booleanValue()) {
            AbstractC1685p8.m3899a(this.f2431c, str, this.f2429a).m5300a(this.f2429a.m4853s0().m2600a("evaluateJavascriptPromise"), new C1786u4.b() { // from class: com.applovin.impl.n8$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.C1786u4.b
                /* JADX INFO: renamed from: a */
                public final void mo2509a(boolean z, Object obj, Object obj2) {
                    this.f$0.m3697a(appLovinPostbackListener, strAppendQueryParameters, z, (String) obj, (String) obj2);
                }
            });
        } else {
            AbstractC1685p8.m3904a(this.f2431c, str);
            appLovinPostbackListener.onPostbackSuccess(strAppendQueryParameters);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m3703c(String str) {
        final WebView webViewM3692a = m3692a(str);
        if (webViewM3692a != null) {
            this.f2433e.add(webViewM3692a);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.n8$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3700b(webViewM3692a);
                }
            }, ((Integer) this.f2429a.m4801a(C1831z4.f3769M2)).intValue());
        } else if (C1768p.m5160a()) {
            this.f2430b.m5174b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m3704c() {
        return ((Boolean) this.f2429a.m4801a(C1831z4.f3809R2)).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public void m3705a(final C1766e c1766e, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.n8$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3702b(c1766e, appLovinPostbackListener);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m3706b() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.n8$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3695a();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m3707b(final String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (C1768p.m5160a()) {
                this.f2430b.m5174b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else if (str.startsWith("<script")) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.n8$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3703c(str);
                }
            });
        } else if (C1768p.m5160a()) {
            this.f2430b.m5174b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
        }
    }
}
