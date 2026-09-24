package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ea */
/* JADX INFO: loaded from: classes6.dex */
class C12168ea extends AbstractC12157e {

    /* JADX INFO: renamed from: i */
    private final String f30302i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";

    /* JADX INFO: renamed from: j */
    private final String f30303j = "super.dwh.mediation_events";

    /* JADX INFO: renamed from: k */
    private final String f30304k = C11341A5.f23805R;

    /* JADX INFO: renamed from: l */
    private final String f30305l = "data";

    C12168ea(int i) {
        this.f30271g = i;
    }

    @Override // com.ironsource.AbstractC12157e
    /* JADX INFO: renamed from: a */
    public String mo27248a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.AbstractC12157e
    /* JADX INFO: renamed from: c */
    public String mo27250c() {
        return "ironbeast";
    }

    @Override // com.ironsource.AbstractC12157e
    /* JADX INFO: renamed from: a */
    public String mo27249a(ArrayList<C12580w5> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            this.f30270f = new JSONObject();
        } else {
            this.f30270f = jSONObject;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C12580w5> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObjectM31332a = m31332a(it.next());
                    if (jSONObjectM31332a != null) {
                        jSONArray.put(jSONObjectM31332a);
                    }
                }
            }
            jSONObject2.put(C11341A5.f23805R, "super.dwh.mediation_events");
            jSONObject2.put("data", m31331a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
