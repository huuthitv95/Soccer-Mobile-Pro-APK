package com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr;

import com.bytedance.sdk.component.utils.C2707ac;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.fi.lr.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C3401aw extends AbstractC3405ik {

    /* JADX INFO: renamed from: ik */
    public long f12130ik;

    /* JADX INFO: renamed from: lr */
    public int f12131lr;

    /* JADX INFO: renamed from: ri */
    public long f12132ri;

    /* JADX INFO: renamed from: lr */
    public void m15407lr(long j) {
        this.f12130ik = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m15408ri(int i) {
        this.f12131lr = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m15409ri(long j) {
        this.f12132ri = j;
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.AbstractC3405ik
    /* JADX INFO: renamed from: ri */
    public void mo15410ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.f12132ri);
            jSONObject.put("buffers_count", this.f12131lr);
            jSONObject.put("total_duration", this.f12130ik);
        } catch (Throwable th) {
            C2707ac.m10196ik("PlayBufferModel", th.getMessage());
        }
    }
}
