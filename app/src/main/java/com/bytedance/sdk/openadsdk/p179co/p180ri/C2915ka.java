package com.bytedance.sdk.openadsdk.p179co.p180ri;

import com.bytedance.sdk.component.p168ri.AbstractC2698ka;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.openadsdk.core.dzy;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.co.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2915ka extends AbstractC2698ka<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: ri */
    private final dzy f8722ri;

    public C2915ka(dzy dzyVar) {
        this.f8722ri = dzyVar;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11212ri(C2705vr c2705vr, dzy dzyVar) {
        c2705vr.m10186ri("expressAdViewStartZoom", new C2915ka(dzyVar));
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2698ka
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public JSONObject mo10166ri(String str, JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        this.f8722ri.m13418ka(jSONObject);
        return null;
    }
}
