package com.bytedance.adsdk.ugeno.xha;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.xha.ik */
/* JADX INFO: loaded from: classes3.dex */
public final class C2343ik {
    /* JADX INFO: renamed from: ri */
    public static double m8028ri(String str, double d) {
        if (str != null) {
            try {
                return Double.parseDouble(str);
            } catch (Throwable unused) {
            }
        }
        return d;
    }

    /* JADX INFO: renamed from: ri */
    public static float m8029ri(String str, float f) {
        if (str != null) {
            try {
                return Float.parseFloat(str);
            } catch (Throwable unused) {
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: ri */
    public static int m8030ri(String str, int i) {
        if (str != null) {
            try {
                return (int) Float.parseFloat(str);
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ri */
    public static long m8031ri(String str, long j) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (Throwable unused) {
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m8032ri(String str, boolean z) {
        if (str != null) {
            try {
                return Boolean.parseBoolean(str);
            } catch (Throwable unused) {
            }
        }
        return z;
    }
}
