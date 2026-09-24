package com.ironsource;

import android.os.Build;
import android.webkit.WebView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.oa */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12406oa {

    /* JADX INFO: renamed from: com.ironsource.oa$a */
    public static final class a implements InterfaceC12406oa {

        /* JADX INFO: renamed from: a */
        private WebView f31630a;

        /* JADX INFO: renamed from: b */
        private boolean f31631b;

        public a() {
            this(0, 1, null);
        }

        /* JADX INFO: renamed from: b */
        private final void m32967b(String str) {
            WebView webView = this.f31630a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        /* JADX INFO: renamed from: c */
        private final void m32968c(String str) {
            WebView webView = this.f31630a;
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }

        @Override // com.ironsource.InterfaceC12406oa
        /* JADX INFO: renamed from: a */
        public boolean mo32966a() {
            return this.f31630a != null;
        }

        public a(int i) {
            this.f31631b = i >= 19;
        }

        @Override // com.ironsource.InterfaceC12406oa
        /* JADX INFO: renamed from: a */
        public void mo32965a(String script) {
            Intrinsics.checkNotNullParameter(script, "script");
            try {
                if (this.f31631b) {
                    m32967b(script);
                } else {
                    m32968c(script);
                }
            } catch (Throwable th) {
                C12317m4.m32153d().m32155a(th);
                this.f31631b = false;
                m32968c(script);
            }
        }

        public /* synthetic */ a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Build.VERSION.SDK_INT : i);
        }

        @Override // com.ironsource.InterfaceC12406oa
        /* JADX INFO: renamed from: a */
        public void mo32964a(WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.f31630a = webView;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo32964a(WebView webView);

    /* JADX INFO: renamed from: a */
    void mo32965a(String str);

    /* JADX INFO: renamed from: a */
    boolean mo32966a();
}
