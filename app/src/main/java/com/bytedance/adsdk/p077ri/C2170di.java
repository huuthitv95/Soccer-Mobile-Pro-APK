package com.bytedance.adsdk.p077ri;

import android.text.TextUtils;
import com.bytedance.adsdk.p077ri.p078lr.C2217ri;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2170di implements jbs {
    @Override // com.bytedance.adsdk.p077ri.jbs
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public String mo7214ri(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strValueOf);
            String strValueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(strValueOf2)) {
                return null;
            }
            Object objM7305ri = C2217ri.m7302ri(strValueOf2).m7305ri(jSONObject2);
            if (!TextUtils.isEmpty(String.valueOf(objM7305ri))) {
                return String.valueOf(objM7305ri);
            }
            if (objArr.length >= 3) {
                return String.valueOf(objArr[2]);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }
}
