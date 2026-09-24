package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.cg */
/* JADX INFO: loaded from: classes6.dex */
public final class C12138cg {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12400o4 f30189a;

    public C12138cg(InterfaceC12400o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f30189a = currentTimeProvider;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m31277a(long j, long j2) {
        long jMo32926a = this.f30189a.mo32926a();
        return j2 <= 0 || j <= 0 || jMo32926a < j || jMo32926a - j > j2;
    }
}
