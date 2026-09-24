package com.iab.omid.library.ironsrc.utils;

import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import java.util.Set;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.utils.i */
/* JADX INFO: loaded from: classes6.dex */
public class C11157i {
    /* JADX INFO: renamed from: a */
    public void m24384a(WebView webView, String str) {
        WebViewCompat.removeWebMessageListener(webView, str);
    }

    /* JADX INFO: renamed from: a */
    public void m24385a(WebView webView, String str, Set<String> set, WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.addWebMessageListener(webView, str, set, webMessageListener);
    }
}
