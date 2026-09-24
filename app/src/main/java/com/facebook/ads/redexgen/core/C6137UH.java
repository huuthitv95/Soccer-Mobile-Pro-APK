package com.facebook.ads.redexgen.core;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.UH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6137UH extends WebViewClient {
    public final /* synthetic */ CallableC6138UI A00;

    public C6137UH(CallableC6138UI callableC6138UI) {
        this.A00 = callableC6138UI;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC6547ay.A0D(AbstractC6098Td.A2j);
        return true;
    }
}
