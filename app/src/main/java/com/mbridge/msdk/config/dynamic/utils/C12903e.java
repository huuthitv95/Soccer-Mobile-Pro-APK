package com.mbridge.msdk.config.dynamic.utils;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.utils.e */
/* JADX INFO: compiled from: JSONParser.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12903e {
    /* JADX INFO: renamed from: a */
    public Map<String, Object> m36162a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap();
        }
        try {
            return m36163a(new JSONObject(str));
        } catch (JSONException e) {
            C13219q0.m37817b("JSONParser", e.getMessage(), e);
            return new HashMap();
        }
    }

    /* JADX INFO: renamed from: a */
    public Map<String, Object> m36163a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof JSONObject) {
                        linkedHashMap.put(next, m36163a((JSONObject) obj));
                    } else if (obj instanceof JSONArray) {
                        linkedHashMap.put(next, m36161a((JSONArray) obj));
                    } else {
                        linkedHashMap.put(next, obj);
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37817b("JSONParser", th.getMessage(), th);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public List<Object> m36161a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    arrayList.add(m36163a((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    arrayList.add(m36161a((JSONArray) obj));
                } else {
                    arrayList.add(obj);
                }
            } catch (Throwable th) {
                C13219q0.m37817b("JSONParser", th.getMessage(), th);
            }
        }
        return arrayList;
    }
}
