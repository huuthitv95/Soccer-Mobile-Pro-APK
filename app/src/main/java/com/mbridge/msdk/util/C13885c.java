package com.mbridge.msdk.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailability;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.util.c */
/* JADX INFO: compiled from: CronetEnvironmentCheckUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13885c {

    /* JADX INFO: renamed from: a */
    private static boolean f39662a = false;

    /* JADX INFO: renamed from: b */
    public static String f39663b = "";

    /* JADX INFO: renamed from: a */
    public static void m41423a() {
        if (m41425c()) {
            try {
                Class.forName("com.google.android.gms.common.GoogleApiAvailability");
                GoogleApiAvailability.getInstance().getApkVersion(C13008c.m36588n().m36542d());
                GoogleApiAvailability.getInstance().verifyGooglePlayServicesIsAvailable(C13008c.m36588n().m36542d(), 11925000);
                try {
                    String strM41424b = m41424b();
                    boolean zIsEmpty = TextUtils.isEmpty(strM41424b);
                    f39662a = !zIsEmpty;
                    if (zIsEmpty) {
                        return;
                    }
                    f39663b = strM41424b;
                } catch (Throwable th) {
                    C13219q0.m37816b("CronetEnvCheckUtil", th.getMessage());
                }
            } catch (Throwable th2) {
                C13219q0.m37816b("CronetEnvCheckUtil", th2.getMessage());
                f39662a = false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m41424b() {
        ArrayList<Pair> arrayList = new ArrayList();
        arrayList.add(Pair.create(1, "org.chromium.net.impl.JavaCronetProvider"));
        arrayList.add(Pair.create(2, "org.chromium.net.impl.NativeCronetProvider"));
        arrayList.add(Pair.create(3, "com.google.android.gms.net.PlayServicesCronetProvider"));
        arrayList.add(Pair.create(4, "com.google.android.gms.net.GmsCoreCronetProvider"));
        try {
            StringBuilder sb = new StringBuilder();
            ClassLoader classLoader = C13008c.m36588n().m36542d().getClassLoader();
            for (Pair pair : arrayList) {
                try {
                    if (!TextUtils.isEmpty(classLoader.loadClass((String) pair.second).getConstructor(Context.class).newInstance(C13008c.m36588n().m36542d()).getClass().getName())) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(pair.first);
                    }
                } catch (Throwable th) {
                    C13219q0.m37816b("CronetEnvCheckUtil", th.getMessage());
                }
            }
            return sb.toString();
        } catch (Throwable th2) {
            C13219q0.m37816b("CronetEnvCheckUtil", th2.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m41425c() {
        return C13223s0.m37831a().m37842a("cronet_env_check", false);
    }
}
