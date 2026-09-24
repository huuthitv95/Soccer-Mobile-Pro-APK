package com.ironsource;

import kotlin.UByte$$ExternalSyntheticBackport0;

/* JADX INFO: renamed from: com.ironsource.Aa */
/* JADX INFO: loaded from: classes6.dex */
public final class C11346Aa {

    /* JADX INFO: renamed from: a */
    private final long f23845a;

    /* JADX INFO: renamed from: b */
    private final long f23846b;

    /* JADX INFO: renamed from: c */
    private final boolean f23847c;

    public C11346Aa(long j, long j2, boolean z) {
        this.f23845a = j;
        this.f23846b = j2;
        this.f23847c = z;
    }

    /* JADX INFO: renamed from: a */
    public final long m25296a() {
        return this.f23845a;
    }

    /* JADX INFO: renamed from: b */
    public final long m25298b() {
        return this.f23846b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25299c() {
        return this.f23847c;
    }

    /* JADX INFO: renamed from: d */
    public final long m25300d() {
        return this.f23845a;
    }

    /* JADX INFO: renamed from: e */
    public final long m25301e() {
        return this.f23846b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11346Aa)) {
            return false;
        }
        C11346Aa c11346Aa = (C11346Aa) obj;
        return this.f23845a == c11346Aa.f23845a && this.f23846b == c11346Aa.f23846b && this.f23847c == c11346Aa.f23847c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m25302f() {
        return this.f23847c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iM43485m = ((UByte$$ExternalSyntheticBackport0.m43485m(this.f23845a) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f23846b)) * 31;
        boolean z = this.f23847c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iM43485m + r1;
    }

    public String toString() {
        return "LevelPlayBannerReloadAdUnitStrategyConfig(refreshInterval=" + this.f23845a + ", visibilityCheckerInterval=" + this.f23846b + ", isAutoRefreshEnabled=" + this.f23847c + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C11346Aa m25297a(long j, long j2, boolean z) {
        return new C11346Aa(j, j2, z);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11346Aa m25295a(C11346Aa c11346Aa, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c11346Aa.f23845a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = c11346Aa.f23846b;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            z = c11346Aa.f23847c;
        }
        return c11346Aa.m25297a(j3, j4, z);
    }
}
