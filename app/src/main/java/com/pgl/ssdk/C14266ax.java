package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.pgl.ssdk.ax */
/* JADX INFO: loaded from: classes7.dex */
public class C14266ax {

    /* JADX INFO: renamed from: a */
    private static SharedPreferences f41284a;

    /* JADX INFO: renamed from: a */
    public static int m43022a(Context context, String str, int i) {
        SharedPreferences sharedPreferencesM43024a = m43024a(context);
        return sharedPreferencesM43024a != null ? sharedPreferencesM43024a.getInt(str, i) : i;
    }

    /* JADX INFO: renamed from: a */
    public static long m43023a(Context context, String str, long j) {
        SharedPreferences sharedPreferencesM43024a = m43024a(context);
        return sharedPreferencesM43024a != null ? sharedPreferencesM43024a.getLong(str, j) : j;
    }

    /* JADX INFO: renamed from: a */
    public static SharedPreferences m43024a(Context context) {
        if (f41284a == null) {
            f41284a = context.getSharedPreferences("ss_config", 0);
        }
        return f41284a;
    }

    /* JADX INFO: renamed from: a */
    public static String m43025a(Context context, String str) {
        return m43026a(context, str, "");
    }

    /* JADX INFO: renamed from: a */
    public static String m43026a(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesM43024a = m43024a(context);
        return sharedPreferencesM43024a != null ? sharedPreferencesM43024a.getString(str, str2) : str2;
    }

    /* JADX INFO: renamed from: b */
    public static void m43027b(Context context, String str, int i) {
        SharedPreferences sharedPreferencesM43024a = m43024a(context);
        if (sharedPreferencesM43024a != null) {
            sharedPreferencesM43024a.edit().putInt(str, i).apply();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m43028b(Context context, String str, long j) {
        SharedPreferences sharedPreferencesM43024a = m43024a(context);
        if (sharedPreferencesM43024a != null) {
            sharedPreferencesM43024a.edit().putLong(str, j).apply();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m43029b(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesM43024a = m43024a(context);
        if (sharedPreferencesM43024a != null) {
            sharedPreferencesM43024a.edit().putString(str, str2).apply();
        }
    }
}
