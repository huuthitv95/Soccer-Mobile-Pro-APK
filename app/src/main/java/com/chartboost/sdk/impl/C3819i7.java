package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.i7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3819i7 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3806hh f14564a;

    /* JADX INFO: renamed from: b */
    public final List f14565b;

    public C3819i7(InterfaceC3806hh eventData, List pendingTrackers) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(pendingTrackers, "pendingTrackers");
        this.f14564a = eventData;
        this.f14565b = pendingTrackers;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3806hh m17964a() {
        return this.f14564a;
    }

    /* JADX INFO: renamed from: b */
    public final List m17965b() {
        return this.f14565b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3819i7)) {
            return false;
        }
        C3819i7 c3819i7 = (C3819i7) obj;
        return Intrinsics.areEqual(this.f14564a, c3819i7.f14564a) && Intrinsics.areEqual(this.f14565b, c3819i7.f14565b);
    }

    public int hashCode() {
        return (this.f14564a.hashCode() * 31) + this.f14565b.hashCode();
    }

    public String toString() {
        return "EventProcessingRequest(eventData=" + this.f14564a + ", pendingTrackers=" + this.f14565b + ")";
    }
}
