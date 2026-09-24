package com.iab.omid.library.mmadbridge.publisher;

import android.webkit.WebView;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.publisher.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11198a extends AdSessionStatePublisher {
    public C11198a(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m24556a(webView);
    }
}
