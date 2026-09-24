package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.y4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4173y4 {

    /* JADX INFO: renamed from: a */
    public final String f17008a;

    /* JADX INFO: renamed from: b */
    public final String f17009b;

    /* JADX INFO: renamed from: c */
    public final String f17010c;

    /* JADX INFO: renamed from: d */
    public final int f17011d;

    /* JADX INFO: renamed from: e */
    public final String f17012e;

    /* JADX INFO: renamed from: f */
    public final Float f17013f;

    /* JADX INFO: renamed from: g */
    public final Float f17014g;

    public C4173y4(String location, String adId, String cgn, int i, String rewardCurrency, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(cgn, "cgn");
        Intrinsics.checkNotNullParameter(rewardCurrency, "rewardCurrency");
        this.f17008a = location;
        this.f17009b = adId;
        this.f17010c = cgn;
        this.f17011d = i;
        this.f17012e = rewardCurrency;
        this.f17013f = f;
        this.f17014g = f2;
    }

    /* JADX INFO: renamed from: a */
    public final String m20021a() {
        return this.f17009b;
    }

    /* JADX INFO: renamed from: b */
    public final String m20022b() {
        return this.f17010c;
    }

    /* JADX INFO: renamed from: c */
    public final String m20023c() {
        return this.f17008a;
    }

    /* JADX INFO: renamed from: d */
    public final int m20024d() {
        return this.f17011d;
    }

    /* JADX INFO: renamed from: e */
    public final String m20025e() {
        return this.f17012e;
    }

    /* JADX INFO: renamed from: f */
    public final Float m20026f() {
        return this.f17014g;
    }

    /* JADX INFO: renamed from: g */
    public final Float m20027g() {
        return this.f17013f;
    }
}
