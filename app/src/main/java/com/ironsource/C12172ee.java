package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ee */
/* JADX INFO: loaded from: classes6.dex */
public final class C12172ee extends IllegalArgumentException {

    /* JADX INFO: renamed from: a */
    private final IronSourceError f30315a;

    /* JADX INFO: renamed from: b */
    private final int f30316b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12172ee(IronSourceError error) {
        super(error.getErrorMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.f30315a = error;
        this.f30316b = error.getErrorCode();
    }

    /* JADX INFO: renamed from: a */
    public final IronSourceError m31375a() {
        return this.f30315a;
    }

    /* JADX INFO: renamed from: b */
    public final int m31376b() {
        return this.f30316b;
    }
}
