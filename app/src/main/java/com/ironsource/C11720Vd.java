package com.ironsource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Vd */
/* JADX INFO: loaded from: classes6.dex */
public class C11720Vd {

    /* JADX INFO: renamed from: a */
    private JSONObject f26050a;

    public C11720Vd() {
        this.f26050a = new JSONObject();
    }

    /* JADX INFO: renamed from: f */
    private void m27749f(String str) {
        try {
            this.f26050a = new JSONObject(str);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            this.f26050a = new JSONObject();
        }
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m27753a() {
        return this.f26050a;
    }

    /* JADX INFO: renamed from: b */
    public Object m27756b(String str) {
        try {
            return m27753a().get(str);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m27758c(String str) {
        return this.f26050a.optBoolean(str);
    }

    /* JADX INFO: renamed from: d */
    public String m27759d(String str) {
        return this.f26050a.optString(str, null);
    }

    /* JADX INFO: renamed from: e */
    public boolean m27760e(String str) {
        return m27753a().isNull(str);
    }

    public String toString() {
        JSONObject jSONObject = this.f26050a;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    /* JADX INFO: renamed from: a */
    public boolean m27755a(String str) {
        return m27753a().has(str);
    }

    public C11720Vd(String str) {
        m27749f(str);
    }

    /* JADX INFO: renamed from: a */
    public String m27751a(String str, String str2) {
        return this.f26050a.optString(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static Object m27747b(Object obj) throws JSONException {
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                if (obj2 != null) {
                    jSONObject.put(obj2.toString(), m27747b(map.get(obj2)));
                }
            }
            return jSONObject;
        }
        if (!(obj instanceof Iterable)) {
            return obj;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public int m27750a(String str, int i) {
        return this.f26050a.optInt(str, i);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m27746a(JSONObject jSONObject) {
        return jSONObject.names() == null;
    }

    /* JADX INFO: renamed from: a */
    public List m27752a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m27745a(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m27754a(String str, JSONObject jSONObject) {
        try {
            this.f26050a.put(str, jSONObject);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
        }
    }

    /* JADX INFO: renamed from: a */
    private Object m27745a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return m27748b((JSONObject) obj);
        }
        return obj instanceof JSONArray ? m27752a((JSONArray) obj) : obj;
    }

    /* JADX INFO: renamed from: b */
    public void m27757b(String str, String str2) {
        try {
            this.f26050a.put(str, str2);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
        }
    }

    /* JADX INFO: renamed from: b */
    private Map<String, Object> m27748b(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, m27745a(jSONObject.get(next)));
        }
        return map;
    }
}
