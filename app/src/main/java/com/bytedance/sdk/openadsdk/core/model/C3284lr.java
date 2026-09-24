package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3284lr {

    /* JADX INFO: renamed from: fi */
    private boolean f11299fi;

    /* JADX INFO: renamed from: ik */
    private String f11300ik;

    /* JADX INFO: renamed from: ka */
    private String f11301ka;

    /* JADX INFO: renamed from: lr */
    private String f11302lr;

    /* JADX INFO: renamed from: ri */
    private String f11303ri;

    /* JADX INFO: renamed from: di */
    public JSONObject m14192di() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_PRIVACY_URL, this.f11300ik);
            jSONObject.put("privacy_title", this.f11301ka);
            jSONObject.put("text", this.f11302lr);
            jSONObject.put("icon", this.f11303ri);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m14193fi() {
        return this.f11299fi;
    }

    /* JADX INFO: renamed from: ik */
    public String m14194ik() {
        return this.f11300ik;
    }

    /* JADX INFO: renamed from: ka */
    public String m14195ka() {
        return this.f11301ka;
    }

    /* JADX INFO: renamed from: lr */
    public String m14196lr() {
        return this.f11302lr;
    }

    /* JADX INFO: renamed from: ri */
    public String m14197ri() {
        return this.f11303ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m14198ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f11303ri = jSONObject.optString("icon");
        this.f11302lr = jSONObject.optString("text");
        this.f11300ik = jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL);
        this.f11301ka = jSONObject.optString("privacy_title");
    }

    /* JADX INFO: renamed from: ri */
    public void m14199ri(boolean z) {
        this.f11299fi = z;
    }
}
