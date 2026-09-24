package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.m8 */
/* JADX INFO: loaded from: classes3.dex */
public class C1624m8 {

    /* JADX INFO: renamed from: a */
    private final String f2072a;

    /* JADX INFO: renamed from: b */
    private final String f2073b;

    /* JADX INFO: renamed from: c */
    private final List f2074c;

    public C1624m8(JSONObject jSONObject) {
        this.f2072a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f2073b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.f2074c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    /* JADX INFO: renamed from: a */
    public String m3241a() {
        return this.f2072a;
    }

    /* JADX INFO: renamed from: b */
    public String m3242b() {
        return this.f2073b;
    }

    /* JADX INFO: renamed from: c */
    public List m3243c() {
        return this.f2074c;
    }
}
