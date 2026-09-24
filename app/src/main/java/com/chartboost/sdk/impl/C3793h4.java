package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.h4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3793h4 {

    /* JADX INFO: renamed from: a */
    public final String f14363a;

    /* JADX INFO: renamed from: b */
    public final String f14364b;

    /* JADX INFO: renamed from: c */
    public final String f14365c;

    /* JADX INFO: renamed from: d */
    public final String f14366d;

    /* JADX INFO: renamed from: e */
    public final String f14367e;

    /* JADX INFO: renamed from: f */
    public final Float f14368f;

    /* JADX INFO: renamed from: g */
    public final Float f14369g;

    /* JADX INFO: renamed from: h */
    public final EnumC3914ma f14370h;

    /* JADX INFO: renamed from: i */
    public final Boolean f14371i;

    public C3793h4(String location, String adId, String to, String cgn, String creative, Float f, Float f2, EnumC3914ma impressionMediaType, Boolean bool) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(cgn, "cgn");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(impressionMediaType, "impressionMediaType");
        this.f14363a = location;
        this.f14364b = adId;
        this.f14365c = to;
        this.f14366d = cgn;
        this.f14367e = creative;
        this.f14368f = f;
        this.f14369g = f2;
        this.f14370h = impressionMediaType;
        this.f14371i = bool;
    }

    /* JADX INFO: renamed from: a */
    public final String m17846a() {
        return this.f14364b;
    }

    /* JADX INFO: renamed from: b */
    public final String m17847b() {
        return this.f14366d;
    }

    /* JADX INFO: renamed from: c */
    public final String m17848c() {
        return this.f14367e;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC3914ma m17849d() {
        return this.f14370h;
    }

    /* JADX INFO: renamed from: e */
    public final String m17850e() {
        return this.f14363a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3793h4)) {
            return false;
        }
        C3793h4 c3793h4 = (C3793h4) obj;
        return Intrinsics.areEqual(this.f14363a, c3793h4.f14363a) && Intrinsics.areEqual(this.f14364b, c3793h4.f14364b) && Intrinsics.areEqual(this.f14365c, c3793h4.f14365c) && Intrinsics.areEqual(this.f14366d, c3793h4.f14366d) && Intrinsics.areEqual(this.f14367e, c3793h4.f14367e) && Intrinsics.areEqual((Object) this.f14368f, (Object) c3793h4.f14368f) && Intrinsics.areEqual((Object) this.f14369g, (Object) c3793h4.f14369g) && this.f14370h == c3793h4.f14370h && Intrinsics.areEqual(this.f14371i, c3793h4.f14371i);
    }

    /* JADX INFO: renamed from: f */
    public final Boolean m17851f() {
        return this.f14371i;
    }

    /* JADX INFO: renamed from: g */
    public final String m17852g() {
        return this.f14365c;
    }

    /* JADX INFO: renamed from: h */
    public final Float m17853h() {
        return this.f14369g;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f14363a.hashCode() * 31) + this.f14364b.hashCode()) * 31) + this.f14365c.hashCode()) * 31) + this.f14366d.hashCode()) * 31) + this.f14367e.hashCode()) * 31;
        Float f = this.f14368f;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f14369g;
        int iHashCode3 = (((iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31) + this.f14370h.hashCode()) * 31;
        Boolean bool = this.f14371i;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final Float m17854i() {
        return this.f14368f;
    }

    public String toString() {
        return "ClickParams(location=" + this.f14363a + ", adId=" + this.f14364b + ", to=" + this.f14365c + ", cgn=" + this.f14366d + ", creative=" + this.f14367e + ", videoPosition=" + this.f14368f + ", videoDuration=" + this.f14369g + ", impressionMediaType=" + this.f14370h + ", retargetReinstall=" + this.f14371i + ")";
    }
}
