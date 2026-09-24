package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.q0 */
/* JADX INFO: compiled from: SameLogTool.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13219q0 {

    /* JADX INFO: renamed from: a */
    public static boolean f36355a = true;

    /* JADX INFO: renamed from: b */
    public static boolean f36356b = true;

    /* JADX INFO: renamed from: c */
    public static boolean f36357c = true;

    /* JADX INFO: renamed from: d */
    public static boolean f36358d = false;

    /* JADX INFO: renamed from: e */
    public static boolean f36359e = true;

    /* JADX INFO: renamed from: f */
    public static boolean f36360f = false;

    /* JADX INFO: renamed from: g */
    public static boolean f36361g = true;

    /* JADX INFO: renamed from: h */
    public static boolean f36362h = true;

    static {
        if (MBridgeConstans.DEBUG) {
            return;
        }
        f36361g = false;
        f36355a = false;
        f36357c = false;
        f36362h = false;
        f36356b = false;
        f36360f = false;
        f36359e = false;
        f36358d = false;
    }

    /* JADX INFO: renamed from: a */
    public static void m37813a(String str, String str2) {
        if (!f36355a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(m37812a(str), str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m37816b(String str, String str2) {
        if (!f36356b || str2 == null) {
            return;
        }
        Log.e(m37812a(str), str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m37818c(String str, String str2) {
        if (!f36357c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(m37812a(str), str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m37820d(String str, String str2) {
        if (!f36362h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(m37812a(str), str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m37817b(String str, String str2, Throwable th) {
        if (!f36356b || str2 == null || th == null) {
            return;
        }
        Log.e(m37812a(str), str2, th);
    }

    /* JADX INFO: renamed from: a */
    private static String m37812a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "MBRIDGE_" + str;
    }

    /* JADX INFO: renamed from: c */
    public static void m37819c(String str, String str2, Throwable th) {
        if (!f36362h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(m37812a(str), str2, th);
    }

    /* JADX INFO: renamed from: a */
    public static void m37814a(String str, String str2, Throwable th) {
        if (!f36355a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(m37812a(str), str2, th);
    }

    /* JADX INFO: renamed from: a */
    public static void m37815a(String str, Throwable th) {
        if (!f36362h || th == null) {
            return;
        }
        Log.w(m37812a(str), th);
    }
}
