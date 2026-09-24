package com.bytedance.sdk.component.adexpress.p124ka;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ka.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2496lr {
    /* JADX INFO: renamed from: ri */
    public static boolean m8822ri(Context context) {
        return context != null && TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) == 1 && (context.getApplicationInfo().flags & 4194304) == 4194304;
    }
}
