package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.o */
/* JADX INFO: loaded from: classes4.dex */
public final class C8021o {

    /* JADX INFO: renamed from: a */
    public final HashMap f17804a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f17805b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static C8021o m20442a(JSONObject jSONObject) {
        C8021o c8021o = new C8021o();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("overrides");
        JSONArray jSONArrayNames = jSONObjectOptJSONObject.names();
        for (int i = 0; i < jSONArrayNames.length(); i++) {
            String strOptString = jSONArrayNames.optString(i, null);
            String strOptString2 = jSONObjectOptJSONObject.optString(strOptString, null);
            if (strOptString != null && strOptString2 != null) {
                c8021o.f17804a.put(strOptString, strOptString2);
            }
        }
        if (jSONObjectOptJSONObject2 != null) {
            JSONArray jSONArrayNames2 = jSONObjectOptJSONObject2.names();
            for (int i2 = 0; i2 < jSONArrayNames2.length(); i2++) {
                String strOptString3 = jSONArrayNames2.optString(i2, null);
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(strOptString3);
                if (strOptString3 != null && jSONObjectOptJSONObject3 != null) {
                    c8021o.f17805b.put(strOptString3, new C8017m(jSONObjectOptJSONObject3));
                }
            }
        }
        return c8021o;
    }

    /* JADX INFO: renamed from: a */
    public final int m20443a(String str, int i, int i2) {
        try {
            i = Integer.parseInt(m20445a(str, Integer.toString(i)));
        } catch (Throwable unused) {
        }
        return Math.max(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public final C8015l m20444a(String str) {
        String str2 = IAConfigManager.f17654M.f17672d;
        C8017m c8017m = this.f17805b.containsKey(str2) ? (C8017m) this.f17805b.get(str2) : new C8017m();
        c8017m.getClass();
        return c8017m.f17801a.containsKey(str) ? (C8015l) c8017m.f17801a.get(str) : new C8015l();
    }

    /* JADX INFO: renamed from: a */
    public final String m20445a(String str, String str2) {
        return this.f17804a.containsKey(str) ? (String) this.f17804a.get(str) : str2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20446a(boolean z, String str) {
        try {
            return Boolean.parseBoolean(m20445a(str, Boolean.toString(z)));
        } catch (Throwable unused) {
            return z;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m20447b(String str, int i, int i2) {
        int i3;
        try {
            i3 = Integer.parseInt(m20445a(str, Integer.toString(i)));
        } catch (Throwable unused) {
            i3 = i;
        }
        return (i3 < i2 || i3 > 30) ? i : i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8021o.class == obj.getClass()) {
            C8021o c8021o = (C8021o) obj;
            if (this.f17804a.equals(c8021o.f17804a) && this.f17805b.equals(c8021o.f17805b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17804a.hashCode();
    }
}
