package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.gf */
/* JADX INFO: loaded from: classes6.dex */
public final class C12217gf {

    /* JADX INFO: renamed from: a */
    private final int f30444a;

    /* JADX INFO: renamed from: b */
    private final EnumC11465H3 f30445b;

    public C12217gf(int i, EnumC11465H3 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f30444a = i;
        this.f30445b = unit;
    }

    /* JADX INFO: renamed from: a */
    public final int m31564a() {
        return this.f30444a;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC11465H3 m31565b() {
        return this.f30445b;
    }

    public String toString() {
        return "ShowCountCappingConfig(maxImpressions=" + this.f30444a + ", unit=" + this.f30445b + ")";
    }
}
