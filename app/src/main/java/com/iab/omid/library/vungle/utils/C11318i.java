package com.iab.omid.library.vungle.utils;

import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import java.util.Set;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.utils.i */
/* JADX INFO: loaded from: classes6.dex */
public class C11318i {
    /* JADX INFO: renamed from: a */
    public void m25176a(WebView webView, String str) {
        WebViewCompat.removeWebMessageListener(webView, str);
    }

    /* JADX INFO: renamed from: a */
    public void m25177a(WebView webView, String str, Set<String> set, WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.addWebMessageListener(webView, str, set, webMessageListener);
    }
}
