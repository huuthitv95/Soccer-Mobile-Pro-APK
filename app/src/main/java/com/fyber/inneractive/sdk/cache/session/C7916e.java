package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.EnumC7919c;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.session.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C7916e {

    /* JADX INFO: renamed from: a */
    public C7923i f17595a = new C7923i();

    /* JADX INFO: renamed from: c */
    public final Object f17597c = new Object();

    /* JADX INFO: renamed from: d */
    public final Object f17598d = new Object();

    /* JADX INFO: renamed from: b */
    public final C7912a f17596b = new C7912a();

    /* JADX INFO: renamed from: a */
    public static JSONObject m20356a(C7916e c7916e) {
        c7916e.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currentSession", c7916e.f17595a.m20363a());
            for (Map.Entry entry : c7916e.f17596b.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                EnumC7919c enumC7919c = (EnumC7919c) entry.getKey();
                Iterator it = ((PriorityQueue) entry.getValue()).iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C7921g) it.next()).m20362a(true, true));
                }
                jSONObject.put(enumC7919c.name(), jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final void m20357a(EnumC7919c enumC7919c, C7921g c7921g) {
        synchronized (this.f17598d) {
            C7925k c7925k = (C7925k) this.f17596b.get(enumC7919c);
            if (c7925k != null) {
                c7925k.add(c7921g);
            }
        }
    }
}
