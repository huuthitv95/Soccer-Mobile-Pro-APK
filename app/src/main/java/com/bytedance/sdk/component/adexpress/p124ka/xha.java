package com.bytedance.sdk.component.adexpress.p124ka;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import com.bytedance.sdk.component.utils.C2729uq;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class xha {
    /* JADX INFO: renamed from: ik */
    public static float m8828ik(Context context, float f) {
        if (context == null) {
            context = C2531ri.m9163ri().m9166ik().mo9151lr();
        }
        return f * m8830ka(context);
    }

    /* JADX INFO: renamed from: ik */
    public static String m8829ik(Context context) {
        String language;
        try {
            Locale locale = Build.VERSION.SDK_INT >= 24 ? C2729uq.m10308lr(context).getConfiguration().getLocales().get(0) : Locale.getDefault();
            language = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    language = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            language = "";
        }
        return m8836ri(language);
    }

    /* JADX INFO: renamed from: ka */
    private static float m8830ka(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: lr */
    public static int m8831lr(Context context) {
        if (context == null) {
            context = C2531ri.m9163ri().m9166ik().mo9151lr();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* JADX INFO: renamed from: lr */
    public static int m8832lr(Context context, float f) {
        if (context == null) {
            context = C2531ri.m9163ri().m9166ik().mo9151lr();
        }
        float fM8830ka = m8830ka(context);
        if (fM8830ka <= 0.0f) {
            fM8830ka = 1.0f;
        }
        return (int) ((f / fM8830ka) + 0.5f);
    }

    /* JADX INFO: renamed from: ri */
    public static float m8833ri(Context context, float f) {
        if (context == null) {
            context = C2531ri.m9163ri().m9166ik().mo9151lr();
        }
        return (f * m8830ka(context)) + 0.5f;
    }

    /* JADX INFO: renamed from: ri */
    public static int m8834ri(float f, float f2, float f3, float f4) {
        return (((int) ((f * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f3 * 255.0f) + 0.5f)) << 8) | ((int) ((f4 * 255.0f) + 0.5f));
    }

    /* JADX INFO: renamed from: ri */
    public static int m8835ri(Context context) {
        if (context == null) {
            context = C2531ri.m9163ri().m9166ik().mo9151lr();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: renamed from: ri */
    private static String m8836ri(String str) {
        str.hashCode();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }
}
