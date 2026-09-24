package com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3211fi;
import com.bytedance.sdk.openadsdk.core.C3214ig;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.bgr;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ihz.ri.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3373ri {
    /* JADX INFO: renamed from: ri */
    private static Intent m15258ri(Context context, String str, wjv wjvVar) {
        try {
            Uri uri = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (wjvVar != null && wjvVar.m14562xz() != null && !TextUtils.isEmpty(wjvVar.m14562xz().m14624ka())) {
                intent.setPackage(wjvVar.m14562xz().m14624ka());
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        } catch (Throwable th) {
            C2707ac.m10196ik("DeepLinkUtils", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m15259ri(Context context, wjv wjvVar, Map<String, Object> map) {
        if (wjvVar != null && wjvVar.m14565yv() == 0) {
            map.put("auto_click", Boolean.valueOf(!wjvVar.tan()));
        }
        map.put("can_query_install", Integer.valueOf(C3571ig.m16452ka(context) ? 1 : 0));
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m15260ri(Context context, String str, wjv wjvVar, int i, Map<String, Object> map, boolean z) {
        Map<String, Object> map2 = map;
        String strM16476ri = C3571ig.m16476ri(wjvVar);
        C3211fi.m13462ri(wjvVar, strM16476ri, 1, null);
        Intent intentM15258ri = m15258ri(context, str, wjvVar);
        if (TextUtils.isEmpty(str) || intentM15258ri == null) {
            C3211fi.m13462ri(wjvVar, strM16476ri, -2, wjvVar.lau().m14013ka());
            return false;
        }
        boolean zM16452ka = C3571ig.m16452ka(context);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        Map<String, Object> map3 = map2;
        if (wjvVar != null && wjvVar.m14565yv() == 0) {
            map3.put("auto_click", Boolean.valueOf(!wjvVar.tan()));
        }
        map3.put("can_query_install", Integer.valueOf(zM16452ka ? 1 : 0));
        map3.put("url", str);
        if (zM16452ka) {
            C3571ig.lr lrVarM16473ri = C3571ig.m16473ri(context, intentM15258ri);
            if (lrVarM16473ri.f13170lr <= 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(SDKConstants.PARAM_INTENT, intentM15258ri.toString());
                    jSONObject.put("can_query_install", 1);
                } catch (Exception unused) {
                }
                C3211fi.m13462ri(wjvVar, strM16476ri, -3, jSONObject);
                return false;
            }
            try {
                m15259ri(context, wjvVar, map3);
                map3.put("matched_count", Integer.valueOf(lrVarM16473ri.f13170lr));
                if (lrVarM16473ri.f13171ri != null) {
                    intentM15258ri.setComponent(lrVarM16473ri.f13171ri);
                }
            } catch (Throwable th) {
                C2707ac.m10196ik("DeepLinkUtils", th.getMessage());
            }
        }
        if (C3299nr.m14639ka().jbs()) {
            C3571ig.m16484ri(wjvVar, strM16476ri);
        }
        try {
            C3414ik.m15553ri(wjvVar, strM16476ri, "open_url_app", map3);
            context.startActivity(intentM15258ri);
            bgr.m15395ri().m15398ri(map3).m15399ri(wjvVar, strM16476ri);
            C3414ik.m15565ri("dp_start_act_success", wjvVar, strM16476ri, map3);
            return true;
        } catch (Throwable th2) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("exception", th2.getMessage());
                jSONObject2.put(SDKConstants.PARAM_INTENT, intentM15258ri.toString());
                jSONObject2.put("can_query_install", zM16452ka ? 1 : 0);
            } catch (Exception unused2) {
            }
            C3211fi.m13462ri(wjvVar, strM16476ri, -4, jSONObject2);
            if (zM16452ka && !C3299nr.m14639ka().jbs()) {
                C3214ig.m13497ri(context, wjvVar.smj(), wjvVar, i, strM16476ri, z);
            }
            return false;
        }
    }
}
