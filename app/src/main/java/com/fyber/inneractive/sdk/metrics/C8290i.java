package com.fyber.inneractive.sdk.metrics;

import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.metrics.i */
/* JADX INFO: loaded from: classes4.dex */
public final class C8290i {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f18490a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f18491b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public long f18492c;

    /* JADX INFO: renamed from: d */
    public long f18493d;

    /* JADX INFO: renamed from: a */
    public static JSONArray m20697a(LinkedHashMap linkedHashMap) {
        JSONArray jSONArray = new JSONArray();
        for (C8289h c8289h : linkedHashMap.keySet()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("outcome", c8289h.f18489b);
                jSONObject.putOpt("time", linkedHashMap.get(c8289h));
                jSONObject.putOpt("idx", Integer.valueOf(jSONArray.length()));
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
