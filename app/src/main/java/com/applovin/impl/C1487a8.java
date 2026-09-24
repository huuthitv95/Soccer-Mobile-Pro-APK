package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.a8 */
/* JADX INFO: loaded from: classes3.dex */
public class C1487a8 implements InterfaceC1718s4 {

    /* JADX INFO: renamed from: a */
    private String f1014a;

    /* JADX INFO: renamed from: b */
    private String f1015b;

    private C1487a8() {
    }

    /* JADX INFO: renamed from: a */
    public static C1487a8 m1887a(C1702q8 c1702q8, C1487a8 c1487a8, C1748l c1748l) {
        if (c1702q8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (c1487a8 == null) {
            try {
                c1487a8 = new C1487a8();
            } catch (Throwable th) {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5172a("VastSystemInfo", "Error occurred while initializing", th);
                }
                c1748l.m4764E().m4333a("VastSystemInfo", th);
                return null;
            }
        }
        if (!StringUtils.isValidString(c1487a8.f1014a)) {
            String strM4128d = c1702q8.m4128d();
            if (StringUtils.isValidString(strM4128d)) {
                c1487a8.f1014a = strM4128d;
            }
        }
        if (!StringUtils.isValidString(c1487a8.f1015b)) {
            String str = (String) c1702q8.m4123a().get("version");
            if (StringUtils.isValidString(str)) {
                c1487a8.f1015b = str;
            }
        }
        return c1487a8;
    }

    /* JADX INFO: renamed from: a */
    public static C1487a8 m1888a(JSONObject jSONObject, C1748l c1748l) {
        if (jSONObject == null) {
            return null;
        }
        C1487a8 c1487a8 = new C1487a8();
        c1487a8.f1014a = JsonUtils.getString(jSONObject, "name", null);
        c1487a8.f1015b = JsonUtils.getString(jSONObject, "version", null);
        return c1487a8;
    }

    @Override // com.applovin.impl.InterfaceC1718s4
    /* JADX INFO: renamed from: a */
    public JSONObject mo1889a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", this.f1014a);
        JsonUtils.putString(jSONObject, "version", this.f1015b);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1487a8)) {
            return false;
        }
        C1487a8 c1487a8 = (C1487a8) obj;
        String str = this.f1014a;
        if (str == null ? c1487a8.f1014a != null : !str.equals(c1487a8.f1014a)) {
            return false;
        }
        String str2 = this.f1015b;
        String str3 = c1487a8.f1015b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public int hashCode() {
        String str = this.f1014a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1015b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f1014a + "', version='" + this.f1015b + "'}";
    }
}
