package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ac */
/* JADX INFO: loaded from: classes3.dex */
public final class C3640ac {

    /* JADX INFO: renamed from: a */
    public final String f13464a;

    /* JADX INFO: renamed from: b */
    public final Integer f13465b;

    /* JADX INFO: renamed from: c */
    public final Integer f13466c;

    /* JADX INFO: renamed from: d */
    public final Integer f13467d;

    /* JADX INFO: renamed from: e */
    public final String f13468e;

    public C3640ac(String mimeType, Integer num, Integer num2, Integer num3, String url) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f13464a = mimeType;
        this.f13465b = num;
        this.f13466c = num2;
        this.f13467d = num3;
        this.f13468e = url;
    }

    /* JADX INFO: renamed from: a */
    public final Integer m16813a() {
        return this.f13467d;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m16814b() {
        return this.f13466c;
    }

    /* JADX INFO: renamed from: c */
    public final String m16815c() {
        return this.f13464a;
    }

    /* JADX INFO: renamed from: d */
    public final String m16816d() {
        return this.f13468e;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m16817e() {
        return this.f13465b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3640ac)) {
            return false;
        }
        C3640ac c3640ac = (C3640ac) obj;
        return Intrinsics.areEqual(this.f13464a, c3640ac.f13464a) && Intrinsics.areEqual(this.f13465b, c3640ac.f13465b) && Intrinsics.areEqual(this.f13466c, c3640ac.f13466c) && Intrinsics.areEqual(this.f13467d, c3640ac.f13467d) && Intrinsics.areEqual(this.f13468e, c3640ac.f13468e);
    }

    public int hashCode() {
        int iHashCode = this.f13464a.hashCode() * 31;
        Integer num = this.f13465b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f13466c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f13467d;
        return ((iHashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31) + this.f13468e.hashCode();
    }

    public String toString() {
        return "MediaFile(mimeType=" + this.f13464a + ", width=" + this.f13465b + ", height=" + this.f13466c + ", bitrate=" + this.f13467d + ", url=" + this.f13468e + ")";
    }
}
