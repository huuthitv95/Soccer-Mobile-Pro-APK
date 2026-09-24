package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7197lc implements InterfaceC5490Jj {
    public final C5529KM A00;
    public final Map<String, C5536KT> A01;
    public final Map<String, String> A02;
    public final Map<String, C5530KN> A03;
    public final long[] A04;

    public C7197lc(C5529KM c5529km, Map<String, C5536KT> map, Map<String, C5530KN> map2, Map<String, String> imageMap) {
        this.A00 = c5529km;
        this.A03 = map2;
        this.A02 = imageMap;
        this.A01 = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.A04 = c5529km.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final List<C7422pT> A7X(long j) {
        return this.A00.A0E(j, this.A01, this.A03, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final long A83(int i) {
        return this.A04[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final int A84() {
        return this.A04.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final int A8a(long j) {
        int iA0K = AbstractC46115C.A0K(this.A04, j, false, false);
        int index = this.A04.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
