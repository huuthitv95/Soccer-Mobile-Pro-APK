package com.apm.insight.p022l;

import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.p021k.C1418e;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.apm.insight.l.d */
/* JADX INFO: compiled from: Device.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1428d {

    /* JADX INFO: renamed from: a */
    private static boolean f715a = false;

    /* JADX INFO: renamed from: b */
    private static int f716b = -1;

    /* JADX INFO: renamed from: c */
    private static final Pattern f717c = Pattern.compile("^0-([\\d]+)$");

    /* JADX INFO: renamed from: a */
    public static String m1309a() {
        return m1311b("ro.build.version.emui");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1310a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m1311b("ro.build.version.emui");
        }
        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).startsWith("emotionui")) {
            return m1318e();
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static String m1311b(String str) {
        BufferedReader bufferedReader;
        String line = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str))).getInputStream()), 1024);
            try {
                line = bufferedReader.readLine();
                bufferedReader.close();
                C1373a.m860a((Closeable) bufferedReader);
                return line;
            } catch (Throwable unused) {
                C1373a.m860a((Closeable) bufferedReader);
                return line;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1312b() {
        if (!f715a) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    C1418e.f669a = true;
                    f715a = true;
                    return C1418e.f669a;
                }
            } catch (Exception unused) {
            }
            f715a = true;
        }
        return C1418e.f669a;
    }

    /* JADX INFO: renamed from: c */
    private static int m1313c(String str) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    int iM1316d = m1316d(line);
                    try {
                        bufferedReader.close();
                    } catch (IOException unused) {
                    }
                    return iM1316d;
                }
            } catch (Throwable unused2) {
                if (bufferedReader == null) {
                    return -1;
                }
            }
        } catch (Throwable unused3) {
            bufferedReader = null;
        }
        try {
            bufferedReader.close();
            return -1;
        } catch (IOException unused4) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1314c() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* JADX INFO: renamed from: d */
    public static int m1315d() {
        int i = f716b;
        if (i > 0) {
            return i;
        }
        int iM1313c = m1313c("/sys/devices/system/cpu/possible");
        if (iM1313c <= 0) {
            iM1313c = m1313c("/sys/devices/system/cpu/present");
        }
        if (iM1313c <= 0) {
            iM1313c = m1317e("/sys/devices/system/cpu/");
        }
        if (iM1313c <= 0) {
            iM1313c = Runtime.getRuntime().availableProcessors();
        }
        if (iM1313c <= 0) {
            iM1313c = 1;
        }
        f716b = iM1313c;
        return iM1313c;
    }

    /* JADX INFO: renamed from: d */
    private static int m1316d(String str) {
        Matcher matcher = f717c.matcher(str);
        if (!matcher.matches()) {
            return -1;
        }
        try {
            return Integer.parseInt(matcher.group(1)) + 1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: e */
    private static int m1317e(String str) {
        try {
            File[] fileArrListFiles = new File(str).listFiles(new FilenameFilter() { // from class: com.apm.insight.l.d.1

                /* JADX INFO: renamed from: a */
                private final Pattern f718a = Pattern.compile("^cpu[\\d]+$");

                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str2) {
                    return this.f718a.matcher(str2).matches();
                }
            });
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return -1;
            }
            return fileArrListFiles.length;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: e */
    private static boolean m1318e() {
        try {
            return (!TextUtils.isEmpty(Build.BRAND) && Build.BRAND.toLowerCase(Locale.getDefault()).startsWith("huawei")) || (!TextUtils.isEmpty(Build.MANUFACTURER) && Build.MANUFACTURER.toLowerCase(Locale.getDefault()).startsWith("huawei"));
        } catch (Throwable unused) {
            return false;
        }
    }
}
