package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.s0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4037s0 {

    /* JADX INFO: renamed from: a */
    public final String f16213a;

    /* JADX INFO: renamed from: b */
    public final C3846jb f16214b;

    /* JADX INFO: renamed from: c */
    public final List f16215c;

    /* JADX INFO: renamed from: d */
    public final String f16216d;

    public C4037s0(String str, C3846jb c3846jb, List trackingEvents, String str2) {
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        this.f16213a = str;
        this.f16214b = c3846jb;
        this.f16215c = trackingEvents;
        this.f16216d = str2;
    }

    /* JADX INFO: renamed from: a */
    public final C3846jb m19368a() {
        return this.f16214b;
    }

    /* JADX INFO: renamed from: b */
    public final String m19369b() {
        return this.f16213a;
    }

    /* JADX INFO: renamed from: c */
    public final String m19370c() {
        return this.f16216d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4037s0)) {
            return false;
        }
        C4037s0 c4037s0 = (C4037s0) obj;
        return Intrinsics.areEqual(this.f16213a, c4037s0.f16213a) && Intrinsics.areEqual(this.f16214b, c4037s0.f16214b) && Intrinsics.areEqual(this.f16215c, c4037s0.f16215c) && Intrinsics.areEqual(this.f16216d, c4037s0.f16216d);
    }

    public int hashCode() {
        String str = this.f16213a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C3846jb c3846jb = this.f16214b;
        int iHashCode2 = (((iHashCode + (c3846jb == null ? 0 : c3846jb.hashCode())) * 31) + this.f16215c.hashCode()) * 31;
        String str2 = this.f16216d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AdVerification(vendor=" + this.f16213a + ", javaScriptResource=" + this.f16214b + ", trackingEvents=" + this.f16215c + ", verificationParameters=" + this.f16216d + ")";
    }
}
