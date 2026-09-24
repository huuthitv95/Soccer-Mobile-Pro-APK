package com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr;

import com.bytedance.sdk.component.utils.C2707ac;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends AbstractC3405ik {

    /* JADX INFO: renamed from: lr */
    private final long f12148lr;

    /* JADX INFO: renamed from: ri */
    private final String f12149ri;

    public jbs(String str, long j) {
        this.f12149ri = str;
        this.f12148lr = j;
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.AbstractC3405ik
    /* JADX INFO: renamed from: ri */
    public void mo15410ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.f12149ri);
            jSONObject.put("preload_size", this.f12148lr);
        } catch (Throwable th) {
            C2707ac.m10196ik("LoadVideoCancelModel", th.getMessage());
        }
    }
}
