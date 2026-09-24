package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.jf */
/* JADX INFO: loaded from: classes3.dex */
public final class C3850jf {

    /* JADX INFO: renamed from: a */
    public final Integer f14963a;

    /* JADX INFO: renamed from: b */
    public final Integer f14964b;

    /* JADX INFO: renamed from: c */
    public final String f14965c;

    /* JADX INFO: renamed from: d */
    public final EnumC4050sd f14966d;

    public C3850jf(Integer num, Integer num2, String str, EnumC4050sd openRTBConnectionType) {
        Intrinsics.checkNotNullParameter(openRTBConnectionType, "openRTBConnectionType");
        this.f14963a = num;
        this.f14964b = num2;
        this.f14965c = str;
        this.f14966d = openRTBConnectionType;
    }

    /* JADX INFO: renamed from: a */
    public final Integer m18276a() {
        return this.f14963a;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m18277b() {
        return this.f14964b;
    }

    /* JADX INFO: renamed from: c */
    public final String m18278c() {
        return this.f14965c;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC4050sd m18279d() {
        return this.f14966d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3850jf)) {
            return false;
        }
        C3850jf c3850jf = (C3850jf) obj;
        return Intrinsics.areEqual(this.f14963a, c3850jf.f14963a) && Intrinsics.areEqual(this.f14964b, c3850jf.f14964b) && Intrinsics.areEqual(this.f14965c, c3850jf.f14965c) && this.f14966d == c3850jf.f14966d;
    }

    public int hashCode() {
        Integer num = this.f14963a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f14964b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f14965c;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f14966d.hashCode();
    }

    public String toString() {
        return "ReachabilityBodyFields(cellularConnectionType=" + this.f14963a + ", connectionTypeFromActiveNetwork=" + this.f14964b + ", detailedConnectionType=" + this.f14965c + ", openRTBConnectionType=" + this.f14966d + ")";
    }
}
