package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6457ZW implements InterfaceC6893gZ {
    public final /* synthetic */ C6898ge A00;
    public final /* synthetic */ C6252WA A01;

    public C6457ZW(C6252WA c6252wa, C6898ge c6898ge) {
        this.A01 = c6252wa;
        this.A00 = c6898ge;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6893gZ
    public final Map<String, String> A7z() {
        return this.A01.A0A(C6136UG.A00().A01(this.A00, true).A06());
    }
}
