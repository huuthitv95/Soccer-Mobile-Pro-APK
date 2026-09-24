package com.bytedance.sdk.openadsdk.core.p200co.p201di;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.tan;
import com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.di.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3130di {

    /* JADX INFO: renamed from: ri */
    private final String f10212ri = "UGenV3OpenLinks";

    /* JADX INFO: renamed from: lr */
    private final String f10211lr = "landingStyle";

    /* JADX INFO: renamed from: ik */
    private final String f10209ik = "url";

    /* JADX INFO: renamed from: ka */
    private final String f10210ka = "fallbackUrl";

    /* JADX INFO: renamed from: ri */
    private JSONObject m13040ri(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[RETURN] */
    /* JADX INFO: renamed from: ri */
    private boolean m13041ri(int i, String str, String str2) {
        if (i == 1) {
            if (!C2724nr.m10260ri(str)) {
                return false;
            }
        } else if (i != 2) {
            if (i == 3) {
                if (!C2724nr.m10260ri(str)) {
                    return false;
                }
            }
        } else if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || !C2724nr.m10260ri(str2)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public void m13042ri(Context context, boolean z, wjv wjvVar, String str, Map<String, String> map, InterfaceC3338fi interfaceC3338fi) {
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            if (m13041ri(Integer.parseInt(map.get("landingStyle")), map.get("url"), map.get("fallbackUrl"))) {
                tan.m14973ri(context, z, m13040ri(map), wjvVar, str, C3571ig.m16470ri(str), null, interfaceC3338fi);
            }
        } catch (Throwable th) {
            C2707ac.m10196ik("UGenV3OpenLinks", th.getMessage());
        }
    }
}
