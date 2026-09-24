package com.iab.omid.library.fyber;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class Omid {
    private static C11074b INSTANCE = new C11074b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m23953a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m23952a();
    }

    public static boolean isActive() {
        return INSTANCE.m23955b();
    }

    public static void updateLastActivity() {
        INSTANCE.m23956c();
    }
}
