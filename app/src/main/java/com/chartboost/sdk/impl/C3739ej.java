package com.chartboost.sdk.impl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ej */
/* JADX INFO: loaded from: classes3.dex */
public final class C3739ej {

    /* JADX INFO: renamed from: a */
    public final String f14122a;

    /* JADX INFO: renamed from: b */
    public final List f14123b;

    /* JADX INFO: renamed from: c */
    public final List f14124c;

    /* JADX INFO: renamed from: d */
    public final List f14125d;

    /* JADX INFO: renamed from: e */
    public final Set f14126e;

    public C3739ej(String str, List ads, List aggregatedTrackingEvents, List aggregatedAdVerifications, Set viewabilityVendors) {
        Intrinsics.checkNotNullParameter(ads, "ads");
        Intrinsics.checkNotNullParameter(aggregatedTrackingEvents, "aggregatedTrackingEvents");
        Intrinsics.checkNotNullParameter(aggregatedAdVerifications, "aggregatedAdVerifications");
        Intrinsics.checkNotNullParameter(viewabilityVendors, "viewabilityVendors");
        this.f14122a = str;
        this.f14123b = ads;
        this.f14124c = aggregatedTrackingEvents;
        this.f14125d = aggregatedAdVerifications;
        this.f14126e = viewabilityVendors;
    }

    public /* synthetic */ C3739ej(String str, List list, List list2, List list3, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, list2, list3, (i & 16) != 0 ? C4189yk.f17067e.m20083a(list3) : set);
    }

    /* JADX INFO: renamed from: a */
    public final List m17590a() {
        return this.f14123b;
    }

    /* JADX INFO: renamed from: b */
    public final List m17591b() {
        return this.f14124c;
    }

    /* JADX INFO: renamed from: c */
    public final Set m17592c() {
        return this.f14126e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3739ej)) {
            return false;
        }
        C3739ej c3739ej = (C3739ej) obj;
        return Intrinsics.areEqual(this.f14122a, c3739ej.f14122a) && Intrinsics.areEqual(this.f14123b, c3739ej.f14123b) && Intrinsics.areEqual(this.f14124c, c3739ej.f14124c) && Intrinsics.areEqual(this.f14125d, c3739ej.f14125d) && Intrinsics.areEqual(this.f14126e, c3739ej.f14126e);
    }

    public int hashCode() {
        String str = this.f14122a;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.f14123b.hashCode()) * 31) + this.f14124c.hashCode()) * 31) + this.f14125d.hashCode()) * 31) + this.f14126e.hashCode();
    }

    public String toString() {
        return "Vast(version=" + this.f14122a + ", ads=" + this.f14123b + ", aggregatedTrackingEvents=" + this.f14124c + ", aggregatedAdVerifications=" + this.f14125d + ", viewabilityVendors=" + this.f14126e + ")";
    }
}
