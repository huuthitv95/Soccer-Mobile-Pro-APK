package com.apm.insight.p022l;

import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.C1373a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.util.Locale;

/* JADX INFO: renamed from: com.apm.insight.l.l */
/* JADX INFO: compiled from: RomUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1436l {

    /* JADX INFO: renamed from: a */
    private static final CharSequence f740a = "amigo";

    /* JADX INFO: renamed from: b */
    private static final CharSequence f741b = "funtouch";

    /* JADX INFO: renamed from: a */
    public static String m1408a() {
        String str;
        String str2 = "";
        if (C1428d.m1312b()) {
            if (!C1428d.m1312b()) {
                return "";
            }
            return "miui_" + m1409a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
        }
        if (C1428d.m1314c()) {
            String str3 = Build.DISPLAY;
            return (str3 == null || !str3.toLowerCase(Locale.getDefault()).contains("flyme")) ? "" : str3;
        }
        if (m1410b()) {
            if (!m1410b()) {
                return "";
            }
            return "coloros_" + m1409a("ro.build.version.opporom") + "_" + Build.DISPLAY;
        }
        String strM1309a = C1428d.m1309a();
        if (strM1309a == null || !strM1309a.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            str = "";
        } else {
            str = strM1309a + "_" + Build.DISPLAY;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strM1409a = m1409a("ro.vivo.os.build.display.id");
        if (!TextUtils.isEmpty(strM1409a) && strM1409a.toLowerCase(Locale.getDefault()).contains(f741b)) {
            return m1409a("ro.vivo.os.build.display.id") + "_" + m1409a("ro.vivo.product.version");
        }
        if (!TextUtils.isEmpty(Build.DISPLAY) && Build.DISPLAY.toLowerCase(Locale.getDefault()).contains(f740a)) {
            return Build.DISPLAY + "_" + m1409a("ro.gn.sv.version");
        }
        String str4 = Build.MANUFACTURER + Build.BRAND;
        if (!TextUtils.isEmpty(str4)) {
            String lowerCase = str4.toLowerCase(Locale.getDefault());
            if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                return m1409a("ro.build.uiversion") + "_" + Build.DISPLAY;
            }
        }
        if (!TextUtils.isEmpty(m1409a("ro.letv.release.version"))) {
            str2 = "eui_" + m1409a("ro.letv.release.version") + "_" + Build.DISPLAY;
        }
        return !TextUtils.isEmpty(str2) ? str2 : Build.DISPLAY;
    }

    /* JADX INFO: renamed from: a */
    private static String m1409a(String str) {
        BufferedReader bufferedReader;
        String line = "";
        try {
            Process processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
            bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
            try {
                line = bufferedReader.readLine();
                processExec.destroy();
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
    private static boolean m1410b() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.getDefault()).contains("oppo");
    }
}
