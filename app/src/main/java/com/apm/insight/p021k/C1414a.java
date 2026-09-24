package com.apm.insight.p021k;

import android.util.Log;
import com.apm.insight.C1373a;
import com.apm.insight.C1390e;
import com.apm.insight.entity.C1396b;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.p022l.C1435k;
import com.apm.insight.runtime.C1447a;
import com.apm.insight.runtime.C1471m;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.k.a */
/* JADX INFO: compiled from: ApmConfigFetcher.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1414a {

    /* JADX INFO: renamed from: a */
    private static Runnable f627a = new Runnable() { // from class: com.apm.insight.k.a.1
        @Override // java.lang.Runnable
        public final void run() {
            if (C1435k.m1406b(C1390e.m1032g())) {
                C1414a.m1202i();
            }
            if (C1414a.f628b > 0) {
                if (C1425a.m1292b(C1390e.m1032g())) {
                    C1471m.m1704a().m1736a(C1414a.f627a, 15000L);
                } else {
                    C1471m.m1704a().m1736a(C1414a.f627a, 60000L);
                }
            }
        }
    };

    /* JADX INFO: renamed from: b */
    private static int f628b = 0;

    /* JADX INFO: renamed from: a */
    public static void m1194a() {
        f628b = 40;
        C1471m.m1704a().m1735a(f627a);
    }

    /* JADX INFO: renamed from: b */
    public static void m1195b() {
        if (!C1423j.m1277b()) {
            C1423j.m1278c();
        }
        if (C1435k.m1406b(C1390e.m1032g()) && C1423j.m1282g()) {
            m1202i();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1196c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m1197d() {
    }

    /* JADX INFO: renamed from: h */
    private static byte[] m1201h() {
        try {
            return C1418e.m1240a(C1390e.m1034i().getConfigUrl(), C1396b.m1106a().toString().getBytes());
        } catch (Throwable th) {
            C1373a.m865a(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static synchronized void m1202i() {
        int i = f628b;
        if (i > 0) {
            f628b = i - 1;
        }
        C1373a.m861a((Object) "try fetchApmConfig");
        if (!C1425a.m1292b(C1390e.m1032g())) {
            C1423j.m1278c();
            if (C1423j.m1276a()) {
                f628b = 0;
            }
            return;
        }
        JSONArray jSONArrayOptJSONArray = null;
        try {
            byte[] bArrM1201h = m1201h();
            if (bArrM1201h != null) {
                jSONArrayOptJSONArray = new JSONObject(new String(bArrM1201h)).optJSONArray("data");
            }
        } catch (Throwable th) {
            if (C1390e.m1034i().isDebugMode()) {
                Log.e("npth", "npth NPTH Catch Error", th);
            }
        }
        C1373a.m861a((Object) "after fetchApmConfig net ".concat(String.valueOf(jSONArrayOptJSONArray)));
        if (jSONArrayOptJSONArray == null) {
            f628b -= 10;
        } else {
            C1447a.m1530a(jSONArrayOptJSONArray, true);
            f628b = 0;
        }
    }
}
