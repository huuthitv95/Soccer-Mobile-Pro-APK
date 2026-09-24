package com.bytedance.sdk.component.utils;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public class bgr {

    /* JADX INFO: renamed from: ri */
    private static final C2712ri f7756ri = new C2711lr();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.bgr$lr */
    private static class C2711lr extends C2712ri {
        private C2711lr() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.bgr.C2712ri
        /* JADX INFO: renamed from: ri */
        public void mo10211ri(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    return;
                } catch (Throwable th) {
                    boolean z = th instanceof IllegalStateException;
                }
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.bgr$ri */
    private static class C2712ri {
        private C2712ri() {
        }

        /* JADX INFO: renamed from: ri */
        public void mo10211ri(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m10210ri(WebView webView, String str) {
        f7756ri.mo10211ri(webView, str);
    }
}
