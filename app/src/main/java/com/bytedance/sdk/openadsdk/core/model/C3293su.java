package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.su */
/* JADX INFO: loaded from: classes3.dex */
public class C3293su {

    /* JADX INFO: renamed from: ik */
    private int f11369ik;

    /* JADX INFO: renamed from: ka */
    private String f11370ka = "Next Ad";

    /* JADX INFO: renamed from: lr */
    private int f11371lr;

    /* JADX INFO: renamed from: ri */
    private int f11372ri;

    /* JADX INFO: renamed from: ri */
    public static C3293su m14295ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3293su c3293su = new C3293su();
        try {
            int iMax = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int iOptInt = jSONObject.optInt("is_allow_pause", 0);
            int iOptInt2 = jSONObject.optInt(CampaignEx.JSON_KEY_LANDING_TYPE, 0);
            String strOptString = jSONObject.optString("endcard_next_ad_text", "Next Ad");
            c3293su.m14297ik(iMax);
            c3293su.m14300lr(iOptInt);
            c3293su.m14303ri(strOptString);
            c3293su.m14302ri(iOptInt2);
        } catch (Throwable unused) {
        }
        return c3293su;
    }

    /* JADX INFO: renamed from: ik */
    public String m14296ik() {
        return this.f11370ka;
    }

    /* JADX INFO: renamed from: ik */
    public void m14297ik(int i) {
        this.f11372ri = i;
    }

    /* JADX INFO: renamed from: ka */
    public int m14298ka() {
        return this.f11372ri;
    }

    /* JADX INFO: renamed from: lr */
    public int m14299lr() {
        return this.f11371lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m14300lr(int i) {
        this.f11371lr = i;
    }

    /* JADX INFO: renamed from: ri */
    public int m14301ri() {
        return this.f11369ik;
    }

    /* JADX INFO: renamed from: ri */
    public void m14302ri(int i) {
        this.f11369ik = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m14303ri(String str) {
        this.f11370ka = str;
    }
}
