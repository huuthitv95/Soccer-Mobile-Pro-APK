package com.fyber.inneractive.sdk.response.nativead.parser;

import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.response.nativead.parser.b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9107b {
    /* JADX INFO: renamed from: a */
    public static ArrayList m21902a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (strOptString != null && !strOptString.isEmpty() && !strOptString.equals(AbstractJsonLexerKt.NULL)) {
                    arrayList.add(strOptString);
                }
            }
        }
        return arrayList;
    }
}
