package com.ironsource.mediationsdk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.b */
/* JADX INFO: loaded from: classes6.dex */
final class C12331b {

    /* JADX INFO: renamed from: a */
    private final C12368q.d f31017a;

    /* JADX INFO: renamed from: b */
    private final boolean f31018b;

    /* JADX INFO: renamed from: c */
    private final boolean f31019c;

    /* JADX INFO: renamed from: d */
    private final boolean f31020d;

    public C12331b(C12368q.d sdkState, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(sdkState, "sdkState");
        this.f31017a = sdkState;
        this.f31018b = z;
        this.f31019c = z2;
        this.f31020d = z3;
    }

    /* JADX INFO: renamed from: a */
    public final C12368q.d m32270a() {
        return this.f31017a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m32271b() {
        return this.f31018b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m32272c() {
        return this.f31019c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m32273d() {
        return this.f31020d;
    }

    /* JADX INFO: renamed from: e */
    public final C12368q.d m32274e() {
        return this.f31017a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12331b)) {
            return false;
        }
        C12331b c12331b = (C12331b) obj;
        return this.f31017a == c12331b.f31017a && this.f31018b == c12331b.f31018b && this.f31019c == c12331b.f31019c && this.f31020d == c12331b.f31020d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m32275f() {
        return this.f31020d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m32276g() {
        return this.f31019c;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m32277h() {
        return this.f31018b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.f31017a.hashCode() * 31;
        boolean z = this.f31018b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.f31019c;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.f31020d;
        return i2 + (z3 ? 1 : z3);
    }

    public String toString() {
        return "AdUnitInitStateInfo(sdkState=" + this.f31017a + ", isRetryForMoreThan15Secs=" + this.f31018b + ", isDemandOnlyInitRequested=" + this.f31019c + ", isAdUnitInitRequested=" + this.f31020d + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C12331b m32269a(C12368q.d sdkState, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(sdkState, "sdkState");
        return new C12331b(sdkState, z, z2, z3);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12331b m32268a(C12331b c12331b, C12368q.d dVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = c12331b.f31017a;
        }
        if ((i & 2) != 0) {
            z = c12331b.f31018b;
        }
        if ((i & 4) != 0) {
            z2 = c12331b.f31019c;
        }
        if ((i & 8) != 0) {
            z3 = c12331b.f31020d;
        }
        return c12331b.m32269a(dVar, z, z2, z3);
    }
}
