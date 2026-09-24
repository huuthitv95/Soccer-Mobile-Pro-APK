package com.bytedance.adsdk.p077ri;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2220qt implements jbs {
    @Override // com.bytedance.adsdk.p077ri.jbs
    /* JADX INFO: renamed from: ri */
    public Object mo7214ri(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        if (!(obj instanceof JSONArray) || !(obj2 instanceof Integer)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (jSONArray.length() > 0) {
            return jSONArray.opt(((Integer) obj2).intValue() % jSONArray.length());
        }
        return null;
    }
}
