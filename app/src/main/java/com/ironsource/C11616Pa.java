package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Pa */
/* JADX INFO: loaded from: classes6.dex */
public final class C11616Pa implements InterfaceC11633Qa {

    /* JADX INFO: renamed from: a */
    private final C11544La f25530a;

    /* JADX INFO: renamed from: b */
    private final C11536L2 f25531b;

    public C11616Pa(C11544La strategy, C11536L2 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f25530a = strategy;
        this.f25531b = adUnit;
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: a */
    public void mo26546a(C12539u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f25530a.m26379a(adUnitCallback, this.f25531b);
        C11544La c11544La = this.f25530a;
        c11544La.m26377a(new C11598Oa(c11544La, this.f25531b));
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: b */
    public void mo26547b() {
        this.f25530a.m26381a("Loading an ad while loading");
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: c */
    public void mo26548c() {
        this.f25531b.m33127a(true);
        this.f25530a.m26376a((C11536L2) null);
        C11544La c11544La = this.f25530a;
        c11544La.m26377a(new C11580Na(c11544La));
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: a */
    public void mo26545a(IronSourceError ironSourceError) {
        this.f25530a.m26378a(ironSourceError);
        this.f25531b.m33127a(false);
        this.f25530a.m26376a((C11536L2) null);
        C11544La c11544La = this.f25530a;
        c11544La.m26377a(new C11580Na(c11544La));
    }
}
