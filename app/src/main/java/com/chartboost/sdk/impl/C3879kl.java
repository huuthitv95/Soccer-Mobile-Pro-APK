package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.kl */
/* JADX INFO: loaded from: classes3.dex */
public final class C3879kl {

    /* JADX INFO: renamed from: a */
    public final String f15148a;

    /* JADX INFO: renamed from: b */
    public final String f15149b;

    /* JADX INFO: renamed from: c */
    public final List f15150c;

    /* JADX INFO: renamed from: d */
    public final List f15151d;

    /* JADX INFO: renamed from: e */
    public final List f15152e;

    /* JADX INFO: renamed from: f */
    public final String f15153f;

    /* JADX INFO: renamed from: g */
    public final List f15154g;

    /* JADX INFO: renamed from: h */
    public final List f15155h;

    public C3879kl(String str, String str2, List impressions, List creatives, List extensions, String vastAdTagURI, List adVerifications, List viewableImpressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(vastAdTagURI, "vastAdTagURI");
        Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
        Intrinsics.checkNotNullParameter(viewableImpressions, "viewableImpressions");
        this.f15148a = str;
        this.f15149b = str2;
        this.f15150c = impressions;
        this.f15151d = creatives;
        this.f15152e = extensions;
        this.f15153f = vastAdTagURI;
        this.f15154g = adVerifications;
        this.f15155h = viewableImpressions;
    }

    /* JADX INFO: renamed from: a */
    public final List m18454a() {
        return this.f15154g;
    }

    /* JADX INFO: renamed from: b */
    public final List m18455b() {
        return this.f15151d;
    }

    /* JADX INFO: renamed from: c */
    public final String m18456c() {
        return this.f15149b;
    }

    /* JADX INFO: renamed from: d */
    public final List m18457d() {
        return this.f15152e;
    }

    /* JADX INFO: renamed from: e */
    public final List m18458e() {
        return this.f15150c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3879kl)) {
            return false;
        }
        C3879kl c3879kl = (C3879kl) obj;
        return Intrinsics.areEqual(this.f15148a, c3879kl.f15148a) && Intrinsics.areEqual(this.f15149b, c3879kl.f15149b) && Intrinsics.areEqual(this.f15150c, c3879kl.f15150c) && Intrinsics.areEqual(this.f15151d, c3879kl.f15151d) && Intrinsics.areEqual(this.f15152e, c3879kl.f15152e) && Intrinsics.areEqual(this.f15153f, c3879kl.f15153f) && Intrinsics.areEqual(this.f15154g, c3879kl.f15154g) && Intrinsics.areEqual(this.f15155h, c3879kl.f15155h);
    }

    /* JADX INFO: renamed from: f */
    public final String m18459f() {
        return this.f15153f;
    }

    /* JADX INFO: renamed from: g */
    public final List m18460g() {
        return this.f15155h;
    }

    public int hashCode() {
        String str = this.f15148a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f15149b;
        return ((((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f15150c.hashCode()) * 31) + this.f15151d.hashCode()) * 31) + this.f15152e.hashCode()) * 31) + this.f15153f.hashCode()) * 31) + this.f15154g.hashCode()) * 31) + this.f15155h.hashCode();
    }

    public String toString() {
        return "Wrapper(adSystem=" + this.f15148a + ", error=" + this.f15149b + ", impressions=" + this.f15150c + ", creatives=" + this.f15151d + ", extensions=" + this.f15152e + ", vastAdTagURI=" + this.f15153f + ", adVerifications=" + this.f15154g + ", viewableImpressions=" + this.f15155h + ")";
    }
}
