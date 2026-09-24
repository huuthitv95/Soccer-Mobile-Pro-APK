package com.bytedance.sdk.openadsdk.slm.p260lr;

import com.bytedance.sdk.openadsdk.ihz.p232ri.p233lr.C3369ri;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ironsource.C11540L6;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.slm.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3525ka {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.slm.lr.ka$ri */
    public static class ri {

        /* JADX INFO: renamed from: lr */
        public final JSONObject f12795lr;

        /* JADX INFO: renamed from: ri */
        public final String f12796ri;

        public ri(String str, JSONObject jSONObject) {
            this.f12796ri = str;
            this.f12795lr = jSONObject;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(DeviceRequestsHelper.DEVICE_INFO_PARAM);
            if (jSONObjectOptJSONObject != null) {
                try {
                    jSONObjectOptJSONObject.put(C11540L6.f24947V0, C3369ri.m15224ri().m15229lr());
                    jSONObject.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, jSONObjectOptJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static InterfaceC3524ik m15961ri() {
        return C3523fi.m15960ri();
    }
}
