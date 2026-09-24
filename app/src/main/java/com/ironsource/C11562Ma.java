package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Ma */
/* JADX INFO: loaded from: classes6.dex */
public final class C11562Ma implements InterfaceC11633Qa {

    /* JADX INFO: renamed from: a */
    private final C11544La f25163a;

    public C11562Ma(C11544La strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f25163a = strategy;
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: a */
    public void mo26546a(C12539u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f25163a.m26381a("Received load success before load called");
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: b */
    public void mo26547b() {
        C11536L2 c11536l2Mo26600a = this.f25163a.m26390i().mo26600a(true);
        this.f25163a.m26376a(c11536l2Mo26600a);
        C11544La c11544La = this.f25163a;
        c11544La.m26377a(new C11616Pa(c11544La, c11536l2Mo26600a));
        c11536l2Mo26600a.m33125a(this.f25163a.m26388g());
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: c */
    public void mo26548c() {
        C11536L2 c11536l2M26392k = this.f25163a.m26392k();
        if (c11536l2M26392k != null) {
            c11536l2M26392k.m33127a(false);
        }
        this.f25163a.m26376a((C11536L2) null);
        C11544La c11544La = this.f25163a;
        c11544La.m26377a(new C11580Na(c11544La));
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: a */
    public void mo26545a(IronSourceError ironSourceError) {
        this.f25163a.m26381a("Received load failed before load called");
    }
}
