package com.bytedance.sdk.component.adexpress.dynamic.p119ka;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ka.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2473ka {

    /* JADX INFO: renamed from: ik */
    public String f6763ik;

    /* JADX INFO: renamed from: ka */
    public String f6764ka;

    /* JADX INFO: renamed from: lr */
    public String f6765lr;

    /* JADX INFO: renamed from: ri */
    public List<ri> f6766ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ka.ka$ri */
    public static class ri {

        /* JADX INFO: renamed from: lr */
        public JSONObject f6767lr;

        /* JADX INFO: renamed from: ri */
        public int f6768ri;
    }

    /* JADX INFO: renamed from: ri */
    public static C2473ka m8606ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C2473ka c2473ka = new C2473ka();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    ri riVar = new ri();
                    riVar.f6768ri = jSONObjectOptJSONObject.optInt("id");
                    riVar.f6767lr = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(riVar);
                }
            }
        } catch (JSONException unused) {
        }
        c2473ka.f6766ri = arrayList;
        c2473ka.f6765lr = jSONObject.optString("diff_data");
        c2473ka.f6763ik = jSONObject.optString("style_diff");
        c2473ka.f6764ka = jSONObject.optString("tag_diff");
        return c2473ka;
    }
}
