package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Tc */
/* JADX INFO: loaded from: classes6.dex */
public final class C11685Tc {

    /* JADX INFO: renamed from: a */
    private final Boolean f25815a;

    /* JADX INFO: renamed from: b */
    private final Integer f25816b;

    /* JADX WARN: Multi-variable type inference failed */
    public C11685Tc() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m27529a() {
        return this.f25815a;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m27530b() {
        return this.f25816b;
    }

    /* JADX INFO: renamed from: c */
    public final Boolean m27531c() {
        return this.f25815a;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m27532d() {
        return this.f25816b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11685Tc)) {
            return false;
        }
        C11685Tc c11685Tc = (C11685Tc) obj;
        return Intrinsics.areEqual(this.f25815a, c11685Tc.f25815a) && Intrinsics.areEqual(this.f25816b, c11685Tc.f25816b);
    }

    public int hashCode() {
        Boolean bool = this.f25815a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f25816b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "PacingConfig2(enabled=" + this.f25815a + ", minTimeBetweenShowsSeconds=" + this.f25816b + ")";
    }

    public C11685Tc(Boolean bool, Integer num) {
        this.f25815a = bool;
        this.f25816b = num;
    }

    /* JADX INFO: renamed from: a */
    public final C11685Tc m27528a(Boolean bool, Integer num) {
        return new C11685Tc(bool, num);
    }

    public /* synthetic */ C11685Tc(Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11685Tc m27527a(C11685Tc c11685Tc, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = c11685Tc.f25815a;
        }
        if ((i & 2) != 0) {
            num = c11685Tc.f25816b;
        }
        return c11685Tc.m27528a(bool, num);
    }
}
