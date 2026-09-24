package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.p011b.C1379d;
import com.apm.insight.p011b.C1381f;
import com.apm.insight.p018h.C1406b;
import com.apm.insight.p022l.C1434j;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class NativeImpl {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f748a = false;

    /* JADX INFO: renamed from: b */
    private static volatile boolean f749b = false;

    /* JADX INFO: renamed from: c */
    private static boolean f750c = true;

    /* JADX INFO: renamed from: a */
    public static int m1447a(int i) {
        if (f748a && i >= 0) {
            try {
                return doLock("", i);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static String m1448a(String str) {
        if (f748a) {
            return doGetCrashHeader(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m1449a(int i, String str) {
        if (!f748a || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            doWriteFile(i, str, str.length());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1450a(long j) {
        if (f748a) {
            try {
                doSetAlogFlushAddr(j);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1451a(File file) {
        if (f748a) {
            doRebuildTombstone(C1434j.m1378c(file).getAbsolutePath(), C1434j.m1374b(file).getAbsolutePath(), C1434j.m1382d(file).getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1452a(String str, String str2, String str3) {
        if (f748a) {
            try {
                doDumpLogcat(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1453a(boolean z) {
        f750c = z;
        if (f748a) {
            doSetResendSigQuit(z ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1454a() {
        if (f749b) {
            return f748a;
        }
        f749b = true;
        if (!f748a) {
            f748a = C1373a.m875b("apminsighta");
        }
        return f748a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1455a(Context context) {
        String strM1174a;
        boolean zM1454a = m1454a();
        if (zM1454a) {
            String str = C1434j.m1398j(context) + "/apminsight";
            if (new File(context.getApplicationInfo().nativeLibraryDir, "libapminsightb.so").exists()) {
                strM1174a = context.getApplicationInfo().nativeLibraryDir;
            } else {
                strM1174a = C1406b.m1174a();
                C1406b.m1177b("apminsightb");
            }
            doStart(Build.VERSION.SDK_INT, strM1174a, str, C1390e.m1030f(), C1390e.m1038m());
        }
        return zM1454a;
    }

    /* JADX INFO: renamed from: b */
    public static int m1456b() {
        if (f748a) {
            return doCreateCallbackThread();
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static void m1457b(int i) {
        if (f748a) {
            try {
                doCloseFile(i);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1458b(long j) {
        if (f748a) {
            try {
                doSetAlogLogDirAddr(j);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1459b(String str) {
        if (f748a) {
            doDumpHprof(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m1460c(String str) {
        if (f748a && !TextUtils.isEmpty(str)) {
            try {
                return doLock(str, -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static void m1461c() {
    }

    /* JADX INFO: renamed from: d */
    public static void m1462d() {
    }

    /* JADX INFO: renamed from: d */
    public static void m1463d(String str) {
        if (f748a) {
            try {
                doDumpMemInfo(str);
            } catch (Throwable unused) {
            }
        }
    }

    private static native boolean doCheckNativeCrash();

    private static native void doCloseFile(int i);

    private static native int doCreateCallbackThread();

    private static native void doDump(String str);

    private static native void doDumpFds(String str);

    private static native void doDumpHprof(String str);

    private static native void doDumpLogcat(String str, String str2, String str3);

    private static native void doDumpMaps(String str);

    private static native void doDumpMemInfo(String str);

    private static native void doDumpThreads(String str);

    private static native long doGetAppCpuTime();

    private static native long doGetChildCpuTime();

    private static native String doGetCrashHeader(String str);

    private static native long doGetDeviceCpuTime();

    private static native int doGetFDCount();

    private static native String[] doGetFdDump(int i, int i2, int[] iArr, String[] strArr);

    private static native long doGetFreeMemory();

    private static native long doGetThreadCpuTime(int i);

    private static native int doGetThreadsCount();

    private static native long doGetTotalMemory();

    private static native long doGetVMSize();

    private static native void doInitThreadDump();

    private static native int doLock(String str, int i);

    private static native int doOpenFile(String str);

    private static native void doRebuildTombstone(String str, String str2, String str3);

    private static native void doSetAlogConfigPath(String str);

    private static native void doSetAlogFlushAddr(long j);

    private static native void doSetAlogLogDirAddr(long j);

    private static native void doSetResendSigQuit(int i);

    private static native void doSetUploadEnd();

    private static native void doSignalMainThread();

    private static native int doStart(int i, String str, String str2, String str3, int i2);

    private static native void doStartAnrMonitor(int i);

    private static native void doWriteFile(int i, String str, int i2);

    /* JADX INFO: renamed from: e */
    public static void m1464e(String str) {
        if (f748a) {
            try {
                doDumpFds(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1465e() {
        if (!f748a) {
            return false;
        }
        try {
            return doCheckNativeCrash();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1466f(String str) {
        if (f748a) {
            try {
                doDumpMaps(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1467f() {
        if (!f748a) {
            return false;
        }
        try {
            return is64Bit();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1468g() {
        new Thread(new Runnable() { // from class: com.apm.insight.nativecrash.NativeImpl.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    NativeImpl.m1476l();
                } catch (Throwable th) {
                    try {
                        C1386c.m991a(th, "NPTH_ANR_MONITOR_ERROR");
                    } catch (Throwable unused) {
                    }
                }
            }
        }, "NPTH-AnrMonitor").start();
    }

    /* JADX INFO: renamed from: g */
    public static void m1469g(String str) {
        if (f748a) {
            try {
                doDumpThreads(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m1470h(String str) {
        if (!f748a) {
            return -1;
        }
        try {
            return doOpenFile(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1471h() {
        return f750c;
    }

    private static void handleNativeCrash(String str) {
        NativeCrashCollector.onNativeCrash(str);
    }

    /* JADX INFO: renamed from: i */
    public static void m1472i() {
        if (f748a) {
            doSignalMainThread();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m1473i(String str) {
        if (f748a) {
            doDump(str);
        }
    }

    private static native boolean is64Bit();

    /* JADX INFO: renamed from: j */
    public static void m1474j() {
        if (f748a) {
            doSetUploadEnd();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m1475k() {
        if (f748a) {
            doInitThreadDump();
        }
    }

    /* JADX INFO: renamed from: l */
    static /* synthetic */ void m1476l() {
        if (f748a) {
            try {
                doStartAnrMonitor(Build.VERSION.SDK_INT);
            } catch (Throwable unused) {
            }
        }
    }

    private static void reportEventForAnrMonitor() {
        try {
            System.currentTimeMillis();
            C1390e.m1035j();
            C1379d.m941c();
            C1381f.m945a(C1390e.m1032g()).m947a().m924e();
        } catch (Throwable unused) {
        }
    }
}
