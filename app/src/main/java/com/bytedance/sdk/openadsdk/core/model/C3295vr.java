package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C3295vr {

    /* JADX INFO: renamed from: lr */
    private final int f11389lr;

    /* JADX INFO: renamed from: ri */
    private final int f11390ri;

    public C3295vr(JSONObject jSONObject) {
        this.f11390ri = jSONObject.optInt("auto_click", 0);
        this.f11389lr = jSONObject.optInt("hidden_bar", 0);
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m14328ri(wjv wjvVar) {
        if (wjvVar == null || !wjvVar.m14576zz() || wjvVar.m14566yw() == null) {
            return false;
        }
        return wjvVar.m14566yw().m14329lr();
    }

    /* JADX INFO: renamed from: lr */
    public boolean m14329lr() {
        return this.f11389lr == 1;
    }

    /* JADX INFO: renamed from: ri */
    public int m14330ri() {
        return this.f11390ri;
    }
}
