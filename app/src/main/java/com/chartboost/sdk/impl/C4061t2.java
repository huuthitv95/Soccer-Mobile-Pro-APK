package com.chartboost.sdk.impl;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.t2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4061t2 extends C4042s5 {

    /* JADX INFO: renamed from: e */
    public final InterfaceC3868ka f16313e;

    /* JADX INFO: renamed from: f */
    public final C4185yg f16314f;

    /* JADX INFO: renamed from: g */
    public boolean f16315g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4061t2(InterfaceC3868ka impressionInterface, C4185yg gestureDetector, InterfaceC4064t5 callback, InterfaceC3888l7 eventTracker) {
        super(callback, eventTracker, impressionInterface, (C3920mg) C3678c4.f13658b.mo17019a().mo18988b().get());
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(gestureDetector, "gestureDetector");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f16313e = impressionInterface;
        this.f16314f = gestureDetector;
    }

    /* JADX INFO: renamed from: a */
    public final C4185yg m19451a() {
        return this.f16314f;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19452b(String str) {
        if (this.f16315g) {
            if (!this.f16314f.m20061a()) {
                return false;
            }
            this.f16313e.mo18376c(new C3884l3(str, Boolean.FALSE));
            this.f16314f.m20063b();
            return true;
        }
        C4048sb.m19411b("Attempt to open " + str + " detected before WebView loading finished.", (Throwable) null, 2, (Object) null);
        this.f16313e.mo18379d(new C3884l3(str, Boolean.FALSE));
        return true;
    }

    @Override // com.chartboost.sdk.impl.C4042s5, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f16315g = true;
    }

    @Override // com.chartboost.sdk.impl.C4042s5, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return m19452b(string);
    }

    @Override // com.chartboost.sdk.impl.C4042s5, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return m19452b(url);
    }
}
