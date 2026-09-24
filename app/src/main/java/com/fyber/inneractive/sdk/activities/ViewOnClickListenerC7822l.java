package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.l */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC7822l implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f17496a;

    public ViewOnClickListenerC7822l(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f17496a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.f17496a.f17474e;
        if (webView != null) {
            webView.reload();
            int i = IAlog.f21426a;
            IAlog.m21948d("%s %s", "AD_INTERNAL_BROWSER_REFRESH", this.f17496a.f17474e.getUrl());
        }
    }
}
