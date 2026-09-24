package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C12574w {

    /* JADX INFO: renamed from: a */
    private final EnumC12101af f32628a;

    /* JADX INFO: renamed from: b */
    private final String f32629b;

    /* JADX INFO: renamed from: c */
    private final String f32630c;

    /* JADX INFO: renamed from: d */
    private final String f32631d;

    /* JADX INFO: renamed from: e */
    private final EnumC11630Q7 f32632e;

    /* JADX INFO: renamed from: f */
    private final String f32633f;

    public C12574w(EnumC12101af recordType, String advertiserBundleId, String networkInstanceId, String adUnitId, EnumC11630Q7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f32628a = recordType;
        this.f32629b = advertiserBundleId;
        this.f32630c = networkInstanceId;
        this.f32631d = adUnitId;
        this.f32632e = adProvider;
        this.f32633f = adInstanceId;
    }

    /* JADX INFO: renamed from: a */
    public final String m33982a() {
        return this.f32633f;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC11630Q7 m33983b() {
        return this.f32632e;
    }

    /* JADX INFO: renamed from: c */
    public final String m33984c() {
        return this.f32631d;
    }

    /* JADX INFO: renamed from: d */
    public final String m33985d() {
        return this.f32629b;
    }

    /* JADX INFO: renamed from: e */
    public final String m33986e() {
        return this.f32630c;
    }

    /* JADX INFO: renamed from: f */
    public final EnumC12101af m33987f() {
        return this.f32628a;
    }

    /* JADX INFO: renamed from: a */
    public final C11444G0 m33981a(InterfaceC11437Fb<C12574w, C11444G0> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.mo25577a(this);
    }
}
