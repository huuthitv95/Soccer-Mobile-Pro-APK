package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Rc */
/* JADX INFO: loaded from: classes6.dex */
public final class C11651Rc {

    /* JADX INFO: renamed from: a */
    private final long f25580a;

    /* JADX INFO: renamed from: b */
    private final EnumC11465H3 f25581b;

    public C11651Rc(long j, EnumC11465H3 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f25580a = j;
        this.f25581b = unit;
    }

    /* JADX INFO: renamed from: a */
    public final long m27376a() {
        return this.f25580a;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC11465H3 m27377b() {
        return this.f25581b;
    }

    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.f25580a + " unit=" + this.f25581b + ")";
    }

    public /* synthetic */ C11651Rc(long j, EnumC11465H3 enumC11465H3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? EnumC11465H3.Second : enumC11465H3);
    }
}
