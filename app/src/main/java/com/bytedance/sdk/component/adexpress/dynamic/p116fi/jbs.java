package com.bytedance.sdk.component.adexpress.dynamic.p116fi;

import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.C2499lr;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jbs {
    /* JADX INFO: renamed from: lr */
    public static String m8373lr(String str, String str2) {
        if (!C2490ka.m8810lr()) {
            return C2439ri.m8412ri(str);
        }
        if (str.indexOf(46) < 0) {
            str = str + ".png";
        }
        return str2 + "static/images/" + str;
    }

    /* JADX INFO: renamed from: ri */
    public static String m8374ri(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectM8874zk = C2499lr.m8874zk(str);
        if (jSONObjectM8874zk == null || (jSONObjectOptJSONObject = jSONObjectM8874zk.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("data");
    }

    /* JADX INFO: renamed from: ri */
    public static String m8375ri(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectM8874zk = C2499lr.m8874zk(str);
        if (jSONObjectM8874zk == null || (jSONObjectOptJSONObject = jSONObjectM8874zk.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m8376ri(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectM8874zk = C2499lr.m8874zk(str);
        if (jSONObjectM8874zk == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return m8378ri(jSONObject2, jSONObjectM8874zk.optJSONObject("themeValues"), jSONObject);
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m8377ri(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("values");
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m8378ri(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ri */
    public static void m8379ri(String str, JSONObject jSONObject) {
        JSONObject jSONObjectM8874zk = C2499lr.m8874zk(str);
        if (jSONObjectM8874zk == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectM8874zk.optJSONObject("values");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        m8380ri(jSONObjectOptJSONObject, jSONObject);
    }

    /* JADX INFO: renamed from: ri */
    private static void m8380ri(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }
}
