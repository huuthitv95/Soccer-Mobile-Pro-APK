package com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr;

import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1998ri;
import com.bytedance.sdk.component.utils.C2707ac;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class bgr extends AbstractC3405ik {

    /* JADX INFO: renamed from: fi */
    private final String f12133fi;

    /* JADX INFO: renamed from: ik */
    private final int f12134ik;

    /* JADX INFO: renamed from: ka */
    private final int f12135ka;

    /* JADX INFO: renamed from: lr */
    private long f12136lr;

    /* JADX INFO: renamed from: ri */
    private long f12137ri;

    public bgr(C1998ri c1998ri) {
        this.f12134ik = c1998ri.m6369ri();
        this.f12135ka = c1998ri.m6368lr();
        this.f12133fi = c1998ri.m6367ik();
    }

    /* JADX INFO: renamed from: lr */
    public void m15411lr(long j) {
        this.f12136lr = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m15412ri(long j) {
        this.f12137ri = j;
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.AbstractC3405ik
    /* JADX INFO: renamed from: ri */
    public void mo15410ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.f12137ri);
            jSONObject.put("total_duration", this.f12136lr);
            jSONObject.put("error_code", this.f12134ik);
            jSONObject.put("extra_error_code", this.f12135ka);
            jSONObject.put("error_message", this.f12133fi);
        } catch (Throwable th) {
            C2707ac.m10196ik("PlayErrorModel", th.getMessage());
        }
    }
}
