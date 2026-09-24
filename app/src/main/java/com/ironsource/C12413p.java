package com.ironsource;

import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C12413p {

    /* JADX INFO: renamed from: a */
    private final String f31657a;

    /* JADX INFO: renamed from: b */
    private final String f31658b;

    /* JADX INFO: renamed from: c */
    private final String f31659c;

    /* JADX INFO: renamed from: d */
    private final int f31660d;

    /* JADX INFO: renamed from: e */
    private final long f31661e;

    /* JADX INFO: renamed from: f */
    private final int f31662f;

    /* JADX INFO: renamed from: g */
    private final boolean f31663g;

    /* JADX INFO: renamed from: h */
    private final boolean f31664h;

    /* JADX INFO: renamed from: i */
    private final int f31665i;

    /* JADX INFO: renamed from: j */
    private final boolean f31666j;

    /* JADX INFO: renamed from: k */
    private final boolean f31667k;

    public C12413p(String auctionData, String auctioneerURL, String extAuctioneerURL, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(auctioneerURL, "auctioneerURL");
        Intrinsics.checkNotNullParameter(extAuctioneerURL, "extAuctioneerURL");
        this.f31657a = auctionData;
        this.f31658b = auctioneerURL;
        this.f31659c = extAuctioneerURL;
        this.f31660d = i;
        this.f31661e = j;
        this.f31662f = i2;
        this.f31663g = z;
        this.f31664h = z2;
        this.f31665i = i3;
        this.f31666j = z3;
        this.f31667k = z4;
    }

    /* JADX INFO: renamed from: a */
    public final String m33011a() {
        return this.f31657a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33012b() {
        return this.f31666j;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m33013c() {
        return this.f31667k;
    }

    /* JADX INFO: renamed from: d */
    public final String m33014d() {
        return this.f31658b;
    }

    /* JADX INFO: renamed from: e */
    public final String m33015e() {
        return this.f31659c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12413p)) {
            return false;
        }
        C12413p c12413p = (C12413p) obj;
        return Intrinsics.areEqual(this.f31657a, c12413p.f31657a) && Intrinsics.areEqual(this.f31658b, c12413p.f31658b) && Intrinsics.areEqual(this.f31659c, c12413p.f31659c) && this.f31660d == c12413p.f31660d && this.f31661e == c12413p.f31661e && this.f31662f == c12413p.f31662f && this.f31663g == c12413p.f31663g && this.f31664h == c12413p.f31664h && this.f31665i == c12413p.f31665i && this.f31666j == c12413p.f31666j && this.f31667k == c12413p.f31667k;
    }

    /* JADX INFO: renamed from: f */
    public final int m33016f() {
        return this.f31660d;
    }

    /* JADX INFO: renamed from: g */
    public final long m33017g() {
        return this.f31661e;
    }

    /* JADX INFO: renamed from: h */
    public final int m33018h() {
        return this.f31662f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((this.f31657a.hashCode() * 31) + this.f31658b.hashCode()) * 31) + this.f31659c.hashCode()) * 31) + this.f31660d) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f31661e)) * 31) + this.f31662f) * 31;
        boolean z = this.f31663g;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.f31664h;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (((i + r2) * 31) + this.f31665i) * 31;
        boolean z3 = this.f31666j;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.f31667k;
        return i3 + (z4 ? 1 : z4);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m33019i() {
        return this.f31663g;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m33020j() {
        return this.f31664h;
    }

    /* JADX INFO: renamed from: k */
    public final int m33021k() {
        return this.f31665i;
    }

    /* JADX INFO: renamed from: l */
    public final String m33022l() {
        return this.f31657a;
    }

    /* JADX INFO: renamed from: m */
    public final int m33023m() {
        return this.f31662f;
    }

    /* JADX INFO: renamed from: n */
    public final long m33024n() {
        return this.f31661e;
    }

    /* JADX INFO: renamed from: o */
    public final int m33025o() {
        return this.f31660d;
    }

    /* JADX INFO: renamed from: p */
    public final String m33026p() {
        return this.f31658b;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m33027q() {
        return this.f31663g;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m33028r() {
        return this.f31664h;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m33029s() {
        return this.f31667k;
    }

    /* JADX INFO: renamed from: t */
    public final int m33030t() {
        return this.f31665i;
    }

    public String toString() {
        return "AdFormatAuctionConfig2(auctionData=" + this.f31657a + ", auctioneerURL=" + this.f31658b + ", extAuctioneerURL=" + this.f31659c + ", auctionTrials=" + this.f31660d + ", auctionTimeout=" + this.f31661e + ", auctionSavedHistoryLimit=" + this.f31662f + ", compressAuctionRequest=" + this.f31663g + ", compressAuctionResponse=" + this.f31664h + ", encryptionVersion=" + this.f31665i + ", tokenPerAdapter=" + this.f31666j + ", enableAuctionFallback=" + this.f31667k + ")";
    }

    /* JADX INFO: renamed from: u */
    public final String m33031u() {
        return this.f31659c;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m33032v() {
        return this.f31666j;
    }

    /* JADX INFO: renamed from: a */
    public final C12413p m33010a(String auctionData, String auctioneerURL, String extAuctioneerURL, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(auctioneerURL, "auctioneerURL");
        Intrinsics.checkNotNullParameter(extAuctioneerURL, "extAuctioneerURL");
        return new C12413p(auctionData, auctioneerURL, extAuctioneerURL, i, j, i2, z, z2, i3, z3, z4);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12413p m33009a(C12413p c12413p, String str, String str2, String str3, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = c12413p.f31657a;
        }
        if ((i4 & 2) != 0) {
            str2 = c12413p.f31658b;
        }
        if ((i4 & 4) != 0) {
            str3 = c12413p.f31659c;
        }
        if ((i4 & 8) != 0) {
            i = c12413p.f31660d;
        }
        if ((i4 & 16) != 0) {
            j = c12413p.f31661e;
        }
        if ((i4 & 32) != 0) {
            i2 = c12413p.f31662f;
        }
        if ((i4 & 64) != 0) {
            z = c12413p.f31663g;
        }
        if ((i4 & 128) != 0) {
            z2 = c12413p.f31664h;
        }
        if ((i4 & 256) != 0) {
            i3 = c12413p.f31665i;
        }
        if ((i4 & 512) != 0) {
            z3 = c12413p.f31666j;
        }
        if ((i4 & 1024) != 0) {
            z4 = c12413p.f31667k;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        long j2 = j;
        String str4 = str3;
        int i5 = i;
        return c12413p.m33010a(str, str2, str4, i5, j2, i2, z, z2, i3, z5, z6);
    }
}
