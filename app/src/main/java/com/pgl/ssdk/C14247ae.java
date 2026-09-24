package com.pgl.ssdk;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: renamed from: com.pgl.ssdk.ae */
/* JADX INFO: loaded from: classes7.dex */
public class C14247ae {

    /* JADX INFO: renamed from: a */
    public static int f41224a;

    /* JADX INFO: renamed from: b */
    public static int f41225b;

    /* JADX INFO: renamed from: c */
    public static int f41226c;

    /* JADX INFO: renamed from: d */
    public static int f41227d;

    /* JADX INFO: renamed from: e */
    public static int f41228e;

    /* JADX INFO: renamed from: f */
    private static int f41229f;

    /* JADX INFO: renamed from: g */
    private static int f41230g;

    /* JADX INFO: renamed from: h */
    private static int f41231h;

    /* JADX INFO: renamed from: a */
    public static int m42930a(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.touchscreen;
            }
            return 666666;
        } catch (Throwable unused) {
            return 666666;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m42931b(Context context) {
        if (context == null) {
            return;
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f41229f = (int) displayMetrics.density;
            f41228e = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m42932c(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f41230g = (int) displayMetrics.xdpi;
            f41231h = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m42933d(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f41224a = displayMetrics.widthPixels;
            f41225b = displayMetrics.heightPixels;
            Display.Mode mode = defaultDisplay.getMode();
            f41226c = mode.getPhysicalWidth();
            f41227d = mode.getPhysicalHeight();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m42934e(Context context) {
        int i = -1;
        if (context != null) {
            try {
                i = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: f */
    public static String m42935f(Context context) {
        try {
            m42933d(context);
            m42931b(context);
            m42932c(context);
        } catch (Throwable unused) {
        }
        return f41228e + "[<!>]" + f41224a + "," + f41225b + "[<!>]" + f41226c + "x" + f41227d + "[<!>]";
    }
}
