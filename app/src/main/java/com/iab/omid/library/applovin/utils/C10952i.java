package com.iab.omid.library.applovin.utils;

import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import java.util.Set;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.utils.i */
/* JADX INFO: loaded from: classes6.dex */
public class C10952i {
    /* JADX INFO: renamed from: a */
    public void m23374a(WebView webView, String str) {
        WebViewCompat.removeWebMessageListener(webView, str);
    }

    /* JADX INFO: renamed from: a */
    public void m23375a(WebView webView, String str, Set<String> set, WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.addWebMessageListener(webView, str, set, webMessageListener);
    }
}
