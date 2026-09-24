package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.p6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3977p6 {
    /* JADX INFO: renamed from: a */
    public static final int m19027a(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }
}
