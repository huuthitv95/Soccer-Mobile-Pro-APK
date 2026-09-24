package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.pgl.ssdk.an */
/* JADX INFO: loaded from: classes7.dex */
public class C14256an {

    /* JADX INFO: renamed from: a */
    public static int f41264a = -1;

    /* JADX INFO: renamed from: b */
    public static String f41265b = null;

    /* JADX INFO: renamed from: c */
    private static String f41266c = "api16-access-ttp.tiktokpangle.us";

    /* JADX INFO: renamed from: d */
    public static final String[] f41267d = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    /* JADX INFO: renamed from: e */
    private static int f41268e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f */
    public static String f41269f = "";

    /* JADX INFO: renamed from: a */
    public static String m42983a() {
        return f41264a == 1 ? "VA" : "SG";
    }

    /* JADX INFO: renamed from: a */
    public static String m42984a(Context context) {
        if (!TextUtils.isEmpty(f41265b)) {
            return f41265b;
        }
        try {
            if (f41268e == Integer.MIN_VALUE) {
                f41268e = C14266ax.m43022a(context, "domain_index", 0);
            }
            String[] strArr = f41267d;
            return strArr[f41268e % strArr.length];
        } catch (Throwable unused) {
            return f41266c;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m42985a(int i) {
        f41264a = i;
    }

    /* JADX INFO: renamed from: a */
    public static void m42986a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f41265b = str;
    }

    /* JADX INFO: renamed from: b */
    public static String m42987b() {
        return f41269f;
    }

    /* JADX INFO: renamed from: b */
    public static void m42988b(Context context) {
        if (TextUtils.isEmpty(f41265b)) {
            C14263au.m43007a("updateIndex");
            int i = f41268e;
            if (i >= Integer.MAX_VALUE) {
                f41268e = 0;
                return;
            }
            int i2 = i + 1;
            f41268e = i2;
            C14266ax.m43027b(context, "domain_index", i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m42989b(String str) {
        f41269f = str;
    }
}
