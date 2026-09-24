package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import com.pgl.ssdk.ces.C14271a;
import com.pgl.ssdk.ces.C14272b;

/* JADX INFO: renamed from: com.pgl.ssdk.a5 */
/* JADX INFO: loaded from: classes7.dex */
public class C14242a5 {

    /* JADX INFO: renamed from: a */
    public static int f41206a = 504;

    /* JADX INFO: renamed from: b */
    public static String f41207b = null;

    /* JADX INFO: renamed from: c */
    public static String f41208c = "";

    /* JADX INFO: renamed from: d */
    static boolean f41209d;

    /* JADX INFO: renamed from: e */
    private static long f41210e;

    /* JADX INFO: renamed from: f */
    private static Context f41211f;

    /* JADX INFO: renamed from: a */
    public static synchronized Object m42796a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return C14271a.meta(302, f41211f, bArr);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m42797a() {
        if (TextUtils.isEmpty(f41208c)) {
            f41208c = (String) C14271a.meta(303, f41211f, null);
        }
        return f41208c;
    }

    /* JADX INFO: renamed from: a */
    public static void m42798a(Context context, String str) {
        if (f41211f == null) {
            f41211f = context;
        }
        int i = f41206a;
        if (i == 102 || i == 202 || i == 200) {
            return;
        }
        f41210e = System.currentTimeMillis();
        f41209d = false;
        f41207b = str;
        f41206a = 102;
        C14260ar.m42995b(new RunnableC14257ao(context, 301, null));
    }

    /* JADX INFO: renamed from: b */
    public static void m42799b() {
        Context context = f41211f;
        if (context != null) {
            C14260ar.m42995b(new RunnableC14257ao(context, 301, null));
            f41206a = 102;
            C14272b c14272bM43044e = C14272b.m43044e();
            if (c14272bM43044e != null) {
                c14272bM43044e.m43050a("");
            }
        }
    }
}
