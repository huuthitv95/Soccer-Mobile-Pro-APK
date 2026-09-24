package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11676T3;
import com.tiktok.util.UrlConst;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.nr */
/* JADX INFO: loaded from: classes3.dex */
public class C2724nr {
    /* JADX INFO: renamed from: di */
    public static boolean m10253di(Context context) {
        return m10255ik(context) == 6;
    }

    /* JADX INFO: renamed from: fi */
    public static boolean m10254fi(Context context) {
        return m10255ik(context) == 5;
    }

    /* JADX INFO: renamed from: ik */
    public static int m10255ik(Context context) {
        return C2728su.m10293ri(context, 60000L);
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m10256ka(Context context) {
        return m10255ik(context) == 4;
    }

    /* JADX INFO: renamed from: lr */
    public static int m10257lr(Context context) {
        int iM10255ik = m10255ik(context);
        if (iM10255ik == 1) {
            return 0;
        }
        if (iM10255ik == 4) {
            return 1;
        }
        if (iM10255ik == 5) {
            return 4;
        }
        if (iM10255ik != 6) {
            return iM10255ik;
        }
        return 6;
    }

    /* JADX INFO: renamed from: mj */
    public static boolean m10258mj(Context context) {
        if (context == null) {
            return false;
        }
        int iM10255ik = m10255ik(context);
        return iM10255ik == 2 || iM10255ik == 3 || iM10255ik == 4 || iM10255ik == 5 || iM10255ik == 6;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m10259ri(Context context) {
        return m10255ik(context) != 0;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m10260ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith(UrlConst.HTTPS);
    }

    public static String xha(Context context) {
        int iM10255ik = m10255ik(context);
        if (iM10255ik == 2) {
            return "2g";
        }
        if (iM10255ik == 3) {
            return C11676T3.f25718a;
        }
        if (iM10255ik == 4) {
            return C11676T3.f25719b;
        }
        if (iM10255ik != 5) {
            return iM10255ik != 6 ? "mobile" : "5g";
        }
        return "4g";
    }
}
