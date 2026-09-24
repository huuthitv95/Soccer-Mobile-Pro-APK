package com.apm.insight.entity;

import android.os.Environment;
import com.apm.insight.C1373a;
import com.apm.insight.C1390e;
import com.apm.insight.p022l.C1430f;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.entity.d */
/* JADX INFO: compiled from: HeaderCombiner.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1398d {

    /* JADX INFO: renamed from: a */
    private static String f545a;

    /* JADX INFO: renamed from: b */
    private static JSONObject f546b;

    /* JADX INFO: renamed from: a */
    private static void m1120a() {
        if (f545a == null) {
            f545a = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + C1390e.m1032g().getPackageName() + "/AutomationTestInfo.json";
        }
        if (f546b == null) {
            try {
                f546b = new JSONObject(C1430f.m1323a(f545a, "\n"));
            } catch (IOException unused) {
                f546b = new JSONObject();
            } catch (JSONException unused2) {
                f546b = new JSONObject();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1121a(JSONObject jSONObject) {
        Object objOpt;
        if (jSONObject == null) {
            return;
        }
        try {
            m1120a();
            JSONObject jSONObject2 = f546b;
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!"slardar_filter".equals(next) && (objOpt = f546b.opt(next)) != null) {
                        try {
                            jSONObject.put(next, objOpt);
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1122b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            m1120a();
            JSONObject jSONObject2 = f546b;
            if (jSONObject2 != null) {
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("slardar_filter");
                if (C1373a.m869a(jSONObjectOptJSONObject)) {
                    return;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("filters");
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("filters", jSONObjectOptJSONObject2);
                    } catch (JSONException unused) {
                    }
                }
                C1395a.m1084b(jSONObjectOptJSONObject2, jSONObjectOptJSONObject);
            }
        } catch (Throwable unused2) {
        }
    }
}
