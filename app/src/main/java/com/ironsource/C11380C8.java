package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.C8 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11380C8 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final String m25575b(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString(str);
        if (strOptString.length() == 0) {
            return null;
        }
        return strOptString;
    }
}
