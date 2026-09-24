package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ne */
/* JADX INFO: loaded from: classes3.dex */
public final class C3941ne {

    /* JADX INFO: renamed from: a */
    public static final C3941ne f15515a = new C3941ne();

    /* JADX INFO: renamed from: a */
    public final AbstractC3814i2 m18801a(Context context, C3976p5 ctaConfig, Function0 function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ctaConfig, "ctaConfig");
        AbstractC3814i2 c3810hl = ctaConfig.m19024b() != null ? new C3810hl(context, null, 0, null, function0, 14, null) : new C3894ld(context, null, 0, null, null, null, null, function0, 126, null);
        c3810hl.mo17936a(ctaConfig);
        return c3810hl;
    }
}
