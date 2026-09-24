package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.cellular.e */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7955e {
    /* JADX INFO: renamed from: a */
    public static AbstractC7954d m20390a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return new C7953c(context);
        }
        if (i >= 24) {
            return new C7957g(context);
        }
        return null;
    }
}
