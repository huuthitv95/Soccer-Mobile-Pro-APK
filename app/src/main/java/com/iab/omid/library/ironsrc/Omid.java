package com.iab.omid.library.ironsrc;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class Omid {
    private static C11125b INSTANCE = new C11125b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m24206a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m24205a();
    }

    public static boolean isActive() {
        return INSTANCE.m24208b();
    }

    public static void updateLastActivity() {
        INSTANCE.m24209c();
    }
}
