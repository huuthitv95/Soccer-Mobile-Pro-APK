package com.mbridge.msdk.foundation.controller;

import android.util.Log;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.foundation.cache.C13002d;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.b */
/* JADX INFO: compiled from: CandidateController.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13007b {

    /* JADX INFO: renamed from: a */
    private HashMap<String, C13002d> f35516a;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.b$b */
    /* JADX INFO: compiled from: CandidateController.java */
    static class b {

        /* JADX INFO: renamed from: a */
        static C13007b f35517a = new C13007b();
    }

    /* JADX INFO: renamed from: a */
    public static C13007b m36585a() {
        return b.f35517a;
    }

    /* JADX INFO: renamed from: b */
    public C13002d m36587b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        Exception e;
        if (this.f35516a == null) {
            this.f35516a = new HashMap<>();
        }
        if (this.f35516a.containsKey(str)) {
            return this.f35516a.get(str);
        }
        if (jSONArray == null) {
            try {
                jSONArray2 = new JSONArray();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("c_cb", 0);
                    jSONObject.put("t_disc", 0.95d);
                    jSONObject.put("u_disc", 0.95d);
                    jSONObject.put("max_ecppv_diff", 0);
                    jSONObject.put("max_cache_num", 20);
                    jSONObject.put("max_usage_limit", 10);
                    jSONObject.put(SDKConstants.PARAM_A2U_TIME_INTERVAL, 7200);
                    jSONArray2.put(jSONObject);
                } catch (Exception e2) {
                    e = e2;
                    Log.e("CandidateController", e.getMessage());
                }
            } catch (Exception e3) {
                jSONArray2 = jSONArray;
                e = e3;
            }
            jSONArray = jSONArray2;
        }
        return m36586a(str, jSONArray);
    }

    private C13007b() {
        this.f35516a = new HashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public C13002d m36586a(String str, JSONArray jSONArray) {
        if (this.f35516a == null) {
            this.f35516a = new HashMap<>();
        }
        if (this.f35516a.containsKey(str)) {
            return this.f35516a.get(str);
        }
        C13002d c13002d = new C13002d(str, jSONArray);
        this.f35516a.put(str, c13002d);
        return c13002d;
    }
}
