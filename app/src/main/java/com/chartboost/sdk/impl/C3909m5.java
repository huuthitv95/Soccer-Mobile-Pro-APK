package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.m5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3909m5 {

    /* JADX INFO: renamed from: a */
    public final String f15328a;

    /* JADX INFO: renamed from: b */
    public final C3989pi f15329b;

    public C3909m5(String str, C3989pi c3989pi) {
        this.f15328a = str;
        this.f15329b = c3989pi;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3909m5)) {
            return false;
        }
        C3909m5 c3909m5 = (C3909m5) obj;
        return Intrinsics.areEqual(this.f15328a, c3909m5.f15328a) && Intrinsics.areEqual(this.f15329b, c3909m5.f15329b);
    }

    public int hashCode() {
        String str = this.f15328a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C3989pi c3989pi = this.f15329b;
        return iHashCode + (c3989pi != null ? c3989pi.hashCode() : 0);
    }

    public String toString() {
        return "CreativeExtension(type=" + this.f15328a + ", universalAdId=" + this.f15329b + ")";
    }
}
