package com.mbridge.msdk.dycreator.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.utils.e */
/* JADX INFO: compiled from: DensityUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12982e {
    /* JADX INFO: renamed from: a */
    public static int m36409a(Context context, float f) {
        return (int) ((f * m36411a(context).density) + 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public static int m36413b(Context context, int i) {
        return (int) TypedValue.applyDimension(2, i, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: c */
    public static int m36414c(Context context, float f) {
        return (int) TypedValue.applyDimension(5, f, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: d */
    public static int m36415d(Context context, float f) {
        return (int) TypedValue.applyDimension(3, f, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: e */
    public static int m36416e(Context context, float f) {
        return (int) ((f / m36411a(context).density) + 0.5f);
    }

    /* JADX INFO: renamed from: a */
    public static DisplayMetrics m36411a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX INFO: renamed from: b */
    public static int m36412b(Context context, float f) {
        return (int) TypedValue.applyDimension(4, f, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: a */
    public static int m36410a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }
}
