package com.mbridge.msdk.mbbanner.common.communication;

import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.ads.AdError;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.mraid.C13380a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.unity3d.ads.BuildConfig;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.communication.a */
/* JADX INFO: compiled from: BannerCallJS.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13276a {
    /* JADX INFO: renamed from: a */
    public static void m38144a(WebView webView) {
        C13219q0.m37816b("BannerCallJS", "fireOnJSBridgeConnected");
        C13392f.m38726a().m38727a(webView);
    }

    /* JADX INFO: renamed from: a */
    public static void m38145a(WebView webView, float f, float f2) {
        C13219q0.m37816b("BannerCallJS", "fireOnBannerWebViewShow");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startX", f);
            jSONObject.put("startY", f2);
            jSONObject.put("scale", C13229v0.m37918d(C13008c.m36588n().m36542d()));
            C13392f.m38726a().m38728a(webView, "webviewshow", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C13219q0.m37817b("BannerCallJS", "fireOnBannerWebViewShow", th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38146a(WebView webView, int i, int i2) {
        C13219q0.m37816b("BannerCallJS", "fireOnBannerViewSizeChange");
        try {
            C13380a.m38682a().m38693c(webView, i, i2);
        } catch (Throwable th) {
            C13219q0.m37817b("BannerCallJS", "fireOnBannerViewSizeChange", th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38147a(WebView webView, int i, int i2, int i3, int i4) {
        String str;
        C13219q0.m37816b("BannerCallJS", "transInfoForMraid");
        try {
            int i5 = C13008c.m36588n().m36542d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i5 == 2) {
                str = C11744X3.i.f26320C;
            } else {
                str = i5 == 1 ? C11744X3.i.f26322D : AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float fM37760n = C13211m0.m37760n(C13008c.m36588n().m36542d());
            float fM37757m = C13211m0.m37757m(C13008c.m36588n().m36542d());
            HashMap mapM37776v = C13211m0.m37776v(C13008c.m36588n().m36542d());
            int iIntValue = ((Integer) mapM37776v.get("width")).intValue();
            int iIntValue2 = ((Integer) mapM37776v.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "inline");
            map.put("state", BuildConfig.FLAVOR);
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            float f = i;
            float f2 = i2;
            float f3 = i3;
            float f4 = i4;
            C13380a.m38682a().m38691b(webView, f, f2, f3, f4);
            C13380a.m38682a().m38687a(webView, f, f2, f3, f4);
            C13380a.m38682a().m38690b(webView, fM37760n, fM37757m);
            C13380a.m38682a().m38686a(webView, iIntValue, iIntValue2);
            C13380a.m38682a().m38689a(webView, map);
            C13380a.m38682a().m38684a(webView);
        } catch (Throwable th) {
            C13219q0.m37817b("BannerCallJS", "transInfoForMraid", th);
        }
    }
}
