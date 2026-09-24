package com.ironsource;

import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.yb */
/* JADX INFO: loaded from: classes6.dex */
public final class C12622yb {

    /* JADX INFO: renamed from: a */
    private final EnumC12322m9 f33229a;

    /* JADX INFO: renamed from: b */
    private final String f33230b;

    /* JADX INFO: renamed from: c */
    private final long f33231c;

    /* JADX INFO: renamed from: d */
    private final boolean f33232d;

    /* JADX INFO: renamed from: e */
    private final boolean f33233e;

    public C12622yb(EnumC12322m9 instanceType, String adSourceNameForEvents, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        this.f33229a = instanceType;
        this.f33230b = adSourceNameForEvents;
        this.f33231c = j;
        this.f33232d = z;
        this.f33233e = z2;
    }

    /* JADX INFO: renamed from: a */
    public final EnumC12322m9 m34224a() {
        return this.f33229a;
    }

    /* JADX INFO: renamed from: b */
    public final String m34226b() {
        return this.f33230b;
    }

    /* JADX INFO: renamed from: c */
    public final long m34227c() {
        return this.f33231c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m34228d() {
        return this.f33232d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m34229e() {
        return this.f33233e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12622yb)) {
            return false;
        }
        C12622yb c12622yb = (C12622yb) obj;
        return this.f33229a == c12622yb.f33229a && Intrinsics.areEqual(this.f33230b, c12622yb.f33230b) && this.f33231c == c12622yb.f33231c && this.f33232d == c12622yb.f33232d && this.f33233e == c12622yb.f33233e;
    }

    /* JADX INFO: renamed from: f */
    public final String m34230f() {
        return this.f33230b;
    }

    /* JADX INFO: renamed from: g */
    public final EnumC12322m9 m34231g() {
        return this.f33229a;
    }

    /* JADX INFO: renamed from: h */
    public final long m34232h() {
        return this.f33231c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.f33229a.hashCode() * 31) + this.f33230b.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f33231c)) * 31;
        boolean z = this.f33232d;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.f33233e;
        return i + (z2 ? 1 : z2);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m34233i() {
        return this.f33233e;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m34234j() {
        return this.f33232d;
    }

    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.f33229a + ", adSourceNameForEvents=" + this.f33230b + ", loadTimeoutInMills=" + this.f33231c + ", isOneFlow=" + this.f33232d + ", isMultipleAdObjects=" + this.f33233e + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C12622yb m34225a(EnumC12322m9 instanceType, String adSourceNameForEvents, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        return new C12622yb(instanceType, adSourceNameForEvents, j, z, z2);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12622yb m34223a(C12622yb c12622yb, EnumC12322m9 enumC12322m9, String str, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC12322m9 = c12622yb.f33229a;
        }
        if ((i & 2) != 0) {
            str = c12622yb.f33230b;
        }
        if ((i & 4) != 0) {
            j = c12622yb.f33231c;
        }
        if ((i & 8) != 0) {
            z = c12622yb.f33232d;
        }
        if ((i & 16) != 0) {
            z2 = c12622yb.f33233e;
        }
        long j2 = j;
        return c12622yb.m34225a(enumC12322m9, str, j2, z, z2);
    }

    public /* synthetic */ C12622yb(EnumC12322m9 enumC12322m9, String str, long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC12322m9, str, j, z, (i & 16) != 0 ? true : z2);
    }
}
