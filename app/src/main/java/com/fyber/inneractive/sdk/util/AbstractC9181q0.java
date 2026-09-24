package com.fyber.inneractive.sdk.util;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.web.C9248m;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.q0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9181q0 {
    /* JADX INFO: renamed from: a */
    public static void m22008a(WebView webView, String str) {
        webView.evaluateJavascript(str, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m22009a(C9248m c9248m, String str, ValueCallback valueCallback) {
        c9248m.evaluateJavascript(str, valueCallback);
    }
}
