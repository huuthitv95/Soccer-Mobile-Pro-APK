package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.fr */
/* JADX INFO: loaded from: classes3.dex */
public class C2718fr {

    /* JADX INFO: renamed from: ri */
    private static volatile String f7762ri;

    /* JADX INFO: renamed from: ri */
    public static int m10223ri(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().icon;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static String m10224ri() {
        if (!TextUtils.isEmpty(f7762ri)) {
            return f7762ri;
        }
        String str = Build.MODEL;
        f7762ri = str;
        return str;
    }
}
