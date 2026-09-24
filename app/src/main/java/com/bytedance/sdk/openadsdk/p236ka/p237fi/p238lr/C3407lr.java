package com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr;

import com.bytedance.sdk.component.utils.C2707ac;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.fi.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3407lr extends AbstractC3405ik {

    /* JADX INFO: renamed from: ik */
    private int f12154ik;

    /* JADX INFO: renamed from: ka */
    private int f12155ka;

    /* JADX INFO: renamed from: lr */
    private long f12156lr;

    /* JADX INFO: renamed from: ri */
    private long f12157ri;

    /* JADX INFO: renamed from: lr */
    public void m15427lr(int i) {
        this.f12155ka = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m15428lr(long j) {
        this.f12156lr = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m15429ri(int i) {
        this.f12154ik = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m15430ri(long j) {
        this.f12157ri = j;
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.AbstractC3405ik
    /* JADX INFO: renamed from: ri */
    public void mo15410ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.f12157ri);
            jSONObject.put("total_duration", this.f12156lr);
            jSONObject.put("vbtt_skip_type", this.f12154ik);
            jSONObject.put("skip_reason", this.f12155ka);
        } catch (Throwable th) {
            C2707ac.m10196ik("EndcardSkipModel", th.getMessage());
        }
    }
}
