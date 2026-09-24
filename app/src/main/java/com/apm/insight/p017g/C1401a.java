package com.apm.insight.p017g;

import android.os.Looper;
import android.os.SystemClock;
import com.apm.insight.C1373a;
import com.apm.insight.C1375b;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.entity.C1395a;
import com.apm.insight.entity.C1396b;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p010a.C1374a;
import com.apm.insight.p021k.C1415b;
import com.apm.insight.p021k.C1417d;
import com.apm.insight.p021k.RunnableC1421h;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.p022l.C1429e;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1434j;
import com.apm.insight.p022l.C1437m;
import com.apm.insight.runtime.C1447a;
import com.apm.insight.runtime.C1468j;
import com.apm.insight.runtime.C1470l;
import com.apm.insight.runtime.C1471m;
import com.apm.insight.runtime.p023a.C1449b;
import com.apm.insight.runtime.p023a.C1453f;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.apm.insight.g.a */
/* JADX INFO: compiled from: CrashCatchDispatcher.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1401a implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    private static C1401a f573a;

    /* JADX INFO: renamed from: i */
    private static volatile boolean f574i;

    /* JADX INFO: renamed from: j */
    private static volatile ThreadLocal<Boolean> f575j = new ThreadLocal<>();

    /* JADX INFO: renamed from: l */
    private static volatile long f576l = 10000;

    /* JADX INFO: renamed from: m */
    private static ArrayList<AbstractC1402b> f577m = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private Thread.UncaughtExceptionHandler f578b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1403c f579c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1403c f580d;

    /* JADX INFO: renamed from: e */
    private volatile int f581e = 0;

    /* JADX INFO: renamed from: f */
    private volatile int f582f = 0;

    /* JADX INFO: renamed from: g */
    private ConcurrentHashMap<String, Object> f583g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h */
    private ConcurrentHashMap<String, Object> f584h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: k */
    private JSONArray f585k;

    private C1401a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f578b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1401a m1147a() {
        if (f573a == null) {
            f573a = new C1401a();
        }
        return f573a;
    }

    /* JADX INFO: renamed from: a */
    private String m1148a(File file, Throwable th, Thread thread, boolean z) {
        String absolutePath = file.getAbsolutePath();
        this.f584h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.m1460c(absolutePath);
        } catch (Throwable unused) {
        }
        String strM1413a = null;
        if (z) {
            int iM1470h = NativeImpl.m1470h(absolutePath);
            if (iM1470h > 0) {
                try {
                    C1390e.m1032g();
                    NativeImpl.m1449a(iM1470h, C1425a.m1291b());
                    NativeImpl.m1449a(iM1470h, "\n");
                    NativeImpl.m1449a(iM1470h, th.getMessage());
                    NativeImpl.m1449a(iM1470h, "\n");
                    NativeImpl.m1449a(iM1470h, th.getClass().getName());
                    if (th.getMessage() != null) {
                        NativeImpl.m1449a(iM1470h, ": ");
                        NativeImpl.m1449a(iM1470h, th.getMessage());
                    }
                    NativeImpl.m1449a(iM1470h, "\n");
                    NativeImpl.m1449a(iM1470h, thread.getName());
                    NativeImpl.m1449a(iM1470h, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.m1449a(iM1470h, "stack:");
                    NativeImpl.m1449a(iM1470h, "\n");
                } catch (Throwable unused3) {
                }
                C1437m.m1419a(th, iM1470h);
                NativeImpl.m1457b(iM1470h);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    StringBuilder sb = new StringBuilder();
                    C1390e.m1032g();
                    sb.append(C1425a.m1291b());
                    sb.append("\n");
                    fileOutputStream.write(sb.toString().getBytes());
                    fileOutputStream.write((th.getMessage() + "\n").getBytes());
                    fileOutputStream.write((th + "\n").getBytes());
                    fileOutputStream.write((thread.getName() + "\n").getBytes());
                } catch (Throwable unused4) {
                }
                try {
                    fileOutputStream.write("stack:\n".getBytes());
                } catch (Throwable unused5) {
                }
                try {
                    strM1413a = C1437m.m1413a(th, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new C1429e.a() { // from class: com.apm.insight.g.a.1

                        /* JADX INFO: renamed from: a */
                        private boolean f586a = false;

                        @Override // com.apm.insight.p022l.C1429e.a
                        /* JADX INFO: renamed from: a */
                        public final boolean mo1167a(String str) {
                            if (!this.f586a && str.contains("android.os.Looper.loop")) {
                                this.f586a = true;
                            }
                            return !this.f586a;
                        }
                    } : new C1429e.a());
                    C1373a.m860a((Closeable) fileOutputStream);
                } catch (Throwable th2) {
                    try {
                        th.printStackTrace(new PrintStream(fileOutputStream));
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.write("err:\n".getBytes());
                            fileOutputStream.write((th2 + "\n").getBytes());
                            fileOutputStream.write((th3 + "\n").getBytes());
                        } catch (Throwable unused6) {
                        }
                    }
                }
                C1373a.m860a((Closeable) fileOutputStream);
            } catch (Throwable unused7) {
            }
        }
        return strM1413a;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01af A[Catch: all -> 0x01d8, TRY_LEAVE, TryCatch #10 {all -> 0x01d8, blocks: (B:106:0x01a9, B:108:0x01af), top: B:163:0x01a9 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:161:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[PHI: r0
  0x0065: PHI (r0v54 boolean) = (r0v9 boolean), (r0v55 boolean), (r0v55 boolean), (r0v55 boolean) binds: [B:24:0x0064, B:20:0x005a, B:143:0x0065, B:22:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0143  */
    /* JADX WARN: Code duplicated, block: B:81:0x016e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [com.apm.insight.g.c] */
    /* JADX WARN: Type inference failed for: r0v48, types: [com.apm.insight.g.c] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.apm.insight.g.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.apm.insight.g.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.apm.insight.g.a] */
    /* JADX WARN: Type inference failed for: r1v15, types: [long] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.apm.insight.g.a] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    /* JADX WARN: Type inference failed for: r5v1, types: [long] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [long] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    private Throwable m1149a(Thread thread, Throwable th) {
        boolean zM1430c;
        boolean z;
        boolean z2;
        boolean z3;
        ?? r1;
        ?? r5;
        ?? r2;
        ?? r3;
        ?? r0;
        ?? r4 = this;
        if (r4.f581e >= 3) {
            return null;
        }
        r4.f581e++;
        r4.f582f++;
        if (f574i) {
            f575j.set(Boolean.TRUE);
        }
        f574i = true;
        ?? CurrentTimeMillis = System.currentTimeMillis();
        boolean z4 = (C1449b.m1561c() == -1 || CurrentTimeMillis - C1449b.m1561c() <= C1390e.m1034i().getLaunchCrashInterval()) && !(C1390e.m1039n() && C1390e.m1042q() == 0);
        try {
            zM1430c = C1437m.m1430c(th);
            if (zM1430c) {
                try {
                    if (C1437m.m1431d(th)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable unused) {
                }
            } else {
                z = false;
            }
        } catch (Throwable unused2) {
            zM1430c = false;
        }
        try {
            try {
                String strM1013a = C1390e.m1013a(CurrentTimeMillis, z4 ? CrashType.LAUNCH : CrashType.JAVA, zM1430c, false);
                File file = new File(C1434j.m1368a(C1390e.m1032g()), strM1013a);
                String strM1148a = r4.m1148a(new File(file, "logEventStack"), th, thread, z);
                if ((m1160f() & 1) != 0 || (strM1148a != null && C1390e.m1034i().isCrashIgnored(strM1148a))) {
                    z2 = false;
                    z3 = true;
                } else {
                    z2 = false;
                    z3 = false;
                }
                try {
                    JSONArray jSONArrayM1111a = C1396b.m1111a(th, thread, file);
                    r4.f585k = jSONArrayM1111a;
                    if (jSONArrayM1111a == null || z3) {
                        strM1013a = C1390e.m1013a(CurrentTimeMillis, z4 != 0 ? CrashType.LAUNCH : CrashType.JAVA, zM1430c, true);
                        File file2 = new File(C1434j.m1368a(C1390e.m1032g()), strM1013a);
                        file.renameTo(file2);
                        new File(file2, "logEventStack");
                    }
                    C1373a.m878d();
                    C1415b.m1204a().m1220b();
                    if (C1447a.m1527a("exception_modules", "oom_callback") == 1) {
                        z2 = true;
                    }
                    if (z && z2) {
                        try {
                            r4.m1151a(thread, th, z4, CurrentTimeMillis);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                if (!C1437m.m1430c(th)) {
                                    C1373a.m865a(th);
                                }
                                if (!z3) {
                                    synchronized (this) {
                                        r4.f582f--;
                                        r4.f581e--;
                                    }
                                    return m1161g();
                                }
                                if (z && !z2) {
                                    r4.m1151a(thread, th, z4, CurrentTimeMillis);
                                }
                                m1159e();
                                r1 = r4;
                                r1.m1158d();
                                m1156c(thread, th);
                                return null;
                            } catch (Throwable th3) {
                                if (z3) {
                                    synchronized (this) {
                                        r4.f582f--;
                                        r4.f581e--;
                                        return m1161g();
                                    }
                                }
                                if (z && !z2) {
                                    try {
                                        r4.m1151a(thread, th, z4, CurrentTimeMillis);
                                    } catch (Throwable unused3) {
                                        throw th3;
                                    }
                                }
                                m1159e();
                                r4.m1158d();
                                m1156c(thread, th);
                                throw th3;
                            }
                        }
                    }
                    try {
                        if (z4 != 0) {
                            CrashType crashType = CrashType.LAUNCH;
                        } else {
                            CrashType crashType2 = CrashType.JAVA;
                        }
                        ?? ValueOf = String.valueOf(z4);
                        C1373a.m861a((Object) "[uncaughtException] isLaunchCrash=".concat(ValueOf));
                        C1374a.m898a();
                        boolean zM1154b = m1154b(thread, th);
                        try {
                            if (zM1154b) {
                                try {
                                    ?? r6 = r4.f579c;
                                    if (r6 == 0 || z4 == 0) {
                                        r3 = CurrentTimeMillis;
                                        String str = strM1013a;
                                        if (zM1154b || (r0 = r4.f580d) == 0) {
                                            r5 = r3;
                                            ValueOf = r3;
                                        } else {
                                            r0.mo1169a(r3, thread, th, str, strM1148a, z3);
                                            r5 = r3;
                                            StringBuilder sb = new StringBuilder("[uncaughtException] mLaunchCrashDisposer ");
                                            String string = th.toString();
                                            sb.append(string);
                                            C1373a.m861a((Object) sb.toString());
                                            ValueOf = string;
                                        }
                                    } else {
                                        r6.mo1169a(CurrentTimeMillis, thread, th, strM1013a, strM1148a, z3);
                                        r5 = CurrentTimeMillis;
                                        StringBuilder sb2 = new StringBuilder("[uncaughtException] mLaunchCrashDisposer ");
                                        String string2 = th.toString();
                                        sb2.append(string2);
                                        C1373a.m861a((Object) sb2.toString());
                                        ValueOf = string2;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    r4 = r4;
                                    z4 = z4;
                                    if (!C1437m.m1430c(th)) {
                                        C1373a.m865a(th);
                                    }
                                    if (!z3) {
                                        synchronized (this) {
                                            r4.f582f--;
                                            r4.f581e--;
                                            return m1161g();
                                        }
                                    }
                                    if (z) {
                                        r4.m1151a(thread, th, z4, CurrentTimeMillis);
                                    }
                                    m1159e();
                                    r1 = r4;
                                }
                            } else {
                                r3 = CurrentTimeMillis;
                                String str2 = strM1013a;
                                if (zM1154b) {
                                    r5 = r3;
                                    ValueOf = r3;
                                } else {
                                    r5 = r3;
                                    ValueOf = r3;
                                }
                            }
                            if (z3) {
                                synchronized (this) {
                                    r4.f582f--;
                                    r4.f581e--;
                                }
                                return m1161g();
                            }
                            if (!z || z2) {
                                r2 = r4;
                            } else {
                                ?? r7 = r4;
                                r7.m1151a(thread, th, z4, r5);
                                r2 = r7;
                            }
                            m1159e();
                            r1 = r2;
                            r1.m1158d();
                            m1156c(thread, th);
                            return null;
                        } catch (Throwable th5) {
                            th = th5;
                            CurrentTimeMillis = ValueOf;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable th8) {
            th = th8;
            z2 = false;
            z4 = z4;
            z3 = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1150a(long j) {
        f576l = j;
    }

    /* JADX INFO: renamed from: a */
    private void m1151a(Thread thread, Throwable th, boolean z, long j) {
        Thread thread2;
        Throwable th2;
        long j2;
        List<IOOMCallback> listM1615a = C1470l.m1660a().m1615a();
        CrashType crashType = z ? CrashType.LAUNCH : CrashType.JAVA;
        for (IOOMCallback iOOMCallback : listM1615a) {
            try {
                if (iOOMCallback instanceof C1375b) {
                    thread2 = thread;
                    th2 = th;
                    j2 = j;
                    try {
                        ((C1375b) iOOMCallback).m902a(crashType, th2, thread2, j2, this.f585k);
                    } catch (Throwable th3) {
                        th = th3;
                        C1373a.m874b(th);
                    }
                } else {
                    thread2 = thread;
                    th2 = th;
                    j2 = j;
                    iOOMCallback.onCrash(crashType, th2, thread2, j2);
                }
            } catch (Throwable th4) {
                th = th4;
                thread2 = thread;
                th2 = th;
                j2 = j;
            }
            th = th2;
            thread = thread2;
            j = j2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1152a(final Throwable th) {
        if (th == null) {
            return;
        }
        try {
            C1471m.m1704a().m1735a(new Runnable() { // from class: com.apm.insight.g.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C1395a c1395aM1077a = C1395a.m1077a(System.currentTimeMillis(), C1390e.m1032g(), th);
                        c1395aM1077a.m1095a("userdefine", (Object) 1);
                        C1395a c1395aM1609a = C1453f.m1608a().m1609a(CrashType.CUSTOM_JAVA, c1395aM1077a);
                        if (c1395aM1609a != null) {
                            C1417d.m1226a().m1231c(c1395aM1609a.m1102c());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1153b() {
        return f574i;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m1154b(Thread thread, Throwable th) {
        ICrashFilter iCrashFilterM894b = C1390e.m1021b().m894b();
        if (iCrashFilterM894b != null) {
            try {
                if (!iCrashFilterM894b.onJavaCrashFilter(th, thread)) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static void m1155c(final String str) {
        if (str == null) {
            return;
        }
        try {
            C1471m.m1704a().m1735a(new Runnable() { // from class: com.apm.insight.g.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C1395a c1395a = new C1395a();
                        c1395a.m1095a("data", (Object) str);
                        c1395a.m1095a("userdefine", (Object) 1);
                        C1395a c1395aM1609a = C1453f.m1608a().m1609a(CrashType.CUSTOM_JAVA, c1395a);
                        if (c1395aM1609a != null) {
                            C1417d.m1226a().m1231c(c1395aM1609a.m1102c());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private void m1156c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f578b;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1157c() {
        Boolean bool = f575j.get();
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: d */
    private void m1158d() {
        synchronized (this) {
            this.f582f--;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (this.f582f != 0 && SystemClock.uptimeMillis() - jUptimeMillis < f576l) {
            SystemClock.sleep(50L);
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m1159e() {
        File fileM1368a = C1434j.m1368a(C1390e.m1032g());
        File fileM1367a = C1434j.m1367a();
        if (C1430f.m1339b(fileM1368a) && C1430f.m1339b(fileM1367a)) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (!RunnableC1421h.m1268a() && SystemClock.uptimeMillis() - jUptimeMillis < f576l) {
            try {
                SystemClock.sleep(500L);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private static int m1160f() {
        int iM1168a = 0;
        for (int i = 0; i < f577m.size(); i++) {
            try {
                try {
                    iM1168a |= f577m.get(i).m1168a();
                } catch (Throwable th) {
                    C1386c.m990a();
                    C1468j.m1652a(th, "NPTH_CATCH");
                }
            } catch (Throwable unused) {
            }
        }
        return iM1168a;
    }

    /* JADX INFO: renamed from: g */
    private static Throwable m1161g() {
        for (int i = 0; i < f577m.size(); i++) {
            try {
                f577m.get(i);
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1162a(InterfaceC1403c interfaceC1403c) {
        this.f579c = interfaceC1403c;
    }

    /* JADX INFO: renamed from: a */
    public final void m1163a(String str) {
        this.f583g.put(str, new Object());
    }

    /* JADX INFO: renamed from: a */
    public final void m1164a(Thread thread, Throwable th, boolean z, C1395a c1395a) {
        List<ICrashCallback> listM1621c;
        CrashType crashType;
        if (z) {
            listM1621c = C1470l.m1660a().m1618b();
            crashType = CrashType.LAUNCH;
        } else {
            listM1621c = C1470l.m1660a().m1621c();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback iCrashCallback : listM1621c) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                if (iCrashCallback instanceof C1375b) {
                    ((C1375b) iCrashCallback).m901a(crashType, C1437m.m1412a(th), thread, this.f585k);
                } else {
                    iCrashCallback.onCrash(crashType, C1437m.m1412a(th), thread);
                }
                c1395a.m1097b("callback_cost_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            } catch (Throwable th2) {
                C1373a.m874b(th2);
                c1395a.m1097b("callback_err_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1165b(InterfaceC1403c interfaceC1403c) {
        this.f580d = interfaceC1403c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1166b(String str) {
        return this.f583g.containsKey(str);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        do {
            th = m1149a(thread, th);
        } while (th != null);
    }
}
