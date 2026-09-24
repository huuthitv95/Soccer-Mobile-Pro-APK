package com.apm.insight.nativecrash;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.C1375b;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.entity.C1395a;
import com.apm.insight.p010a.C1374a;
import com.apm.insight.p011b.C1381f;
import com.apm.insight.p011b.C1385j;
import com.apm.insight.p012c.C1387a;
import com.apm.insight.p021k.C1415b;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1434j;
import com.apm.insight.p022l.C1437m;
import com.apm.insight.runtime.C1447a;
import com.apm.insight.runtime.C1468j;
import com.apm.insight.runtime.C1470l;
import com.apm.insight.runtime.p023a.AbstractC1450c;
import com.apm.insight.runtime.p023a.C1453f;
import com.ironsource.C11744X3;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class NativeCrashCollector {
    /* JADX INFO: renamed from: a */
    public static int m1443a() {
        return 6;
    }

    /* JADX INFO: renamed from: a */
    private static void m1445a(String str, String str2, String str3) {
        for (ICrashCallback iCrashCallback : C1470l.m1660a().m1622d()) {
            try {
                if (iCrashCallback instanceof C1375b) {
                    ((C1375b) iCrashCallback).m900a(CrashType.NATIVE, str, str3, str2);
                } else {
                    iCrashCallback.onCrash(CrashType.NATIVE, str, null);
                }
            } catch (Throwable th) {
                C1386c.m990a();
                C1468j.m1652a(th, "NPTH_CATCH");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m1446b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (C11744X3.i.f26354Z.equalsIgnoreCase(str)) {
            return C1437m.m1414a(Looper.getMainLooper().getThread().getStackTrace());
        }
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        int iActiveCount = threadGroup.activeCount();
        Thread[] threadArr = new Thread[iActiveCount + (iActiveCount / 2)];
        int iEnumerate = threadGroup.enumerate(threadArr);
        for (int i = 0; i < iEnumerate; i++) {
            String name = threadArr[i].getName();
            if (!TextUtils.isEmpty(name) && (name.equals(str) || name.startsWith(str) || name.endsWith(str))) {
                return C1437m.m1414a(threadArr[i].getStackTrace());
            }
        }
        try {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                String name2 = entry.getKey().getName();
                if (name2.equals(str) || name2.startsWith(str) || name2.endsWith(str)) {
                    return C1437m.m1414a(entry.getValue());
                }
            }
        } catch (Throwable th) {
            C1386c.m990a();
            C1468j.m1652a(th, "NPTH_CATCH");
        }
        return "";
    }

    public static void onNativeCrash(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1373a.m861a((Object) "[onNativeCrash] enter");
        try {
            C1415b.m1204a().m1220b();
            final File fileM1385e = C1434j.m1385e(new File(C1434j.m1367a(), C1390e.m1030f()));
            C1395a c1395aM1610a = C1453f.m1608a().m1610a(CrashType.NATIVE, new AbstractC1450c.a() { // from class: com.apm.insight.nativecrash.NativeCrashCollector.1
                @Override // com.apm.insight.runtime.p023a.AbstractC1450c.a
                /* JADX INFO: renamed from: a */
                public final C1395a mo1171a(int i, C1395a c1395a) {
                    if (i == 1) {
                        String str2 = str;
                        if (str2 != null && str2.length() != 0) {
                            c1395a.m1095a("java_data", (Object) NativeCrashCollector.m1446b(str));
                        }
                        c1395a.m1091a("crash_after_crash", Npth.hasCrashWhenNativeCrash() ? "true" : "false");
                        return c1395a;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                C1425a.m1288a(C1390e.m1032g(), c1395a.m1102c());
                                return c1395a;
                            }
                        } else if (C1447a.m1539d()) {
                            c1395a.m1095a("all_thread_stacks", C1437m.m1426b(str));
                            c1395a.m1091a("has_all_thread_stack", "true");
                        }
                        return c1395a;
                    }
                    if (C1390e.m1049x()) {
                        JSONArray jSONArrayM967b = C1381f.m946b().m967b();
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        JSONObject jSONObjectM969a = C1381f.m946b().m965a(jUptimeMillis).m969a();
                        JSONArray jSONArrayM988a = C1385j.m988a(jUptimeMillis);
                        c1395a.m1095a("history_message", (Object) jSONArrayM967b);
                        c1395a.m1095a("current_message", jSONObjectM969a);
                        c1395a.m1095a("pending_messages", (Object) jSONArrayM988a);
                    }
                    c1395a.m1091a("disable_looper_monitor", String.valueOf(C1447a.m1537c()));
                    c1395a.m1091a("npth_force_apm_crash", String.valueOf(C1387a.m992a()));
                    return c1395a;
                }

                @Override // com.apm.insight.runtime.p023a.AbstractC1450c.a
                /* JADX INFO: renamed from: b */
                public final C1395a mo1172b(int i, C1395a c1395a) {
                    try {
                        JSONObject jSONObjectM1102c = c1395a.m1102c();
                        if (jSONObjectM1102c.length() > 0) {
                            C1430f.m1330a(new File(fileM1385e.getAbsolutePath() + '.' + i), jSONObjectM1102c);
                        }
                    } catch (IOException e) {
                        C1386c.m990a();
                        C1468j.m1652a(e, "NPTH_CATCH");
                    }
                    if (i == 0) {
                        C1374a.m898a();
                        C1374a.m898a();
                        CrashType crashType = CrashType.NATIVE;
                        C1390e.m1030f();
                    }
                    return c1395a;
                }
            });
            JSONObject jSONObjectM1102c = c1395aM1610a.m1102c();
            if (jSONObjectM1102c != null && jSONObjectM1102c.length() != 0) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                try {
                    jSONObjectM1102c.put("java_end", jCurrentTimeMillis2);
                    c1395aM1610a.m1097b("crash_cost", String.valueOf(j));
                    c1395aM1610a.m1091a("crash_cost", String.valueOf(j / 1000));
                } catch (Throwable unused) {
                }
                File file = new File(fileM1385e.getAbsolutePath() + ".tmp");
                C1430f.m1330a(file, jSONObjectM1102c);
                file.renameTo(fileM1385e);
            }
            try {
                if (C1470l.m1660a().m1622d().isEmpty()) {
                    return;
                }
                File file2 = new File(C1434j.m1367a(), C1390e.m1030f());
                C1443c c1443c = new C1443c(file2);
                c1443c.m1523b(file2);
                m1445a(c1443c.m1524c(), c1443c.m1520a(), str);
            } catch (Throwable unused2) {
                m1445a("", null, str);
            }
        } catch (Throwable th) {
            try {
                C1386c.m990a();
                C1468j.m1652a(th, "NPTH_CATCH");
            } finally {
                try {
                    if (!C1470l.m1660a().m1622d().isEmpty()) {
                        File file3 = new File(C1434j.m1367a(), C1390e.m1030f());
                        C1443c c1443c2 = new C1443c(file3);
                        c1443c2.m1523b(file3);
                        m1445a(c1443c2.m1524c(), c1443c2.m1520a(), str);
                    }
                } catch (Throwable unused3) {
                    m1445a("", null, str);
                }
            }
        }
    }
}
