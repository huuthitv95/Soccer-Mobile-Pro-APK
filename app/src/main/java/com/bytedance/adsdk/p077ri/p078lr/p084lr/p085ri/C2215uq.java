package com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri;

import android.text.TextUtils;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2193di;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.InterfaceC2194fi;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import com.ironsource.C11744X3;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.lr.ri.uq */
/* JADX INFO: loaded from: classes3.dex */
public class C2215uq implements InterfaceC2200ri {

    /* JADX INFO: renamed from: ri */
    private final String f5463ri;

    public C2215uq(String str) {
        this.f5463ri = str;
    }

    /* JADX INFO: renamed from: ri */
    private Object m7300ri(String[] strArr, int i, JSONObject jSONObject) {
        Object objOpt;
        if (strArr != null && strArr.length > 0 && i < strArr.length && jSONObject != null) {
            String str = strArr[i];
            int iIndexOf = str.indexOf(C11744X3.j.f26438d);
            int iIndexOf2 = str.indexOf(C11744X3.j.f26440e);
            if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf > iIndexOf2) {
                objOpt = jSONObject.opt(str);
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i2 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i2) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            if (i != strArr.length - 1) {
                if (objOpt instanceof String) {
                    try {
                        return m7300ri(strArr, i + 1, new JSONObject((String) objOpt));
                    } catch (JSONException unused2) {
                    }
                } else if (objOpt instanceof JSONObject) {
                    return m7300ri(strArr, i + 1, (JSONObject) objOpt);
                }
            }
            return objOpt;
        }
        return null;
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: lr */
    public String mo7291lr() {
        return this.f5463ri;
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public InterfaceC2194fi mo7292ri() {
        return EnumC2193di.VARIABLE;
    }

    /* JADX INFO: renamed from: ri */
    public Object m7301ri(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m7300ri(str.split("\\."), 0, jSONObject);
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public Object mo7293ri(Map<String, JSONObject> map) {
        Object objM7301ri;
        if (map == null || map.size() <= 0 || (objM7301ri = m7301ri(this.f5463ri, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return objM7301ri;
    }

    public String toString() {
        return "VariableNode [literals=" + this.f5463ri + C11744X3.j.f26440e;
    }
}
