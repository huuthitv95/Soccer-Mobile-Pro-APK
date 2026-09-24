package com.apm.insight.runtime;

import com.apm.insight.C1373a;
import com.apm.insight.C1390e;
import com.apm.insight.entity.C1396b;
import com.apm.insight.p021k.C1414a;
import com.apm.insight.p021k.C1423j;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.runtime.a */
/* JADX INFO: compiled from: ApmConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1447a {
    static {
        new ConcurrentLinkedQueue();
    }

    /* JADX INFO: renamed from: a */
    public static int m1526a(int i, String... strArr) {
        return C1373a.m855a(m1544i(), i, strArr);
    }

    /* JADX INFO: renamed from: a */
    public static int m1527a(String... strArr) {
        return C1373a.m855a(m1544i(), -1, strArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m1528a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("exception_modules")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("npth");
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m1529a(JSONArray jSONArray, String str) {
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i).optJSONObject(str);
                if (jSONObjectOptJSONObject != null) {
                    return jSONObjectOptJSONObject;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m1530a(JSONArray jSONArray, boolean z) {
        if (jSONArray == null) {
            return;
        }
        C1373a.m863a("apmconfig", "fromnet " + z + " : " + jSONArray);
        if (z) {
            C1423j.m1281f();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                String next = jSONObjectOptJSONObject.keys().next();
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                C1373a.m861a((Object) ("update config " + next + " : " + jSONObjectOptJSONObject2));
                C1462d.m1624a(next, jSONObjectOptJSONObject2);
                if (z) {
                    C1423j.m1274a(next);
                }
            } catch (Throwable unused) {
            }
        }
        C1469k.m1653a(m1529a(jSONArray, String.valueOf(C1390e.m1012a().m1513e())));
        if (z) {
            C1423j.m1275a(jSONArray);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1531a() {
        return C1470l.m1690e();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1532a(Object obj) {
        String strM1115b = C1396b.m1115b(obj);
        if (strM1115b != null) {
            return C1462d.m1626a(strM1115b);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1533a(String str) {
        if (!C1462d.m1626a(str)) {
            C1414a.m1195b();
        }
        return C1462d.m1630e(str);
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m1534b() {
        String[] strArr = {"custom_event_settings", "npth_simple_setting", "max_utm_thread_ignore"};
        JSONObject jSONObjectM872b = C1373a.m872b(m1544i(), strArr);
        if (jSONObjectM872b == null) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectM872b.optJSONArray(strArr[2]);
        C1373a.m863a("ApmConfig", "normal get configArray: " + strArr[2] + " : " + jSONArrayOptJSONArray);
        return jSONArrayOptJSONArray;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1535b(Object obj) {
        C1462d c1462dM1628c;
        String strM1115b = C1396b.m1115b(obj);
        if (strM1115b == null || (c1462dM1628c = C1462d.m1628c(strM1115b)) == null) {
            return false;
        }
        return c1462dM1628c.m1633a();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1536b(String str) {
        if (!C1462d.m1626a(str)) {
            C1414a.m1195b();
        }
        return C1462d.m1632g(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1537c() {
        return m1527a("custom_event_settings", "npth_simple_setting", "disable_looper_monitor") == 1;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1538c(String str) {
        if (!C1462d.m1626a(str)) {
            C1414a.m1195b();
        }
        return C1462d.m1631f(str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1539d() {
        return m1527a("custom_event_settings", "npth_simple_setting", "enable_all_thread_stack_native") == 1;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1540e() {
        return m1527a("custom_event_settings", "npth_simple_setting", "anr_with_traces_txt") == 1;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1541f() {
        return m1527a("custom_event_settings", "npth_simple_setting", "upload_crash_crash") == 1;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1542g() {
        return m1527a("custom_event_settings", "npth_simple_setting", "force_apm_crash") == 1;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1543h() {
        return m1527a("custom_event_settings", "npth_simple_setting", "enable_anr_all_process_trace") == 1;
    }

    /* JADX INFO: renamed from: i */
    private static JSONObject m1544i() {
        return C1462d.m1627b(C1390e.m1012a().m1513e());
    }
}
