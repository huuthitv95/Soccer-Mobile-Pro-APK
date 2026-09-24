package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7275n5 implements InterfaceC4952Az {
    public final /* synthetic */ C435610 A00;

    public C7275n5(C435610 c435610, InterfaceC4953B0 interfaceC4953B0) {
        this.A00 = c435610;
        interfaceC4953B0.AJa(this, new Handler());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC4952Az
    public final void ADz(InterfaceC4953B0 interfaceC4953B0, long j, long j2) {
        if (this != this.A00.A00) {
            return;
        }
        this.A00.A27();
    }
}
