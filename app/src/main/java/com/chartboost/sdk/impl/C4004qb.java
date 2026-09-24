package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.qb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4004qb {

    /* JADX INFO: renamed from: a */
    public final C3950o1 f15909a;

    /* JADX INFO: renamed from: b */
    public final C3651b0 f15910b;

    /* JADX INFO: renamed from: c */
    public final CBError f15911c;

    /* JADX INFO: renamed from: d */
    public final long f15912d;

    /* JADX INFO: renamed from: e */
    public final long f15913e;

    public C4004qb(C3950o1 appRequest, C3651b0 c3651b0, CBError cBError, long j, long j2) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        this.f15909a = appRequest;
        this.f15910b = c3651b0;
        this.f15911c = cBError;
        this.f15912d = j;
        this.f15913e = j2;
    }

    public /* synthetic */ C4004qb(C3950o1 c3950o1, C3651b0 c3651b0, CBError cBError, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3950o1, (i & 2) != 0 ? null : c3651b0, (i & 4) != 0 ? null : cBError, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? 0L : j2);
    }

    /* JADX INFO: renamed from: a */
    public final C3651b0 m19155a() {
        return this.f15910b;
    }

    /* JADX INFO: renamed from: b */
    public final CBError m19156b() {
        return this.f15911c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4004qb)) {
            return false;
        }
        C4004qb c4004qb = (C4004qb) obj;
        return Intrinsics.areEqual(this.f15909a, c4004qb.f15909a) && Intrinsics.areEqual(this.f15910b, c4004qb.f15910b) && Intrinsics.areEqual(this.f15911c, c4004qb.f15911c) && this.f15912d == c4004qb.f15912d && this.f15913e == c4004qb.f15913e;
    }

    public int hashCode() {
        int iHashCode = this.f15909a.hashCode() * 31;
        C3651b0 c3651b0 = this.f15910b;
        int iHashCode2 = (iHashCode + (c3651b0 == null ? 0 : c3651b0.hashCode())) * 31;
        CBError cBError = this.f15911c;
        return ((((iHashCode2 + (cBError != null ? cBError.hashCode() : 0)) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f15912d)) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f15913e);
    }

    public String toString() {
        return "LoadResult(appRequest=" + this.f15909a + ", adUnit=" + this.f15910b + ", error=" + this.f15911c + ", requestResponseCodeNs=" + this.f15912d + ", readDataNs=" + this.f15913e + ")";
    }
}
