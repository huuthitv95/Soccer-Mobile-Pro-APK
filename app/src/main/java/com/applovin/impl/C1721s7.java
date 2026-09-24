package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.s7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1721s7 implements InterfaceC1718s4 {

    /* JADX INFO: renamed from: a */
    private final String f2804a;

    /* JADX INFO: renamed from: b */
    private final List f2805b;

    /* JADX INFO: renamed from: c */
    private final String f2806c;

    /* JADX INFO: renamed from: d */
    private final Set f2807d;

    private C1721s7(String str, List list, String str2, Set set) {
        this.f2804a = str;
        this.f2805b = list;
        this.f2806c = str2;
        this.f2807d = set;
    }

    /* JADX INFO: renamed from: a */
    public static C1721s7 m4353a(C1702q8 c1702q8, AbstractC1798v7 abstractC1798v7, C1748l c1748l) {
        try {
            String str = (String) c1702q8.m4123a().get("vendor");
            C1702q8 c1702q8M4124b = c1702q8.m4124b("VerificationParameters");
            String strM4128d = c1702q8M4124b != null ? c1702q8M4124b.m4128d() : null;
            List listM4122a = c1702q8.m4122a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(listM4122a.size());
            Iterator it = listM4122a.iterator();
            while (it.hasNext()) {
                C1825y7 c1825y7M5724a = C1825y7.m5724a((C1702q8) it.next(), c1748l);
                if (c1825y7M5724a != null) {
                    arrayList.add(c1825y7M5724a);
                }
            }
            HashMap map = new HashMap();
            AbstractC1534d8.m2436a(c1702q8, map, abstractC1798v7, c1748l);
            return new C1721s7(str, arrayList, strM4128d, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5172a("VastAdVerification", "Error occurred while initializing", th);
            }
            c1748l.m4764E().m4333a("VastAdVerification", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1721s7 m4354a(JSONObject jSONObject, C1748l c1748l) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "vendor_id", null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "javascript_resources", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            C1825y7 c1825y7M5725a = C1825y7.m5725a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), c1748l);
            if (c1825y7M5725a != null) {
                arrayList.add(c1825y7M5725a);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "verification_parameters", null);
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_event_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            C1514b8 c1514b8M2138a = C1514b8.m2138a(JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null), c1748l);
            if (c1514b8M2138a != null) {
                hashSet.add(c1514b8M2138a);
            }
        }
        return new C1721s7(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.InterfaceC1718s4
    /* JADX INFO: renamed from: a */
    public JSONObject mo1889a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "vendor_id", this.f2804a);
        if (this.f2805b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f2805b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C1825y7) it.next()).mo1889a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, "verification_parameters", this.f2806c);
        if (this.f2807d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f2807d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((C1514b8) it2.next()).mo1889a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public Set m4355b() {
        return this.f2807d;
    }

    /* JADX INFO: renamed from: c */
    public List m4356c() {
        return this.f2805b;
    }

    /* JADX INFO: renamed from: d */
    public String m4357d() {
        return this.f2804a;
    }

    /* JADX INFO: renamed from: e */
    public String m4358e() {
        return this.f2806c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1721s7 c1721s7 = (C1721s7) obj;
            String str = this.f2804a;
            if (str == null ? c1721s7.f2804a != null : !str.equals(c1721s7.f2804a)) {
                return false;
            }
            List list = this.f2805b;
            if (list == null ? c1721s7.f2805b != null : !list.equals(c1721s7.f2805b)) {
                return false;
            }
            String str2 = this.f2806c;
            if (str2 == null ? c1721s7.f2806c != null : !str2.equals(c1721s7.f2806c)) {
                return false;
            }
            Set set = this.f2807d;
            Set set2 = c1721s7.f2807d;
            if (set != null) {
                return set.equals(set2);
            }
            if (set2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f2804a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f2805b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f2806c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.f2807d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f2804a + "'javascriptResources='" + this.f2805b + "'verificationParameters='" + this.f2806c + "'errorEventTrackers='" + this.f2807d + "'}";
    }
}
