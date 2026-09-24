package com.bytedance.sdk.openadsdk.core.widget.p228ri;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3349ik {

    /* JADX INFO: renamed from: ri */
    private final WeakReference<Context> f11829ri;

    /* JADX INFO: renamed from: lr */
    private boolean f11828lr = true;

    /* JADX INFO: renamed from: ik */
    private final boolean f11826ik = true;

    /* JADX INFO: renamed from: ka */
    private final boolean f11827ka = true;

    /* JADX INFO: renamed from: fi */
    private final boolean f11825fi = false;

    /* JADX INFO: renamed from: di */
    private final boolean f11824di = true;
    private boolean xha = true;

    private C3349ik(Context context) {
        this.f11829ri = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: lr */
    public static void m15076lr(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            C2707ac.m10197ik(th.toString(), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C3349ik m15077ri(Context context) {
        return new C3349ik(context);
    }

    /* JADX INFO: renamed from: ri */
    private void m15078ri(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            C2707ac.m10197ik(th.toString(), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15079ri(C2634di c2634di) {
        if (c2634di == null) {
            return;
        }
        int iM16703ri = C3606fi.m16703ri("clear_web_cache_new", 0);
        if (iM16703ri == 0) {
            c2634di.m9786ri(true);
        } else if (iM16703ri == 1) {
            c2634di.m9786ri(false);
        }
    }

    /* JADX INFO: renamed from: lr */
    public C3349ik m15080lr(boolean z) {
        this.f11828lr = z;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C3349ik m15081ri(boolean z) {
        this.xha = z;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public void m15082ri(WebView webView) {
        if (webView == null || this.f11829ri.get() == null) {
            return;
        }
        m15076lr(webView);
        WebSettings settings = webView.getSettings();
        m15078ri(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e) {
            C2707ac.m10196ik("SSWebSettings", e.getMessage());
        }
        try {
            if (this.f11828lr) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            C2707ac.m10196ik("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.xha) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th2) {
            C2707ac.m10196ik("SSWebSettings", th2.getMessage());
        }
    }
}
