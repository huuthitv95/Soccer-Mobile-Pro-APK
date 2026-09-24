package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.z2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4193z2 {
    /* JADX INFO: renamed from: a */
    public static final Boolean m20093a(JSONObject jSONObject, String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return Boolean.valueOf(jSONObject.getBoolean(name));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final JSONObject m20094a(JSONObject jSONObject, String name, Object obj) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            jSONObject.put(name, obj);
            return jSONObject;
        } catch (JSONException e) {
            C4048sb.m19411b("put (" + name + ")" + e, (Throwable) null, 2, (Object) null);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final byte[] m20095a(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }
}
