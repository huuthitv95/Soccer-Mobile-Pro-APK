package com.applovin.impl;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.p8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1685p8 {
    /* JADX INFO: renamed from: a */
    public static C1786u4 m3899a(final WebView webView, final String str, C1748l c1748l) {
        final C1786u4 c1786u4 = new C1786u4("evaluateJavascript");
        if (webView == null) {
            return c1786u4.m5298a("null_webview");
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.p8$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1685p8.m3905a(webView, str, c1786u4);
            }
        });
        Long l = (Long) c1748l.m4801a(C1831z4.f3825T2);
        if (l.longValue() > 0) {
            C1612l6.m3141a(l.longValue(), c1786u4, "timed_out", "evaluateJavascriptTimeout", c1748l);
            return c1786u4;
        }
        c1786u4.m5303b(null);
        return c1786u4;
    }

    /* JADX INFO: renamed from: a */
    private static String m3900a(String str, String str2, Map map) {
        JSONObject jSONObject;
        try {
            jSONObject = CollectionUtils.toJson(map);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return "javascript:" + str + "('" + str2 + "'," + jSONObject + ");";
    }

    /* JADX INFO: renamed from: a */
    public static String m3901a(String str, Map map) {
        String str2;
        str.hashCode();
        if (str.equals("com.applovin.custom_intent_launch_failure")) {
            str2 = "failure";
        } else {
            if (!str.equals("com.applovin.custom_intent_launch_success")) {
                return null;
            }
            str2 = "success";
        }
        return m3900a("al_onCustomIntentLaunchEvent", str2, map);
    }

    /* JADX INFO: renamed from: a */
    public static String m3902a(Map map) {
        return m3900a("al_onWindowInsetsInfoCollectedEvent", "success", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3903a(WebView webView) {
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        webView.removeAllViews();
        webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        webView.onPause();
        webView.destroyDrawingCache();
        webView.destroy();
    }

    /* JADX INFO: renamed from: a */
    public static void m3904a(final WebView webView, final String str) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.p8$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                webView.evaluateJavascript(str, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3905a(WebView webView, String str, final C1786u4 c1786u4) {
        Objects.requireNonNull(c1786u4);
        webView.evaluateJavascript(str, new ValueCallback() { // from class: com.applovin.impl.p8$$ExternalSyntheticLambda2
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                c1786u4.m5303b((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m3906a(final WebView webView, final String str, String str2, C1748l c1748l) {
        if (webView == null) {
            return;
        }
        try {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5171a(str2, "Forwarding \"" + str + "\" to WebView");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.p8$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    webView.loadUrl(str);
                }
            });
        } catch (Throwable th) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5172a(str2, "Unable to forward to WebView", th);
            }
            c1748l.m4764E().m4334a(str2, th, CollectionUtils.hashMap("operation", str));
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m3907b(String str, Map map) {
        String str2;
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "com.applovin.custom_tabs_failure":
                str2 = "failure";
                break;
            case "com.applovin.custom_tabs_hidden":
                str2 = "hidden";
                break;
            case "com.applovin.custom_tabs_shown":
                str2 = "shown";
                break;
            default:
                return null;
        }
        return m3900a("al_onInAppBrowserEvent", str2, map);
    }

    /* JADX INFO: renamed from: b */
    public static void m3908b(final WebView webView) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.p8$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1685p8.m3903a(webView);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static String m3910c(String str, Map map) {
        String str2;
        str.hashCode();
        if (str.equals("com.applovin.external_redirect_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.external_redirect_failure")) {
                return null;
            }
            str2 = "failure";
        }
        return m3900a("al_onExternalRedirectEvent", str2, map);
    }

    /* JADX INFO: renamed from: d */
    public static String m3912d(String str, Map map) {
        String str2;
        str.hashCode();
        if (str.equals("com.applovin.preload_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.preload_failure")) {
                return null;
            }
            str2 = "failure";
        }
        return m3900a("al_onPreloadEvent", str2, map);
    }
}
