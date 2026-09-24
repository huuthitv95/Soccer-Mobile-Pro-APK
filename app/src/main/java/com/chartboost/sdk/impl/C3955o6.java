package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.o6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3955o6 {

    /* JADX INFO: renamed from: a */
    public static final C3955o6 f15634a = new C3955o6();

    /* JADX INFO: renamed from: a */
    public final float m18878a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: a */
    public final int m18879a(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float fM18878a = m18878a(context);
        if (fM18878a == 0.0f) {
            return 0;
        }
        return MathKt.roundToInt(i / fM18878a);
    }
}
