package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.mc */
/* JADX INFO: loaded from: classes6.dex */
public final class C12325mc {

    /* JADX INFO: renamed from: a */
    private final EnumC12101af f30970a;

    /* JADX INFO: renamed from: b */
    private final String f30971b;

    /* JADX INFO: renamed from: c */
    private final EnumC11630Q7 f30972c;

    /* JADX INFO: renamed from: d */
    private final String f30973d;

    public C12325mc(EnumC12101af recordType, String advertiserBundleId, EnumC11630Q7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f30970a = recordType;
        this.f30971b = advertiserBundleId;
        this.f30972c = adProvider;
        this.f30973d = adInstanceId;
    }

    /* JADX INFO: renamed from: a */
    public final String m32226a() {
        return this.f30973d;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC11630Q7 m32227b() {
        return this.f30972c;
    }

    /* JADX INFO: renamed from: c */
    public final String m32228c() {
        return this.f30971b;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC12101af m32229d() {
        return this.f30970a;
    }

    /* JADX INFO: renamed from: a */
    public final C12239i1 m32225a(InterfaceC11437Fb<C12325mc, C12239i1> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.mo25577a(this);
    }
}
