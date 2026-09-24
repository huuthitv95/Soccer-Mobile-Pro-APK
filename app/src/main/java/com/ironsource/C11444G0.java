package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.G0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11444G0 {

    /* JADX INFO: renamed from: a */
    private final EnumC12101af f24325a;

    /* JADX INFO: renamed from: b */
    private final String f24326b;

    /* JADX INFO: renamed from: c */
    private final String f24327c;

    /* JADX INFO: renamed from: d */
    private final EnumC11630Q7 f24328d;

    /* JADX INFO: renamed from: e */
    private final String f24329e;

    public C11444G0(EnumC12101af recordType, String advertiserBundleId, String networkInstanceId, EnumC11630Q7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f24325a = recordType;
        this.f24326b = advertiserBundleId;
        this.f24327c = networkInstanceId;
        this.f24328d = adProvider;
        this.f24329e = adInstanceId;
    }

    /* JADX INFO: renamed from: a */
    public final String m25810a() {
        return this.f24329e;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC11630Q7 m25811b() {
        return this.f24328d;
    }

    /* JADX INFO: renamed from: c */
    public final String m25812c() {
        return this.f24326b;
    }

    /* JADX INFO: renamed from: d */
    public final String m25813d() {
        return this.f24327c;
    }

    /* JADX INFO: renamed from: e */
    public final EnumC12101af m25814e() {
        return this.f24325a;
    }

    /* JADX INFO: renamed from: a */
    public final C12325mc m25809a(InterfaceC11437Fb<C11444G0, C12325mc> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.mo25577a(this);
    }
}
