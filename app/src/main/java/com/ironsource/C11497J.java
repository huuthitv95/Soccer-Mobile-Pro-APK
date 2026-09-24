package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.J */
/* JADX INFO: loaded from: classes6.dex */
public final class C11497J {

    /* JADX INFO: renamed from: a */
    private C12450r0.a f24697a;

    public C11497J(C12450r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f24697a = performance;
    }

    /* JADX INFO: renamed from: a */
    public final C12450r0.a m26149a() {
        return this.f24697a;
    }

    /* JADX INFO: renamed from: b */
    public final C12450r0.a m26150b() {
        return this.f24697a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11497J) && this.f24697a == ((C11497J) obj).f24697a;
    }

    public int hashCode() {
        return this.f24697a.hashCode();
    }

    public String toString() {
        return "AdInstancePerformance(performance=" + this.f24697a + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C11497J m26148a(C12450r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        return new C11497J(performance);
    }

    /* JADX INFO: renamed from: b */
    public final void m26151b(C12450r0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f24697a = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11497J m26147a(C11497J c11497j, C12450r0.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = c11497j.f24697a;
        }
        return c11497j.m26148a(aVar);
    }
}
