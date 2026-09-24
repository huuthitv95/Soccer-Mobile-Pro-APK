package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.f6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12190f6 {

    /* JADX INFO: renamed from: a */
    private final Map<String, List<String>> f30390a;

    /* JADX INFO: renamed from: b */
    private final int f30391b;

    /* JADX INFO: renamed from: c */
    private final boolean f30392c;

    /* JADX INFO: renamed from: d */
    private final long f30393d;

    /* JADX INFO: renamed from: e */
    private final List<C12251id> f30394e;

    /* JADX INFO: renamed from: f */
    private final C12413p f30395f;

    /* JADX INFO: renamed from: g */
    private final int f30396g;

    /* JADX INFO: renamed from: h */
    private final Integer f30397h;

    /* JADX WARN: Multi-variable type inference failed */
    public C12190f6(Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, List<C12251id> placements, C12413p auction, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        this.f30390a = providerOrder;
        this.f30391b = i;
        this.f30392c = z;
        this.f30393d = j;
        this.f30394e = placements;
        this.f30395f = auction;
        this.f30396g = i2;
        this.f30397h = num;
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, List<String>> m31435a() {
        return this.f30390a;
    }

    /* JADX INFO: renamed from: b */
    public final int m31436b() {
        return this.f30391b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m31437c() {
        return this.f30392c;
    }

    /* JADX INFO: renamed from: d */
    public final long m31438d() {
        return this.f30393d;
    }

    /* JADX INFO: renamed from: e */
    public final List<C12251id> m31439e() {
        return this.f30394e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12190f6)) {
            return false;
        }
        C12190f6 c12190f6 = (C12190f6) obj;
        return Intrinsics.areEqual(this.f30390a, c12190f6.f30390a) && this.f30391b == c12190f6.f30391b && this.f30392c == c12190f6.f30392c && this.f30393d == c12190f6.f30393d && Intrinsics.areEqual(this.f30394e, c12190f6.f30394e) && Intrinsics.areEqual(this.f30395f, c12190f6.f30395f) && this.f30396g == c12190f6.f30396g && Intrinsics.areEqual(this.f30397h, c12190f6.f30397h);
    }

    /* JADX INFO: renamed from: f */
    public final C12413p m31440f() {
        return this.f30395f;
    }

    /* JADX INFO: renamed from: g */
    public final int m31441g() {
        return this.f30396g;
    }

    /* JADX INFO: renamed from: h */
    public final Integer m31442h() {
        return this.f30397h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    public int hashCode() {
        int iHashCode = ((this.f30390a.hashCode() * 31) + this.f30391b) * 31;
        boolean z = this.f30392c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iM43485m = (((((((((iHashCode + r1) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f30393d)) * 31) + this.f30394e.hashCode()) * 31) + this.f30395f.hashCode()) * 31) + this.f30396g) * 31;
        Integer num = this.f30397h;
        return iM43485m + (num == null ? 0 : num.hashCode());
    }

    /* JADX INFO: renamed from: i */
    public final int m31443i() {
        return this.f30396g;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m31444j() {
        return this.f30392c;
    }

    /* JADX INFO: renamed from: k */
    public final C12413p m31445k() {
        return this.f30395f;
    }

    /* JADX INFO: renamed from: l */
    public final long m31446l() {
        return this.f30393d;
    }

    /* JADX INFO: renamed from: m */
    public final Integer m31447m() {
        return this.f30397h;
    }

    /* JADX INFO: renamed from: n */
    public final int m31448n() {
        return this.f30391b;
    }

    /* JADX INFO: renamed from: o */
    public final List<C12251id> m31449o() {
        return this.f30394e;
    }

    /* JADX INFO: renamed from: p */
    public final Map<String, List<String>> m31450p() {
        return this.f30390a;
    }

    public String toString() {
        return "FullscreenAdFormatConfig2(providerOrder=" + this.f30390a + ", parallelLoad=" + this.f30391b + ", advancedLoading=" + this.f30392c + ", collectBiddingDataTimeout=" + this.f30393d + ", placements=" + this.f30394e + ", auction=" + this.f30395f + ", adapterTimeoutSecs=" + this.f30396g + ", expiredDurationMins=" + this.f30397h + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C12190f6 m31434a(Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, List<C12251id> placements, C12413p auction, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        return new C12190f6(providerOrder, i, z, j, placements, auction, i2, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12190f6 m31433a(C12190f6 c12190f6, Map map, int i, boolean z, long j, List list, C12413p c12413p, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = c12190f6.f30390a;
        }
        if ((i3 & 2) != 0) {
            i = c12190f6.f30391b;
        }
        if ((i3 & 4) != 0) {
            z = c12190f6.f30392c;
        }
        if ((i3 & 8) != 0) {
            j = c12190f6.f30393d;
        }
        if ((i3 & 16) != 0) {
            list = c12190f6.f30394e;
        }
        if ((i3 & 32) != 0) {
            c12413p = c12190f6.f30395f;
        }
        if ((i3 & 64) != 0) {
            i2 = c12190f6.f30396g;
        }
        if ((i3 & 128) != 0) {
            num = c12190f6.f30397h;
        }
        long j2 = j;
        boolean z2 = z;
        return c12190f6.m31434a(map, i, z2, j2, list, c12413p, i2, num);
    }
}
