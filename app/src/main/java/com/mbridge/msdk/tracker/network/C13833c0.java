package com.mbridge.msdk.tracker.network;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.c0 */
/* JADX INFO: compiled from: VolleyLog.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13833c0 {

    /* JADX INFO: renamed from: a */
    public static String f39438a = "TrackManager_Volley";

    /* JADX INFO: renamed from: b */
    private static final String f39439b = "com.mbridge.msdk.tracker.network.c0";

    /* JADX INFO: renamed from: a */
    private static String m41093a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(f39439b)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
            }
        }
        str2 = "<unknown>";
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m41094a(Throwable th, String str, Object... objArr) {
        Log.e(f39438a, m41093a(str, objArr), th);
    }

    /* JADX INFO: renamed from: b */
    public static void m41095b(String str, Object... objArr) {
        Log.d(f39438a, m41093a(str, objArr));
    }

    /* JADX INFO: renamed from: c */
    public static void m41096c(String str, Object... objArr) {
        Log.e(f39438a, m41093a(str, objArr));
    }

    /* JADX INFO: renamed from: d */
    public static void m41097d(String str, Object... objArr) {
    }
}
