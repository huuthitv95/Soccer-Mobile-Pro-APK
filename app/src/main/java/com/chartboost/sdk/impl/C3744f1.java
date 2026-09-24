package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.f1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3744f1 {

    /* JADX INFO: renamed from: a */
    public final EnumC3922mi f14131a;

    /* JADX INFO: renamed from: b */
    public final String f14132b;

    public C3744f1(EnumC3922mi advertisingIDState, String str) {
        Intrinsics.checkNotNullParameter(advertisingIDState, "advertisingIDState");
        this.f14131a = advertisingIDState;
        this.f14132b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m17600a() {
        return this.f14132b;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC3922mi m17601b() {
        return this.f14131a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3744f1)) {
            return false;
        }
        C3744f1 c3744f1 = (C3744f1) obj;
        return this.f14131a == c3744f1.f14131a && Intrinsics.areEqual(this.f14132b, c3744f1.f14132b);
    }

    public int hashCode() {
        int iHashCode = this.f14131a.hashCode() * 31;
        String str = this.f14132b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AdvertisingIDHolder(advertisingIDState=" + this.f14131a + ", advertisingID=" + this.f14132b + ")";
    }
}
