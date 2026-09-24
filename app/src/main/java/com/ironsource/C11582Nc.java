package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.ironsource.Nc */
/* JADX INFO: loaded from: classes6.dex */
public final class C11582Nc {

    /* JADX INFO: renamed from: a */
    private final boolean f25242a;

    /* JADX INFO: renamed from: b */
    private final int f25243b;

    /* JADX WARN: Multi-variable type inference failed */
    public C11582Nc() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26677a() {
        return this.f25242a;
    }

    /* JADX INFO: renamed from: b */
    public final int m26678b() {
        return this.f25243b;
    }

    /* JADX INFO: renamed from: c */
    public final int m26679c() {
        return this.f25243b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m26680d() {
        return this.f25242a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11582Nc)) {
            return false;
        }
        C11582Nc c11582Nc = (C11582Nc) obj;
        return this.f25242a == c11582Nc.f25242a && this.f25243b == c11582Nc.f25243b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f25242a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.f25243b;
    }

    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.f25242a + ", flags=" + this.f25243b + ")";
    }

    public C11582Nc(boolean z, int i) {
        this.f25242a = z;
        this.f25243b = i;
    }

    /* JADX INFO: renamed from: a */
    public final C11582Nc m26676a(boolean z, int i) {
        return new C11582Nc(z, i);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11582Nc m26675a(C11582Nc c11582Nc, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c11582Nc.f25242a;
        }
        if ((i2 & 2) != 0) {
            i = c11582Nc.f25243b;
        }
        return c11582Nc.m26676a(z, i);
    }

    public /* synthetic */ C11582Nc(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 805306368 : i);
    }
}
