package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.fj */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3762fj extends Exception {

    /* JADX INFO: renamed from: b */
    public final Integer f14257b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3762fj(String message, Integer num) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f14257b = num;
    }

    /* JADX INFO: renamed from: a */
    public final Integer m17745a() {
        return this.f14257b;
    }
}
