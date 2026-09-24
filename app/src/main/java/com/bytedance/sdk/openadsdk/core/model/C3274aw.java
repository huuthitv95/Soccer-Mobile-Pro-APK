package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C3274aw {

    /* JADX INFO: renamed from: ik */
    private int f11172ik;

    /* JADX INFO: renamed from: lr */
    private String f11173lr;

    /* JADX INFO: renamed from: ri */
    private String f11174ri;

    /* JADX INFO: renamed from: ik */
    public int m14012ik() {
        return this.f11172ik;
    }

    /* JADX INFO: renamed from: ka */
    public JSONObject m14013ka() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.f11174ri);
            jSONObject.put("ft", this.f11172ik);
            jSONObject.put("fu", this.f11173lr);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: lr */
    public String m14014lr() {
        return this.f11173lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m14015lr(String str) {
        this.f11173lr = str;
    }

    /* JADX INFO: renamed from: ri */
    public String m14016ri() {
        return this.f11174ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m14017ri(int i) {
        this.f11172ik = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m14018ri(String str) {
        this.f11174ri = str;
    }
}
