package com.ironsource;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.I6 */
/* JADX INFO: loaded from: classes6.dex */
public class C11486I6 {

    /* JADX INFO: renamed from: b */
    public static final String f24483b = "userId";

    /* JADX INFO: renamed from: c */
    public static final String f24484c = "appKey";

    /* JADX INFO: renamed from: d */
    private static C11486I6 f24485d;

    /* JADX INFO: renamed from: a */
    private final JSONObject f24486a = new JSONObject();

    private C11486I6() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C11486I6 m26069a() {
        if (f24485d == null) {
            f24485d = new C11486I6();
        }
        return f24485d;
    }

    /* JADX INFO: renamed from: b */
    public synchronized JSONObject m26073b() throws JSONException {
        if (C11455Gb.m25891U().mo25846h().mo32193t()) {
            return new JSONObject(this.f24486a.toString());
        }
        return this.f24486a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m26072a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                m26071a(str, map.get(str));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m26071a(String str, Object obj) {
        try {
            this.f24486a.put(str, obj);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m26070a(String str) {
        return this.f24486a.optString(str);
    }
}
