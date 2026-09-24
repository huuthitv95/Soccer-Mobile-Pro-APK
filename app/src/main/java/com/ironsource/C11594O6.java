package com.ironsource;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.O6 */
/* JADX INFO: loaded from: classes6.dex */
public class C11594O6 {

    /* JADX INFO: renamed from: a */
    private static C11594O6 f25281a = new C11594O6();

    /* JADX INFO: renamed from: a */
    public static C11594O6 m26727a() {
        return f25281a;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m26732b(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt instanceof List) {
                    jSONObject.put(next, TextUtils.join(",", (List) objOpt));
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static HashMap<String, Object> m26728a(ConcurrentHashMap<String, Object> concurrentHashMap) throws JSONException {
        HashMap<String, Object> map = new HashMap<>();
        for (Map.Entry<String, Object> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue() instanceof JSONObject) {
                map.put(entry.getKey(), m26731a((JSONObject) entry.getValue()));
            } else if (entry.getValue() instanceof JSONArray) {
                map.put(entry.getKey(), m26730a((JSONArray) entry.getValue()));
            } else if (entry.getValue() instanceof Map) {
                map.put(entry.getKey(), m26729a((Map<String, Object>) entry.getValue()));
            } else {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m26731a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject2.put(next, jSONObject.opt(next));
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m26730a(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(jSONArray.opt(i));
        }
        return jSONArray2;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m26729a(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, map.get(str));
        }
        return map2;
    }
}
