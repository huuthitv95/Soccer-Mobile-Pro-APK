package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bo */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6599bo implements InterfaceC6070TB {
    public final C6067T8 A00;

    public AbstractC6599bo(C6067T8 c6067t8) {
        this.A00 = c6067t8;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6070TB
    public final Map<String, String> A5a() {
        return C6128U8.A01(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6070TB
    public final Map<String, String> A6w() {
        return C6108Tn.A02();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6070TB
    public final String A8L() {
        return C6108Tn.A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6070TB
    public final String A8N() {
        return AbstractC6033SZ.A00().A03();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6070TB
    public final boolean AAU() {
        return C6301X0.A00().A03();
    }
}
