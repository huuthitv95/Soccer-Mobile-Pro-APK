package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Ba */
/* JADX INFO: loaded from: classes6.dex */
public final class C11364Ba implements InterfaceC11508Ja {

    /* JADX INFO: renamed from: a */
    private final C12639za f23949a;

    /* JADX INFO: renamed from: b */
    private boolean f23950b;

    public C11364Ba(C12639za strategy, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f23949a = strategy;
        this.f23950b = z;
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
        this.f23949a.m34291a("Received load success before load");
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: b */
    public void mo25480b() {
        C11536L2 c11536l2Mo26600a = this.f23949a.m34297j().mo26600a(true);
        this.f23949a.m34283a((InterfaceC11508Ja) new C11418Ea(this.f23949a, c11536l2Mo26600a, this.f23950b));
        c11536l2Mo26600a.m33125a(this.f23949a.m34294g());
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo25481b(C12539u0 c12539u0) {
        Intrinsics.checkNotNullParameter(c12539u0, "adUnitCallback");
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: c */
    public void mo25482c() {
        C12639za c12639za = this.f23949a;
        c12639za.m34283a((InterfaceC11508Ja) new C11382Ca(c12639za));
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: d */
    public void mo25483d() {
        this.f23950b = true;
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: f */
    public void mo25484f() {
        this.f23950b = false;
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: a */
    public void mo25478a(IronSourceError ironSourceError) {
        this.f23949a.m34291a("Received load failed before load");
    }

    public /* synthetic */ C11364Ba(C12639za c12639za, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12639za, (i & 2) != 0 ? false : z);
    }
}
