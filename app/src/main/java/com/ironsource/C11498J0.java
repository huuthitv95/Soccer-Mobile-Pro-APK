package com.ironsource;

import kotlin.UByte$$ExternalSyntheticBackport0;

/* JADX INFO: renamed from: com.ironsource.J0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11498J0 {

    /* JADX INFO: renamed from: a */
    private final long f24698a;

    public C11498J0(long j) {
        this.f24698a = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m26153a() {
        return this.f24698a;
    }

    /* JADX INFO: renamed from: b */
    public final long m26155b() {
        return this.f24698a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11498J0) && this.f24698a == ((C11498J0) obj).f24698a;
    }

    public int hashCode() {
        return UByte$$ExternalSyntheticBackport0.m43485m(this.f24698a);
    }

    public String toString() {
        return "AdUnitInteractionData(impressionTimeout=" + this.f24698a + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C11498J0 m26154a(long j) {
        return new C11498J0(j);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11498J0 m26152a(C11498J0 c11498j0, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c11498j0.f24698a;
        }
        return c11498j0.m26154a(j);
    }
}
