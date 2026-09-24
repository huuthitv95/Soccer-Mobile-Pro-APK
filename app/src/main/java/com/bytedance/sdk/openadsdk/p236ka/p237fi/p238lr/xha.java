package com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr;

import com.bytedance.sdk.component.utils.C2707ac;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends AbstractC3405ik {

    /* JADX INFO: renamed from: lr */
    private long f12192lr;

    /* JADX INFO: renamed from: ri */
    private long f12193ri;

    /* JADX INFO: renamed from: lr */
    public void m15477lr(long j) {
        this.f12192lr = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m15478ri(long j) {
        this.f12193ri = j;
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.AbstractC3405ik
    /* JADX INFO: renamed from: ri */
    public void mo15410ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.f12193ri);
            jSONObject.put("total_duration", this.f12192lr);
        } catch (Throwable th) {
            C2707ac.m10196ik("FeedPauseModel", th.getMessage());
        }
    }
}
