package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C12386n8;

/* JADX INFO: loaded from: classes6.dex */
public class Logger {

    /* JADX INFO: renamed from: a */
    private static boolean f32398a;

    /* JADX INFO: renamed from: d */
    public static void m33638d(String str, String str2) {
        if (f32398a) {
            Log.d(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m33640e(String str, String str2) {
        if (f32398a) {
            Log.e(str, str2);
        }
    }

    public static void enableLogging(int i) {
        f32398a = C12386n8.d.MODE_0.m32820b() != i;
    }

    /* JADX INFO: renamed from: i */
    public static void m33642i(String str, String str2) {
        if (f32398a) {
            Log.i(str, str2);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m33644v(String str, String str2) {
        if (f32398a) {
            Log.v(str, str2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m33646w(String str, String str2) {
        if (f32398a) {
            Log.w(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m33639d(String str, String str2, Throwable th) {
        if (f32398a) {
            Log.d(str, str2, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m33641e(String str, String str2, Throwable th) {
        if (f32398a) {
            Log.e(str, str2, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m33643i(String str, String str2, Throwable th) {
        if (!f32398a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2, th);
    }

    /* JADX INFO: renamed from: v */
    public static void m33645v(String str, String str2, Throwable th) {
        if (f32398a) {
            Log.v(str, str2, th);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m33647w(String str, String str2, Throwable th) {
        if (f32398a) {
            Log.w(str, str2, th);
        }
    }
}
