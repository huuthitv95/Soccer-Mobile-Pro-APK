package com.pgl.ssdk;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.File;

/* JADX INFO: renamed from: com.pgl.ssdk.w */
/* JADX INFO: loaded from: classes7.dex */
public class C14293w {

    /* JADX INFO: renamed from: a */
    private static String f41353a;

    /* JADX INFO: renamed from: b */
    private static String f41354b;

    /* JADX INFO: renamed from: com.pgl.ssdk.w$a */
    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(C14293w.f41354b)) {
                String unused = C14293w.f41354b = C14293w.m43135d();
                C14266ax.m43029b(C14296z.m43153a(), "romtype", C14293w.f41354b);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m43129a(Context context) {
        String str = f41353a;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            f41353a = Settings.Global.getString(context.getContentResolver(), "boot_count");
        } else {
            f41353a = "lowapi";
        }
        return f41353a;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m43132b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m43133c() {
        if (!TextUtils.isEmpty(f41354b)) {
            return f41354b;
        }
        String strM43026a = C14266ax.m43026a(C14296z.m43153a(), "romtype", (String) null);
        f41354b = strM43026a;
        if (!TextUtils.isEmpty(strM43026a)) {
            return f41354b;
        }
        C14260ar.m42995b(new a());
        return "";
    }

    /* JADX INFO: renamed from: c */
    private static boolean m43134c(String str) {
        try {
            return new File(str).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static String m43135d() {
        if (m43132b("com.samsung.android.knox.SemPersonaManager") || m43132b("com.samsung.android.knoxguard.KnoxGuardManager")) {
            return Constants.REFERRER_API_SAMSUNG;
        }
        if (m43132b("androidhnext.Manifest") || m43132b("androidhnext.R")) {
            return "honor";
        }
        if (m43132b("androidhwext.Manifest") || m43132b("androidhwext.R")) {
            return "huawei";
        }
        if (m43132b("oppo.Manifest") || m43132b("oppo.R") || m43132b("oplus.Manifest") || m43132b("oplus.R") || m43132b("com.oneplus.Manifest") || m43132b("com.oneplus.R")) {
            return "oppo";
        }
        if (m43132b("vivo.Manifest") || m43132b("vivo.R")) {
            return Constants.REFERRER_API_VIVO;
        }
        if (m43132b("miui.Manifest") || m43132b("miui.R") || m43132b("miui.os.Build")) {
            return Constants.REFERRER_API_XIAOMI;
        }
        if (m43132b("lineageos.platform.Manifest") || m43132b("lineageos.platform.R")) {
            return "lineage";
        }
        if (m43134c("/system/framework/com.motorola.motosignature.jar")) {
            return "moto";
        }
        return (m43134c("/system/framework/transsion-framework.jar") || m43134c("/system/framework/transsion-services.jar")) ? "transsion" : "other";
    }
}
