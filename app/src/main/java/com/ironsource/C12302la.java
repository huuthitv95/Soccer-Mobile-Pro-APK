package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.la */
/* JADX INFO: loaded from: classes6.dex */
public class C12302la {

    /* JADX INFO: renamed from: a */
    private String f30856a;

    /* JADX INFO: renamed from: b */
    private JSONObject f30857b;

    /* JADX INFO: renamed from: c */
    private String f30858c;

    /* JADX INFO: renamed from: d */
    private String f30859d;

    public C12302la(JSONObject jSONObject) {
        this.f30856a = jSONObject.optString(C11744X3.g.f26254b);
        this.f30857b = jSONObject.optJSONObject(C11744X3.g.f26255c);
        this.f30858c = jSONObject.optString("success");
        this.f30859d = jSONObject.optString(C11744X3.g.f26257e);
    }

    /* JADX INFO: renamed from: a */
    public String m32072a() {
        return this.f30859d;
    }

    /* JADX INFO: renamed from: b */
    public String m32073b() {
        return this.f30856a;
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m32074c() {
        return this.f30857b;
    }

    /* JADX INFO: renamed from: d */
    public String m32075d() {
        return this.f30858c;
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m32076e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C11744X3.g.f26254b, this.f30856a);
            jSONObject.put(C11744X3.g.f26255c, this.f30857b);
            jSONObject.put("success", this.f30858c);
            jSONObject.put(C11744X3.g.f26257e, this.f30859d);
            return jSONObject;
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }
}
