package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.x4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4151x4 {

    /* JADX INFO: renamed from: a */
    public final String f16813a;

    /* JADX INFO: renamed from: b */
    public final List f16814b;

    public C4151x4(String str, List companionAds) {
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        this.f16813a = str;
        this.f16814b = companionAds;
    }

    /* JADX INFO: renamed from: a */
    public final List m19883a() {
        return this.f16814b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4151x4)) {
            return false;
        }
        C4151x4 c4151x4 = (C4151x4) obj;
        return Intrinsics.areEqual(this.f16813a, c4151x4.f16813a) && Intrinsics.areEqual(this.f16814b, c4151x4.f16814b);
    }

    public int hashCode() {
        String str = this.f16813a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f16814b.hashCode();
    }

    public String toString() {
        return "CompanionAds(required=" + this.f16813a + ", companionAds=" + this.f16814b + ")";
    }
}
