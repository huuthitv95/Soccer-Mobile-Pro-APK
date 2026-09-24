package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.j */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC7820j implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f17494a;

    public ViewOnClickListenerC7820j(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f17494a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.f17494a.f17474e;
        if (webView == null || !webView.canGoBack()) {
            return;
        }
        this.f17494a.f17474e.goBack();
    }
}
