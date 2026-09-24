package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.yj */
/* JADX INFO: loaded from: classes3.dex */
public final class C4188yj {

    /* JADX INFO: renamed from: a */
    public final String f17065a;

    /* JADX INFO: renamed from: b */
    public final List f17066b;

    public C4188yj(String str, List clickTracking) {
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        this.f17065a = str;
        this.f17066b = clickTracking;
    }

    /* JADX INFO: renamed from: a */
    public final String m20068a() {
        return this.f17065a;
    }

    /* JADX INFO: renamed from: b */
    public final List m20069b() {
        return this.f17066b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4188yj)) {
            return false;
        }
        C4188yj c4188yj = (C4188yj) obj;
        return Intrinsics.areEqual(this.f17065a, c4188yj.f17065a) && Intrinsics.areEqual(this.f17066b, c4188yj.f17066b);
    }

    public int hashCode() {
        String str = this.f17065a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f17066b.hashCode();
    }

    public String toString() {
        return "VideoClicks(clickThrough=" + this.f17065a + ", clickTracking=" + this.f17066b + ")";
    }
}
