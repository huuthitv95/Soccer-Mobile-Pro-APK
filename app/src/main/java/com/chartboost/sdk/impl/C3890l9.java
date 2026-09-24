package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.l9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3890l9 {

    /* JADX INFO: renamed from: a */
    public final String f15197a;

    /* JADX INFO: renamed from: b */
    public final List f15198b;

    /* JADX INFO: renamed from: c */
    public final List f15199c;

    public C3890l9(String str, List iconClickTracking, List iconClickFallbackImages) {
        Intrinsics.checkNotNullParameter(iconClickTracking, "iconClickTracking");
        Intrinsics.checkNotNullParameter(iconClickFallbackImages, "iconClickFallbackImages");
        this.f15197a = str;
        this.f15198b = iconClickTracking;
        this.f15199c = iconClickFallbackImages;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3890l9)) {
            return false;
        }
        C3890l9 c3890l9 = (C3890l9) obj;
        return Intrinsics.areEqual(this.f15197a, c3890l9.f15197a) && Intrinsics.areEqual(this.f15198b, c3890l9.f15198b) && Intrinsics.areEqual(this.f15199c, c3890l9.f15199c);
    }

    public int hashCode() {
        String str = this.f15197a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f15198b.hashCode()) * 31) + this.f15199c.hashCode();
    }

    public String toString() {
        return "IconClicks(iconClickThrough=" + this.f15197a + ", iconClickTracking=" + this.f15198b + ", iconClickFallbackImages=" + this.f15199c + ")";
    }
}
