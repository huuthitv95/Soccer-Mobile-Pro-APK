package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.c4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1520c4 {

    /* JADX INFO: renamed from: a */
    private final String f1281a;

    /* JADX INFO: renamed from: b */
    private final String f1282b;

    public C1520c4(JSONObject jSONObject, C1748l c1748l) {
        this.f1281a = JsonUtils.getString(jSONObject, "id", "");
        this.f1282b = JsonUtils.getString(jSONObject, "price", null);
    }

    /* JADX INFO: renamed from: a */
    public String m2198a() {
        return this.f1281a;
    }

    /* JADX INFO: renamed from: b */
    public String m2199b() {
        return this.f1282b;
    }
}
