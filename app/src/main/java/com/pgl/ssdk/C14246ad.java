package com.pgl.ssdk;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.pgl.ssdk.ad */
/* JADX INFO: loaded from: classes7.dex */
public class C14246ad {

    /* JADX INFO: renamed from: a */
    private static double f41223a = -1.0d;

    /* JADX INFO: renamed from: a */
    public static String m42924a() {
        return (Build.VERSION.SDK_INT >= 24 ? LocaleList.getDefault().get(0) : Locale.getDefault()).getLanguage();
    }

    /* JADX INFO: renamed from: a */
    public static String m42925a(Context context) {
        String string;
        try {
            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            string = null;
        }
        return string == null ? "" : string.trim();
    }

    /* JADX INFO: renamed from: b */
    public static String m42926b() {
        String displayName;
        try {
            displayName = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            displayName = null;
        }
        return displayName == null ? "" : displayName.trim();
    }

    /* JADX INFO: renamed from: b */
    public static String m42927b(Context context) {
        double d = f41223a;
        double dDoubleValue = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return Integer.toString((int) d);
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
            Object objNewInstance = cls.getConstructor(Context.class).newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod("getAveragePower", String.class);
            declaredMethod.setAccessible(true);
            dDoubleValue = ((Double) declaredMethod.invoke(objNewInstance, "battery.capacity")).doubleValue();
        } catch (Throwable unused) {
        }
        f41223a = dDoubleValue;
        return Integer.toString((int) dDoubleValue);
    }

    /* JADX INFO: renamed from: c */
    public static String m42928c() {
        return "";
    }

    /* JADX INFO: renamed from: c */
    public static String m42929c(Context context) {
        return "";
    }
}
