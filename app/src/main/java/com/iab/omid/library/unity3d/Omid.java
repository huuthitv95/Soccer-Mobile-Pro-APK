package com.iab.omid.library.unity3d;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class Omid {
    private static C11225b INSTANCE = new C11225b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m24715a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m24714a();
    }

    public static boolean isActive() {
        return INSTANCE.m24717b();
    }

    public static void updateLastActivity() {
        INSTANCE.m24718c();
    }
}
