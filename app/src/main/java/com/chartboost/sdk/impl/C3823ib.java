package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ib */
/* JADX INFO: loaded from: classes3.dex */
public final class C3823ib extends AbstractC3762fj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3823ib(String message, Integer num) {
        super(message, num);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public /* synthetic */ C3823ib(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 100 : num);
    }
}
