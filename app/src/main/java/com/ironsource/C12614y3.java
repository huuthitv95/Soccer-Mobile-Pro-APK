package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12614y3 {

    /* JADX INFO: renamed from: a */
    private final Boolean f33202a;

    /* JADX INFO: renamed from: b */
    private final String f33203b;

    /* JADX INFO: renamed from: c */
    private final Integer f33204c;

    public C12614y3() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m34205a() {
        return this.f33202a;
    }

    /* JADX INFO: renamed from: b */
    public final String m34206b() {
        return this.f33203b;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m34207c() {
        return this.f33204c;
    }

    /* JADX INFO: renamed from: d */
    public final Boolean m34208d() {
        return this.f33202a;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m34209e() {
        return this.f33204c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12614y3)) {
            return false;
        }
        C12614y3 c12614y3 = (C12614y3) obj;
        return Intrinsics.areEqual(this.f33202a, c12614y3.f33202a) && Intrinsics.areEqual(this.f33203b, c12614y3.f33203b) && Intrinsics.areEqual(this.f33204c, c12614y3.f33204c);
    }

    /* JADX INFO: renamed from: f */
    public final String m34210f() {
        return this.f33203b;
    }

    public int hashCode() {
        Boolean bool = this.f33202a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f33203b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f33204c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "CappingConfig2(enabled=" + this.f33202a + ", unit=" + this.f33203b + ", maxImpressions=" + this.f33204c + ")";
    }

    public C12614y3(Boolean bool, String str, Integer num) {
        this.f33202a = bool;
        this.f33203b = str;
        this.f33204c = num;
    }

    /* JADX INFO: renamed from: a */
    public final C12614y3 m34204a(Boolean bool, String str, Integer num) {
        return new C12614y3(bool, str, num);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12614y3 m34203a(C12614y3 c12614y3, Boolean bool, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = c12614y3.f33202a;
        }
        if ((i & 2) != 0) {
            str = c12614y3.f33203b;
        }
        if ((i & 4) != 0) {
            num = c12614y3.f33204c;
        }
        return c12614y3.m34204a(bool, str, num);
    }

    public /* synthetic */ C12614y3(Boolean bool, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
