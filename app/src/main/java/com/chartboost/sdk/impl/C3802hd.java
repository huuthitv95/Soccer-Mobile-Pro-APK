package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.hd */
/* JADX INFO: loaded from: classes3.dex */
public final class C3802hd implements InterfaceC3764fl {
    @Override // com.chartboost.sdk.impl.InterfaceC3764fl
    /* JADX INFO: renamed from: a */
    public WebView mo16908a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new C3733ed(context);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3764fl
    /* JADX INFO: renamed from: a */
    public InterfaceC4137wc mo16909a(Context context, WebView webView, EnumC4049sc placementType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        return new C3870kc(context, webView, placementType, null, null, null, 56, null);
    }
}
