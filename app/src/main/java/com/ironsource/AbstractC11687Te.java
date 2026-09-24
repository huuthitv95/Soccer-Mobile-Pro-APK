package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Te */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11687Te {

    /* JADX INFO: renamed from: a */
    private final C11605P f25820a;

    public AbstractC11687Te(C11605P c11605p) {
        this.f25820a = c11605p;
    }

    /* JADX INFO: renamed from: a */
    public final C11605P m27534a() {
        return this.f25820a;
    }

    /* JADX INFO: renamed from: b */
    public abstract EnumC12101af mo27536b();

    /* JADX INFO: renamed from: a */
    public final C12574w m27535a(InterfaceC11437Fb<AbstractC11687Te, C12574w> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.mo25577a(this);
    }
}
