package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.u */
/* JADX INFO: compiled from: DomainDeviceInfo.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13226u extends C13192e {

    /* JADX INFO: renamed from: w */
    public int f36389w;

    /* JADX INFO: renamed from: x */
    public int f36390x;

    public C13226u(Context context) {
        super(context);
        this.f36390x = C13211m0.m37779x();
        this.f36389w = C13211m0.m37747h();
    }

    @Override // com.mbridge.msdk.foundation.tools.C13192e
    /* JADX INFO: renamed from: a */
    public JSONObject mo37664a() {
        JSONObject jSONObjectMo37664a = super.mo37664a();
        try {
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt", this.f36390x + "");
                jSONObject.put("dmf", this.f36389w);
                return jSONObjectMo37664a;
            }
        } catch (JSONException e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("DomainDeviceInfo", e.getMessage());
            }
        }
        return jSONObjectMo37664a;
    }
}
