package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.ay */
/* JADX INFO: loaded from: classes3.dex */
public class C3275ay {

    /* JADX INFO: renamed from: ik */
    private final int f11175ik;

    /* JADX INFO: renamed from: ka */
    private final int f11176ka;

    /* JADX INFO: renamed from: lr */
    private final int f11177lr;

    /* JADX INFO: renamed from: ri */
    private final int f11178ri;

    public C3275ay(JSONObject jSONObject) {
        this.f11178ri = jSONObject.optInt("max_time", 0);
        this.f11177lr = jSONObject.optInt("auto_skip_time", -1);
        this.f11175ik = jSONObject.optInt("show_after_inactivity", 10);
        this.f11176ka = jSONObject.optInt("user_wait_time", 10);
    }

    /* JADX INFO: renamed from: ik */
    public int m14019ik() {
        return this.f11176ka;
    }

    /* JADX INFO: renamed from: lr */
    public int m14020lr() {
        return this.f11175ik;
    }

    /* JADX INFO: renamed from: ri */
    public int m14021ri() {
        return this.f11178ri;
    }
}
