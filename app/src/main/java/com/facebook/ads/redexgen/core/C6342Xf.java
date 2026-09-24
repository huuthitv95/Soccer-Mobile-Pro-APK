package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xf */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6342Xf implements ViewpointAction<C6178Uw, C6183V1> {
    public C6323XM A00;

    public C6342Xf(C6323XM c6323xm) {
        this.A00 = c6323xm;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6R(C7523rN<C6178Uw, C6183V1> c7523rN, InterfaceC7513rD interfaceC7513rD) {
        switch (interfaceC7513rD.A9U(c7523rN)) {
            case A02:
            case A04:
                this.A00.A02(c7523rN, interfaceC7513rD);
                break;
        }
    }
}
