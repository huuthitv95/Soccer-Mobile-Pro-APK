package com.chartboost.sdk.impl;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.h2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3791h2 implements InterfaceC3806hh {

    /* JADX INFO: renamed from: a */
    public final String f14352a;

    public AbstractC3791h2() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f14352a = string;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3806hh
    /* JADX INFO: renamed from: a */
    public final String mo17828a() {
        return this.f14352a;
    }
}
