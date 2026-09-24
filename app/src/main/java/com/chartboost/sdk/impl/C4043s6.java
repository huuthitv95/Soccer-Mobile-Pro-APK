package com.chartboost.sdk.impl;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.s6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4043s6 {

    /* JADX INFO: renamed from: a */
    public final int f16226a;

    /* JADX INFO: renamed from: b */
    public final int f16227b;

    public C4043s6(int i, int i2) {
        this.f16226a = i;
        this.f16227b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m19387a() {
        return this.f16227b;
    }

    /* JADX INFO: renamed from: b */
    public final int m19388b() {
        return this.f16226a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4043s6)) {
            return false;
        }
        C4043s6 c4043s6 = (C4043s6) obj;
        return this.f16226a == c4043s6.f16226a && this.f16227b == c4043s6.f16227b;
    }

    public int hashCode() {
        return (this.f16226a * 31) + this.f16227b;
    }

    public String toString() {
        return "DisplaySize(width=" + this.f16226a + ", height=" + this.f16227b + ")";
    }
}
