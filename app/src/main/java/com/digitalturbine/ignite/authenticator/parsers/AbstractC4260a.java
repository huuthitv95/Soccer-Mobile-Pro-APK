package com.digitalturbine.ignite.authenticator.parsers;

import com.digitalturbine.ignite.authenticator.entities.C4250a;
import com.digitalturbine.ignite.authenticator.logger.C4259a;
import com.ironsource.C11744X3;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.parsers.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4260a {
    /* JADX INFO: renamed from: a */
    public static C4250a m20310a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        String str = "";
        boolean z = true;
        try {
            if (!jSONObject.has("data") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
                z = false;
            } else {
                String strOptString = jSONObjectOptJSONObject.optString("igniteVersion", "");
                try {
                    if (jSONObjectOptJSONObject.has(C11744X3.a.f26185v) && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(C11744X3.a.f26185v)) != null) {
                        for (int length = jSONArrayOptJSONArray.length() - 1; length >= 0; length--) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(length);
                            if (jSONObjectOptJSONObject2.has("type") && "GET_PROPERTY".equalsIgnoreCase(jSONObjectOptJSONObject2.optString("type", ""))) {
                                str = strOptString;
                            }
                        }
                    }
                    str = strOptString;
                } catch (Exception e) {
                    e = e;
                    str = strOptString;
                    C4259a.m20309b("IgniteVersionParser: exception on parse: %s", e.getMessage());
                }
                z = false;
            }
        } catch (Exception e2) {
            e = e2;
        }
        return new C4250a(z, str);
    }
}
