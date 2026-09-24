package com.facebook.ads.redexgen.core;

import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7279n9 implements InterfaceC5214FF {
    public final int A00;

    public C7279n9() {
        this(-1);
    }

    public C7279n9(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5214FF
    public final int A8Z(int i) {
        if (this.A00 == -1) {
            if (i == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5214FF
    public final long A8u(C5213FE c5213fe) {
        IOException iOException = c5213fe.A03;
        if ((iOException instanceof C44963K) || (iOException instanceof FileNotFoundException) || (iOException instanceof C4913AM) || (iOException instanceof C5224FP) || C46365b.A00(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((c5213fe.A00 - 1) * 1000, 5000);
    }
}
