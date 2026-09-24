package com.bytedance.sdk.openadsdk.p236ka;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C3429qt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static JSONObject m15617lr(wjv wjvVar, String str, int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("error_msg", str);
            }
            int i2 = 1;
            jSONObject2.put("ad_show_order", i + 1);
            jSONObject2.put("interaction_method", wjvVar.m14567zb());
            jSONObject2.put("real_interaction_method", wjvVar.m14453nd());
            jSONObject2.put("give_up_reward", wjvVar.slm() ? 1 : 2);
            if (!wjvVar.m14423jc()) {
                i2 = 2;
            }
            jSONObject2.put("has_reward", i2);
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject2.put(next, jSONObject.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: ri */
    public static void m15619ri(wjv wjvVar, String str, int i) {
        m15622ri(wjvVar, "close".equals(str) ? "close_listen_empty" : "show_listen_empty", wjvVar != null ? wjvVar.m14394fi() : null, null, null, i);
    }

    /* JADX INFO: renamed from: ri */
    public static void m15620ri(wjv wjvVar, String str, String str2, String str3) {
        m15621ri(wjvVar, str, str2, str3, null);
    }

    /* JADX INFO: renamed from: ri */
    public static void m15621ri(wjv wjvVar, String str, String str2, String str3, JSONObject jSONObject) {
        m15622ri(wjvVar, str, str2, str3, jSONObject, 0);
    }

    /* JADX INFO: renamed from: ri */
    public static void m15622ri(final wjv wjvVar, String str, String str2, final String str3, final JSONObject jSONObject, final int i) {
        if (wjvVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, str2, str, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.qt.1
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                if (jSONObject == null) {
                    return super.mo10797lr();
                }
                long jM14368bu = wjvVar.m14368bu();
                if (jM14368bu < 0) {
                    long jJbs = wjvVar.jbs();
                    if (jJbs > 0) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - jJbs;
                        if (jElapsedRealtime > 0) {
                            jM14368bu = jElapsedRealtime;
                        }
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", jM14368bu);
                    return jSONObject2;
                } catch (Exception e) {
                    C2707ac.m10197ik(e.getMessage(), new Object[0]);
                    return jSONObject2;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                return C3429qt.m15617lr(wjvVar, str3, i, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15623ri(String str, boolean z, boolean z2, wjv wjvVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 1;
            jSONObject.put("has_close_invoke", z ? 1 : 2);
            if (!z2) {
                i = 2;
            }
            jSONObject.put("has_show_invoke", i);
            m15621ri(wjvVar, str, wjvVar != null ? wjvVar.m14394fi() : null, null, jSONObject);
        } catch (JSONException unused) {
        }
    }
}
