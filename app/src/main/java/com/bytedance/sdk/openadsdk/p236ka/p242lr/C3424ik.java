package com.bytedance.sdk.openadsdk.p236ka.p242lr;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3424ik implements InterfaceC3425lr {

    /* JADX INFO: renamed from: ri */
    InterfaceC3425lr f12381ri;

    @Override // com.bytedance.sdk.openadsdk.p236ka.p242lr.InterfaceC3425lr
    /* JADX INFO: renamed from: ri */
    public void mo15612ri(JSONObject jSONObject, long j) throws JSONException {
        InterfaceC3425lr interfaceC3425lr = this.f12381ri;
        if (interfaceC3425lr != null) {
            interfaceC3425lr.mo15612ri(jSONObject, j);
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j);
    }
}
