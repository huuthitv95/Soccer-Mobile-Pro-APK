package com.bytedance.adsdk.ugeno.p094ik;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.C2260fi;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ik.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2268lr {
    /* JADX INFO: renamed from: ri */
    public static String m7663ri(String str, JSONObject jSONObject) {
        InterfaceC2269ri interfaceC2269riM7539ik;
        InterfaceC2269ri.ri riVarMo7217ri;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}") && (interfaceC2269riM7539ik = C2260fi.m7537ri().m7539ik()) != null && (riVarMo7217ri = interfaceC2269riM7539ik.mo7217ri(str.substring(2, str.length() - 1))) != null) {
                    return (String) riVarMo7217ri.mo7219ri(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
