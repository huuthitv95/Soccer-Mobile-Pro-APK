package com.bytedance.sdk.openadsdk.core.widget.p228ri;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.common.C2934fi;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.p236ka.C3393aw;
import com.bytedance.sdk.openadsdk.utils.tan;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3350ka extends WebChromeClient {

    /* JADX INFO: renamed from: ri */
    private static final String f11830ri = "WebChromeClient";

    /* JADX INFO: renamed from: ik */
    private C3393aw f11831ik;

    /* JADX INFO: renamed from: ka */
    private C2934fi f11832ka;

    /* JADX INFO: renamed from: lr */
    private final dzy f11833lr;

    public C3350ka(dzy dzyVar) {
        this.f11833lr = dzyVar;
    }

    public C3350ka(dzy dzyVar, C3393aw c3393aw) {
        this.f11833lr = dzyVar;
        this.f11831ik = c3393aw;
    }

    public C3350ka(dzy dzyVar, C3393aw c3393aw, C2934fi c2934fi) {
        this(dzyVar, c3393aw);
        this.f11832ka = c2934fi;
    }

    /* JADX INFO: renamed from: ri */
    private boolean m15084ri(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                C3332vr.m14976ik().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.ka.1
                    @Override // java.lang.Runnable
                    public void run() {
                        tan.m16660ri(Uri.parse(str), C3350ka.this.f11833lr);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str)) {
            m15084ri(str);
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !m15084ri(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C3393aw c3393aw = this.f11831ik;
        if (c3393aw != null) {
            c3393aw.m15380ri(webView, i);
        }
        C2934fi c2934fi = this.f11832ka;
        if (c2934fi != null) {
            c2934fi.m11315ri(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }
}
