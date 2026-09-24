package com.chartboost.sdk.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import java.util.UUID;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.l6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3887l6 {

    /* JADX INFO: renamed from: a */
    public static int f15194a = 4;

    /* JADX INFO: renamed from: b */
    public static int f15195b = 5;

    /* JADX INFO: renamed from: a */
    public static String m18488a(Context context) {
        ContentResolver contentResolver;
        if (context == null || Build.VERSION.SDK_INT >= 26 || m18493e(context) || (contentResolver = context.getContentResolver()) == null) {
            return null;
        }
        try {
            String string = Settings.Secure.getString(contentResolver, "android_id");
            try {
                if ("9774d56d682e549c".equals(string)) {
                    return null;
                }
                return string;
            } catch (Exception unused) {
                return string;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m18489a(Context context, boolean z) {
        String strM18488a = m18488a(context);
        return (z || strM18488a == null) ? m18491c(context) : strM18488a;
    }

    /* JADX INFO: renamed from: b */
    public static Integer m18490b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.heightPixels / displayMetrics.ydpi;
        float f2 = displayMetrics.widthPixels / displayMetrics.xdpi;
        return Math.sqrt((double) ((f2 * f2) + (f * f))) >= 6.5d ? Integer.valueOf(f15195b) : Integer.valueOf(f15194a);
    }

    /* JADX INFO: renamed from: c */
    public static String m18491c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("cbPrefs", 0);
        if (sharedPreferences == null) {
            return UUID.randomUUID().toString();
        }
        String string = sharedPreferences.getString("cbUUID", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (editorEdit != null) {
            editorEdit.putString("cbUUID", string2).apply();
        }
        return string2;
    }

    /* JADX INFO: renamed from: d */
    public static String m18492d(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return "phone";
        }
        int i = configuration.uiMode & 15;
        int i2 = configuration.screenLayout & 15;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "phone";
        }
        if (packageManager.hasSystemFeature("org.chromium.arc.device_management")) {
            return "chromebook";
        }
        String str = Build.BRAND;
        if (str != null && str.equals("chromium") && Build.MANUFACTURER.equals("chromium")) {
            return "chromebook";
        }
        String str2 = Build.DEVICE;
        if (str2 != null && str2.matches(".+_cheets")) {
            return "chromebook";
        }
        if (packageManager.hasSystemFeature("android.hardware.type.watch") || i == 6) {
            return "watch";
        }
        if (packageManager.hasSystemFeature("android.hardware.type.television") || i == 4) {
            return "tv";
        }
        String str3 = Build.MANUFACTURER;
        return ((str3 == null || !str3.equalsIgnoreCase("Amazon")) && i2 != 4) ? "phone" : "tablet";
    }

    /* JADX INFO: renamed from: e */
    public static boolean m18493e(Context context) {
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("cb.limit.aid");
            return (obj instanceof Integer) && ((Integer) obj).intValue() == 1;
        } catch (Exception unused) {
            return false;
        }
    }
}
