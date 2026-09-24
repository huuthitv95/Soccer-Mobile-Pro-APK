package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC7477qP implements InterfaceC45133b {
    public final C7437pj A00 = new C7437pj();

    @MetaExoPlayerCustomization("Should be final")
    public abstract void A0H(int i, long j);

    public final int A00() {
        long jA77 = A77();
        long jA7s = A7s();
        if (jA77 == -9223372036854775807L || jA7s == -9223372036854775807L) {
            return 0;
        }
        if (jA7s == 0) {
            return 100;
        }
        return AbstractC46115C.A07((int) ((100 * jA77) / jA7s), 0, 100);
    }

    public void A01() {
        AKG(false);
    }

    public final void A02() {
        A03(A7h());
    }

    public final void A03(int i) {
        A0H(i, -9223372036854775807L);
    }

    public final void A04(long j) {
        A0H(A7h(), j);
    }
}
