package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Fa */
/* JADX INFO: loaded from: classes6.dex */
public final class C11436Fa implements InterfaceC11508Ja {

    /* JADX INFO: renamed from: a */
    private final C12639za f24314a;

    /* JADX INFO: renamed from: b */
    private final C11536L2 f24315b;

    public C11436Fa(C12639za strategy, C11536L2 currentAdUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f24314a = strategy;
        this.f24315b = currentAdUnit;
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo25477a() {
        InterfaceC11552M0.CC.$default$a(this);
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: a */
    public void mo25479a(C12539u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f24314a.m34291a("Received load success while paused");
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: b */
    public void mo25480b() {
        this.f24314a.m34291a("Loading a loaded ad");
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo25481b(C12539u0 c12539u0) {
        Intrinsics.checkNotNullParameter(c12539u0, "adUnitCallback");
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: c */
    public void mo25482c() {
        this.f24315b.m33127a(true);
        C12639za c12639za = this.f24314a;
        c12639za.m34283a((InterfaceC11508Ja) new C11382Ca(c12639za));
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: d */
    public void mo25483d() {
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: f */
    public void mo25484f() {
        C12639za.m34281a(this.f24314a, this.f24315b, (AbstractC12187f3) new AbstractC12187f3.a(AbstractC12187f3.b.c.f30370a), false, 4, (Object) null);
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: a */
    public void mo25478a(IronSourceError ironSourceError) {
        this.f24314a.m34291a("Received load failed while paused");
    }
}
