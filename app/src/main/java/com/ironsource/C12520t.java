package com.ironsource;

import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C12520t {

    /* JADX INFO: renamed from: a */
    private final String f32422a;

    /* JADX INFO: renamed from: b */
    private final EnumC12322m9 f32423b;

    /* JADX INFO: renamed from: c */
    private final boolean f32424c;

    /* JADX INFO: renamed from: d */
    private final String f32425d;

    /* JADX INFO: renamed from: e */
    private final long f32426e;

    public C12520t(String adSourceNameForEvents, EnumC12322m9 instanceType, boolean z, String providerName, long j) {
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.f32422a = adSourceNameForEvents;
        this.f32423b = instanceType;
        this.f32424c = z;
        this.f32425d = providerName;
        this.f32426e = j;
    }

    /* JADX INFO: renamed from: a */
    public final String m33705a() {
        return this.f32422a;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC12322m9 m33706b() {
        return this.f32423b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m33707c() {
        return this.f32424c;
    }

    /* JADX INFO: renamed from: d */
    public final String m33708d() {
        return this.f32425d;
    }

    /* JADX INFO: renamed from: e */
    public final long m33709e() {
        return this.f32426e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12520t)) {
            return false;
        }
        C12520t c12520t = (C12520t) obj;
        return Intrinsics.areEqual(this.f32422a, c12520t.f32422a) && this.f32423b == c12520t.f32423b && this.f32424c == c12520t.f32424c && Intrinsics.areEqual(this.f32425d, c12520t.f32425d) && this.f32426e == c12520t.f32426e;
    }

    /* JADX INFO: renamed from: f */
    public final String m33710f() {
        return this.f32422a;
    }

    /* JADX INFO: renamed from: g */
    public final EnumC12322m9 m33711g() {
        return this.f32423b;
    }

    /* JADX INFO: renamed from: h */
    public final long m33712h() {
        return this.f32426e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((this.f32422a.hashCode() * 31) + this.f32423b.hashCode()) * 31;
        boolean z = this.f32424c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + this.f32425d.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f32426e);
    }

    /* JADX INFO: renamed from: i */
    public final String m33713i() {
        return this.f32425d;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m33714j() {
        return this.f32424c;
    }

    public String toString() {
        return "AdFormatConfig(adSourceNameForEvents=" + this.f32422a + ", instanceType=" + this.f32423b + ", isOneFlow=" + this.f32424c + ", providerName=" + this.f32425d + ", loadTimeoutInMillis=" + this.f32426e + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C12520t m33704a(String adSourceNameForEvents, EnumC12322m9 instanceType, boolean z, String providerName, long j) {
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return new C12520t(adSourceNameForEvents, instanceType, z, providerName, j);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12520t m33703a(C12520t c12520t, String str, EnumC12322m9 enumC12322m9, boolean z, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c12520t.f32422a;
        }
        if ((i & 2) != 0) {
            enumC12322m9 = c12520t.f32423b;
        }
        if ((i & 4) != 0) {
            z = c12520t.f32424c;
        }
        if ((i & 8) != 0) {
            str2 = c12520t.f32425d;
        }
        if ((i & 16) != 0) {
            j = c12520t.f32426e;
        }
        long j2 = j;
        return c12520t.m33704a(str, enumC12322m9, z, str2, j2);
    }
}
