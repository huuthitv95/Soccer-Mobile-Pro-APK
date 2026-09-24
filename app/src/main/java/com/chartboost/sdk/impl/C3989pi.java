package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.pi */
/* JADX INFO: loaded from: classes3.dex */
public final class C3989pi {

    /* JADX INFO: renamed from: a */
    public final String f15836a;

    /* JADX INFO: renamed from: b */
    public final String f15837b;

    public C3989pi(String str, String str2) {
        this.f15836a = str;
        this.f15837b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3989pi)) {
            return false;
        }
        C3989pi c3989pi = (C3989pi) obj;
        return Intrinsics.areEqual(this.f15836a, c3989pi.f15836a) && Intrinsics.areEqual(this.f15837b, c3989pi.f15837b);
    }

    public int hashCode() {
        String str = this.f15836a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f15837b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "UniversalAdId(idRegistry=" + this.f15836a + ", value=" + this.f15837b + ")";
    }
}
