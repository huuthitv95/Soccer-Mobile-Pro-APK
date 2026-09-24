package com.apm.insight.p013d;

import android.content.Context;
import com.apm.insight.C1390e;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1395a;
import com.apm.insight.p011b.C1383h;
import com.apm.insight.p021k.C1417d;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.runtime.C1471m;
import com.apm.insight.runtime.p023a.C1453f;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.d.a */
/* JADX INFO: compiled from: DartCrash.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1389a {

    /* JADX INFO: renamed from: a */
    public String f501a;

    /* JADX INFO: renamed from: b */
    public long f502b;

    /* JADX INFO: renamed from: a */
    public static void m1008a(String str) {
        m1009a(str, null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m1009a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, C1383h.a aVar) {
        m1010a(str, map, map2, null, aVar);
    }

    /* JADX INFO: renamed from: a */
    public static void m1010a(final String str, final Map<? extends String, ? extends String> map, final Map<String, String> map2, final Map<String, String> map3, final C1383h.a aVar) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            C1471m.m1704a().m1735a(new Runnable() { // from class: com.apm.insight.d.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Context contextM1032g = C1390e.m1032g();
                        long j = jCurrentTimeMillis;
                        String str2 = str;
                        C1395a c1395a = new C1395a();
                        c1395a.m1095a("is_dart", (Object) 1);
                        c1395a.m1095a("crash_time", Long.valueOf(j));
                        c1395a.m1095a("process_name", (Object) C1425a.m1291b());
                        c1395a.m1095a("data", (Object) str2);
                        C1425a.m1288a(contextM1032g, c1395a.m1102c());
                        C1395a c1395aM1609a = C1453f.m1608a().m1609a(CrashType.DART, c1395a);
                        if (map != null) {
                            JSONObject jSONObjectOptJSONObject = c1395aM1609a.m1102c().optJSONObject("custom");
                            if (jSONObjectOptJSONObject == null) {
                                jSONObjectOptJSONObject = new JSONObject();
                            }
                            C1395a.m1081a(jSONObjectOptJSONObject, (Map<? extends String, ? extends String>) map);
                            c1395aM1609a.m1095a("custom", jSONObjectOptJSONObject);
                        }
                        if (map2 != null) {
                            JSONObject jSONObjectOptJSONObject2 = c1395aM1609a.m1102c().optJSONObject("custom_long");
                            if (jSONObjectOptJSONObject2 == null) {
                                jSONObjectOptJSONObject2 = new JSONObject();
                            }
                            C1395a.m1081a(jSONObjectOptJSONObject2, (Map<? extends String, ? extends String>) map2);
                            c1395aM1609a.m1095a("custom_long", jSONObjectOptJSONObject2);
                        }
                        if (map3 != null) {
                            JSONObject jSONObjectOptJSONObject3 = c1395aM1609a.m1102c().optJSONObject("filters");
                            if (jSONObjectOptJSONObject3 == null) {
                                jSONObjectOptJSONObject3 = new JSONObject();
                                c1395aM1609a.m1095a("filters", jSONObjectOptJSONObject3);
                            }
                            C1395a.m1081a(jSONObjectOptJSONObject3, (Map<? extends String, ? extends String>) map3);
                        }
                        C1417d.m1226a().m1229a(c1395aM1609a.m1102c());
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1389a m1011b(String str) {
        C1389a c1389a = new C1389a();
        c1389a.f501a = str;
        c1389a.f502b = System.currentTimeMillis();
        return c1389a;
    }
}
