package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Ia */
/* JADX INFO: loaded from: classes6.dex */
public final class C11490Ia implements InterfaceC11508Ja {

    /* JADX INFO: renamed from: a */
    private final C12639za f24497a;

    /* JADX INFO: renamed from: b */
    private final C11536L2 f24498b;

    /* JADX INFO: renamed from: c */
    private final C11536L2 f24499c;

    /* JADX INFO: renamed from: d */
    private final long f24500d;

    /* JADX INFO: renamed from: e */
    private final boolean f24501e;

    public C11490Ia(C12639za strategy, C11536L2 currentAdUnit, C11536L2 reloadingAdUnit, long j, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.f24497a = strategy;
        this.f24498b = currentAdUnit;
        this.f24499c = reloadingAdUnit;
        this.f24500d = j;
        this.f24501e = z;
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
        this.f24497a.m34289a(adUnitCallback, this.f24499c, this.f24498b, (AbstractC12187f3) new AbstractC12187f3.c(this.f24497a.m34303p().mo32926a() - this.f24500d, AbstractC12187f3.d.C15537d.f30376a), false, Long.valueOf(this.f24500d));
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: b */
    public void mo25480b() {
        this.f24497a.m34291a("Loading an ad while reloading after timer finished");
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo25481b(C12539u0 c12539u0) {
        Intrinsics.checkNotNullParameter(c12539u0, "adUnitCallback");
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: c */
    public void mo25482c() {
        this.f24498b.m33127a(true);
        this.f24499c.m33127a(true);
        C12639za c12639za = this.f24497a;
        c12639za.m34283a((InterfaceC11508Ja) new C11382Ca(c12639za));
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: d */
    public void mo25483d() {
        C12639za c12639za = this.f24497a;
        c12639za.m34283a((InterfaceC11508Ja) new C11436Fa(c12639za, this.f24498b));
    }

    @Override // com.ironsource.InterfaceC11508Ja
    /* JADX INFO: renamed from: f */
    public void mo25484f() {
    }

    public /* synthetic */ C11490Ia(C12639za c12639za, C11536L2 c11536l2, C11536L2 c11536l3, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12639za, c11536l2, c11536l3, j, (i & 16) != 0 ? true : z);
    }

    @Override // com.ironsource.InterfaceC11552M0
    /* JADX INFO: renamed from: a */
    public void mo25478a(IronSourceError ironSourceError) {
        this.f24497a.m34288a(ironSourceError, this.f24498b, (AbstractC12187f3) new AbstractC12187f3.c(this.f24497a.m34303p().mo32926a() - this.f24500d, AbstractC12187f3.d.c.f30375a), this.f24501e, false, Long.valueOf(this.f24500d));
    }
}
