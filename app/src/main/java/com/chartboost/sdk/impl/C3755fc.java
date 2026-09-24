package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.fc */
/* JADX INFO: loaded from: classes3.dex */
public final class C3755fc {

    /* JADX INFO: renamed from: a */
    public final String f14208a;

    /* JADX INFO: renamed from: b */
    public final String f14209b;

    /* JADX INFO: renamed from: c */
    public final String f14210c;

    /* JADX INFO: renamed from: d */
    public final String f14211d;

    public C3755fc(String mediationName, String libraryVersion, String adapterVersion, String mediationType) {
        Intrinsics.checkNotNullParameter(mediationName, "mediationName");
        Intrinsics.checkNotNullParameter(libraryVersion, "libraryVersion");
        Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
        Intrinsics.checkNotNullParameter(mediationType, "mediationType");
        this.f14208a = mediationName;
        this.f14209b = libraryVersion;
        this.f14210c = adapterVersion;
        this.f14211d = mediationType;
    }

    /* JADX INFO: renamed from: a */
    public final String m17689a() {
        return this.f14210c;
    }

    /* JADX INFO: renamed from: b */
    public final String m17690b() {
        return this.f14209b;
    }

    /* JADX INFO: renamed from: c */
    public final String m17691c() {
        return this.f14208a;
    }

    /* JADX INFO: renamed from: d */
    public final String m17692d() {
        return this.f14211d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3755fc)) {
            return false;
        }
        C3755fc c3755fc = (C3755fc) obj;
        return Intrinsics.areEqual(this.f14208a, c3755fc.f14208a) && Intrinsics.areEqual(this.f14209b, c3755fc.f14209b) && Intrinsics.areEqual(this.f14210c, c3755fc.f14210c) && Intrinsics.areEqual(this.f14211d, c3755fc.f14211d);
    }

    public int hashCode() {
        return (((((this.f14208a.hashCode() * 31) + this.f14209b.hashCode()) * 31) + this.f14210c.hashCode()) * 31) + this.f14211d.hashCode();
    }

    public String toString() {
        return "MediationBodyFields(mediationName=" + this.f14208a + ", libraryVersion=" + this.f14209b + ", adapterVersion=" + this.f14210c + ", mediationType=" + this.f14211d + ")";
    }
}
