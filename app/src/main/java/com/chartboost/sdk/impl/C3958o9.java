package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.o9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3958o9 {

    /* JADX INFO: renamed from: a */
    public final EnumC3922mi f15645a;

    /* JADX INFO: renamed from: b */
    public final String f15646b;

    /* JADX INFO: renamed from: c */
    public final String f15647c;

    /* JADX INFO: renamed from: d */
    public final String f15648d;

    /* JADX INFO: renamed from: e */
    public final String f15649e;

    /* JADX INFO: renamed from: f */
    public final Integer f15650f;

    /* JADX INFO: renamed from: g */
    public final String f15651g;

    public C3958o9(EnumC3922mi trackingState, String str, String str2, String str3, String str4, Integer num, String str5) {
        Intrinsics.checkNotNullParameter(trackingState, "trackingState");
        this.f15645a = trackingState;
        this.f15646b = str;
        this.f15647c = str2;
        this.f15648d = str3;
        this.f15649e = str4;
        this.f15650f = num;
        this.f15651g = str5;
    }

    public /* synthetic */ C3958o9(EnumC3922mi enumC3922mi, String str, String str2, String str3, String str4, Integer num, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC3922mi.TRACKING_UNKNOWN : enumC3922mi, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str5);
    }

    /* JADX INFO: renamed from: a */
    public final String m18894a() {
        return this.f15648d;
    }

    /* JADX INFO: renamed from: b */
    public final String m18895b() {
        return this.f15646b;
    }

    /* JADX INFO: renamed from: c */
    public final String m18896c() {
        return this.f15651g;
    }

    /* JADX INFO: renamed from: d */
    public final String m18897d() {
        return this.f15649e;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m18898e() {
        return this.f15650f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3958o9)) {
            return false;
        }
        C3958o9 c3958o9 = (C3958o9) obj;
        return this.f15645a == c3958o9.f15645a && Intrinsics.areEqual(this.f15646b, c3958o9.f15646b) && Intrinsics.areEqual(this.f15647c, c3958o9.f15647c) && Intrinsics.areEqual(this.f15648d, c3958o9.f15648d) && Intrinsics.areEqual(this.f15649e, c3958o9.f15649e) && Intrinsics.areEqual(this.f15650f, c3958o9.f15650f) && Intrinsics.areEqual(this.f15651g, c3958o9.f15651g);
    }

    /* JADX INFO: renamed from: f */
    public final EnumC3922mi m18899f() {
        return this.f15645a;
    }

    /* JADX INFO: renamed from: g */
    public final String m18900g() {
        return this.f15647c;
    }

    public int hashCode() {
        int iHashCode = this.f15645a.hashCode() * 31;
        String str = this.f15646b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15647c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15648d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f15649e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f15650f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f15651g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "IdentityBodyFields(trackingState=" + this.f15645a + ", identifiers=" + this.f15646b + ", uuid=" + this.f15647c + ", gaid=" + this.f15648d + ", setId=" + this.f15649e + ", setIdScope=" + this.f15650f + ", instanceId=" + this.f15651g + ")";
    }
}
