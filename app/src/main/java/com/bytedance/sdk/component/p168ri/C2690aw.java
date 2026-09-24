package com.bytedance.sdk.component.p168ri;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.ri.aw */
/* JADX INFO: loaded from: classes3.dex */
public final class C2690aw {

    /* JADX INFO: renamed from: ri */
    private final Map<String, Object> f7687ri = new ConcurrentHashMap();

    private C2690aw() {
    }

    /* JADX INFO: renamed from: ri */
    public static C2690aw m10112ri() {
        return new C2690aw();
    }

    /* JADX INFO: renamed from: lr */
    public String m10113lr() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.f7687ri.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ri */
    public C2690aw m10114ri(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.f7687ri.put(str, obj);
        }
        return this;
    }
}
