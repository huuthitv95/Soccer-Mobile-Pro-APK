package com.bytedance.sdk.openadsdk.p266uq;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public class jbs {
    /* JADX INFO: renamed from: lr */
    private static void m16118lr(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            xha.m16308ri("WebViewSettings", "removeJavascriptInterfacesSafe error", th);
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m16119ri(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            xha.m16308ri("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16120ri(WebView webView) {
        if (webView == null) {
            return;
        }
        m16118lr(webView);
        WebSettings settings = webView.getSettings();
        m16119ri(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable th) {
            xha.m16308ri("WebViewSettings", "setJavaScriptEnabled error", th);
        }
        try {
            settings.setSupportZoom(false);
        } catch (Throwable th2) {
            xha.m16308ri("WebViewSettings", "setSupportZoom error", th2);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        boolean z = Build.VERSION.SDK_INT >= 28;
        try {
            if (z) {
                if (z) {
                    webView.setLayerType(2, null);
                }
                webView.getSettings().setMixedContentMode(0);
            }
            webView.setLayerType(0, null);
        } catch (Throwable th3) {
            xha.m16308ri("WebViewSettings", "setLayerType error", th3);
        }
        webView.getSettings().setMixedContentMode(0);
    }
}
