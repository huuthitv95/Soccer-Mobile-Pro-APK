package com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr;

import com.bytedance.sdk.component.utils.C2707ac;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.fi.lr.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3404fi extends AbstractC3405ik {

    /* JADX INFO: renamed from: lr */
    private long f12146lr;

    /* JADX INFO: renamed from: ri */
    private long f12147ri;

    /* JADX INFO: renamed from: lr */
    public void m15421lr(long j) {
        this.f12146lr = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m15422ri(long j) {
        this.f12147ri = j;
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.AbstractC3405ik
    /* JADX INFO: renamed from: ri */
    public void mo15410ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.f12147ri);
            jSONObject.put("total_duration", this.f12146lr);
        } catch (Throwable th) {
            C2707ac.m10196ik("FeedContinueModel", th.getMessage());
        }
    }
}
