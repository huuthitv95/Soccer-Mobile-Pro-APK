package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ay */
/* JADX INFO: loaded from: classes3.dex */
public class C3562ay {
    /* JADX INFO: renamed from: ri */
    public static boolean m16368ri() {
        if (Build.VERSION.SDK_INT < 33) {
            return Build.VERSION.SDK_INT >= 32 && m16369ri("T", Build.VERSION.CODENAME);
        }
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m16369ri(String str, String str2) {
        return !"REL".equals(str2) && str2.toUpperCase(Locale.ROOT).compareTo(str.toUpperCase(Locale.ROOT)) >= 0;
    }
}
