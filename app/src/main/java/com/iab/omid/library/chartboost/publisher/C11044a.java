package com.iab.omid.library.chartboost.publisher;

import android.webkit.WebView;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.publisher.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11044a extends AdSessionStatePublisher {
    public C11044a(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m23793a(webView);
    }
}
