package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.j8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3843j8 {

    /* JADX INFO: renamed from: a */
    public final String f14883a;

    /* JADX INFO: renamed from: b */
    public final String f14884b;

    /* JADX INFO: renamed from: c */
    public final List f14885c;

    public C3843j8(String str, String str2, List children) {
        Intrinsics.checkNotNullParameter(children, "children");
        this.f14883a = str;
        this.f14884b = str2;
        this.f14885c = children;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3843j8)) {
            return false;
        }
        C3843j8 c3843j8 = (C3843j8) obj;
        return Intrinsics.areEqual(this.f14883a, c3843j8.f14883a) && Intrinsics.areEqual(this.f14884b, c3843j8.f14884b) && Intrinsics.areEqual(this.f14885c, c3843j8.f14885c);
    }

    public int hashCode() {
        String str = this.f14883a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14884b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f14885c.hashCode();
    }

    public String toString() {
        return "Extension(type=" + this.f14883a + ", content=" + this.f14884b + ", children=" + this.f14885c + ")";
    }
}
