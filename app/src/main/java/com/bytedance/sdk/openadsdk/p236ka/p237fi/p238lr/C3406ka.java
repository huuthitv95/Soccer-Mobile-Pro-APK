package com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr;

import com.bytedance.sdk.component.utils.C2707ac;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.fi.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3406ka extends AbstractC3405ik {

    /* JADX INFO: renamed from: ik */
    public int f12150ik;

    /* JADX INFO: renamed from: ka */
    public int f12151ka = 0;

    /* JADX INFO: renamed from: lr */
    public long f12152lr;

    /* JADX INFO: renamed from: ri */
    public long f12153ri;

    /* JADX INFO: renamed from: lr */
    public void m15423lr(int i) {
        this.f12151ka = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m15424lr(long j) {
        this.f12152lr = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m15425ri(int i) {
        this.f12150ik = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m15426ri(long j) {
        this.f12153ri = j;
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.AbstractC3405ik
    /* JADX INFO: renamed from: ri */
    public void mo15410ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.f12153ri);
            jSONObject.put("buffers_time", this.f12152lr);
            jSONObject.put("break_reason", this.f12150ik);
            jSONObject.put("video_backup", this.f12151ka);
        } catch (Throwable th) {
            C2707ac.m10196ik("FeedBreakModel", th.getMessage());
        }
    }
}
