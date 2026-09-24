package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Ec */
/* JADX INFO: loaded from: classes6.dex */
public final class C11420Ec implements InterfaceC11402Dc {

    /* JADX INFO: renamed from: a */
    private InterfaceC11410E2 f24276a;

    /* JADX INFO: renamed from: b */
    private WeakReference<InterfaceC11446G2> f24277b = new WeakReference<>(null);

    /* JADX INFO: renamed from: a */
    public final void m25728a(InterfaceC11410E2 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.f24276a = loadListener;
    }

    @Override // com.ironsource.InterfaceC11402Dc
    public void onBannerClick() {
        InterfaceC11446G2 interfaceC11446G2 = this.f24277b.get();
        if (interfaceC11446G2 != null) {
            interfaceC11446G2.onBannerClick();
        }
    }

    @Override // com.ironsource.InterfaceC11402Dc
    public void onBannerInitFailed(String str) {
    }

    @Override // com.ironsource.InterfaceC11402Dc
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.InterfaceC11402Dc
    public void onBannerLoadFail(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        InterfaceC11410E2 interfaceC11410E2 = this.f24276a;
        if (interfaceC11410E2 != null) {
            interfaceC11410E2.onBannerLoadFail(description);
        }
    }

    @Override // com.ironsource.InterfaceC11402Dc
    public void onBannerLoadSuccess(C11471H9 adInstance, C12166e8 adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        InterfaceC11410E2 interfaceC11410E2 = this.f24276a;
        if (interfaceC11410E2 != null) {
            interfaceC11410E2.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.ironsource.InterfaceC11402Dc
    public void onBannerShowSuccess() {
        InterfaceC11446G2 interfaceC11446G2 = this.f24277b.get();
        if (interfaceC11446G2 != null) {
            interfaceC11446G2.onBannerShowSuccess();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m25729a(InterfaceC11446G2 showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.f24277b = new WeakReference<>(showListener);
    }
}
