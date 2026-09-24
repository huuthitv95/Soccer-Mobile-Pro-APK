package com.applovin.impl;

import android.os.Looper;

/* JADX INFO: renamed from: com.applovin.impl.m1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1617m1 {

    /* JADX INFO: renamed from: a */
    private static final Thread f2053a = Looper.getMainLooper().getThread();

    /* JADX INFO: renamed from: a */
    public static void m3169a(String str, Object... objArr) {
        m3171a((Throwable) null, str, objArr);
    }

    /* JADX INFO: renamed from: a */
    public static void m3170a(Throwable th) {
    }

    /* JADX INFO: renamed from: a */
    public static void m3171a(Throwable th, String str, Object... objArr) {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3172a(Object obj) {
        return m3173a(obj, "Null value not expected", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3173a(Object obj, String str, Object... objArr) {
        return m3175a(obj != null, str, objArr);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3174a(boolean z) {
        return m3175a(z, "Assertion failed", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3175a(boolean z, String str, Object... objArr) {
        if (!z) {
            m3169a(str, objArr);
        }
        return z;
    }
}
