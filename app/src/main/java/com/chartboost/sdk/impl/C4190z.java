package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C4190z {

    /* JADX INFO: renamed from: a */
    public final AbstractC3628a0 f17077a;

    /* JADX INFO: renamed from: b */
    public final Integer f17078b;

    /* JADX INFO: renamed from: c */
    public final Integer f17079c;

    /* JADX INFO: renamed from: d */
    public final String f17080d;

    /* JADX INFO: renamed from: e */
    public final int f17081e;

    public C4190z(AbstractC3628a0 adType, Integer num, Integer num2, String str, int i) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f17077a = adType;
        this.f17078b = num;
        this.f17079c = num2;
        this.f17080d = str;
        this.f17081e = i;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC3628a0 m20084a() {
        return this.f17077a;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m20085b() {
        return this.f17078b;
    }

    /* JADX INFO: renamed from: c */
    public final int m20086c() {
        return this.f17081e;
    }

    /* JADX INFO: renamed from: d */
    public final String m20087d() {
        return this.f17080d;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m20088e() {
        return this.f17079c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4190z)) {
            return false;
        }
        C4190z c4190z = (C4190z) obj;
        return Intrinsics.areEqual(this.f17077a, c4190z.f17077a) && Intrinsics.areEqual(this.f17078b, c4190z.f17078b) && Intrinsics.areEqual(this.f17079c, c4190z.f17079c) && Intrinsics.areEqual(this.f17080d, c4190z.f17080d) && this.f17081e == c4190z.f17081e;
    }

    public int hashCode() {
        int iHashCode = this.f17077a.hashCode() * 31;
        Integer num = this.f17078b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f17079c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f17080d;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f17081e;
    }

    public String toString() {
        return "AdParameters(adType=" + this.f17077a + ", height=" + this.f17078b + ", width=" + this.f17079c + ", location=" + this.f17080d + ", impDepth=" + this.f17081e + ")";
    }
}
