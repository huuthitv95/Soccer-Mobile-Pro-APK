package com.bytedance.sdk.openadsdk.bgr;

import android.app.Activity;
import android.os.Build;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.bgr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2900lr {
    /* JADX INFO: renamed from: ri */
    public static void m11162ri(Activity activity) {
        if (activity == null || Build.VERSION.SDK_INT == 26) {
            return;
        }
        try {
            if (activity.getRequestedOrientation() == 1) {
                return;
            }
            activity.setRequestedOrientation(1);
        } catch (Throwable unused) {
        }
    }
}
