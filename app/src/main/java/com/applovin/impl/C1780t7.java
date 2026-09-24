package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.t7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1780t7 implements InterfaceC1718s4 {

    /* JADX INFO: renamed from: a */
    private final List f3391a;

    private C1780t7(List list) {
        this.f3391a = list;
    }

    /* JADX INFO: renamed from: a */
    public static C1780t7 m5246a(C1702q8 c1702q8, C1780t7 c1780t7, AbstractC1798v7 abstractC1798v7, C1748l c1748l) {
        try {
            List listM5248b = c1780t7 != null ? c1780t7.m5248b() : new ArrayList();
            Iterator it = c1702q8.m4122a("Verification").iterator();
            while (it.hasNext()) {
                C1721s7 c1721s7M4353a = C1721s7.m4353a((C1702q8) it.next(), abstractC1798v7, c1748l);
                if (c1721s7M4353a != null) {
                    listM5248b.add(c1721s7M4353a);
                }
            }
            return new C1780t7(listM5248b);
        } catch (Throwable th) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5172a("VastAdVerifications", "Error occurred while initializing", th);
            }
            c1748l.m4764E().m4333a("VastAdVerifications", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    static C1780t7 m5247a(JSONObject jSONObject, C1748l c1748l) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "verifications", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            C1721s7 c1721s7M4354a = C1721s7.m4354a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), c1748l);
            if (c1721s7M4354a != null) {
                arrayList.add(c1721s7M4354a);
            }
        }
        return new C1780t7(arrayList);
    }

    @Override // com.applovin.impl.InterfaceC1718s4
    /* JADX INFO: renamed from: a */
    public JSONObject mo1889a() {
        JSONObject jSONObject = new JSONObject();
        if (this.f3391a != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f3391a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C1721s7) it.next()).mo1889a());
            }
            JsonUtils.putJsonArray(jSONObject, "verifications", jSONArray);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public List m5248b() {
        return this.f3391a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1780t7) {
            return this.f3391a.equals(((C1780t7) obj).f3391a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3391a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f3391a + "'}";
    }
}
