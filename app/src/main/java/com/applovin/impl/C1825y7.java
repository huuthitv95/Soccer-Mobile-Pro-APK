package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.y7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1825y7 implements InterfaceC1718s4 {

    /* JADX INFO: renamed from: a */
    private final String f3653a;

    /* JADX INFO: renamed from: b */
    private final String f3654b;

    private C1825y7(String str, String str2) {
        this.f3653a = str;
        this.f3654b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C1825y7 m5724a(C1702q8 c1702q8, C1748l c1748l) {
        if (c1702q8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            return new C1825y7((String) c1702q8.m4123a().get("apiFramework"), c1702q8.m4128d());
        } catch (Throwable th) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5172a("VastJavaScriptResource", "Error occurred while initializing", th);
            }
            c1748l.m4764E().m4333a("VastJavaScriptResource", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1825y7 m5725a(JSONObject jSONObject, C1748l c1748l) {
        if (jSONObject == null) {
            return null;
        }
        return new C1825y7(JsonUtils.getString(jSONObject, "api_framework", null), JsonUtils.getString(jSONObject, "javascript_resource_url", null));
    }

    @Override // com.applovin.impl.InterfaceC1718s4
    /* JADX INFO: renamed from: a */
    public JSONObject mo1889a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "api_framework", this.f3653a);
        JsonUtils.putString(jSONObject, "javascript_resource_url", this.f3654b);
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public String m5726b() {
        return this.f3653a;
    }

    /* JADX INFO: renamed from: c */
    public String m5727c() {
        return this.f3654b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1825y7 c1825y7 = (C1825y7) obj;
            String str = this.f3653a;
            if (str == null ? c1825y7.f3653a != null : !str.equals(c1825y7.f3653a)) {
                return false;
            }
            String str2 = this.f3654b;
            String str3 = c1825y7.f3654b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3653a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3654b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f3653a + "', javascriptResourceUrl='" + this.f3654b + "'}";
    }
}
