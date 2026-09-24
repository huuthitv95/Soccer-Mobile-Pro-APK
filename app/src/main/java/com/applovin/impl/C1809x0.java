package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.x0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1809x0 extends C1800w0 {
    public C1809x0(JSONObject jSONObject, C1748l c1748l) {
        super(jSONObject, c1748l);
    }

    /* JADX INFO: renamed from: f */
    public List m5560f() {
        C1818y0 c1818y0M5608a;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f3487b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject != null && (c1818y0M5608a = C1818y0.m5608a(jSONObject, this.f3486a)) != null) {
                arrayList.add(c1818y0M5608a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public String m5561g() {
        return m5496b("message");
    }

    /* JADX INFO: renamed from: h */
    public String m5562h() {
        return m5496b("title");
    }

    @Override // com.applovin.impl.C1800w0
    public String toString() {
        return "ConsentFlowState{id=" + m5497c() + ", type=" + m5498d() + ", title=" + m5562h() + ", message=" + m5561g() + ", actions=" + m5560f() + "}";
    }
}
