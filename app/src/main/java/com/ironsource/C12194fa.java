package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.fa */
/* JADX INFO: loaded from: classes6.dex */
public class C12194fa {
    /* JADX INFO: renamed from: a */
    public static boolean m31481a(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m31483b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m31480a(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        if (jSONObjectArr != null) {
            for (JSONObject jSONObject2 : jSONObjectArr) {
                if (jSONObject2 != null) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        try {
                            jSONObject.put(next, jSONObject2.get(next));
                        } catch (JSONException e) {
                            C12317m4.m32153d().m32155a(e);
                            IronLog.INTERNAL.error(e.toString());
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static Object m31482b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof JSONArray) && !(obj instanceof JSONObject) && !obj.equals(JSONObject.NULL)) {
            try {
                if (obj instanceof Collection) {
                    return new JSONArray((Collection) obj);
                }
                if (obj.getClass().isArray()) {
                    return new JSONArray((Collection) Arrays.asList(obj));
                }
                if (obj instanceof Map) {
                    return new JSONObject((Map) obj);
                }
                if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
                    if (obj instanceof Enum) {
                        return obj.toString();
                    }
                    if (obj.getClass().getPackage().getName().startsWith("java.")) {
                        return obj.toString();
                    }
                }
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                return null;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m31478a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    map.put(next, m31476a(jSONObject.get(next)));
                } catch (JSONException e) {
                    C12317m4.m32153d().m32155a(e);
                    IronLog.INTERNAL.error(String.format("Could not put value in map: %s, %s", next, e.getMessage()));
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static List<Object> m31477a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(m31476a(jSONArray.get(i)));
            } catch (JSONException e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(String.format("Could not put value into list: %s", e.getMessage()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static Object m31476a(Object obj) {
        if (obj instanceof JSONObject) {
            return m31478a((JSONObject) obj);
        }
        return obj instanceof JSONArray ? m31477a((JSONArray) obj) : obj;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m31479a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), m31482b(entry.getValue()));
                } catch (JSONException e) {
                    C12317m4.m32153d().m32155a(e);
                    IronLog.INTERNAL.error(String.format("Could not map entry to object: %s, %s", entry.getKey(), entry.getValue()));
                }
            }
        }
        return jSONObject;
    }
}
