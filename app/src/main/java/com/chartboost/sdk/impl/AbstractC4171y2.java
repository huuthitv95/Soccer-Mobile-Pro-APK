package com.chartboost.sdk.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.y2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4171y2 {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.y2$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final String f17001a;

        /* JADX INFO: renamed from: b */
        public final Object f17002b;

        public a(String str, Object obj) {
            this.f17001a = str;
            this.f17002b = obj;
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m20012a(String str, Object obj) {
        return new a(str, obj);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m20013a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (jSONObject == null) {
                break;
            }
            jSONObject = jSONObject.optJSONObject(str);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m20014a(a... aVarArr) {
        JSONObject jSONObject = new JSONObject();
        for (a aVar : aVarArr) {
            m20015a(jSONObject, aVar.f17001a, aVar.f17002b);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static void m20015a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C4048sb.m19410b("put (" + str + ")", e);
        }
    }
}
