package com.chartboost.sdk.impl;

import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.pb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3982pb {

    /* JADX INFO: renamed from: a */
    public final C3950o1 f15806a;

    /* JADX INFO: renamed from: b */
    public final boolean f15807b;

    /* JADX INFO: renamed from: c */
    public final Integer f15808c;

    /* JADX INFO: renamed from: d */
    public final Integer f15809d;

    /* JADX INFO: renamed from: e */
    public final C3789h0 f15810e;

    public C3982pb(C3950o1 appRequest, boolean z, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        this.f15806a = appRequest;
        this.f15807b = z;
        this.f15808c = num;
        this.f15809d = num2;
        this.f15810e = new C3789h0();
    }

    /* JADX INFO: renamed from: a */
    public final C3950o1 m19055a() {
        return this.f15806a;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m19056b() {
        return this.f15808c;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m19057c() {
        return this.f15809d;
    }

    /* JADX INFO: renamed from: d */
    public final C3789h0 m19058d() {
        return this.f15810e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m19059e() {
        return this.f15807b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3982pb)) {
            return false;
        }
        C3982pb c3982pb = (C3982pb) obj;
        return Intrinsics.areEqual(this.f15806a, c3982pb.f15806a) && this.f15807b == c3982pb.f15807b && Intrinsics.areEqual(this.f15808c, c3982pb.f15808c) && Intrinsics.areEqual(this.f15809d, c3982pb.f15809d);
    }

    public int hashCode() {
        int iHashCode = ((this.f15806a.hashCode() * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f15807b)) * 31;
        Integer num = this.f15808c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f15809d;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "LoadParams(appRequest=" + this.f15806a + ", isCacheRequest=" + this.f15807b + ", bannerHeight=" + this.f15808c + ", bannerWidth=" + this.f15809d + ")";
    }
}
