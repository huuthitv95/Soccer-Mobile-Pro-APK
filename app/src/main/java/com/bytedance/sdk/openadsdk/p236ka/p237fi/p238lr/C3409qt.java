package com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr;

import com.bytedance.sdk.component.utils.C2707ac;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.fi.lr.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C3409qt extends AbstractC3405ik {

    /* JADX INFO: renamed from: di */
    private String f12162di;

    /* JADX INFO: renamed from: fi */
    private String f12163fi;

    /* JADX INFO: renamed from: ik */
    private long f12164ik;

    /* JADX INFO: renamed from: ka */
    private int f12165ka;

    /* JADX INFO: renamed from: lr */
    private long f12166lr;

    /* JADX INFO: renamed from: ri */
    private String f12167ri;

    /* JADX INFO: renamed from: ik */
    public void m15434ik(String str) {
        this.f12162di = str;
    }

    /* JADX INFO: renamed from: lr */
    public void m15435lr(long j) {
        this.f12164ik = j;
    }

    /* JADX INFO: renamed from: lr */
    public void m15436lr(String str) {
        this.f12163fi = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m15437ri(int i) {
        this.f12165ka = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m15438ri(long j) {
        this.f12166lr = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m15439ri(String str) {
        this.f12167ri = str;
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.AbstractC3405ik
    /* JADX INFO: renamed from: ri */
    public void mo15410ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.f12167ri);
            jSONObject.put("preload_size", this.f12166lr);
            jSONObject.put("load_time", this.f12164ik);
            jSONObject.put("error_code", this.f12165ka);
            jSONObject.put("error_message", this.f12163fi);
            jSONObject.put("error_message_server", this.f12162di);
        } catch (Throwable th) {
            C2707ac.m10196ik("LoadVideoErrorModel", th.getMessage());
        }
    }
}
