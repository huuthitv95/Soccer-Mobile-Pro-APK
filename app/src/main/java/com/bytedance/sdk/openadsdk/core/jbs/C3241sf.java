package com.bytedance.sdk.openadsdk.core.jbs;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C3241sf {
    /* JADX INFO: renamed from: ri */
    private static int m13723ri(String str) {
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m13724ri(String str, int i, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.jbs.m13550ri(i);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            com.bytedance.sdk.openadsdk.core.model.wjv.C3296ri c3296riSez = wjvVar.sez();
            if (c3296riSez != null) {
                jSONObject.put("tpl_id", c3296riSez.m14589ka());
                if ("Web".equals(str)) {
                    if (c3296riSez.m14582co()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            } else if (wjvVar.m14575zv() != null) {
                jSONObject.put("tpl_id", wjvVar.m14575zv().m14230ri());
                if ("Web".equals(str)) {
                    jSONObject.put("engine_version", "v3");
                }
            }
        } catch (Exception unused) {
        }
        C3521ka.m15942ri().m15957ri(C3531ka.m15967lr().m15984ri(m13723ri(str3)).m15975ik(str4).m15973fi(wjvVar != null ? wjvVar.m14424jf() : "").m15979lr(i).m15980lr(jSONObject.toString()).m15971di(str2));
    }
}
