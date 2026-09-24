package com.bytedance.sdk.openadsdk.p179co.p180ri;

import com.bytedance.sdk.component.p168ri.AbstractC2698ka;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.openadsdk.core.dzy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class slm extends AbstractC2698ka<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: ri */
    private dzy f8735ri;

    public slm(dzy dzyVar) {
        this.f8735ri = dzyVar;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11224ri(C2705vr c2705vr, dzy dzyVar) {
        c2705vr.m10186ri("sendLogV3", new slm(dzyVar));
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2698ka
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public JSONObject mo10166ri(String str, JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        this.f8735ri.m13404co(jSONObject);
        return null;
    }
}
