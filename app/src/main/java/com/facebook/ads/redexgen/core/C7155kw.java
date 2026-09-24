package com.facebook.ads.redexgen.core;

import java.io.File;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7155kw implements InterfaceC5599LU<File> {
    @Override // com.facebook.ads.redexgen.core.InterfaceC5599LU
    public final C5598LT<File> A3x(File file, InterfaceC5617Lm interfaceC5617Lm) {
        if (file.exists()) {
            return new C5598LT<>(true, file);
        }
        return new C5598LT<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5599LU
    public final void A5D(File file, InterfaceC5617Lm interfaceC5617Lm) {
    }
}
