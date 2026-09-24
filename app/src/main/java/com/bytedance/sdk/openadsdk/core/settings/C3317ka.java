package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3317ka {

    /* JADX INFO: renamed from: ik */
    private static String f11577ik = null;

    /* JADX INFO: renamed from: ka */
    private static volatile int f11578ka = 0;

    /* JADX INFO: renamed from: lr */
    private static volatile String f11579lr = "";

    /* JADX INFO: renamed from: ri */
    private static volatile String f11580ri = "";

    /* JADX INFO: renamed from: ik */
    public static String m14782ik() {
        if (f11578ka != 0) {
            return f11579lr;
        }
        m14788ri();
        return f11579lr;
    }

    /* JADX INFO: renamed from: ka */
    public static String m14783ka() {
        if (TextUtils.isEmpty(f11577ik)) {
            f11577ik = C3299nr.m14642ri().getPackageManager().getInstallerPackageName(C3571ig.m16435di());
        }
        if (f11577ik == null) {
            f11577ik = "";
        }
        return f11577ik;
    }

    /* JADX INFO: renamed from: lr */
    public static String m14784lr() {
        if (f11578ka != 0) {
            return f11580ri;
        }
        m14788ri();
        return f11580ri;
    }

    /* JADX INFO: renamed from: ri */
    public static void m14788ri() {
        try {
            AppSet.getClient(C3299nr.m14642ri()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = C3317ka.f11580ri = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = C3317ka.f11579lr = appSetIdInfo.getId();
                    int unused3 = C3317ka.f11578ka = 1;
                }
            });
        } catch (Throwable unused) {
            f11578ka = 2;
        }
    }
}
