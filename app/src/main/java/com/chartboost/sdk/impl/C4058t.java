package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C4058t {

    /* JADX INFO: renamed from: a */
    public final Integer f16310a;

    /* JADX INFO: renamed from: b */
    public final Integer f16311b;

    public C4058t(Integer num, Integer num2) {
        this.f16310a = num;
        this.f16311b = num2;
    }

    public /* synthetic */ C4058t(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }

    /* JADX INFO: renamed from: a */
    public final Integer m19447a() {
        return this.f16311b;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m19448b() {
        return this.f16310a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4058t)) {
            return false;
        }
        C4058t c4058t = (C4058t) obj;
        return Intrinsics.areEqual(this.f16310a, c4058t.f16310a) && Intrinsics.areEqual(this.f16311b, c4058t.f16311b);
    }

    public int hashCode() {
        Integer num = this.f16310a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f16311b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "AdLoadConfig(widthDp=" + this.f16310a + ", heightDp=" + this.f16311b + ")";
    }
}
