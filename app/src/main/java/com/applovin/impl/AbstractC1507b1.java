package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.C1846R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.b1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1507b1 {
    /* JADX INFO: renamed from: a */
    public static List m2064a(C1748l c1748l) {
        c1748l.m4782Q();
        if (C1768p.m5160a()) {
            c1748l.m4782Q().m5171a("ConsentFlowStateProvider", "Generating consent flow states...");
        }
        String strM4028a = AbstractC1701q7.m4028a(C1846R.raw.applovin_consent_flow_unified_cmp, C1748l.m4756p(), c1748l);
        if (TextUtils.isEmpty(strM4028a)) {
            throw new IllegalStateException("Unable to retrieve consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strM4028a, null);
        if (jSONObjectJsonObjectFromJsonString == null) {
            throw new IllegalStateException("Unable to parse consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObjectJsonObjectFromJsonString, "states", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(C1800w0.m5491a(JsonUtils.getJSONObject(jSONArray, i, new JSONObject()), c1748l));
        }
        return arrayList;
    }
}
