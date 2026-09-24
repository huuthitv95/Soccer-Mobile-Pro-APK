package com.bytedance.sdk.openadsdk.p175ay.p176lr;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ay.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2894ri {

    /* JADX INFO: renamed from: ik */
    private final float f8630ik;

    /* JADX INFO: renamed from: lr */
    private final int f8631lr;

    /* JADX INFO: renamed from: ri */
    private final int f8632ri;

    public C2894ri(int i, int i2, float f) {
        this.f8632ri = i;
        this.f8631lr = i2;
        this.f8630ik = f;
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m11133ri(C2894ri c2894ri) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", c2894ri.f8632ri);
        jSONObject.put("height", c2894ri.f8631lr);
        jSONObject.put("alpha", c2894ri.f8630ik);
        return jSONObject;
    }
}
