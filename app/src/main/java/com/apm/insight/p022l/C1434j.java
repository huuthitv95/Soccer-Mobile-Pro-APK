package com.apm.insight.p022l;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.C1390e;
import java.io.File;

/* JADX INFO: renamed from: com.apm.insight.l.j */
/* JADX INFO: compiled from: LogPath.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1434j {

    /* JADX INFO: renamed from: a */
    private static String f736a;

    /* JADX INFO: renamed from: b */
    private static File f737b;

    /* JADX INFO: renamed from: c */
    private static File f738c;

    /* JADX INFO: renamed from: a */
    public static File m1367a() {
        File file = f737b;
        return file == null ? m1381d(C1390e.m1032g()) : file;
    }

    /* JADX INFO: renamed from: a */
    public static File m1368a(Context context) {
        return new File(m1398j(context), "apminsight/CrashLogJava");
    }

    /* JADX INFO: renamed from: a */
    public static File m1369a(Context context, String str) {
        return new File(m1398j(context) + "/apminsight/CrashCommonLog/" + str);
    }

    /* JADX INFO: renamed from: a */
    public static File m1370a(File file) {
        return new File(file, "flog.txt");
    }

    /* JADX INFO: renamed from: a */
    public static File m1371a(File file, String str) {
        return new File(file, file.getName() + str);
    }

    /* JADX INFO: renamed from: a */
    public static String m1372a(String str) {
        return "dart_".concat(String.valueOf(str));
    }

    /* JADX INFO: renamed from: b */
    public static File m1373b(Context context) {
        return new File(m1398j(context), "apminsight/CrashLogSimple");
    }

    /* JADX INFO: renamed from: b */
    public static File m1374b(File file) {
        return new File(file, "tombstone.txt");
    }

    /* JADX INFO: renamed from: b */
    public static File m1375b(String str) {
        return new File(m1369a(C1390e.m1032g(), str), "fds.txt");
    }

    /* JADX INFO: renamed from: b */
    public static String m1376b() {
        return "anr_" + C1390e.m1028e();
    }

    /* JADX INFO: renamed from: c */
    public static File m1377c(Context context) {
        return new File(m1398j(context), "apminsight/RuntimeContext");
    }

    /* JADX INFO: renamed from: c */
    public static File m1378c(File file) {
        return new File(file, "header.bin");
    }

    /* JADX INFO: renamed from: c */
    public static File m1379c(String str) {
        return new File(m1369a(C1390e.m1032g(), str), "threads.txt");
    }

    /* JADX INFO: renamed from: c */
    public static String m1380c() {
        return String.format("ensure_%s", C1390e.m1028e());
    }

    /* JADX INFO: renamed from: d */
    public static File m1381d(Context context) {
        if (f737b == null) {
            if (context == null) {
                context = C1390e.m1032g();
            }
            f737b = new File(m1398j(context), "apminsight/CrashLogNative");
        }
        return f737b;
    }

    /* JADX INFO: renamed from: d */
    public static File m1382d(File file) {
        return new File(m1369a(C1390e.m1032g(), file.getName()), "maps.txt");
    }

    /* JADX INFO: renamed from: d */
    public static File m1383d(String str) {
        return new File(m1369a(C1390e.m1032g(), str), "meminfo.txt");
    }

    /* JADX INFO: renamed from: e */
    public static File m1384e(Context context) {
        if (f738c == null) {
            f738c = new File(m1398j(context) + "/apminsight/CrashCommonLog/" + C1390e.m1030f());
        }
        return f738c;
    }

    /* JADX INFO: renamed from: e */
    public static File m1385e(File file) {
        return new File(file, "callback.json");
    }

    /* JADX INFO: renamed from: e */
    public static File m1386e(String str) {
        return new File(m1369a(C1390e.m1032g(), str), "pthreads.txt");
    }

    /* JADX INFO: renamed from: f */
    public static File m1387f(Context context) {
        return new File(m1398j(context), "apminsight/CrashCommonLog");
    }

    /* JADX INFO: renamed from: f */
    public static File m1388f(File file) {
        return new File(file, "upload.json");
    }

    /* JADX INFO: renamed from: f */
    public static File m1389f(String str) {
        return new File(m1369a(C1390e.m1032g(), str), "rountines.txt");
    }

    /* JADX INFO: renamed from: g */
    public static File m1390g(Context context) {
        return new File(m1398j(context), "apminsight/issueCrashTimes");
    }

    /* JADX INFO: renamed from: g */
    public static File m1391g(File file) {
        return new File(file, "javastack.txt");
    }

    /* JADX INFO: renamed from: g */
    public static File m1392g(String str) {
        return new File(m1369a(C1390e.m1032g(), str), "leakd_threads.txt");
    }

    /* JADX INFO: renamed from: h */
    public static File m1393h(Context context) {
        return new File(m1398j(context) + "/apminsight/issueCrashTimes/current.times");
    }

    /* JADX INFO: renamed from: h */
    public static File m1394h(File file) {
        return new File(m1369a(C1390e.m1032g(), file.getName()), "logcat.txt");
    }

    /* JADX INFO: renamed from: i */
    public static File m1395i(Context context) {
        return new File(m1398j(context), "apminsight/alogCrash");
    }

    /* JADX INFO: renamed from: i */
    public static File m1396i(File file) {
        return new File(m1369a(C1390e.m1032g(), file.getName()), "fds.txt");
    }

    /* JADX INFO: renamed from: j */
    public static File m1397j(File file) {
        return new File(m1369a(C1390e.m1032g(), file.getName()), "threads.txt");
    }

    /* JADX INFO: renamed from: j */
    public static String m1398j(Context context) {
        if (TextUtils.isEmpty(f736a)) {
            try {
                f736a = context.getFilesDir().getAbsolutePath();
            } catch (Exception e) {
                f736a = "/sdcard/";
                e.printStackTrace();
            }
        }
        return f736a;
    }

    /* JADX INFO: renamed from: k */
    public static File m1399k(File file) {
        return new File(m1369a(C1390e.m1032g(), file.getName()), "meminfo.txt");
    }

    /* JADX INFO: renamed from: l */
    public static File m1400l(File file) {
        return new File(m1369a(C1390e.m1032g(), file.getName()), "pthreads.txt");
    }

    /* JADX INFO: renamed from: m */
    public static File m1401m(File file) {
        return new File(m1369a(C1390e.m1032g(), file.getName()), "rountines.txt");
    }

    /* JADX INFO: renamed from: n */
    public static File m1402n(File file) {
        return new File(m1369a(C1390e.m1032g(), file.getName()), "leakd_threads.txt");
    }

    /* JADX INFO: renamed from: o */
    public static File m1403o(File file) {
        return new File(file, "abortmsg.txt");
    }
}
