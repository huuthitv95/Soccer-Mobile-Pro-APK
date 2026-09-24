package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3211fi {
    /* JADX INFO: renamed from: ri */
    public static void m13462ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        C3414ik.m15522lr(wjvVar, str, "convert_track", jSONObject);
    }
}
