package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Fe */
/* JADX INFO: loaded from: classes6.dex */
public final class C11440Fe {

    /* JADX INFO: renamed from: a */
    private final C11609P3 f24319a;

    /* JADX INFO: renamed from: b */
    private final C12534td f24320b;

    /* JADX INFO: renamed from: c */
    private final Map<String, C12427pd> f24321c;

    public C11440Fe(C11609P3 configurations, C12534td providerOrder, Map<String, C12427pd> providerSettings) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        this.f24319a = configurations;
        this.f24320b = providerOrder;
        this.f24321c = providerSettings;
    }

    /* JADX INFO: renamed from: a */
    public final C11609P3 m25797a() {
        return this.f24319a;
    }

    /* JADX INFO: renamed from: b */
    public final C12534td m25798b() {
        return this.f24320b;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, C12427pd> m25799c() {
        return this.f24321c;
    }

    /* JADX INFO: renamed from: d */
    public final C11609P3 m25800d() {
        return this.f24319a;
    }

    /* JADX INFO: renamed from: e */
    public final C12534td m25801e() {
        return this.f24320b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11440Fe)) {
            return false;
        }
        C11440Fe c11440Fe = (C11440Fe) obj;
        return Intrinsics.areEqual(this.f24319a, c11440Fe.f24319a) && Intrinsics.areEqual(this.f24320b, c11440Fe.f24320b) && Intrinsics.areEqual(this.f24321c, c11440Fe.f24321c);
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, C12427pd> m25802f() {
        return this.f24321c;
    }

    public int hashCode() {
        return (((this.f24319a.hashCode() * 31) + this.f24320b.hashCode()) * 31) + this.f24321c.hashCode();
    }

    public String toString() {
        return "ServerResponse2(configurations=" + this.f24319a + ", providerOrder=" + this.f24320b + ", providerSettings=" + this.f24321c + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C11440Fe m25796a(C11609P3 configurations, C12534td providerOrder, Map<String, C12427pd> providerSettings) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        return new C11440Fe(configurations, providerOrder, providerSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11440Fe m25795a(C11440Fe c11440Fe, C11609P3 c11609p3, C12534td c12534td, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            c11609p3 = c11440Fe.f24319a;
        }
        if ((i & 2) != 0) {
            c12534td = c11440Fe.f24320b;
        }
        if ((i & 4) != 0) {
            map = c11440Fe.f24321c;
        }
        return c11440Fe.m25796a(c11609p3, c12534td, map);
    }
}
