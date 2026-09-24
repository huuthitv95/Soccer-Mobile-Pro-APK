package com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr;

import com.bytedance.sdk.component.utils.C2707ac;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.fi.lr.co */
/* JADX INFO: loaded from: classes3.dex */
public class C3402co extends AbstractC3405ik {

    /* JADX INFO: renamed from: ik */
    private long f12138ik;

    /* JADX INFO: renamed from: ka */
    private long f12139ka;

    /* JADX INFO: renamed from: lr */
    private long f12140lr;

    /* JADX INFO: renamed from: ri */
    private String f12141ri;

    /* JADX INFO: renamed from: ik */
    public void m15413ik(long j) {
        this.f12139ka = j;
    }

    /* JADX INFO: renamed from: lr */
    public void m15414lr(long j) {
        this.f12138ik = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m15415ri(long j) {
        this.f12140lr = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m15416ri(String str) {
        this.f12141ri = str;
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.AbstractC3405ik
    /* JADX INFO: renamed from: ri */
    public void mo15410ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.f12141ri);
            jSONObject.put("preload_size", this.f12140lr);
            jSONObject.put("load_time", this.f12138ik);
            jSONObject.put("local_cache", this.f12139ka);
        } catch (Throwable th) {
            C2707ac.m10196ik("LoadVideoSuccessModel", th.getMessage());
        }
    }
}
