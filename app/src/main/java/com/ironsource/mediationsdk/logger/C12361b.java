package com.ironsource.mediationsdk.logger;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C12317m4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.logger.b */
/* JADX INFO: loaded from: classes6.dex */
class C12361b {

    /* JADX INFO: renamed from: a */
    private IronSourceLogger.IronSourceTag f31306a;

    /* JADX INFO: renamed from: b */
    private String f31307b;

    /* JADX INFO: renamed from: c */
    private String f31308c;

    /* JADX INFO: renamed from: d */
    private int f31309d;

    public C12361b(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i) {
        this.f31306a = ironSourceTag;
        this.f31307b = str;
        this.f31308c = str2;
        this.f31309d = i;
    }

    /* JADX INFO: renamed from: a */
    public int m32575a() {
        return this.f31309d;
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m32576b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", this.f31307b);
            jSONObject.put(ViewHierarchyConstants.TAG_KEY, this.f31306a);
            jSONObject.put("level", this.f31309d);
            jSONObject.put("message", this.f31308c);
            return jSONObject;
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }
}
