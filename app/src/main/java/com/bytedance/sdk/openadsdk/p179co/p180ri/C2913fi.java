package com.bytedance.sdk.openadsdk.p179co.p180ri;

import com.bytedance.sdk.component.p168ri.AbstractC2698ka;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.openadsdk.core.jbs.p220ri.C3239lr;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.co.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2913fi extends AbstractC2698ka<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: ri */
    private JSONObject f8717ri;

    public C2913fi(JSONObject jSONObject) {
        this.f8717ri = jSONObject;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11209ri(C2705vr c2705vr, JSONObject jSONObject) {
        c2705vr.m10186ri("getData", new C2913fi(jSONObject));
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2698ka
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public JSONObject mo10166ri(String str, JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        return C3239lr.m13716ri(this.f8717ri, jSONObject);
    }
}
