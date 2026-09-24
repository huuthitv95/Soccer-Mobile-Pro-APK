package com.iab.omid.library.vungle.publisher;

import android.webkit.WebView;
import com.iab.omid.library.vungle.webviewclient.C11333a;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.publisher.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11308a extends AdSessionStatePublisher {
    public C11308a(String str, WebView webView) {
        super(str);
        if (webView != null) {
            C11333a.m25233a(webView);
        }
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m25084a(webView);
    }
}
