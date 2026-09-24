package com.bytedance.sdk.openadsdk.core.p200co.p201di;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.di.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C3135mj {
    /* JADX INFO: renamed from: ri */
    public void m13091ri(String str, wjv wjvVar, String str2, Map<String, String> map) {
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                String str3 = map.get("label");
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                String strYjg = wjvVar.yjg();
                if (!"sendLogExtra".equals(str) || TextUtils.isEmpty(strYjg)) {
                    jSONObject.put("log_extra", strYjg);
                } else {
                    JSONObject jSONObject2 = new JSONObject(strYjg);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (!"label".equals(entry.getKey())) {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("log_extra", jSONObject2.toString());
                }
                JSONObject jSONObject3 = new JSONObject();
                if ("sendAdExtra".equals(str)) {
                    for (Map.Entry<String, String> entry2 : map.entrySet()) {
                        if (!"label".equals(entry2.getKey())) {
                            jSONObject3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                jSONObject.put("ad_extra_data", jSONObject3.toString());
                jSONObject.putOpt("ua_policy", Integer.valueOf(wjvVar.m14407hd()));
                C3414ik.m15552ri(wjvVar, "app_union", str2, str3, Long.parseLong(wjvVar.m14533tn()), 0L, jSONObject, C3273ac.xha(wjvVar));
            } catch (Throwable unused) {
            }
        }
    }
}
