package com.iab.omid.library.bytedance2;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class Omid {
    private static C10971b INSTANCE = new C10971b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m23449a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m23448a();
    }

    public static boolean isActive() {
        return INSTANCE.m23451b();
    }

    public static void updateLastActivity() {
        INSTANCE.m23452c();
    }
}
