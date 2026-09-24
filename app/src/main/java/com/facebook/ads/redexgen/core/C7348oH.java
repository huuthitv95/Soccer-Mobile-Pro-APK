package com.facebook.ads.redexgen.core;

import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7348oH implements InterfaceC4897A6 {
    @Override // com.facebook.ads.redexgen.core.InterfaceC4897A6
    public final /* synthetic */ InterfaceC4896A5 AH3(C4892A1 c4892a1, C7472qI c7472qI) {
        return AbstractC4894A3.A00(this, c4892a1, c7472qI);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC4897A6
    public final /* synthetic */ void AH4() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC4897A6
    public final InterfaceC48849s A3C(C4892A1 c4892a1, C7472qI c7472qI) {
        if (c7472qI.A0O == null) {
            return null;
        }
        return new C7346oF(new C48829q(new C4928Ab(1), 6001));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC4897A6
    public final int A7W(C7472qI c7472qI) {
        return c7472qI.A0O != null ? 1 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC4897A6
    public final void AJe(Looper looper, C48098O c48098o) {
    }
}
