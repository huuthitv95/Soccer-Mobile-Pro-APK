package com.chartboost.sdk.impl;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.gd */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3779gd extends WebViewClient {

    /* JADX INFO: renamed from: b */
    public static final a f14321b = new a(null);

    /* JADX INFO: renamed from: a */
    public final String f14322a;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.gd$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AbstractC3779gd(String mraidVersion) {
        Intrinsics.checkNotNullParameter(mraidVersion, "mraidVersion");
        this.f14322a = mraidVersion;
    }

    /* JADX INFO: renamed from: a */
    public final WebResourceResponse m17806a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!StringsKt.endsWith$default(url, "mraid.js", false, 2, (Object) null)) {
            return null;
        }
        byte[] bytes = C4181yc.f17050a.m20055a(this.f14322a).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(bytes));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        WebResourceResponse webResourceResponseM17806a = m17806a(string);
        return webResourceResponseM17806a == null ? super.shouldInterceptRequest(view, request) : webResourceResponseM17806a;
    }
}
