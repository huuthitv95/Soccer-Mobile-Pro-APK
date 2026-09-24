package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Oa */
/* JADX INFO: loaded from: classes6.dex */
public final class C11598Oa implements InterfaceC11633Qa {

    /* JADX INFO: renamed from: a */
    private final C11544La f25283a;

    /* JADX INFO: renamed from: b */
    private final C11536L2 f25284b;

    public C11598Oa(C11544La strategy, C11536L2 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f25283a = strategy;
        this.f25284b = adUnit;
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: a */
    public void mo26546a(C12539u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f25283a.m26381a("Ad unit is already loaded");
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: b */
    public void mo26547b() {
        this.f25283a.m26381a("Loading a loaded ad");
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: c */
    public void mo26548c() {
        this.f25284b.m33127a(true);
        this.f25283a.m26376a((C11536L2) null);
        C11544La c11544La = this.f25283a;
        c11544La.m26377a(new C11580Na(c11544La));
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: a */
    public void mo26545a(IronSourceError ironSourceError) {
        this.f25283a.m26381a("Ad unit is already loaded");
    }
}
