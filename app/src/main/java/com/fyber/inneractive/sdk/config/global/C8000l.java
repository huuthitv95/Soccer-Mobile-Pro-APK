package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C11744X3;
import com.ironsource.C12288ke;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.l */
/* JADX INFO: loaded from: classes4.dex */
public final class C8000l {

    /* JADX INFO: renamed from: a */
    public final HashMap f17770a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static C8000l m20429a(JSONObject jSONObject) throws JSONException {
        C8000l c8000l = new C8000l();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C11744X3.a.f26185v);
        int i = 0;
        int i2 = 0;
        while (i2 < jSONArrayOptJSONArray.length()) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
            C8005q c8005q = new C8005q();
            c8005q.f17773b = jSONObject2.getString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("params");
            if (jSONObjectOptJSONObject != null) {
                c8005q.f17772a = new C8003o(jSONObjectOptJSONObject);
            } else {
                Object[] objArr = new Object[1];
                objArr[i] = c8005q.f17773b;
                IAlog.m21945a("RemoteFeature fromJson. feature %s has no params!", objArr);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(C12288ke.f30747d);
            if (jSONArrayOptJSONArray2 != null) {
                int i3 = i;
                while (i3 < jSONArrayOptJSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i3);
                    C7968b c7968b = new C7968b();
                    c7968b.f17744a = jSONObject3.getString("id");
                    c7968b.f17745b = jSONObject3.optInt("perc", 10);
                    JSONArray jSONArray = jSONObject3.getJSONArray("variants");
                    for (int i4 = i; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i4);
                        C7999k c7999k = new C7999k();
                        c7999k.f17768b = jSONObject4.getString("id");
                        c7999k.f17769c = jSONObject4.getInt("perc");
                        JSONObject jSONObjectOptJSONObject2 = jSONObject4.optJSONObject("params");
                        if (jSONObjectOptJSONObject2 != null) {
                            c7999k.f17772a = new C8003o(jSONObjectOptJSONObject2);
                        }
                        c7968b.f17746c.add(c7999k);
                    }
                    C7968b.m20411a(c7968b, jSONObject3.optJSONObject("include"), true);
                    C7968b.m20411a(c7968b, jSONObject3.optJSONObject("exclude"), false);
                    c8005q.f17774c.put(c7968b.f17744a, c7968b);
                    i3++;
                    i = 0;
                }
            }
            c8000l.f17770a.put(c8005q.f17773b, c8005q);
            i2++;
            i = i;
        }
        return c8000l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8000l.class != obj.getClass()) {
            return false;
        }
        return this.f17770a.equals(((C8000l) obj).f17770a);
    }

    public final int hashCode() {
        return this.f17770a.hashCode();
    }

    public final String toString() {
        return String.format("remoteConfig - features: %s", this.f17770a.values());
    }
}
