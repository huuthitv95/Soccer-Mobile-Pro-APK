package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Ac */
/* JADX INFO: loaded from: classes6.dex */
public final class C11348Ac extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11348Ac(Exception e) {
        super("Missing Headers", e);
        Intrinsics.checkNotNullParameter(e, "e");
    }
}
