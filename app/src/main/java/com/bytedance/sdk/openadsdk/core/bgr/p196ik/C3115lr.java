package com.bytedance.sdk.openadsdk.core.bgr.p196ik;

import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.ik.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3115lr {
    /* JADX INFO: renamed from: ri */
    public static void m12658ri(wjv wjvVar) {
        if (C3279dw.m14092lr(wjvVar)) {
            C3414ik.m15522lr(wjvVar, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m12659ri(wjv wjvVar, int i, String str) {
        if (wjvVar != null) {
            if (C3279dw.m14090ik(wjvVar) || C3279dw.m14092lr(wjvVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e) {
                    C2707ac.m10206ri("PlayableEvent", "onFail json error", e);
                }
                C3414ik.m15522lr(wjvVar, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m12660ri(wjv wjvVar, long j, long j2) {
        if (wjvVar != null) {
            if (C3279dw.m14090ik(wjvVar) || C3279dw.m14092lr(wjvVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j);
                    jSONObject.put("unzip_success_time", j2);
                } catch (JSONException e) {
                    C2707ac.m10206ri("PlayableEvent", "onSuccess json error", e);
                }
                C3414ik.m15522lr(wjvVar, "playable_preload", "preload_success", jSONObject);
            }
        }
    }
}
