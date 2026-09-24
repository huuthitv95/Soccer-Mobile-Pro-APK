package com.bytedance.adsdk.p077ri;

import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2171fi implements jbs {
    @Override // com.bytedance.adsdk.p077ri.jbs
    /* JADX INFO: renamed from: ri */
    public Object mo7214ri(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                String strValueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(strValueOf) && !TextUtils.equals(strValueOf, AbstractJsonLexerKt.NULL)) {
                    return strValueOf;
                }
            }
        }
        return null;
    }
}
