package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.m */
/* JADX INFO: loaded from: classes4.dex */
public final class C8017m {

    /* JADX INFO: renamed from: a */
    public final HashMap f17801a = new HashMap();

    public C8017m() {
    }

    public C8017m(JSONObject jSONObject) {
        JSONArray jSONArrayNames;
        JSONArray jSONArrayNames2 = jSONObject.names();
        for (int i = 0; i < jSONArrayNames2.length(); i++) {
            String strOptString = jSONArrayNames2.optString(i, null);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(strOptString);
            C8015l c8015l = new C8015l();
            if (jSONObjectOptJSONObject != null && (jSONArrayNames = jSONObjectOptJSONObject.names()) != null) {
                for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
                    String strOptString2 = jSONArrayNames.optString(i2, null);
                    String strOptString3 = jSONObjectOptJSONObject.optString(strOptString2, null);
                    if (strOptString2 != null && strOptString3 != null) {
                        c8015l.f17796a.put(strOptString2, strOptString3);
                    }
                }
            }
            this.f17801a.put(strOptString, c8015l);
        }
    }
}
