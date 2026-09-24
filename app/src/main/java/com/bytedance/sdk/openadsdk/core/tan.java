package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.C3423lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3532lr;
import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class tan {
    /* JADX INFO: renamed from: ri */
    public static void m14973ri(Context context, boolean z, JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, int i, WebView webView, InterfaceC3338fi interfaceC3338fi) {
        int iOptInt = jSONObject.optInt("landingStyle");
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString(MessengerShareContentUtility.FALLBACK_URL);
        String strOptString3 = jSONObject.optString("title", "");
        boolean z2 = false;
        boolean z3 = jSONObject.optInt("only_loading", 0) == 1;
        try {
            jSONObject.put("is_activity", z);
        } catch (JSONException unused) {
        }
        C3414ik.m15542ri(wjvVar, str, 1, jSONObject);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        if (iOptInt == 0) {
            if (webView != null) {
                webView.loadUrl(strOptString);
                C3414ik.m15542ri(wjvVar, str, 2, (JSONObject) null);
            } else {
                C3414ik.m15542ri(wjvVar, str, -1, (JSONObject) null);
            }
        } else if (iOptInt == 1 || iOptInt == 8) {
            C3532lr c3532lr = new C3532lr();
            c3532lr.m15999ri(C3423lr.ri.f12379lr);
            c3532lr.m15998ri(wjvVar);
            c3532lr.m15994lr(str);
            c3532lr.m15997ri(-1);
            c3532lr.m16000ri(false);
            c3532lr.m15993lr(wjvVar.adz());
            C3414ik.m15561ri(c3532lr);
            com.bytedance.sdk.openadsdk.utils.wjv.m16675ri(context, strOptString, wjvVar, C3423lr.ri.f12379lr, true);
        } else {
            if (iOptInt != 2) {
                if (iOptInt == 3) {
                    C3088ac c3088ac = new C3088ac(wjvVar);
                    c3088ac.m12367ri(strOptString3);
                    c3088ac.m12368ri(z3);
                    C3214ig.m13498ri(context, strOptString, wjvVar, i, str, false, c3088ac);
                }
                if (interfaceC3338fi == null && z2) {
                    interfaceC3338fi.mo10615ri();
                    return;
                }
            }
            if (!com.bytedance.sdk.openadsdk.utils.wjv.m16674ri(context, strOptString, wjvVar, str)) {
                C3532lr c3532lr2 = new C3532lr();
                c3532lr2.m15999ri(C3423lr.ri.f12379lr);
                c3532lr2.m15998ri(wjvVar);
                c3532lr2.m15994lr(str);
                c3532lr2.m15997ri(-1);
                c3532lr2.m16000ri(false);
                c3532lr2.m15993lr(wjvVar.adz());
                C3414ik.m15561ri(c3532lr2);
                HashMap map = new HashMap();
                map.put("deeplink_url", strOptString);
                map.put(MessengerShareContentUtility.FALLBACK_URL, strOptString2);
                map.put("jsb_deeplink", 1);
                C3414ik.m15553ri(wjvVar, str, "open_fallback_url", map);
                com.bytedance.sdk.openadsdk.utils.wjv.m16675ri(context, strOptString2, wjvVar, C3423lr.ri.f12379lr, true);
            }
        }
        z2 = true;
        if (interfaceC3338fi == null) {
        }
    }
}
