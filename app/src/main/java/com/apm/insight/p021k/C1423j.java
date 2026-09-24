package com.apm.insight.p021k;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.apm.insight.C1373a;
import com.apm.insight.C1390e;
import com.apm.insight.entity.C1396b;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1434j;
import com.apm.insight.runtime.C1447a;
import com.apm.insight.runtime.C1462d;
import com.apm.insight.runtime.C1471m;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.apm.insight.k.j */
/* JADX INFO: compiled from: NpthConfigFetcher.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1423j {

    /* JADX INFO: renamed from: a */
    private static File f704a;

    /* JADX INFO: renamed from: b */
    private static boolean f705b;

    /* JADX INFO: renamed from: c */
    private static boolean f706c;

    /* JADX INFO: renamed from: d */
    private static Map<String, String> f707d;

    /* JADX INFO: renamed from: a */
    public static void m1274a(String str) {
        if (f707d == null) {
            f707d = new HashMap();
        }
        f707d.put(str, String.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: a */
    public static void m1275a(JSONArray jSONArray) {
        try {
            C1430f.m1329a(new File(C1434j.m1398j(C1390e.m1032g()), "apminsight/configCrash/configFile"), jSONArray);
        } catch (IOException unused) {
        }
        try {
            C1430f.m1328a(m1283h(), f707d);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m1276a() {
        return f705b;
    }

    /* JADX INFO: renamed from: b */
    static boolean m1277b() {
        return f706c;
    }

    /* JADX INFO: renamed from: c */
    static void m1278c() {
        if (f705b) {
            return;
        }
        f706c = true;
        File file = new File(C1434j.m1398j(C1390e.m1032g()), "apminsight/configCrash/configFile");
        if (file.exists()) {
            try {
                C1447a.m1530a(new JSONArray(C1430f.m1321a(file, "\n")), false);
                f705b = true;
            } catch (Throwable unused) {
                C1447a.m1530a((JSONArray) null, false);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1279d() {
        m1278c();
        if (m1282g()) {
            C1414a.m1194a();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1280e() {
        C1471m.m1704a().m1735a(new Runnable() { // from class: com.apm.insight.k.j.1
            @Override // java.lang.Runnable
            public final void run() {
                if (C1423j.m1282g()) {
                    C1414a.m1194a();
                }
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static void m1281f() {
        Map<String, String> map = f707d;
        if (map != null) {
            map.clear();
        }
    }

    /* JADX INFO: renamed from: g */
    static boolean m1282g() {
        File fileM1283h = m1283h();
        try {
            Map<String, String> mapM1341c = f707d;
            if (mapM1341c == null) {
                mapM1341c = C1430f.m1341c(fileM1283h);
            }
            f707d = mapM1341c;
            if (mapM1341c == null) {
                f707d = new HashMap();
                return true;
            }
            if (mapM1341c.size() < C1396b.m1117c()) {
                return true;
            }
            Iterator<String> it = C1396b.m1118d().iterator();
            while (it.hasNext()) {
                if (!f707d.containsKey(it.next())) {
                    return true;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z = false;
            for (Map.Entry<String, String> entry : f707d.entrySet()) {
                try {
                    if (jCurrentTimeMillis - Long.decode(entry.getValue()).longValue() > C1462d.m1629d(entry.getKey())) {
                        z = true;
                    }
                } catch (Throwable th) {
                    C1373a.m865a(th);
                }
            }
            if (z) {
                C1373a.m861a((Object) "config should be updated");
            } else {
                C1373a.m861a((Object) "config should not be updated");
            }
            return z;
        } catch (Throwable th2) {
            Log.e("npth", NotificationCompat.CATEGORY_ERROR, th2);
            return true;
        }
    }

    /* JADX INFO: renamed from: h */
    private static File m1283h() {
        if (f704a == null) {
            f704a = new File(C1434j.m1398j(C1390e.m1032g()), "apminsight/configCrash/configInvalid");
        }
        return f704a;
    }
}
