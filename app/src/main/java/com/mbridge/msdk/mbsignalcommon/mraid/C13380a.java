package com.mbridge.msdk.mbsignalcommon.mraid;

import android.webkit.WebView;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a */
/* JADX INFO: compiled from: CallMraidJS.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13380a {

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a$a */
    /* JADX INFO: compiled from: CallMraidJS.java */
    private static class a {

        /* JADX INFO: renamed from: a */
        private static final C13380a f37120a = new C13380a();
    }

    /* JADX INFO: renamed from: a */
    public static C13380a m38682a() {
        return a.f37120a;
    }

    /* JADX INFO: renamed from: b */
    public void m38690b(WebView webView, float f, float f2) {
        m38683a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    /* JADX INFO: renamed from: c */
    public void m38693c(WebView webView, float f, float f2) {
        m38683a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    /* JADX INFO: renamed from: a */
    public void m38684a(WebView webView) {
        m38683a(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    /* JADX INFO: renamed from: b */
    public void m38691b(WebView webView, float f, float f2, float f3, float f4) {
        m38683a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    /* JADX INFO: renamed from: a */
    public void m38689a(WebView webView, Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String string = jSONObject.toString();
        try {
            string = URLEncoder.encode(string, "UTF-8");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        m38683a(webView, String.format("javascript:window.mraidbridge.fireChangeEvent(%s);", string));
    }

    /* JADX INFO: renamed from: c */
    public void m38694c(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        m38683a(webView, String.format("javascript:window.mraidbridge.setIsViewable(%s);", str));
    }

    /* JADX INFO: renamed from: b */
    public void m38692b(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        m38683a(webView, String.format("javascript:window.mraidbridge.nativeCallComplete('%s');", str));
    }

    /* JADX INFO: renamed from: a */
    public void m38688a(WebView webView, String str, String str2) {
        try {
            str2 = URLEncoder.encode(str2, "UTF-8");
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        m38683a(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", str2, str));
    }

    /* JADX INFO: renamed from: a */
    public void m38685a(WebView webView, double d) {
        m38683a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.audioVolumeChange(%s);", Double.valueOf(d)));
    }

    /* JADX INFO: renamed from: a */
    public void m38686a(WebView webView, float f, float f2) {
        m38683a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    /* JADX INFO: renamed from: a */
    public void m38687a(WebView webView, float f, float f2, float f3, float f4) {
        m38683a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    /* JADX INFO: renamed from: a */
    private void m38683a(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
