package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.measurement.tracker.c */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8278c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC8280e f18457a;

    public RunnableC8278c(AbstractC8280e abstractC8280e) {
        this.f18457a = abstractC8280e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.m21945a("clearing webview", new Object[0]);
        WebView webView = this.f18457a.f18462e;
        if (webView != null) {
            webView.destroy();
            this.f18457a.f18462e = null;
        }
    }
}
