package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.k */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC7821k implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f17495a;

    public ViewOnClickListenerC7821k(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f17495a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.f17495a.f17474e;
        if (webView == null || !webView.canGoForward()) {
            return;
        }
        this.f17495a.f17474e.goForward();
    }
}
