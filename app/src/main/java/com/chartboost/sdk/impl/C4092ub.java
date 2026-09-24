package com.chartboost.sdk.impl;

import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ub */
/* JADX INFO: loaded from: classes3.dex */
public final class C4092ub {

    /* JADX INFO: renamed from: a */
    public final long f16482a;

    /* JADX INFO: renamed from: b */
    public final int f16483b;

    /* JADX INFO: renamed from: c */
    public final Integer f16484c;

    /* JADX INFO: renamed from: d */
    public final Integer f16485d;

    /* JADX INFO: renamed from: e */
    public final Integer f16486e;

    /* JADX INFO: renamed from: f */
    public final String f16487f;

    /* JADX INFO: renamed from: g */
    public final String f16488g;

    public C4092ub(long j, int i, Integer num, Integer num2, Integer num3, String appBundle, String omidPartner) {
        Intrinsics.checkNotNullParameter(appBundle, "appBundle");
        Intrinsics.checkNotNullParameter(omidPartner, "omidPartner");
        this.f16482a = j;
        this.f16483b = i;
        this.f16484c = num;
        this.f16485d = num2;
        this.f16486e = num3;
        this.f16487f = appBundle;
        this.f16488g = omidPartner;
    }

    /* JADX INFO: renamed from: a */
    public final String m19580a() {
        return this.f16487f;
    }

    /* JADX INFO: renamed from: b */
    public final int m19581b() {
        return this.f16483b;
    }

    /* JADX INFO: renamed from: c */
    public final long m19582c() {
        return this.f16482a;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m19583d() {
        return this.f16484c;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m19584e() {
        return this.f16486e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4092ub)) {
            return false;
        }
        C4092ub c4092ub = (C4092ub) obj;
        return this.f16482a == c4092ub.f16482a && this.f16483b == c4092ub.f16483b && Intrinsics.areEqual(this.f16484c, c4092ub.f16484c) && Intrinsics.areEqual(this.f16485d, c4092ub.f16485d) && Intrinsics.areEqual(this.f16486e, c4092ub.f16486e) && Intrinsics.areEqual(this.f16487f, c4092ub.f16487f) && Intrinsics.areEqual(this.f16488g, c4092ub.f16488g);
    }

    /* JADX INFO: renamed from: f */
    public final String m19585f() {
        return this.f16488g;
    }

    /* JADX INFO: renamed from: g */
    public final Integer m19586g() {
        return this.f16485d;
    }

    public int hashCode() {
        int iM43485m = ((UByte$$ExternalSyntheticBackport0.m43485m(this.f16482a) * 31) + this.f16483b) * 31;
        Integer num = this.f16484c;
        int iHashCode = (iM43485m + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f16485d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f16486e;
        return ((((iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31) + this.f16487f.hashCode()) * 31) + this.f16488g.hashCode();
    }

    public String toString() {
        return "MacroContext(currentTimeMs=" + this.f16482a + ", cacheBusting=" + this.f16483b + ", errorCode=" + this.f16484c + ", reasonCode=" + this.f16485d + ", limitAdTracking=" + this.f16486e + ", appBundle=" + this.f16487f + ", omidPartner=" + this.f16488g + ")";
    }
}
