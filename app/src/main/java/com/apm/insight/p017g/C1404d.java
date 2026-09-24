package com.apm.insight.p017g;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.C1395a;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p011b.C1381f;
import com.apm.insight.p011b.C1385j;
import com.apm.insight.p012c.C1387a;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1434j;
import com.apm.insight.p022l.C1437m;
import com.apm.insight.runtime.C1447a;
import com.apm.insight.runtime.C1466h;
import com.apm.insight.runtime.C1468j;
import com.apm.insight.runtime.p023a.AbstractC1450c;
import com.apm.insight.runtime.p023a.C1449b;
import com.apm.insight.runtime.p023a.C1453f;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.g.d */
/* JADX INFO: compiled from: JavaCrash.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1404d implements InterfaceC1403c {

    /* JADX INFO: renamed from: a */
    private Context f590a;

    public C1404d(Context context) {
        this.f590a = context;
    }

    @Override // com.apm.insight.p017g.InterfaceC1403c
    /* JADX INFO: renamed from: a */
    public final void mo1169a(final long j, final Thread thread, final Throwable th, final String str, final String str2, final boolean z) {
        final File file = new File(C1434j.m1368a(this.f590a), str);
        C1401a.m1147a().m1163a(file.getName());
        file.mkdirs();
        C1430f.m1342d(file);
        final boolean zM1430c = C1437m.m1430c(th);
        C1395a c1395aM1610a = C1453f.m1608a().m1610a(CrashType.JAVA, new AbstractC1450c.a() { // from class: com.apm.insight.g.d.1

            /* JADX INFO: renamed from: a */
            private long f591a = 0;

            @Override // com.apm.insight.runtime.p023a.AbstractC1450c.a
            /* JADX INFO: renamed from: a */
            public final C1395a mo1171a(int i, C1395a c1395a) {
                this.f591a = SystemClock.uptimeMillis();
                if (i == 0) {
                    c1395a.m1095a("data", (Object) C1437m.m1412a(th));
                    c1395a.m1095a("isOOM", Boolean.valueOf(zM1430c));
                    c1395a.m1095a("isJava", (Object) 1);
                    c1395a.m1095a("crash_time", Long.valueOf(j));
                    c1395a.m1095a("launch_mode", Integer.valueOf(C1449b.m1556b()));
                    c1395a.m1095a("launch_time", Long.valueOf(C1449b.m1561c()));
                    String str3 = str2;
                    if (str3 != null) {
                        c1395a.m1095a("crash_md5", (Object) str3);
                        c1395a.m1091a("crash_md5", str2);
                        boolean z2 = z;
                        if (z2) {
                            c1395a.m1091a("has_ignore", String.valueOf(z2));
                        }
                    }
                } else {
                    if (i == 1) {
                        Thread thread2 = thread;
                        c1395a.m1095a("crash_thread_name", (Object) (thread2 != null ? thread2.getName() : ""));
                        c1395a.m1095a(ScarConstants.TOKEN_ID_KEY, Integer.valueOf(Process.myTid()));
                        c1395a.m1091a("crash_after_crash", Npth.hasCrashWhenJavaCrash() ? "true" : "false");
                        c1395a.m1091a("crash_after_native", NativeImpl.m1465e() ? "true" : "false");
                        C1401a.m1147a().m1164a(thread, th, false, c1395a);
                        return c1395a;
                    }
                    if (i == 2) {
                        if (zM1430c) {
                            C1425a.m1288a(C1404d.this.f590a, c1395a.m1102c());
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
                    if (i == 3) {
                        JSONObject jSONObjectM1426b = C1437m.m1426b(Thread.currentThread().getName());
                        if (jSONObjectM1426b != null) {
                            c1395a.m1095a("all_thread_stacks", jSONObjectM1426b);
                        }
                        c1395a.m1095a("logcat", (Object) C1466h.m1642a(C1390e.m1030f()));
                        return c1395a;
                    }
                    if (i != 4) {
                        if (i == 5) {
                            c1395a.m1095a("crash_uuid", (Object) str);
                            return c1395a;
                        }
                    } else if (!zM1430c) {
                        C1425a.m1288a(C1404d.this.f590a, c1395a.m1102c());
                        return c1395a;
                    }
                }
                return c1395a;
            }

            @Override // com.apm.insight.runtime.p023a.AbstractC1450c.a
            /* JADX INFO: renamed from: b */
            public final C1395a mo1172b(int i, C1395a c1395a) {
                try {
                    C1430f.m1330a(new File(file, file.getName() + "." + i), c1395a.m1102c());
                    return c1395a;
                } catch (IOException e) {
                    e.printStackTrace();
                    return c1395a;
                }
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        try {
            c1395aM1610a.m1091a("crash_type", Constants.NORMAL);
            c1395aM1610a.m1097b("crash_cost", String.valueOf(jCurrentTimeMillis));
            c1395aM1610a.m1091a("crash_cost", String.valueOf(jCurrentTimeMillis / 1000));
        } catch (Throwable th2) {
            C1386c.m990a();
            C1468j.m1652a(th2, "NPTH_CATCH");
        }
    }
}
