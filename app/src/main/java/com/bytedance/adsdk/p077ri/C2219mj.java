package com.bytedance.adsdk.p077ri;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2219mj implements jbs {
    @Override // com.bytedance.adsdk.p077ri.jbs
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public Boolean mo7214ri(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return Boolean.FALSE;
        }
        try {
            Double.parseDouble(String.valueOf(objArr[0]));
            return Boolean.TRUE;
        } catch (NumberFormatException unused) {
            return Boolean.FALSE;
        }
    }
}
