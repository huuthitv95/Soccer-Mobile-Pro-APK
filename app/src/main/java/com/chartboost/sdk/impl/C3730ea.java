package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ea */
/* JADX INFO: loaded from: classes3.dex */
public final class C3730ea {

    /* JADX INFO: renamed from: a */
    public int f14061a;

    /* JADX INFO: renamed from: b */
    public int f14062b;

    /* JADX INFO: renamed from: c */
    public int f14063c;

    /* JADX INFO: renamed from: d */
    public int f14064d;

    public C3730ea(int i, int i2, int i3, int i4) {
        this.f14061a = i;
        this.f14062b = i2;
        this.f14063c = i3;
        this.f14064d = i4;
    }

    public /* synthetic */ C3730ea(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 1 : i, (i5 & 2) != 0 ? 1 : i2, (i5 & 4) != 0 ? 1 : i3, (i5 & 8) != 0 ? 1 : i4);
    }

    /* JADX INFO: renamed from: a */
    public final int m17529a() {
        return this.f14063c;
    }

    /* JADX INFO: renamed from: a */
    public final void m17530a(int i) {
        this.f14063c = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m17531b() {
        return this.f14064d;
    }

    /* JADX INFO: renamed from: b */
    public final void m17532b(int i) {
        this.f14064d = i;
    }

    /* JADX INFO: renamed from: c */
    public final int m17533c() {
        return this.f14062b;
    }

    /* JADX INFO: renamed from: c */
    public final void m17534c(int i) {
        this.f14062b = i;
    }

    /* JADX INFO: renamed from: d */
    public final int m17535d() {
        return this.f14061a;
    }

    /* JADX INFO: renamed from: d */
    public final void m17536d(int i) {
        this.f14061a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3730ea)) {
            return false;
        }
        C3730ea c3730ea = (C3730ea) obj;
        return this.f14061a == c3730ea.f14061a && this.f14062b == c3730ea.f14062b && this.f14063c == c3730ea.f14063c && this.f14064d == c3730ea.f14064d;
    }

    public int hashCode() {
        return (((((this.f14061a * 31) + this.f14062b) * 31) + this.f14063c) * 31) + this.f14064d;
    }

    public String toString() {
        return "ImpressionCounter(onVideoCompletedPlayCount=" + this.f14061a + ", onRewardedVideoCompletedPlayCount=" + this.f14062b + ", impressionNotifyDidCompleteAdPlayCount=" + this.f14063c + ", impressionSendVideoCompleteRequestPlayCount=" + this.f14064d + ")";
    }
}
