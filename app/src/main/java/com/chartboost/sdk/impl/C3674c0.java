package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3674c0 {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f13628a;

    /* JADX INFO: renamed from: b */
    public final int f13629b;

    /* JADX INFO: renamed from: c */
    public final int f13630c;

    public C3674c0(ViewGroup bannerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        this.f13628a = bannerView;
        this.f13629b = i;
        this.f13630c = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m16996a() {
        return this.f13630c;
    }

    /* JADX INFO: renamed from: b */
    public final ViewGroup m16997b() {
        return this.f13628a;
    }

    /* JADX INFO: renamed from: c */
    public final int m16998c() {
        return this.f13629b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3674c0)) {
            return false;
        }
        C3674c0 c3674c0 = (C3674c0) obj;
        return Intrinsics.areEqual(this.f13628a, c3674c0.f13628a) && this.f13629b == c3674c0.f13629b && this.f13630c == c3674c0.f13630c;
    }

    public int hashCode() {
        return (((this.f13628a.hashCode() * 31) + this.f13629b) * 31) + this.f13630c;
    }

    public String toString() {
        return "AdUnitBannerData(bannerView=" + this.f13628a + ", bannerWidth=" + this.f13629b + ", bannerHeight=" + this.f13630c + ")";
    }
}
