package com.fyber.inneractive.sdk.util;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.c1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9140c1 {
    /* JADX INFO: renamed from: a */
    public static void m21959a(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof InterfaceC9137b1) {
                    jSONObject.putOpt(str, ((InterfaceC9137b1) obj).mo20439a());
                } else {
                    jSONObject.putOpt(str, obj);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
