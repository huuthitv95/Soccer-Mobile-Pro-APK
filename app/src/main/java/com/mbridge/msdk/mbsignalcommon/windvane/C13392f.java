package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.mbsignalcommon.base.C13352e;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.windvane.f */
/* JADX INFO: compiled from: WindVaneCallJs.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13392f {

    /* JADX INFO: renamed from: a */
    private static C13392f f37178a = new C13392f();

    private C13392f() {
    }

    /* JADX INFO: renamed from: a */
    public static C13392f m38726a() {
        return f37178a;
    }

    /* JADX INFO: renamed from: b */
    public void m38731b(Object obj, String str) {
        if (obj instanceof C13387a) {
            C13387a c13387a = (C13387a) obj;
            String str2 = TextUtils.isEmpty(str) ? String.format("javascript:window.WindVane.onSuccess(%s,'');", c13387a.f37161g) : String.format("javascript:window.WindVane.onSuccess(%s,'%s');", c13387a.f37161g, C13395i.m38737a(str));
            WindVaneWebView windVaneWebView = c13387a.f37156b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                c13387a.f37156b.loadUrl(str2);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38730a(Object obj, String str, String str2) {
        if (obj instanceof C13387a) {
            C13387a c13387a = (C13387a) obj;
            String str3 = TextUtils.isEmpty(str2) ? String.format("javascript:window.WindVane.fireEvent('%s', '');", str) : String.format("javascript:window.WindVane.fireEvent('%s','%s');", str, C13395i.m38737a(str2));
            WindVaneWebView windVaneWebView = c13387a.f37156b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                c13387a.f37156b.loadUrl(str3);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38728a(WebView webView, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = String.format("javascript:window.WindVane.fireEvent('%s', '');", str);
        } else {
            str3 = String.format("javascript:window.WindVane.fireEvent('%s','%s');", str, C13395i.m38737a(str2));
        }
        if (webView != null) {
            if ((webView instanceof WindVaneWebView) && ((WindVaneWebView) webView).isDestoryed()) {
                return;
            }
            try {
                webView.loadUrl(str3);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38729a(Object obj, String str) {
        if (obj instanceof C13387a) {
            C13387a c13387a = (C13387a) obj;
            if (TextUtils.isEmpty(str)) {
                String.format("javascript:window.WindVane.onFailure(%s,'');", c13387a.f37161g);
            } else {
                str = C13395i.m38737a(str);
            }
            String str2 = String.format("javascript:window.WindVane.onFailure(%s,'%s');", c13387a.f37161g, str);
            WindVaneWebView windVaneWebView = c13387a.f37156b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                c13387a.f37156b.loadUrl(str2);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38727a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            m38726a().m38728a(webView, C13352e.f37056j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            m38726a().m38728a(webView, C13352e.f37056j, "");
        } catch (Throwable unused2) {
            m38726a().m38728a(webView, C13352e.f37056j, "");
        }
    }
}
