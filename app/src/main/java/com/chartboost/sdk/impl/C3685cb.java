package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.cb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3685cb {

    /* JADX INFO: renamed from: a */
    public int f13693a;

    /* JADX INFO: renamed from: b */
    public int f13694b;

    /* JADX INFO: renamed from: c */
    public int f13695c;

    /* JADX INFO: renamed from: d */
    public int f13696d;

    public C3685cb(int i, int i2, int i3, int i4) {
        this.f13693a = i;
        this.f13694b = i2;
        this.f13695c = i3;
        this.f13696d = i4;
    }

    public /* synthetic */ C3685cb(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    /* JADX INFO: renamed from: a */
    public final int m17062a() {
        return this.f13696d;
    }

    /* JADX INFO: renamed from: a */
    public final void m17063a(int i) {
        this.f13696d = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m17064b() {
        return this.f13695c;
    }

    /* JADX INFO: renamed from: b */
    public final void m17065b(int i) {
        this.f13695c = i;
    }

    /* JADX INFO: renamed from: c */
    public final int m17066c() {
        return this.f13693a;
    }

    /* JADX INFO: renamed from: c */
    public final void m17067c(int i) {
        this.f13693a = i;
    }

    /* JADX INFO: renamed from: d */
    public final int m17068d() {
        return this.f13694b;
    }

    /* JADX INFO: renamed from: d */
    public final void m17069d(int i) {
        this.f13694b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3685cb)) {
            return false;
        }
        C3685cb c3685cb = (C3685cb) obj;
        return this.f13693a == c3685cb.f13693a && this.f13694b == c3685cb.f13694b && this.f13695c == c3685cb.f13695c && this.f13696d == c3685cb.f13696d;
    }

    public int hashCode() {
        return (((((this.f13693a * 31) + this.f13694b) * 31) + this.f13695c) * 31) + this.f13696d;
    }

    public String toString() {
        return "IntRectangle(x=" + this.f13693a + ", y=" + this.f13694b + ", width=" + this.f13695c + ", height=" + this.f13696d + ")";
    }
}
