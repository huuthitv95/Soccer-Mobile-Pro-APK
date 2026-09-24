package com.apm.insight.runtime;

import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1434j;
import com.ironsource.C11744X3;
import com.ironsource.mediationsdk.metadata.C12364a;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.runtime.k */
/* JADX INFO: compiled from: NpthConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1469k {

    /* JADX INFO: renamed from: a */
    private static JSONObject f870a = new JSONObject();

    /* JADX INFO: renamed from: a */
    public static void m1653a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            String strM1528a = C1447a.m1528a(jSONObject);
            File file = new File(C1434j.m1398j(C1390e.m1032g()), "apminsight/configCrash/configNative");
            if (strM1528a == null) {
                f870a = new JSONObject();
                return;
            }
            JSONObject jSONObject2 = new JSONObject(strM1528a);
            f870a = jSONObject2;
            C1430f.m1330a(file, m1659b(jSONObject2));
        } catch (JSONException unused) {
        } catch (Throwable th) {
            C1386c.m990a();
            C1468j.m1652a(th, "NPTH_CATCH");
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1654a(String str, C1463e c1463e) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = f870a;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) == null || m1655a(jSONObjectOptJSONObject.optJSONArray("disable"), c1463e)) {
            return false;
        }
        return m1655a(jSONObjectOptJSONObject.optJSONArray(C12364a.f31324j), c1463e);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1655a(JSONArray jSONArray, C1463e c1463e) {
        if (C1373a.m868a(jSONArray)) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                C1386c.m990a();
                C1468j.m1652a(new IllegalArgumentException("err config: ".concat(String.valueOf(jSONArray))), "NPTH_CATCH");
            } else if (m1656a(jSONObjectOptJSONObject, c1463e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1656a(JSONObject jSONObject, C1463e c1463e) {
        Iterator<String> itKeys = jSONObject.keys();
        boolean z = false;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                if (next.startsWith("header_")) {
                    if (!m1657a(jSONObject.optJSONObject(next), c1463e.mo1634b(next.substring(7)))) {
                        C1373a.m861a((Object) "not match ".concat(String.valueOf(next)));
                        return false;
                    }
                } else if (!next.startsWith("java_")) {
                    C1373a.m861a((Object) "no rules match ".concat(String.valueOf(next)));
                } else if (!m1657a(jSONObject.optJSONObject(next), c1463e.mo1525a(next.substring(5)))) {
                    C1373a.m861a((Object) "not match ".concat(String.valueOf(next)));
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1657a(JSONObject jSONObject, Object obj) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
        if (jSONArrayOptJSONArray.length() == 0) {
            return false;
        }
        String strOptString = jSONObject.optString("op");
        String strValueOf = String.valueOf(obj);
        if (strOptString.equals(C11744X3.j.f26434b)) {
            return strValueOf.equals(String.valueOf(jSONArrayOptJSONArray.opt(0)));
        }
        if (strOptString.equals(ScarConstants.IN_SIGNAL_KEY)) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                if (String.valueOf(jSONArrayOptJSONArray.opt(i)).equals(strValueOf)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private static JSONArray m1658b(JSONArray jSONArray, C1463e c1463e) {
        JSONArray jSONArray2 = new JSONArray();
        if (!C1373a.m868a(jSONArray)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject == null) {
                    C1386c.m990a();
                    C1468j.m1652a(new IllegalArgumentException("err config: ".concat(String.valueOf(jSONArray))), "NPTH_CATCH");
                } else if (m1656a(jSONObjectOptJSONObject, c1463e)) {
                    jSONArray2.put(jSONObjectOptJSONObject);
                }
            }
        }
        return jSONArray2;
    }

    /* JADX INFO: renamed from: b */
    private static JSONObject m1659b(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        C1463e c1463e = new C1463e();
        JSONObject jSONObject2 = new JSONObject();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!"configType".equals(next)) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject == null) {
                    C1386c.m990a();
                    C1468j.m1652a(new IllegalArgumentException("err config with key: ".concat(String.valueOf(next))), "NPTH_CATCH");
                } else if (m1655a(jSONObjectOptJSONObject.optJSONArray("disable"), c1463e)) {
                    C1373a.m861a((Object) "match diable ".concat(String.valueOf(next)));
                } else {
                    JSONArray jSONArrayM1658b = m1658b(jSONObjectOptJSONObject.optJSONArray(C12364a.f31324j), c1463e);
                    if (C1373a.m868a(jSONArrayM1658b)) {
                        C1373a.m861a((Object) "not match ".concat(String.valueOf(next)));
                    } else {
                        try {
                            jSONObject2.put(next, new JSONObject().put(C12364a.f31324j, jSONArrayM1658b));
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        }
        return jSONObject2;
    }
}
