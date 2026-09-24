package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.qg */
/* JADX INFO: loaded from: classes6.dex */
public class C12448qg {

    /* JADX INFO: renamed from: a */
    public static final String f31810a = "errMsg";

    /* JADX INFO: renamed from: a */
    public static JSONObject m33206a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", str);
            jSONObject.put("adViewId", str2);
            return jSONObject;
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject;
        }
    }
}
