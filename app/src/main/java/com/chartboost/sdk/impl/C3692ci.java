package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ci */
/* JADX INFO: loaded from: classes3.dex */
public final class C3692ci {

    /* JADX INFO: renamed from: a */
    public final boolean f13747a;

    /* JADX INFO: renamed from: b */
    public final List f13748b;

    /* JADX INFO: renamed from: c */
    public final String f13749c;

    /* JADX INFO: renamed from: d */
    public final int f13750d;

    /* JADX INFO: renamed from: e */
    public final int f13751e;

    /* JADX INFO: renamed from: f */
    public final boolean f13752f;

    /* JADX INFO: renamed from: g */
    public final int f13753g;

    public C3692ci(boolean z, List blackList, String endpoint, int i, int i2, boolean z2, int i3) {
        Intrinsics.checkNotNullParameter(blackList, "blackList");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.f13747a = z;
        this.f13748b = blackList;
        this.f13749c = endpoint;
        this.f13750d = i;
        this.f13751e = i2;
        this.f13752f = z2;
        this.f13753g = i3;
    }

    public /* synthetic */ C3692ci(boolean z, List list, String str, int i, int i2, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? AbstractC3715di.m17305a() : list, (i4 & 4) != 0 ? "https://ssp-events.chartboost.com/track/sdk" : str, (i4 & 8) != 0 ? 10 : i, (i4 & 16) != 0 ? 60 : i2, (i4 & 32) != 0 ? true : z2, (i4 & 64) != 0 ? 100 : i3);
    }

    /* JADX INFO: renamed from: a */
    public final List m17197a() {
        return this.f13748b;
    }

    /* JADX INFO: renamed from: b */
    public final String m17198b() {
        return this.f13749c;
    }

    /* JADX INFO: renamed from: c */
    public final int m17199c() {
        return this.f13750d;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17200d() {
        return this.f13752f;
    }

    /* JADX INFO: renamed from: e */
    public final int m17201e() {
        return this.f13753g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3692ci)) {
            return false;
        }
        C3692ci c3692ci = (C3692ci) obj;
        return this.f13747a == c3692ci.f13747a && Intrinsics.areEqual(this.f13748b, c3692ci.f13748b) && Intrinsics.areEqual(this.f13749c, c3692ci.f13749c) && this.f13750d == c3692ci.f13750d && this.f13751e == c3692ci.f13751e && this.f13752f == c3692ci.f13752f && this.f13753g == c3692ci.f13753g;
    }

    /* JADX INFO: renamed from: f */
    public final int m17202f() {
        return this.f13751e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m17203g() {
        return this.f13747a;
    }

    public int hashCode() {
        return (((((((((((UByte$$ExternalSyntheticBackport0.m43487m(this.f13747a) * 31) + this.f13748b.hashCode()) * 31) + this.f13749c.hashCode()) * 31) + this.f13750d) * 31) + this.f13751e) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f13752f)) * 31) + this.f13753g;
    }

    public String toString() {
        return "TrackingConfig(isEnabled=" + this.f13747a + ", blackList=" + this.f13748b + ", endpoint=" + this.f13749c + ", eventLimit=" + this.f13750d + ", windowDuration=" + this.f13751e + ", persistenceEnabled=" + this.f13752f + ", persistenceMaxEvents=" + this.f13753g + ")";
    }
}
