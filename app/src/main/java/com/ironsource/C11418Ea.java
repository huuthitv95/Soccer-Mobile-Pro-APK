package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Ea */
/* JADX INFO: loaded from: classes6.dex */
public final class C11418Ea implements InterfaceC11508Ja {

    /* JADX INFO: renamed from: a */
    private final C12639za f24264a;

    /* JADX INFO: renamed from: b */
    private final C11536L2 f24265b;

    /* JADX INFO: renamed from: c */
    private boolean f24266c;

    public C11418Ea(C12639za strategy, C11536L2 currentAdUnit, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f24264a = strategy;
        this.f24265b = currentAdUnit;
        this.f24266c = z;
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
        this.f24264a.m34289a(adUnitCallback, this.f24265b, (C11536L2) null, new AbstractC12187f3.a(AbstractC12187f3.b.C15536b.f30369a), this.f24266c, (Long) null);
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: b */
    public void mo25480b() {
        this.f24264a.m34291a("Loading an ad while loading");
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo25481b(C12539u0 c12539u0) {
        Intrinsics.checkNotNullParameter(c12539u0, "adUnitCallback");
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: c */
    public void mo25482c() {
        this.f24265b.m33127a(true);
        C12639za c12639za = this.f24264a;
        c12639za.m34283a((InterfaceC11508Ja) new C11382Ca(c12639za));
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: d */
    public void mo25483d() {
        this.f24266c = true;
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: f */
    public void mo25484f() {
        this.f24266c = false;
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: a */
    public void mo25478a(IronSourceError ironSourceError) {
        this.f24264a.m34288a(ironSourceError, this.f24265b, (AbstractC12187f3) new AbstractC12187f3.a(AbstractC12187f3.b.a.f30368a), false, this.f24266c, (Long) null);
    }
}
