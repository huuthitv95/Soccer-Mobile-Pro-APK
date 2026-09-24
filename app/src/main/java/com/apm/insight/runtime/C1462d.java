package com.apm.insight.runtime;

import com.apm.insight.C1373a;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.runtime.d */
/* JADX INFO: compiled from: ConfigAid.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1462d {

    /* JADX INFO: renamed from: a */
    private static HashMap<String, C1462d> f847a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private JSONObject f848b = null;

    /* JADX INFO: renamed from: c */
    private JSONObject f849c = null;

    /* JADX INFO: renamed from: d */
    private boolean f850d = false;

    /* JADX INFO: renamed from: e */
    private String f851e;

    private C1462d(JSONObject jSONObject, String str) {
        this.f851e = str;
        m1625a(jSONObject);
        f847a.put(this.f851e, this);
        C1373a.m861a((Object) "after update aid ".concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: a */
    public static void m1624a(String str, JSONObject jSONObject) {
        C1462d c1462d = f847a.get(str);
        if (c1462d != null) {
            c1462d.m1625a(jSONObject);
        } else {
            new C1462d(jSONObject, str);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1625a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f848b = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f850d = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1626a(String str) {
        return f847a.get(str) != null;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m1627b(String str) {
        C1462d c1462d = f847a.get(str);
        if (c1462d != null) {
            return c1462d.f848b;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static C1462d m1628c(String str) {
        return f847a.get(str);
    }

    /* JADX INFO: renamed from: d */
    public static long m1629d(String str) {
        C1462d c1462d = f847a.get(str);
        if (c1462d == null) {
            return 3600000L;
        }
        try {
            return Long.decode(C1373a.m857a(c1462d.f848b, "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1630e(String str) {
        JSONObject jSONObject;
        C1462d c1462d = f847a.get(str);
        return (c1462d == null || (jSONObject = c1462d.f848b) == null || 1 != C1373a.m855a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1631f(String str) {
        JSONObject jSONObject;
        C1462d c1462d = f847a.get(str);
        return (c1462d == null || (jSONObject = c1462d.f848b) == null || 1 != C1373a.m855a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1632g(String str) {
        JSONObject jSONObject;
        C1462d c1462d = f847a.get(str);
        return (c1462d == null || (jSONObject = c1462d.f848b) == null || 1 != C1373a.m855a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1633a() {
        if (this.f848b == null) {
            return false;
        }
        return this.f850d;
    }
}
