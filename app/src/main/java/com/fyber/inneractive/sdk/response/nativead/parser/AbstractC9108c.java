package com.fyber.inneractive.sdk.response.nativead.parser;

import com.fyber.inneractive.sdk.response.nativead.C9102h;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.response.nativead.parser.c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9108c {
    /* JADX INFO: renamed from: a */
    public static C9102h m21903a(JSONObject jSONObject) {
        C9102h c9102h = new C9102h();
        if (jSONObject != null) {
            c9102h.f21352a = AbstractC9195v.m22026a(jSONObject, "url");
            c9102h.f21354c = AbstractC9195v.m22026a(jSONObject, "fallback");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clicktrackers");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (strOptString != null && !strOptString.isEmpty() && !strOptString.equals(AbstractJsonLexerKt.NULL)) {
                        c9102h.f21353b.add(strOptString);
                    }
                }
            }
        }
        return c9102h;
    }
}
