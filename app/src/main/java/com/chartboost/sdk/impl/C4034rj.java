package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.rj */
/* JADX INFO: loaded from: classes3.dex */
public final class C4034rj {

    /* JADX INFO: renamed from: a */
    public final String f16200a;

    /* JADX INFO: renamed from: b */
    public final String f16201b;

    /* JADX INFO: renamed from: c */
    public final String f16202c;

    public C4034rj(String url, String vendor, String params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f16200a = url;
        this.f16201b = vendor;
        this.f16202c = params;
    }

    /* JADX INFO: renamed from: a */
    public final String m19361a() {
        return this.f16202c;
    }

    /* JADX INFO: renamed from: b */
    public final String m19362b() {
        return this.f16200a;
    }

    /* JADX INFO: renamed from: c */
    public final String m19363c() {
        return this.f16201b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4034rj)) {
            return false;
        }
        C4034rj c4034rj = (C4034rj) obj;
        return Intrinsics.areEqual(this.f16200a, c4034rj.f16200a) && Intrinsics.areEqual(this.f16201b, c4034rj.f16201b) && Intrinsics.areEqual(this.f16202c, c4034rj.f16202c);
    }

    public int hashCode() {
        return (((this.f16200a.hashCode() * 31) + this.f16201b.hashCode()) * 31) + this.f16202c.hashCode();
    }

    public String toString() {
        return "VerificationModel(url=" + this.f16200a + ", vendor=" + this.f16201b + ", params=" + this.f16202c + ")";
    }
}
