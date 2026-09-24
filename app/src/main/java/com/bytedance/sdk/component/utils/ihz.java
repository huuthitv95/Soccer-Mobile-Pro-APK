package com.bytedance.sdk.component.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class ihz {

    /* JADX INFO: renamed from: ri */
    private static String f7764ri;

    /* JADX INFO: renamed from: ik */
    public static String m10225ik(Context context) {
        String strM10227lr = m10227lr(context);
        return (TextUtils.isEmpty(strM10227lr) || !strM10227lr.contains(CertificateUtil.DELIMITER)) ? strM10227lr : strM10227lr.replace(CertificateUtil.DELIMITER, "_");
    }

    /* JADX INFO: renamed from: lr */
    private static String m10226lr() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    public static String m10227lr(Context context) {
        if (!TextUtils.isEmpty(f7764ri)) {
            return f7764ri;
        }
        String strM10228ri = m10228ri();
        f7764ri = strM10228ri;
        if (!TextUtils.isEmpty(strM10228ri)) {
            return f7764ri;
        }
        String strM10226lr = m10226lr();
        f7764ri = strM10226lr;
        return !TextUtils.isEmpty(strM10226lr) ? f7764ri : f7764ri;
    }

    /* JADX INFO: renamed from: ri */
    private static String m10228ri() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m10229ri(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), m10227lr(context));
    }
}
