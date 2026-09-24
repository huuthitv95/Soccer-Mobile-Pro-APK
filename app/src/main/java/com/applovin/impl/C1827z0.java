package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.z0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1827z0 extends C1800w0 {

    /* JADX INFO: renamed from: c */
    private Map f3657c;

    public C1827z0(JSONObject jSONObject, C1748l c1748l) {
        super(jSONObject, c1748l);
    }

    /* JADX INFO: renamed from: f */
    public Map m5731f() {
        return this.f3657c;
    }

    /* JADX INFO: renamed from: g */
    public String m5732g() {
        return JsonUtils.getString(this.f3487b, "name", null);
    }

    @Override // com.applovin.impl.C1800w0
    public String toString() {
        return "ConsentFlowState{id=" + m5497c() + ", type=" + m5498d() + ", name=" + m5732g() + "}";
    }
}
