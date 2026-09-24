package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ja */
/* JADX INFO: loaded from: classes3.dex */
public final class C3845ja {

    /* JADX INFO: renamed from: a */
    public final C4149x2 f14902a;

    /* JADX INFO: renamed from: b */
    public final CBError.Impression f14903b;

    public C3845ja(C4149x2 c4149x2, CBError.Impression impression) {
        this.f14902a = c4149x2;
        this.f14903b = impression;
    }

    /* JADX INFO: renamed from: a */
    public final CBError.Impression m18201a() {
        return this.f14903b;
    }

    /* JADX INFO: renamed from: b */
    public final C4149x2 m18202b() {
        return this.f14902a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3845ja)) {
            return false;
        }
        C3845ja c3845ja = (C3845ja) obj;
        return Intrinsics.areEqual(this.f14902a, c3845ja.f14902a) && this.f14903b == c3845ja.f14903b;
    }

    public int hashCode() {
        C4149x2 c4149x2 = this.f14902a;
        int iHashCode = (c4149x2 == null ? 0 : c4149x2.hashCode()) * 31;
        CBError.Impression impression = this.f14903b;
        return iHashCode + (impression != null ? impression.hashCode() : 0);
    }

    public String toString() {
        return "ImpressionHolder(impression=" + this.f14902a + ", error=" + this.f14903b + ")";
    }
}
