package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.F2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11428F2 implements InterfaceC11515K {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12308lg f24310a;

    public C11428F2(InterfaceC12308lg viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.f24310a = viewBinder;
    }

    @Override // com.ironsource.InterfaceC11515K
    /* JADX INFO: renamed from: a */
    public void mo25763a(C11356B2 bannerAdInstance) {
        Intrinsics.checkNotNullParameter(bannerAdInstance, "bannerAdInstance");
        bannerAdInstance.m25393a(this.f24310a);
    }

    @Override // com.ironsource.InterfaceC11515K
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo25764a(C11650Rb c11650Rb) {
        Intrinsics.checkNotNullParameter(c11650Rb, "nativeAdInstance");
    }

    @Override // com.ironsource.InterfaceC11515K
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo25765a(C12208g6 c12208g6) {
        Intrinsics.checkNotNullParameter(c12208g6, "fullscreenAdInstance");
    }
}
