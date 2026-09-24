package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.A2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11338A2 {

    /* JADX INFO: renamed from: a */
    private final Map<String, List<String>> f23776a;

    /* JADX INFO: renamed from: b */
    private final int f23777b;

    /* JADX INFO: renamed from: c */
    private final boolean f23778c;

    /* JADX INFO: renamed from: d */
    private final long f23779d;

    /* JADX INFO: renamed from: e */
    private final List<C12251id> f23780e;

    /* JADX INFO: renamed from: f */
    private final C12413p f23781f;

    /* JADX INFO: renamed from: g */
    private final long f23782g;

    /* JADX INFO: renamed from: h */
    private final int f23783h;

    /* JADX INFO: renamed from: i */
    private final long f23784i;

    /* JADX WARN: Multi-variable type inference failed */
    public C11338A2(Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, List<C12251id> placements, C12413p auction, long j2, int i2, long j3) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        this.f23776a = providerOrder;
        this.f23777b = i;
        this.f23778c = z;
        this.f23779d = j;
        this.f23780e = placements;
        this.f23781f = auction;
        this.f23782g = j2;
        this.f23783h = i2;
        this.f23784i = j3;
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, List<String>> m25244a() {
        return this.f23776a;
    }

    /* JADX INFO: renamed from: b */
    public final int m25245b() {
        return this.f23777b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25246c() {
        return this.f23778c;
    }

    /* JADX INFO: renamed from: d */
    public final long m25247d() {
        return this.f23779d;
    }

    /* JADX INFO: renamed from: e */
    public final List<C12251id> m25248e() {
        return this.f23780e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11338A2)) {
            return false;
        }
        C11338A2 c11338a2 = (C11338A2) obj;
        return Intrinsics.areEqual(this.f23776a, c11338a2.f23776a) && this.f23777b == c11338a2.f23777b && this.f23778c == c11338a2.f23778c && this.f23779d == c11338a2.f23779d && Intrinsics.areEqual(this.f23780e, c11338a2.f23780e) && Intrinsics.areEqual(this.f23781f, c11338a2.f23781f) && this.f23782g == c11338a2.f23782g && this.f23783h == c11338a2.f23783h && this.f23784i == c11338a2.f23784i;
    }

    /* JADX INFO: renamed from: f */
    public final C12413p m25249f() {
        return this.f23781f;
    }

    /* JADX INFO: renamed from: g */
    public final long m25250g() {
        return this.f23782g;
    }

    /* JADX INFO: renamed from: h */
    public final int m25251h() {
        return this.f23783h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    public int hashCode() {
        int iHashCode = ((this.f23776a.hashCode() * 31) + this.f23777b) * 31;
        boolean z = this.f23778c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((iHashCode + r1) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f23779d)) * 31) + this.f23780e.hashCode()) * 31) + this.f23781f.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f23782g)) * 31) + this.f23783h) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f23784i);
    }

    /* JADX INFO: renamed from: i */
    public final long m25252i() {
        return this.f23784i;
    }

    /* JADX INFO: renamed from: j */
    public final long m25253j() {
        return this.f23782g;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m25254k() {
        return this.f23778c;
    }

    /* JADX INFO: renamed from: l */
    public final C12413p m25255l() {
        return this.f23781f;
    }

    /* JADX INFO: renamed from: m */
    public final int m25256m() {
        return this.f23783h;
    }

    /* JADX INFO: renamed from: n */
    public final long m25257n() {
        return this.f23779d;
    }

    /* JADX INFO: renamed from: o */
    public final long m25258o() {
        return this.f23784i;
    }

    /* JADX INFO: renamed from: p */
    public final int m25259p() {
        return this.f23777b;
    }

    /* JADX INFO: renamed from: q */
    public final List<C12251id> m25260q() {
        return this.f23780e;
    }

    /* JADX INFO: renamed from: r */
    public final Map<String, List<String>> m25261r() {
        return this.f23776a;
    }

    public String toString() {
        return "BannerAdFormatConfig2(providerOrder=" + this.f23776a + ", parallelLoad=" + this.f23777b + ", advancedLoading=" + this.f23778c + ", collectBiddingDataTimeout=" + this.f23779d + ", placements=" + this.f23780e + ", auction=" + this.f23781f + ", adapterTimeoutMillis=" + this.f23782g + ", bannerInterval=" + this.f23783h + ", impressionTimeout=" + this.f23784i + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C11338A2 m25243a(Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, List<C12251id> placements, C12413p auction, long j2, int i2, long j3) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        return new C11338A2(providerOrder, i, z, j, placements, auction, j2, i2, j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11338A2 m25242a(C11338A2 c11338a2, Map map, int i, boolean z, long j, List list, C12413p c12413p, long j2, int i2, long j3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = c11338a2.f23776a;
        }
        if ((i3 & 2) != 0) {
            i = c11338a2.f23777b;
        }
        if ((i3 & 4) != 0) {
            z = c11338a2.f23778c;
        }
        if ((i3 & 8) != 0) {
            j = c11338a2.f23779d;
        }
        if ((i3 & 16) != 0) {
            list = c11338a2.f23780e;
        }
        if ((i3 & 32) != 0) {
            c12413p = c11338a2.f23781f;
        }
        if ((i3 & 64) != 0) {
            j2 = c11338a2.f23782g;
        }
        if ((i3 & 128) != 0) {
            i2 = c11338a2.f23783h;
        }
        if ((i3 & 256) != 0) {
            j3 = c11338a2.f23784i;
        }
        int i4 = i2;
        long j4 = j2;
        List list2 = list;
        long j5 = j;
        boolean z2 = z;
        return c11338a2.m25243a(map, i, z2, j5, list2, c12413p, j4, i4, j3);
    }
}
