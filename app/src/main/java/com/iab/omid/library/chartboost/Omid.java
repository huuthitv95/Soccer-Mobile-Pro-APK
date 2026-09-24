package com.iab.omid.library.chartboost;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class Omid {
    private static C11022b INSTANCE = new C11022b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m23692a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m23691a();
    }

    public static boolean isActive() {
        return INSTANCE.m23694b();
    }

    public static void updateLastActivity() {
        INSTANCE.m23695c();
    }
}
