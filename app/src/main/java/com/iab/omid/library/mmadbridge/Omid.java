package com.iab.omid.library.mmadbridge;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class Omid {
    private static C11176b INSTANCE = new C11176b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m24459a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m24458a();
    }

    public static boolean isActive() {
        return INSTANCE.m24461b();
    }

    public static void updateLastActivity() {
        INSTANCE.m24462c();
    }
}
