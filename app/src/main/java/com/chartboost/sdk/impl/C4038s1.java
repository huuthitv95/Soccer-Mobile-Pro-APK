package com.chartboost.sdk.impl;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.s1 */
/* JADX INFO: loaded from: classes3.dex */
public class C4038s1 {

    /* JADX INFO: renamed from: a */
    public final String f16217a;

    /* JADX INFO: renamed from: b */
    public final String f16218b;

    /* JADX INFO: renamed from: c */
    public final String f16219c;

    public C4038s1(String str, String str2, String str3) {
        this.f16217a = str;
        this.f16218b = str2;
        this.f16219c = str3;
    }

    /* JADX INFO: renamed from: a */
    public static Map m19371a(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        if (jSONObject == null) {
            C4048sb.m19407a("deserializeAssets assetsJson is null", null);
            return map;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next2);
                map.put(next2, new C4038s1(next, jSONObject3.getString("filename"), jSONObject3.getString("url")));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static Map m19372a(JSONObject jSONObject, int i) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("templates")) != null) {
            int iMin = Math.min(i, jSONArrayOptJSONArray.length());
            for (int i2 = 0; i2 < iMin; i2++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                Iterator it = m19371a(jSONObject2 != null ? m19374a(jSONObject2.getJSONArray(MessengerShareContentUtility.ELEMENTS)) : null).entrySet().iterator();
                while (it.hasNext()) {
                    C4038s1 c4038s1 = (C4038s1) ((Map.Entry) it.next()).getValue();
                    map.put(c4038s1.f16218b, c4038s1);
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static Map m19373a(JSONObject jSONObject, String str) throws JSONException {
        HashMap map = new HashMap();
        if (jSONObject != null && str != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("name");
                map.put(string, new C4038s1(str, string, jSONObject2.getString("value")));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m19374a(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObjectM20014a = AbstractC4171y2.m20014a(new AbstractC4171y2.a[0]);
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String strOptString = jSONObject.optString("name");
                String strOptString2 = jSONObject.optString("type");
                String strOptString3 = jSONObject.optString("value");
                String strOptString4 = jSONObject.optString("param");
                if (!"param".equals(strOptString2) && strOptString4.isEmpty()) {
                    JSONObject jSONObjectOptJSONObject = jSONObjectM20014a.optJSONObject(strOptString2);
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = AbstractC4171y2.m20014a(new AbstractC4171y2.a[0]);
                        jSONObjectM20014a.put(strOptString2, jSONObjectOptJSONObject);
                    }
                    jSONObjectOptJSONObject.put("html".equals(strOptString2) ? "body" : strOptString, AbstractC4171y2.m20014a(AbstractC4171y2.m20012a("filename", strOptString), AbstractC4171y2.m20012a("url", strOptString3)));
                }
            }
        }
        return jSONObjectM20014a;
    }

    /* JADX INFO: renamed from: b */
    public static Map m19375b(JSONObject jSONObject, int i) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("cache_assets");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if ("templates".equals(next)) {
                        map.putAll(m19372a(jSONObject2, i));
                    } else {
                        map.putAll(m19373a(jSONObject2, next));
                    }
                }
            } catch (JSONException e) {
                C4048sb.m19410b("v2PrefetchToAssets: " + e, null);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public File m19376a(File file) {
        if (this.f16217a == null || this.f16218b == null) {
            C4048sb.m19407a("Cannot create file. Directory or filename is null.", null);
        } else {
            String str = this.f16217a + RemoteSettings.FORWARD_SLASH_STRING + this.f16218b;
            try {
                return new File(file, str);
            } catch (Exception e) {
                C4048sb.m19407a("Cannot create file for path: " + str + ". Error: " + e, null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public String m19377a() {
        return this.f16219c;
    }

    public String toString() {
        return "Asset{directory='" + this.f16217a + "', filename='" + this.f16218b + "', url='" + this.f16219c + "'}";
    }
}
