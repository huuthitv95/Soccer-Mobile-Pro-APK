package com.bykv.p028vk.openvk.preload.geckox.utils;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import java.lang.reflect.Method;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.utils.a */
/* JADX INFO: compiled from: AppUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1964a {

    /* JADX INFO: renamed from: a */
    private static String f4486a;

    /* JADX INFO: renamed from: a */
    public static String m6067a() {
        if (!TextUtils.isEmpty(f4486a)) {
            return f4486a;
        }
        String strM6070b = m6070b();
        f4486a = strM6070b;
        if (!TextUtils.isEmpty(strM6070b)) {
            return f4486a;
        }
        String strM6072c = m6072c();
        f4486a = strM6072c;
        return !TextUtils.isEmpty(strM6072c) ? f4486a : f4486a;
    }

    /* JADX INFO: renamed from: a */
    public static String m6068a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            GeckoLogger.m6043w("gecko-debug-tag", "getVersion:", e);
            return AbstractJsonLexerKt.NULL;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m6069a(Throwable th) {
        GeckoLogger.m6043w("gecko-debug-tag", "throwIfDebug:", th);
    }

    /* JADX INFO: renamed from: b */
    private static String m6070b() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m6071b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            return applicationInfo == null ? "" : applicationInfo.loadLabel(packageManager).toString();
        } catch (Throwable th) {
            GeckoLogger.m6043w("gecko-debug-tag", "getApplicationName:", th);
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m6072c() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }
}
