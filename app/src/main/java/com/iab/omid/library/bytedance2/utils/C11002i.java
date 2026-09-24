package com.iab.omid.library.bytedance2.utils;

import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import java.util.Set;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.utils.i */
/* JADX INFO: loaded from: classes6.dex */
public class C11002i {
    /* JADX INFO: renamed from: a */
    public void m23616a(WebView webView, String str) {
        WebViewCompat.removeWebMessageListener(webView, str);
    }

    /* JADX INFO: renamed from: a */
    public void m23617a(WebView webView, String str, Set<String> set, WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.addWebMessageListener(webView, str, set, webMessageListener);
    }
}
