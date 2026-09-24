package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.EnumC7919c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.session.b */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC7913b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JSONObject f17589a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RunnableC7914c f17590b;

    public RunnableC7913b(RunnableC7914c runnableC7914c, JSONObject jSONObject) {
        this.f17590b = runnableC7914c;
        this.f17589a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7921g c7921g;
        C7916e c7916e = this.f17590b.f17591a;
        JSONObject jSONObject = this.f17589a;
        c7916e.getClass();
        for (EnumC7919c enumC7919c : EnumC7919c.values()) {
            if (enumC7919c != EnumC7919c.NONE) {
                String strName = enumC7919c.name();
                JSONArray jSONArray = new JSONArray();
                try {
                    jSONArray = jSONObject.getJSONArray(strName);
                } catch (JSONException unused) {
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    C7921g c7921gM20361a = C7921g.m20361a(jSONArray.optJSONObject(i));
                    if (c7921gM20361a != null && c7921gM20361a.f17601a != 0) {
                        c7916e.m20357a(enumC7919c, c7921gM20361a);
                    }
                }
            }
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("currentSession");
        if (jSONObjectOptJSONObject != null) {
            C7922h c7922h = new C7922h();
            JSONArray jSONArray2 = new JSONArray();
            try {
                jSONArray2 = jSONObjectOptJSONObject.getJSONArray("content");
            } catch (JSONException unused2) {
            }
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2 = jSONArray2.getJSONObject(i2);
                } catch (JSONException unused3) {
                }
                EnumC7919c enumC7919cM20358a = EnumC7919c.m20358a(jSONObject2.optString("type"), jSONObject2.optString("subType"));
                C7921g c7921gM20361a2 = C7921g.m20361a(jSONObject2.optJSONObject("session_data"));
                if (c7921gM20361a2 != null) {
                    c7922h.put(enumC7919cM20358a, c7921gM20361a2);
                }
            }
            for (EnumC7919c enumC7919c2 : EnumC7919c.values()) {
                if (enumC7919c2 != EnumC7919c.NONE && (c7921g = (C7921g) c7922h.get(enumC7919c2)) != null && c7921g.f17601a != 0) {
                    c7916e.m20357a(enumC7919c2, c7921g);
                }
            }
        }
        this.f17590b.f17591a.getClass();
    }
}
