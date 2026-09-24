package com.chartboost.sdk.impl;

import kotlin.UByte$$ExternalSyntheticBackport0;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.nh */
/* JADX INFO: loaded from: classes3.dex */
public final class C3944nh {

    /* JADX INFO: renamed from: a */
    public final long f15523a;

    /* JADX INFO: renamed from: b */
    public final long f15524b;

    /* JADX INFO: renamed from: c */
    public final long f15525c;

    public C3944nh(long j, long j2, long j3) {
        this.f15523a = j;
        this.f15524b = j2;
        this.f15525c = j3;
    }

    /* JADX INFO: renamed from: a */
    public final long m18803a() {
        return this.f15523a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3944nh)) {
            return false;
        }
        C3944nh c3944nh = (C3944nh) obj;
        return this.f15523a == c3944nh.f15523a && this.f15524b == c3944nh.f15524b && this.f15525c == c3944nh.f15525c;
    }

    public int hashCode() {
        return (((UByte$$ExternalSyntheticBackport0.m43485m(this.f15523a) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f15524b)) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f15525c);
    }

    public String toString() {
        return "TimeSourceBodyFields(currentTimeMillis=" + this.f15523a + ", nanoTime=" + this.f15524b + ", uptimeMillis=" + this.f15525c + ")";
    }
}
