package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.uq */
/* JADX INFO: loaded from: classes3.dex */
public final class C2729uq {

    /* JADX INFO: renamed from: di */
    private static boolean f7791di;

    /* JADX INFO: renamed from: fi */
    private static boolean f7792fi;

    /* JADX INFO: renamed from: ik */
    private static Resources f7793ik;

    /* JADX INFO: renamed from: ka */
    private static String f7794ka;

    /* JADX INFO: renamed from: lr */
    private static String f7795lr;

    /* JADX INFO: renamed from: ri */
    private static Context f7796ri;

    /* JADX INFO: renamed from: di */
    public static int m10301di(Context context, String str) {
        return m10310ri(context, str, "style");
    }

    /* JADX INFO: renamed from: fi */
    public static int m10302fi(Context context, String str) {
        return m10310ri(context, str, "id");
    }

    /* JADX INFO: renamed from: ik */
    public static Drawable m10303ik(Context context, String str) {
        try {
            return m10308lr(context).getDrawable(m10305ka(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ik */
    public static synchronized void m10304ik(Context context) {
        try {
            if (TextUtils.isEmpty(f7795lr)) {
                return;
            }
            f7792fi = true;
        } catch (Throwable th) {
            Log.e("ResourceHelp", "makePluginResources failed", th);
        }
    }

    public static int jbs(Context context, String str) {
        return m10310ri(context, str, "anim");
    }

    /* JADX INFO: renamed from: ka */
    public static int m10305ka(Context context, String str) {
        try {
            return m10310ri(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ka */
    private static String m10306ka(Context context) {
        if (f7794ka == null) {
            f7794ka = context.getPackageName();
        }
        return f7794ka;
    }

    /* JADX INFO: renamed from: lr */
    public static int m10307lr(Context context, String str) {
        return m10310ri(context, str, TypedValues.Custom.S_STRING);
    }

    /* JADX INFO: renamed from: lr */
    public static Resources m10308lr(Context context) {
        Resources resources = f7793ik;
        if (resources == null) {
            resources = null;
        }
        Context context2 = f7796ri;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    /* JADX INFO: renamed from: mj */
    public static int m10309mj(Context context, String str) {
        return m10310ri(context, str, "color");
    }

    /* JADX INFO: renamed from: ri */
    private static int m10310ri(Context context, String str, String str2) {
        int identifier = m10308lr(context).getIdentifier(str, str2, m10306ka(context));
        if (identifier != 0) {
            return identifier;
        }
        if (f7792fi) {
            return context.getResources().getIdentifier(str, str2, m10306ka(context));
        }
        m10304ik(context);
        return m10308lr(context).getIdentifier(str, str2, m10306ka(context));
    }

    /* JADX INFO: renamed from: ri */
    public static String m10311ri(Context context, String str) {
        return m10308lr(context).getString(m10307lr(context, str));
    }

    /* JADX INFO: renamed from: ri */
    public static void m10312ri(Context context) {
        f7796ri = context;
    }

    /* JADX INFO: renamed from: ri */
    public static void m10313ri(String str) {
        f7794ka = str;
    }

    public static int xha(Context context, String str) {
        return m10308lr(context).getColor(m10309mj(context, str));
    }
}
