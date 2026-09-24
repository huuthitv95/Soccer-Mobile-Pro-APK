package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3574ik {

    /* JADX INFO: renamed from: ri */
    public static int f13184ri = -1;

    /* JADX INFO: renamed from: ri */
    public static int m16523ri(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context != null) {
            try {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && (configuration = resources.getConfiguration()) != null) {
                    int i2 = configuration.orientation;
                    if (i == 0) {
                        i = i2;
                    }
                    return i == i2 ? Math.round(displayMetrics.heightPixels / displayMetrics.density) : Math.round(displayMetrics.widthPixels / displayMetrics.density);
                }
            } catch (Throwable unused) {
                return f13184ri;
            }
        }
        return f13184ri;
    }

    /* JADX INFO: renamed from: ri */
    public static int m16524ri(Context context, int i, int i2) {
        int iRound;
        int iM16523ri = m16523ri(context, i2);
        if (iM16523ri == -1) {
            return f13184ri;
        }
        int iMin = Math.min(90, Math.round(iM16523ri * 0.15f));
        if (i > 655) {
            iRound = Math.round((i / 728.0f) * 90.0f);
        } else if (i > 632) {
            iRound = 81;
        } else if (i > 526) {
            iRound = Math.round((i / 468.0f) * 60.0f);
        } else {
            iRound = i > 432 ? 68 : Math.round((i / 320.0f) * 50.0f);
        }
        return Math.max(Math.min(iRound, iMin), 50);
    }
}
