package com.fyber.inneractive.sdk.activities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C7816f extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f17490a;

    public C7816f(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f17490a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.f17490a.setTitle("Page is Loading...");
        this.f17490a.setProgress(i * 100);
        if (i == 100) {
            this.f17490a.setTitle(webView.getUrl());
        }
    }
}
