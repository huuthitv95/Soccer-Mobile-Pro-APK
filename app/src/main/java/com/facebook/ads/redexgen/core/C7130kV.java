package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kV */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7130kV implements InterfaceC46305V {
    public InterfaceC5656MP A02;
    public long A01 = 5242880;
    public int A00 = 20480;

    public final C7130kV A00(InterfaceC5656MP interfaceC5656MP) {
        this.A02 = interfaceC5656MP;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC46305V
    public final C7129kU A5H() {
        return new C7129kU((InterfaceC5656MP) AbstractC45353y.A01(this.A02), this.A01, this.A00);
    }
}
