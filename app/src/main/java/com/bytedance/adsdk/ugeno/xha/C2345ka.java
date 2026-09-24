package com.bytedance.adsdk.ugeno.xha;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.xha.ka */
/* JADX INFO: loaded from: classes3.dex */
public final class C2345ka {

    /* JADX INFO: renamed from: ik */
    private static Context f6096ik;

    /* JADX INFO: renamed from: lr */
    private static Resources f6097lr;

    /* JADX INFO: renamed from: ri */
    private static String f6098ri;

    /* JADX INFO: renamed from: lr */
    public static int m8033lr(Context context, String str) {
        return m8035ri(context, str, "drawable");
    }

    /* JADX INFO: renamed from: ri */
    public static int m8034ri(Context context, String str) {
        return m8035ri(context, str, "raw");
    }

    /* JADX INFO: renamed from: ri */
    private static int m8035ri(Context context, String str, String str2) {
        if (f6097lr == null) {
            f6097lr = context.getResources();
        }
        return f6097lr.getIdentifier(str, str2, m8036ri(context));
    }

    /* JADX INFO: renamed from: ri */
    private static String m8036ri(Context context) {
        if (f6098ri == null) {
            f6098ri = context.getPackageName();
        }
        return f6098ri;
    }

    /* JADX INFO: renamed from: ri */
    public static void m8037ri(String str) {
        f6098ri = str;
    }
}
