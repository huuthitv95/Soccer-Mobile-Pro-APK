package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.k9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3867k9 {

    /* JADX INFO: renamed from: a */
    public final Integer f15055a;

    /* JADX INFO: renamed from: b */
    public final Integer f15056b;

    /* JADX INFO: renamed from: c */
    public final String f15057c;

    /* JADX INFO: renamed from: d */
    public final C3691ch f15058d;

    public C3867k9(Integer num, Integer num2, String str, C3691ch c3691ch) {
        this.f15055a = num;
        this.f15056b = num2;
        this.f15057c = str;
        this.f15058d = c3691ch;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3867k9)) {
            return false;
        }
        C3867k9 c3867k9 = (C3867k9) obj;
        return Intrinsics.areEqual(this.f15055a, c3867k9.f15055a) && Intrinsics.areEqual(this.f15056b, c3867k9.f15056b) && Intrinsics.areEqual(this.f15057c, c3867k9.f15057c) && Intrinsics.areEqual(this.f15058d, c3867k9.f15058d);
    }

    public int hashCode() {
        Integer num = this.f15055a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f15056b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f15057c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C3691ch c3691ch = this.f15058d;
        return iHashCode3 + (c3691ch != null ? c3691ch.hashCode() : 0);
    }

    public String toString() {
        return "IconClickFallbackImage(width=" + this.f15055a + ", height=" + this.f15056b + ", altText=" + this.f15057c + ", staticResource=" + this.f15058d + ")";
    }
}
