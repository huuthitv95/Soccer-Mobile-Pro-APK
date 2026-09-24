package com.apm.insight.p016f;

import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1396b;
import com.apm.insight.entity.C1397c;
import com.apm.insight.p021k.C1420g;
import com.apm.insight.p022l.C1437m;
import com.apm.insight.runtime.C1471m;
import com.apm.insight.runtime.p023a.C1453f;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.f.b */
/* JADX INFO: compiled from: EnsureReporter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1400b {

    /* JADX INFO: renamed from: a */
    private String f548a;

    /* JADX INFO: renamed from: b */
    private JSONObject f549b;

    /* JADX INFO: renamed from: c */
    private String f550c;

    /* JADX INFO: renamed from: d */
    private boolean f551d;

    /* JADX INFO: renamed from: e */
    private String f552e;

    /* JADX INFO: renamed from: f */
    private String f553f;

    /* JADX INFO: renamed from: g */
    private String f554g;

    /* JADX INFO: renamed from: h */
    private List<String> f555h;

    /* JADX INFO: renamed from: a */
    public static void m1124a(final Object obj, final Throwable th, final String str, final String str2, final String str3) {
        try {
            C1471m.m1704a().m1735a(new Runnable() { // from class: com.apm.insight.f.b.2

                /* JADX INFO: renamed from: d */
                private /* synthetic */ boolean f564d = true;

                /* JADX INFO: renamed from: e */
                private /* synthetic */ Map f565e = null;

                @Override // java.lang.Runnable
                public final void run() {
                    C1400b.m1126a(obj, th, str, this.f564d, null, str2, str3);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static void m1126a(Object obj, Throwable th, String str, boolean z, Map<String, String> map, String str2, String str3) {
        if (th == null) {
            return;
        }
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            StackTraceElement stackTraceElement = stackTrace[0];
            if (stackTraceElement == null) {
                return;
            }
            String strM1412a = C1437m.m1412a(th);
            if (TextUtils.isEmpty(strM1412a)) {
                return;
            }
            C1397c c1397cM1119a = C1397c.m1119a(stackTraceElement, strM1412a, str, Thread.currentThread().getName(), z, str2, str3);
            if (obj != null) {
                c1397cM1119a.m1095a("exception_line_num", (Object) C1396b.m1108a(obj, th, stackTrace));
            }
            m1129a(null, c1397cM1119a);
            C1453f.m1608a().m1609a(CrashType.ENSURE, c1397cM1119a);
            C1420g.m1257a(obj, c1397cM1119a);
            C1373a.m873b((Object) "[reportException] ".concat(String.valueOf(str)));
        } catch (Throwable th2) {
            C1373a.m874b(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1127a(final Throwable th, final String str, final String str2) {
        try {
            C1471m.m1704a().m1735a(new Runnable() { // from class: com.apm.insight.f.b.1

                /* JADX INFO: renamed from: c */
                private /* synthetic */ boolean f558c = true;

                /* JADX INFO: renamed from: d */
                private /* synthetic */ Map f559d = null;

                @Override // java.lang.Runnable
                public final void run() {
                    C1400b.m1126a(null, th, str, this.f558c, null, "EnsureNotReachHere", str2);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1129a(Map<String, String> map, C1397c c1397c) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                c1397c.m1095a("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m1130a(StackTraceElement[] stackTraceElementArr, int i, String str, String str2, String str3, Map map) {
        StackTraceElement stackTraceElement;
        String string;
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i + 1 && (stackTraceElement = stackTraceElementArr[i]) != null) {
                    if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
                        string = null;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        while (i < stackTraceElementArr.length) {
                            C1437m.m1415a(stackTraceElementArr[i], sb);
                            i++;
                        }
                        string = sb.toString();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    C1397c c1397cM1119a = C1397c.m1119a(stackTraceElement, string, str, Thread.currentThread().getName(), true, str2, str3);
                    m1129a(null, c1397cM1119a);
                    C1453f.m1608a().m1609a(CrashType.ENSURE, c1397cM1119a);
                    C1420g.m1256a(c1397cM1119a);
                    C1373a.m873b((Object) "[report] ".concat(String.valueOf(str)));
                }
            } catch (Throwable th) {
                C1373a.m874b(th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1131a(final StackTraceElement[] stackTraceElementArr, final String str, final String str2) {
        try {
            C1471m.m1704a().m1735a(new Runnable() { // from class: com.apm.insight.f.b.3

                /* JADX INFO: renamed from: b */
                private /* synthetic */ int f569b = 5;

                /* JADX INFO: renamed from: e */
                private /* synthetic */ Map f572e = null;

                @Override // java.lang.Runnable
                public final void run() {
                    C1400b.m1130a(stackTraceElementArr, this.f569b, str, str2, "core_exception_monitor", (Map) null);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m1132a() {
        return this.f548a;
    }

    /* JADX INFO: renamed from: a */
    public final void m1133a(String str) {
        this.f548a = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m1134a(List<String> list) {
        this.f555h = list;
    }

    /* JADX INFO: renamed from: a */
    public final void m1135a(JSONObject jSONObject) {
        this.f549b = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final void m1136a(boolean z) {
        this.f551d = z;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m1137b() {
        return this.f549b;
    }

    /* JADX INFO: renamed from: b */
    public final void m1138b(String str) {
        this.f550c = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m1139c() {
        return this.f550c;
    }

    /* JADX INFO: renamed from: c */
    public final void m1140c(String str) {
        this.f552e = str;
    }

    /* JADX INFO: renamed from: d */
    public final String m1141d() {
        return this.f552e;
    }

    /* JADX INFO: renamed from: d */
    public final void m1142d(String str) {
        this.f553f = str;
    }

    /* JADX INFO: renamed from: e */
    public final String m1143e() {
        return this.f553f;
    }

    /* JADX INFO: renamed from: e */
    public final void m1144e(String str) {
        this.f554g = str;
    }

    /* JADX INFO: renamed from: f */
    public final String m1145f() {
        return this.f554g;
    }

    /* JADX INFO: renamed from: g */
    public final List<String> m1146g() {
        return this.f555h;
    }
}
