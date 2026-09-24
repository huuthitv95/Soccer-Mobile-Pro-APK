package com.fyber.inneractive.sdk.cache.session;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.session.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C7921g {

    /* JADX INFO: renamed from: a */
    public int f17601a;

    /* JADX INFO: renamed from: b */
    public int f17602b;

    /* JADX INFO: renamed from: c */
    public int f17603c;

    /* JADX INFO: renamed from: d */
    public final long f17604d;

    public C7921g(int i, int i2, int i3, long j) {
        this.f17604d = j;
        this.f17601a = i;
        this.f17602b = i2;
        this.f17603c = i3;
    }

    /* JADX INFO: renamed from: a */
    public static C7921g m20361a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        long jOptLong = jSONObject.optLong("time");
        int iOptInt = jSONObject.optInt("cli", -1);
        int iOptInt2 = jSONObject.optInt("imp", -1);
        int iOptInt3 = jSONObject.optInt("com", -1);
        if (jOptLong == 0 || iOptInt < 0 || iOptInt2 < 0 || iOptInt3 < 0) {
            return null;
        }
        return new C7921g(iOptInt2, iOptInt, iOptInt3, jOptLong);
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m20362a(boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put("time", this.f17604d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("imp", this.f17601a);
        if (z2) {
            jSONObject.put("com", this.f17603c);
        }
        jSONObject.put("cli", this.f17602b);
        return jSONObject;
    }
}
