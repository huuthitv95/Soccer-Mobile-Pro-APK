package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.N9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11579N9 {

    /* JADX INFO: renamed from: a */
    private final String f25234a;

    /* JADX INFO: renamed from: b */
    private final String f25235b;

    public C11579N9(String advId, String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        this.f25234a = advId;
        this.f25235b = advIdType;
    }

    /* JADX INFO: renamed from: a */
    public final String m26666a() {
        return this.f25234a;
    }

    /* JADX INFO: renamed from: b */
    public final String m26667b() {
        return this.f25235b;
    }

    /* JADX INFO: renamed from: c */
    public final String m26668c() {
        return this.f25234a;
    }

    /* JADX INFO: renamed from: d */
    public final String m26669d() {
        return this.f25235b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11579N9)) {
            return false;
        }
        C11579N9 c11579n9 = (C11579N9) obj;
        return Intrinsics.areEqual(this.f25234a, c11579n9.f25234a) && Intrinsics.areEqual(this.f25235b, c11579n9.f25235b);
    }

    public int hashCode() {
        return (this.f25234a.hashCode() * 31) + this.f25235b.hashCode();
    }

    public String toString() {
        return "IronSourceAdvId(advId=" + this.f25234a + ", advIdType=" + this.f25235b + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C11579N9 m26665a(String advId, String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        return new C11579N9(advId, advIdType);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11579N9 m26664a(C11579N9 c11579n9, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c11579n9.f25234a;
        }
        if ((i & 2) != 0) {
            str2 = c11579n9.f25235b;
        }
        return c11579n9.m26665a(str, str2);
    }
}
