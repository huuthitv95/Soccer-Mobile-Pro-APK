package com.chartboost.sdk.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.bf */
/* JADX INFO: loaded from: classes3.dex */
public final class C3666bf {

    /* JADX INFO: renamed from: a */
    public final AbstractC3712df f13573a;

    /* JADX INFO: renamed from: b */
    public final Function0 f13574b;

    public C3666bf(AbstractC3712df target, Function0 onReached) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onReached, "onReached");
        this.f13573a = target;
        this.f13574b = onReached;
    }

    /* JADX INFO: renamed from: a */
    public final Function0 m16937a() {
        return this.f13574b;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC3712df m16938b() {
        return this.f13573a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3666bf)) {
            return false;
        }
        C3666bf c3666bf = (C3666bf) obj;
        return Intrinsics.areEqual(this.f13573a, c3666bf.f13573a) && Intrinsics.areEqual(this.f13574b, c3666bf.f13574b);
    }

    public int hashCode() {
        return (this.f13573a.hashCode() * 31) + this.f13574b.hashCode();
    }

    public String toString() {
        return "ProgressEvent(target=" + this.f13573a + ", onReached=" + this.f13574b + ")";
    }
}
