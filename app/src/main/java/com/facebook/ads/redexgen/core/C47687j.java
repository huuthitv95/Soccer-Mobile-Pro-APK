package com.facebook.ads.redexgen.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7j */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47687j extends AbstractC7040j0 {
    public C47687j(C6902gi c6902gi, C5761O7 c5761o7) {
        super(c6902gi, c5761o7);
    }

    private C7038iy A00(Runnable runnable) {
        return new C7038iy(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7040j0
    public final AbstractC5718NQ A0I() {
        C7099jz successfullyLoadedAdapter = (C7099jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7040j0
    public final void A0P() {
        C7099jz interstitialAdapter = (C7099jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7040j0
    public final void A0R(InterfaceC5693N1 interfaceC5693N1, C6117Tw c6117Tw, C6115Tu c6115Tu, C5762O8 c5762o8) {
        C7099jz c7099jz = (C7099jz) interfaceC5693N1;
        C7039iz c7039iz = new C7039iz(this, c5762o8, c7099jz);
        A0H().postDelayed(c7039iz, c6117Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c7099jz.A0A(this.A0B, A00(c7039iz), c5762o8, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
