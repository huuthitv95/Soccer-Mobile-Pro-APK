package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.mj */
/* JADX INFO: loaded from: classes3.dex */
public final class C3923mj {

    /* JADX INFO: renamed from: a */
    public final C3808hj f15403a;

    /* JADX INFO: renamed from: b */
    public final int f15404b;

    /* JADX INFO: renamed from: c */
    public final int f15405c;

    /* JADX INFO: renamed from: d */
    public final List f15406d;

    /* JADX INFO: renamed from: e */
    public final List f15407e;

    public C3923mj(C3808hj vastFetcher, int i, int i2, List aggregatedTrackingEvents, List aggregatedAdVerifications) {
        Intrinsics.checkNotNullParameter(vastFetcher, "vastFetcher");
        Intrinsics.checkNotNullParameter(aggregatedTrackingEvents, "aggregatedTrackingEvents");
        Intrinsics.checkNotNullParameter(aggregatedAdVerifications, "aggregatedAdVerifications");
        this.f15403a = vastFetcher;
        this.f15404b = i;
        this.f15405c = i2;
        this.f15406d = aggregatedTrackingEvents;
        this.f15407e = aggregatedAdVerifications;
    }

    public /* synthetic */ C3923mj(C3808hj c3808hj, int i, int i2, List list, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3808hj, i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? new ArrayList() : list, (i3 & 16) != 0 ? new ArrayList() : list2);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C3923mj m18686a(C3923mj c3923mj, C3808hj c3808hj, int i, int i2, List list, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            c3808hj = c3923mj.f15403a;
        }
        if ((i3 & 2) != 0) {
            i = c3923mj.f15404b;
        }
        if ((i3 & 4) != 0) {
            i2 = c3923mj.f15405c;
        }
        if ((i3 & 8) != 0) {
            list = c3923mj.f15406d;
        }
        if ((i3 & 16) != 0) {
            list2 = c3923mj.f15407e;
        }
        List list3 = list2;
        int i4 = i2;
        return c3923mj.m18687a(c3808hj, i, i4, list, list3);
    }

    /* JADX INFO: renamed from: a */
    public final C3923mj m18687a(C3808hj vastFetcher, int i, int i2, List aggregatedTrackingEvents, List aggregatedAdVerifications) {
        Intrinsics.checkNotNullParameter(vastFetcher, "vastFetcher");
        Intrinsics.checkNotNullParameter(aggregatedTrackingEvents, "aggregatedTrackingEvents");
        Intrinsics.checkNotNullParameter(aggregatedAdVerifications, "aggregatedAdVerifications");
        return new C3923mj(vastFetcher, i, i2, aggregatedTrackingEvents, aggregatedAdVerifications);
    }

    /* JADX INFO: renamed from: a */
    public final List m18688a() {
        return this.f15407e;
    }

    /* JADX INFO: renamed from: b */
    public final List m18689b() {
        return this.f15406d;
    }

    /* JADX INFO: renamed from: c */
    public final int m18690c() {
        return this.f15405c;
    }

    /* JADX INFO: renamed from: d */
    public final int m18691d() {
        return this.f15404b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3923mj)) {
            return false;
        }
        C3923mj c3923mj = (C3923mj) obj;
        return Intrinsics.areEqual(this.f15403a, c3923mj.f15403a) && this.f15404b == c3923mj.f15404b && this.f15405c == c3923mj.f15405c && Intrinsics.areEqual(this.f15406d, c3923mj.f15406d) && Intrinsics.areEqual(this.f15407e, c3923mj.f15407e);
    }

    public int hashCode() {
        return (((((((this.f15403a.hashCode() * 31) + this.f15404b) * 31) + this.f15405c) * 31) + this.f15406d.hashCode()) * 31) + this.f15407e.hashCode();
    }

    public String toString() {
        return "VastParsingContext(vastFetcher=" + this.f15403a + ", maxWrapperDepth=" + this.f15404b + ", currentDepth=" + this.f15405c + ", aggregatedTrackingEvents=" + this.f15406d + ", aggregatedAdVerifications=" + this.f15407e + ")";
    }
}
