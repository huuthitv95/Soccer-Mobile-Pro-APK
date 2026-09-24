package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Na */
/* JADX INFO: loaded from: classes6.dex */
public final class C11580Na implements InterfaceC11633Qa {

    /* JADX INFO: renamed from: a */
    private final C11544La f25236a;

    public C11580Na(C11544La strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f25236a = strategy;
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: a */
    public void mo26546a(C12539u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f25236a.m26381a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: b */
    public void mo26547b() {
        this.f25236a.m26381a("Loading a destroyed ad");
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: c */
    public void mo26548c() {
        this.f25236a.m26381a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.InterfaceC11633Qa
    /* JADX INFO: renamed from: a */
    public void mo26545a(IronSourceError ironSourceError) {
        this.f25236a.m26381a("Received load failed on a destroyed ad");
    }
}
