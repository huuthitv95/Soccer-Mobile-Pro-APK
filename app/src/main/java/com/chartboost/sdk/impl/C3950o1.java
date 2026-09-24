package com.chartboost.sdk.impl;

import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.o1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3950o1 {

    /* JADX INFO: renamed from: a */
    public final int f15617a;

    /* JADX INFO: renamed from: b */
    public final String f15618b;

    /* JADX INFO: renamed from: c */
    public String f15619c;

    /* JADX INFO: renamed from: d */
    public C3674c0 f15620d;

    /* JADX INFO: renamed from: e */
    public C3651b0 f15621e;

    /* JADX INFO: renamed from: f */
    public boolean f15622f;

    /* JADX INFO: renamed from: g */
    public boolean f15623g;

    public C3950o1(int i, String location, String str, C3674c0 c3674c0, C3651b0 c3651b0, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f15617a = i;
        this.f15618b = location;
        this.f15619c = str;
        this.f15620d = c3674c0;
        this.f15621e = c3651b0;
        this.f15622f = z;
        this.f15623g = z2;
    }

    public /* synthetic */ C3950o1(int i, String str, String str2, C3674c0 c3674c0, C3651b0 c3651b0, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? null : c3674c0, (i2 & 16) != 0 ? null : c3651b0, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2);
    }

    /* JADX INFO: renamed from: a */
    public final C3651b0 m18857a() {
        return this.f15621e;
    }

    /* JADX INFO: renamed from: a */
    public final void m18858a(C3651b0 c3651b0) {
        this.f15621e = c3651b0;
    }

    /* JADX INFO: renamed from: a */
    public final void m18859a(C3674c0 c3674c0) {
        this.f15620d = c3674c0;
    }

    /* JADX INFO: renamed from: a */
    public final void m18860a(String str) {
        this.f15619c = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m18861a(boolean z) {
        this.f15622f = z;
    }

    /* JADX INFO: renamed from: b */
    public final C3674c0 m18862b() {
        return this.f15620d;
    }

    /* JADX INFO: renamed from: b */
    public final void m18863b(boolean z) {
        this.f15623g = z;
    }

    /* JADX INFO: renamed from: c */
    public final String m18864c() {
        return this.f15619c;
    }

    /* JADX INFO: renamed from: d */
    public final String m18865d() {
        return this.f15618b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18866e() {
        return this.f15623g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3950o1)) {
            return false;
        }
        C3950o1 c3950o1 = (C3950o1) obj;
        return this.f15617a == c3950o1.f15617a && Intrinsics.areEqual(this.f15618b, c3950o1.f15618b) && Intrinsics.areEqual(this.f15619c, c3950o1.f15619c) && Intrinsics.areEqual(this.f15620d, c3950o1.f15620d) && Intrinsics.areEqual(this.f15621e, c3950o1.f15621e) && this.f15622f == c3950o1.f15622f && this.f15623g == c3950o1.f15623g;
    }

    public int hashCode() {
        int iHashCode = ((this.f15617a * 31) + this.f15618b.hashCode()) * 31;
        String str = this.f15619c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C3674c0 c3674c0 = this.f15620d;
        int iHashCode3 = (iHashCode2 + (c3674c0 == null ? 0 : c3674c0.hashCode())) * 31;
        C3651b0 c3651b0 = this.f15621e;
        return ((((iHashCode3 + (c3651b0 != null ? c3651b0.hashCode() : 0)) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f15622f)) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f15623g);
    }

    public String toString() {
        return "AppRequest(id=" + this.f15617a + ", location=" + this.f15618b + ", bidResponse=" + this.f15619c + ", bannerData=" + this.f15620d + ", adUnit=" + this.f15621e + ", isTrackedCache=" + this.f15622f + ", isTrackedShow=" + this.f15623g + ")";
    }
}
