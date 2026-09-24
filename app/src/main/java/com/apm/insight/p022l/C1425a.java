package com.apm.insight.p022l;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.entity.C1395a;
import com.apm.insight.runtime.p023a.C1449b;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.C11540L6;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.l.a */
/* JADX INFO: compiled from: App.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1425a {

    /* JADX INFO: renamed from: a */
    private static String f708a;

    /* JADX INFO: renamed from: b */
    private static Class<?> f709b;

    /* JADX INFO: renamed from: c */
    private static Field f710c;

    /* JADX INFO: renamed from: d */
    private static Field f711d;

    /* JADX INFO: renamed from: e */
    private static boolean f712e;

    /* JADX INFO: renamed from: a */
    private static long m1286a(int i) {
        if (i < 0) {
            return 0L;
        }
        return ((long) i) << 10;
    }

    /* JADX INFO: renamed from: a */
    public static ActivityManager.ProcessErrorStateInfo m1287a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
        if (processesInErrorState != null) {
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.pid == iMyPid && processErrorStateInfo.condition == 2) {
                    return processErrorStateInfo;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m1288a(Context context, JSONObject jSONObject) {
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dalvikPrivateDirty", m1286a(memoryInfo.dalvikPrivateDirty));
            jSONObject2.put("dalvikPss", m1286a(memoryInfo.dalvikPss));
            jSONObject2.put("dalvikSharedDirty", m1286a(memoryInfo.dalvikSharedDirty));
            jSONObject2.put("nativePrivateDirty", m1286a(memoryInfo.nativePrivateDirty));
            jSONObject2.put("nativePss", m1286a(memoryInfo.nativePss));
            jSONObject2.put("nativeSharedDirty", m1286a(memoryInfo.nativeSharedDirty));
            jSONObject2.put("otherPrivateDirty", m1286a(memoryInfo.otherPrivateDirty));
            jSONObject2.put("otherPss", m1286a(memoryInfo.otherPss));
            jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
            try {
                String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
                if (!TextUtils.isEmpty(memoryStat)) {
                    jSONObject2.put("summary.graphics", m1286a(Integer.parseInt(memoryStat)));
                }
            } catch (Throwable unused) {
            }
            jSONObject2.put("totalPrivateClean", C1427c.m1300a(memoryInfo));
            jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
            jSONObject2.put("totalPss", m1286a(memoryInfo.getTotalPss()));
            jSONObject2.put("totalSharedClean", C1427c.m1301b(memoryInfo));
            jSONObject2.put("totalSharedDirty", m1286a(memoryInfo.getTotalSharedDirty()));
            jSONObject2.put("totalSwappablePss", m1286a(C1427c.m1302c(memoryInfo)));
            jSONObject.put("memory_info", jSONObject2);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                JSONObject jSONObject3 = new JSONObject();
                ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo2);
                jSONObject3.put(C11540L6.f25022w, memoryInfo2.availMem);
                jSONObject3.put("lowMemory", memoryInfo2.lowMemory);
                jSONObject3.put("threshold", memoryInfo2.threshold);
                jSONObject3.put("totalMem", C1433i.m1365a(memoryInfo2));
                jSONObject.put("sys_memory_info", jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            boolean z = true;
            C1395a.m1079a(jSONObject, "filters", "native_heap_leak", String.valueOf(Debug.getNativeHeapAllocatedSize() > 209715200));
            jSONObject4.put("native_heap_size", Debug.getNativeHeapSize());
            jSONObject4.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
            jSONObject4.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            long jFreeMemory = runtime.freeMemory();
            long j = runtime.totalMemory();
            jSONObject4.put("max_memory", jMaxMemory);
            jSONObject4.put("free_memory", jFreeMemory);
            jSONObject4.put("total_memory", j);
            if (j - jFreeMemory <= jMaxMemory * 0.95f) {
                z = false;
            }
            C1395a.m1079a(jSONObject, "filters", "java_heap_leak", String.valueOf(z));
            if (activityManager != null) {
                jSONObject4.put("memory_class", activityManager.getMemoryClass());
                jSONObject4.put("large_memory_class", activityManager.getLargeMemoryClass());
            }
            jSONObject.put("app_memory_info", jSONObject4);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1289a(String str) {
        f708a = str;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1290a() {
        return C1449b.m1566d().m1594f();
    }

    /* JADX INFO: renamed from: b */
    public static String m1291b() {
        if (!TextUtils.isEmpty(f708a)) {
            return f708a;
        }
        String strM1293c = m1293c();
        f708a = strM1293c;
        if (!TextUtils.isEmpty(strM1293c)) {
            return f708a;
        }
        String strM1296d = m1296d();
        f708a = strM1296d;
        if (!TextUtils.isEmpty(strM1296d)) {
            return f708a;
        }
        String strM1298e = m1298e();
        f708a = strM1298e;
        if (strM1298e == null) {
            f708a = "";
        }
        return f708a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1292b(Context context) {
        String strM1291b = m1291b();
        if (strM1291b != null && strM1291b.contains(CertificateUtil.DELIMITER)) {
            return false;
        }
        if (strM1291b == null || !strM1291b.equals(context.getPackageName())) {
            return strM1291b != null && strM1291b.equals(context.getApplicationInfo().processName);
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static String m1293c() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m1294c(Context context) {
        Class<?> clsM1297e = m1297e(context);
        if (f710c == null && clsM1297e != null) {
            try {
                f710c = clsM1297e.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f710c;
        if (field == null) {
            return "";
        }
        try {
            return String.valueOf(field.get(null));
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m1295d(Context context) {
        Class<?> clsM1297e = m1297e(context);
        if (f711d == null && clsM1297e != null) {
            try {
                f711d = clsM1297e.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f711d;
        if (field == null) {
            return -1;
        }
        try {
            return ((Integer) field.get(null)).intValue();
        } catch (Throwable unused2) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m1296d() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, null);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static Class<?> m1297e(Context context) {
        if (f709b == null && !f712e) {
            try {
                f709b = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException unused) {
            }
            f712e = true;
        }
        return f709b;
    }

    /* JADX INFO: renamed from: e */
    private static String m1298e() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i = bufferedReader.read();
                    if (i <= 0) {
                        String string = sb.toString();
                        C1373a.m860a((Closeable) bufferedReader);
                        return string;
                    }
                    sb.append((char) i);
                }
            } catch (Throwable unused) {
                C1373a.m860a((Closeable) bufferedReader);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }
}
