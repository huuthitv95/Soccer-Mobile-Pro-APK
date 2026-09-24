package com.fyber.inneractive.sdk.util;

import android.webkit.WebView;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.o0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9175o0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WebView f21471a;

    public RunnableC9175o0(WebView webView) {
        this.f21471a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21471a.getSettings().setDisplayZoomControls(false);
    }
}
