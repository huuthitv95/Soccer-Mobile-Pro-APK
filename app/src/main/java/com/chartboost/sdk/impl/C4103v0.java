package com.chartboost.sdk.impl;

import kotlin.UByte$$ExternalSyntheticBackport0;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.v0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4103v0 {

    /* JADX INFO: renamed from: a */
    public final double f16516a;

    /* JADX INFO: renamed from: b */
    public final double f16517b;

    public C4103v0(double d, double d2) {
        this.f16516a = d;
        this.f16517b = d2;
    }

    /* JADX INFO: renamed from: a */
    public final double m19619a() {
        return this.f16517b;
    }

    /* JADX INFO: renamed from: b */
    public final double m19620b() {
        return this.f16516a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4103v0)) {
            return false;
        }
        C4103v0 c4103v0 = (C4103v0) obj;
        return Double.compare(this.f16516a, c4103v0.f16516a) == 0 && Double.compare(this.f16517b, c4103v0.f16517b) == 0;
    }

    public int hashCode() {
        return (UByte$$ExternalSyntheticBackport0.m43483m(this.f16516a) * 31) + UByte$$ExternalSyntheticBackport0.m43483m(this.f16517b);
    }

    public String toString() {
        return "DoubleSize(width=" + this.f16516a + ", height=" + this.f16517b + ")";
    }
}
