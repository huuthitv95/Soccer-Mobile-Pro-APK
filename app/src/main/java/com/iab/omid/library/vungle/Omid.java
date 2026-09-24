package com.iab.omid.library.vungle;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class Omid {
    private static C11283b INSTANCE = new C11283b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m24971a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m24970a();
    }

    public static boolean isActive() {
        return INSTANCE.m24973b();
    }

    public static void updateLastActivity() {
        INSTANCE.m24974c();
    }
}
