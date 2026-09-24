package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.l3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3884l3 {

    /* JADX INFO: renamed from: a */
    public final String f15191a;

    /* JADX INFO: renamed from: b */
    public final Boolean f15192b;

    public C3884l3(String url, Boolean bool) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f15191a = url;
        this.f15192b = bool;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m18482a() {
        return this.f15192b;
    }

    /* JADX INFO: renamed from: b */
    public final String m18483b() {
        return this.f15191a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3884l3)) {
            return false;
        }
        C3884l3 c3884l3 = (C3884l3) obj;
        return Intrinsics.areEqual(this.f15191a, c3884l3.f15191a) && Intrinsics.areEqual(this.f15192b, c3884l3.f15192b);
    }

    public int hashCode() {
        int iHashCode = this.f15191a.hashCode() * 31;
        Boolean bool = this.f15192b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "CBUrl(url=" + this.f15191a + ", shouldDismiss=" + this.f15192b + ")";
    }
}
