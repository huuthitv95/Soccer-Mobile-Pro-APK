package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.wg */
/* JADX INFO: loaded from: classes3.dex */
public final class C4141wg {

    /* JADX INFO: renamed from: a */
    public final String f16747a;

    /* JADX INFO: renamed from: b */
    public final String f16748b;

    /* JADX INFO: renamed from: c */
    public final int f16749c;

    /* JADX INFO: renamed from: d */
    public final String f16750d;

    /* JADX INFO: renamed from: e */
    public final Mediation f16751e;

    public C4141wg(String str, String location, int i, String adTypeName, Mediation mediation) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        this.f16747a = str;
        this.f16748b = location;
        this.f16749c = i;
        this.f16750d = adTypeName;
        this.f16751e = mediation;
    }

    /* JADX INFO: renamed from: a */
    public final String m19804a() {
        return this.f16747a;
    }

    /* JADX INFO: renamed from: b */
    public final String m19805b() {
        return this.f16750d;
    }

    /* JADX INFO: renamed from: c */
    public final String m19806c() {
        return this.f16748b;
    }

    /* JADX INFO: renamed from: d */
    public final Mediation m19807d() {
        return this.f16751e;
    }

    /* JADX INFO: renamed from: e */
    public final int m19808e() {
        return this.f16749c;
    }
}
