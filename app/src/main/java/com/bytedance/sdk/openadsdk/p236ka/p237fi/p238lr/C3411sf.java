package com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr;

import com.bytedance.sdk.component.utils.C2707ac;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.fi.lr.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C3411sf extends AbstractC3405ik {

    /* JADX INFO: renamed from: lr */
    private final long f12174lr;

    /* JADX INFO: renamed from: ri */
    private final String f12175ri;

    public C3411sf(String str, long j) {
        this.f12175ri = str;
        this.f12174lr = j;
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.AbstractC3405ik
    /* JADX INFO: renamed from: ri */
    public void mo15410ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.f12175ri);
            jSONObject.put("preload_size", this.f12174lr);
        } catch (Throwable th) {
            C2707ac.m10196ik("LoadVideoStartModel", th.getMessage());
        }
    }
}
