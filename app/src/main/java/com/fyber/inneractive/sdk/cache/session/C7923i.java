package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.EnumC7919c;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.session.i */
/* JADX INFO: loaded from: classes4.dex */
public final class C7923i {

    /* JADX INFO: renamed from: a */
    public final C7922h f17605a = new C7922h();

    /* JADX INFO: renamed from: a */
    public final JSONObject m20363a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : this.f17605a.entrySet()) {
                EnumC7919c enumC7919c = (EnumC7919c) entry.getKey();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", enumC7919c.m20359a().value());
                    jSONObject2.put("subType", enumC7919c.name().toLowerCase(Locale.US).contains("video") ? "video" : "display");
                    jSONObject2.put("session_data", ((C7921g) entry.getValue()).m20362a(true, true));
                    jSONArray.put(jSONObject2);
                } catch (Exception unused) {
                }
            }
            jSONObject.put("content", jSONArray);
        } catch (Exception unused2) {
        }
        return jSONObject;
    }
}
