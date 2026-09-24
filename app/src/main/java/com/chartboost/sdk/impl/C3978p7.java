package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.p7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3978p7 {

    /* JADX INFO: renamed from: a */
    public static final C3978p7 f15789a = new C3978p7();

    /* JADX INFO: renamed from: a */
    public static final List m19028a(JSONArray jSONArray) {
        JSONObject jSONObject;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray != null ? jSONArray.length() : 0;
        for (int i = 0; i < length; i++) {
            if (jSONArray != null && (jSONObject = jSONArray.getJSONObject(i)) != null) {
                try {
                    arrayList.add(C3865k7.f15032f.m18360a(jSONObject));
                } catch (JSONException e) {
                    C4048sb.m19416e("Failed to parse event tracker at index " + i, e);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        return arrayList;
    }
}
