package com.bytedance.sdk.openadsdk.p179co.p180ri;

import com.bytedance.sdk.component.p168ri.AbstractC2698ka;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.openadsdk.core.dzy;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.co.ri.vr */
/* JADX INFO: loaded from: classes9.dex */
public class C2924vr extends AbstractC2698ka<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: ri */
    private final dzy f8742ri;

    public C2924vr(dzy dzyVar) {
        this.f8742ri = dzyVar;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11227ri(C2705vr c2705vr, dzy dzyVar) {
        c2705vr.m10186ri("commonConvert", new C2924vr(dzyVar));
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2698ka
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public JSONObject mo10166ri(String str, JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        this.f8742ri.m13406di(jSONObject);
        return null;
    }
}
