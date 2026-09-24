package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C11744X3;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.ac */
/* JADX INFO: loaded from: classes3.dex */
public class C2707ac {

    /* JADX INFO: renamed from: lr */
    private static String f7754lr = "";

    /* JADX INFO: renamed from: ri */
    private static boolean f7755ri;

    /* JADX INFO: renamed from: ik */
    public static void m10196ik(String str, String str2) {
        if (f7755ri && str2 != null) {
            Log.e(m10198lr(str), str2);
        }
    }

    /* JADX INFO: renamed from: ik */
    public static void m10197ik(String str, Object... objArr) {
        if (f7755ri && objArr != null) {
            Log.e(m10198lr(str), m10202ri(objArr));
        }
    }

    /* JADX INFO: renamed from: lr */
    private static String m10198lr(String str) {
        if (TextUtils.isEmpty(f7754lr)) {
            return str;
        }
        return m10202ri(C11744X3.j.f26438d + f7754lr + "]-[" + str + C11744X3.j.f26440e);
    }

    /* JADX INFO: renamed from: lr */
    public static void m10199lr() {
        f7755ri = false;
    }

    /* JADX INFO: renamed from: lr */
    public static void m10200lr(String str, String str2) {
        if (f7755ri && str2 != null) {
            Log.i(m10198lr(str), str2);
        }
    }

    /* JADX INFO: renamed from: lr */
    public static void m10201lr(String str, Object... objArr) {
        if (f7755ri && objArr != null) {
            Log.i(m10198lr(str), m10202ri(objArr));
        }
    }

    /* JADX INFO: renamed from: ri */
    private static String m10202ri(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ri */
    public static void m10203ri() {
        f7755ri = true;
    }

    /* JADX INFO: renamed from: ri */
    public static void m10204ri(String str) {
        f7754lr = str;
    }

    /* JADX INFO: renamed from: ri */
    public static void m10205ri(String str, String str2) {
        if (f7755ri && str2 != null) {
            Log.d(m10198lr(str), str2);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m10206ri(String str, String str2, Throwable th) {
        if (f7755ri) {
            if (str2 == null && th == null) {
                return;
            }
            Log.e(m10198lr(str), str2, th);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m10207ri(String str, Object... objArr) {
        if (f7755ri && objArr != null) {
            Log.d(m10198lr(str), m10202ri(objArr));
        }
    }
}
