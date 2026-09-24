package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.k6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3864k6 {

    /* JADX INFO: renamed from: a */
    public final Context f15030a;

    /* JADX INFO: renamed from: b */
    public final C4021r6 f15031b;

    public C3864k6(Context context, C4021r6 displayMeasurement) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        this.f15030a = context;
        this.f15031b = displayMeasurement;
    }

    /* JADX INFO: renamed from: a */
    public final int m18352a() {
        Integer numM18490b = AbstractC3887l6.m18490b(this.f15030a);
        Intrinsics.checkNotNullExpressionValue(numM18490b, "getOpenRTBDeviceType(...)");
        return numM18490b.intValue();
    }

    /* JADX INFO: renamed from: b */
    public final String m18353b() {
        String strM18492d = AbstractC3887l6.m18492d(this.f15030a);
        Intrinsics.checkNotNullExpressionValue(strM18492d, "getType(...)");
        return strM18492d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18354c() {
        return AbstractC3872ke.m18424c(this.f15030a, this.f15031b);
    }
}
