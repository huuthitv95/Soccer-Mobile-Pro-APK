package com.fyber.inneractive.sdk.flow.storepromo.controller.webview;

import com.fyber.inneractive.sdk.web.C9248m;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8183a extends C9248m {

    /* JADX INFO: renamed from: h */
    public final C8184b f18237h;

    public C8183a(C8184b c8184b) {
        this.f18237h = c8184b;
        setWebViewClient(c8184b);
        getSettings().setJavaScriptEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setOverScrollMode(2);
    }

    @Override // com.fyber.inneractive.sdk.web.C9248m, android.webkit.WebView
    public final void destroy() {
        C8184b c8184b = this.f18237h;
        c8184b.f18239a = null;
        c8184b.f18240b = null;
        super.destroy();
    }
}
