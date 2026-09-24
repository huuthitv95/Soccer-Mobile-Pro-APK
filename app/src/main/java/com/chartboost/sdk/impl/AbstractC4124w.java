package com.chartboost.sdk.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.w */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4124w {
    /* JADX INFO: renamed from: a */
    public static final void m19731a(C4004qb c4004qb, Function1 isSuccess, Function2 isError) {
        Intrinsics.checkNotNullParameter(c4004qb, "<this>");
        Intrinsics.checkNotNullParameter(isSuccess, "isSuccess");
        Intrinsics.checkNotNullParameter(isError, "isError");
        if (c4004qb.m19156b() == null) {
            isSuccess.invoke(c4004qb);
        } else {
            isError.invoke(c4004qb, c4004qb.m19156b());
        }
    }
}
