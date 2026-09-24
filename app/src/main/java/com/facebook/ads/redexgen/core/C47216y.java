package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6y */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47216y implements InterfaceC6116Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C47216y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6207VP
    public final void ACm() {
        AbstractC6270WT.A00(new C6111Tq(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6207VP
    public final void ACq() {
        AbstractC6270WT.A00(new C6112Tr(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6207VP
    public final void ADp(C6229Vm c6229Vm) {
        AbstractC6270WT.A00(new C6114Tt(this, c6229Vm));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6207VP
    public final void AEl() {
        AbstractC6270WT.A00(new C6110Tp(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6116Tv
    public final void AEq() {
        AbstractC6270WT.A00(new C6113Ts(this));
    }
}
