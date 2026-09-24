package com.iab.omid.library.applovin;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class Omid {
    private static C10920b INSTANCE = new C10920b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m23196a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m23195a();
    }

    public static boolean isActive() {
        return INSTANCE.m23198b();
    }

    public static void updateLastActivity() {
        INSTANCE.m23199c();
    }
}
